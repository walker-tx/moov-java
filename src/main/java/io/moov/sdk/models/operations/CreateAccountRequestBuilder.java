/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.CreateAccount;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.util.Optional;

public class CreateAccountRequestBuilder {

    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private CreateAccount createAccount;
    private final SDKMethodInterfaces.MethodCallCreateAccount sdk;

    public CreateAccountRequestBuilder(SDKMethodInterfaces.MethodCallCreateAccount sdk) {
        this.sdk = sdk;
    }
                
    public CreateAccountRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public CreateAccountRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public CreateAccountRequestBuilder createAccount(CreateAccount createAccount) {
        Utils.checkNotNull(createAccount, "createAccount");
        this.createAccount = createAccount;
        return this;
    }

    public CreateAccountResponse call() throws Exception {

        return sdk.create(
            xMoovVersion,
            createAccount);
    }
}
