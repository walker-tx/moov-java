/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.operations;

import io.moov.openapi.models.components.Versions;
import io.moov.openapi.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetFileDetailsRequestBuilder {

    private GetFileDetailsSecurity security;
    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private String fileID;
    private final SDKMethodInterfaces.MethodCallGetFileDetails sdk;

    public GetFileDetailsRequestBuilder(SDKMethodInterfaces.MethodCallGetFileDetails sdk) {
        this.sdk = sdk;
    }

    public GetFileDetailsRequestBuilder security(GetFileDetailsSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public GetFileDetailsRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public GetFileDetailsRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetFileDetailsRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetFileDetailsRequestBuilder fileID(String fileID) {
        Utils.checkNotNull(fileID, "fileID");
        this.fileID = fileID;
        return this;
    }

    public GetFileDetailsResponse call() throws Exception {

        return sdk.getFileDetails(
            security,
            xMoovVersion,
            accountID,
            fileID);
    }
}
