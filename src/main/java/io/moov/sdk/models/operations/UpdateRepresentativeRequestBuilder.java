/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.UpdateRepresentative;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class UpdateRepresentativeRequestBuilder {

    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private String representativeID;
    private UpdateRepresentative updateRepresentative;
    private final SDKMethodInterfaces.MethodCallUpdateRepresentative sdk;

    public UpdateRepresentativeRequestBuilder(SDKMethodInterfaces.MethodCallUpdateRepresentative sdk) {
        this.sdk = sdk;
    }
                
    public UpdateRepresentativeRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public UpdateRepresentativeRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public UpdateRepresentativeRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public UpdateRepresentativeRequestBuilder representativeID(String representativeID) {
        Utils.checkNotNull(representativeID, "representativeID");
        this.representativeID = representativeID;
        return this;
    }

    public UpdateRepresentativeRequestBuilder updateRepresentative(UpdateRepresentative updateRepresentative) {
        Utils.checkNotNull(updateRepresentative, "updateRepresentative");
        this.updateRepresentative = updateRepresentative;
        return this;
    }

    public UpdateRepresentativeResponse call() throws Exception {

        return sdk.update(
            xMoovVersion,
            accountID,
            representativeID,
            updateRepresentative);
    }
}
