/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.IssuedCardAuthorization;
import io.moov.sdk.models.components.IssuedCardAuthorizationEvent;
import io.moov.sdk.models.components.IssuedCardTransaction;
import io.moov.sdk.models.errors.APIException;
import io.moov.sdk.models.operations.GetIssuedCardAuthorizationRequest;
import io.moov.sdk.models.operations.GetIssuedCardAuthorizationRequestBuilder;
import io.moov.sdk.models.operations.GetIssuedCardAuthorizationResponse;
import io.moov.sdk.models.operations.GetIssuedCardTransactionRequest;
import io.moov.sdk.models.operations.GetIssuedCardTransactionRequestBuilder;
import io.moov.sdk.models.operations.GetIssuedCardTransactionResponse;
import io.moov.sdk.models.operations.ListIssuedCardAuthorizationEventsRequest;
import io.moov.sdk.models.operations.ListIssuedCardAuthorizationEventsRequestBuilder;
import io.moov.sdk.models.operations.ListIssuedCardAuthorizationEventsResponse;
import io.moov.sdk.models.operations.ListIssuedCardAuthorizationsRequest;
import io.moov.sdk.models.operations.ListIssuedCardAuthorizationsRequestBuilder;
import io.moov.sdk.models.operations.ListIssuedCardAuthorizationsResponse;
import io.moov.sdk.models.operations.ListIssuedCardTransactionsRequest;
import io.moov.sdk.models.operations.ListIssuedCardTransactionsRequestBuilder;
import io.moov.sdk.models.operations.ListIssuedCardTransactionsResponse;
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

