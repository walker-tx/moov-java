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
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class FeePlan {

    @JsonProperty("planID")
    private String planID;

    /**
     * The name of the fee plan.
     */
    @JsonProperty("name")
    private String name;

    /**
     * A description of the fee plan.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    /**
     * Specifies the card processing pricing model
     */
    @JsonProperty("cardAcquringModel")
    private CardAcquringModel cardAcquringModel;

    /**
     * Additional usage-based fees for this plan.
     */
    @JsonProperty("billableFees")
    private List<BillableFee> billableFees;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonCreator
    public FeePlan(
            @JsonProperty("planID") String planID,
            @JsonProperty("name") String name,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("cardAcquringModel") CardAcquringModel cardAcquringModel,
            @JsonProperty("billableFees") List<BillableFee> billableFees,
            @JsonProperty("createdAt") OffsetDateTime createdAt) {
        Utils.checkNotNull(planID, "planID");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(cardAcquringModel, "cardAcquringModel");
        Utils.checkNotNull(billableFees, "billableFees");
        Utils.checkNotNull(createdAt, "createdAt");
        this.planID = planID;
        this.name = name;
        this.description = description;
        this.cardAcquringModel = cardAcquringModel;
        this.billableFees = billableFees;
        this.createdAt = createdAt;
    }
    
    public FeePlan(
            String planID,
            String name,
            CardAcquringModel cardAcquringModel,
            List<BillableFee> billableFees,
            OffsetDateTime createdAt) {
        this(planID, name, Optional.empty(), cardAcquringModel, billableFees, createdAt);
    }

    @JsonIgnore
    public String planID() {
        return planID;
    }

    /**
     * The name of the fee plan.
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * A description of the fee plan.
     */
    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    /**
     * Specifies the card processing pricing model
     */
    @JsonIgnore
    public CardAcquringModel cardAcquringModel() {
        return cardAcquringModel;
    }

    /**
     * Additional usage-based fees for this plan.
     */
    @JsonIgnore
    public List<BillableFee> billableFees() {
        return billableFees;
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public FeePlan withPlanID(String planID) {
        Utils.checkNotNull(planID, "planID");
        this.planID = planID;
        return this;
    }

    /**
     * The name of the fee plan.
     */
    public FeePlan withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * A description of the fee plan.
     */
    public FeePlan withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * A description of the fee plan.
     */
    public FeePlan withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Specifies the card processing pricing model
     */
    public FeePlan withCardAcquringModel(CardAcquringModel cardAcquringModel) {
        Utils.checkNotNull(cardAcquringModel, "cardAcquringModel");
        this.cardAcquringModel = cardAcquringModel;
        return this;
    }

    /**
     * Additional usage-based fees for this plan.
     */
    public FeePlan withBillableFees(List<BillableFee> billableFees) {
        Utils.checkNotNull(billableFees, "billableFees");
        this.billableFees = billableFees;
        return this;
    }

    public FeePlan withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
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
        FeePlan other = (FeePlan) o;
        return 
            Objects.deepEquals(this.planID, other.planID) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.cardAcquringModel, other.cardAcquringModel) &&
            Objects.deepEquals(this.billableFees, other.billableFees) &&
            Objects.deepEquals(this.createdAt, other.createdAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            planID,
            name,
            description,
            cardAcquringModel,
            billableFees,
            createdAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FeePlan.class,
                "planID", planID,
                "name", name,
                "description", description,
                "cardAcquringModel", cardAcquringModel,
                "billableFees", billableFees,
                "createdAt", createdAt);
    }
    
    public final static class Builder {
 
        private String planID;
 
        private String name;
 
        private Optional<String> description = Optional.empty();
 
        private CardAcquringModel cardAcquringModel;
 
        private List<BillableFee> billableFees;
 
        private OffsetDateTime createdAt;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder planID(String planID) {
            Utils.checkNotNull(planID, "planID");
            this.planID = planID;
            return this;
        }

        /**
         * The name of the fee plan.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * A description of the fee plan.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        /**
         * A description of the fee plan.
         */
        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Specifies the card processing pricing model
         */
        public Builder cardAcquringModel(CardAcquringModel cardAcquringModel) {
            Utils.checkNotNull(cardAcquringModel, "cardAcquringModel");
            this.cardAcquringModel = cardAcquringModel;
            return this;
        }

        /**
         * Additional usage-based fees for this plan.
         */
        public Builder billableFees(List<BillableFee> billableFees) {
            Utils.checkNotNull(billableFees, "billableFees");
            this.billableFees = billableFees;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }
        
        public FeePlan build() {
            return new FeePlan(
                planID,
                name,
                description,
                cardAcquringModel,
                billableFees,
                createdAt);
        }
    }
}

