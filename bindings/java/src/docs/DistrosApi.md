# DistrosApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**distrosList**](DistrosApi.md#distrosList) | **GET** /distros/ | Get a list of all supported distributions.
[**distrosRead**](DistrosApi.md#distrosRead) | **GET** /distros/{slug}/ | View for viewing/listing distributions.


<a name="distrosList"></a>
# **distrosList**
> List&lt;Distribution&gt; distrosList()

Get a list of all supported distributions.

Get a list of all supported distributions.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.DistrosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

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

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="distrosRead"></a>
# **distrosRead**
> Distribution distrosRead(slug)

View for viewing/listing distributions.

View for viewing/listing distributions.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.DistrosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

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

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

