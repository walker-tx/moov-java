/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetSweepRequestBuilder {

    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private String walletID;
    private String sweepID;
    private final SDKMethodInterfaces.MethodCallGetSweep sdk;

    public GetSweepRequestBuilder(SDKMethodInterfaces.MethodCallGetSweep sdk) {
        this.sdk = sdk;
    }
                
    public GetSweepRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public GetSweepRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetSweepRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetSweepRequestBuilder walletID(String walletID) {
        Utils.checkNotNull(walletID, "walletID");
        this.walletID = walletID;
        return this;
    }

    public GetSweepRequestBuilder sweepID(String sweepID) {
        Utils.checkNotNull(sweepID, "sweepID");
        this.sweepID = sweepID;
        return this;
    }

    public GetSweepResponse call() throws Exception {

        return sdk.get(
            xMoovVersion,
            accountID,
            walletID,
            sweepID);
    }
}
