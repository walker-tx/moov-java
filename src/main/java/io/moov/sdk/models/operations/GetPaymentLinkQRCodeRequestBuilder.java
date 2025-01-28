/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetPaymentLinkQRCodeRequestBuilder {

    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private String paymentLinkCode;
    private final SDKMethodInterfaces.MethodCallGetPaymentLinkQRCode sdk;

    public GetPaymentLinkQRCodeRequestBuilder(SDKMethodInterfaces.MethodCallGetPaymentLinkQRCode sdk) {
        this.sdk = sdk;
    }
                
    public GetPaymentLinkQRCodeRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public GetPaymentLinkQRCodeRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetPaymentLinkQRCodeRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetPaymentLinkQRCodeRequestBuilder paymentLinkCode(String paymentLinkCode) {
        Utils.checkNotNull(paymentLinkCode, "paymentLinkCode");
        this.paymentLinkCode = paymentLinkCode;
        return this;
    }

    public GetPaymentLinkQRCodeResponse call() throws Exception {

        return sdk.getQRCode(
            xMoovVersion,
            accountID,
            paymentLinkCode);
    }
}
