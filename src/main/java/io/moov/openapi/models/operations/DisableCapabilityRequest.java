/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.openapi.models.components.CapabilityID;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.utils.SpeakeasyMetadata;
import io.moov.openapi.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class DisableCapabilityRequest {

    /**
     * Specify an API version.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-moov-version")
    private Optional<? extends Versions> xMoovVersion;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    /**
     * Moov account capabilities.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=capabilityID")
    private CapabilityID capabilityID;

    @JsonCreator
    public DisableCapabilityRequest(
            Optional<? extends Versions> xMoovVersion,
            String accountID,
            CapabilityID capabilityID) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(capabilityID, "capabilityID");
        this.xMoovVersion = xMoovVersion;
        this.accountID = accountID;
        this.capabilityID = capabilityID;
    }
    
    public DisableCapabilityRequest(
            String accountID,
            CapabilityID capabilityID) {
        this(Optional.empty(), accountID, capabilityID);
    }

    /**
     * Specify an API version.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Versions> xMoovVersion() {
        return (Optional<Versions>) xMoovVersion;
    }

    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    /**
     * Moov account capabilities.
     */
    @JsonIgnore
    public CapabilityID capabilityID() {
        return capabilityID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Specify an API version.
     */
    public DisableCapabilityRequest withXMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.ofNullable(xMoovVersion);
        return this;
    }

    /**
     * Specify an API version.
     */
    public DisableCapabilityRequest withXMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public DisableCapabilityRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    /**
     * Moov account capabilities.
     */
    public DisableCapabilityRequest withCapabilityID(CapabilityID capabilityID) {
        Utils.checkNotNull(capabilityID, "capabilityID");
        this.capabilityID = capabilityID;
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
        DisableCapabilityRequest other = (DisableCapabilityRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.capabilityID, other.capabilityID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            accountID,
            capabilityID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DisableCapabilityRequest.class,
                "xMoovVersion", xMoovVersion,
                "accountID", accountID,
                "capabilityID", capabilityID);
    }
    
    public final static class Builder {
 
        private Optional<? extends Versions> xMoovVersion = Optional.empty();
 
        private String accountID;
 
        private CapabilityID capabilityID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Specify an API version.
         */
        public Builder xMoovVersion(Versions xMoovVersion) {
            Utils.checkNotNull(xMoovVersion, "xMoovVersion");
            this.xMoovVersion = Optional.ofNullable(xMoovVersion);
            return this;
        }

        /**
         * Specify an API version.
         */
        public Builder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
            Utils.checkNotNull(xMoovVersion, "xMoovVersion");
            this.xMoovVersion = xMoovVersion;
            return this;
        }

        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        /**
         * Moov account capabilities.
         */
        public Builder capabilityID(CapabilityID capabilityID) {
            Utils.checkNotNull(capabilityID, "capabilityID");
            this.capabilityID = capabilityID;
            return this;
        }
        
        public DisableCapabilityRequest build() {
            return new DisableCapabilityRequest(
                xMoovVersion,
                accountID,
                capabilityID);
        }
    }
}

