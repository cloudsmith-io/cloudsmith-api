# \MetricsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MetricsEntitlementsList**](MetricsApi.md#MetricsEntitlementsList) | **Get** /metrics/entitlements/{owner}/ | View for listing entitlement token metrics, across an account.
[**MetricsEntitlementsList0**](MetricsApi.md#MetricsEntitlementsList0) | **Get** /metrics/entitlements/{owner}/{repo}/ | View for listing entitlement token metrics, for a repository.
[**MetricsPackagesList**](MetricsApi.md#MetricsPackagesList) | **Get** /metrics/packages/{owner}/{repo}/ | View for listing package usage metrics, for a repository.


# **MetricsEntitlementsList**
> EntitlementUsageMetrics MetricsEntitlementsList($owner, $page, $pageSize, $finish, $start, $tokens)

View for listing entitlement token metrics, across an account.

View for listing entitlement token metrics, across an account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 
 **finish** | **string**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 
 **start** | **string**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 
 **tokens** | **string**| A comma seperated list of tokens (slug perm) to include in the results. | [optional] 

### Return type

[**EntitlementUsageMetrics**](EntitlementUsageMetrics.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MetricsEntitlementsList0**
> EntitlementUsageMetrics MetricsEntitlementsList0($owner, $repo, $page, $pageSize, $finish, $start, $tokens)

View for listing entitlement token metrics, for a repository.

View for listing entitlement token metrics, for a repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 
 **finish** | **string**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 
 **start** | **string**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 
 **tokens** | **string**| A comma seperated list of tokens (slug perm) to include in the results. | [optional] 

### Return type

[**EntitlementUsageMetrics**](EntitlementUsageMetrics.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MetricsPackagesList**
> PackageUsageMetrics MetricsPackagesList($owner, $repo, $page, $pageSize, $finish, $packages, $start)

View for listing package usage metrics, for a repository.

View for listing package usage metrics, for a repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 
 **finish** | **string**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 
 **packages** | **string**| A comma seperated list of packages (slug perm) to include in the results. | [optional] 
 **start** | **string**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 

### Return type

[**PackageUsageMetrics**](PackageUsageMetrics.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

