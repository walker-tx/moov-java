/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.operations;

import io.moov.openapi.models.components.UpdatePaymentLink;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class UpdatePaymentLinkRequestBuilder {

    private UpdatePaymentLinkSecurity security;
    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private String paymentLinkCode;
    private UpdatePaymentLink updatePaymentLink;
    private final SDKMethodInterfaces.MethodCallUpdatePaymentLink sdk;

    public UpdatePaymentLinkRequestBuilder(SDKMethodInterfaces.MethodCallUpdatePaymentLink sdk) {
        this.sdk = sdk;
    }

    public UpdatePaymentLinkRequestBuilder security(UpdatePaymentLinkSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public UpdatePaymentLinkRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public UpdatePaymentLinkRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public UpdatePaymentLinkRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public UpdatePaymentLinkRequestBuilder paymentLinkCode(String paymentLinkCode) {
        Utils.checkNotNull(paymentLinkCode, "paymentLinkCode");
        this.paymentLinkCode = paymentLinkCode;
        return this;
    }

    public UpdatePaymentLinkRequestBuilder updatePaymentLink(UpdatePaymentLink updatePaymentLink) {
        Utils.checkNotNull(updatePaymentLink, "updatePaymentLink");
        this.updatePaymentLink = updatePaymentLink;
        return this;
    }

    public UpdatePaymentLinkResponse call() throws Exception {

        return sdk.updatePaymentLink(
            security,
            xMoovVersion,
            accountID,
            paymentLinkCode,
            updatePaymentLink);
    }
}
