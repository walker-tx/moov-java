/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.operations;

import io.moov.openapi.models.components.Versions;
import io.moov.openapi.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetUnderwritingRequestBuilder {

    private GetUnderwritingSecurity security;
    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private final SDKMethodInterfaces.MethodCallGetUnderwriting sdk;

    public GetUnderwritingRequestBuilder(SDKMethodInterfaces.MethodCallGetUnderwriting sdk) {
        this.sdk = sdk;
    }

    public GetUnderwritingRequestBuilder security(GetUnderwritingSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public GetUnderwritingRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public GetUnderwritingRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetUnderwritingRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetUnderwritingResponse call() throws Exception {

        return sdk.getUnderwriting(
            security,
            xMoovVersion,
            accountID);
    }
}
