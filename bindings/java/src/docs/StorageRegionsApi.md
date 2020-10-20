# StorageRegionsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**storageRegionsList**](StorageRegionsApi.md#storageRegionsList) | **GET** /storage-regions/ | Get a list of all available storage regions.
[**storageRegionsRead**](StorageRegionsApi.md#storageRegionsRead) | **GET** /storage-regions/{slug}/ | Get a specific storage region.


<a name="storageRegionsList"></a>
# **storageRegionsList**
> List&lt;StorageRegion&gt; storageRegionsList()

Get a list of all available storage regions.

Get a list of all available storage regions.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.StorageRegionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

StorageRegionsApi apiInstance = new StorageRegionsApi();
try {
    List<StorageRegion> result = apiInstance.storageRegionsList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageRegionsApi#storageRegionsList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;StorageRegion&gt;**](StorageRegion.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="storageRegionsRead"></a>
# **storageRegionsRead**
> StorageRegion storageRegionsRead(slug)

Get a specific storage region.

Get a specific storage region.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.StorageRegionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

StorageRegionsApi apiInstance = new StorageRegionsApi();
String slug = "slug_example"; // String | 
try {
    StorageRegion result = apiInstance.storageRegionsRead(slug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageRegionsApi#storageRegionsRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **String**|  |

### Return type

[**StorageRegion**](StorageRegion.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

