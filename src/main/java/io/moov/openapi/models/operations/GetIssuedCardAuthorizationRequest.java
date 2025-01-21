/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.utils.SpeakeasyMetadata;
import io.moov.openapi.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class GetIssuedCardAuthorizationRequest {

    /**
     * Specify an API version.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-moov-version")
    private Optional<? extends Versions> xMoovVersion;

    /**
     * The Moov business account for which cards have been issued.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=authorizationID")
    private String authorizationID;

    @JsonCreator
    public GetIssuedCardAuthorizationRequest(
            Optional<? extends Versions> xMoovVersion,
            String accountID,
            String authorizationID) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(authorizationID, "authorizationID");
        this.xMoovVersion = xMoovVersion;
        this.accountID = accountID;
        this.authorizationID = authorizationID;
    }
    
    public GetIssuedCardAuthorizationRequest(
            String accountID,
            String authorizationID) {
        this(Optional.empty(), accountID, authorizationID);
    }

    /**
     * Specify an API version.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Versions> xMoovVersion() {
        return (Optional<Versions>) xMoovVersion;
    }

    /**
     * The Moov business account for which cards have been issued.
     */
    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    @JsonIgnore
    public String authorizationID() {
        return authorizationID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Specify an API version.
     */
    public GetIssuedCardAuthorizationRequest withXMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.ofNullable(xMoovVersion);
        return this;
    }

    /**
     * Specify an API version.
     */
    public GetIssuedCardAuthorizationRequest withXMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    /**
     * The Moov business account for which cards have been issued.
     */
    public GetIssuedCardAuthorizationRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetIssuedCardAuthorizationRequest withAuthorizationID(String authorizationID) {
        Utils.checkNotNull(authorizationID, "authorizationID");
        this.authorizationID = authorizationID;
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
        GetIssuedCardAuthorizationRequest other = (GetIssuedCardAuthorizationRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.authorizationID, other.authorizationID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            accountID,
            authorizationID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetIssuedCardAuthorizationRequest.class,
                "xMoovVersion", xMoovVersion,
                "accountID", accountID,
                "authorizationID", authorizationID);
    }
    
    public final static class Builder {
 
        private Optional<? extends Versions> xMoovVersion = Optional.empty();
 
        private String accountID;
 
        private String authorizationID;  
        
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

        /**
         * The Moov business account for which cards have been issued.
         */
        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        public Builder authorizationID(String authorizationID) {
            Utils.checkNotNull(authorizationID, "authorizationID");
            this.authorizationID = authorizationID;
            return this;
        }
        
        public GetIssuedCardAuthorizationRequest build() {
            return new GetIssuedCardAuthorizationRequest(
                xMoovVersion,
                accountID,
                authorizationID);
        }
    }
}

