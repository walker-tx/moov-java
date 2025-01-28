/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.FeePlanAgreementStatus;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public class ListPartnerPricingAgreementsRequestBuilder {

    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private Optional<? extends List<String>> agreementID = Optional.empty();
    private Optional<? extends List<FeePlanAgreementStatus>> status = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListPartnerPricingAgreements sdk;

    public ListPartnerPricingAgreementsRequestBuilder(SDKMethodInterfaces.MethodCallListPartnerPricingAgreements sdk) {
        this.sdk = sdk;
    }
                
    public ListPartnerPricingAgreementsRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public ListPartnerPricingAgreementsRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public ListPartnerPricingAgreementsRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }
                
    public ListPartnerPricingAgreementsRequestBuilder agreementID(List<String> agreementID) {
        Utils.checkNotNull(agreementID, "agreementID");
        this.agreementID = Optional.of(agreementID);
        return this;
    }

    public ListPartnerPricingAgreementsRequestBuilder agreementID(Optional<? extends List<String>> agreementID) {
        Utils.checkNotNull(agreementID, "agreementID");
        this.agreementID = agreementID;
        return this;
    }
                
    public ListPartnerPricingAgreementsRequestBuilder status(List<FeePlanAgreementStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.of(status);
        return this;
    }

    public ListPartnerPricingAgreementsRequestBuilder status(Optional<? extends List<FeePlanAgreementStatus>> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public ListPartnerPricingAgreementsResponse call() throws Exception {

        return sdk.listPartnerPricingAgreements(
            xMoovVersion,
            accountID,
            agreementID,
            status);
    }
}
