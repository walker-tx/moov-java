/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class DeleteTerminalApplicationRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01.00\"",
                            new TypeReference<Optional<String>>() {});
    private String terminalApplicationID;
    private final SDKMethodInterfaces.MethodCallDeleteTerminalApplication sdk;

    public DeleteTerminalApplicationRequestBuilder(SDKMethodInterfaces.MethodCallDeleteTerminalApplication sdk) {
        this.sdk = sdk;
    }
                
    public DeleteTerminalApplicationRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public DeleteTerminalApplicationRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public DeleteTerminalApplicationRequestBuilder terminalApplicationID(String terminalApplicationID) {
        Utils.checkNotNull(terminalApplicationID, "terminalApplicationID");
        this.terminalApplicationID = terminalApplicationID;
        return this;
    }

    public DeleteTerminalApplicationResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.delete(
            xMoovVersion,
            terminalApplicationID);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01.00\"",
                    new TypeReference<Optional<String>>() {});
}
