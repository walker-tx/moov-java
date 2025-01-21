/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.operations;

import io.moov.openapi.models.components.Versions;
import io.moov.openapi.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetPaymentMethodRequestBuilder {

    private GetPaymentMethodSecurity security;
    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private String paymentMethodID;
    private final SDKMethodInterfaces.MethodCallGetPaymentMethod sdk;

    public GetPaymentMethodRequestBuilder(SDKMethodInterfaces.MethodCallGetPaymentMethod sdk) {
        this.sdk = sdk;
    }

    public GetPaymentMethodRequestBuilder security(GetPaymentMethodSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public GetPaymentMethodRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public GetPaymentMethodRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetPaymentMethodRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetPaymentMethodRequestBuilder paymentMethodID(String paymentMethodID) {
        Utils.checkNotNull(paymentMethodID, "paymentMethodID");
        this.paymentMethodID = paymentMethodID;
        return this;
    }

    public GetPaymentMethodResponse call() throws Exception {

        return sdk.getPaymentMethod(
            security,
            xMoovVersion,
            accountID,
            paymentMethodID);
    }
}
