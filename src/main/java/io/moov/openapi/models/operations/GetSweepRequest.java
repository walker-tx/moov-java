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


public class GetSweepRequest {

    /**
     * Specify an API version.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-moov-version")
    private Optional<? extends Versions> xMoovVersion;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=walletID")
    private String walletID;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sweepID")
    private String sweepID;

    @JsonCreator
    public GetSweepRequest(
            Optional<? extends Versions> xMoovVersion,
            String accountID,
            String walletID,
            String sweepID) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(walletID, "walletID");
        Utils.checkNotNull(sweepID, "sweepID");
        this.xMoovVersion = xMoovVersion;
        this.accountID = accountID;
        this.walletID = walletID;
        this.sweepID = sweepID;
    }
    
    public GetSweepRequest(
            String accountID,
            String walletID,
            String sweepID) {
        this(Optional.empty(), accountID, walletID, sweepID);
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

    @JsonIgnore
    public String walletID() {
        return walletID;
    }

    @JsonIgnore
    public String sweepID() {
        return sweepID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Specify an API version.
     */
    public GetSweepRequest withXMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.ofNullable(xMoovVersion);
        return this;
    }

    /**
     * Specify an API version.
     */
    public GetSweepRequest withXMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetSweepRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetSweepRequest withWalletID(String walletID) {
        Utils.checkNotNull(walletID, "walletID");
        this.walletID = walletID;
        return this;
    }

    public GetSweepRequest withSweepID(String sweepID) {
        Utils.checkNotNull(sweepID, "sweepID");
        this.sweepID = sweepID;
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
        GetSweepRequest other = (GetSweepRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.walletID, other.walletID) &&
            Objects.deepEquals(this.sweepID, other.sweepID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            accountID,
            walletID,
            sweepID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSweepRequest.class,
                "xMoovVersion", xMoovVersion,
                "accountID", accountID,
                "walletID", walletID,
                "sweepID", sweepID);
    }
    
    public final static class Builder {
 
        private Optional<? extends Versions> xMoovVersion = Optional.empty();
 
        private String accountID;
 
        private String walletID;
 
        private String sweepID;  
        
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

        public Builder walletID(String walletID) {
            Utils.checkNotNull(walletID, "walletID");
            this.walletID = walletID;
            return this;
        }

        public Builder sweepID(String sweepID) {
            Utils.checkNotNull(sweepID, "sweepID");
            this.sweepID = sweepID;
            return this;
        }
        
        public GetSweepRequest build() {
            return new GetSweepRequest(
                xMoovVersion,
                accountID,
                walletID,
                sweepID);
        }
    }
}

