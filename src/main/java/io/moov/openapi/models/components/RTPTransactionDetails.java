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
 * RTPTransactionDetails - RTP specific details about the transaction.
 */

public class RTPTransactionDetails {

    /**
     * Status of a transaction within the RTP lifecycle.
     */
    @JsonProperty("status")
    private RTPTransactionStatus status;

    /**
     * Response code returned by network on failure.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("networkResponseCode")
    private Optional<String> networkResponseCode;

    /**
     * Status codes for RTP failures.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("failureCode")
    private Optional<? extends RTPFailureCode> failureCode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("initiatedOn")
    private Optional<OffsetDateTime> initiatedOn;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("completedOn")
    private Optional<OffsetDateTime> completedOn;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("failedOn")
    private Optional<OffsetDateTime> failedOn;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("acceptedWithoutPostingOn")
    private Optional<OffsetDateTime> acceptedWithoutPostingOn;

    @JsonCreator
    public RTPTransactionDetails(
            @JsonProperty("status") RTPTransactionStatus status,
            @JsonProperty("networkResponseCode") Optional<String> networkResponseCode,
            @JsonProperty("failureCode") Optional<? extends RTPFailureCode> failureCode,
            @JsonProperty("initiatedOn") Optional<OffsetDateTime> initiatedOn,
            @JsonProperty("completedOn") Optional<OffsetDateTime> completedOn,
            @JsonProperty("failedOn") Optional<OffsetDateTime> failedOn,
            @JsonProperty("acceptedWithoutPostingOn") Optional<OffsetDateTime> acceptedWithoutPostingOn) {
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(networkResponseCode, "networkResponseCode");
        Utils.checkNotNull(failureCode, "failureCode");
        Utils.checkNotNull(initiatedOn, "initiatedOn");
        Utils.checkNotNull(completedOn, "completedOn");
        Utils.checkNotNull(failedOn, "failedOn");
        Utils.checkNotNull(acceptedWithoutPostingOn, "acceptedWithoutPostingOn");
        this.status = status;
        this.networkResponseCode = networkResponseCode;
        this.failureCode = failureCode;
        this.initiatedOn = initiatedOn;
        this.completedOn = completedOn;
        this.failedOn = failedOn;
        this.acceptedWithoutPostingOn = acceptedWithoutPostingOn;
    }
    
    public RTPTransactionDetails(
            RTPTransactionStatus status) {
        this(status, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Status of a transaction within the RTP lifecycle.
     */
    @JsonIgnore
    public RTPTransactionStatus status() {
        return status;
    }

    /**
     * Response code returned by network on failure.
     */
    @JsonIgnore
    public Optional<String> networkResponseCode() {
        return networkResponseCode;
    }

