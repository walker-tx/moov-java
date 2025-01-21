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


public class FeeProperties {

    /**
     * A fixed fee that is applied to the amount of each transaction in the `fixed` and `blended` fee models, expressed as a decimal.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fixedAmount")
    private Optional<String> fixedAmount;

    /**
     * A percentage fee that is applied to the amount of each transaction in the `blended` fee model, expressed as a decimal.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("variableRate")
    private Optional<String> variableRate;

    /**
     * Specifies the minimum allowable spending for a single transaction, working as a transaction floor.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minPerTransaction")
    private Optional<String> minPerTransaction;

    /**
     * Specifies the maximum allowable spending for a single transaction, working as a transaction ceiling.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("maxPerTransaction")
    private Optional<String> maxPerTransaction;

    @JsonCreator
    public FeeProperties(
            @JsonProperty("fixedAmount") Optional<String> fixedAmount,
            @JsonProperty("variableRate") Optional<String> variableRate,
            @JsonProperty("minPerTransaction") Optional<String> minPerTransaction,
            @JsonProperty("maxPerTransaction") Optional<String> maxPerTransaction) {
        Utils.checkNotNull(fixedAmount, "fixedAmount");
        Utils.checkNotNull(variableRate, "variableRate");
        Utils.checkNotNull(minPerTransaction, "minPerTransaction");
        Utils.checkNotNull(maxPerTransaction, "maxPerTransaction");
        this.fixedAmount = fixedAmount;
        this.variableRate = variableRate;
        this.minPerTransaction = minPerTransaction;
        this.maxPerTransaction = maxPerTransaction;
    }
    
    public FeeProperties() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * A fixed fee that is applied to the amount of each transaction in the `fixed` and `blended` fee models, expressed as a decimal.
     */
    @JsonIgnore
    public Optional<String> fixedAmount() {
        return fixedAmount;
    }

    /**
     * A percentage fee that is applied to the amount of each transaction in the `blended` fee model, expressed as a decimal.
     */
    @JsonIgnore
    public Optional<String> variableRate() {
        return variableRate;
    }

    /**
     * Specifies the minimum allowable spending for a single transaction, working as a transaction floor.
     */
    @JsonIgnore
    public Optional<String> minPerTransaction() {
        return minPerTransaction;
    }

