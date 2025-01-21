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


public class GetSchedulesRequest {

    /**
     * Specify an API version.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-moov-version")
    private Optional<? extends Versions> xMoovVersion;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scheduleID")
    private String scheduleID;

    @JsonCreator
    public GetSchedulesRequest(
            Optional<? extends Versions> xMoovVersion,
            String accountID,
            String scheduleID) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(scheduleID, "scheduleID");
        this.xMoovVersion = xMoovVersion;
        this.accountID = accountID;
        this.scheduleID = scheduleID;
    }
    
    public GetSchedulesRequest(
            String accountID,
            String scheduleID) {
        this(Optional.empty(), accountID, scheduleID);
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
    public String scheduleID() {
        return scheduleID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Specify an API version.
     */
    public GetSchedulesRequest withXMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.ofNullable(xMoovVersion);
        return this;
    }

    /**
     * Specify an API version.
     */
    public GetSchedulesRequest withXMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetSchedulesRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetSchedulesRequest withScheduleID(String scheduleID) {
        Utils.checkNotNull(scheduleID, "scheduleID");
        this.scheduleID = scheduleID;
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
        GetSchedulesRequest other = (GetSchedulesRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.scheduleID, other.scheduleID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            accountID,
            scheduleID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSchedulesRequest.class,
                "xMoovVersion", xMoovVersion,
                "accountID", accountID,
                "scheduleID", scheduleID);
    }
    
    public final static class Builder {
 
        private Optional<? extends Versions> xMoovVersion = Optional.empty();
 
        private String accountID;
 
        private String scheduleID;  
        
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

        public Builder scheduleID(String scheduleID) {
            Utils.checkNotNull(scheduleID, "scheduleID");
            this.scheduleID = scheduleID;
            return this;
        }
        
        public GetSchedulesRequest build() {
            return new GetSchedulesRequest(
                xMoovVersion,
                accountID,
                scheduleID);
        }
    }
}

