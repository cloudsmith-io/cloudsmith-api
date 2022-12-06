# QuotaApi

All URIs are relative to *https://api.cloudsmith.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**quotaHistoryRead**](QuotaApi.md#quotaHistoryRead) | **GET** /quota/history/{owner}/ | Quota history for a given namespace.
[**quotaOssHistoryRead**](QuotaApi.md#quotaOssHistoryRead) | **GET** /quota/oss/history/{owner}/ | Open-source Quota history for a given namespace.
[**quotaOssRead**](QuotaApi.md#quotaOssRead) | **GET** /quota/oss/{owner}/ | Open-source Quota usage for a given namespace.
[**quotaRead**](QuotaApi.md#quotaRead) | **GET** /quota/{owner}/ | Quota usage for a given namespace.


<a name="quotaHistoryRead"></a>
# **quotaHistoryRead**
> QuotaHistoryResponse quotaHistoryRead(owner)

Quota history for a given namespace.

Quota history for a given namespace.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

QuotaApi apiInstance = new QuotaApi();
String owner = "owner_example"; // String | 
try {
    QuotaHistoryResponse result = apiInstance.quotaHistoryRead(owner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#quotaHistoryRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |

### Return type

[**QuotaHistoryResponse**](QuotaHistoryResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="quotaOssHistoryRead"></a>
# **quotaOssHistoryRead**
> QuotaHistoryResponse quotaOssHistoryRead(owner)

Open-source Quota history for a given namespace.

Open-source Quota history for a given namespace.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

QuotaApi apiInstance = new QuotaApi();
String owner = "owner_example"; // String | 
try {
    QuotaHistoryResponse result = apiInstance.quotaOssHistoryRead(owner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#quotaOssHistoryRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |

### Return type

[**QuotaHistoryResponse**](QuotaHistoryResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="quotaOssRead"></a>
# **quotaOssRead**
> QuotaResponse quotaOssRead(owner)

Open-source Quota usage for a given namespace.

Open-source Quota usage for a given namespace.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

QuotaApi apiInstance = new QuotaApi();
String owner = "owner_example"; // String | 
try {
    QuotaResponse result = apiInstance.quotaOssRead(owner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#quotaOssRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |

### Return type

[**QuotaResponse**](QuotaResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="quotaRead"></a>
# **quotaRead**
> QuotaResponse quotaRead(owner)

Quota usage for a given namespace.

Quota usage for a given namespace.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

QuotaApi apiInstance = new QuotaApi();
String owner = "owner_example"; // String | 
try {
    QuotaResponse result = apiInstance.quotaRead(owner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#quotaRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |

### Return type

[**QuotaResponse**](QuotaResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

