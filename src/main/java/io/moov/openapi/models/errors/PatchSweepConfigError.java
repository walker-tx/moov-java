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
public class PatchSweepConfigError extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<String> status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pushPaymentMethodID")
    private Optional<String> pushPaymentMethodID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pullPaymentMethodID")
    private Optional<String> pullPaymentMethodID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("statementDescriptor")
    private Optional<String> statementDescriptor;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minimumBalance")
    private Optional<String> minimumBalance;

    @JsonCreator
    public PatchSweepConfigError(
            @JsonProperty("status") Optional<String> status,
            @JsonProperty("pushPaymentMethodID") Optional<String> pushPaymentMethodID,
            @JsonProperty("pullPaymentMethodID") Optional<String> pullPaymentMethodID,
            @JsonProperty("statementDescriptor") Optional<String> statementDescriptor,
            @JsonProperty("minimumBalance") Optional<String> minimumBalance) {
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(pushPaymentMethodID, "pushPaymentMethodID");
        Utils.checkNotNull(pullPaymentMethodID, "pullPaymentMethodID");
        Utils.checkNotNull(statementDescriptor, "statementDescriptor");
        Utils.checkNotNull(minimumBalance, "minimumBalance");
        this.status = status;
        this.pushPaymentMethodID = pushPaymentMethodID;
        this.pullPaymentMethodID = pullPaymentMethodID;
        this.statementDescriptor = statementDescriptor;
        this.minimumBalance = minimumBalance;
    }
    
    public PatchSweepConfigError() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    public Optional<String> status(){
        return status;
    }

    public Optional<String> pushPaymentMethodID(){
        return pushPaymentMethodID;
    }

    public Optional<String> pullPaymentMethodID(){
        return pullPaymentMethodID;
    }

    public Optional<String> statementDescriptor(){
        return statementDescriptor;
    }

    public Optional<String> minimumBalance(){
        return minimumBalance;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public PatchSweepConfigError withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }
    
    public PatchSweepConfigError withStatus(Optional<String> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public PatchSweepConfigError withPushPaymentMethodID(String pushPaymentMethodID) {
        Utils.checkNotNull(pushPaymentMethodID, "pushPaymentMethodID");
        this.pushPaymentMethodID = Optional.ofNullable(pushPaymentMethodID);
        return this;
    }
    
    public PatchSweepConfigError withPushPaymentMethodID(Optional<String> pushPaymentMethodID) {
        Utils.checkNotNull(pushPaymentMethodID, "pushPaymentMethodID");
        this.pushPaymentMethodID = pushPaymentMethodID;
        return this;
    }

    public PatchSweepConfigError withPullPaymentMethodID(String pullPaymentMethodID) {
        Utils.checkNotNull(pullPaymentMethodID, "pullPaymentMethodID");
        this.pullPaymentMethodID = Optional.ofNullable(pullPaymentMethodID);
        return this;
    }
    
    public PatchSweepConfigError withPullPaymentMethodID(Optional<String> pullPaymentMethodID) {
        Utils.checkNotNull(pullPaymentMethodID, "pullPaymentMethodID");
        this.pullPaymentMethodID = pullPaymentMethodID;
        return this;
    }

    public PatchSweepConfigError withStatementDescriptor(String statementDescriptor) {
        Utils.checkNotNull(statementDescriptor, "statementDescriptor");
        this.statementDescriptor = Optional.ofNullable(statementDescriptor);
        return this;
    }
    
    public PatchSweepConfigError withStatementDescriptor(Optional<String> statementDescriptor) {
        Utils.checkNotNull(statementDescriptor, "statementDescriptor");
        this.statementDescriptor = statementDescriptor;
        return this;
    }

    public PatchSweepConfigError withMinimumBalance(String minimumBalance) {
        Utils.checkNotNull(minimumBalance, "minimumBalance");
        this.minimumBalance = Optional.ofNullable(minimumBalance);
        return this;
    }
    
    public PatchSweepConfigError withMinimumBalance(Optional<String> minimumBalance) {
        Utils.checkNotNull(minimumBalance, "minimumBalance");
        this.minimumBalance = minimumBalance;
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
        PatchSweepConfigError other = (PatchSweepConfigError) o;
        return
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.pushPaymentMethodID, other.pushPaymentMethodID) &&
            Objects.deepEquals(this.pullPaymentMethodID, other.pullPaymentMethodID) &&
            Objects.deepEquals(this.statementDescriptor, other.statementDescriptor) &&
            Objects.deepEquals(this.minimumBalance, other.minimumBalance);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            status,
            pushPaymentMethodID,
            pullPaymentMethodID,
            statementDescriptor,
            minimumBalance);
    }

    @Override
    public String toString() {
        return Utils.toString(PatchSweepConfigError.class,
                "status", status,
                "pushPaymentMethodID", pushPaymentMethodID,
                "pullPaymentMethodID", pullPaymentMethodID,
                "statementDescriptor", statementDescriptor,
                "minimumBalance", minimumBalance);
    }

    public final static class Builder {

        private Optional<String> status = Optional.empty();

        private Optional<String> pushPaymentMethodID = Optional.empty();

        private Optional<String> pullPaymentMethodID = Optional.empty();

        private Optional<String> statementDescriptor = Optional.empty();

        private Optional<String> minimumBalance = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }

        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }
        
        public Builder status(Optional<String> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder pushPaymentMethodID(String pushPaymentMethodID) {
            Utils.checkNotNull(pushPaymentMethodID, "pushPaymentMethodID");
            this.pushPaymentMethodID = Optional.ofNullable(pushPaymentMethodID);
            return this;
        }
        
        public Builder pushPaymentMethodID(Optional<String> pushPaymentMethodID) {
            Utils.checkNotNull(pushPaymentMethodID, "pushPaymentMethodID");
            this.pushPaymentMethodID = pushPaymentMethodID;
            return this;
        }

        public Builder pullPaymentMethodID(String pullPaymentMethodID) {
            Utils.checkNotNull(pullPaymentMethodID, "pullPaymentMethodID");
            this.pullPaymentMethodID = Optional.ofNullable(pullPaymentMethodID);
            return this;
        }
        
        public Builder pullPaymentMethodID(Optional<String> pullPaymentMethodID) {
            Utils.checkNotNull(pullPaymentMethodID, "pullPaymentMethodID");
            this.pullPaymentMethodID = pullPaymentMethodID;
            return this;
        }

        public Builder statementDescriptor(String statementDescriptor) {
            Utils.checkNotNull(statementDescriptor, "statementDescriptor");
            this.statementDescriptor = Optional.ofNullable(statementDescriptor);
            return this;
        }
        
        public Builder statementDescriptor(Optional<String> statementDescriptor) {
            Utils.checkNotNull(statementDescriptor, "statementDescriptor");
            this.statementDescriptor = statementDescriptor;
            return this;
        }

        public Builder minimumBalance(String minimumBalance) {
            Utils.checkNotNull(minimumBalance, "minimumBalance");
            this.minimumBalance = Optional.ofNullable(minimumBalance);
            return this;
        }
        
        public Builder minimumBalance(Optional<String> minimumBalance) {
            Utils.checkNotNull(minimumBalance, "minimumBalance");
            this.minimumBalance = minimumBalance;
            return this;
        }

        public PatchSweepConfigError build() {
            return new PatchSweepConfigError(
                status,
                pushPaymentMethodID,
                pullPaymentMethodID,
                statementDescriptor,
                minimumBalance);
        }
    }
}
