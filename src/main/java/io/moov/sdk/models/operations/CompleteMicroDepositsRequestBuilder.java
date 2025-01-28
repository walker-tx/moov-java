/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.CompleteMicroDeposits;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CompleteMicroDepositsRequestBuilder {

    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private String bankAccountID;
    private CompleteMicroDeposits completeMicroDeposits;
    private final SDKMethodInterfaces.MethodCallCompleteMicroDeposits sdk;

    public CompleteMicroDepositsRequestBuilder(SDKMethodInterfaces.MethodCallCompleteMicroDeposits sdk) {
        this.sdk = sdk;
    }
                
    public CompleteMicroDepositsRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public CompleteMicroDepositsRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public CompleteMicroDepositsRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public CompleteMicroDepositsRequestBuilder bankAccountID(String bankAccountID) {
        Utils.checkNotNull(bankAccountID, "bankAccountID");
        this.bankAccountID = bankAccountID;
        return this;
    }

    public CompleteMicroDepositsRequestBuilder completeMicroDeposits(CompleteMicroDeposits completeMicroDeposits) {
        Utils.checkNotNull(completeMicroDeposits, "completeMicroDeposits");
        this.completeMicroDeposits = completeMicroDeposits;
        return this;
    }

    public CompleteMicroDepositsResponse call() throws Exception {

        return sdk.completeMicroDeposits(
            xMoovVersion,
            accountID,
            bankAccountID,
            completeMicroDeposits);
    }
}
