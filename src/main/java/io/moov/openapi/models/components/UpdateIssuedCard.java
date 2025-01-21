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
import java.util.Objects;
import java.util.Optional;


public class UpdateIssuedCard {

    /**
     * The `state` represents the operational status of an issued card. A card can only approve incoming authorizations if it is in an active state.
     * 
     * - `active`: The card is operational and approves authorizations. Generally becomes active shortly after card creation.
     * - `inactive`: The card cannot approve authorizations. This is currently a temporary state assigned post-creation during the activation process.
     * - `closed`: The card is permanently deactivated and cannot approve authorizations. A card can be closed by request or when it expires.
     * - `pending-verification`: Awaiting additional authorized user verification before the card can be activated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    private Optional<? extends IssuedCardState> state;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("memo")
    private Optional<String> memo;

    /**
     * Fields for identifying an authorized individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authorizedUser")
    private Optional<? extends CreateAuthorizedUserUpdate> authorizedUser;

    @JsonCreator
    public UpdateIssuedCard(
            @JsonProperty("state") Optional<? extends IssuedCardState> state,
            @JsonProperty("memo") Optional<String> memo,
            @JsonProperty("authorizedUser") Optional<? extends CreateAuthorizedUserUpdate> authorizedUser) {
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(memo, "memo");
        Utils.checkNotNull(authorizedUser, "authorizedUser");
        this.state = state;
        this.memo = memo;
        this.authorizedUser = authorizedUser;
    }
    
    public UpdateIssuedCard() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The `state` represents the operational status of an issued card. A card can only approve incoming authorizations if it is in an active state.
     * 
     * - `active`: The card is operational and approves authorizations. Generally becomes active shortly after card creation.
     * - `inactive`: The card cannot approve authorizations. This is currently a temporary state assigned post-creation during the activation process.
     * - `closed`: The card is permanently deactivated and cannot approve authorizations. A card can be closed by request or when it expires.
     * - `pending-verification`: Awaiting additional authorized user verification before the card can be activated.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<IssuedCardState> state() {
        return (Optional<IssuedCardState>) state;
    }

    @JsonIgnore
    public Optional<String> memo() {
        return memo;
    }

    /**
     * Fields for identifying an authorized individual.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateAuthorizedUserUpdate> authorizedUser() {
        return (Optional<CreateAuthorizedUserUpdate>) authorizedUser;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The `state` represents the operational status of an issued card. A card can only approve incoming authorizations if it is in an active state.
     * 
     * - `active`: The card is operational and approves authorizations. Generally becomes active shortly after card creation.
     * - `inactive`: The card cannot approve authorizations. This is currently a temporary state assigned post-creation during the activation process.
     * - `closed`: The card is permanently deactivated and cannot approve authorizations. A card can be closed by request or when it expires.
     * - `pending-verification`: Awaiting additional authorized user verification before the card can be activated.
     */
    public UpdateIssuedCard withState(IssuedCardState state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * The `state` represents the operational status of an issued card. A card can only approve incoming authorizations if it is in an active state.
     * 
     * - `active`: The card is operational and approves authorizations. Generally becomes active shortly after card creation.
     * - `inactive`: The card cannot approve authorizations. This is currently a temporary state assigned post-creation during the activation process.
     * - `closed`: The card is permanently deactivated and cannot approve authorizations. A card can be closed by request or when it expires.
     * - `pending-verification`: Awaiting additional authorized user verification before the card can be activated.
     */
    public UpdateIssuedCard withState(Optional<? extends IssuedCardState> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    public UpdateIssuedCard withMemo(String memo) {
        Utils.checkNotNull(memo, "memo");
        this.memo = Optional.ofNullable(memo);
        return this;
    }

    public UpdateIssuedCard withMemo(Optional<String> memo) {
        Utils.checkNotNull(memo, "memo");
        this.memo = memo;
        return this;
    }

    /**
     * Fields for identifying an authorized individual.
     */
    public UpdateIssuedCard withAuthorizedUser(CreateAuthorizedUserUpdate authorizedUser) {
        Utils.checkNotNull(authorizedUser, "authorizedUser");
        this.authorizedUser = Optional.ofNullable(authorizedUser);
        return this;
    }

    /**
     * Fields for identifying an authorized individual.
     */
    public UpdateIssuedCard withAuthorizedUser(Optional<? extends CreateAuthorizedUserUpdate> authorizedUser) {
        Utils.checkNotNull(authorizedUser, "authorizedUser");
        this.authorizedUser = authorizedUser;
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
        UpdateIssuedCard other = (UpdateIssuedCard) o;
        return 
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.memo, other.memo) &&
            Objects.deepEquals(this.authorizedUser, other.authorizedUser);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            state,
            memo,
            authorizedUser);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateIssuedCard.class,
                "state", state,
                "memo", memo,
                "authorizedUser", authorizedUser);
    }
    
    public final static class Builder {
 
        private Optional<? extends IssuedCardState> state = Optional.empty();
 
        private Optional<String> memo = Optional.empty();
 
        private Optional<? extends CreateAuthorizedUserUpdate> authorizedUser = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The `state` represents the operational status of an issued card. A card can only approve incoming authorizations if it is in an active state.
         * 
         * - `active`: The card is operational and approves authorizations. Generally becomes active shortly after card creation.
         * - `inactive`: The card cannot approve authorizations. This is currently a temporary state assigned post-creation during the activation process.
         * - `closed`: The card is permanently deactivated and cannot approve authorizations. A card can be closed by request or when it expires.
         * - `pending-verification`: Awaiting additional authorized user verification before the card can be activated.
         */
        public Builder state(IssuedCardState state) {
            Utils.checkNotNull(state, "state");
            this.state = Optional.ofNullable(state);
            return this;
        }

        /**
         * The `state` represents the operational status of an issued card. A card can only approve incoming authorizations if it is in an active state.
         * 
         * - `active`: The card is operational and approves authorizations. Generally becomes active shortly after card creation.
         * - `inactive`: The card cannot approve authorizations. This is currently a temporary state assigned post-creation during the activation process.
         * - `closed`: The card is permanently deactivated and cannot approve authorizations. A card can be closed by request or when it expires.
         * - `pending-verification`: Awaiting additional authorized user verification before the card can be activated.
         */
        public Builder state(Optional<? extends IssuedCardState> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        public Builder memo(String memo) {
            Utils.checkNotNull(memo, "memo");
            this.memo = Optional.ofNullable(memo);
            return this;
        }

        public Builder memo(Optional<String> memo) {
            Utils.checkNotNull(memo, "memo");
            this.memo = memo;
            return this;
        }

        /**
         * Fields for identifying an authorized individual.
         */
        public Builder authorizedUser(CreateAuthorizedUserUpdate authorizedUser) {
            Utils.checkNotNull(authorizedUser, "authorizedUser");
            this.authorizedUser = Optional.ofNullable(authorizedUser);
            return this;
        }

        /**
         * Fields for identifying an authorized individual.
         */
        public Builder authorizedUser(Optional<? extends CreateAuthorizedUserUpdate> authorizedUser) {
            Utils.checkNotNull(authorizedUser, "authorizedUser");
            this.authorizedUser = authorizedUser;
            return this;
        }
        
        public UpdateIssuedCard build() {
            return new UpdateIssuedCard(
                state,
                memo,
                authorizedUser);
        }
    }
}

