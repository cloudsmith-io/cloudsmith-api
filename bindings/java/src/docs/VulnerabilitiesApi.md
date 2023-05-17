# VulnerabilitiesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vulnerabilitiesNamespaceList**](VulnerabilitiesApi.md#vulnerabilitiesNamespaceList) | **GET** /vulnerabilities/{owner}/ | Lists scan results for a specific namespace.
[**vulnerabilitiesPackageList**](VulnerabilitiesApi.md#vulnerabilitiesPackageList) | **GET** /vulnerabilities/{owner}/{repo}/{package}/ | Lists scan results for a specific package.
[**vulnerabilitiesRead**](VulnerabilitiesApi.md#vulnerabilitiesRead) | **GET** /vulnerabilities/{owner}/{repo}/{package}/{identifier}/ | Get a scan result.
[**vulnerabilitiesRepoList**](VulnerabilitiesApi.md#vulnerabilitiesRepoList) | **GET** /vulnerabilities/{owner}/{repo}/ | Lists scan results for a specific repository.


<a name="vulnerabilitiesNamespaceList"></a>
# **vulnerabilitiesNamespaceList**
> List&lt;VulnerabilityScanResultsList&gt; vulnerabilitiesNamespaceList(owner, page, pageSize)

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
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
try {
    List<VulnerabilityScanResultsList> result = apiInstance.vulnerabilitiesNamespaceList(owner, page, pageSize);
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
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]

### Return type

[**List&lt;VulnerabilityScanResultsList&gt;**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="vulnerabilitiesPackageList"></a>
# **vulnerabilitiesPackageList**
> List&lt;VulnerabilityScanResultsList&gt; vulnerabilitiesPackageList(owner, repo, _package, page, pageSize)

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
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
try {
    List<VulnerabilityScanResultsList> result = apiInstance.vulnerabilitiesPackageList(owner, repo, _package, page, pageSize);
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
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]

### Return type

[**List&lt;VulnerabilityScanResultsList&gt;**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="vulnerabilitiesRead"></a>
# **vulnerabilitiesRead**
> VulnerabilityScanResults vulnerabilitiesRead(owner, repo, _package, identifier)

Get a scan result.

Get a scan result.

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
String identifier = "identifier_example"; // String | 
try {
    VulnerabilityScanResults result = apiInstance.vulnerabilitiesRead(owner, repo, _package, identifier);
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
 **identifier** | **String**|  |

### Return type

[**VulnerabilityScanResults**](VulnerabilityScanResults.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="vulnerabilitiesRepoList"></a>
# **vulnerabilitiesRepoList**
> List&lt;VulnerabilityScanResultsList&gt; vulnerabilitiesRepoList(owner, repo, page, pageSize)

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
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
try {
    List<VulnerabilityScanResultsList> result = apiInstance.vulnerabilitiesRepoList(owner, repo, page, pageSize);
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
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]

### Return type

[**List&lt;VulnerabilityScanResultsList&gt;**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