    /**
     * Specifies the maximum allowable spending for a single transaction, working as a transaction ceiling.
     */
    @JsonIgnore
    public Optional<String> maxPerTransaction() {
        return maxPerTransaction;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A fixed fee that is applied to the amount of each transaction in the `fixed` and `blended` fee models, expressed as a decimal.
     */
    public FeeProperties withFixedAmount(String fixedAmount) {
        Utils.checkNotNull(fixedAmount, "fixedAmount");
        this.fixedAmount = Optional.ofNullable(fixedAmount);
        return this;
    }

    /**
     * A fixed fee that is applied to the amount of each transaction in the `fixed` and `blended` fee models, expressed as a decimal.
     */
    public FeeProperties withFixedAmount(Optional<String> fixedAmount) {
        Utils.checkNotNull(fixedAmount, "fixedAmount");
        this.fixedAmount = fixedAmount;
        return this;
    }

    /**
     * A percentage fee that is applied to the amount of each transaction in the `blended` fee model, expressed as a decimal.
     */
    public FeeProperties withVariableRate(String variableRate) {
        Utils.checkNotNull(variableRate, "variableRate");
        this.variableRate = Optional.ofNullable(variableRate);
        return this;
    }

    /**
     * A percentage fee that is applied to the amount of each transaction in the `blended` fee model, expressed as a decimal.
     */
    public FeeProperties withVariableRate(Optional<String> variableRate) {
        Utils.checkNotNull(variableRate, "variableRate");
        this.variableRate = variableRate;
        return this;
    }

    /**
     * Specifies the minimum allowable spending for a single transaction, working as a transaction floor.
     */
    public FeeProperties withMinPerTransaction(String minPerTransaction) {
        Utils.checkNotNull(minPerTransaction, "minPerTransaction");
        this.minPerTransaction = Optional.ofNullable(minPerTransaction);
        return this;
    }

    /**
     * Specifies the minimum allowable spending for a single transaction, working as a transaction floor.
     */
    public FeeProperties withMinPerTransaction(Optional<String> minPerTransaction) {
        Utils.checkNotNull(minPerTransaction, "minPerTransaction");
        this.minPerTransaction = minPerTransaction;
        return this;
    }

    /**
     * Specifies the maximum allowable spending for a single transaction, working as a transaction ceiling.
     */
    public FeeProperties withMaxPerTransaction(String maxPerTransaction) {
        Utils.checkNotNull(maxPerTransaction, "maxPerTransaction");
        this.maxPerTransaction = Optional.ofNullable(maxPerTransaction);
        return this;
    }

    /**
     * Specifies the maximum allowable spending for a single transaction, working as a transaction ceiling.
     */
    public FeeProperties withMaxPerTransaction(Optional<String> maxPerTransaction) {
        Utils.checkNotNull(maxPerTransaction, "maxPerTransaction");
        this.maxPerTransaction = maxPerTransaction;
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
        FeeProperties other = (FeeProperties) o;
        return 
            Objects.deepEquals(this.fixedAmount, other.fixedAmount) &&
            Objects.deepEquals(this.variableRate, other.variableRate) &&
            Objects.deepEquals(this.minPerTransaction, other.minPerTransaction) &&
            Objects.deepEquals(this.maxPerTransaction, other.maxPerTransaction);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            fixedAmount,
            variableRate,
            minPerTransaction,
            maxPerTransaction);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FeeProperties.class,
                "fixedAmount", fixedAmount,
                "variableRate", variableRate,
                "minPerTransaction", minPerTransaction,
                "maxPerTransaction", maxPerTransaction);
    }
    
    public final static class Builder {
 
        private Optional<String> fixedAmount = Optional.empty();
 
        private Optional<String> variableRate = Optional.empty();
 
        private Optional<String> minPerTransaction = Optional.empty();
 
        private Optional<String> maxPerTransaction = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A fixed fee that is applied to the amount of each transaction in the `fixed` and `blended` fee models, expressed as a decimal.
         */
        public Builder fixedAmount(String fixedAmount) {
            Utils.checkNotNull(fixedAmount, "fixedAmount");
            this.fixedAmount = Optional.ofNullable(fixedAmount);
            return this;
        }

        /**
         * A fixed fee that is applied to the amount of each transaction in the `fixed` and `blended` fee models, expressed as a decimal.
         */
        public Builder fixedAmount(Optional<String> fixedAmount) {
            Utils.checkNotNull(fixedAmount, "fixedAmount");
            this.fixedAmount = fixedAmount;
            return this;
        }

        /**
         * A percentage fee that is applied to the amount of each transaction in the `blended` fee model, expressed as a decimal.
         */
        public Builder variableRate(String variableRate) {
            Utils.checkNotNull(variableRate, "variableRate");
            this.variableRate = Optional.ofNullable(variableRate);
            return this;
        }

        /**
         * A percentage fee that is applied to the amount of each transaction in the `blended` fee model, expressed as a decimal.
         */
        public Builder variableRate(Optional<String> variableRate) {
            Utils.checkNotNull(variableRate, "variableRate");
            this.variableRate = variableRate;
            return this;
        }

        /**
         * Specifies the minimum allowable spending for a single transaction, working as a transaction floor.
         */
        public Builder minPerTransaction(String minPerTransaction) {
            Utils.checkNotNull(minPerTransaction, "minPerTransaction");
            this.minPerTransaction = Optional.ofNullable(minPerTransaction);
            return this;
        }

        /**
         * Specifies the minimum allowable spending for a single transaction, working as a transaction floor.
         */
        public Builder minPerTransaction(Optional<String> minPerTransaction) {
            Utils.checkNotNull(minPerTransaction, "minPerTransaction");
            this.minPerTransaction = minPerTransaction;
            return this;
        }

        /**
         * Specifies the maximum allowable spending for a single transaction, working as a transaction ceiling.
         */
        public Builder maxPerTransaction(String maxPerTransaction) {
            Utils.checkNotNull(maxPerTransaction, "maxPerTransaction");
            this.maxPerTransaction = Optional.ofNullable(maxPerTransaction);
            return this;
        }

        /**
         * Specifies the maximum allowable spending for a single transaction, working as a transaction ceiling.
         */
        public Builder maxPerTransaction(Optional<String> maxPerTransaction) {
            Utils.checkNotNull(maxPerTransaction, "maxPerTransaction");
            this.maxPerTransaction = maxPerTransaction;
            return this;
        }
        
        public FeeProperties build() {
            return new FeeProperties(
                fixedAmount,
                variableRate,
                minPerTransaction,
                maxPerTransaction);
        }
    }
}

