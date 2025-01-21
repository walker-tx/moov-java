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


public class CompletedMicroDeposits {

    @JsonProperty("status")
    private MicroDepositStatus status;

    @JsonCreator
    public CompletedMicroDeposits(
            @JsonProperty("status") MicroDepositStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
    }

    @JsonIgnore
    public MicroDepositStatus status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CompletedMicroDeposits withStatus(MicroDepositStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        CompletedMicroDeposits other = (CompletedMicroDeposits) o;
        return 
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CompletedMicroDeposits.class,
                "status", status);
    }
    
    public final static class Builder {
 
        private MicroDepositStatus status;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder status(MicroDepositStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public CompletedMicroDeposits build() {
            return new CompletedMicroDeposits(
                status);
        }
    }
}

