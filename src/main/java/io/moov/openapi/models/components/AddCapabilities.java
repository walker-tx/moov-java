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
import java.util.List;
import java.util.Objects;


public class AddCapabilities {

    @JsonProperty("capabilities")
    private List<CapabilityID> capabilities;

    @JsonCreator
    public AddCapabilities(
            @JsonProperty("capabilities") List<CapabilityID> capabilities) {
        Utils.checkNotNull(capabilities, "capabilities");
        this.capabilities = capabilities;
    }

    @JsonIgnore
    public List<CapabilityID> capabilities() {
        return capabilities;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AddCapabilities withCapabilities(List<CapabilityID> capabilities) {
        Utils.checkNotNull(capabilities, "capabilities");
        this.capabilities = capabilities;
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
        AddCapabilities other = (AddCapabilities) o;
        return 
            Objects.deepEquals(this.capabilities, other.capabilities);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            capabilities);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AddCapabilities.class,
                "capabilities", capabilities);
    }
    
    public final static class Builder {
 
        private List<CapabilityID> capabilities;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder capabilities(List<CapabilityID> capabilities) {
            Utils.checkNotNull(capabilities, "capabilities");
            this.capabilities = capabilities;
            return this;
        }
        
        public AddCapabilities build() {
            return new AddCapabilities(
                capabilities);
        }
    }
}

