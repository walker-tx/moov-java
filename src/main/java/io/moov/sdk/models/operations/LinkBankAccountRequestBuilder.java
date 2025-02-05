/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.BankAccountWaitFor;
import io.moov.sdk.models.components.LinkBankAccount;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class LinkBankAccountRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01\"",
                            new TypeReference<Optional<String>>() {});
    private Optional<? extends BankAccountWaitFor> xWaitFor = Optional.empty();
    private String accountID;
    private LinkBankAccount linkBankAccount;
    private final SDKMethodInterfaces.MethodCallLinkBankAccount sdk;

    public LinkBankAccountRequestBuilder(SDKMethodInterfaces.MethodCallLinkBankAccount sdk) {
        this.sdk = sdk;
    }
                
    public LinkBankAccountRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public LinkBankAccountRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }
                
    public LinkBankAccountRequestBuilder xWaitFor(BankAccountWaitFor xWaitFor) {
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        this.xWaitFor = Optional.of(xWaitFor);
        return this;
    }

    public LinkBankAccountRequestBuilder xWaitFor(Optional<? extends BankAccountWaitFor> xWaitFor) {
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        this.xWaitFor = xWaitFor;
        return this;
    }

    public LinkBankAccountRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public LinkBankAccountRequestBuilder linkBankAccount(LinkBankAccount linkBankAccount) {
        Utils.checkNotNull(linkBankAccount, "linkBankAccount");
        this.linkBankAccount = linkBankAccount;
        return this;
    }

    public LinkBankAccountResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.link(
            xMoovVersion,
            xWaitFor,
            accountID,
            linkBankAccount);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01\"",
                    new TypeReference<Optional<String>>() {});
}
