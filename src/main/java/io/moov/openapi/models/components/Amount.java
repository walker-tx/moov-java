/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.openapi.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class Amount {

    /**
     * A 3-letter ISO 4217 currency code.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Quantity in the smallest unit of the specified currency. 
     * 
     * In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    @JsonProperty("value")
    private long value;

    @JsonCreator
    public Amount(
            @JsonProperty("currency") String currency,
            @JsonProperty("value") long value) {
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(value, "value");
        this.currency = currency;
        this.value = value;
    }

    /**
     * A 3-letter ISO 4217 currency code.
     */
    @JsonIgnore
    public String currency() {
        return currency;
    }

    /**
     * Quantity in the smallest unit of the specified currency. 
     * 
     * In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    @JsonIgnore
    public long value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A 3-letter ISO 4217 currency code.
     */
    public Amount withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * Quantity in the smallest unit of the specified currency. 
     * 
     * In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    public Amount withValue(long value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        Amount other = (Amount) o;
        return 
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            currency,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Amount.class,
                "currency", currency,
                "value", value);
    }
    
    public final static class Builder {
 
        private String currency;
 
        private Long value;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A 3-letter ISO 4217 currency code.
         */
        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }

        /**
         * Quantity in the smallest unit of the specified currency. 
         * 
         * In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
         */
        public Builder value(long value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public Amount build() {
            return new Amount(
                currency,
                value);
        }
    }
}

