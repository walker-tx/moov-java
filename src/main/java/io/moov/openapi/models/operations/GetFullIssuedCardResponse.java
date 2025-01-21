/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.openapi.models.components.FullIssuedCard;
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


public class GetFullIssuedCardResponse implements Response {

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
    private Optional<? extends FullIssuedCard> fullIssuedCard;

    @JsonCreator
    public GetFullIssuedCardResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends FullIssuedCard> fullIssuedCard) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(fullIssuedCard, "fullIssuedCard");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.fullIssuedCard = fullIssuedCard;
    }
    
    public GetFullIssuedCardResponse(
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
    public Optional<FullIssuedCard> fullIssuedCard() {
        return (Optional<FullIssuedCard>) fullIssuedCard;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetFullIssuedCardResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetFullIssuedCardResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetFullIssuedCardResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The request completed successfully.
     */
    public GetFullIssuedCardResponse withFullIssuedCard(FullIssuedCard fullIssuedCard) {
        Utils.checkNotNull(fullIssuedCard, "fullIssuedCard");
        this.fullIssuedCard = Optional.ofNullable(fullIssuedCard);
        return this;
    }

    /**
     * The request completed successfully.
     */
    public GetFullIssuedCardResponse withFullIssuedCard(Optional<? extends FullIssuedCard> fullIssuedCard) {
        Utils.checkNotNull(fullIssuedCard, "fullIssuedCard");
        this.fullIssuedCard = fullIssuedCard;
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
        GetFullIssuedCardResponse other = (GetFullIssuedCardResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.fullIssuedCard, other.fullIssuedCard);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            fullIssuedCard);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetFullIssuedCardResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "fullIssuedCard", fullIssuedCard);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends FullIssuedCard> fullIssuedCard = Optional.empty();  
        
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
        public Builder fullIssuedCard(FullIssuedCard fullIssuedCard) {
            Utils.checkNotNull(fullIssuedCard, "fullIssuedCard");
            this.fullIssuedCard = Optional.ofNullable(fullIssuedCard);
            return this;
        }

        /**
         * The request completed successfully.
         */
        public Builder fullIssuedCard(Optional<? extends FullIssuedCard> fullIssuedCard) {
            Utils.checkNotNull(fullIssuedCard, "fullIssuedCard");
            this.fullIssuedCard = fullIssuedCard;
            return this;
        }
        
        public GetFullIssuedCardResponse build() {
            return new GetFullIssuedCardResponse(
                contentType,
                statusCode,
                rawResponse,
                fullIssuedCard);
        }
    }
}

