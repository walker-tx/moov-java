/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.UpdateIssuedCard;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class UpdateIssuedCardRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01.00\"",
                            new TypeReference<Optional<String>>() {});
    private String accountID;
    private String issuedCardID;
    private UpdateIssuedCard updateIssuedCard;
    private final SDKMethodInterfaces.MethodCallUpdateIssuedCard sdk;

    public UpdateIssuedCardRequestBuilder(SDKMethodInterfaces.MethodCallUpdateIssuedCard sdk) {
        this.sdk = sdk;
    }
                
    public UpdateIssuedCardRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public UpdateIssuedCardRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public UpdateIssuedCardRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public UpdateIssuedCardRequestBuilder issuedCardID(String issuedCardID) {
        Utils.checkNotNull(issuedCardID, "issuedCardID");
        this.issuedCardID = issuedCardID;
        return this;
    }

    public UpdateIssuedCardRequestBuilder updateIssuedCard(UpdateIssuedCard updateIssuedCard) {
        Utils.checkNotNull(updateIssuedCard, "updateIssuedCard");
        this.updateIssuedCard = updateIssuedCard;
        return this;
    }

    public UpdateIssuedCardResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.update(
            xMoovVersion,
            accountID,
            issuedCardID,
            updateIssuedCard);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01.00\"",
                    new TypeReference<Optional<String>>() {});
}
