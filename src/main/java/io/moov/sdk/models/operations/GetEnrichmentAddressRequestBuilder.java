/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.utils.Utils;
import java.lang.Exception;

public class GetEnrichmentAddressRequestBuilder {

    private GetEnrichmentAddressRequest request;
    private final SDKMethodInterfaces.MethodCallGetEnrichmentAddress sdk;

    public GetEnrichmentAddressRequestBuilder(SDKMethodInterfaces.MethodCallGetEnrichmentAddress sdk) {
        this.sdk = sdk;
    }

    public GetEnrichmentAddressRequestBuilder request(GetEnrichmentAddressRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetEnrichmentAddressResponse call() throws Exception {

        return sdk.get(
            request);
    }
}
