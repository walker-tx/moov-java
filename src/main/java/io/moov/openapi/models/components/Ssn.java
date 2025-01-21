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


public class Ssn {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("full")
    private Optional<String> full;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastFour")
    private Optional<String> lastFour;

    @JsonCreator
    public Ssn(
            @JsonProperty("full") Optional<String> full,
            @JsonProperty("lastFour") Optional<String> lastFour) {
        Utils.checkNotNull(full, "full");
        Utils.checkNotNull(lastFour, "lastFour");
        this.full = full;
        this.lastFour = lastFour;
    }
    
    public Ssn() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> full() {
        return full;
    }

    @JsonIgnore
    public Optional<String> lastFour() {
        return lastFour;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Ssn withFull(String full) {
        Utils.checkNotNull(full, "full");
        this.full = Optional.ofNullable(full);
        return this;
    }

    public Ssn withFull(Optional<String> full) {
        Utils.checkNotNull(full, "full");
        this.full = full;
        return this;
    }

    public Ssn withLastFour(String lastFour) {
        Utils.checkNotNull(lastFour, "lastFour");
        this.lastFour = Optional.ofNullable(lastFour);
        return this;
    }

    public Ssn withLastFour(Optional<String> lastFour) {
        Utils.checkNotNull(lastFour, "lastFour");
        this.lastFour = lastFour;
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
        Ssn other = (Ssn) o;
        return 
            Objects.deepEquals(this.full, other.full) &&
            Objects.deepEquals(this.lastFour, other.lastFour);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            full,
            lastFour);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Ssn.class,
                "full", full,
                "lastFour", lastFour);
    }
    
    public final static class Builder {
 
        private Optional<String> full = Optional.empty();
 
        private Optional<String> lastFour = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder full(String full) {
            Utils.checkNotNull(full, "full");
            this.full = Optional.ofNullable(full);
            return this;
        }

        public Builder full(Optional<String> full) {
            Utils.checkNotNull(full, "full");
            this.full = full;
            return this;
        }

        public Builder lastFour(String lastFour) {
            Utils.checkNotNull(lastFour, "lastFour");
            this.lastFour = Optional.ofNullable(lastFour);
            return this;
        }

        public Builder lastFour(Optional<String> lastFour) {
            Utils.checkNotNull(lastFour, "lastFour");
            this.lastFour = lastFour;
            return this;
        }
        
        public Ssn build() {
            return new Ssn(
                full,
                lastFour);
        }
    }
}

