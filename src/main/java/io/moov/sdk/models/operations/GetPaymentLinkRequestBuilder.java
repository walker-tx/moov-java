/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetPaymentLinkRequestBuilder {

    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private String paymentLinkCode;
    private final SDKMethodInterfaces.MethodCallGetPaymentLink sdk;

    public GetPaymentLinkRequestBuilder(SDKMethodInterfaces.MethodCallGetPaymentLink sdk) {
        this.sdk = sdk;
    }
                
    public GetPaymentLinkRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public GetPaymentLinkRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetPaymentLinkRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetPaymentLinkRequestBuilder paymentLinkCode(String paymentLinkCode) {
        Utils.checkNotNull(paymentLinkCode, "paymentLinkCode");
        this.paymentLinkCode = paymentLinkCode;
        return this;
    }

    public GetPaymentLinkResponse call() throws Exception {

        return sdk.get(
            xMoovVersion,
            accountID,
            paymentLinkCode);
    }
}
