/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.openapi.models.components.CardAddressError;
import io.moov.openapi.models.components.CardExpirationError;
import io.moov.openapi.models.components.End2EndEncryptionError;
import io.moov.openapi.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

@SuppressWarnings("serial")
public class UpdateCardError extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("e2ee")
    private Optional<? extends End2EndEncryptionError> e2ee;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("billingAddress")
    private Optional<? extends CardAddressError> billingAddress;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expiration")
    private Optional<? extends CardExpirationError> expiration;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cardCvv")
    private Optional<String> cardCvv;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cardOnFile")
    private Optional<String> cardOnFile;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("merchantAccountID")
    private Optional<String> merchantAccountID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("verifyName")
    private Optional<String> verifyName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("holderName")
    private Optional<String> holderName;

    @JsonCreator
    public UpdateCardError(
            @JsonProperty("e2ee") Optional<? extends End2EndEncryptionError> e2ee,
            @JsonProperty("billingAddress") Optional<? extends CardAddressError> billingAddress,
            @JsonProperty("expiration") Optional<? extends CardExpirationError> expiration,
            @JsonProperty("cardCvv") Optional<String> cardCvv,
            @JsonProperty("cardOnFile") Optional<String> cardOnFile,
            @JsonProperty("merchantAccountID") Optional<String> merchantAccountID,
            @JsonProperty("verifyName") Optional<String> verifyName,
            @JsonProperty("holderName") Optional<String> holderName) {
        Utils.checkNotNull(e2ee, "e2ee");
        Utils.checkNotNull(billingAddress, "billingAddress");
        Utils.checkNotNull(expiration, "expiration");
        Utils.checkNotNull(cardCvv, "cardCvv");
        Utils.checkNotNull(cardOnFile, "cardOnFile");
        Utils.checkNotNull(merchantAccountID, "merchantAccountID");
        Utils.checkNotNull(verifyName, "verifyName");
        Utils.checkNotNull(holderName, "holderName");
        this.e2ee = e2ee;
        this.billingAddress = billingAddress;
        this.expiration = expiration;
        this.cardCvv = cardCvv;
        this.cardOnFile = cardOnFile;
        this.merchantAccountID = merchantAccountID;
        this.verifyName = verifyName;
        this.holderName = holderName;
    }
    
    public UpdateCardError() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    public Optional<End2EndEncryptionError> e2ee(){
        return (Optional<End2EndEncryptionError>) e2ee;
    }

    @SuppressWarnings("unchecked")
    public Optional<CardAddressError> billingAddress(){
        return (Optional<CardAddressError>) billingAddress;
    }

    @SuppressWarnings("unchecked")
    public Optional<CardExpirationError> expiration(){
        return (Optional<CardExpirationError>) expiration;
    }

    public Optional<String> cardCvv(){
        return cardCvv;
    }

    public Optional<String> cardOnFile(){
        return cardOnFile;
    }

    public Optional<String> merchantAccountID(){
        return merchantAccountID;
    }

    public Optional<String> verifyName(){
        return verifyName;
    }

    public Optional<String> holderName(){
        return holderName;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public UpdateCardError withE2ee(End2EndEncryptionError e2ee) {
        Utils.checkNotNull(e2ee, "e2ee");
        this.e2ee = Optional.ofNullable(e2ee);
        return this;
    }
    
    public UpdateCardError withE2ee(Optional<? extends End2EndEncryptionError> e2ee) {
        Utils.checkNotNull(e2ee, "e2ee");
        this.e2ee = e2ee;
        return this;
    }

    public UpdateCardError withBillingAddress(CardAddressError billingAddress) {
        Utils.checkNotNull(billingAddress, "billingAddress");
        this.billingAddress = Optional.ofNullable(billingAddress);
        return this;
    }
    
    public UpdateCardError withBillingAddress(Optional<? extends CardAddressError> billingAddress) {
        Utils.checkNotNull(billingAddress, "billingAddress");
        this.billingAddress = billingAddress;
        return this;
    }

    public UpdateCardError withExpiration(CardExpirationError expiration) {
        Utils.checkNotNull(expiration, "expiration");
        this.expiration = Optional.ofNullable(expiration);
        return this;
    }
    
    public UpdateCardError withExpiration(Optional<? extends CardExpirationError> expiration) {
        Utils.checkNotNull(expiration, "expiration");
        this.expiration = expiration;
        return this;
    }

    public UpdateCardError withCardCvv(String cardCvv) {
        Utils.checkNotNull(cardCvv, "cardCvv");
        this.cardCvv = Optional.ofNullable(cardCvv);
        return this;
    }
    
    public UpdateCardError withCardCvv(Optional<String> cardCvv) {
        Utils.checkNotNull(cardCvv, "cardCvv");
        this.cardCvv = cardCvv;
        return this;
    }

    public UpdateCardError withCardOnFile(String cardOnFile) {
        Utils.checkNotNull(cardOnFile, "cardOnFile");
        this.cardOnFile = Optional.ofNullable(cardOnFile);
        return this;
    }
    
    public UpdateCardError withCardOnFile(Optional<String> cardOnFile) {
        Utils.checkNotNull(cardOnFile, "cardOnFile");
        this.cardOnFile = cardOnFile;
        return this;
    }

    public UpdateCardError withMerchantAccountID(String merchantAccountID) {
        Utils.checkNotNull(merchantAccountID, "merchantAccountID");
        this.merchantAccountID = Optional.ofNullable(merchantAccountID);
        return this;
    }
    
    public UpdateCardError withMerchantAccountID(Optional<String> merchantAccountID) {
        Utils.checkNotNull(merchantAccountID, "merchantAccountID");
        this.merchantAccountID = merchantAccountID;
        return this;
    }

    public UpdateCardError withVerifyName(String verifyName) {
        Utils.checkNotNull(verifyName, "verifyName");
        this.verifyName = Optional.ofNullable(verifyName);
        return this;
    }
    
    public UpdateCardError withVerifyName(Optional<String> verifyName) {
        Utils.checkNotNull(verifyName, "verifyName");
        this.verifyName = verifyName;
        return this;
    }

    public UpdateCardError withHolderName(String holderName) {
        Utils.checkNotNull(holderName, "holderName");
        this.holderName = Optional.ofNullable(holderName);
        return this;
    }
    
    public UpdateCardError withHolderName(Optional<String> holderName) {
        Utils.checkNotNull(holderName, "holderName");
        this.holderName = holderName;
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
        UpdateCardError other = (UpdateCardError) o;
        return
            Objects.deepEquals(this.e2ee, other.e2ee) &&
            Objects.deepEquals(this.billingAddress, other.billingAddress) &&
            Objects.deepEquals(this.expiration, other.expiration) &&
            Objects.deepEquals(this.cardCvv, other.cardCvv) &&
            Objects.deepEquals(this.cardOnFile, other.cardOnFile) &&
            Objects.deepEquals(this.merchantAccountID, other.merchantAccountID) &&
            Objects.deepEquals(this.verifyName, other.verifyName) &&
            Objects.deepEquals(this.holderName, other.holderName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            e2ee,
            billingAddress,
            expiration,
            cardCvv,
            cardOnFile,
            merchantAccountID,
            verifyName,
            holderName);
    }

    @Override
    public String toString() {
        return Utils.toString(UpdateCardError.class,
                "e2ee", e2ee,
                "billingAddress", billingAddress,
                "expiration", expiration,
                "cardCvv", cardCvv,
                "cardOnFile", cardOnFile,
                "merchantAccountID", merchantAccountID,
                "verifyName", verifyName,
                "holderName", holderName);
    }

    public final static class Builder {

        private Optional<? extends End2EndEncryptionError> e2ee = Optional.empty();

        private Optional<? extends CardAddressError> billingAddress = Optional.empty();

        private Optional<? extends CardExpirationError> expiration = Optional.empty();

        private Optional<String> cardCvv = Optional.empty();

        private Optional<String> cardOnFile = Optional.empty();

        private Optional<String> merchantAccountID = Optional.empty();

        private Optional<String> verifyName = Optional.empty();

        private Optional<String> holderName = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }

        public Builder e2ee(End2EndEncryptionError e2ee) {
            Utils.checkNotNull(e2ee, "e2ee");
            this.e2ee = Optional.ofNullable(e2ee);
            return this;
        }
        
        public Builder e2ee(Optional<? extends End2EndEncryptionError> e2ee) {
            Utils.checkNotNull(e2ee, "e2ee");
            this.e2ee = e2ee;
            return this;
        }

        public Builder billingAddress(CardAddressError billingAddress) {
            Utils.checkNotNull(billingAddress, "billingAddress");
            this.billingAddress = Optional.ofNullable(billingAddress);
            return this;
        }
        
        public Builder billingAddress(Optional<? extends CardAddressError> billingAddress) {
            Utils.checkNotNull(billingAddress, "billingAddress");
            this.billingAddress = billingAddress;
            return this;
        }

        public Builder expiration(CardExpirationError expiration) {
            Utils.checkNotNull(expiration, "expiration");
            this.expiration = Optional.ofNullable(expiration);
            return this;
        }
        
        public Builder expiration(Optional<? extends CardExpirationError> expiration) {
            Utils.checkNotNull(expiration, "expiration");
            this.expiration = expiration;
            return this;
        }

        public Builder cardCvv(String cardCvv) {
            Utils.checkNotNull(cardCvv, "cardCvv");
            this.cardCvv = Optional.ofNullable(cardCvv);
            return this;
        }
        
        public Builder cardCvv(Optional<String> cardCvv) {
            Utils.checkNotNull(cardCvv, "cardCvv");
            this.cardCvv = cardCvv;
            return this;
        }

        public Builder cardOnFile(String cardOnFile) {
            Utils.checkNotNull(cardOnFile, "cardOnFile");
            this.cardOnFile = Optional.ofNullable(cardOnFile);
            return this;
        }
        
        public Builder cardOnFile(Optional<String> cardOnFile) {
            Utils.checkNotNull(cardOnFile, "cardOnFile");
            this.cardOnFile = cardOnFile;
            return this;
        }

        public Builder merchantAccountID(String merchantAccountID) {
            Utils.checkNotNull(merchantAccountID, "merchantAccountID");
            this.merchantAccountID = Optional.ofNullable(merchantAccountID);
            return this;
        }
        
        public Builder merchantAccountID(Optional<String> merchantAccountID) {
            Utils.checkNotNull(merchantAccountID, "merchantAccountID");
            this.merchantAccountID = merchantAccountID;
            return this;
        }

        public Builder verifyName(String verifyName) {
            Utils.checkNotNull(verifyName, "verifyName");
            this.verifyName = Optional.ofNullable(verifyName);
            return this;
        }
        
        public Builder verifyName(Optional<String> verifyName) {
            Utils.checkNotNull(verifyName, "verifyName");
            this.verifyName = verifyName;
            return this;
        }

        public Builder holderName(String holderName) {
            Utils.checkNotNull(holderName, "holderName");
            this.holderName = Optional.ofNullable(holderName);
            return this;
        }
        
        public Builder holderName(Optional<String> holderName) {
            Utils.checkNotNull(holderName, "holderName");
            this.holderName = holderName;
            return this;
        }

        public UpdateCardError build() {
            return new UpdateCardError(
                e2ee,
                billingAddress,
                expiration,
                cardCvv,
                cardOnFile,
                merchantAccountID,
                verifyName,
                holderName);
        }
    }
}
