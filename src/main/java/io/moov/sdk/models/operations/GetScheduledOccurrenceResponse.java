/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.sdk.models.components.OccurrencesResponse;
import io.moov.sdk.utils.Response;
import io.moov.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class GetScheduledOccurrenceResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * The request completed successfully.
     */
    private Optional<? extends OccurrencesResponse> occurrencesResponse;

    private Map<String, List<String>> headers;

    @JsonCreator
    public GetScheduledOccurrenceResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends OccurrencesResponse> occurrencesResponse,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(occurrencesResponse, "occurrencesResponse");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.occurrencesResponse = occurrencesResponse;
        this.headers = headers;
    }
    
    public GetScheduledOccurrenceResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Map<String, List<String>> headers) {
        this(contentType, statusCode, rawResponse, Optional.empty(), headers);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * The request completed successfully.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OccurrencesResponse> occurrencesResponse() {
        return (Optional<OccurrencesResponse>) occurrencesResponse;
    }

    @JsonIgnore
    public Map<String, List<String>> headers() {
        return headers;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetScheduledOccurrenceResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetScheduledOccurrenceResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetScheduledOccurrenceResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The request completed successfully.
     */
    public GetScheduledOccurrenceResponse withOccurrencesResponse(OccurrencesResponse occurrencesResponse) {
        Utils.checkNotNull(occurrencesResponse, "occurrencesResponse");
        this.occurrencesResponse = Optional.ofNullable(occurrencesResponse);
        return this;
    }

    /**
     * The request completed successfully.
     */
    public GetScheduledOccurrenceResponse withOccurrencesResponse(Optional<? extends OccurrencesResponse> occurrencesResponse) {
        Utils.checkNotNull(occurrencesResponse, "occurrencesResponse");
        this.occurrencesResponse = occurrencesResponse;
        return this;
    }

    public GetScheduledOccurrenceResponse withHeaders(Map<String, List<String>> headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = headers;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetScheduledOccurrenceResponse other = (GetScheduledOccurrenceResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.occurrencesResponse, other.occurrencesResponse) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            occurrencesResponse,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetScheduledOccurrenceResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "occurrencesResponse", occurrencesResponse,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends OccurrencesResponse> occurrencesResponse = Optional.empty();
 
        private Map<String, List<String>> headers;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * The request completed successfully.
         */
        public Builder occurrencesResponse(OccurrencesResponse occurrencesResponse) {
            Utils.checkNotNull(occurrencesResponse, "occurrencesResponse");
            this.occurrencesResponse = Optional.ofNullable(occurrencesResponse);
            return this;
        }

        /**
         * The request completed successfully.
         */
        public Builder occurrencesResponse(Optional<? extends OccurrencesResponse> occurrencesResponse) {
            Utils.checkNotNull(occurrencesResponse, "occurrencesResponse");
            this.occurrencesResponse = occurrencesResponse;
            return this;
        }

        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public GetScheduledOccurrenceResponse build() {
            return new GetScheduledOccurrenceResponse(
                contentType,
                statusCode,
                rawResponse,
                occurrencesResponse,
                headers);
        }
    }
}

