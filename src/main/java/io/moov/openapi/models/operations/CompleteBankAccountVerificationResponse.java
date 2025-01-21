/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.openapi.models.components.BankAccountVerification;
import io.moov.openapi.utils.Response;
import io.moov.openapi.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class CompleteBankAccountVerificationResponse implements Response {

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
    private Optional<? extends BankAccountVerification> bankAccountVerification;

    @JsonCreator
    public CompleteBankAccountVerificationResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends BankAccountVerification> bankAccountVerification) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(bankAccountVerification, "bankAccountVerification");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.bankAccountVerification = bankAccountVerification;
    }
    
    public CompleteBankAccountVerificationResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
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
    public Optional<BankAccountVerification> bankAccountVerification() {
        return (Optional<BankAccountVerification>) bankAccountVerification;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public CompleteBankAccountVerificationResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CompleteBankAccountVerificationResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CompleteBankAccountVerificationResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The request completed successfully.
     */
    public CompleteBankAccountVerificationResponse withBankAccountVerification(BankAccountVerification bankAccountVerification) {
        Utils.checkNotNull(bankAccountVerification, "bankAccountVerification");
        this.bankAccountVerification = Optional.ofNullable(bankAccountVerification);
        return this;
    }

    /**
     * The request completed successfully.
     */
    public CompleteBankAccountVerificationResponse withBankAccountVerification(Optional<? extends BankAccountVerification> bankAccountVerification) {
        Utils.checkNotNull(bankAccountVerification, "bankAccountVerification");
        this.bankAccountVerification = bankAccountVerification;
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
        CompleteBankAccountVerificationResponse other = (CompleteBankAccountVerificationResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.bankAccountVerification, other.bankAccountVerification);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            bankAccountVerification);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CompleteBankAccountVerificationResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "bankAccountVerification", bankAccountVerification);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends BankAccountVerification> bankAccountVerification = Optional.empty();  
        
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
        public Builder bankAccountVerification(BankAccountVerification bankAccountVerification) {
            Utils.checkNotNull(bankAccountVerification, "bankAccountVerification");
            this.bankAccountVerification = Optional.ofNullable(bankAccountVerification);
            return this;
        }

        /**
         * The request completed successfully.
         */
        public Builder bankAccountVerification(Optional<? extends BankAccountVerification> bankAccountVerification) {
            Utils.checkNotNull(bankAccountVerification, "bankAccountVerification");
            this.bankAccountVerification = bankAccountVerification;
            return this;
        }
        
        public CompleteBankAccountVerificationResponse build() {
            return new CompleteBankAccountVerificationResponse(
                contentType,
                statusCode,
                rawResponse,
                bankAccountVerification);
        }
    }
}

