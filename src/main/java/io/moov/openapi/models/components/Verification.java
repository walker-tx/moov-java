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
import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Verification - Describes identity verification status and relevant identity verification documents.
 */

public class Verification {

    /**
     * Possible states an account verification can be in.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("verificationStatus")
    @Deprecated
    private Optional<? extends AccountVerificationStatus> verificationStatus;

    /**
     * Possible states an account verification can be in.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonProperty("status")
    @Deprecated
    private VerificationStatus status;

    /**
     * Additional detail for a verification status.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    @Deprecated
    private Optional<? extends VerificationStatusDetail> details;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("documents")
    private Optional<? extends List<Document>> documents;

    @JsonCreator
    public Verification(
            @JsonProperty("verificationStatus") Optional<? extends AccountVerificationStatus> verificationStatus,
            @JsonProperty("status") VerificationStatus status,
            @JsonProperty("details") Optional<? extends VerificationStatusDetail> details,
            @JsonProperty("documents") Optional<? extends List<Document>> documents) {
        Utils.checkNotNull(verificationStatus, "verificationStatus");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(details, "details");
        Utils.checkNotNull(documents, "documents");
        this.verificationStatus = verificationStatus;
        this.status = status;
        this.details = details;
        this.documents = documents;
    }
    
    public Verification(
            VerificationStatus status) {
        this(Optional.empty(), status, Optional.empty(), Optional.empty());
    }

    /**
     * Possible states an account verification can be in.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountVerificationStatus> verificationStatus() {
        return (Optional<AccountVerificationStatus>) verificationStatus;
    }

    /**
     * Possible states an account verification can be in.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public VerificationStatus status() {
        return status;
    }

    /**
     * Additional detail for a verification status.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<VerificationStatusDetail> details() {
        return (Optional<VerificationStatusDetail>) details;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Document>> documents() {
        return (Optional<List<Document>>) documents;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Possible states an account verification can be in.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public Verification withVerificationStatus(AccountVerificationStatus verificationStatus) {
        Utils.checkNotNull(verificationStatus, "verificationStatus");
        this.verificationStatus = Optional.ofNullable(verificationStatus);
        return this;
    }

    /**
     * Possible states an account verification can be in.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public Verification withVerificationStatus(Optional<? extends AccountVerificationStatus> verificationStatus) {
        Utils.checkNotNull(verificationStatus, "verificationStatus");
        this.verificationStatus = verificationStatus;
        return this;
    }

    /**
     * Possible states an account verification can be in.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public Verification withStatus(VerificationStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Additional detail for a verification status.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public Verification withDetails(VerificationStatusDetail details) {
        Utils.checkNotNull(details, "details");
        this.details = Optional.ofNullable(details);
        return this;
    }

    /**
     * Additional detail for a verification status.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public Verification withDetails(Optional<? extends VerificationStatusDetail> details) {
        Utils.checkNotNull(details, "details");
        this.details = details;
        return this;
    }

    public Verification withDocuments(List<Document> documents) {
        Utils.checkNotNull(documents, "documents");
        this.documents = Optional.ofNullable(documents);
        return this;
    }

    public Verification withDocuments(Optional<? extends List<Document>> documents) {
        Utils.checkNotNull(documents, "documents");
        this.documents = documents;
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
        Verification other = (Verification) o;
        return 
            Objects.deepEquals(this.verificationStatus, other.verificationStatus) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.details, other.details) &&
            Objects.deepEquals(this.documents, other.documents);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            verificationStatus,
            status,
            details,
            documents);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Verification.class,
                "verificationStatus", verificationStatus,
                "status", status,
                "details", details,
                "documents", documents);
    }
    
    public final static class Builder {
 
        @Deprecated
        private Optional<? extends AccountVerificationStatus> verificationStatus = Optional.empty();
 
        @Deprecated
        private VerificationStatus status;
 
        @Deprecated
        private Optional<? extends VerificationStatusDetail> details = Optional.empty();
 
        private Optional<? extends List<Document>> documents = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Possible states an account verification can be in.
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder verificationStatus(AccountVerificationStatus verificationStatus) {
            Utils.checkNotNull(verificationStatus, "verificationStatus");
            this.verificationStatus = Optional.ofNullable(verificationStatus);
            return this;
        }

        /**
         * Possible states an account verification can be in.
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder verificationStatus(Optional<? extends AccountVerificationStatus> verificationStatus) {
            Utils.checkNotNull(verificationStatus, "verificationStatus");
            this.verificationStatus = verificationStatus;
            return this;
        }

        /**
         * Possible states an account verification can be in.
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder status(VerificationStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Additional detail for a verification status.
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder details(VerificationStatusDetail details) {
            Utils.checkNotNull(details, "details");
            this.details = Optional.ofNullable(details);
            return this;
        }

        /**
         * Additional detail for a verification status.
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder details(Optional<? extends VerificationStatusDetail> details) {
            Utils.checkNotNull(details, "details");
            this.details = details;
            return this;
        }

        public Builder documents(List<Document> documents) {
            Utils.checkNotNull(documents, "documents");
            this.documents = Optional.ofNullable(documents);
            return this;
        }

        public Builder documents(Optional<? extends List<Document>> documents) {
            Utils.checkNotNull(documents, "documents");
            this.documents = documents;
            return this;
        }
        
        public Verification build() {
            return new Verification(
                verificationStatus,
                status,
                details,
                documents);
        }
    }
}

