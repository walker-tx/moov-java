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
import java.util.Objects;
import java.util.Optional;


public class CreateSweepConfig {

    @JsonProperty("walletID")
    private String walletID;

    @JsonProperty("status")
    private SweepConfigStatus status;

    /**
     * ID of the payment method.
     */
    @JsonProperty("pushPaymentMethodID")
    private String pushPaymentMethodID;

    /**
     * ID of the payment method.
     */
    @JsonProperty("pullPaymentMethodID")
    private String pullPaymentMethodID;

    /**
     * The text that appears on the banking statement. The default descriptor is a 10 character ID if an override is not set in the sweep configs statementDescriptor.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("statementDescriptor")
    private Optional<String> statementDescriptor;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minimumBalance")
    private Optional<String> minimumBalance;

    @JsonCreator
    public CreateSweepConfig(
            @JsonProperty("walletID") String walletID,
            @JsonProperty("status") SweepConfigStatus status,
            @JsonProperty("pushPaymentMethodID") String pushPaymentMethodID,
            @JsonProperty("pullPaymentMethodID") String pullPaymentMethodID,
            @JsonProperty("statementDescriptor") Optional<String> statementDescriptor,
            @JsonProperty("minimumBalance") Optional<String> minimumBalance) {
        Utils.checkNotNull(walletID, "walletID");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(pushPaymentMethodID, "pushPaymentMethodID");
        Utils.checkNotNull(pullPaymentMethodID, "pullPaymentMethodID");
        Utils.checkNotNull(statementDescriptor, "statementDescriptor");
        Utils.checkNotNull(minimumBalance, "minimumBalance");
        this.walletID = walletID;
        this.status = status;
        this.pushPaymentMethodID = pushPaymentMethodID;
        this.pullPaymentMethodID = pullPaymentMethodID;
        this.statementDescriptor = statementDescriptor;
        this.minimumBalance = minimumBalance;
    }
    
    public CreateSweepConfig(
            String walletID,
            SweepConfigStatus status,
            String pushPaymentMethodID,
            String pullPaymentMethodID) {
        this(walletID, status, pushPaymentMethodID, pullPaymentMethodID, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String walletID() {
        return walletID;
    }

    @JsonIgnore
    public SweepConfigStatus status() {
        return status;
    }

    /**
     * ID of the payment method.
     */
    @JsonIgnore
    public String pushPaymentMethodID() {
        return pushPaymentMethodID;
    }

    /**
     * ID of the payment method.
     */
    @JsonIgnore
    public String pullPaymentMethodID() {
        return pullPaymentMethodID;
    }

    /**
     * The text that appears on the banking statement. The default descriptor is a 10 character ID if an override is not set in the sweep configs statementDescriptor.
     */
    @JsonIgnore
    public Optional<String> statementDescriptor() {
        return statementDescriptor;
    }

    @JsonIgnore
    public Optional<String> minimumBalance() {
        return minimumBalance;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateSweepConfig withWalletID(String walletID) {
        Utils.checkNotNull(walletID, "walletID");
        this.walletID = walletID;
        return this;
    }

    public CreateSweepConfig withStatus(SweepConfigStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * ID of the payment method.
     */
    public CreateSweepConfig withPushPaymentMethodID(String pushPaymentMethodID) {
        Utils.checkNotNull(pushPaymentMethodID, "pushPaymentMethodID");
        this.pushPaymentMethodID = pushPaymentMethodID;
        return this;
    }

    /**
     * ID of the payment method.
     */
    public CreateSweepConfig withPullPaymentMethodID(String pullPaymentMethodID) {
        Utils.checkNotNull(pullPaymentMethodID, "pullPaymentMethodID");
        this.pullPaymentMethodID = pullPaymentMethodID;
        return this;
    }

    /**
     * The text that appears on the banking statement. The default descriptor is a 10 character ID if an override is not set in the sweep configs statementDescriptor.
     */
    public CreateSweepConfig withStatementDescriptor(String statementDescriptor) {
        Utils.checkNotNull(statementDescriptor, "statementDescriptor");
        this.statementDescriptor = Optional.ofNullable(statementDescriptor);
        return this;
    }

    /**
     * The text that appears on the banking statement. The default descriptor is a 10 character ID if an override is not set in the sweep configs statementDescriptor.
     */
    public CreateSweepConfig withStatementDescriptor(Optional<String> statementDescriptor) {
        Utils.checkNotNull(statementDescriptor, "statementDescriptor");
        this.statementDescriptor = statementDescriptor;
        return this;
    }

    public CreateSweepConfig withMinimumBalance(String minimumBalance) {
        Utils.checkNotNull(minimumBalance, "minimumBalance");
        this.minimumBalance = Optional.ofNullable(minimumBalance);
        return this;
    }

    public CreateSweepConfig withMinimumBalance(Optional<String> minimumBalance) {
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
        CreateSweepConfig other = (CreateSweepConfig) o;
        return 
            Objects.deepEquals(this.walletID, other.walletID) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.pushPaymentMethodID, other.pushPaymentMethodID) &&
            Objects.deepEquals(this.pullPaymentMethodID, other.pullPaymentMethodID) &&
            Objects.deepEquals(this.statementDescriptor, other.statementDescriptor) &&
            Objects.deepEquals(this.minimumBalance, other.minimumBalance);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            walletID,
            status,
            pushPaymentMethodID,
            pullPaymentMethodID,
            statementDescriptor,
            minimumBalance);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateSweepConfig.class,
                "walletID", walletID,
                "status", status,
                "pushPaymentMethodID", pushPaymentMethodID,
                "pullPaymentMethodID", pullPaymentMethodID,
                "statementDescriptor", statementDescriptor,
                "minimumBalance", minimumBalance);
    }
    
    public final static class Builder {
 
        private String walletID;
 
        private SweepConfigStatus status;
 
        private String pushPaymentMethodID;
 
        private String pullPaymentMethodID;
 
        private Optional<String> statementDescriptor = Optional.empty();
 
        private Optional<String> minimumBalance = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder walletID(String walletID) {
            Utils.checkNotNull(walletID, "walletID");
            this.walletID = walletID;
            return this;
        }

        public Builder status(SweepConfigStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * ID of the payment method.
         */
        public Builder pushPaymentMethodID(String pushPaymentMethodID) {
            Utils.checkNotNull(pushPaymentMethodID, "pushPaymentMethodID");
            this.pushPaymentMethodID = pushPaymentMethodID;
            return this;
        }

        /**
         * ID of the payment method.
         */
        public Builder pullPaymentMethodID(String pullPaymentMethodID) {
            Utils.checkNotNull(pullPaymentMethodID, "pullPaymentMethodID");
            this.pullPaymentMethodID = pullPaymentMethodID;
            return this;
        }

        /**
         * The text that appears on the banking statement. The default descriptor is a 10 character ID if an override is not set in the sweep configs statementDescriptor.
         */
        public Builder statementDescriptor(String statementDescriptor) {
            Utils.checkNotNull(statementDescriptor, "statementDescriptor");
            this.statementDescriptor = Optional.ofNullable(statementDescriptor);
            return this;
        }

        /**
         * The text that appears on the banking statement. The default descriptor is a 10 character ID if an override is not set in the sweep configs statementDescriptor.
         */
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
        
        public CreateSweepConfig build() {
            return new CreateSweepConfig(
                walletID,
                status,
                pushPaymentMethodID,
                pullPaymentMethodID,
                statementDescriptor,
                minimumBalance);
        }
    }
}

