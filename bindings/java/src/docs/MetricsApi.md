# MetricsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**metricsEntitlementsAccountList**](MetricsApi.md#metricsEntitlementsAccountList) | **GET** /metrics/entitlements/{owner}/ | View for listing entitlement token metrics, across an account.
[**metricsEntitlementsRepoList**](MetricsApi.md#metricsEntitlementsRepoList) | **GET** /metrics/entitlements/{owner}/{repo}/ | View for listing entitlement token metrics, for a repository.
[**metricsPackagesList**](MetricsApi.md#metricsPackagesList) | **GET** /metrics/packages/{owner}/{repo}/ | View for listing package usage metrics, for a repository.


<a name="metricsEntitlementsAccountList"></a>
# **metricsEntitlementsAccountList**
> EntitlementUsageMetrics metricsEntitlementsAccountList(owner, page, pageSize, finish, start, tokens)

View for listing entitlement token metrics, across an account.

View for listing entitlement token metrics, across an account.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.MetricsApi;

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

MetricsApi apiInstance = new MetricsApi();
String owner = "owner_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
String finish = "finish_example"; // String | Include metrics upto and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
String start = "start_example"; // String | Include metrics from and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
String tokens = "tokens_example"; // String | A comma seperated list of tokens (slug perm) to include in the results.
try {
    EntitlementUsageMetrics result = apiInstance.metricsEntitlementsAccountList(owner, page, pageSize, finish, start, tokens);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#metricsEntitlementsAccountList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]
 **finish** | **String**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional]
 **start** | **String**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional]
 **tokens** | **String**| A comma seperated list of tokens (slug perm) to include in the results. | [optional]

### Return type

[**EntitlementUsageMetrics**](EntitlementUsageMetrics.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="metricsEntitlementsRepoList"></a>
# **metricsEntitlementsRepoList**
> EntitlementUsageMetrics metricsEntitlementsRepoList(owner, repo, page, pageSize, finish, start, tokens)

View for listing entitlement token metrics, for a repository.

View for listing entitlement token metrics, for a repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.MetricsApi;

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

MetricsApi apiInstance = new MetricsApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
String finish = "finish_example"; // String | Include metrics upto and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
String start = "start_example"; // String | Include metrics from and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
String tokens = "tokens_example"; // String | A comma seperated list of tokens (slug perm) to include in the results.
try {
    EntitlementUsageMetrics result = apiInstance.metricsEntitlementsRepoList(owner, repo, page, pageSize, finish, start, tokens);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#metricsEntitlementsRepoList");
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
 **finish** | **String**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional]
 **start** | **String**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional]
 **tokens** | **String**| A comma seperated list of tokens (slug perm) to include in the results. | [optional]

### Return type

[**EntitlementUsageMetrics**](EntitlementUsageMetrics.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="metricsPackagesList"></a>
# **metricsPackagesList**
> PackageUsageMetrics metricsPackagesList(owner, repo, page, pageSize, finish, packages, start)

View for listing package usage metrics, for a repository.

View for listing package usage metrics, for a repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.MetricsApi;

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

MetricsApi apiInstance = new MetricsApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
String finish = "finish_example"; // String | Include metrics upto and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
String packages = "packages_example"; // String | A comma seperated list of packages (slug perm) to include in the results.
String start = "start_example"; // String | Include metrics from and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
try {
    PackageUsageMetrics result = apiInstance.metricsPackagesList(owner, repo, page, pageSize, finish, packages, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#metricsPackagesList");
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
 **finish** | **String**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional]
 **packages** | **String**| A comma seperated list of packages (slug perm) to include in the results. | [optional]
 **start** | **String**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional]

### Return type

[**PackageUsageMetrics**](PackageUsageMetrics.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

