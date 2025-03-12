/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.utils.Utils;

public class ListSchedulesRequestBuilder {

    private ListSchedulesRequest request;
    private final SDKMethodInterfaces.MethodCallListSchedules sdk;

    public ListSchedulesRequestBuilder(SDKMethodInterfaces.MethodCallListSchedules sdk) {
        this.sdk = sdk;
    }

    public ListSchedulesRequestBuilder request(ListSchedulesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListSchedulesResponse call() throws Exception {

        return sdk.list(
            request);
    }
}
