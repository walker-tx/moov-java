/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.net.ConnectException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.List;

public class Retries {

    private final Callable<HttpResponse<InputStream>> action;
    private final RetryConfig retryConfig;
    private final List<String> statusCodes;

    private Retries(
            Callable<HttpResponse<InputStream>> action,
            RetryConfig retryConfig,
            List<String> statusCodes) {
        Utils.checkNotNull(action, "action");
        Utils.checkNotNull(retryConfig, "retryConfig");
        Utils.checkNotNull(statusCodes, "statusCodes");
        if(statusCodes.size() == 0) {
            throw new IllegalArgumentException("statusCodes list cannot be empty");
        }
        this.action = action;
        this.retryConfig = retryConfig;
        this.statusCodes = statusCodes;
    }

    @SuppressWarnings("serial")
    public static final class NonRetryableException extends Exception {
        private final Exception exception;

        public NonRetryableException(Exception exception) {
            super(exception);
            this.exception = exception;
        }
        
        public Exception exception() {
            return exception;
        } 
    }

    @SuppressWarnings("serial")
    public static final class RetryableException extends Exception {
        private final HttpResponse<InputStream> response;

        public RetryableException(HttpResponse<InputStream> response) {
            this.response = response;
        }
        
        public HttpResponse<InputStream> response() {
            return response;
        }
    }

    public HttpResponse<InputStream> run() throws Exception {

        switch(retryConfig.strategy()) {
            case BACKOFF:
                if(!retryConfig.backoff().isPresent()){
                    throw new IllegalArgumentException("Backoff strategy is not defined");
                }
                BackoffStrategy backoff = retryConfig.backoff().get();
                return retryWithBackoff(backoff.retryConnectError(), backoff.retryReadTimeoutError());

            case NONE:
                return action.call();

            default:
                throw new IllegalArgumentException("Invalid retry strategy");
        }
    }

    private HttpResponse<InputStream> getResponse(boolean retryConnectError, boolean retryReadTimeoutError) throws Exception {
        try {
            HttpResponse<InputStream> response = action.call();

            for (String statusCode : statusCodes) {
                if (statusCode.toUpperCase().contains("X")){
                    int codeRange = Integer.parseInt(statusCode.substring(0, 1));
                    int statusMajor = response.statusCode() / 100;
                    if (codeRange == statusMajor) {
                        throw new RetryableException(response);
                    }
                } else {
                    int code = Integer.parseInt(statusCode);
                    if (code == response.statusCode()) {
                        throw new RetryableException(response);
                    }
                }
            }

            return response;

        } catch(IOException e) {
            if(e instanceof ConnectException && retryConnectError) {
                throw e;
            }
            String message = e.getMessage();
            if(message != null) {
                if(message.contains("Connect timed out") && retryConnectError) {
                    throw e;
                }

                if(message.contains("Read timed out") && retryReadTimeoutError) {
                throw e;
                }
            }
            throw new NonRetryableException(e);
        } catch(RetryableException e) {
            throw e;
        } catch(Exception e) {
            throw new NonRetryableException(e);
        }
    }

    private HttpResponse<InputStream> retryWithBackoff(boolean retryConnectError, boolean retryReadTimeoutError) throws Exception {
        BackoffStrategy backoff = retryConfig.backoff().get();
        long initialIntervalMs = backoff.initialIntervalMs();
        long startMs = System.currentTimeMillis();
        int numAttempts = 0;

        while(true) {
            try {
                return getResponse(retryConnectError, retryReadTimeoutError);
            } catch(NonRetryableException e) {
                throw e.exception();
            } catch(IOException | RetryableException e) {
                long nowMs = System.currentTimeMillis();
                if (nowMs - startMs > backoff.maxElapsedTimeMs()) {
                    if ( e instanceof RetryableException ) {
                        return ((RetryableException)e).response();
                    }
                    throw e;
                }

                double intervalMs = initialIntervalMs * Math.pow(backoff.baseFactor(), numAttempts);
                double jitterMs = backoff.jitterFactor() * intervalMs;
                intervalMs = intervalMs - jitterMs + Math.random()*(2*jitterMs + 1);

                double maxIntervalMs = backoff.maxIntervalMs();
                if (intervalMs > maxIntervalMs) {
                    intervalMs = maxIntervalMs;
                }

                long sleepMs = (long) intervalMs;
                TimeUnit.MILLISECONDS.sleep(sleepMs);
                numAttempts += 1;
            }
        }
    }

    public final static Builder builder() {
        return new Builder();
    }

    public final static class Builder {

        private Callable<HttpResponse<InputStream>> action;
        private RetryConfig retryConfig;
        private List<String> statusCodes;

        private Builder() {}

        /**
          * Sets the HTTP callback to be retried.
          *
          * @param action The function called on retry.
          * @return The builder instance.
          */
        public Builder action(Callable<HttpResponse<InputStream>> action) {
            Utils.checkNotNull(action, "action");
            this.action = action;
            return this;
        }

        /**
          * Defines the retry configuration.
          *
          * @param retryConfig The retry configuration to use.
          * @return The builder instance.
          */
        public Builder retryConfig(RetryConfig retryConfig) {
            Utils.checkNotNull(retryConfig, "retryConfig");
            this.retryConfig = retryConfig;
            return this;
        }

        /**
          * Defines the status codes that should be considered as errors.
          *
          * @param statusCodes The list of status codes to treat as errors.
          * @return The builder instance.
          */
        public Builder statusCodes(List<String> statusCodes) {
            Utils.checkNotNull(statusCodes, "statusCodes");
            if(statusCodes.size() == 0) {
                throw new IllegalArgumentException("statusCodes list cannot be empty");
            }
            this.statusCodes = statusCodes;
            return this;
        }

        public Retries build() {
            return new Retries(action, retryConfig, statusCodes);
        }
    }
}
