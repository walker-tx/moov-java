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
import java.util.Objects;


public class CompleteBankAccountVerification {

    /**
     * Code provided by user from their bank account transactions
     */
    @JsonProperty("code")
    private String code;

    @JsonCreator
    public CompleteBankAccountVerification(
            @JsonProperty("code") String code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
    }

    /**
     * Code provided by user from their bank account transactions
     */
    @JsonIgnore
    public String code() {
        return code;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Code provided by user from their bank account transactions
     */
    public CompleteBankAccountVerification withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
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
        CompleteBankAccountVerification other = (CompleteBankAccountVerification) o;
        return 
            Objects.deepEquals(this.code, other.code);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            code);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CompleteBankAccountVerification.class,
                "code", code);
    }
    
    public final static class Builder {
 
        private String code;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Code provided by user from their bank account transactions
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }
        
        public CompleteBankAccountVerification build() {
            return new CompleteBankAccountVerification(
                code);
        }
    }
}

