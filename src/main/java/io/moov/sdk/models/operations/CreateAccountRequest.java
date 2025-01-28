/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.sdk.models.components.CreateAccount;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateAccountRequest {

    /**
     * Specify an API version.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-moov-version")
    private Optional<? extends Versions> xMoovVersion;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CreateAccount createAccount;

    @JsonCreator
    public CreateAccountRequest(
            Optional<? extends Versions> xMoovVersion,
            CreateAccount createAccount) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(createAccount, "createAccount");
        this.xMoovVersion = xMoovVersion;
        this.createAccount = createAccount;
    }
    
    public CreateAccountRequest(
            CreateAccount createAccount) {
        this(Optional.empty(), createAccount);
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
    public CreateAccount createAccount() {
        return createAccount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Specify an API version.
     */
    public CreateAccountRequest withXMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.ofNullable(xMoovVersion);
        return this;
    }

    /**
     * Specify an API version.
     */
    public CreateAccountRequest withXMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public CreateAccountRequest withCreateAccount(CreateAccount createAccount) {
        Utils.checkNotNull(createAccount, "createAccount");
        this.createAccount = createAccount;
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
        CreateAccountRequest other = (CreateAccountRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.createAccount, other.createAccount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            createAccount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateAccountRequest.class,
                "xMoovVersion", xMoovVersion,
                "createAccount", createAccount);
    }
    
    public final static class Builder {
 
        private Optional<? extends Versions> xMoovVersion = Optional.empty();
 
        private CreateAccount createAccount;  
        
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

        public Builder createAccount(CreateAccount createAccount) {
            Utils.checkNotNull(createAccount, "createAccount");
            this.createAccount = createAccount;
            return this;
        }
        
        public CreateAccountRequest build() {
            return new CreateAccountRequest(
                xMoovVersion,
                createAccount);
        }
    }
}

