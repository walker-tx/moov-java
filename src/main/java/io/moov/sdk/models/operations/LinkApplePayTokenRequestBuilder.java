/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.LinkApplePay;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class LinkApplePayTokenRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01\"",
                            new TypeReference<Optional<String>>() {});
    private String accountID;
    private LinkApplePay linkApplePay;
    private final SDKMethodInterfaces.MethodCallLinkApplePayToken sdk;

    public LinkApplePayTokenRequestBuilder(SDKMethodInterfaces.MethodCallLinkApplePayToken sdk) {
        this.sdk = sdk;
    }
                
    public LinkApplePayTokenRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public LinkApplePayTokenRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public LinkApplePayTokenRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public LinkApplePayTokenRequestBuilder linkApplePay(LinkApplePay linkApplePay) {
        Utils.checkNotNull(linkApplePay, "linkApplePay");
        this.linkApplePay = linkApplePay;
        return this;
    }

    public LinkApplePayTokenResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.linkToken(
            xMoovVersion,
            accountID,
            linkApplePay);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01\"",
                    new TypeReference<Optional<String>>() {});
}
