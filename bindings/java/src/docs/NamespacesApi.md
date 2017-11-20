# NamespacesApi

All URIs are relative to *https://api-prd.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**namespacesList**](NamespacesApi.md#namespacesList) | **GET** /namespaces/ | Get a list of all namespaces the user belongs to.
[**namespacesRead**](NamespacesApi.md#namespacesRead) | **GET** /namespaces/{slug}/ | Views for working with namespaces.


<a name="namespacesList"></a>
# **namespacesList**
> List&lt;Namespace&gt; namespacesList(page, pageSize)

Get a list of all namespaces the user belongs to.

Get a list of all namespaces the user belongs to.

### Example
```java
// Import classes:
//import io.cloudsmith.ApiClient;
//import io.cloudsmith.ApiException;
//import io.cloudsmith.Configuration;
//import io.cloudsmith.auth.*;
//import io.cloudsmith.apis.NamespacesApi;

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

NamespacesApi apiInstance = new NamespacesApi();
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
try {
    List<Namespace> result = apiInstance.namespacesList(page, pageSize);
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

[**List&lt;Namespace&gt;**](Namespace.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="namespacesRead"></a>
# **namespacesRead**
> Namespace namespacesRead(slug)

Views for working with namespaces.

Views for working with namespaces.

### Example
```java
// Import classes:
//import io.cloudsmith.ApiClient;
//import io.cloudsmith.ApiException;
//import io.cloudsmith.Configuration;
//import io.cloudsmith.auth.*;
//import io.cloudsmith.apis.NamespacesApi;

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

NamespacesApi apiInstance = new NamespacesApi();
String slug = "slug_example"; // String | 
try {
    Namespace result = apiInstance.namespacesRead(slug);
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

[**Namespace**](Namespace.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