public class IssuingTransactions implements
            MethodCallListIssuedCardAuthorizations,
            MethodCallGetIssuedCardAuthorization,
            MethodCallListIssuedCardAuthorizationEvents,
            MethodCallListIssuedCardTransactions,
            MethodCallGetIssuedCardTransaction {

    private final SDKConfiguration sdkConfiguration;

    IssuingTransactions(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * List issued card authorizations associated with a Moov account. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
     * @return The call builder
     */
    public ListIssuedCardAuthorizationsRequestBuilder listAuthorizations() {
        return new ListIssuedCardAuthorizationsRequestBuilder(this);
    }

    /**
     * List issued card authorizations associated with a Moov account. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListIssuedCardAuthorizationsResponse listAuthorizations(
            ListIssuedCardAuthorizationsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                ListIssuedCardAuthorizationsRequest.class,
                _baseUrl,
                "/issuing/{accountID}/authorizations",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListIssuedCardAuthorizationsRequest.class,
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
                      "listIssuedCardAuthorizations", 
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
                            "listIssuedCardAuthorizations",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "listIssuedCardAuthorizations",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "listIssuedCardAuthorizations",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListIssuedCardAuthorizationsResponse.Builder _resBuilder = 
            ListIssuedCardAuthorizationsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListIssuedCardAuthorizationsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<IssuedCardAuthorization> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<IssuedCardAuthorization>>() {});
                _res.withIssuedCardAuthorizations(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "429")) {
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



    /**
     * Retrieves details of an authorization associated with a specific Moov account. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
     * @return The call builder
     */
    public GetIssuedCardAuthorizationRequestBuilder getAuthorization() {
        return new GetIssuedCardAuthorizationRequestBuilder(this);
    }

    /**
     * Retrieves details of an authorization associated with a specific Moov account. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
     * @param accountID The Moov business account for which cards have been issued.
     * @param authorizationID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetIssuedCardAuthorizationResponse getAuthorization(
            String accountID,
            String authorizationID) throws Exception {
        return getAuthorization(Optional.empty(), accountID, authorizationID);
    }
    
    /**
     * Retrieves details of an authorization associated with a specific Moov account. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
     * @param xMoovVersion Specify an API version.

    API versioning follows the format `vYYYY.QQ.BB`, where 
      - `YYYY` is the year
      - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
      - `BB` is an **optional** build number starting at `.01` for subsequent builds in the same quarter. 
        - If no build number is specified, the version refers to the initial release of the quarter.

    The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     * @param accountID The Moov business account for which cards have been issued.
     * @param authorizationID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetIssuedCardAuthorizationResponse getAuthorization(
            Optional<String> xMoovVersion,
            String accountID,
            String authorizationID) throws Exception {
        GetIssuedCardAuthorizationRequest request =
            GetIssuedCardAuthorizationRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .authorizationID(authorizationID)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetIssuedCardAuthorizationRequest.class,
                _baseUrl,
                "/issuing/{accountID}/authorizations/{authorizationID}",
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
                      "getIssuedCardAuthorization", 
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
                            "getIssuedCardAuthorization",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getIssuedCardAuthorization",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getIssuedCardAuthorization",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetIssuedCardAuthorizationResponse.Builder _resBuilder = 
            GetIssuedCardAuthorizationResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetIssuedCardAuthorizationResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                IssuedCardAuthorization _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<IssuedCardAuthorization>() {});
                _res.withIssuedCardAuthorization(Optional.ofNullable(_out));
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



    /**
     * List card network and Moov platform events that affect the authorization and its hold on a wallet balance. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
     * @return The call builder
     */
    public ListIssuedCardAuthorizationEventsRequestBuilder listAuthorizationEvents() {
        return new ListIssuedCardAuthorizationEventsRequestBuilder(this);
    }

    /**
     * List card network and Moov platform events that affect the authorization and its hold on a wallet balance. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListIssuedCardAuthorizationEventsResponse listAuthorizationEvents(
            ListIssuedCardAuthorizationEventsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                ListIssuedCardAuthorizationEventsRequest.class,
                _baseUrl,
                "/issuing/{accountID}/authorizations/{authorizationID}/events",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListIssuedCardAuthorizationEventsRequest.class,
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
                      "listIssuedCardAuthorizationEvents", 
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
                            "listIssuedCardAuthorizationEvents",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "listIssuedCardAuthorizationEvents",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "listIssuedCardAuthorizationEvents",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListIssuedCardAuthorizationEventsResponse.Builder _resBuilder = 
            ListIssuedCardAuthorizationEventsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListIssuedCardAuthorizationEventsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<IssuedCardAuthorizationEvent> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<IssuedCardAuthorizationEvent>>() {});
                _res.withIssuedCardAuthorizationEvents(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "429")) {
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



    /**
     * List issued card transactions associated with a Moov account. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
     * @return The call builder
     */
    public ListIssuedCardTransactionsRequestBuilder list() {
        return new ListIssuedCardTransactionsRequestBuilder(this);
    }

    /**
     * List issued card transactions associated with a Moov account. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListIssuedCardTransactionsResponse list(
            ListIssuedCardTransactionsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                ListIssuedCardTransactionsRequest.class,
                _baseUrl,
                "/issuing/{accountID}/card-transactions",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListIssuedCardTransactionsRequest.class,
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
                      "listIssuedCardTransactions", 
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
                            "listIssuedCardTransactions",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "listIssuedCardTransactions",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "listIssuedCardTransactions",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListIssuedCardTransactionsResponse.Builder _resBuilder = 
            ListIssuedCardTransactionsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListIssuedCardTransactionsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<IssuedCardTransaction> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<IssuedCardTransaction>>() {});
                _res.withIssuedCardTransactions(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "429")) {
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



    /**
     * Retrieves details of an issued card transaction associated with a specific Moov account. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
     * @return The call builder
     */
    public GetIssuedCardTransactionRequestBuilder get() {
        return new GetIssuedCardTransactionRequestBuilder(this);
    }

    /**
     * Retrieves details of an issued card transaction associated with a specific Moov account. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
     * @param accountID The Moov business account for which cards have been issued.
     * @param cardTransactionID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetIssuedCardTransactionResponse get(
            String accountID,
            String cardTransactionID) throws Exception {
        return get(Optional.empty(), accountID, cardTransactionID);
    }
    
    /**
     * Retrieves details of an issued card transaction associated with a specific Moov account. -  - To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)  - you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
     * @param xMoovVersion Specify an API version.

    API versioning follows the format `vYYYY.QQ.BB`, where 
      - `YYYY` is the year
      - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
      - `BB` is an **optional** build number starting at `.01` for subsequent builds in the same quarter. 
        - If no build number is specified, the version refers to the initial release of the quarter.

    The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     * @param accountID The Moov business account for which cards have been issued.
     * @param cardTransactionID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetIssuedCardTransactionResponse get(
            Optional<String> xMoovVersion,
            String accountID,
            String cardTransactionID) throws Exception {
        GetIssuedCardTransactionRequest request =
            GetIssuedCardTransactionRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .cardTransactionID(cardTransactionID)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetIssuedCardTransactionRequest.class,
                _baseUrl,
                "/issuing/{accountID}/card-transactions/{cardTransactionID}",
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
                      "getIssuedCardTransaction", 
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
                            "getIssuedCardTransaction",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getIssuedCardTransaction",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getIssuedCardTransaction",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetIssuedCardTransactionResponse.Builder _resBuilder = 
            GetIssuedCardTransactionResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetIssuedCardTransactionResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                IssuedCardTransaction _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<IssuedCardTransaction>() {});
                _res.withIssuedCardTransaction(Optional.ofNullable(_out));
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
