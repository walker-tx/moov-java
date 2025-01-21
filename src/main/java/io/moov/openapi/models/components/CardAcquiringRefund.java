/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.openapi.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

/**
 * CardAcquiringRefund - Details of a card refund.
 */

public class CardAcquiringRefund {

    /**
     * Identifier for the refund.
     */
    @JsonProperty("refundID")
    private String refundID;

    @JsonProperty("createdOn")
    private OffsetDateTime createdOn;

    @JsonProperty("updatedOn")
    private OffsetDateTime updatedOn;

    @JsonProperty("status")
    private RefundStatus status;

    @JsonProperty("amount")
    private Amount amount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cardDetails")
    private Optional<? extends RefundCardDetails> cardDetails;

    @JsonCreator
    public CardAcquiringRefund(
            @JsonProperty("refundID") String refundID,
            @JsonProperty("createdOn") OffsetDateTime createdOn,
            @JsonProperty("updatedOn") OffsetDateTime updatedOn,
            @JsonProperty("status") RefundStatus status,
            @JsonProperty("amount") Amount amount,
            @JsonProperty("cardDetails") Optional<? extends RefundCardDetails> cardDetails) {
        Utils.checkNotNull(refundID, "refundID");
        Utils.checkNotNull(createdOn, "createdOn");
        Utils.checkNotNull(updatedOn, "updatedOn");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(cardDetails, "cardDetails");
        this.refundID = refundID;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.status = status;
        this.amount = amount;
        this.cardDetails = cardDetails;
    }
    
    public CardAcquiringRefund(
            String refundID,
            OffsetDateTime createdOn,
            OffsetDateTime updatedOn,
            RefundStatus status,
            Amount amount) {
        this(refundID, createdOn, updatedOn, status, amount, Optional.empty());
    }

    /**
     * Identifier for the refund.
     */
    @JsonIgnore
    public String refundID() {
        return refundID;
    }

    @JsonIgnore
    public OffsetDateTime createdOn() {
        return createdOn;
    }

    @JsonIgnore
    public OffsetDateTime updatedOn() {
        return updatedOn;
    }

    @JsonIgnore
    public RefundStatus status() {
        return status;
    }

    @JsonIgnore
    public Amount amount() {
        return amount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RefundCardDetails> cardDetails() {
        return (Optional<RefundCardDetails>) cardDetails;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Identifier for the refund.
     */
    public CardAcquiringRefund withRefundID(String refundID) {
        Utils.checkNotNull(refundID, "refundID");
        this.refundID = refundID;
        return this;
    }

    public CardAcquiringRefund withCreatedOn(OffsetDateTime createdOn) {
        Utils.checkNotNull(createdOn, "createdOn");
        this.createdOn = createdOn;
        return this;
    }

    public CardAcquiringRefund withUpdatedOn(OffsetDateTime updatedOn) {
        Utils.checkNotNull(updatedOn, "updatedOn");
        this.updatedOn = updatedOn;
        return this;
    }

    public CardAcquiringRefund withStatus(RefundStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public CardAcquiringRefund withAmount(Amount amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public CardAcquiringRefund withCardDetails(RefundCardDetails cardDetails) {
        Utils.checkNotNull(cardDetails, "cardDetails");
        this.cardDetails = Optional.ofNullable(cardDetails);
        return this;
    }

    public CardAcquiringRefund withCardDetails(Optional<? extends RefundCardDetails> cardDetails) {
        Utils.checkNotNull(cardDetails, "cardDetails");
        this.cardDetails = cardDetails;
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
        CardAcquiringRefund other = (CardAcquiringRefund) o;
        return 
            Objects.deepEquals(this.refundID, other.refundID) &&
            Objects.deepEquals(this.createdOn, other.createdOn) &&
            Objects.deepEquals(this.updatedOn, other.updatedOn) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.cardDetails, other.cardDetails);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            refundID,
            createdOn,
            updatedOn,
            status,
            amount,
            cardDetails);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CardAcquiringRefund.class,
                "refundID", refundID,
                "createdOn", createdOn,
                "updatedOn", updatedOn,
                "status", status,
                "amount", amount,
                "cardDetails", cardDetails);
    }
    
    public final static class Builder {
 
        private String refundID;
 
        private OffsetDateTime createdOn;
 
        private OffsetDateTime updatedOn;
 
        private RefundStatus status;
 
        private Amount amount;
 
        private Optional<? extends RefundCardDetails> cardDetails = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Identifier for the refund.
         */
        public Builder refundID(String refundID) {
            Utils.checkNotNull(refundID, "refundID");
            this.refundID = refundID;
            return this;
        }

        public Builder createdOn(OffsetDateTime createdOn) {
            Utils.checkNotNull(createdOn, "createdOn");
            this.createdOn = createdOn;
            return this;
        }

        public Builder updatedOn(OffsetDateTime updatedOn) {
            Utils.checkNotNull(updatedOn, "updatedOn");
            this.updatedOn = updatedOn;
            return this;
        }

        public Builder status(RefundStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder amount(Amount amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        public Builder cardDetails(RefundCardDetails cardDetails) {
            Utils.checkNotNull(cardDetails, "cardDetails");
            this.cardDetails = Optional.ofNullable(cardDetails);
            return this;
        }

        public Builder cardDetails(Optional<? extends RefundCardDetails> cardDetails) {
            Utils.checkNotNull(cardDetails, "cardDetails");
            this.cardDetails = cardDetails;
            return this;
        }
        
        public CardAcquiringRefund build() {
            return new CardAcquiringRefund(
                refundID,
                createdOn,
                updatedOn,
                status,
                amount,
                cardDetails);
        }
    }
}

