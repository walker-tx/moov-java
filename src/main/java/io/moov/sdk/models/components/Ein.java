/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.components;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class Ein {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("number")
    private Optional<String> number;

    @JsonCreator
    public Ein(
            @JsonProperty("number") Optional<String> number) {
        Utils.checkNotNull(number, "number");
        this.number = number;
    }
    
    public Ein() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<String> number() {
        return number;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Ein withNumber(String number) {
        Utils.checkNotNull(number, "number");
        this.number = Optional.ofNullable(number);
        return this;
    }

    public Ein withNumber(Optional<String> number) {
        Utils.checkNotNull(number, "number");
        this.number = number;
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
        Ein other = (Ein) o;
        return 
            Objects.deepEquals(this.number, other.number);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            number);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Ein.class,
                "number", number);
    }
    
    public final static class Builder {
 
        private Optional<String> number = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder number(String number) {
            Utils.checkNotNull(number, "number");
            this.number = Optional.ofNullable(number);
            return this;
        }

        public Builder number(Optional<String> number) {
            Utils.checkNotNull(number, "number");
            this.number = number;
            return this;
        }
        
        public Ein build() {
            return new Ein(
                number);
        }
    }
}

