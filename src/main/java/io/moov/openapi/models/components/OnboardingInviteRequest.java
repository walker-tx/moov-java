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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * OnboardingInviteRequest - Request to create an onboarding invite.
 */

public class OnboardingInviteRequest {

    /**
     * Optional URL to redirect the user to after they complete the onboarding process.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("returnURL")
    private Optional<String> returnURL;

    /**
     * Optional URL to your organization's terms of service.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("termsOfServiceURL")
    private Optional<String> termsOfServiceURL;

    /**
     *   List of [scopes](https://docs.moov.io/api/authentication/scopes/) you request to use on this
     *   account. These values are used to determine what can be done with the account onboarded.
     */
    @JsonProperty("scopes")
    private List<ApplicationScope> scopes;

    /**
     *   List of [capabilities](https://docs.moov.io/guides/accounts/capabilities/) you intend to request for this
     *   account. These values are used to determine what information to collect from the user during onboarding.
     */
    @JsonProperty("capabilities")
    private List<CapabilityID> capabilities;

    /**
     * List of fee plan codes to assign the account created by the invitee.
     */
    @JsonProperty("feePlanCodes")
    private List<String> feePlanCodes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prefill")
    private Optional<? extends CreateAccount> prefill;

    @JsonCreator
    public OnboardingInviteRequest(
            @JsonProperty("returnURL") Optional<String> returnURL,
            @JsonProperty("termsOfServiceURL") Optional<String> termsOfServiceURL,
            @JsonProperty("scopes") List<ApplicationScope> scopes,
            @JsonProperty("capabilities") List<CapabilityID> capabilities,
            @JsonProperty("feePlanCodes") List<String> feePlanCodes,
            @JsonProperty("prefill") Optional<? extends CreateAccount> prefill) {
        Utils.checkNotNull(returnURL, "returnURL");
        Utils.checkNotNull(termsOfServiceURL, "termsOfServiceURL");
        Utils.checkNotNull(scopes, "scopes");
        Utils.checkNotNull(capabilities, "capabilities");
        Utils.checkNotNull(feePlanCodes, "feePlanCodes");
        Utils.checkNotNull(prefill, "prefill");
        this.returnURL = returnURL;
        this.termsOfServiceURL = termsOfServiceURL;
        this.scopes = scopes;
        this.capabilities = capabilities;
        this.feePlanCodes = feePlanCodes;
        this.prefill = prefill;
    }
    
    public OnboardingInviteRequest(
            List<ApplicationScope> scopes,
            List<CapabilityID> capabilities,
            List<String> feePlanCodes) {
        this(Optional.empty(), Optional.empty(), scopes, capabilities, feePlanCodes, Optional.empty());
    }

    /**
     * Optional URL to redirect the user to after they complete the onboarding process.
     */
    @JsonIgnore
    public Optional<String> returnURL() {
        return returnURL;
    }

    /**
     * Optional URL to your organization's terms of service.
     */
    @JsonIgnore
    public Optional<String> termsOfServiceURL() {
        return termsOfServiceURL;
    }

    /**
     *   List of [scopes](https://docs.moov.io/api/authentication/scopes/) you request to use on this
     *   account. These values are used to determine what can be done with the account onboarded.
     */
    @JsonIgnore
    public List<ApplicationScope> scopes() {
        return scopes;
    }

    /**
     *   List of [capabilities](https://docs.moov.io/guides/accounts/capabilities/) you intend to request for this
     *   account. These values are used to determine what information to collect from the user during onboarding.
     */
    @JsonIgnore
    public List<CapabilityID> capabilities() {
        return capabilities;
    }

