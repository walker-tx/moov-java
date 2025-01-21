/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.operations;

import io.moov.openapi.models.components.Versions;
import io.moov.openapi.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class DisablePaymentLinkRequestBuilder {

    private DisablePaymentLinkSecurity security;
    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private String paymentLinkCode;
    private final SDKMethodInterfaces.MethodCallDisablePaymentLink sdk;

    public DisablePaymentLinkRequestBuilder(SDKMethodInterfaces.MethodCallDisablePaymentLink sdk) {
        this.sdk = sdk;
    }

    public DisablePaymentLinkRequestBuilder security(DisablePaymentLinkSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public DisablePaymentLinkRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public DisablePaymentLinkRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public DisablePaymentLinkRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public DisablePaymentLinkRequestBuilder paymentLinkCode(String paymentLinkCode) {
        Utils.checkNotNull(paymentLinkCode, "paymentLinkCode");
        this.paymentLinkCode = paymentLinkCode;
        return this;
    }

    public DisablePaymentLinkResponse call() throws Exception {

        return sdk.disablePaymentLink(
            security,
            xMoovVersion,
            accountID,
            paymentLinkCode);
    }
}
