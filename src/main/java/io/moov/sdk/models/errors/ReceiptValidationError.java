/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

@SuppressWarnings("serial")
public class ReceiptValidationError extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("kind")
    private Optional<String> kind;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emailAccountID")
    private Optional<String> emailAccountID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("forTransferID")
    private Optional<String> forTransferID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("forScheduleID")
    private Optional<String> forScheduleID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("forOccurrenceID")
    private Optional<String> forOccurrenceID;

    @JsonCreator
    public ReceiptValidationError(
            @JsonProperty("kind") Optional<String> kind,
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("emailAccountID") Optional<String> emailAccountID,
            @JsonProperty("forTransferID") Optional<String> forTransferID,
            @JsonProperty("forScheduleID") Optional<String> forScheduleID,
            @JsonProperty("forOccurrenceID") Optional<String> forOccurrenceID) {
        Utils.checkNotNull(kind, "kind");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(emailAccountID, "emailAccountID");
        Utils.checkNotNull(forTransferID, "forTransferID");
        Utils.checkNotNull(forScheduleID, "forScheduleID");
        Utils.checkNotNull(forOccurrenceID, "forOccurrenceID");
        this.kind = kind;
        this.email = email;
        this.emailAccountID = emailAccountID;
        this.forTransferID = forTransferID;
        this.forScheduleID = forScheduleID;
        this.forOccurrenceID = forOccurrenceID;
    }
    
    public ReceiptValidationError() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    public Optional<String> kind(){
        return kind;
    }

    public Optional<String> email(){
        return email;
    }

    public Optional<String> emailAccountID(){
        return emailAccountID;
    }

    public Optional<String> forTransferID(){
        return forTransferID;
    }

    public Optional<String> forScheduleID(){
        return forScheduleID;
    }

    public Optional<String> forOccurrenceID(){
        return forOccurrenceID;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public ReceiptValidationError withKind(String kind) {
        Utils.checkNotNull(kind, "kind");
        this.kind = Optional.ofNullable(kind);
        return this;
    }
    
    public ReceiptValidationError withKind(Optional<String> kind) {
        Utils.checkNotNull(kind, "kind");
        this.kind = kind;
        return this;
    }

    public ReceiptValidationError withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }
    
    public ReceiptValidationError withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public ReceiptValidationError withEmailAccountID(String emailAccountID) {
        Utils.checkNotNull(emailAccountID, "emailAccountID");
        this.emailAccountID = Optional.ofNullable(emailAccountID);
        return this;
    }
    
    public ReceiptValidationError withEmailAccountID(Optional<String> emailAccountID) {
        Utils.checkNotNull(emailAccountID, "emailAccountID");
        this.emailAccountID = emailAccountID;
        return this;
    }

    public ReceiptValidationError withForTransferID(String forTransferID) {
        Utils.checkNotNull(forTransferID, "forTransferID");
        this.forTransferID = Optional.ofNullable(forTransferID);
        return this;
    }
    
    public ReceiptValidationError withForTransferID(Optional<String> forTransferID) {
        Utils.checkNotNull(forTransferID, "forTransferID");
        this.forTransferID = forTransferID;
        return this;
    }

    public ReceiptValidationError withForScheduleID(String forScheduleID) {
        Utils.checkNotNull(forScheduleID, "forScheduleID");
        this.forScheduleID = Optional.ofNullable(forScheduleID);
        return this;
    }
    
    public ReceiptValidationError withForScheduleID(Optional<String> forScheduleID) {
        Utils.checkNotNull(forScheduleID, "forScheduleID");
        this.forScheduleID = forScheduleID;
        return this;
    }

    public ReceiptValidationError withForOccurrenceID(String forOccurrenceID) {
        Utils.checkNotNull(forOccurrenceID, "forOccurrenceID");
        this.forOccurrenceID = Optional.ofNullable(forOccurrenceID);
        return this;
    }
    
    public ReceiptValidationError withForOccurrenceID(Optional<String> forOccurrenceID) {
        Utils.checkNotNull(forOccurrenceID, "forOccurrenceID");
        this.forOccurrenceID = forOccurrenceID;
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
        ReceiptValidationError other = (ReceiptValidationError) o;
        return
            Objects.deepEquals(this.kind, other.kind) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.emailAccountID, other.emailAccountID) &&
            Objects.deepEquals(this.forTransferID, other.forTransferID) &&
            Objects.deepEquals(this.forScheduleID, other.forScheduleID) &&
            Objects.deepEquals(this.forOccurrenceID, other.forOccurrenceID);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            kind,
            email,
            emailAccountID,
            forTransferID,
            forScheduleID,
            forOccurrenceID);
    }

    @Override
    public String toString() {
        return Utils.toString(ReceiptValidationError.class,
                "kind", kind,
                "email", email,
                "emailAccountID", emailAccountID,
                "forTransferID", forTransferID,
                "forScheduleID", forScheduleID,
                "forOccurrenceID", forOccurrenceID);
    }

    public final static class Builder {

        private Optional<String> kind = Optional.empty();

        private Optional<String> email = Optional.empty();

        private Optional<String> emailAccountID = Optional.empty();

        private Optional<String> forTransferID = Optional.empty();

        private Optional<String> forScheduleID = Optional.empty();

        private Optional<String> forOccurrenceID = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }

        public Builder kind(String kind) {
            Utils.checkNotNull(kind, "kind");
            this.kind = Optional.ofNullable(kind);
            return this;
        }
        
        public Builder kind(Optional<String> kind) {
            Utils.checkNotNull(kind, "kind");
            this.kind = kind;
            return this;
        }

        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }
        
        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder emailAccountID(String emailAccountID) {
            Utils.checkNotNull(emailAccountID, "emailAccountID");
            this.emailAccountID = Optional.ofNullable(emailAccountID);
            return this;
        }
        
        public Builder emailAccountID(Optional<String> emailAccountID) {
            Utils.checkNotNull(emailAccountID, "emailAccountID");
            this.emailAccountID = emailAccountID;
            return this;
        }

        public Builder forTransferID(String forTransferID) {
            Utils.checkNotNull(forTransferID, "forTransferID");
            this.forTransferID = Optional.ofNullable(forTransferID);
            return this;
        }
        
        public Builder forTransferID(Optional<String> forTransferID) {
            Utils.checkNotNull(forTransferID, "forTransferID");
            this.forTransferID = forTransferID;
            return this;
        }

        public Builder forScheduleID(String forScheduleID) {
            Utils.checkNotNull(forScheduleID, "forScheduleID");
            this.forScheduleID = Optional.ofNullable(forScheduleID);
            return this;
        }
        
        public Builder forScheduleID(Optional<String> forScheduleID) {
            Utils.checkNotNull(forScheduleID, "forScheduleID");
            this.forScheduleID = forScheduleID;
            return this;
        }

        public Builder forOccurrenceID(String forOccurrenceID) {
            Utils.checkNotNull(forOccurrenceID, "forOccurrenceID");
            this.forOccurrenceID = Optional.ofNullable(forOccurrenceID);
            return this;
        }
        
        public Builder forOccurrenceID(Optional<String> forOccurrenceID) {
            Utils.checkNotNull(forOccurrenceID, "forOccurrenceID");
            this.forOccurrenceID = forOccurrenceID;
            return this;
        }

        public ReceiptValidationError build() {
            return new ReceiptValidationError(
                kind,
                email,
                emailAccountID,
                forTransferID,
                forScheduleID,
                forOccurrenceID);
        }
    }
}
