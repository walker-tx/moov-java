/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.openapi.models.components.CapabilitiesError;
import io.moov.openapi.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

@SuppressWarnings("serial")
public class AddCapabilitiesError extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<? extends CapabilitiesError> error;

    @JsonCreator
    public AddCapabilitiesError(
            @JsonProperty("error") Optional<? extends CapabilitiesError> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
    }
    
    public AddCapabilitiesError() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    public Optional<CapabilitiesError> error(){
        return (Optional<CapabilitiesError>) error;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public AddCapabilitiesError withError(CapabilitiesError error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }
    
    public AddCapabilitiesError withError(Optional<? extends CapabilitiesError> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
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
        AddCapabilitiesError other = (AddCapabilitiesError) o;
        return
            Objects.deepEquals(this.error, other.error);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            error);
    }

    @Override
    public String toString() {
        return Utils.toString(AddCapabilitiesError.class,
                "error", error);
    }

    public final static class Builder {

        private Optional<? extends CapabilitiesError> error = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }

        public Builder error(CapabilitiesError error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }
        
        public Builder error(Optional<? extends CapabilitiesError> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        public AddCapabilitiesError build() {
            return new AddCapabilitiesError(
                error);
        }
    }
}
