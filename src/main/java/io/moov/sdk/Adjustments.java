/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.Adjustment;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.APIException;
import io.moov.sdk.models.operations.GetAdjustmentRequest;
import io.moov.sdk.models.operations.GetAdjustmentRequestBuilder;
import io.moov.sdk.models.operations.GetAdjustmentResponse;
import io.moov.sdk.models.operations.ListAdjustmentsRequest;
import io.moov.sdk.models.operations.ListAdjustmentsRequestBuilder;
import io.moov.sdk.models.operations.ListAdjustmentsResponse;
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

public class Adjustments implements
            MethodCallListAdjustments,
            MethodCallGetAdjustment {

    private final SDKConfiguration sdkConfiguration;

    Adjustments(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * List adjustments associated with a Moov account. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/wallets.read` scope.
     * @return The call builder
     */
    public ListAdjustmentsRequestBuilder list() {
        return new ListAdjustmentsRequestBuilder(this);
    }

    /**
     * List adjustments associated with a Moov account. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/wallets.read` scope.
     * @param accountID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListAdjustmentsResponse list(
            String accountID) throws Exception {
        return list(Optional.empty(), accountID, Optional.empty());
    }
    
    /**
     * List adjustments associated with a Moov account. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/wallets.read` scope.
     * @param xMoovVersion Moov API versions. 

    API versioning follows the format `vYYYY.QQ.BB`, where 
      - `YYYY` is the year
      - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
      - `BB` is an optional build number starting at `.01` for subsequent builds in the same quarter. 
        - If no build number is specified, the version refers to the initial release of the quarter.

    The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     * @param accountID
     * @param walletID A wallet ID to filter adjustments by.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListAdjustmentsResponse list(
            Optional<? extends Versions> xMoovVersion,
            String accountID,
            Optional<String> walletID) throws Exception {
        ListAdjustmentsRequest request =
            ListAdjustmentsRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .walletID(walletID)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                ListAdjustmentsRequest.class,
                _baseUrl,
                "/accounts/{accountID}/adjustments",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListAdjustmentsRequest.class,
                request, 
                this.sdkConfiguration.globals));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "listAdjustments", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "429", "4XX", "500", "504", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "listAdjustments",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "listAdjustments",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "listAdjustments",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListAdjustmentsResponse.Builder _resBuilder = 
            ListAdjustmentsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListAdjustmentsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<Adjustment> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<Adjustment>>() {});
                _res.withAdjustments(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "429", "4XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "500", "504", "5XX")) {
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



    /**
     * Retrieve a specific adjustment associated with a Moov account. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/wallets.read` scope.
     * @return The call builder
     */
    public GetAdjustmentRequestBuilder get() {
        return new GetAdjustmentRequestBuilder(this);
    }

    /**
     * Retrieve a specific adjustment associated with a Moov account. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/wallets.read` scope.
     * @param accountID
     * @param adjustmentID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetAdjustmentResponse get(
            String accountID,
            String adjustmentID) throws Exception {
        return get(Optional.empty(), accountID, adjustmentID);
    }
    
    /**
     * Retrieve a specific adjustment associated with a Moov account. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/wallets.read` scope.
     * @param xMoovVersion Moov API versions. 

    API versioning follows the format `vYYYY.QQ.BB`, where 
      - `YYYY` is the year
      - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
      - `BB` is an optional build number starting at `.01` for subsequent builds in the same quarter. 
        - If no build number is specified, the version refers to the initial release of the quarter.

    The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     * @param accountID
     * @param adjustmentID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetAdjustmentResponse get(
            Optional<? extends Versions> xMoovVersion,
            String accountID,
            String adjustmentID) throws Exception {
        GetAdjustmentRequest request =
            GetAdjustmentRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .adjustmentID(adjustmentID)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetAdjustmentRequest.class,
                _baseUrl,
                "/accounts/{accountID}/adjustments/{adjustmentID}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
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
                      "getAdjustment", 
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
                            "getAdjustment",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getAdjustment",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getAdjustment",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetAdjustmentResponse.Builder _resBuilder = 
            GetAdjustmentResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetAdjustmentResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Adjustment _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Adjustment>() {});
                _res.withAdjustment(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "404", "429", "4XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "500", "504", "5XX")) {
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