    /**
     * List of fee plan codes to assign the account created by the invitee.
     */
    @JsonIgnore
    public List<String> feePlanCodes() {
        return feePlanCodes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateAccount> prefill() {
        return (Optional<CreateAccount>) prefill;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Optional URL to redirect the user to after they complete the onboarding process.
     */
    public OnboardingInviteRequest withReturnURL(String returnURL) {
        Utils.checkNotNull(returnURL, "returnURL");
        this.returnURL = Optional.ofNullable(returnURL);
        return this;
    }

    /**
     * Optional URL to redirect the user to after they complete the onboarding process.
     */
    public OnboardingInviteRequest withReturnURL(Optional<String> returnURL) {
        Utils.checkNotNull(returnURL, "returnURL");
        this.returnURL = returnURL;
        return this;
    }

    /**
     * Optional URL to your organization's terms of service.
     */
    public OnboardingInviteRequest withTermsOfServiceURL(String termsOfServiceURL) {
        Utils.checkNotNull(termsOfServiceURL, "termsOfServiceURL");
        this.termsOfServiceURL = Optional.ofNullable(termsOfServiceURL);
        return this;
    }

    /**
     * Optional URL to your organization's terms of service.
     */
    public OnboardingInviteRequest withTermsOfServiceURL(Optional<String> termsOfServiceURL) {
        Utils.checkNotNull(termsOfServiceURL, "termsOfServiceURL");
        this.termsOfServiceURL = termsOfServiceURL;
        return this;
    }

    /**
     *   List of [scopes](https://docs.moov.io/api/authentication/scopes/) you request to use on this
     *   account. These values are used to determine what can be done with the account onboarded.
     */
    public OnboardingInviteRequest withScopes(List<ApplicationScope> scopes) {
        Utils.checkNotNull(scopes, "scopes");
        this.scopes = scopes;
        return this;
    }

    /**
     *   List of [capabilities](https://docs.moov.io/guides/accounts/capabilities/) you intend to request for this
     *   account. These values are used to determine what information to collect from the user during onboarding.
     */
    public OnboardingInviteRequest withCapabilities(List<CapabilityID> capabilities) {
        Utils.checkNotNull(capabilities, "capabilities");
        this.capabilities = capabilities;
        return this;
    }

    /**
     * List of fee plan codes to assign the account created by the invitee.
     */
    public OnboardingInviteRequest withFeePlanCodes(List<String> feePlanCodes) {
        Utils.checkNotNull(feePlanCodes, "feePlanCodes");
        this.feePlanCodes = feePlanCodes;
        return this;
    }

    public OnboardingInviteRequest withPrefill(CreateAccount prefill) {
        Utils.checkNotNull(prefill, "prefill");
        this.prefill = Optional.ofNullable(prefill);
        return this;
    }

    public OnboardingInviteRequest withPrefill(Optional<? extends CreateAccount> prefill) {
        Utils.checkNotNull(prefill, "prefill");
        this.prefill = prefill;
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
        OnboardingInviteRequest other = (OnboardingInviteRequest) o;
        return 
            Objects.deepEquals(this.returnURL, other.returnURL) &&
            Objects.deepEquals(this.termsOfServiceURL, other.termsOfServiceURL) &&
            Objects.deepEquals(this.scopes, other.scopes) &&
            Objects.deepEquals(this.capabilities, other.capabilities) &&
            Objects.deepEquals(this.feePlanCodes, other.feePlanCodes) &&
            Objects.deepEquals(this.prefill, other.prefill);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            returnURL,
            termsOfServiceURL,
            scopes,
            capabilities,
            feePlanCodes,
            prefill);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OnboardingInviteRequest.class,
                "returnURL", returnURL,
                "termsOfServiceURL", termsOfServiceURL,
                "scopes", scopes,
                "capabilities", capabilities,
                "feePlanCodes", feePlanCodes,
                "prefill", prefill);
    }
    
    public final static class Builder {
 
        private Optional<String> returnURL = Optional.empty();
 
        private Optional<String> termsOfServiceURL = Optional.empty();
 
        private List<ApplicationScope> scopes;
 
        private List<CapabilityID> capabilities;
 
        private List<String> feePlanCodes;
 
        private Optional<? extends CreateAccount> prefill = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Optional URL to redirect the user to after they complete the onboarding process.
         */
        public Builder returnURL(String returnURL) {
            Utils.checkNotNull(returnURL, "returnURL");
            this.returnURL = Optional.ofNullable(returnURL);
            return this;
        }

        /**
         * Optional URL to redirect the user to after they complete the onboarding process.
         */
        public Builder returnURL(Optional<String> returnURL) {
            Utils.checkNotNull(returnURL, "returnURL");
            this.returnURL = returnURL;
            return this;
        }

        /**
         * Optional URL to your organization's terms of service.
         */
        public Builder termsOfServiceURL(String termsOfServiceURL) {
            Utils.checkNotNull(termsOfServiceURL, "termsOfServiceURL");
            this.termsOfServiceURL = Optional.ofNullable(termsOfServiceURL);
            return this;
        }

        /**
         * Optional URL to your organization's terms of service.
         */
        public Builder termsOfServiceURL(Optional<String> termsOfServiceURL) {
            Utils.checkNotNull(termsOfServiceURL, "termsOfServiceURL");
            this.termsOfServiceURL = termsOfServiceURL;
            return this;
        }

        /**
         *   List of [scopes](https://docs.moov.io/api/authentication/scopes/) you request to use on this
         *   account. These values are used to determine what can be done with the account onboarded.
         */
        public Builder scopes(List<ApplicationScope> scopes) {
            Utils.checkNotNull(scopes, "scopes");
            this.scopes = scopes;
            return this;
        }

        /**
         *   List of [capabilities](https://docs.moov.io/guides/accounts/capabilities/) you intend to request for this
         *   account. These values are used to determine what information to collect from the user during onboarding.
         */
        public Builder capabilities(List<CapabilityID> capabilities) {
            Utils.checkNotNull(capabilities, "capabilities");
            this.capabilities = capabilities;
            return this;
        }

        /**
         * List of fee plan codes to assign the account created by the invitee.
         */
        public Builder feePlanCodes(List<String> feePlanCodes) {
            Utils.checkNotNull(feePlanCodes, "feePlanCodes");
            this.feePlanCodes = feePlanCodes;
            return this;
        }

        public Builder prefill(CreateAccount prefill) {
            Utils.checkNotNull(prefill, "prefill");
            this.prefill = Optional.ofNullable(prefill);
            return this;
        }

        public Builder prefill(Optional<? extends CreateAccount> prefill) {
            Utils.checkNotNull(prefill, "prefill");
            this.prefill = prefill;
            return this;
        }
        
        public OnboardingInviteRequest build() {
            return new OnboardingInviteRequest(
                returnURL,
                termsOfServiceURL,
                scopes,
                capabilities,
                feePlanCodes,
                prefill);
        }
    }
}