    /**
     * Status codes for RTP failures.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RTPFailureCode> failureCode() {
        return (Optional<RTPFailureCode>) failureCode;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> initiatedOn() {
        return initiatedOn;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> completedOn() {
        return completedOn;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> failedOn() {
        return failedOn;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> acceptedWithoutPostingOn() {
        return acceptedWithoutPostingOn;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Status of a transaction within the RTP lifecycle.
     */
    public RTPTransactionDetails withStatus(RTPTransactionStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Response code returned by network on failure.
     */
    public RTPTransactionDetails withNetworkResponseCode(String networkResponseCode) {
        Utils.checkNotNull(networkResponseCode, "networkResponseCode");
        this.networkResponseCode = Optional.ofNullable(networkResponseCode);
        return this;
    }

    /**
     * Response code returned by network on failure.
     */
    public RTPTransactionDetails withNetworkResponseCode(Optional<String> networkResponseCode) {
        Utils.checkNotNull(networkResponseCode, "networkResponseCode");
        this.networkResponseCode = networkResponseCode;
        return this;
    }

    /**
     * Status codes for RTP failures.
     */
    public RTPTransactionDetails withFailureCode(RTPFailureCode failureCode) {
        Utils.checkNotNull(failureCode, "failureCode");
        this.failureCode = Optional.ofNullable(failureCode);
        return this;
    }

    /**
     * Status codes for RTP failures.
     */
    public RTPTransactionDetails withFailureCode(Optional<? extends RTPFailureCode> failureCode) {
        Utils.checkNotNull(failureCode, "failureCode");
        this.failureCode = failureCode;
        return this;
    }

    public RTPTransactionDetails withInitiatedOn(OffsetDateTime initiatedOn) {
        Utils.checkNotNull(initiatedOn, "initiatedOn");
        this.initiatedOn = Optional.ofNullable(initiatedOn);
        return this;
    }

    public RTPTransactionDetails withInitiatedOn(Optional<OffsetDateTime> initiatedOn) {
        Utils.checkNotNull(initiatedOn, "initiatedOn");
        this.initiatedOn = initiatedOn;
        return this;
    }

    public RTPTransactionDetails withCompletedOn(OffsetDateTime completedOn) {
        Utils.checkNotNull(completedOn, "completedOn");
        this.completedOn = Optional.ofNullable(completedOn);
        return this;
    }

    public RTPTransactionDetails withCompletedOn(Optional<OffsetDateTime> completedOn) {
        Utils.checkNotNull(completedOn, "completedOn");
        this.completedOn = completedOn;
        return this;
    }

    public RTPTransactionDetails withFailedOn(OffsetDateTime failedOn) {
        Utils.checkNotNull(failedOn, "failedOn");
        this.failedOn = Optional.ofNullable(failedOn);
        return this;
    }

    public RTPTransactionDetails withFailedOn(Optional<OffsetDateTime> failedOn) {
        Utils.checkNotNull(failedOn, "failedOn");
        this.failedOn = failedOn;
        return this;
    }

    public RTPTransactionDetails withAcceptedWithoutPostingOn(OffsetDateTime acceptedWithoutPostingOn) {
        Utils.checkNotNull(acceptedWithoutPostingOn, "acceptedWithoutPostingOn");
        this.acceptedWithoutPostingOn = Optional.ofNullable(acceptedWithoutPostingOn);
        return this;
    }

    public RTPTransactionDetails withAcceptedWithoutPostingOn(Optional<OffsetDateTime> acceptedWithoutPostingOn) {
        Utils.checkNotNull(acceptedWithoutPostingOn, "acceptedWithoutPostingOn");
        this.acceptedWithoutPostingOn = acceptedWithoutPostingOn;
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
        RTPTransactionDetails other = (RTPTransactionDetails) o;
        return 
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.networkResponseCode, other.networkResponseCode) &&
            Objects.deepEquals(this.failureCode, other.failureCode) &&
            Objects.deepEquals(this.initiatedOn, other.initiatedOn) &&
            Objects.deepEquals(this.completedOn, other.completedOn) &&
            Objects.deepEquals(this.failedOn, other.failedOn) &&
            Objects.deepEquals(this.acceptedWithoutPostingOn, other.acceptedWithoutPostingOn);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            status,
            networkResponseCode,
            failureCode,
            initiatedOn,
            completedOn,
            failedOn,
            acceptedWithoutPostingOn);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RTPTransactionDetails.class,
                "status", status,
                "networkResponseCode", networkResponseCode,
                "failureCode", failureCode,
                "initiatedOn", initiatedOn,
                "completedOn", completedOn,
                "failedOn", failedOn,
                "acceptedWithoutPostingOn", acceptedWithoutPostingOn);
    }
    
    public final static class Builder {
 
        private RTPTransactionStatus status;
 
        private Optional<String> networkResponseCode = Optional.empty();
 
        private Optional<? extends RTPFailureCode> failureCode = Optional.empty();
 
        private Optional<OffsetDateTime> initiatedOn = Optional.empty();
 
        private Optional<OffsetDateTime> completedOn = Optional.empty();
 
        private Optional<OffsetDateTime> failedOn = Optional.empty();
 
        private Optional<OffsetDateTime> acceptedWithoutPostingOn = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Status of a transaction within the RTP lifecycle.
         */
        public Builder status(RTPTransactionStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Response code returned by network on failure.
         */
        public Builder networkResponseCode(String networkResponseCode) {
            Utils.checkNotNull(networkResponseCode, "networkResponseCode");
            this.networkResponseCode = Optional.ofNullable(networkResponseCode);
            return this;
        }

        /**
         * Response code returned by network on failure.
         */
        public Builder networkResponseCode(Optional<String> networkResponseCode) {
            Utils.checkNotNull(networkResponseCode, "networkResponseCode");
            this.networkResponseCode = networkResponseCode;
            return this;
        }

        /**
         * Status codes for RTP failures.
         */
        public Builder failureCode(RTPFailureCode failureCode) {
            Utils.checkNotNull(failureCode, "failureCode");
            this.failureCode = Optional.ofNullable(failureCode);
            return this;
        }

        /**
         * Status codes for RTP failures.
         */
        public Builder failureCode(Optional<? extends RTPFailureCode> failureCode) {
            Utils.checkNotNull(failureCode, "failureCode");
            this.failureCode = failureCode;
            return this;
        }

        public Builder initiatedOn(OffsetDateTime initiatedOn) {
            Utils.checkNotNull(initiatedOn, "initiatedOn");
            this.initiatedOn = Optional.ofNullable(initiatedOn);
            return this;
        }

        public Builder initiatedOn(Optional<OffsetDateTime> initiatedOn) {
            Utils.checkNotNull(initiatedOn, "initiatedOn");
            this.initiatedOn = initiatedOn;
            return this;
        }

        public Builder completedOn(OffsetDateTime completedOn) {
            Utils.checkNotNull(completedOn, "completedOn");
            this.completedOn = Optional.ofNullable(completedOn);
            return this;
        }

        public Builder completedOn(Optional<OffsetDateTime> completedOn) {
            Utils.checkNotNull(completedOn, "completedOn");
            this.completedOn = completedOn;
            return this;
        }

        public Builder failedOn(OffsetDateTime failedOn) {
            Utils.checkNotNull(failedOn, "failedOn");
            this.failedOn = Optional.ofNullable(failedOn);
            return this;
        }

        public Builder failedOn(Optional<OffsetDateTime> failedOn) {
            Utils.checkNotNull(failedOn, "failedOn");
            this.failedOn = failedOn;
            return this;
        }

        public Builder acceptedWithoutPostingOn(OffsetDateTime acceptedWithoutPostingOn) {
            Utils.checkNotNull(acceptedWithoutPostingOn, "acceptedWithoutPostingOn");
            this.acceptedWithoutPostingOn = Optional.ofNullable(acceptedWithoutPostingOn);
            return this;
        }

        public Builder acceptedWithoutPostingOn(Optional<OffsetDateTime> acceptedWithoutPostingOn) {
            Utils.checkNotNull(acceptedWithoutPostingOn, "acceptedWithoutPostingOn");
            this.acceptedWithoutPostingOn = acceptedWithoutPostingOn;
            return this;
        }
        
        public RTPTransactionDetails build() {
            return new RTPTransactionDetails(
                status,
                networkResponseCode,
                failureCode,
                initiatedOn,
                completedOn,
                failedOn,
                acceptedWithoutPostingOn);
        }
    }
}

