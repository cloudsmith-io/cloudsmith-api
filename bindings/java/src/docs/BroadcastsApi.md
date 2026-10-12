# BroadcastsApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**broadcastsCreateBroadcastToken**](BroadcastsApi.md#broadcastsCreateBroadcastToken) | **POST** /broadcasts/{org}/broadcast-token/ | Create a broadcast token. |


<a id="broadcastsCreateBroadcastToken"></a>
# **broadcastsCreateBroadcastToken**
> BroadcastToken broadcastsCreateBroadcastToken(org, data)

Create a broadcast token.

Create a broadcast token.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.BroadcastsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    BroadcastsApi apiInstance = new BroadcastsApi(defaultClient);
    String org = "org_example"; // String | 
    BroadcastTokenInput data = new BroadcastTokenInput(); // BroadcastTokenInput | 
    try {
      BroadcastToken result = apiInstance.broadcastsCreateBroadcastToken(org, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastsApi#broadcastsCreateBroadcastToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **org** | **String**|  | |
| **data** | [**BroadcastTokenInput**](BroadcastTokenInput.md)|  | [optional] |

### Return type

[**BroadcastToken**](BroadcastToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **200** | OK |  -  |
| **422** | Entitlement token parameter is required. |  -  |
| **404** | Entitlement token not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |

