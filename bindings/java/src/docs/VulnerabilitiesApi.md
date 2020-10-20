# VulnerabilitiesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vulnerabilitiesList**](VulnerabilitiesApi.md#vulnerabilitiesList) | **GET** /vulnerabilities/{owner}/ | Read-only view to list vulnerabiltiy scan results within a Namespace.
[**vulnerabilitiesList0**](VulnerabilitiesApi.md#vulnerabilitiesList0) | **GET** /vulnerabilities/{owner}/{repo}/ | Read-only views to list vulnerabiltiy scan results within a Repository.
[**vulnerabilitiesList1**](VulnerabilitiesApi.md#vulnerabilitiesList1) | **GET** /vulnerabilities/{owner}/{repo}/{package}/ | Read-only views to list vulnerabiltiy scan results within a Repository
[**vulnerabilitiesRead**](VulnerabilitiesApi.md#vulnerabilitiesRead) | **GET** /vulnerabilities/{owner}/{repo}/{package}/{scan_id}/ | Read-only view to retrieve vulnerability scans results using a


<a name="vulnerabilitiesList"></a>
# **vulnerabilitiesList**
> List&lt;VulnerabilityScanResultsList&gt; vulnerabilitiesList(owner, page, pageSize)

Read-only view to list vulnerabiltiy scan results within a Namespace.

Read-only view to list vulnerabiltiy scan results within a Namespace.

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

Read-only views to list vulnerabiltiy scan results within a Repository.

Read-only views to list vulnerabiltiy scan results within a Repository.

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

Read-only views to list vulnerabiltiy scan results within a Repository

Read-only views to list vulnerabiltiy scan results within a Repository for a given Package identifier.

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
String _package = "_package_example"; // String | The package that the scan result relates to.
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
 **_package** | **String**| The package that the scan result relates to. |
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

Read-only view to retrieve vulnerability scans results using a

Read-only view to retrieve vulnerability scans results using a vulnerabiltiy scan results identifier (slug_perm).

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
String _package = "_package_example"; // String | The package that the scan result relates to.
String scanId = "scanId_example"; // String | A sequential identifier that increments by one for each new scan result within a package. These are always unique and can be used to reference the scan results elsewhere (e.g. via the CLI.)
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
 **_package** | **String**| The package that the scan result relates to. |
 **scanId** | **String**| A sequential identifier that increments by one for each new scan result within a package. These are always unique and can be used to reference the scan results elsewhere (e.g. via the CLI.) |

### Return type

[**VulnerabilityScanResults**](VulnerabilityScanResults.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

