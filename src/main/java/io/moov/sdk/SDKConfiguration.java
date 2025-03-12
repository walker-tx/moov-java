/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk;

import io.moov.sdk.hooks.SDKHooks;
import io.moov.sdk.utils.HTTPClient;
import io.moov.sdk.utils.Hook.SdkInitData;
import io.moov.sdk.utils.Hooks;
import io.moov.sdk.utils.RetryConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    
    public Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(securitySource);
    }
    
    public HTTPClient defaultClient;
    
    public String serverUrl;
    
    public String resolvedServerUrl() {
        return serverUrl;
    }
    public int serverIdx = 0;
    private static final String LANGUAGE = "java";
    public static final String OPENAPI_DOC_VERSION = "latest";
    public static final String SDK_VERSION = "0.8.15";
    public static final String GEN_VERSION = "2.548.1";
    private static final String BASE_PACKAGE = "io.moov.sdk";
    public static final String USER_AGENT = 
            String.format("speakeasy-sdk/%s %s %s %s %s",
                LANGUAGE, SDK_VERSION, GEN_VERSION, OPENAPI_DOC_VERSION, BASE_PACKAGE);

    private Hooks _hooks = createHooks();

    private static Hooks createHooks() {
        Hooks hooks = new Hooks();
        return hooks;
    }
    
    public Hooks hooks() {
        return _hooks;
    }

    public void setHooks(Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {
        SDKHooks.initialize(_hooks);
        // apply the sdk init hook immediately
        SdkInitData data = _hooks.sdkInit(new SdkInitData(resolvedServerUrl(), defaultClient));
        this.serverUrl = data.baseUrl();
        this.defaultClient = data.client();
    }

    @SuppressWarnings("serial")
    public Map<String, Map<String, Map<String,Object>>> globals = new HashMap<>(){ {
        put("parameters", new HashMap<>());
    } };
    
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
