/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.components.Wallet;
import io.moov.openapi.models.errors.APIException;
import io.moov.openapi.models.operations.GetWalletRequest;
import io.moov.openapi.models.operations.GetWalletRequestBuilder;
import io.moov.openapi.models.operations.GetWalletResponse;
import io.moov.openapi.models.operations.GetWalletSecurity;
import io.moov.openapi.models.operations.ListWalletsRequest;
import io.moov.openapi.models.operations.ListWalletsRequestBuilder;
import io.moov.openapi.models.operations.ListWalletsResponse;
import io.moov.openapi.models.operations.ListWalletsSecurity;
import io.moov.openapi.models.operations.SDKMethodInterfaces.*;
import io.moov.openapi.utils.HTTPClient;
import io.moov.openapi.utils.HTTPRequest;
import io.moov.openapi.utils.Hook.AfterErrorContextImpl;
import io.moov.openapi.utils.Hook.AfterSuccessContextImpl;
import io.moov.openapi.utils.Hook.BeforeRequestContextImpl;
import io.moov.openapi.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

public class Wallets implements
            MethodCallListWallets,
            MethodCallGetWallet {

    private final SDKConfiguration sdkConfiguration;

    Wallets(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * List the wallets associated with a Moov account. Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more. -  - To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/wallets.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @return The call builder
     */
    public ListWalletsRequestBuilder listWallets() {
        return new ListWalletsRequestBuilder(this);
    }

    /**
     * List the wallets associated with a Moov account. Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more. -  - To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/wallets.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @param security The security details to use for authentication.
     * @param accountID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListWalletsResponse listWallets(
            ListWalletsSecurity security,
            String accountID) throws Exception {
        return listWallets(security, Optional.empty(), accountID);
    }
    
    /**
     * List the wallets associated with a Moov account. Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more. -  - To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/wallets.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @param security The security details to use for authentication.
     * @param xMoovVersion Moov API versions. Version strings are formatted as `vYYYY.MM.DD`, except preVerioned and latest.
     * @param accountID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListWalletsResponse listWallets(
            ListWalletsSecurity security,
            Optional<? extends Versions> xMoovVersion,
            String accountID) throws Exception {
        ListWalletsRequest request =
            ListWalletsRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                ListWalletsRequest.class,
                _baseUrl,
                "/accounts/{accountID}/wallets",
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
                      "listWallets", 
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
                            "listWallets",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "listWallets",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "listWallets",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListWalletsResponse.Builder _resBuilder = 
            ListWalletsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListWalletsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<Wallet> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<Wallet>>() {});
                _res.withWallets(Optional.ofNullable(_out));
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
     * Get information on a specific wallet (e.g., the available balance). Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more. -  - To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/wallets.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @return The call builder
     */
    public GetWalletRequestBuilder getWallet() {
        return new GetWalletRequestBuilder(this);
    }

    /**
     * Get information on a specific wallet (e.g., the available balance). Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more. -  - To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/wallets.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @param security The security details to use for authentication.
     * @param accountID
     * @param walletID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetWalletResponse getWallet(
            GetWalletSecurity security,
            String accountID,
            String walletID) throws Exception {
        return getWallet(security, Optional.empty(), accountID, walletID);
    }
    
    /**
     * Get information on a specific wallet (e.g., the available balance). Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more. -  - To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/wallets.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
     * @param security The security details to use for authentication.
     * @param xMoovVersion Moov API versions. Version strings are formatted as `vYYYY.MM.DD`, except preVerioned and latest.
     * @param accountID
     * @param walletID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetWalletResponse getWallet(
            GetWalletSecurity security,
            Optional<? extends Versions> xMoovVersion,
            String accountID,
            String walletID) throws Exception {
        GetWalletRequest request =
            GetWalletRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .walletID(walletID)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetWalletRequest.class,
                _baseUrl,
                "/accounts/{accountID}/wallets/{walletID}",
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
                      "getWallet", 
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
                            "getWallet",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getWallet",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getWallet",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetWalletResponse.Builder _resBuilder = 
            GetWalletResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetWalletResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Wallet _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Wallet>() {});
                _res.withWallet(Optional.ofNullable(_out));
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

}
