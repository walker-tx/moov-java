/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.openapi.models.components.DisputeStatus;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.utils.SpeakeasyMetadata;
import io.moov.openapi.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class ListDisputesRequest {

    /**
     * Specify an API version.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-moov-version")
    private Optional<? extends Versions> xMoovVersion;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=skip")
    private Optional<Long> skip;

    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=count")
    private Optional<Long> count;

    /**
     * Optional date-time parameter to filter all disputes created on and after the provided date and time.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=startDateTime")
    private Optional<OffsetDateTime> startDateTime;

    /**
     * Optional date-time parameter to filter all disputes created on and before the provided date and time.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=endDateTime")
    private Optional<OffsetDateTime> endDateTime;

    /**
     * Optional date-time which exclusively filters all disputes with respond by before this date-time.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=respondStartDateTime")
    private Optional<OffsetDateTime> respondStartDateTime;

    /**
     * Optional date-time which exclusively filters all disputes with respond by before this date-time.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=respondEndDateTime")
    private Optional<OffsetDateTime> respondEndDateTime;

    /**
     * Optional dispute status by which to filter the disputes.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=status")
    private Optional<? extends DisputeStatus> status;

    /**
     * Optional parameter to filter by merchant account ID.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=merchantAccountID")
    private Optional<String> merchantAccountID;

    /**
     * Optional parameter to filter by cardholder account ID.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=cardholderAccountID")
    private Optional<String> cardholderAccountID;

    /**
     * Optional parameter to filter by a comma separated list of dispute IDs.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=disputeIDs")
    private Optional<? extends List<String>> disputeIDs;

    /**
     * Optional parameter to filter by a comma separated list of transfer IDs.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=transferIDs")
    private Optional<? extends List<String>> transferIDs;

    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=orderBy")
    private Optional<String> orderBy;

    @JsonCreator
    public ListDisputesRequest(
            Optional<? extends Versions> xMoovVersion,
            String accountID,
            Optional<Long> skip,
            Optional<Long> count,
            Optional<OffsetDateTime> startDateTime,
            Optional<OffsetDateTime> endDateTime,
            Optional<OffsetDateTime> respondStartDateTime,
            Optional<OffsetDateTime> respondEndDateTime,
            Optional<? extends DisputeStatus> status,
            Optional<String> merchantAccountID,
            Optional<String> cardholderAccountID,
            Optional<? extends List<String>> disputeIDs,
            Optional<? extends List<String>> transferIDs,
            Optional<String> orderBy) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(skip, "skip");
        Utils.checkNotNull(count, "count");
        Utils.checkNotNull(startDateTime, "startDateTime");
        Utils.checkNotNull(endDateTime, "endDateTime");
        Utils.checkNotNull(respondStartDateTime, "respondStartDateTime");
        Utils.checkNotNull(respondEndDateTime, "respondEndDateTime");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(merchantAccountID, "merchantAccountID");
        Utils.checkNotNull(cardholderAccountID, "cardholderAccountID");
        Utils.checkNotNull(disputeIDs, "disputeIDs");
        Utils.checkNotNull(transferIDs, "transferIDs");
        Utils.checkNotNull(orderBy, "orderBy");
        this.xMoovVersion = xMoovVersion;
        this.accountID = accountID;
        this.skip = skip;
        this.count = count;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.respondStartDateTime = respondStartDateTime;
        this.respondEndDateTime = respondEndDateTime;
        this.status = status;
        this.merchantAccountID = merchantAccountID;
        this.cardholderAccountID = cardholderAccountID;
        this.disputeIDs = disputeIDs;
        this.transferIDs = transferIDs;
        this.orderBy = orderBy;
    }
    
    public ListDisputesRequest(
            String accountID) {
        this(Optional.empty(), accountID, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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
    public Optional<Long> skip() {
        return skip;
    }

    @JsonIgnore
    public Optional<Long> count() {
        return count;
    }

    /**
     * Optional date-time parameter to filter all disputes created on and after the provided date and time.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> startDateTime() {
        return startDateTime;
    }

    /**
     * Optional date-time parameter to filter all disputes created on and before the provided date and time.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> endDateTime() {
        return endDateTime;
    }

    /**
     * Optional date-time which exclusively filters all disputes with respond by before this date-time.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> respondStartDateTime() {
        return respondStartDateTime;
    }

    /**
     * Optional date-time which exclusively filters all disputes with respond by before this date-time.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> respondEndDateTime() {
        return respondEndDateTime;
    }

    /**
     * Optional dispute status by which to filter the disputes.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DisputeStatus> status() {
        return (Optional<DisputeStatus>) status;
    }

    /**
     * Optional parameter to filter by merchant account ID.
     */
    @JsonIgnore
    public Optional<String> merchantAccountID() {
        return merchantAccountID;
    }

    /**
     * Optional parameter to filter by cardholder account ID.
     */
    @JsonIgnore
    public Optional<String> cardholderAccountID() {
        return cardholderAccountID;
    }

    /**
     * Optional parameter to filter by a comma separated list of dispute IDs.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> disputeIDs() {
        return (Optional<List<String>>) disputeIDs;
    }

    /**
     * Optional parameter to filter by a comma separated list of transfer IDs.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> transferIDs() {
        return (Optional<List<String>>) transferIDs;
    }

    @JsonIgnore
    public Optional<String> orderBy() {
        return orderBy;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Specify an API version.
     */
    public ListDisputesRequest withXMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.ofNullable(xMoovVersion);
        return this;
    }

    /**
     * Specify an API version.
     */
    public ListDisputesRequest withXMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public ListDisputesRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public ListDisputesRequest withSkip(long skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = Optional.ofNullable(skip);
        return this;
    }

    public ListDisputesRequest withSkip(Optional<Long> skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = skip;
        return this;
    }

    public ListDisputesRequest withCount(long count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.ofNullable(count);
        return this;
    }

    public ListDisputesRequest withCount(Optional<Long> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
        return this;
    }

    /**
     * Optional date-time parameter to filter all disputes created on and after the provided date and time.
     */
    public ListDisputesRequest withStartDateTime(OffsetDateTime startDateTime) {
        Utils.checkNotNull(startDateTime, "startDateTime");
        this.startDateTime = Optional.ofNullable(startDateTime);
        return this;
    }

    /**
     * Optional date-time parameter to filter all disputes created on and after the provided date and time.
     */
    public ListDisputesRequest withStartDateTime(Optional<OffsetDateTime> startDateTime) {
        Utils.checkNotNull(startDateTime, "startDateTime");
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Optional date-time parameter to filter all disputes created on and before the provided date and time.
     */
    public ListDisputesRequest withEndDateTime(OffsetDateTime endDateTime) {
        Utils.checkNotNull(endDateTime, "endDateTime");
        this.endDateTime = Optional.ofNullable(endDateTime);
        return this;
    }

    /**
     * Optional date-time parameter to filter all disputes created on and before the provided date and time.
     */
    public ListDisputesRequest withEndDateTime(Optional<OffsetDateTime> endDateTime) {
        Utils.checkNotNull(endDateTime, "endDateTime");
        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * Optional date-time which exclusively filters all disputes with respond by before this date-time.
     */
    public ListDisputesRequest withRespondStartDateTime(OffsetDateTime respondStartDateTime) {
        Utils.checkNotNull(respondStartDateTime, "respondStartDateTime");
        this.respondStartDateTime = Optional.ofNullable(respondStartDateTime);
        return this;
    }

    /**
     * Optional date-time which exclusively filters all disputes with respond by before this date-time.
     */
    public ListDisputesRequest withRespondStartDateTime(Optional<OffsetDateTime> respondStartDateTime) {
        Utils.checkNotNull(respondStartDateTime, "respondStartDateTime");
        this.respondStartDateTime = respondStartDateTime;
        return this;
    }

    /**
     * Optional date-time which exclusively filters all disputes with respond by before this date-time.
     */
    public ListDisputesRequest withRespondEndDateTime(OffsetDateTime respondEndDateTime) {
        Utils.checkNotNull(respondEndDateTime, "respondEndDateTime");
        this.respondEndDateTime = Optional.ofNullable(respondEndDateTime);
        return this;
    }

    /**
     * Optional date-time which exclusively filters all disputes with respond by before this date-time.
     */
    public ListDisputesRequest withRespondEndDateTime(Optional<OffsetDateTime> respondEndDateTime) {
        Utils.checkNotNull(respondEndDateTime, "respondEndDateTime");
        this.respondEndDateTime = respondEndDateTime;
        return this;
    }

    /**
     * Optional dispute status by which to filter the disputes.
     */
    public ListDisputesRequest withStatus(DisputeStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Optional dispute status by which to filter the disputes.
     */
    public ListDisputesRequest withStatus(Optional<? extends DisputeStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Optional parameter to filter by merchant account ID.
     */
    public ListDisputesRequest withMerchantAccountID(String merchantAccountID) {
        Utils.checkNotNull(merchantAccountID, "merchantAccountID");
        this.merchantAccountID = Optional.ofNullable(merchantAccountID);
        return this;
    }

    /**
     * Optional parameter to filter by merchant account ID.
     */
    public ListDisputesRequest withMerchantAccountID(Optional<String> merchantAccountID) {
        Utils.checkNotNull(merchantAccountID, "merchantAccountID");
        this.merchantAccountID = merchantAccountID;
        return this;
    }

    /**
     * Optional parameter to filter by cardholder account ID.
     */
    public ListDisputesRequest withCardholderAccountID(String cardholderAccountID) {
        Utils.checkNotNull(cardholderAccountID, "cardholderAccountID");
        this.cardholderAccountID = Optional.ofNullable(cardholderAccountID);
        return this;
    }

    /**
     * Optional parameter to filter by cardholder account ID.
     */
    public ListDisputesRequest withCardholderAccountID(Optional<String> cardholderAccountID) {
        Utils.checkNotNull(cardholderAccountID, "cardholderAccountID");
        this.cardholderAccountID = cardholderAccountID;
        return this;
    }

    /**
     * Optional parameter to filter by a comma separated list of dispute IDs.
     */
    public ListDisputesRequest withDisputeIDs(List<String> disputeIDs) {
        Utils.checkNotNull(disputeIDs, "disputeIDs");
        this.disputeIDs = Optional.ofNullable(disputeIDs);
        return this;
    }

    /**
     * Optional parameter to filter by a comma separated list of dispute IDs.
     */
    public ListDisputesRequest withDisputeIDs(Optional<? extends List<String>> disputeIDs) {
        Utils.checkNotNull(disputeIDs, "disputeIDs");
        this.disputeIDs = disputeIDs;
        return this;
    }

    /**
     * Optional parameter to filter by a comma separated list of transfer IDs.
     */
    public ListDisputesRequest withTransferIDs(List<String> transferIDs) {
        Utils.checkNotNull(transferIDs, "transferIDs");
        this.transferIDs = Optional.ofNullable(transferIDs);
        return this;
    }

    /**
     * Optional parameter to filter by a comma separated list of transfer IDs.
     */
    public ListDisputesRequest withTransferIDs(Optional<? extends List<String>> transferIDs) {
        Utils.checkNotNull(transferIDs, "transferIDs");
        this.transferIDs = transferIDs;
        return this;
    }

    public ListDisputesRequest withOrderBy(String orderBy) {
        Utils.checkNotNull(orderBy, "orderBy");
        this.orderBy = Optional.ofNullable(orderBy);
        return this;
    }

    public ListDisputesRequest withOrderBy(Optional<String> orderBy) {
        Utils.checkNotNull(orderBy, "orderBy");
        this.orderBy = orderBy;
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
        ListDisputesRequest other = (ListDisputesRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.skip, other.skip) &&
            Objects.deepEquals(this.count, other.count) &&
            Objects.deepEquals(this.startDateTime, other.startDateTime) &&
            Objects.deepEquals(this.endDateTime, other.endDateTime) &&
            Objects.deepEquals(this.respondStartDateTime, other.respondStartDateTime) &&
            Objects.deepEquals(this.respondEndDateTime, other.respondEndDateTime) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.merchantAccountID, other.merchantAccountID) &&
            Objects.deepEquals(this.cardholderAccountID, other.cardholderAccountID) &&
            Objects.deepEquals(this.disputeIDs, other.disputeIDs) &&
            Objects.deepEquals(this.transferIDs, other.transferIDs) &&
            Objects.deepEquals(this.orderBy, other.orderBy);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            accountID,
            skip,
            count,
            startDateTime,
            endDateTime,
            respondStartDateTime,
            respondEndDateTime,
            status,
            merchantAccountID,
            cardholderAccountID,
            disputeIDs,
            transferIDs,
            orderBy);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListDisputesRequest.class,
                "xMoovVersion", xMoovVersion,
                "accountID", accountID,
                "skip", skip,
                "count", count,
                "startDateTime", startDateTime,
                "endDateTime", endDateTime,
                "respondStartDateTime", respondStartDateTime,
                "respondEndDateTime", respondEndDateTime,
                "status", status,
                "merchantAccountID", merchantAccountID,
                "cardholderAccountID", cardholderAccountID,
                "disputeIDs", disputeIDs,
                "transferIDs", transferIDs,
                "orderBy", orderBy);
    }
    
    public final static class Builder {
 
        private Optional<? extends Versions> xMoovVersion = Optional.empty();
 
        private String accountID;
 
        private Optional<Long> skip = Optional.empty();
 
        private Optional<Long> count = Optional.empty();
 
        private Optional<OffsetDateTime> startDateTime = Optional.empty();
 
        private Optional<OffsetDateTime> endDateTime = Optional.empty();
 
        private Optional<OffsetDateTime> respondStartDateTime = Optional.empty();
 
        private Optional<OffsetDateTime> respondEndDateTime = Optional.empty();
 
        private Optional<? extends DisputeStatus> status = Optional.empty();
 
        private Optional<String> merchantAccountID = Optional.empty();
 
        private Optional<String> cardholderAccountID = Optional.empty();
 
        private Optional<? extends List<String>> disputeIDs = Optional.empty();
 
        private Optional<? extends List<String>> transferIDs = Optional.empty();
 
        private Optional<String> orderBy = Optional.empty();  
        
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

        public Builder skip(long skip) {
            Utils.checkNotNull(skip, "skip");
            this.skip = Optional.ofNullable(skip);
            return this;
        }

        public Builder skip(Optional<Long> skip) {
            Utils.checkNotNull(skip, "skip");
            this.skip = skip;
            return this;
        }

        public Builder count(long count) {
            Utils.checkNotNull(count, "count");
            this.count = Optional.ofNullable(count);
            return this;
        }

        public Builder count(Optional<Long> count) {
            Utils.checkNotNull(count, "count");
            this.count = count;
            return this;
        }

        /**
         * Optional date-time parameter to filter all disputes created on and after the provided date and time.
         */
        public Builder startDateTime(OffsetDateTime startDateTime) {
            Utils.checkNotNull(startDateTime, "startDateTime");
            this.startDateTime = Optional.ofNullable(startDateTime);
            return this;
        }

        /**
         * Optional date-time parameter to filter all disputes created on and after the provided date and time.
         */
        public Builder startDateTime(Optional<OffsetDateTime> startDateTime) {
            Utils.checkNotNull(startDateTime, "startDateTime");
            this.startDateTime = startDateTime;
            return this;
        }

        /**
         * Optional date-time parameter to filter all disputes created on and before the provided date and time.
         */
        public Builder endDateTime(OffsetDateTime endDateTime) {
            Utils.checkNotNull(endDateTime, "endDateTime");
            this.endDateTime = Optional.ofNullable(endDateTime);
            return this;
        }

        /**
         * Optional date-time parameter to filter all disputes created on and before the provided date and time.
         */
        public Builder endDateTime(Optional<OffsetDateTime> endDateTime) {
            Utils.checkNotNull(endDateTime, "endDateTime");
            this.endDateTime = endDateTime;
            return this;
        }

        /**
         * Optional date-time which exclusively filters all disputes with respond by before this date-time.
         */
        public Builder respondStartDateTime(OffsetDateTime respondStartDateTime) {
            Utils.checkNotNull(respondStartDateTime, "respondStartDateTime");
            this.respondStartDateTime = Optional.ofNullable(respondStartDateTime);
            return this;
        }

        /**
         * Optional date-time which exclusively filters all disputes with respond by before this date-time.
         */
        public Builder respondStartDateTime(Optional<OffsetDateTime> respondStartDateTime) {
            Utils.checkNotNull(respondStartDateTime, "respondStartDateTime");
            this.respondStartDateTime = respondStartDateTime;
            return this;
        }

        /**
         * Optional date-time which exclusively filters all disputes with respond by before this date-time.
         */
        public Builder respondEndDateTime(OffsetDateTime respondEndDateTime) {
            Utils.checkNotNull(respondEndDateTime, "respondEndDateTime");
            this.respondEndDateTime = Optional.ofNullable(respondEndDateTime);
            return this;
        }

        /**
         * Optional date-time which exclusively filters all disputes with respond by before this date-time.
         */
        public Builder respondEndDateTime(Optional<OffsetDateTime> respondEndDateTime) {
            Utils.checkNotNull(respondEndDateTime, "respondEndDateTime");
            this.respondEndDateTime = respondEndDateTime;
            return this;
        }

        /**
         * Optional dispute status by which to filter the disputes.
         */
        public Builder status(DisputeStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Optional dispute status by which to filter the disputes.
         */
        public Builder status(Optional<? extends DisputeStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Optional parameter to filter by merchant account ID.
         */
        public Builder merchantAccountID(String merchantAccountID) {
            Utils.checkNotNull(merchantAccountID, "merchantAccountID");
            this.merchantAccountID = Optional.ofNullable(merchantAccountID);
            return this;
        }

        /**
         * Optional parameter to filter by merchant account ID.
         */
        public Builder merchantAccountID(Optional<String> merchantAccountID) {
            Utils.checkNotNull(merchantAccountID, "merchantAccountID");
            this.merchantAccountID = merchantAccountID;
            return this;
        }

        /**
         * Optional parameter to filter by cardholder account ID.
         */
        public Builder cardholderAccountID(String cardholderAccountID) {
            Utils.checkNotNull(cardholderAccountID, "cardholderAccountID");
            this.cardholderAccountID = Optional.ofNullable(cardholderAccountID);
            return this;
        }

        /**
         * Optional parameter to filter by cardholder account ID.
         */
        public Builder cardholderAccountID(Optional<String> cardholderAccountID) {
            Utils.checkNotNull(cardholderAccountID, "cardholderAccountID");
            this.cardholderAccountID = cardholderAccountID;
            return this;
        }

        /**
         * Optional parameter to filter by a comma separated list of dispute IDs.
         */
        public Builder disputeIDs(List<String> disputeIDs) {
            Utils.checkNotNull(disputeIDs, "disputeIDs");
            this.disputeIDs = Optional.ofNullable(disputeIDs);
            return this;
        }

        /**
         * Optional parameter to filter by a comma separated list of dispute IDs.
         */
        public Builder disputeIDs(Optional<? extends List<String>> disputeIDs) {
            Utils.checkNotNull(disputeIDs, "disputeIDs");
            this.disputeIDs = disputeIDs;
            return this;
        }

        /**
         * Optional parameter to filter by a comma separated list of transfer IDs.
         */
        public Builder transferIDs(List<String> transferIDs) {
            Utils.checkNotNull(transferIDs, "transferIDs");
            this.transferIDs = Optional.ofNullable(transferIDs);
            return this;
        }

        /**
         * Optional parameter to filter by a comma separated list of transfer IDs.
         */
        public Builder transferIDs(Optional<? extends List<String>> transferIDs) {
            Utils.checkNotNull(transferIDs, "transferIDs");
            this.transferIDs = transferIDs;
            return this;
        }

        public Builder orderBy(String orderBy) {
            Utils.checkNotNull(orderBy, "orderBy");
            this.orderBy = Optional.ofNullable(orderBy);
            return this;
        }

        public Builder orderBy(Optional<String> orderBy) {
            Utils.checkNotNull(orderBy, "orderBy");
            this.orderBy = orderBy;
            return this;
        }
        
        public ListDisputesRequest build() {
            return new ListDisputesRequest(
                xMoovVersion,
                accountID,
                skip,
                count,
                startDateTime,
                endDateTime,
                respondStartDateTime,
                respondEndDateTime,
                status,
                merchantAccountID,
                cardholderAccountID,
                disputeIDs,
                transferIDs,
                orderBy);
        }
    }
}

