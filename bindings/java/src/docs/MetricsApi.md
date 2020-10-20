# MetricsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**metricsEntitlementsUsageList**](MetricsApi.md#metricsEntitlementsUsageList) | **GET** /metrics/{owner}/{repo}/entitlements/usage/ | View for listing entitlement token usage as a metric.
[**metricsPackagesUsageList**](MetricsApi.md#metricsPackagesUsageList) | **GET** /metrics/{owner}/{repo}/packages/usage/ | View for listing package usage metrics by user.


<a name="metricsEntitlementsUsageList"></a>
# **metricsEntitlementsUsageList**
> List&lt;EntitlementUsageMetric&gt; metricsEntitlementsUsageList(owner, repo, page, pageSize, finish, start, tokens)

View for listing entitlement token usage as a metric.

View for listing entitlement token usage as a metric.

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

MetricsApi apiInstance = new MetricsApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
Integer finish = 56; // Integer | Filter token usage ending before this datetime (UTC by default unless otherwise specified). Defaults to now if not supplied.
Integer start = 56; // Integer | Filter token usage starting from this datetime (UTC by default unless otherwise specified)).
String tokens = "tokens_example"; // String | A comma seperated list of tokens (slug perm) to include in the results.
try {
    List<EntitlementUsageMetric> result = apiInstance.metricsEntitlementsUsageList(owner, repo, page, pageSize, finish, start, tokens);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#metricsEntitlementsUsageList");
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
 **finish** | **Integer**| Filter token usage ending before this datetime (UTC by default unless otherwise specified). Defaults to now if not supplied. | [optional]
 **start** | **Integer**| Filter token usage starting from this datetime (UTC by default unless otherwise specified)). | [optional]
 **tokens** | **String**| A comma seperated list of tokens (slug perm) to include in the results. | [optional]

### Return type

[**List&lt;EntitlementUsageMetric&gt;**](EntitlementUsageMetric.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="metricsPackagesUsageList"></a>
# **metricsPackagesUsageList**
> List&lt;PackageUsageMetric&gt; metricsPackagesUsageList(owner, repo, page, pageSize, finish, packages, start)

View for listing package usage metrics by user.

View for listing package usage metrics by user.

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

MetricsApi apiInstance = new MetricsApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
Integer finish = 56; // Integer | Filter token usage ending before this datetime (UTC). Defaults to now if not supplied.
String packages = "packages_example"; // String | A comma seperated list of packages (slug perm) to include in the results.
Integer start = 56; // Integer | Filter token usage starting from this datetime (UTC)).
try {
    List<PackageUsageMetric> result = apiInstance.metricsPackagesUsageList(owner, repo, page, pageSize, finish, packages, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#metricsPackagesUsageList");
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
 **finish** | **Integer**| Filter token usage ending before this datetime (UTC). Defaults to now if not supplied. | [optional]
 **packages** | **String**| A comma seperated list of packages (slug perm) to include in the results. | [optional]
 **start** | **Integer**| Filter token usage starting from this datetime (UTC)). | [optional]

### Return type

[**List&lt;PackageUsageMetric&gt;**](PackageUsageMetric.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

