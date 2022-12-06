# NamespacesApi

All URIs are relative to *https://api.cloudsmith.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**namespacesList**](NamespacesApi.md#namespacesList) | **GET** /namespaces/ | Get a list of all namespaces the user belongs to.
[**namespacesRead**](NamespacesApi.md#namespacesRead) | **GET** /namespaces/{slug}/ | Views for working with namespaces.


<a name="namespacesList"></a>
# **namespacesList**
> List&lt;NamespaceResponse&gt; namespacesList(page, pageSize)

Get a list of all namespaces the user belongs to.

Get a list of all namespaces the user belongs to.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.NamespacesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

NamespacesApi apiInstance = new NamespacesApi();
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
try {
    List<NamespaceResponse> result = apiInstance.namespacesList(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NamespacesApi#namespacesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| A page number within the paginated result set. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]

### Return type

[**List&lt;NamespaceResponse&gt;**](NamespaceResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="namespacesRead"></a>
# **namespacesRead**
> NamespaceResponse namespacesRead(slug)

Views for working with namespaces.

Views for working with namespaces.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.NamespacesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

NamespacesApi apiInstance = new NamespacesApi();
String slug = "slug_example"; // String | 
try {
    NamespaceResponse result = apiInstance.namespacesRead(slug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NamespacesApi#namespacesRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **String**|  |

### Return type

[**NamespaceResponse**](NamespaceResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

