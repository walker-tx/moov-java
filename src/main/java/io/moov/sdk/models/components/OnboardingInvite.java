/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.components;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OnboardingInvite {

    /**
     * A unique code that identifies an onboarding invite.
     */
    @JsonProperty("code")
    private String code;

    /**
     * A unique URL, including the invite code, that the recipient can follow to redeem the invitation.
     */
    @JsonProperty("link")
    private String link;

    /**
     * The scopes requested by the inviter.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("returnURL")
    private Optional<String> returnURL;

    /**
     * The terms of service URL set by the inviter.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("termsOfServiceURL")
    private Optional<String> termsOfServiceURL;

    /**
     * List of [scopes](https://docs.moov.io/api/authentication/scopes/) you request to use on this
     * account. These values are used to determine what can be done with the account onboarded.
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

    /**
     * The account ID of the account that redeemed the invite.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("redeemedAccountID")
    private Optional<String> redeemedAccountID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prefill")
    private Optional<? extends CreateAccount> prefill;

    /**
     * The account that created the onboarding invite.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("partner")
    private Optional<? extends OnboardingPartnerAccount> partner;

    @JsonProperty("createdOn")
    private OffsetDateTime createdOn;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("revokedOn")
    private Optional<OffsetDateTime> revokedOn;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("redeemedOn")
    private Optional<OffsetDateTime> redeemedOn;

    @JsonCreator
    public OnboardingInvite(
            @JsonProperty("code") String code,
            @JsonProperty("link") String link,
            @JsonProperty("returnURL") Optional<String> returnURL,
            @JsonProperty("termsOfServiceURL") Optional<String> termsOfServiceURL,
            @JsonProperty("scopes") List<ApplicationScope> scopes,
            @JsonProperty("capabilities") List<CapabilityID> capabilities,
            @JsonProperty("feePlanCodes") List<String> feePlanCodes,
            @JsonProperty("redeemedAccountID") Optional<String> redeemedAccountID,
            @JsonProperty("prefill") Optional<? extends CreateAccount> prefill,
            @JsonProperty("partner") Optional<? extends OnboardingPartnerAccount> partner,
            @JsonProperty("createdOn") OffsetDateTime createdOn,
            @JsonProperty("revokedOn") Optional<OffsetDateTime> revokedOn,
            @JsonProperty("redeemedOn") Optional<OffsetDateTime> redeemedOn) {
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(link, "link");
        Utils.checkNotNull(returnURL, "returnURL");
        Utils.checkNotNull(termsOfServiceURL, "termsOfServiceURL");
        Utils.checkNotNull(scopes, "scopes");
        Utils.checkNotNull(capabilities, "capabilities");
        Utils.checkNotNull(feePlanCodes, "feePlanCodes");
        Utils.checkNotNull(redeemedAccountID, "redeemedAccountID");
        Utils.checkNotNull(prefill, "prefill");
        Utils.checkNotNull(partner, "partner");
        Utils.checkNotNull(createdOn, "createdOn");
        Utils.checkNotNull(revokedOn, "revokedOn");
        Utils.checkNotNull(redeemedOn, "redeemedOn");
        this.code = code;
        this.link = link;
        this.returnURL = returnURL;
        this.termsOfServiceURL = termsOfServiceURL;
        this.scopes = scopes;
        this.capabilities = capabilities;
        this.feePlanCodes = feePlanCodes;
        this.redeemedAccountID = redeemedAccountID;
        this.prefill = prefill;
        this.partner = partner;
        this.createdOn = createdOn;
        this.revokedOn = revokedOn;
        this.redeemedOn = redeemedOn;
    }
    
    public OnboardingInvite(
            String code,
            String link,
            List<ApplicationScope> scopes,
            List<CapabilityID> capabilities,
            List<String> feePlanCodes,
            OffsetDateTime createdOn) {
        this(code, link, Optional.empty(), Optional.empty(), scopes, capabilities, feePlanCodes, Optional.empty(), Optional.empty(), Optional.empty(), createdOn, Optional.empty(), Optional.empty());
    }

    /**
     * A unique code that identifies an onboarding invite.
     */
    @JsonIgnore
    public String code() {
        return code;
    }

    /**
     * A unique URL, including the invite code, that the recipient can follow to redeem the invitation.
     */
    @JsonIgnore
    public String link() {
        return link;
    }

    /**
     * The scopes requested by the inviter.
     */
    @JsonIgnore
    public Optional<String> returnURL() {
        return returnURL;
    }

    /**
     * The terms of service URL set by the inviter.
     */
    @JsonIgnore
    public Optional<String> termsOfServiceURL() {
        return termsOfServiceURL;
    }

    /**
     * List of [scopes](https://docs.moov.io/api/authentication/scopes/) you request to use on this
     * account. These values are used to determine what can be done with the account onboarded.
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

    /**
     * The account ID of the account that redeemed the invite.
     */
    @JsonIgnore
    public Optional<String> redeemedAccountID() {
        return redeemedAccountID;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateAccount> prefill() {
        return (Optional<CreateAccount>) prefill;
    }

    /**
     * The account that created the onboarding invite.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OnboardingPartnerAccount> partner() {
        return (Optional<OnboardingPartnerAccount>) partner;
    }

    @JsonIgnore
    public OffsetDateTime createdOn() {
        return createdOn;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> revokedOn() {
        return revokedOn;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> redeemedOn() {
        return redeemedOn;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique code that identifies an onboarding invite.
     */
    public OnboardingInvite withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * A unique URL, including the invite code, that the recipient can follow to redeem the invitation.
     */
    public OnboardingInvite withLink(String link) {
        Utils.checkNotNull(link, "link");
        this.link = link;
        return this;
    }

    /**
     * The scopes requested by the inviter.
     */
    public OnboardingInvite withReturnURL(String returnURL) {
        Utils.checkNotNull(returnURL, "returnURL");
        this.returnURL = Optional.ofNullable(returnURL);
        return this;
    }

    /**
     * The scopes requested by the inviter.
     */
    public OnboardingInvite withReturnURL(Optional<String> returnURL) {
        Utils.checkNotNull(returnURL, "returnURL");
        this.returnURL = returnURL;
        return this;
    }

    /**
     * The terms of service URL set by the inviter.
     */
    public OnboardingInvite withTermsOfServiceURL(String termsOfServiceURL) {
        Utils.checkNotNull(termsOfServiceURL, "termsOfServiceURL");
        this.termsOfServiceURL = Optional.ofNullable(termsOfServiceURL);
        return this;
    }

    /**
     * The terms of service URL set by the inviter.
     */
    public OnboardingInvite withTermsOfServiceURL(Optional<String> termsOfServiceURL) {
        Utils.checkNotNull(termsOfServiceURL, "termsOfServiceURL");
        this.termsOfServiceURL = termsOfServiceURL;
        return this;
    }

    /**
     * List of [scopes](https://docs.moov.io/api/authentication/scopes/) you request to use on this
     * account. These values are used to determine what can be done with the account onboarded.
     */
    public OnboardingInvite withScopes(List<ApplicationScope> scopes) {
        Utils.checkNotNull(scopes, "scopes");
        this.scopes = scopes;
        return this;
    }

    /**
     *   List of [capabilities](https://docs.moov.io/guides/accounts/capabilities/) you intend to request for this
     *   account. These values are used to determine what information to collect from the user during onboarding.
     */
    public OnboardingInvite withCapabilities(List<CapabilityID> capabilities) {
        Utils.checkNotNull(capabilities, "capabilities");
        this.capabilities = capabilities;
        return this;
    }

    /**
     * List of fee plan codes to assign the account created by the invitee.
     */
    public OnboardingInvite withFeePlanCodes(List<String> feePlanCodes) {
        Utils.checkNotNull(feePlanCodes, "feePlanCodes");
        this.feePlanCodes = feePlanCodes;
        return this;
    }

    /**
     * The account ID of the account that redeemed the invite.
     */
    public OnboardingInvite withRedeemedAccountID(String redeemedAccountID) {
        Utils.checkNotNull(redeemedAccountID, "redeemedAccountID");
        this.redeemedAccountID = Optional.ofNullable(redeemedAccountID);
        return this;
    }

    /**
     * The account ID of the account that redeemed the invite.
     */
    public OnboardingInvite withRedeemedAccountID(Optional<String> redeemedAccountID) {
        Utils.checkNotNull(redeemedAccountID, "redeemedAccountID");
        this.redeemedAccountID = redeemedAccountID;
        return this;
    }

    public OnboardingInvite withPrefill(CreateAccount prefill) {
        Utils.checkNotNull(prefill, "prefill");
        this.prefill = Optional.ofNullable(prefill);
        return this;
    }

    public OnboardingInvite withPrefill(Optional<? extends CreateAccount> prefill) {
        Utils.checkNotNull(prefill, "prefill");
        this.prefill = prefill;
        return this;
    }

    /**
     * The account that created the onboarding invite.
     */
    public OnboardingInvite withPartner(OnboardingPartnerAccount partner) {
        Utils.checkNotNull(partner, "partner");
        this.partner = Optional.ofNullable(partner);
        return this;
    }

    /**
     * The account that created the onboarding invite.
     */
    public OnboardingInvite withPartner(Optional<? extends OnboardingPartnerAccount> partner) {
        Utils.checkNotNull(partner, "partner");
        this.partner = partner;
        return this;
    }

    public OnboardingInvite withCreatedOn(OffsetDateTime createdOn) {
        Utils.checkNotNull(createdOn, "createdOn");
        this.createdOn = createdOn;
        return this;
    }

    public OnboardingInvite withRevokedOn(OffsetDateTime revokedOn) {
        Utils.checkNotNull(revokedOn, "revokedOn");
        this.revokedOn = Optional.ofNullable(revokedOn);
        return this;
    }

    public OnboardingInvite withRevokedOn(Optional<OffsetDateTime> revokedOn) {
        Utils.checkNotNull(revokedOn, "revokedOn");
        this.revokedOn = revokedOn;
        return this;
    }

    public OnboardingInvite withRedeemedOn(OffsetDateTime redeemedOn) {
        Utils.checkNotNull(redeemedOn, "redeemedOn");
        this.redeemedOn = Optional.ofNullable(redeemedOn);
        return this;
    }

    public OnboardingInvite withRedeemedOn(Optional<OffsetDateTime> redeemedOn) {
        Utils.checkNotNull(redeemedOn, "redeemedOn");
        this.redeemedOn = redeemedOn;
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
        OnboardingInvite other = (OnboardingInvite) o;
        return 
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.link, other.link) &&
            Objects.deepEquals(this.returnURL, other.returnURL) &&
            Objects.deepEquals(this.termsOfServiceURL, other.termsOfServiceURL) &&
            Objects.deepEquals(this.scopes, other.scopes) &&
            Objects.deepEquals(this.capabilities, other.capabilities) &&
            Objects.deepEquals(this.feePlanCodes, other.feePlanCodes) &&
            Objects.deepEquals(this.redeemedAccountID, other.redeemedAccountID) &&
            Objects.deepEquals(this.prefill, other.prefill) &&
            Objects.deepEquals(this.partner, other.partner) &&
            Objects.deepEquals(this.createdOn, other.createdOn) &&
            Objects.deepEquals(this.revokedOn, other.revokedOn) &&
            Objects.deepEquals(this.redeemedOn, other.redeemedOn);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            code,
            link,
            returnURL,
            termsOfServiceURL,
            scopes,
            capabilities,
            feePlanCodes,
            redeemedAccountID,
            prefill,
            partner,
            createdOn,
            revokedOn,
            redeemedOn);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OnboardingInvite.class,
                "code", code,
                "link", link,
                "returnURL", returnURL,
                "termsOfServiceURL", termsOfServiceURL,
                "scopes", scopes,
                "capabilities", capabilities,
                "feePlanCodes", feePlanCodes,
                "redeemedAccountID", redeemedAccountID,
                "prefill", prefill,
                "partner", partner,
                "createdOn", createdOn,
                "revokedOn", revokedOn,
                "redeemedOn", redeemedOn);
    }
    
    public final static class Builder {
 
        private String code;
 
        private String link;
 
        private Optional<String> returnURL = Optional.empty();
 
        private Optional<String> termsOfServiceURL = Optional.empty();
 
        private List<ApplicationScope> scopes;
 
        private List<CapabilityID> capabilities;
 
        private List<String> feePlanCodes;
 
        private Optional<String> redeemedAccountID = Optional.empty();
 
        private Optional<? extends CreateAccount> prefill = Optional.empty();
 
        private Optional<? extends OnboardingPartnerAccount> partner = Optional.empty();
 
        private OffsetDateTime createdOn;
 
        private Optional<OffsetDateTime> revokedOn = Optional.empty();
 
        private Optional<OffsetDateTime> redeemedOn = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A unique code that identifies an onboarding invite.
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        /**
         * A unique URL, including the invite code, that the recipient can follow to redeem the invitation.
         */
        public Builder link(String link) {
            Utils.checkNotNull(link, "link");
            this.link = link;
            return this;
        }

        /**
         * The scopes requested by the inviter.
         */
        public Builder returnURL(String returnURL) {
            Utils.checkNotNull(returnURL, "returnURL");
            this.returnURL = Optional.ofNullable(returnURL);
            return this;
        }

        /**
         * The scopes requested by the inviter.
         */
        public Builder returnURL(Optional<String> returnURL) {
            Utils.checkNotNull(returnURL, "returnURL");
            this.returnURL = returnURL;
            return this;
        }

        /**
         * The terms of service URL set by the inviter.
         */
        public Builder termsOfServiceURL(String termsOfServiceURL) {
            Utils.checkNotNull(termsOfServiceURL, "termsOfServiceURL");
            this.termsOfServiceURL = Optional.ofNullable(termsOfServiceURL);
            return this;
        }

        /**
         * The terms of service URL set by the inviter.
         */
        public Builder termsOfServiceURL(Optional<String> termsOfServiceURL) {
            Utils.checkNotNull(termsOfServiceURL, "termsOfServiceURL");
            this.termsOfServiceURL = termsOfServiceURL;
            return this;
        }

        /**
         * List of [scopes](https://docs.moov.io/api/authentication/scopes/) you request to use on this
         * account. These values are used to determine what can be done with the account onboarded.
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

        /**
         * The account ID of the account that redeemed the invite.
         */
        public Builder redeemedAccountID(String redeemedAccountID) {
            Utils.checkNotNull(redeemedAccountID, "redeemedAccountID");
            this.redeemedAccountID = Optional.ofNullable(redeemedAccountID);
            return this;
        }

        /**
         * The account ID of the account that redeemed the invite.
         */
        public Builder redeemedAccountID(Optional<String> redeemedAccountID) {
            Utils.checkNotNull(redeemedAccountID, "redeemedAccountID");
            this.redeemedAccountID = redeemedAccountID;
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

        /**
         * The account that created the onboarding invite.
         */
        public Builder partner(OnboardingPartnerAccount partner) {
            Utils.checkNotNull(partner, "partner");
            this.partner = Optional.ofNullable(partner);
            return this;
        }

        /**
         * The account that created the onboarding invite.
         */
        public Builder partner(Optional<? extends OnboardingPartnerAccount> partner) {
            Utils.checkNotNull(partner, "partner");
            this.partner = partner;
            return this;
        }

        public Builder createdOn(OffsetDateTime createdOn) {
            Utils.checkNotNull(createdOn, "createdOn");
            this.createdOn = createdOn;
            return this;
        }

        public Builder revokedOn(OffsetDateTime revokedOn) {
            Utils.checkNotNull(revokedOn, "revokedOn");
            this.revokedOn = Optional.ofNullable(revokedOn);
            return this;
        }

        public Builder revokedOn(Optional<OffsetDateTime> revokedOn) {
            Utils.checkNotNull(revokedOn, "revokedOn");
            this.revokedOn = revokedOn;
            return this;
        }

        public Builder redeemedOn(OffsetDateTime redeemedOn) {
            Utils.checkNotNull(redeemedOn, "redeemedOn");
            this.redeemedOn = Optional.ofNullable(redeemedOn);
            return this;
        }

        public Builder redeemedOn(Optional<OffsetDateTime> redeemedOn) {
            Utils.checkNotNull(redeemedOn, "redeemedOn");
            this.redeemedOn = redeemedOn;
            return this;
        }
        
        public OnboardingInvite build() {
            return new OnboardingInvite(
                code,
                link,
                returnURL,
                termsOfServiceURL,
                scopes,
                capabilities,
                feePlanCodes,
                redeemedAccountID,
                prefill,
                partner,
                createdOn,
                revokedOn,
                redeemedOn);
        }
    }
}

