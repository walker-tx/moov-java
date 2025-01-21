/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.openapi.models.components.FileDetails;
import io.moov.openapi.models.components.FileUploadRequestMultiPart;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.APIException;
import io.moov.openapi.models.errors.FileValidationError;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.GetFileDetailsRequest;
import io.moov.openapi.models.operations.GetFileDetailsRequestBuilder;
import io.moov.openapi.models.operations.GetFileDetailsResponse;
import io.moov.openapi.models.operations.GetFileDetailsSecurity;
import io.moov.openapi.models.operations.ListFilesRequest;
import io.moov.openapi.models.operations.ListFilesRequestBuilder;
import io.moov.openapi.models.operations.ListFilesResponse;
import io.moov.openapi.models.operations.ListFilesSecurity;
import io.moov.openapi.models.operations.SDKMethodInterfaces.*;
import io.moov.openapi.models.operations.UploadFileRequest;
import io.moov.openapi.models.operations.UploadFileRequestBuilder;
import io.moov.openapi.models.operations.UploadFileResponse;
import io.moov.openapi.models.operations.UploadFileSecurity;
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

public class Files implements
            MethodCallUploadFile,
            MethodCallListFiles,
            MethodCallGetFileDetails {

    private final SDKConfiguration sdkConfiguration;

    Files(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Upload a file and link it to the specified Moov account.  -  - The maximum file size is 10MB. Each account is allowed a maximum of 50 files. Acceptable file types include csv, jpg, pdf,  - and png.  -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify the  - `/accounts/{accountID}/files.write` scope.
     * @return The call builder
     */
    public UploadFileRequestBuilder uploadFile() {
        return new UploadFileRequestBuilder(this);
    }

    /**
     * Upload a file and link it to the specified Moov account.  -  - The maximum file size is 10MB. Each account is allowed a maximum of 50 files. Acceptable file types include csv, jpg, pdf,  - and png.  -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify the  - `/accounts/{accountID}/files.write` scope.
     * @param security The security details to use for authentication.
     * @param accountID
     * @param fileUploadRequestMultiPart Request to upload a file for an account.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UploadFileResponse uploadFile(
            UploadFileSecurity security,
            String accountID,
            FileUploadRequestMultiPart fileUploadRequestMultiPart) throws Exception {
        return uploadFile(security, Optional.empty(), accountID, fileUploadRequestMultiPart);
    }
    
    /**
     * Upload a file and link it to the specified Moov account.  -  - The maximum file size is 10MB. Each account is allowed a maximum of 50 files. Acceptable file types include csv, jpg, pdf,  - and png.  -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify the  - `/accounts/{accountID}/files.write` scope.
     * @param security The security details to use for authentication.
     * @param xMoovVersion Moov API versions. Version strings are formatted as `vYYYY.MM.DD`, except preVerioned and latest.
     * @param accountID
     * @param fileUploadRequestMultiPart Request to upload a file for an account.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UploadFileResponse uploadFile(
            UploadFileSecurity security,
            Optional<? extends Versions> xMoovVersion,
            String accountID,
            FileUploadRequestMultiPart fileUploadRequestMultiPart) throws Exception {
        UploadFileRequest request =
            UploadFileRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .fileUploadRequestMultiPart(fileUploadRequestMultiPart)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                UploadFileRequest.class,
                _baseUrl,
                "/accounts/{accountID}/files",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "fileUploadRequestMultiPart",
                "multipart",
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
                      "uploadFile", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "403", "404", "409", "422", "429", "4XX", "500", "504", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "uploadFile",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "uploadFile",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "uploadFile",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UploadFileResponse.Builder _resBuilder = 
            UploadFileResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UploadFileResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                FileDetails _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<FileDetails>() {});
                _res.withFileDetails(Optional.ofNullable(_out));
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
                FileValidationError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<FileValidationError>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
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
     * List all the files associated with a particular Moov account. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify the  - `/accounts/{accountID}/files.read` scope.
     * @return The call builder
     */
    public ListFilesRequestBuilder listFiles() {
        return new ListFilesRequestBuilder(this);
    }

    /**
     * List all the files associated with a particular Moov account. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify the  - `/accounts/{accountID}/files.read` scope.
     * @param security The security details to use for authentication.
     * @param accountID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListFilesResponse listFiles(
            ListFilesSecurity security,
            String accountID) throws Exception {
        return listFiles(security, Optional.empty(), accountID);
    }
    
    /**
     * List all the files associated with a particular Moov account. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify the  - `/accounts/{accountID}/files.read` scope.
     * @param security The security details to use for authentication.
     * @param xMoovVersion Moov API versions. Version strings are formatted as `vYYYY.MM.DD`, except preVerioned and latest.
     * @param accountID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListFilesResponse listFiles(
            ListFilesSecurity security,
            Optional<? extends Versions> xMoovVersion,
            String accountID) throws Exception {
        ListFilesRequest request =
            ListFilesRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                ListFilesRequest.class,
                _baseUrl,
                "/accounts/{accountID}/files",
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
                      "listFiles", 
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
                            "listFiles",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "listFiles",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "listFiles",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListFilesResponse.Builder _resBuilder = 
            ListFilesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListFilesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<FileDetails> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<FileDetails>>() {});
                _res.withFileDetails(Optional.ofNullable(_out));
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
     * Retrieve file details associated with a specific Moov account. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify the  - `/accounts/{accountID}/files.read` scope.
     * @return The call builder
     */
    public GetFileDetailsRequestBuilder getFileDetails() {
        return new GetFileDetailsRequestBuilder(this);
    }

    /**
     * Retrieve file details associated with a specific Moov account. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify the  - `/accounts/{accountID}/files.read` scope.
     * @param security The security details to use for authentication.
     * @param accountID
     * @param fileID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetFileDetailsResponse getFileDetails(
            GetFileDetailsSecurity security,
            String accountID,
            String fileID) throws Exception {
        return getFileDetails(security, Optional.empty(), accountID, fileID);
    }
    
    /**
     * Retrieve file details associated with a specific Moov account. -  - To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify the  - `/accounts/{accountID}/files.read` scope.
     * @param security The security details to use for authentication.
     * @param xMoovVersion Moov API versions. Version strings are formatted as `vYYYY.MM.DD`, except preVerioned and latest.
     * @param accountID
     * @param fileID
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetFileDetailsResponse getFileDetails(
            GetFileDetailsSecurity security,
            Optional<? extends Versions> xMoovVersion,
            String accountID,
            String fileID) throws Exception {
        GetFileDetailsRequest request =
            GetFileDetailsRequest
                .builder()
                .xMoovVersion(xMoovVersion)
                .accountID(accountID)
                .fileID(fileID)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetFileDetailsRequest.class,
                _baseUrl,
                "/accounts/{accountID}/files/{fileID}",
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
                      "getFileDetails", 
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
                            "getFileDetails",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getFileDetails",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getFileDetails",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetFileDetailsResponse.Builder _resBuilder = 
            GetFileDetailsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetFileDetailsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                FileDetails _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<FileDetails>() {});
                _res.withFileDetails(Optional.ofNullable(_out));
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
