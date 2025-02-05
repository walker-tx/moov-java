/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.Long;
import java.lang.String;
import java.util.Optional;

public class ListSchedulesRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01\"",
                            new TypeReference<Optional<String>>() {});
    private Optional<Long> skip = Optional.empty();
    private Optional<Long> count = Optional.empty();
    private String accountID;
    private final SDKMethodInterfaces.MethodCallListSchedules sdk;

    public ListSchedulesRequestBuilder(SDKMethodInterfaces.MethodCallListSchedules sdk) {
        this.sdk = sdk;
    }
                
    public ListSchedulesRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public ListSchedulesRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }
                
    public ListSchedulesRequestBuilder skip(long skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = Optional.of(skip);
        return this;
    }

    public ListSchedulesRequestBuilder skip(Optional<Long> skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = skip;
        return this;
    }
                
    public ListSchedulesRequestBuilder count(long count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.of(count);
        return this;
    }

    public ListSchedulesRequestBuilder count(Optional<Long> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
        return this;
    }

    public ListSchedulesRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public ListSchedulesResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.list(
            xMoovVersion,
            skip,
            count,
            accountID);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01\"",
                    new TypeReference<Optional<String>>() {});
}
