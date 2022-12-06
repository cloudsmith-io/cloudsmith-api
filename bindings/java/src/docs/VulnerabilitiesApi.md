# VulnerabilitiesApi

All URIs are relative to *https://api.cloudsmith.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vulnerabilitiesNamespaceList**](VulnerabilitiesApi.md#vulnerabilitiesNamespaceList) | **GET** /vulnerabilities/{owner}/ | Lists scan results for a specific namespace.
[**vulnerabilitiesPackageList**](VulnerabilitiesApi.md#vulnerabilitiesPackageList) | **GET** /vulnerabilities/{owner}/{repo}/{package}/ | Lists scan results for a specific package.
[**vulnerabilitiesRead**](VulnerabilitiesApi.md#vulnerabilitiesRead) | **GET** /vulnerabilities/{owner}/{repo}/{package}/{scan_id}/ | Returns a Scan Result.
[**vulnerabilitiesRepoList**](VulnerabilitiesApi.md#vulnerabilitiesRepoList) | **GET** /vulnerabilities/{owner}/{repo}/ | Lists scan results for a specific repository.


<a name="vulnerabilitiesNamespaceList"></a>
# **vulnerabilitiesNamespaceList**
> List&lt;VulnerabilityScanResultsListResponse&gt; vulnerabilitiesNamespaceList(owner, page, pageSize)

Lists scan results for a specific namespace.

Lists scan results for a specific namespace.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.VulnerabilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

VulnerabilitiesApi apiInstance = new VulnerabilitiesApi();
String owner = "owner_example"; // String | 
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
try {
    List<VulnerabilityScanResultsListResponse> result = apiInstance.vulnerabilitiesNamespaceList(owner, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VulnerabilitiesApi#vulnerabilitiesNamespaceList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **page** | **Integer**| A page number within the paginated result set. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]

### Return type

[**List&lt;VulnerabilityScanResultsListResponse&gt;**](VulnerabilityScanResultsListResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="vulnerabilitiesPackageList"></a>
# **vulnerabilitiesPackageList**
> List&lt;VulnerabilityScanResultsListResponse&gt; vulnerabilitiesPackageList(owner, repo, _package, page, pageSize)

Lists scan results for a specific package.

Lists scan results for a specific package.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.VulnerabilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

VulnerabilitiesApi apiInstance = new VulnerabilitiesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String _package = "_package_example"; // String | 
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
try {
    List<VulnerabilityScanResultsListResponse> result = apiInstance.vulnerabilitiesPackageList(owner, repo, _package, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VulnerabilitiesApi#vulnerabilitiesPackageList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **_package** | **String**|  |
 **page** | **Integer**| A page number within the paginated result set. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]

### Return type

[**List&lt;VulnerabilityScanResultsListResponse&gt;**](VulnerabilityScanResultsListResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="vulnerabilitiesRead"></a>
# **vulnerabilitiesRead**
> VulnerabilityScanResultsResponse vulnerabilitiesRead(owner, repo, _package, scanId)

Returns a Scan Result.

Returns a Scan Result.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.VulnerabilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

VulnerabilitiesApi apiInstance = new VulnerabilitiesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String _package = "_package_example"; // String | 
String scanId = "scanId_example"; // String | 
try {
    VulnerabilityScanResultsResponse result = apiInstance.vulnerabilitiesRead(owner, repo, _package, scanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VulnerabilitiesApi#vulnerabilitiesRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **_package** | **String**|  |
 **scanId** | **String**|  |

### Return type

[**VulnerabilityScanResultsResponse**](VulnerabilityScanResultsResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="vulnerabilitiesRepoList"></a>
# **vulnerabilitiesRepoList**
> List&lt;VulnerabilityScanResultsListResponse&gt; vulnerabilitiesRepoList(owner, repo, page, pageSize)

Lists scan results for a specific repository.

Lists scan results for a specific repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.VulnerabilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

VulnerabilitiesApi apiInstance = new VulnerabilitiesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
try {
    List<VulnerabilityScanResultsListResponse> result = apiInstance.vulnerabilitiesRepoList(owner, repo, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VulnerabilitiesApi#vulnerabilitiesRepoList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **page** | **Integer**| A page number within the paginated result set. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]

### Return type

[**List&lt;VulnerabilityScanResultsListResponse&gt;**](VulnerabilityScanResultsListResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

