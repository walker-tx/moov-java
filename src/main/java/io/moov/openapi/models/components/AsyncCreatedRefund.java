/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.openapi.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * AsyncCreatedRefund - Asynchronous refund response
 */

public class AsyncCreatedRefund {

    @JsonProperty("refundID")
    private String refundID;

    @JsonProperty("createdOn")
    private OffsetDateTime createdOn;

    @JsonProperty("amount")
    private Amount amount;

    @JsonCreator
    public AsyncCreatedRefund(
            @JsonProperty("refundID") String refundID,
            @JsonProperty("createdOn") OffsetDateTime createdOn,
            @JsonProperty("amount") Amount amount) {
        Utils.checkNotNull(refundID, "refundID");
        Utils.checkNotNull(createdOn, "createdOn");
        Utils.checkNotNull(amount, "amount");
        this.refundID = refundID;
        this.createdOn = createdOn;
        this.amount = amount;
    }

    @JsonIgnore
    public String refundID() {
        return refundID;
    }

    @JsonIgnore
    public OffsetDateTime createdOn() {
        return createdOn;
    }

    @JsonIgnore
    public Amount amount() {
        return amount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AsyncCreatedRefund withRefundID(String refundID) {
        Utils.checkNotNull(refundID, "refundID");
        this.refundID = refundID;
        return this;
    }

    public AsyncCreatedRefund withCreatedOn(OffsetDateTime createdOn) {
        Utils.checkNotNull(createdOn, "createdOn");
        this.createdOn = createdOn;
        return this;
    }

    public AsyncCreatedRefund withAmount(Amount amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
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
        AsyncCreatedRefund other = (AsyncCreatedRefund) o;
        return 
            Objects.deepEquals(this.refundID, other.refundID) &&
            Objects.deepEquals(this.createdOn, other.createdOn) &&
            Objects.deepEquals(this.amount, other.amount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            refundID,
            createdOn,
            amount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AsyncCreatedRefund.class,
                "refundID", refundID,
                "createdOn", createdOn,
                "amount", amount);
    }
    
    public final static class Builder {
 
        private String refundID;
 
        private OffsetDateTime createdOn;
 
        private Amount amount;  
        
        private Builder() {
          // force use of static builder() method
        }

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

        public Builder amount(Amount amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }
        
        public AsyncCreatedRefund build() {
            return new AsyncCreatedRefund(
                refundID,
                createdOn,
                amount);
        }
    }
}

