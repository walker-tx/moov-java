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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class ListFeePlansRequest {

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

    /**
     * A comma-separated list of plan IDs to filter the results by.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=planIDs")
    private Optional<? extends List<String>> planIDs;

    @JsonCreator
    public ListFeePlansRequest(
            Optional<String> xMoovVersion,
            String accountID,
            Optional<? extends List<String>> planIDs) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(planIDs, "planIDs");
        this.xMoovVersion = xMoovVersion;
        this.accountID = accountID;
        this.planIDs = planIDs;
    }
    
    public ListFeePlansRequest(
            String accountID) {
        this(Optional.empty(), accountID, Optional.empty());
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

    /**
     * A comma-separated list of plan IDs to filter the results by.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> planIDs() {
        return (Optional<List<String>>) planIDs;
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
    public ListFeePlansRequest withXMoovVersion(String xMoovVersion) {
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
    public ListFeePlansRequest withXMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public ListFeePlansRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    /**
     * A comma-separated list of plan IDs to filter the results by.
     */
    public ListFeePlansRequest withPlanIDs(List<String> planIDs) {
        Utils.checkNotNull(planIDs, "planIDs");
        this.planIDs = Optional.ofNullable(planIDs);
        return this;
    }

    /**
     * A comma-separated list of plan IDs to filter the results by.
     */
    public ListFeePlansRequest withPlanIDs(Optional<? extends List<String>> planIDs) {
        Utils.checkNotNull(planIDs, "planIDs");
        this.planIDs = planIDs;
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
        ListFeePlansRequest other = (ListFeePlansRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.planIDs, other.planIDs);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            accountID,
            planIDs);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListFeePlansRequest.class,
                "xMoovVersion", xMoovVersion,
                "accountID", accountID,
                "planIDs", planIDs);
    }
    
    public final static class Builder {
 
        private Optional<String> xMoovVersion;
 
        private String accountID;
 
        private Optional<? extends List<String>> planIDs = Optional.empty();  
        
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

        /**
         * A comma-separated list of plan IDs to filter the results by.
         */
        public Builder planIDs(List<String> planIDs) {
            Utils.checkNotNull(planIDs, "planIDs");
            this.planIDs = Optional.ofNullable(planIDs);
            return this;
        }

        /**
         * A comma-separated list of plan IDs to filter the results by.
         */
        public Builder planIDs(Optional<? extends List<String>> planIDs) {
            Utils.checkNotNull(planIDs, "planIDs");
            this.planIDs = planIDs;
            return this;
        }
        
        public ListFeePlansRequest build() {
            if (xMoovVersion == null) {
                xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
            }            return new ListFeePlansRequest(
                xMoovVersion,
                accountID,
                planIDs);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
                new LazySingletonValue<>(
                        "x-moov-version",
                        "\"v2024.01\"",
                        new TypeReference<Optional<String>>() {});
    }
}

