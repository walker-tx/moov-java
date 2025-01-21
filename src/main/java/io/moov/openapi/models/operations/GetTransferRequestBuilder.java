/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.operations;

import io.moov.openapi.models.components.Versions;
import io.moov.openapi.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetTransferRequestBuilder {

    private GetTransferSecurity security;
    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String transferID;
    private String accountID;
    private final SDKMethodInterfaces.MethodCallGetTransfer sdk;

    public GetTransferRequestBuilder(SDKMethodInterfaces.MethodCallGetTransfer sdk) {
        this.sdk = sdk;
    }

    public GetTransferRequestBuilder security(GetTransferSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public GetTransferRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public GetTransferRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetTransferRequestBuilder transferID(String transferID) {
        Utils.checkNotNull(transferID, "transferID");
        this.transferID = transferID;
        return this;
    }

    public GetTransferRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetTransferResponse call() throws Exception {

        return sdk.getTransfer(
            security,
            xMoovVersion,
            transferID,
            accountID);
    }
}
