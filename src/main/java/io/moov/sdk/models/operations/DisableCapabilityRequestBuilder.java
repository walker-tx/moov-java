/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.CapabilityID;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class DisableCapabilityRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01\"",
                            new TypeReference<Optional<String>>() {});
    private String accountID;
    private CapabilityID capabilityID;
    private final SDKMethodInterfaces.MethodCallDisableCapability sdk;

    public DisableCapabilityRequestBuilder(SDKMethodInterfaces.MethodCallDisableCapability sdk) {
        this.sdk = sdk;
    }
                
    public DisableCapabilityRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public DisableCapabilityRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public DisableCapabilityRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public DisableCapabilityRequestBuilder capabilityID(CapabilityID capabilityID) {
        Utils.checkNotNull(capabilityID, "capabilityID");
        this.capabilityID = capabilityID;
        return this;
    }

    public DisableCapabilityResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.disable(
            xMoovVersion,
            accountID,
            capabilityID);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01\"",
                    new TypeReference<Optional<String>>() {});
}
