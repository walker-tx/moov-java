/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.sdk.models.components.AsyncTransfer;
import io.moov.sdk.models.components.Transfer;
import io.moov.sdk.models.components.TransferResponse;
import io.moov.sdk.utils.Response;
import io.moov.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class CreateTransferResponse implements Response {

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
    private Optional<? extends TransferResponse> transferResponse;

    /**
     * A transfer was successfully created but an error occurred while generating the synchronous response. The asynchronous response object will be returned.
     */
    private Optional<? extends AsyncTransfer> asyncTransfer;

    /**
     * A transfer was successfully created but a timeout occurred while waiting for a synchronous response. Rail-specific details may be missing from the response object.
     */
    private Optional<? extends Transfer> transfer;

    @JsonCreator
    public CreateTransferResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends TransferResponse> transferResponse,
            Optional<? extends AsyncTransfer> asyncTransfer,
            Optional<? extends Transfer> transfer) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(transferResponse, "transferResponse");
        Utils.checkNotNull(asyncTransfer, "asyncTransfer");
        Utils.checkNotNull(transfer, "transfer");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.transferResponse = transferResponse;
        this.asyncTransfer = asyncTransfer;
        this.transfer = transfer;
    }
    
    public CreateTransferResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty(), Optional.empty(), Optional.empty());
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
    public Optional<TransferResponse> transferResponse() {
        return (Optional<TransferResponse>) transferResponse;
    }

    /**
     * A transfer was successfully created but an error occurred while generating the synchronous response. The asynchronous response object will be returned.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AsyncTransfer> asyncTransfer() {
        return (Optional<AsyncTransfer>) asyncTransfer;
    }

    /**
     * A transfer was successfully created but a timeout occurred while waiting for a synchronous response. Rail-specific details may be missing from the response object.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Transfer> transfer() {
        return (Optional<Transfer>) transfer;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateTransferResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateTransferResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateTransferResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The request completed successfully.
     */
    public CreateTransferResponse withTransferResponse(TransferResponse transferResponse) {
        Utils.checkNotNull(transferResponse, "transferResponse");
        this.transferResponse = Optional.ofNullable(transferResponse);
        return this;
    }

    /**
     * The request completed successfully.
     */
    public CreateTransferResponse withTransferResponse(Optional<? extends TransferResponse> transferResponse) {
        Utils.checkNotNull(transferResponse, "transferResponse");
        this.transferResponse = transferResponse;
        return this;
    }

    /**
     * A transfer was successfully created but an error occurred while generating the synchronous response. The asynchronous response object will be returned.
     */
    public CreateTransferResponse withAsyncTransfer(AsyncTransfer asyncTransfer) {
        Utils.checkNotNull(asyncTransfer, "asyncTransfer");
        this.asyncTransfer = Optional.ofNullable(asyncTransfer);
        return this;
    }

    /**
     * A transfer was successfully created but an error occurred while generating the synchronous response. The asynchronous response object will be returned.
     */
    public CreateTransferResponse withAsyncTransfer(Optional<? extends AsyncTransfer> asyncTransfer) {
        Utils.checkNotNull(asyncTransfer, "asyncTransfer");
        this.asyncTransfer = asyncTransfer;
        return this;
    }

    /**
     * A transfer was successfully created but a timeout occurred while waiting for a synchronous response. Rail-specific details may be missing from the response object.
     */
    public CreateTransferResponse withTransfer(Transfer transfer) {
        Utils.checkNotNull(transfer, "transfer");
        this.transfer = Optional.ofNullable(transfer);
        return this;
    }

    /**
     * A transfer was successfully created but a timeout occurred while waiting for a synchronous response. Rail-specific details may be missing from the response object.
     */
    public CreateTransferResponse withTransfer(Optional<? extends Transfer> transfer) {
        Utils.checkNotNull(transfer, "transfer");
        this.transfer = transfer;
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
        CreateTransferResponse other = (CreateTransferResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.transferResponse, other.transferResponse) &&
            Objects.deepEquals(this.asyncTransfer, other.asyncTransfer) &&
            Objects.deepEquals(this.transfer, other.transfer);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            transferResponse,
            asyncTransfer,
            transfer);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTransferResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "transferResponse", transferResponse,
                "asyncTransfer", asyncTransfer,
                "transfer", transfer);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends TransferResponse> transferResponse = Optional.empty();
 
        private Optional<? extends AsyncTransfer> asyncTransfer = Optional.empty();
 
        private Optional<? extends Transfer> transfer = Optional.empty();  
        
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
        public Builder transferResponse(TransferResponse transferResponse) {
            Utils.checkNotNull(transferResponse, "transferResponse");
            this.transferResponse = Optional.ofNullable(transferResponse);
            return this;
        }

        /**
         * The request completed successfully.
         */
        public Builder transferResponse(Optional<? extends TransferResponse> transferResponse) {
            Utils.checkNotNull(transferResponse, "transferResponse");
            this.transferResponse = transferResponse;
            return this;
        }

        /**
         * A transfer was successfully created but an error occurred while generating the synchronous response. The asynchronous response object will be returned.
         */
        public Builder asyncTransfer(AsyncTransfer asyncTransfer) {
            Utils.checkNotNull(asyncTransfer, "asyncTransfer");
            this.asyncTransfer = Optional.ofNullable(asyncTransfer);
            return this;
        }

        /**
         * A transfer was successfully created but an error occurred while generating the synchronous response. The asynchronous response object will be returned.
         */
        public Builder asyncTransfer(Optional<? extends AsyncTransfer> asyncTransfer) {
            Utils.checkNotNull(asyncTransfer, "asyncTransfer");
            this.asyncTransfer = asyncTransfer;
            return this;
        }

        /**
         * A transfer was successfully created but a timeout occurred while waiting for a synchronous response. Rail-specific details may be missing from the response object.
         */
        public Builder transfer(Transfer transfer) {
            Utils.checkNotNull(transfer, "transfer");
            this.transfer = Optional.ofNullable(transfer);
            return this;
        }

        /**
         * A transfer was successfully created but a timeout occurred while waiting for a synchronous response. Rail-specific details may be missing from the response object.
         */
        public Builder transfer(Optional<? extends Transfer> transfer) {
            Utils.checkNotNull(transfer, "transfer");
            this.transfer = transfer;
            return this;
        }
        
        public CreateTransferResponse build() {
            return new CreateTransferResponse(
                contentType,
                statusCode,
                rawResponse,
                transferResponse,
                asyncTransfer,
                transfer);
        }
    }
}

