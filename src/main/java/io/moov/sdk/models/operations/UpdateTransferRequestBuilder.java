/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class UpdateTransferRequestBuilder {

    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String transferID;
    private String accountID;
    private final SDKMethodInterfaces.MethodCallUpdateTransfer sdk;

    public UpdateTransferRequestBuilder(SDKMethodInterfaces.MethodCallUpdateTransfer sdk) {
        this.sdk = sdk;
    }
                
    public UpdateTransferRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public UpdateTransferRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public UpdateTransferRequestBuilder transferID(String transferID) {
        Utils.checkNotNull(transferID, "transferID");
        this.transferID = transferID;
        return this;
    }

    public UpdateTransferRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public UpdateTransferResponse call() throws Exception {

        return sdk.update(
            xMoovVersion,
            transferID,
            accountID);
    }
}
