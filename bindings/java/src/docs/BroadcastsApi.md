# BroadcastsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**broadcastsCreateBroadcastToken**](BroadcastsApi.md#broadcastsCreateBroadcastToken) | **POST** /broadcasts/{org}/broadcast-token/ | Create a broadcast token.


<a name="broadcastsCreateBroadcastToken"></a>
# **broadcastsCreateBroadcastToken**
> BroadcastToken broadcastsCreateBroadcastToken(org, data)

Create a broadcast token.

Create a broadcast token.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.BroadcastsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

BroadcastsApi apiInstance = new BroadcastsApi();
String org = "org_example"; // String | 
BroadcastTokenInput data = new BroadcastTokenInput(); // BroadcastTokenInput | 
try {
    BroadcastToken result = apiInstance.broadcastsCreateBroadcastToken(org, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BroadcastsApi#broadcastsCreateBroadcastToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  |
 **data** | [**BroadcastTokenInput**](BroadcastTokenInput.md)|  | [optional]

### Return type

[**BroadcastToken**](BroadcastToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

