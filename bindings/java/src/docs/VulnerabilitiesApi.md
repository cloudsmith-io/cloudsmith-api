# VulnerabilitiesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vulnerabilitiesList**](VulnerabilitiesApi.md#vulnerabilitiesList) | **GET** /vulnerabilities/{owner}/ | Lists scan results for a specific namespace.
[**vulnerabilitiesList0**](VulnerabilitiesApi.md#vulnerabilitiesList0) | **GET** /vulnerabilities/{owner}/{repo}/ | Lists scan results for a specific repository.
[**vulnerabilitiesList1**](VulnerabilitiesApi.md#vulnerabilitiesList1) | **GET** /vulnerabilities/{owner}/{repo}/{package}/ | Lists scan results for a specific package.
[**vulnerabilitiesRead**](VulnerabilitiesApi.md#vulnerabilitiesRead) | **GET** /vulnerabilities/{owner}/{repo}/{package}/{scan_id}/ | Returns a Scan Result.


<a name="vulnerabilitiesList"></a>
# **vulnerabilitiesList**
> List&lt;VulnerabilityScanResultsList&gt; vulnerabilitiesList(owner, page, pageSize)

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
    List<VulnerabilityScanResultsList> result = apiInstance.vulnerabilitiesList(owner, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VulnerabilitiesApi#vulnerabilitiesList");
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

[**List&lt;VulnerabilityScanResultsList&gt;**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="vulnerabilitiesList0"></a>
# **vulnerabilitiesList0**
> List&lt;VulnerabilityScanResultsList&gt; vulnerabilitiesList0(owner, repo, page, pageSize)

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
    List<VulnerabilityScanResultsList> result = apiInstance.vulnerabilitiesList0(owner, repo, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VulnerabilitiesApi#vulnerabilitiesList0");
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

[**List&lt;VulnerabilityScanResultsList&gt;**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="vulnerabilitiesList1"></a>
# **vulnerabilitiesList1**
> List&lt;VulnerabilityScanResultsList&gt; vulnerabilitiesList1(owner, repo, _package, page, pageSize)

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
    List<VulnerabilityScanResultsList> result = apiInstance.vulnerabilitiesList1(owner, repo, _package, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VulnerabilitiesApi#vulnerabilitiesList1");
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

[**List&lt;VulnerabilityScanResultsList&gt;**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="vulnerabilitiesRead"></a>
# **vulnerabilitiesRead**
> VulnerabilityScanResults vulnerabilitiesRead(owner, repo, _package, scanId)

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
    VulnerabilityScanResults result = apiInstance.vulnerabilitiesRead(owner, repo, _package, scanId);
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

[**VulnerabilityScanResults**](VulnerabilityScanResults.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

