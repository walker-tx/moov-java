/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetTermsOfServiceTokenRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01\"",
                            new TypeReference<Optional<String>>() {});
    private Optional<String> origin = Optional.empty();
    private Optional<String> referer = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetTermsOfServiceToken sdk;

    public GetTermsOfServiceTokenRequestBuilder(SDKMethodInterfaces.MethodCallGetTermsOfServiceToken sdk) {
        this.sdk = sdk;
    }
                
    public GetTermsOfServiceTokenRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public GetTermsOfServiceTokenRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }
                
    public GetTermsOfServiceTokenRequestBuilder origin(String origin) {
        Utils.checkNotNull(origin, "origin");
        this.origin = Optional.of(origin);
        return this;
    }

    public GetTermsOfServiceTokenRequestBuilder origin(Optional<String> origin) {
        Utils.checkNotNull(origin, "origin");
        this.origin = origin;
        return this;
    }
                
    public GetTermsOfServiceTokenRequestBuilder referer(String referer) {
        Utils.checkNotNull(referer, "referer");
        this.referer = Optional.of(referer);
        return this;
    }

    public GetTermsOfServiceTokenRequestBuilder referer(Optional<String> referer) {
        Utils.checkNotNull(referer, "referer");
        this.referer = referer;
        return this;
    }

    public GetTermsOfServiceTokenResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.getTermsOfServiceToken(
            xMoovVersion,
            origin,
            referer);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01\"",
                    new TypeReference<Optional<String>>() {});
}
