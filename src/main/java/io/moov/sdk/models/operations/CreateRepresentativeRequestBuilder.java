/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.CreateRepresentative;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CreateRepresentativeRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01\"",
                            new TypeReference<Optional<String>>() {});
    private String accountID;
    private CreateRepresentative createRepresentative;
    private final SDKMethodInterfaces.MethodCallCreateRepresentative sdk;

    public CreateRepresentativeRequestBuilder(SDKMethodInterfaces.MethodCallCreateRepresentative sdk) {
        this.sdk = sdk;
    }
                
    public CreateRepresentativeRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public CreateRepresentativeRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public CreateRepresentativeRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public CreateRepresentativeRequestBuilder createRepresentative(CreateRepresentative createRepresentative) {
        Utils.checkNotNull(createRepresentative, "createRepresentative");
        this.createRepresentative = createRepresentative;
        return this;
    }

    public CreateRepresentativeResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.create(
            xMoovVersion,
            accountID,
            createRepresentative);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01\"",
                    new TypeReference<Optional<String>>() {});
}
