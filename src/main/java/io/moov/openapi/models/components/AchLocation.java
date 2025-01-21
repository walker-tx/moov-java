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


public class AchLocation {

    @JsonProperty("address")
    private String address;

    @JsonProperty("city")
    private String city;

    @JsonProperty("postalCode")
    private String postalCode;

    @JsonProperty("postalCodeExtension")
    private String postalCodeExtension;

    @JsonProperty("state")
    private String state;

    @JsonCreator
    public AchLocation(
            @JsonProperty("address") String address,
            @JsonProperty("city") String city,
            @JsonProperty("postalCode") String postalCode,
            @JsonProperty("postalCodeExtension") String postalCodeExtension,
            @JsonProperty("state") String state) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(postalCode, "postalCode");
        Utils.checkNotNull(postalCodeExtension, "postalCodeExtension");
        Utils.checkNotNull(state, "state");
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.postalCodeExtension = postalCodeExtension;
        this.state = state;
    }

    @JsonIgnore
    public String address() {
        return address;
    }

    @JsonIgnore
    public String city() {
        return city;
    }

    @JsonIgnore
    public String postalCode() {
        return postalCode;
    }

    @JsonIgnore
    public String postalCodeExtension() {
        return postalCodeExtension;
    }

    @JsonIgnore
    public String state() {
        return state;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AchLocation withAddress(String address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public AchLocation withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    public AchLocation withPostalCode(String postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = postalCode;
        return this;
    }

    public AchLocation withPostalCodeExtension(String postalCodeExtension) {
        Utils.checkNotNull(postalCodeExtension, "postalCodeExtension");
        this.postalCodeExtension = postalCodeExtension;
        return this;
    }

    public AchLocation withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
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
        AchLocation other = (AchLocation) o;
        return 
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.city, other.city) &&
            Objects.deepEquals(this.postalCode, other.postalCode) &&
            Objects.deepEquals(this.postalCodeExtension, other.postalCodeExtension) &&
            Objects.deepEquals(this.state, other.state);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            address,
            city,
            postalCode,
            postalCodeExtension,
            state);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AchLocation.class,
                "address", address,
                "city", city,
                "postalCode", postalCode,
                "postalCodeExtension", postalCodeExtension,
                "state", state);
    }
    
    public final static class Builder {
 
        private String address;
 
        private String city;
 
        private String postalCode;
 
        private String postalCodeExtension;
 
        private String state;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder address(String address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        public Builder city(String city) {
            Utils.checkNotNull(city, "city");
            this.city = city;
            return this;
        }

        public Builder postalCode(String postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = postalCode;
            return this;
        }

        public Builder postalCodeExtension(String postalCodeExtension) {
            Utils.checkNotNull(postalCodeExtension, "postalCodeExtension");
            this.postalCodeExtension = postalCodeExtension;
            return this;
        }

        public Builder state(String state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }
        
        public AchLocation build() {
            return new AchLocation(
                address,
                city,
                postalCode,
                postalCodeExtension,
                state);
        }
    }
}

