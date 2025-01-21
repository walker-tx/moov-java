/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.openapi.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

@SuppressWarnings("serial")
public class TransferValidationError extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Transfer")
    private Optional<String> transfer;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<String> amount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source")
    private Optional<String> source;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourcePaymentMethodID")
    private Optional<String> sourcePaymentMethodID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("destinationPaymentMethodID")
    private Optional<String> destinationPaymentMethodID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("FacilitatorFee.TotalDecimal")
    private Optional<String> facilitatorFeeTotalDecimal;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("FacilitatorFee.MarkupDecimal")
    private Optional<String> facilitatorFeeMarkupDecimal;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<String> metadata;

    /**
     * Used for generic errors when invalid request data isn't attributed to a single request field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<String> error;

    @JsonCreator
    public TransferValidationError(
            @JsonProperty("Transfer") Optional<String> transfer,
            @JsonProperty("amount") Optional<String> amount,
            @JsonProperty("source") Optional<String> source,
            @JsonProperty("sourcePaymentMethodID") Optional<String> sourcePaymentMethodID,
            @JsonProperty("destinationPaymentMethodID") Optional<String> destinationPaymentMethodID,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("FacilitatorFee.TotalDecimal") Optional<String> facilitatorFeeTotalDecimal,
            @JsonProperty("FacilitatorFee.MarkupDecimal") Optional<String> facilitatorFeeMarkupDecimal,
            @JsonProperty("metadata") Optional<String> metadata,
            @JsonProperty("error") Optional<String> error) {
        Utils.checkNotNull(transfer, "transfer");
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(source, "source");
        Utils.checkNotNull(sourcePaymentMethodID, "sourcePaymentMethodID");
        Utils.checkNotNull(destinationPaymentMethodID, "destinationPaymentMethodID");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(facilitatorFeeTotalDecimal, "facilitatorFeeTotalDecimal");
        Utils.checkNotNull(facilitatorFeeMarkupDecimal, "facilitatorFeeMarkupDecimal");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(error, "error");
        this.transfer = transfer;
        this.amount = amount;
        this.source = source;
        this.sourcePaymentMethodID = sourcePaymentMethodID;
        this.destinationPaymentMethodID = destinationPaymentMethodID;
        this.description = description;
        this.facilitatorFeeTotalDecimal = facilitatorFeeTotalDecimal;
        this.facilitatorFeeMarkupDecimal = facilitatorFeeMarkupDecimal;
        this.metadata = metadata;
        this.error = error;
    }
    
    public TransferValidationError() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    public Optional<String> transfer(){
        return transfer;
    }

    public Optional<String> amount(){
        return amount;
    }

    public Optional<String> source(){
        return source;
    }

    public Optional<String> sourcePaymentMethodID(){
        return sourcePaymentMethodID;
    }

    public Optional<String> destinationPaymentMethodID(){
        return destinationPaymentMethodID;
    }

    public Optional<String> description(){
        return description;
    }

    public Optional<String> facilitatorFeeTotalDecimal(){
        return facilitatorFeeTotalDecimal;
    }

    public Optional<String> facilitatorFeeMarkupDecimal(){
        return facilitatorFeeMarkupDecimal;
    }

    public Optional<String> metadata(){
        return metadata;
    }

    /**
     * Used for generic errors when invalid request data isn't attributed to a single request field.
     */
    public Optional<String> error(){
        return error;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public TransferValidationError withTransfer(String transfer) {
        Utils.checkNotNull(transfer, "transfer");
        this.transfer = Optional.ofNullable(transfer);
        return this;
    }
    
    public TransferValidationError withTransfer(Optional<String> transfer) {
        Utils.checkNotNull(transfer, "transfer");
        this.transfer = transfer;
        return this;
    }

    public TransferValidationError withAmount(String amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }
    
    public TransferValidationError withAmount(Optional<String> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public TransferValidationError withSource(String source) {
        Utils.checkNotNull(source, "source");
        this.source = Optional.ofNullable(source);
        return this;
    }
    
    public TransferValidationError withSource(Optional<String> source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }

    public TransferValidationError withSourcePaymentMethodID(String sourcePaymentMethodID) {
        Utils.checkNotNull(sourcePaymentMethodID, "sourcePaymentMethodID");
        this.sourcePaymentMethodID = Optional.ofNullable(sourcePaymentMethodID);
        return this;
    }
    
    public TransferValidationError withSourcePaymentMethodID(Optional<String> sourcePaymentMethodID) {
        Utils.checkNotNull(sourcePaymentMethodID, "sourcePaymentMethodID");
        this.sourcePaymentMethodID = sourcePaymentMethodID;
        return this;
    }

    public TransferValidationError withDestinationPaymentMethodID(String destinationPaymentMethodID) {
        Utils.checkNotNull(destinationPaymentMethodID, "destinationPaymentMethodID");
        this.destinationPaymentMethodID = Optional.ofNullable(destinationPaymentMethodID);
        return this;
    }
    
    public TransferValidationError withDestinationPaymentMethodID(Optional<String> destinationPaymentMethodID) {
        Utils.checkNotNull(destinationPaymentMethodID, "destinationPaymentMethodID");
        this.destinationPaymentMethodID = destinationPaymentMethodID;
        return this;
    }

    public TransferValidationError withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }
    
    public TransferValidationError withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public TransferValidationError withFacilitatorFeeTotalDecimal(String facilitatorFeeTotalDecimal) {
        Utils.checkNotNull(facilitatorFeeTotalDecimal, "facilitatorFeeTotalDecimal");
        this.facilitatorFeeTotalDecimal = Optional.ofNullable(facilitatorFeeTotalDecimal);
        return this;
    }
    
    public TransferValidationError withFacilitatorFeeTotalDecimal(Optional<String> facilitatorFeeTotalDecimal) {
        Utils.checkNotNull(facilitatorFeeTotalDecimal, "facilitatorFeeTotalDecimal");
        this.facilitatorFeeTotalDecimal = facilitatorFeeTotalDecimal;
        return this;
    }

    public TransferValidationError withFacilitatorFeeMarkupDecimal(String facilitatorFeeMarkupDecimal) {
        Utils.checkNotNull(facilitatorFeeMarkupDecimal, "facilitatorFeeMarkupDecimal");
        this.facilitatorFeeMarkupDecimal = Optional.ofNullable(facilitatorFeeMarkupDecimal);
        return this;
    }
    
    public TransferValidationError withFacilitatorFeeMarkupDecimal(Optional<String> facilitatorFeeMarkupDecimal) {
        Utils.checkNotNull(facilitatorFeeMarkupDecimal, "facilitatorFeeMarkupDecimal");
        this.facilitatorFeeMarkupDecimal = facilitatorFeeMarkupDecimal;
        return this;
    }

    public TransferValidationError withMetadata(String metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }
    
    public TransferValidationError withMetadata(Optional<String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * Used for generic errors when invalid request data isn't attributed to a single request field.
     */
    public TransferValidationError withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }
    
    /**
     * Used for generic errors when invalid request data isn't attributed to a single request field.
     */
    public TransferValidationError withError(Optional<String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
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
        TransferValidationError other = (TransferValidationError) o;
        return
            Objects.deepEquals(this.transfer, other.transfer) &&
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.source, other.source) &&
            Objects.deepEquals(this.sourcePaymentMethodID, other.sourcePaymentMethodID) &&
            Objects.deepEquals(this.destinationPaymentMethodID, other.destinationPaymentMethodID) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.facilitatorFeeTotalDecimal, other.facilitatorFeeTotalDecimal) &&
            Objects.deepEquals(this.facilitatorFeeMarkupDecimal, other.facilitatorFeeMarkupDecimal) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.error, other.error);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            transfer,
            amount,
            source,
            sourcePaymentMethodID,
            destinationPaymentMethodID,
            description,
            facilitatorFeeTotalDecimal,
            facilitatorFeeMarkupDecimal,
            metadata,
            error);
    }

    @Override
    public String toString() {
        return Utils.toString(TransferValidationError.class,
                "transfer", transfer,
                "amount", amount,
                "source", source,
                "sourcePaymentMethodID", sourcePaymentMethodID,
                "destinationPaymentMethodID", destinationPaymentMethodID,
                "description", description,
                "facilitatorFeeTotalDecimal", facilitatorFeeTotalDecimal,
                "facilitatorFeeMarkupDecimal", facilitatorFeeMarkupDecimal,
                "metadata", metadata,
                "error", error);
    }

    public final static class Builder {

        private Optional<String> transfer = Optional.empty();

        private Optional<String> amount = Optional.empty();

        private Optional<String> source = Optional.empty();

        private Optional<String> sourcePaymentMethodID = Optional.empty();

        private Optional<String> destinationPaymentMethodID = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<String> facilitatorFeeTotalDecimal = Optional.empty();

        private Optional<String> facilitatorFeeMarkupDecimal = Optional.empty();

        private Optional<String> metadata = Optional.empty();

        private Optional<String> error = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }

        public Builder transfer(String transfer) {
            Utils.checkNotNull(transfer, "transfer");
            this.transfer = Optional.ofNullable(transfer);
            return this;
        }
        
        public Builder transfer(Optional<String> transfer) {
            Utils.checkNotNull(transfer, "transfer");
            this.transfer = transfer;
            return this;
        }

        public Builder amount(String amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }
        
        public Builder amount(Optional<String> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        public Builder source(String source) {
            Utils.checkNotNull(source, "source");
            this.source = Optional.ofNullable(source);
            return this;
        }
        
        public Builder source(Optional<String> source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }

        public Builder sourcePaymentMethodID(String sourcePaymentMethodID) {
            Utils.checkNotNull(sourcePaymentMethodID, "sourcePaymentMethodID");
            this.sourcePaymentMethodID = Optional.ofNullable(sourcePaymentMethodID);
            return this;
        }
        
        public Builder sourcePaymentMethodID(Optional<String> sourcePaymentMethodID) {
            Utils.checkNotNull(sourcePaymentMethodID, "sourcePaymentMethodID");
            this.sourcePaymentMethodID = sourcePaymentMethodID;
            return this;
        }

        public Builder destinationPaymentMethodID(String destinationPaymentMethodID) {
            Utils.checkNotNull(destinationPaymentMethodID, "destinationPaymentMethodID");
            this.destinationPaymentMethodID = Optional.ofNullable(destinationPaymentMethodID);
            return this;
        }
        
        public Builder destinationPaymentMethodID(Optional<String> destinationPaymentMethodID) {
            Utils.checkNotNull(destinationPaymentMethodID, "destinationPaymentMethodID");
            this.destinationPaymentMethodID = destinationPaymentMethodID;
            return this;
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }
        
        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder facilitatorFeeTotalDecimal(String facilitatorFeeTotalDecimal) {
            Utils.checkNotNull(facilitatorFeeTotalDecimal, "facilitatorFeeTotalDecimal");
            this.facilitatorFeeTotalDecimal = Optional.ofNullable(facilitatorFeeTotalDecimal);
            return this;
        }
        
        public Builder facilitatorFeeTotalDecimal(Optional<String> facilitatorFeeTotalDecimal) {
            Utils.checkNotNull(facilitatorFeeTotalDecimal, "facilitatorFeeTotalDecimal");
            this.facilitatorFeeTotalDecimal = facilitatorFeeTotalDecimal;
            return this;
        }

        public Builder facilitatorFeeMarkupDecimal(String facilitatorFeeMarkupDecimal) {
            Utils.checkNotNull(facilitatorFeeMarkupDecimal, "facilitatorFeeMarkupDecimal");
            this.facilitatorFeeMarkupDecimal = Optional.ofNullable(facilitatorFeeMarkupDecimal);
            return this;
        }
        
        public Builder facilitatorFeeMarkupDecimal(Optional<String> facilitatorFeeMarkupDecimal) {
            Utils.checkNotNull(facilitatorFeeMarkupDecimal, "facilitatorFeeMarkupDecimal");
            this.facilitatorFeeMarkupDecimal = facilitatorFeeMarkupDecimal;
            return this;
        }

        public Builder metadata(String metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }
        
        public Builder metadata(Optional<String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        /**
         * Used for generic errors when invalid request data isn't attributed to a single request field.
         */
        public Builder error(String error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }
        
        /**
         * Used for generic errors when invalid request data isn't attributed to a single request field.
         */
        public Builder error(Optional<String> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        public TransferValidationError build() {
            return new TransferValidationError(
                transfer,
                amount,
                source,
                sourcePaymentMethodID,
                destinationPaymentMethodID,
                description,
                facilitatorFeeTotalDecimal,
                facilitatorFeeMarkupDecimal,
                metadata,
                error);
        }
    }
}
