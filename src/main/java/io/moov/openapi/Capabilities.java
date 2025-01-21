/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.openapi.models.components.AddCapabilities;
import io.moov.openapi.models.components.Capability;
import io.moov.openapi.models.components.CapabilityID;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.APIException;
import io.moov.openapi.models.errors.AddCapabilitiesError;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.AddCapabilitiesRequest;
import io.moov.openapi.models.operations.AddCapabilitiesRequestBuilder;
import io.moov.openapi.models.operations.AddCapabilitiesResponse;
import io.moov.openapi.models.operations.AddCapabilitiesSecurity;
import io.moov.openapi.models.operations.DisableCapabilityRequest;
import io.moov.openapi.models.operations.DisableCapabilityRequestBuilder;
import io.moov.openapi.models.operations.DisableCapabilityResponse;
import io.moov.openapi.models.operations.DisableCapabilitySecurity;
import io.moov.openapi.models.operations.GetCapabilityRequest;
import io.moov.openapi.models.operations.GetCapabilityRequestBuilder;
import io.moov.openapi.models.operations.GetCapabilityResponse;
import io.moov.openapi.models.operations.GetCapabilitySecurity;
import io.moov.openapi.models.operations.ListCapabilitiesRequest;
import io.moov.openapi.models.operations.ListCapabilitiesRequestBuilder;
import io.moov.openapi.models.operations.ListCapabilitiesResponse;
import io.moov.openapi.models.operations.ListCapabilitiesSecurity;
import io.moov.openapi.models.operations.SDKMethodInterfaces.*;
import io.moov.openapi.utils.HTTPClient;
import io.moov.openapi.utils.HTTPRequest;
import io.moov.openapi.utils.Hook.AfterErrorContextImpl;
import io.moov.openapi.utils.Hook.AfterSuccessContextImpl;
import io.moov.openapi.utils.Hook.BeforeRequestContextImpl;
import io.moov.openapi.utils.SerializedBody;
import io.moov.openapi.utils.Utils.JsonShape;
import io.moov.openapi.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

