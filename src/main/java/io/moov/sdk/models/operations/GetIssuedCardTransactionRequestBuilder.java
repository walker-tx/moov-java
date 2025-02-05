/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetIssuedCardTransactionRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01\"",
                            new TypeReference<Optional<String>>() {});
    private String accountID;
    private String cardTransactionID;
    private final SDKMethodInterfaces.MethodCallGetIssuedCardTransaction sdk;

    public GetIssuedCardTransactionRequestBuilder(SDKMethodInterfaces.MethodCallGetIssuedCardTransaction sdk) {
        this.sdk = sdk;
    }
                
    public GetIssuedCardTransactionRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public GetIssuedCardTransactionRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetIssuedCardTransactionRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetIssuedCardTransactionRequestBuilder cardTransactionID(String cardTransactionID) {
        Utils.checkNotNull(cardTransactionID, "cardTransactionID");
        this.cardTransactionID = cardTransactionID;
        return this;
    }

    public GetIssuedCardTransactionResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.get(
            xMoovVersion,
            accountID,
            cardTransactionID);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01\"",
                    new TypeReference<Optional<String>>() {});
}
