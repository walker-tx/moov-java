/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.openapi.models.components.BankAccountWaitFor;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.utils.SpeakeasyMetadata;
import io.moov.openapi.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class InitiateBankAccountVerificationRequest {

    /**
     * Specify an API version.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-moov-version")
    private Optional<? extends Versions> xMoovVersion;

    /**
     * Optional header to wait for certain events, such as the rail response, to occur before returning a response.
     * 
     * When this header is set to `rail-response`, the endpoint will wait for a sent-credit or failed status from the payment rail.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-wait-for")
    private BankAccountWaitFor xWaitFor;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=bankAccountID")
    private String bankAccountID;

    @JsonCreator
    public InitiateBankAccountVerificationRequest(
            Optional<? extends Versions> xMoovVersion,
            BankAccountWaitFor xWaitFor,
            String accountID,
            String bankAccountID) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(bankAccountID, "bankAccountID");
        this.xMoovVersion = xMoovVersion;
        this.xWaitFor = xWaitFor;
        this.accountID = accountID;
        this.bankAccountID = bankAccountID;
    }
    
    public InitiateBankAccountVerificationRequest(
            BankAccountWaitFor xWaitFor,
            String accountID,
            String bankAccountID) {
        this(Optional.empty(), xWaitFor, accountID, bankAccountID);
    }

    /**
     * Specify an API version.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Versions> xMoovVersion() {
        return (Optional<Versions>) xMoovVersion;
    }

    /**
     * Optional header to wait for certain events, such as the rail response, to occur before returning a response.
     * 
     * When this header is set to `rail-response`, the endpoint will wait for a sent-credit or failed status from the payment rail.
     */
    @JsonIgnore
    public BankAccountWaitFor xWaitFor() {
        return xWaitFor;
    }

    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    @JsonIgnore
    public String bankAccountID() {
        return bankAccountID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Specify an API version.
     */
    public InitiateBankAccountVerificationRequest withXMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.ofNullable(xMoovVersion);
        return this;
    }

    /**
     * Specify an API version.
     */
    public InitiateBankAccountVerificationRequest withXMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    /**
     * Optional header to wait for certain events, such as the rail response, to occur before returning a response.
     * 
     * When this header is set to `rail-response`, the endpoint will wait for a sent-credit or failed status from the payment rail.
     */
    public InitiateBankAccountVerificationRequest withXWaitFor(BankAccountWaitFor xWaitFor) {
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        this.xWaitFor = xWaitFor;
        return this;
    }

    public InitiateBankAccountVerificationRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public InitiateBankAccountVerificationRequest withBankAccountID(String bankAccountID) {
        Utils.checkNotNull(bankAccountID, "bankAccountID");
        this.bankAccountID = bankAccountID;
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
        InitiateBankAccountVerificationRequest other = (InitiateBankAccountVerificationRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.xWaitFor, other.xWaitFor) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.bankAccountID, other.bankAccountID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            xWaitFor,
            accountID,
            bankAccountID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InitiateBankAccountVerificationRequest.class,
                "xMoovVersion", xMoovVersion,
                "xWaitFor", xWaitFor,
                "accountID", accountID,
                "bankAccountID", bankAccountID);
    }
    
    public final static class Builder {
 
        private Optional<? extends Versions> xMoovVersion = Optional.empty();
 
        private BankAccountWaitFor xWaitFor;
 
        private String accountID;
 
        private String bankAccountID;  
        
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

        /**
         * Optional header to wait for certain events, such as the rail response, to occur before returning a response.
         * 
         * When this header is set to `rail-response`, the endpoint will wait for a sent-credit or failed status from the payment rail.
         */
        public Builder xWaitFor(BankAccountWaitFor xWaitFor) {
            Utils.checkNotNull(xWaitFor, "xWaitFor");
            this.xWaitFor = xWaitFor;
            return this;
        }

        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        public Builder bankAccountID(String bankAccountID) {
            Utils.checkNotNull(bankAccountID, "bankAccountID");
            this.bankAccountID = bankAccountID;
            return this;
        }
        
        public InitiateBankAccountVerificationRequest build() {
            return new InitiateBankAccountVerificationRequest(
                xMoovVersion,
                xWaitFor,
                accountID,
                bankAccountID);
        }
    }
}

