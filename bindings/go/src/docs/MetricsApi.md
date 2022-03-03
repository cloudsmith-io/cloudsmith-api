# \MetricsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MetricsEntitlementsList**](MetricsApi.md#MetricsEntitlementsList) | **Get** /metrics/entitlements/{owner}/ | View for listing entitlement token metrics, across an account.
[**MetricsEntitlementsList0**](MetricsApi.md#MetricsEntitlementsList0) | **Get** /metrics/entitlements/{owner}/{repo}/ | View for listing entitlement token metrics, for a repository.
[**MetricsPackagesList**](MetricsApi.md#MetricsPackagesList) | **Get** /metrics/packages/{owner}/{repo}/ | View for listing package usage metrics, for a repository.


# **MetricsEntitlementsList**
> EntitlementUsageMetrics MetricsEntitlementsList(ctx, owner, optional)
View for listing entitlement token metrics, across an account.

View for listing entitlement token metrics, across an account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
 **optional** | ***MetricsApiMetricsEntitlementsListOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a MetricsApiMetricsEntitlementsListOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **page** | **optional.Int32**| A page number within the paginated result set. | 
 **pageSize** | **optional.Int32**| Number of results to return per page. | 
 **finish** | **optional.String**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | 
 **start** | **optional.String**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | 
 **tokens** | **optional.String**| A comma seperated list of tokens (slug perm) to include in the results. | 

### Return type

[**EntitlementUsageMetrics**](EntitlementUsageMetrics.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MetricsEntitlementsList0**
> EntitlementUsageMetrics MetricsEntitlementsList0(ctx, owner, repo, optional)
View for listing entitlement token metrics, for a repository.

View for listing entitlement token metrics, for a repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***MetricsApiMetricsEntitlementsList0Opts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a MetricsApiMetricsEntitlementsList0Opts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **page** | **optional.Int32**| A page number within the paginated result set. | 
 **pageSize** | **optional.Int32**| Number of results to return per page. | 
 **finish** | **optional.String**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | 
 **start** | **optional.String**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | 
 **tokens** | **optional.String**| A comma seperated list of tokens (slug perm) to include in the results. | 

### Return type

[**EntitlementUsageMetrics**](EntitlementUsageMetrics.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MetricsPackagesList**
> PackageUsageMetrics MetricsPackagesList(ctx, owner, repo, optional)
View for listing package usage metrics, for a repository.

View for listing package usage metrics, for a repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***MetricsApiMetricsPackagesListOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a MetricsApiMetricsPackagesListOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **page** | **optional.Int32**| A page number within the paginated result set. | 
 **pageSize** | **optional.Int32**| Number of results to return per page. | 
 **finish** | **optional.String**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | 
 **packages** | **optional.String**| A comma seperated list of packages (slug perm) to include in the results. | 
 **start** | **optional.String**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | 

### Return type

[**PackageUsageMetrics**](PackageUsageMetrics.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

