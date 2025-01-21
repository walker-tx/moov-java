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


public class GetScheduledOccurrenceRequest {

    /**
     * Specify an API version.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-moov-version")
    private Optional<? extends Versions> xMoovVersion;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scheduleID")
    private String scheduleID;

    /**
     * Allows the specification of additional filters beyond the UUID.
     * 
     * Specifying a UUID string returns the exact occurrence.
     * Specifying a RFC 3339 timestamp returns the latest occurrence at or before that timestamp.
     * Specifying `latest` returns the latest occurrence at or before now.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=occurrenceFilter")
    private String occurrenceFilter;

    @JsonCreator
    public GetScheduledOccurrenceRequest(
            Optional<? extends Versions> xMoovVersion,
            String accountID,
            String scheduleID,
            String occurrenceFilter) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(scheduleID, "scheduleID");
        Utils.checkNotNull(occurrenceFilter, "occurrenceFilter");
        this.xMoovVersion = xMoovVersion;
        this.accountID = accountID;
        this.scheduleID = scheduleID;
        this.occurrenceFilter = occurrenceFilter;
    }
    
    public GetScheduledOccurrenceRequest(
            String accountID,
            String scheduleID,
            String occurrenceFilter) {
        this(Optional.empty(), accountID, scheduleID, occurrenceFilter);
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

    /**
     * Allows the specification of additional filters beyond the UUID.
     * 
     * Specifying a UUID string returns the exact occurrence.
     * Specifying a RFC 3339 timestamp returns the latest occurrence at or before that timestamp.
     * Specifying `latest` returns the latest occurrence at or before now.
     */
    @JsonIgnore
    public String occurrenceFilter() {
        return occurrenceFilter;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Specify an API version.
     */
    public GetScheduledOccurrenceRequest withXMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.ofNullable(xMoovVersion);
        return this;
    }

    /**
     * Specify an API version.
     */
    public GetScheduledOccurrenceRequest withXMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetScheduledOccurrenceRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetScheduledOccurrenceRequest withScheduleID(String scheduleID) {
        Utils.checkNotNull(scheduleID, "scheduleID");
        this.scheduleID = scheduleID;
        return this;
    }

    /**
     * Allows the specification of additional filters beyond the UUID.
     * 
     * Specifying a UUID string returns the exact occurrence.
     * Specifying a RFC 3339 timestamp returns the latest occurrence at or before that timestamp.
     * Specifying `latest` returns the latest occurrence at or before now.
     */
    public GetScheduledOccurrenceRequest withOccurrenceFilter(String occurrenceFilter) {
        Utils.checkNotNull(occurrenceFilter, "occurrenceFilter");
        this.occurrenceFilter = occurrenceFilter;
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
        GetScheduledOccurrenceRequest other = (GetScheduledOccurrenceRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.scheduleID, other.scheduleID) &&
            Objects.deepEquals(this.occurrenceFilter, other.occurrenceFilter);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            accountID,
            scheduleID,
            occurrenceFilter);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetScheduledOccurrenceRequest.class,
                "xMoovVersion", xMoovVersion,
                "accountID", accountID,
                "scheduleID", scheduleID,
                "occurrenceFilter", occurrenceFilter);
    }
    
    public final static class Builder {
 
        private Optional<? extends Versions> xMoovVersion = Optional.empty();
 
        private String accountID;
 
        private String scheduleID;
 
        private String occurrenceFilter;  
        
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

        /**
         * Allows the specification of additional filters beyond the UUID.
         * 
         * Specifying a UUID string returns the exact occurrence.
         * Specifying a RFC 3339 timestamp returns the latest occurrence at or before that timestamp.
         * Specifying `latest` returns the latest occurrence at or before now.
         */
        public Builder occurrenceFilter(String occurrenceFilter) {
            Utils.checkNotNull(occurrenceFilter, "occurrenceFilter");
            this.occurrenceFilter = occurrenceFilter;
            return this;
        }
        
        public GetScheduledOccurrenceRequest build() {
            return new GetScheduledOccurrenceRequest(
                xMoovVersion,
                accountID,
                scheduleID,
                occurrenceFilter);
        }
    }
}

