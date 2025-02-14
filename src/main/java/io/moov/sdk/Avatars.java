/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk;

import io.moov.sdk.models.errors.APIException;
import io.moov.sdk.models.operations.GetAvatarRequest;
import io.moov.sdk.models.operations.GetAvatarRequestBuilder;
import io.moov.sdk.models.operations.GetAvatarResponse;
import io.moov.sdk.models.operations.SDKMethodInterfaces.*;
import io.moov.sdk.utils.HTTPClient;
import io.moov.sdk.utils.HTTPRequest;
import io.moov.sdk.utils.Hook.AfterErrorContextImpl;
import io.moov.sdk.utils.Hook.AfterSuccessContextImpl;
import io.moov.sdk.utils.Hook.BeforeRequestContextImpl;
import io.moov.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

public class Avatars implements
            MethodCallGetAvatar {

    private final SDKConfiguration sdkConfiguration;

    Avatars(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get avatar image for an account using a unique ID.     -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/profile-enrichment.read` scope.
     * @return The call builder
     */
    public GetAvatarRequestBuilder get() {
        return new GetAvatarRequestBuilder(this);
    }

    /**
     * Get avatar image for an account using a unique ID.     -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/profile-enrichment.read` scope.
     * @param uniqueID Any unique ID associated with an account such as accountID, representativeID, routing number, or userID.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetAvatarResponse get(
            String uniqueID) throws Exception {
        return get(Optional.empty(), uniqueID);
    }
    
    /**
     * Get avatar image for an account using a unique ID.     -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/profile-enrichment.read` scope.
     * @param xMoovVersion Specify an API version.

    API versioning follows the format `vYYYY.QQ.BB`, where 
      - `YYYY` is the year
      - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
      - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
        - For example, `v2024.01.00` is the initial release of the first quarter of 2024.

    The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     * @param uniqueID Any unique ID associated with an account such as accountID, representativeID, routing number, or userID.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetAvatarResponse get(
            Optional<String> xMoovVersion,
            String uniqueID) throws Exception {
        GetAvatarRequest request =
            GetAvatarRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .uniqueID(uniqueID)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetAvatarRequest.class,
                _baseUrl,
                "/avatars/{uniqueID}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "image/*")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "getAvatar", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "404", "429", "4XX", "500", "504", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getAvatar",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getAvatar",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getAvatar",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetAvatarResponse.Builder _resBuilder = 
            GetAvatarResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200") && Utils.contentTypeMatches(_contentType, "image/*")) {
            _resBuilder.responseStream(_httpRes.body());
        }

        GetAvatarResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "image/*")) {
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "404", "429")) {
            _res.withHeaders(_httpRes.headers().map());
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "500", "504")) {
            _res.withHeaders(_httpRes.headers().map());
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new APIException(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}
