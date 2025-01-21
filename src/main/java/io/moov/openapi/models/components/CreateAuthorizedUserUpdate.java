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

/**
 * CreateAuthorizedUserUpdate - Fields for identifying an authorized individual.
 */

public class CreateAuthorizedUserUpdate {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("firstName")
    private Optional<String> firstName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastName")
    private Optional<String> lastName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("birthDate")
    private Optional<? extends BirthDateUpdate> birthDate;

    @JsonCreator
    public CreateAuthorizedUserUpdate(
            @JsonProperty("firstName") Optional<String> firstName,
            @JsonProperty("lastName") Optional<String> lastName,
            @JsonProperty("birthDate") Optional<? extends BirthDateUpdate> birthDate) {
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(birthDate, "birthDate");
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
    
    public CreateAuthorizedUserUpdate() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> firstName() {
        return firstName;
    }

    @JsonIgnore
    public Optional<String> lastName() {
        return lastName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BirthDateUpdate> birthDate() {
        return (Optional<BirthDateUpdate>) birthDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateAuthorizedUserUpdate withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = Optional.ofNullable(firstName);
        return this;
    }

    public CreateAuthorizedUserUpdate withFirstName(Optional<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public CreateAuthorizedUserUpdate withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = Optional.ofNullable(lastName);
        return this;
    }

    public CreateAuthorizedUserUpdate withLastName(Optional<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    public CreateAuthorizedUserUpdate withBirthDate(BirthDateUpdate birthDate) {
        Utils.checkNotNull(birthDate, "birthDate");
        this.birthDate = Optional.ofNullable(birthDate);
        return this;
    }

    public CreateAuthorizedUserUpdate withBirthDate(Optional<? extends BirthDateUpdate> birthDate) {
        Utils.checkNotNull(birthDate, "birthDate");
        this.birthDate = birthDate;
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
        CreateAuthorizedUserUpdate other = (CreateAuthorizedUserUpdate) o;
        return 
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.birthDate, other.birthDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            firstName,
            lastName,
            birthDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateAuthorizedUserUpdate.class,
                "firstName", firstName,
                "lastName", lastName,
                "birthDate", birthDate);
    }
    
    public final static class Builder {
 
        private Optional<String> firstName = Optional.empty();
 
        private Optional<String> lastName = Optional.empty();
 
        private Optional<? extends BirthDateUpdate> birthDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = Optional.ofNullable(firstName);
            return this;
        }

        public Builder firstName(Optional<String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = Optional.ofNullable(lastName);
            return this;
        }

        public Builder lastName(Optional<String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        public Builder birthDate(BirthDateUpdate birthDate) {
            Utils.checkNotNull(birthDate, "birthDate");
            this.birthDate = Optional.ofNullable(birthDate);
            return this;
        }

        public Builder birthDate(Optional<? extends BirthDateUpdate> birthDate) {
            Utils.checkNotNull(birthDate, "birthDate");
            this.birthDate = birthDate;
            return this;
        }
        
        public CreateAuthorizedUserUpdate build() {
            return new CreateAuthorizedUserUpdate(
                firstName,
                lastName,
                birthDate);
        }
    }
}

