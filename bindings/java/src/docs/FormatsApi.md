# FormatsApi

All URIs are relative to *https://api-prd.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**formatsList**](FormatsApi.md#formatsList) | **GET** /formats/ | Get a list of all supported package formats.
[**formatsRead**](FormatsApi.md#formatsRead) | **GET** /formats/{slug}/ | Get a specific supported package format.


<a name="formatsList"></a>
# **formatsList**
> List&lt;Format&gt; formatsList()

Get a list of all supported package formats.

Get a list of all supported package formats.

### Example
```java
// Import classes:
//import io.cloudsmith.ApiClient;
//import io.cloudsmith.ApiException;
//import io.cloudsmith.Configuration;
//import io.cloudsmith.auth.*;
//import io.cloudsmith.apis.FormatsApi;

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

// Configure API key authorization: csrf_token
ApiKeyAuth csrf_token = (ApiKeyAuth) defaultClient.getAuthentication("csrf_token");
csrf_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//csrf_token.setApiKeyPrefix("Token");

FormatsApi apiInstance = new FormatsApi();
try {
    List<Format> result = apiInstance.formatsList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormatsApi#formatsList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Format&gt;**](Format.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="formatsRead"></a>
# **formatsRead**
> Format formatsRead(slug)

Get a specific supported package format.

Get a specific supported package format.

### Example
```java
// Import classes:
//import io.cloudsmith.ApiClient;
//import io.cloudsmith.ApiException;
//import io.cloudsmith.Configuration;
//import io.cloudsmith.auth.*;
//import io.cloudsmith.apis.FormatsApi;

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

// Configure API key authorization: csrf_token
ApiKeyAuth csrf_token = (ApiKeyAuth) defaultClient.getAuthentication("csrf_token");
csrf_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//csrf_token.setApiKeyPrefix("Token");

FormatsApi apiInstance = new FormatsApi();
String slug = "slug_example"; // String | 
try {
    Format result = apiInstance.formatsRead(slug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormatsApi#formatsRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **String**|  |

### Return type

[**Format**](Format.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

