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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class CreateAccountError {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountType")
    private Optional<String> accountType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profile")
    private Optional<? extends CreateProfileError> profile;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<String> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("termsOfService")
    private Optional<? extends TermsOfServiceError> termsOfService;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("foreignID")
    private Optional<String> foreignID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customerSupport")
    private Optional<? extends CustomerSupportError> customerSupport;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("settings")
    private Optional<? extends CreateAccountSettings> settings;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("capabilities")
    private Optional<? extends Map<String, String>> capabilities;

    @JsonCreator
    public CreateAccountError(
            @JsonProperty("accountType") Optional<String> accountType,
            @JsonProperty("profile") Optional<? extends CreateProfileError> profile,
            @JsonProperty("metadata") Optional<String> metadata,
            @JsonProperty("termsOfService") Optional<? extends TermsOfServiceError> termsOfService,
            @JsonProperty("foreignID") Optional<String> foreignID,
            @JsonProperty("customerSupport") Optional<? extends CustomerSupportError> customerSupport,
            @JsonProperty("settings") Optional<? extends CreateAccountSettings> settings,
            @JsonProperty("capabilities") Optional<? extends Map<String, String>> capabilities) {
        Utils.checkNotNull(accountType, "accountType");
        Utils.checkNotNull(profile, "profile");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(termsOfService, "termsOfService");
        Utils.checkNotNull(foreignID, "foreignID");
        Utils.checkNotNull(customerSupport, "customerSupport");
        Utils.checkNotNull(settings, "settings");
        Utils.checkNotNull(capabilities, "capabilities");
        this.accountType = accountType;
        this.profile = profile;
        this.metadata = metadata;
        this.termsOfService = termsOfService;
        this.foreignID = foreignID;
        this.customerSupport = customerSupport;
        this.settings = settings;
        this.capabilities = capabilities;
    }
    
    public CreateAccountError() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> accountType() {
        return accountType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateProfileError> profile() {
        return (Optional<CreateProfileError>) profile;
    }

    @JsonIgnore
    public Optional<String> metadata() {
        return metadata;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TermsOfServiceError> termsOfService() {
        return (Optional<TermsOfServiceError>) termsOfService;
    }

    @JsonIgnore
    public Optional<String> foreignID() {
        return foreignID;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CustomerSupportError> customerSupport() {
        return (Optional<CustomerSupportError>) customerSupport;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateAccountSettings> settings() {
        return (Optional<CreateAccountSettings>) settings;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, String>> capabilities() {
        return (Optional<Map<String, String>>) capabilities;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateAccountError withAccountType(String accountType) {
        Utils.checkNotNull(accountType, "accountType");
        this.accountType = Optional.ofNullable(accountType);
        return this;
    }

    public CreateAccountError withAccountType(Optional<String> accountType) {
        Utils.checkNotNull(accountType, "accountType");
        this.accountType = accountType;
        return this;
    }

    public CreateAccountError withProfile(CreateProfileError profile) {
        Utils.checkNotNull(profile, "profile");
        this.profile = Optional.ofNullable(profile);
        return this;
    }

    public CreateAccountError withProfile(Optional<? extends CreateProfileError> profile) {
        Utils.checkNotNull(profile, "profile");
        this.profile = profile;
        return this;
    }

    public CreateAccountError withMetadata(String metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public CreateAccountError withMetadata(Optional<String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public CreateAccountError withTermsOfService(TermsOfServiceError termsOfService) {
        Utils.checkNotNull(termsOfService, "termsOfService");
        this.termsOfService = Optional.ofNullable(termsOfService);
        return this;
    }

    public CreateAccountError withTermsOfService(Optional<? extends TermsOfServiceError> termsOfService) {
        Utils.checkNotNull(termsOfService, "termsOfService");
        this.termsOfService = termsOfService;
        return this;
    }

    public CreateAccountError withForeignID(String foreignID) {
        Utils.checkNotNull(foreignID, "foreignID");
        this.foreignID = Optional.ofNullable(foreignID);
        return this;
    }

    public CreateAccountError withForeignID(Optional<String> foreignID) {
        Utils.checkNotNull(foreignID, "foreignID");
        this.foreignID = foreignID;
        return this;
    }

    public CreateAccountError withCustomerSupport(CustomerSupportError customerSupport) {
        Utils.checkNotNull(customerSupport, "customerSupport");
        this.customerSupport = Optional.ofNullable(customerSupport);
        return this;
    }

    public CreateAccountError withCustomerSupport(Optional<? extends CustomerSupportError> customerSupport) {
        Utils.checkNotNull(customerSupport, "customerSupport");
        this.customerSupport = customerSupport;
        return this;
    }

    public CreateAccountError withSettings(CreateAccountSettings settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = Optional.ofNullable(settings);
        return this;
    }

    public CreateAccountError withSettings(Optional<? extends CreateAccountSettings> settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = settings;
        return this;
    }

    public CreateAccountError withCapabilities(Map<String, String> capabilities) {
        Utils.checkNotNull(capabilities, "capabilities");
        this.capabilities = Optional.ofNullable(capabilities);
        return this;
    }

    public CreateAccountError withCapabilities(Optional<? extends Map<String, String>> capabilities) {
        Utils.checkNotNull(capabilities, "capabilities");
        this.capabilities = capabilities;
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
        CreateAccountError other = (CreateAccountError) o;
        return 
            Objects.deepEquals(this.accountType, other.accountType) &&
            Objects.deepEquals(this.profile, other.profile) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.termsOfService, other.termsOfService) &&
            Objects.deepEquals(this.foreignID, other.foreignID) &&
            Objects.deepEquals(this.customerSupport, other.customerSupport) &&
            Objects.deepEquals(this.settings, other.settings) &&
            Objects.deepEquals(this.capabilities, other.capabilities);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountType,
            profile,
            metadata,
            termsOfService,
            foreignID,
            customerSupport,
            settings,
            capabilities);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateAccountError.class,
                "accountType", accountType,
                "profile", profile,
                "metadata", metadata,
                "termsOfService", termsOfService,
                "foreignID", foreignID,
                "customerSupport", customerSupport,
                "settings", settings,
                "capabilities", capabilities);
    }
    
    public final static class Builder {
 
        private Optional<String> accountType = Optional.empty();
 
        private Optional<? extends CreateProfileError> profile = Optional.empty();
 
        private Optional<String> metadata = Optional.empty();
 
        private Optional<? extends TermsOfServiceError> termsOfService = Optional.empty();
 
        private Optional<String> foreignID = Optional.empty();
 
        private Optional<? extends CustomerSupportError> customerSupport = Optional.empty();
 
        private Optional<? extends CreateAccountSettings> settings = Optional.empty();
 
        private Optional<? extends Map<String, String>> capabilities = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountType(String accountType) {
            Utils.checkNotNull(accountType, "accountType");
            this.accountType = Optional.ofNullable(accountType);
            return this;
        }

        public Builder accountType(Optional<String> accountType) {
            Utils.checkNotNull(accountType, "accountType");
            this.accountType = accountType;
            return this;
        }

        public Builder profile(CreateProfileError profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = Optional.ofNullable(profile);
            return this;
        }

        public Builder profile(Optional<? extends CreateProfileError> profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = profile;
            return this;
        }

        public Builder metadata(String metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder termsOfService(TermsOfServiceError termsOfService) {
            Utils.checkNotNull(termsOfService, "termsOfService");
            this.termsOfService = Optional.ofNullable(termsOfService);
            return this;
        }

        public Builder termsOfService(Optional<? extends TermsOfServiceError> termsOfService) {
            Utils.checkNotNull(termsOfService, "termsOfService");
            this.termsOfService = termsOfService;
            return this;
        }

        public Builder foreignID(String foreignID) {
            Utils.checkNotNull(foreignID, "foreignID");
            this.foreignID = Optional.ofNullable(foreignID);
            return this;
        }

        public Builder foreignID(Optional<String> foreignID) {
            Utils.checkNotNull(foreignID, "foreignID");
            this.foreignID = foreignID;
            return this;
        }

        public Builder customerSupport(CustomerSupportError customerSupport) {
            Utils.checkNotNull(customerSupport, "customerSupport");
            this.customerSupport = Optional.ofNullable(customerSupport);
            return this;
        }

        public Builder customerSupport(Optional<? extends CustomerSupportError> customerSupport) {
            Utils.checkNotNull(customerSupport, "customerSupport");
            this.customerSupport = customerSupport;
            return this;
        }

        public Builder settings(CreateAccountSettings settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = Optional.ofNullable(settings);
            return this;
        }

        public Builder settings(Optional<? extends CreateAccountSettings> settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = settings;
            return this;
        }

        public Builder capabilities(Map<String, String> capabilities) {
            Utils.checkNotNull(capabilities, "capabilities");
            this.capabilities = Optional.ofNullable(capabilities);
            return this;
        }

        public Builder capabilities(Optional<? extends Map<String, String>> capabilities) {
            Utils.checkNotNull(capabilities, "capabilities");
            this.capabilities = capabilities;
            return this;
        }
        
        public CreateAccountError build() {
            return new CreateAccountError(
                accountType,
                profile,
                metadata,
                termsOfService,
                foreignID,
                customerSupport,
                settings,
                capabilities);
        }
    }
}

