/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetRepresentativeRequest {

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

    /**
     * ID of the account.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    /**
     * ID of the representative.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=representativeID")
    private String representativeID;

    @JsonCreator
    public GetRepresentativeRequest(
            Optional<String> xMoovVersion,
            String accountID,
            String representativeID) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(representativeID, "representativeID");
        this.xMoovVersion = xMoovVersion;
        this.accountID = accountID;
        this.representativeID = representativeID;
    }
    
    public GetRepresentativeRequest(
            String accountID,
            String representativeID) {
        this(Optional.empty(), accountID, representativeID);
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

    /**
     * ID of the account.
     */
    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    /**
     * ID of the representative.
     */
    @JsonIgnore
    public String representativeID() {
        return representativeID;
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
    public GetRepresentativeRequest withXMoovVersion(String xMoovVersion) {
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
    public GetRepresentativeRequest withXMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    /**
     * ID of the account.
     */
    public GetRepresentativeRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    /**
     * ID of the representative.
     */
    public GetRepresentativeRequest withRepresentativeID(String representativeID) {
        Utils.checkNotNull(representativeID, "representativeID");
        this.representativeID = representativeID;
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
        GetRepresentativeRequest other = (GetRepresentativeRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.representativeID, other.representativeID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            accountID,
            representativeID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetRepresentativeRequest.class,
                "xMoovVersion", xMoovVersion,
                "accountID", accountID,
                "representativeID", representativeID);
    }
    
    public final static class Builder {
 
        private Optional<String> xMoovVersion;
 
        private String accountID;
 
        private String representativeID;  
        
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

        /**
         * ID of the account.
         */
        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        /**
         * ID of the representative.
         */
        public Builder representativeID(String representativeID) {
            Utils.checkNotNull(representativeID, "representativeID");
            this.representativeID = representativeID;
            return this;
        }
        
        public GetRepresentativeRequest build() {
            if (xMoovVersion == null) {
                xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
            }            return new GetRepresentativeRequest(
                xMoovVersion,
                accountID,
                representativeID);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
                new LazySingletonValue<>(
                        "x-moov-version",
                        "\"v2024.01\"",
                        new TypeReference<Optional<String>>() {});
    }
}

