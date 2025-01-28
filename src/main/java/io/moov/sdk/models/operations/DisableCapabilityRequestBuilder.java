/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.CapabilityID;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class DisableCapabilityRequestBuilder {

    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private CapabilityID capabilityID;
    private final SDKMethodInterfaces.MethodCallDisableCapability sdk;

    public DisableCapabilityRequestBuilder(SDKMethodInterfaces.MethodCallDisableCapability sdk) {
        this.sdk = sdk;
    }
                
    public DisableCapabilityRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public DisableCapabilityRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
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

        return sdk.disable(
            xMoovVersion,
            accountID,
            capabilityID);
    }
}
