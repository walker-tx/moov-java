/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.openapi.models.components.BankAccountWaitFor;
import io.moov.openapi.models.components.LinkBankAccount;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.utils.SpeakeasyMetadata;
import io.moov.openapi.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class LinkBankAccountRequest {

    /**
     * Specify an API version.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-moov-version")
    private Optional<? extends Versions> xMoovVersion;

    /**
     * Optional header to wait for certain events, such as the creation of a payment method, to occur before returning a response.
     * 
     * When this header is set to `payment-method`, the response will include any payment methods that were created for the newly
     * linked card in the `paymentMethods` field. Otherwise, the `paymentMethods` field will be omitted from the response.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-wait-for")
    private Optional<? extends BankAccountWaitFor> xWaitFor;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private LinkBankAccount linkBankAccount;

    @JsonCreator
    public LinkBankAccountRequest(
            Optional<? extends Versions> xMoovVersion,
            Optional<? extends BankAccountWaitFor> xWaitFor,
            String accountID,
            LinkBankAccount linkBankAccount) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(linkBankAccount, "linkBankAccount");
        this.xMoovVersion = xMoovVersion;
        this.xWaitFor = xWaitFor;
        this.accountID = accountID;
        this.linkBankAccount = linkBankAccount;
    }
    
    public LinkBankAccountRequest(
            String accountID,
            LinkBankAccount linkBankAccount) {
        this(Optional.empty(), Optional.empty(), accountID, linkBankAccount);
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
     * Optional header to wait for certain events, such as the creation of a payment method, to occur before returning a response.
     * 
     * When this header is set to `payment-method`, the response will include any payment methods that were created for the newly
     * linked card in the `paymentMethods` field. Otherwise, the `paymentMethods` field will be omitted from the response.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BankAccountWaitFor> xWaitFor() {
        return (Optional<BankAccountWaitFor>) xWaitFor;
    }

    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    @JsonIgnore
    public LinkBankAccount linkBankAccount() {
        return linkBankAccount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Specify an API version.
     */
    public LinkBankAccountRequest withXMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.ofNullable(xMoovVersion);
        return this;
    }

    /**
     * Specify an API version.
     */
    public LinkBankAccountRequest withXMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    /**
     * Optional header to wait for certain events, such as the creation of a payment method, to occur before returning a response.
     * 
     * When this header is set to `payment-method`, the response will include any payment methods that were created for the newly
     * linked card in the `paymentMethods` field. Otherwise, the `paymentMethods` field will be omitted from the response.
     */
    public LinkBankAccountRequest withXWaitFor(BankAccountWaitFor xWaitFor) {
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        this.xWaitFor = Optional.ofNullable(xWaitFor);
        return this;
    }

    /**
     * Optional header to wait for certain events, such as the creation of a payment method, to occur before returning a response.
     * 
     * When this header is set to `payment-method`, the response will include any payment methods that were created for the newly
     * linked card in the `paymentMethods` field. Otherwise, the `paymentMethods` field will be omitted from the response.
     */
    public LinkBankAccountRequest withXWaitFor(Optional<? extends BankAccountWaitFor> xWaitFor) {
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        this.xWaitFor = xWaitFor;
        return this;
    }

    public LinkBankAccountRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public LinkBankAccountRequest withLinkBankAccount(LinkBankAccount linkBankAccount) {
        Utils.checkNotNull(linkBankAccount, "linkBankAccount");
        this.linkBankAccount = linkBankAccount;
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
        LinkBankAccountRequest other = (LinkBankAccountRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.xWaitFor, other.xWaitFor) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.linkBankAccount, other.linkBankAccount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            xWaitFor,
            accountID,
            linkBankAccount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LinkBankAccountRequest.class,
                "xMoovVersion", xMoovVersion,
                "xWaitFor", xWaitFor,
                "accountID", accountID,
                "linkBankAccount", linkBankAccount);
    }
    
    public final static class Builder {
 
        private Optional<? extends Versions> xMoovVersion = Optional.empty();
 
        private Optional<? extends BankAccountWaitFor> xWaitFor = Optional.empty();
 
        private String accountID;
 
        private LinkBankAccount linkBankAccount;  
        
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
         * Optional header to wait for certain events, such as the creation of a payment method, to occur before returning a response.
         * 
         * When this header is set to `payment-method`, the response will include any payment methods that were created for the newly
         * linked card in the `paymentMethods` field. Otherwise, the `paymentMethods` field will be omitted from the response.
         */
        public Builder xWaitFor(BankAccountWaitFor xWaitFor) {
            Utils.checkNotNull(xWaitFor, "xWaitFor");
            this.xWaitFor = Optional.ofNullable(xWaitFor);
            return this;
        }

        /**
         * Optional header to wait for certain events, such as the creation of a payment method, to occur before returning a response.
         * 
         * When this header is set to `payment-method`, the response will include any payment methods that were created for the newly
         * linked card in the `paymentMethods` field. Otherwise, the `paymentMethods` field will be omitted from the response.
         */
        public Builder xWaitFor(Optional<? extends BankAccountWaitFor> xWaitFor) {
            Utils.checkNotNull(xWaitFor, "xWaitFor");
            this.xWaitFor = xWaitFor;
            return this;
        }

        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        public Builder linkBankAccount(LinkBankAccount linkBankAccount) {
            Utils.checkNotNull(linkBankAccount, "linkBankAccount");
            this.linkBankAccount = linkBankAccount;
            return this;
        }
        
        public LinkBankAccountRequest build() {
            return new LinkBankAccountRequest(
                xMoovVersion,
                xWaitFor,
                accountID,
                linkBankAccount);
        }
    }
}

