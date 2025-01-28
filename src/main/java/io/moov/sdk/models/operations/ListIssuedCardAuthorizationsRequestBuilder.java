/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.utils.Utils;

public class ListIssuedCardAuthorizationsRequestBuilder {

    private ListIssuedCardAuthorizationsRequest request;
    private final SDKMethodInterfaces.MethodCallListIssuedCardAuthorizations sdk;

    public ListIssuedCardAuthorizationsRequestBuilder(SDKMethodInterfaces.MethodCallListIssuedCardAuthorizations sdk) {
        this.sdk = sdk;
    }

    public ListIssuedCardAuthorizationsRequestBuilder request(ListIssuedCardAuthorizationsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListIssuedCardAuthorizationsResponse call() throws Exception {

        return sdk.listAuthorizations(
            request);
    }
}
