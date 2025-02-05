/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.CreateEvidenceFileMultiPart;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class UploadDisputeEvidenceFileRequest {

    /**
     * Specify an API version.
     * 
     * API versioning follows the format `vYYYY.QQ.BB`, where 
     *   - `YYYY` is the year
     *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *   - `BB` is an **optional** build number starting at `.01` for subsequent builds in the same quarter. 
     *     - If no build number is specified, the version refers to the initial release of the quarter.
     * 
     * The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-moov-version")
    private Optional<String> xMoovVersion;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=disputeID")
    private String disputeID;

    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    private CreateEvidenceFileMultiPart createEvidenceFileMultiPart;

    @JsonCreator
    public UploadDisputeEvidenceFileRequest(
            Optional<String> xMoovVersion,
            String accountID,
            String disputeID,
            CreateEvidenceFileMultiPart createEvidenceFileMultiPart) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(disputeID, "disputeID");
        Utils.checkNotNull(createEvidenceFileMultiPart, "createEvidenceFileMultiPart");
        this.xMoovVersion = xMoovVersion;
        this.accountID = accountID;
        this.disputeID = disputeID;
        this.createEvidenceFileMultiPart = createEvidenceFileMultiPart;
    }
    
    public UploadDisputeEvidenceFileRequest(
            String accountID,
            String disputeID,
            CreateEvidenceFileMultiPart createEvidenceFileMultiPart) {
        this(Optional.empty(), accountID, disputeID, createEvidenceFileMultiPart);
    }

    /**
     * Specify an API version.
     * 
     * API versioning follows the format `vYYYY.QQ.BB`, where 
     *   - `YYYY` is the year
     *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *   - `BB` is an **optional** build number starting at `.01` for subsequent builds in the same quarter. 
     *     - If no build number is specified, the version refers to the initial release of the quarter.
     * 
     * The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     */
    @JsonIgnore
    public Optional<String> xMoovVersion() {
        return xMoovVersion;
    }

    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    @JsonIgnore
    public String disputeID() {
        return disputeID;
    }

    @JsonIgnore
    public CreateEvidenceFileMultiPart createEvidenceFileMultiPart() {
        return createEvidenceFileMultiPart;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Specify an API version.
     * 
     * API versioning follows the format `vYYYY.QQ.BB`, where 
     *   - `YYYY` is the year
     *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *   - `BB` is an **optional** build number starting at `.01` for subsequent builds in the same quarter. 
     *     - If no build number is specified, the version refers to the initial release of the quarter.
     * 
     * The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     */
    public UploadDisputeEvidenceFileRequest withXMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.ofNullable(xMoovVersion);
        return this;
    }

    /**
     * Specify an API version.
     * 
     * API versioning follows the format `vYYYY.QQ.BB`, where 
     *   - `YYYY` is the year
     *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *   - `BB` is an **optional** build number starting at `.01` for subsequent builds in the same quarter. 
     *     - If no build number is specified, the version refers to the initial release of the quarter.
     * 
     * The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     */
    public UploadDisputeEvidenceFileRequest withXMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public UploadDisputeEvidenceFileRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public UploadDisputeEvidenceFileRequest withDisputeID(String disputeID) {
        Utils.checkNotNull(disputeID, "disputeID");
        this.disputeID = disputeID;
        return this;
    }

    public UploadDisputeEvidenceFileRequest withCreateEvidenceFileMultiPart(CreateEvidenceFileMultiPart createEvidenceFileMultiPart) {
        Utils.checkNotNull(createEvidenceFileMultiPart, "createEvidenceFileMultiPart");
        this.createEvidenceFileMultiPart = createEvidenceFileMultiPart;
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
        UploadDisputeEvidenceFileRequest other = (UploadDisputeEvidenceFileRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.disputeID, other.disputeID) &&
            Objects.deepEquals(this.createEvidenceFileMultiPart, other.createEvidenceFileMultiPart);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            accountID,
            disputeID,
            createEvidenceFileMultiPart);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UploadDisputeEvidenceFileRequest.class,
                "xMoovVersion", xMoovVersion,
                "accountID", accountID,
                "disputeID", disputeID,
                "createEvidenceFileMultiPart", createEvidenceFileMultiPart);
    }
    
    public final static class Builder {
 
        private Optional<String> xMoovVersion;
 
        private String accountID;
 
        private String disputeID;
 
        private CreateEvidenceFileMultiPart createEvidenceFileMultiPart;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Specify an API version.
         * 
         * API versioning follows the format `vYYYY.QQ.BB`, where 
         *   - `YYYY` is the year
         *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
         *   - `BB` is an **optional** build number starting at `.01` for subsequent builds in the same quarter. 
         *     - If no build number is specified, the version refers to the initial release of the quarter.
         * 
         * The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
         */
        public Builder xMoovVersion(String xMoovVersion) {
            Utils.checkNotNull(xMoovVersion, "xMoovVersion");
            this.xMoovVersion = Optional.ofNullable(xMoovVersion);
            return this;
        }

        /**
         * Specify an API version.
         * 
         * API versioning follows the format `vYYYY.QQ.BB`, where 
         *   - `YYYY` is the year
         *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
         *   - `BB` is an **optional** build number starting at `.01` for subsequent builds in the same quarter. 
         *     - If no build number is specified, the version refers to the initial release of the quarter.
         * 
         * The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
         */
        public Builder xMoovVersion(Optional<String> xMoovVersion) {
            Utils.checkNotNull(xMoovVersion, "xMoovVersion");
            this.xMoovVersion = xMoovVersion;
            return this;
        }

        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        public Builder disputeID(String disputeID) {
            Utils.checkNotNull(disputeID, "disputeID");
            this.disputeID = disputeID;
            return this;
        }

        public Builder createEvidenceFileMultiPart(CreateEvidenceFileMultiPart createEvidenceFileMultiPart) {
            Utils.checkNotNull(createEvidenceFileMultiPart, "createEvidenceFileMultiPart");
            this.createEvidenceFileMultiPart = createEvidenceFileMultiPart;
            return this;
        }
        
        public UploadDisputeEvidenceFileRequest build() {
            if (xMoovVersion == null) {
                xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
            }            return new UploadDisputeEvidenceFileRequest(
                xMoovVersion,
                accountID,
                disputeID,
                createEvidenceFileMultiPart);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
                new LazySingletonValue<>(
                        "x-moov-version",
                        "\"v2024.01\"",
                        new TypeReference<Optional<String>>() {});
    }
}