public class Capabilities implements
            MethodCallListCapabilities,
            MethodCallAddCapabilities,
            MethodCallGetCapability,
            MethodCallDisableCapability {

    private final SDKConfiguration sdkConfiguration;

    Capabilities(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Retrieve all the capabilities an account has requested. -  - Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.
     * @return The call builder
     */
    public ListCapabilitiesRequestBuilder listCapabilities() {
        return new ListCapabilitiesRequestBuilder(this);
    }

    /**
     * Retrieve all the capabilities an account has requested. -  - Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.
     * @param security The security details to use for authentication.
     * @param accountID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListCapabilitiesResponse listCapabilities(
            ListCapabilitiesSecurity security,
            String accountID) throws Exception {
        return listCapabilities(security, Optional.empty(), accountID);
    }
    
    /**
     * Retrieve all the capabilities an account has requested. -  - Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.
     * @param security The security details to use for authentication.
     * @param xMoovVersion Moov API versions. Version strings are formatted as `vYYYY.MM.DD`, except preVerioned and latest.
     * @param accountID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListCapabilitiesResponse listCapabilities(
            ListCapabilitiesSecurity security,
            Optional<? extends Versions> xMoovVersion,
            String accountID) throws Exception {
        ListCapabilitiesRequest request =
            ListCapabilitiesRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                ListCapabilitiesRequest.class,
                _baseUrl,
                "/accounts/{accountID}/capabilities",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, null));
        
        // hooks will have access to global security options
        // TODO pass the method level security object to hooks (type system doesn't allow 
        // it, would require some reflection work)
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req, security);
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "listCapabilities", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "429", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "listCapabilities",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "listCapabilities",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "listCapabilities",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListCapabilitiesResponse.Builder _resBuilder = 
            ListCapabilitiesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListCapabilitiesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<Capability> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<Capability>>() {});
                _res.withCapabilities(Optional.ofNullable(_out));
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
     * Request capabilities for a specific account. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more. -  - To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/capabilities.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @return The call builder
     */
    public AddCapabilitiesRequestBuilder addCapabilities() {
        return new AddCapabilitiesRequestBuilder(this);
    }

    /**
     * Request capabilities for a specific account. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more. -  - To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/capabilities.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @param security The security details to use for authentication.
     * @param accountID
     * @param addCapabilities
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AddCapabilitiesResponse addCapabilities(
            AddCapabilitiesSecurity security,
            String accountID,
            AddCapabilities addCapabilities) throws Exception {
        return addCapabilities(security, Optional.empty(), accountID, addCapabilities);
    }
    
    /**
     * Request capabilities for a specific account. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more. -  - To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/capabilities.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @param security The security details to use for authentication.
     * @param xMoovVersion Moov API versions. Version strings are formatted as `vYYYY.MM.DD`, except preVerioned and latest.
     * @param accountID
     * @param addCapabilities
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AddCapabilitiesResponse addCapabilities(
            AddCapabilitiesSecurity security,
            Optional<? extends Versions> xMoovVersion,
            String accountID,
            AddCapabilities addCapabilities) throws Exception {
        AddCapabilitiesRequest request =
            AddCapabilitiesRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .addCapabilities(addCapabilities)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                AddCapabilitiesRequest.class,
                _baseUrl,
                "/accounts/{accountID}/capabilities",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "addCapabilities",
                "json",
                false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, null));
        
        // hooks will have access to global security options
        // TODO pass the method level security object to hooks (type system doesn't allow 
        // it, would require some reflection work)
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req, security);
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "addCapabilities", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "403", "404", "409", "422", "429", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "addCapabilities",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "addCapabilities",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "addCapabilities",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        AddCapabilitiesResponse.Builder _resBuilder = 
            AddCapabilitiesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        AddCapabilitiesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<Capability> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<Capability>>() {});
                _res.withCapabilities(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "409")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GenericError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GenericError>() {});
                throw _out;
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "422")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                AddCapabilitiesError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<AddCapabilitiesError>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
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
     * Retrieve a specific capability that an account has requested. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more. -  - To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/capabilities.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @return The call builder
     */
    public GetCapabilityRequestBuilder getCapability() {
        return new GetCapabilityRequestBuilder(this);
    }

    /**
     * Retrieve a specific capability that an account has requested. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more. -  - To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/capabilities.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @param security The security details to use for authentication.
     * @param accountID
     * @param capabilityID Moov account capabilities.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetCapabilityResponse getCapability(
            GetCapabilitySecurity security,
            String accountID,
            CapabilityID capabilityID) throws Exception {
        return getCapability(security, Optional.empty(), accountID, capabilityID);
    }
    
    /**
     * Retrieve a specific capability that an account has requested. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more. -  - To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/capabilities.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @param security The security details to use for authentication.
     * @param xMoovVersion Moov API versions. Version strings are formatted as `vYYYY.MM.DD`, except preVerioned and latest.
     * @param accountID
     * @param capabilityID Moov account capabilities.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetCapabilityResponse getCapability(
            GetCapabilitySecurity security,
            Optional<? extends Versions> xMoovVersion,
            String accountID,
            CapabilityID capabilityID) throws Exception {
        GetCapabilityRequest request =
            GetCapabilityRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .capabilityID(capabilityID)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetCapabilityRequest.class,
                _baseUrl,
                "/accounts/{accountID}/capabilities/{capabilityID}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, null));
        
        // hooks will have access to global security options
        // TODO pass the method level security object to hooks (type system doesn't allow 
        // it, would require some reflection work)
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req, security);
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "getCapability", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "403", "404", "429", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getCapability",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getCapability",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getCapability",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetCapabilityResponse.Builder _resBuilder = 
            GetCapabilityResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetCapabilityResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Capability _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Capability>() {});
                _res.withCapability(Optional.ofNullable(_out));
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
     * Disable a specific capability that an account has requested. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more. -  - To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/capabilities.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @return The call builder
     */
    public DisableCapabilityRequestBuilder disableCapability() {
        return new DisableCapabilityRequestBuilder(this);
    }

    /**
     * Disable a specific capability that an account has requested. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more. -  - To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/capabilities.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @param security The security details to use for authentication.
     * @param accountID
     * @param capabilityID Moov account capabilities.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public DisableCapabilityResponse disableCapability(
            DisableCapabilitySecurity security,
            String accountID,
            CapabilityID capabilityID) throws Exception {
        return disableCapability(security, Optional.empty(), accountID, capabilityID);
    }
    
    /**
     * Disable a specific capability that an account has requested. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more. -  - To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/capabilities.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @param security The security details to use for authentication.
     * @param xMoovVersion Moov API versions. Version strings are formatted as `vYYYY.MM.DD`, except preVerioned and latest.
     * @param accountID
     * @param capabilityID Moov account capabilities.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public DisableCapabilityResponse disableCapability(
            DisableCapabilitySecurity security,
            Optional<? extends Versions> xMoovVersion,
            String accountID,
            CapabilityID capabilityID) throws Exception {
        DisableCapabilityRequest request =
            DisableCapabilityRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .capabilityID(capabilityID)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                DisableCapabilityRequest.class,
                _baseUrl,
                "/accounts/{accountID}/capabilities/{capabilityID}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, null));
        
        // hooks will have access to global security options
        // TODO pass the method level security object to hooks (type system doesn't allow 
        // it, would require some reflection work)
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req, security);
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "disableCapability", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "403", "404", "409", "429", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "disableCapability",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "disableCapability",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "disableCapability",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        DisableCapabilityResponse.Builder _resBuilder = 
            DisableCapabilityResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        DisableCapabilityResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "204")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "409")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GenericError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GenericError>() {});
                throw _out;
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
