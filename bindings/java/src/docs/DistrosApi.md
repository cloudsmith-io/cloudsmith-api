# DistrosApi

All URIs are relative to *https://api-prd.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**distrosList**](DistrosApi.md#distrosList) | **GET** /distros/ | Get a list of all supported distributions.
[**distrosRead**](DistrosApi.md#distrosRead) | **GET** /distros/{slug}/ | View for viewing/listing package formats.


<a name="distrosList"></a>
# **distrosList**
> List&lt;Distribution&gt; distrosList()

Get a list of all supported distributions.

Get a list of all supported distributions.

### Example
```java
// Import classes:
//import io.cloudsmith.ApiClient;
//import io.cloudsmith.ApiException;
//import io.cloudsmith.Configuration;
//import io.cloudsmith.auth.*;
//import io.cloudsmith.apis.DistrosApi;

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

DistrosApi apiInstance = new DistrosApi();
try {
    List<Distribution> result = apiInstance.distrosList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistrosApi#distrosList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Distribution&gt;**](Distribution.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="distrosRead"></a>
# **distrosRead**
> Distribution distrosRead(slug)

View for viewing/listing package formats.

View for viewing/listing package formats.

### Example
```java
// Import classes:
//import io.cloudsmith.ApiClient;
//import io.cloudsmith.ApiException;
//import io.cloudsmith.Configuration;
//import io.cloudsmith.auth.*;
//import io.cloudsmith.apis.DistrosApi;

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

DistrosApi apiInstance = new DistrosApi();
String slug = "slug_example"; // String | 
try {
    Distribution result = apiInstance.distrosRead(slug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistrosApi#distrosRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **String**|  |

### Return type

[**Distribution**](Distribution.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

