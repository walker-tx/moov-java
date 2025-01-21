/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.operations;

import io.moov.openapi.models.components.Versions;
import io.moov.openapi.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetSchedulesRequestBuilder {

    private GetSchedulesSecurity security;
    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private String scheduleID;
    private final SDKMethodInterfaces.MethodCallGetSchedules sdk;

    public GetSchedulesRequestBuilder(SDKMethodInterfaces.MethodCallGetSchedules sdk) {
        this.sdk = sdk;
    }

    public GetSchedulesRequestBuilder security(GetSchedulesSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public GetSchedulesRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public GetSchedulesRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetSchedulesRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetSchedulesRequestBuilder scheduleID(String scheduleID) {
        Utils.checkNotNull(scheduleID, "scheduleID");
        this.scheduleID = scheduleID;
        return this;
    }

    public GetSchedulesResponse call() throws Exception {

        return sdk.getSchedules(
            security,
            xMoovVersion,
            accountID,
            scheduleID);
    }
}
