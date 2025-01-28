/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk;

import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.APIException;
import io.moov.sdk.models.operations.PingRequest;
import io.moov.sdk.models.operations.PingRequestBuilder;
import io.moov.sdk.models.operations.PingResponse;
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

public class Ping implements
            MethodCallPing {

    private final SDKConfiguration sdkConfiguration;

    Ping(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * A simple endpoint to check auth. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/ping.read` scope.
     * @return The call builder
     */
    public PingRequestBuilder ping() {
        return new PingRequestBuilder(this);
    }

    /**
     * A simple endpoint to check auth. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/ping.read` scope.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PingResponse pingDirect() throws Exception {
        return ping(Optional.empty());
    }
    
    /**
     * A simple endpoint to check auth. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/ping.read` scope.
     * @param xMoovVersion Moov API versions. 

    API versioning follows the format `vYYYY.QQ.BB`, where 
      - `YYYY` is the year
      - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
      - `BB` is an optional build number starting at `.01` for subsequent builds in the same quarter. 
        - If no build number is specified, the version refers to the initial release of the quarter.

    The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PingResponse ping(
            Optional<? extends Versions> xMoovVersion) throws Exception {
        PingRequest request =
            PingRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/ping");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "*/*")
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
                      "ping", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "404", "429", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ping",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "ping",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ping",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        PingResponse.Builder _resBuilder = 
            PingResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        PingResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "404", "429", "4XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "500", "5XX")) {
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
