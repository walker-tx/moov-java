/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
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


public class GetAvatarResponse implements Response {

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
     * The request has succeeded.
     */
    private Optional<? extends InputStream> twoHundredImagePngResponseStream;

    /**
     * The request has succeeded.
     */
    private Optional<? extends InputStream> twoHundredImageJpegResponseStream;

    @JsonCreator
    public GetAvatarResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends InputStream> twoHundredImagePngResponseStream,
            Optional<? extends InputStream> twoHundredImageJpegResponseStream) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(twoHundredImagePngResponseStream, "twoHundredImagePngResponseStream");
        Utils.checkNotNull(twoHundredImageJpegResponseStream, "twoHundredImageJpegResponseStream");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.twoHundredImagePngResponseStream = twoHundredImagePngResponseStream;
        this.twoHundredImageJpegResponseStream = twoHundredImageJpegResponseStream;
    }
    
    public GetAvatarResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty(), Optional.empty());
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
     * The request has succeeded.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InputStream> twoHundredImagePngResponseStream() {
        return (Optional<InputStream>) twoHundredImagePngResponseStream;
    }

    /**
     * The request has succeeded.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InputStream> twoHundredImageJpegResponseStream() {
        return (Optional<InputStream>) twoHundredImageJpegResponseStream;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetAvatarResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetAvatarResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetAvatarResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The request has succeeded.
     */
    public GetAvatarResponse withTwoHundredImagePngResponseStream(InputStream twoHundredImagePngResponseStream) {
        Utils.checkNotNull(twoHundredImagePngResponseStream, "twoHundredImagePngResponseStream");
        this.twoHundredImagePngResponseStream = Optional.ofNullable(twoHundredImagePngResponseStream);
        return this;
    }

    /**
     * The request has succeeded.
     */
    public GetAvatarResponse withTwoHundredImagePngResponseStream(Optional<? extends InputStream> twoHundredImagePngResponseStream) {
        Utils.checkNotNull(twoHundredImagePngResponseStream, "twoHundredImagePngResponseStream");
        this.twoHundredImagePngResponseStream = twoHundredImagePngResponseStream;
        return this;
    }

    /**
     * The request has succeeded.
     */
    public GetAvatarResponse withTwoHundredImageJpegResponseStream(InputStream twoHundredImageJpegResponseStream) {
        Utils.checkNotNull(twoHundredImageJpegResponseStream, "twoHundredImageJpegResponseStream");
        this.twoHundredImageJpegResponseStream = Optional.ofNullable(twoHundredImageJpegResponseStream);
        return this;
    }

    /**
     * The request has succeeded.
     */
    public GetAvatarResponse withTwoHundredImageJpegResponseStream(Optional<? extends InputStream> twoHundredImageJpegResponseStream) {
        Utils.checkNotNull(twoHundredImageJpegResponseStream, "twoHundredImageJpegResponseStream");
        this.twoHundredImageJpegResponseStream = twoHundredImageJpegResponseStream;
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
        GetAvatarResponse other = (GetAvatarResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.twoHundredImagePngResponseStream, other.twoHundredImagePngResponseStream) &&
            Objects.deepEquals(this.twoHundredImageJpegResponseStream, other.twoHundredImageJpegResponseStream);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            twoHundredImagePngResponseStream,
            twoHundredImageJpegResponseStream);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAvatarResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "twoHundredImagePngResponseStream", twoHundredImagePngResponseStream,
                "twoHundredImageJpegResponseStream", twoHundredImageJpegResponseStream);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends InputStream> twoHundredImagePngResponseStream = Optional.empty();
 
        private Optional<? extends InputStream> twoHundredImageJpegResponseStream = Optional.empty();  
        
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
         * The request has succeeded.
         */
        public Builder twoHundredImagePngResponseStream(InputStream twoHundredImagePngResponseStream) {
            Utils.checkNotNull(twoHundredImagePngResponseStream, "twoHundredImagePngResponseStream");
            this.twoHundredImagePngResponseStream = Optional.ofNullable(twoHundredImagePngResponseStream);
            return this;
        }

        /**
         * The request has succeeded.
         */
        public Builder twoHundredImagePngResponseStream(Optional<? extends InputStream> twoHundredImagePngResponseStream) {
            Utils.checkNotNull(twoHundredImagePngResponseStream, "twoHundredImagePngResponseStream");
            this.twoHundredImagePngResponseStream = twoHundredImagePngResponseStream;
            return this;
        }

        /**
         * The request has succeeded.
         */
        public Builder twoHundredImageJpegResponseStream(InputStream twoHundredImageJpegResponseStream) {
            Utils.checkNotNull(twoHundredImageJpegResponseStream, "twoHundredImageJpegResponseStream");
            this.twoHundredImageJpegResponseStream = Optional.ofNullable(twoHundredImageJpegResponseStream);
            return this;
        }

        /**
         * The request has succeeded.
         */
        public Builder twoHundredImageJpegResponseStream(Optional<? extends InputStream> twoHundredImageJpegResponseStream) {
            Utils.checkNotNull(twoHundredImageJpegResponseStream, "twoHundredImageJpegResponseStream");
            this.twoHundredImageJpegResponseStream = twoHundredImageJpegResponseStream;
            return this;
        }
        
        public GetAvatarResponse build() {
            return new GetAvatarResponse(
                contentType,
                statusCode,
                rawResponse,
                twoHundredImagePngResponseStream,
                twoHundredImageJpegResponseStream);
        }
    }
}

