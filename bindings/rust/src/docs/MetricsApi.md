# \MetricsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**metrics_entitlements_account_list**](MetricsApi.md#metrics_entitlements_account_list) | **Get** /metrics/entitlements/{owner}/ | View for listing entitlement token metrics, across an account.
[**metrics_entitlements_repo_list**](MetricsApi.md#metrics_entitlements_repo_list) | **Get** /metrics/entitlements/{owner}/{repo}/ | View for listing entitlement token metrics, for a repository.
[**metrics_packages_list**](MetricsApi.md#metrics_packages_list) | **Get** /metrics/packages/{owner}/{repo}/ | View for listing package usage metrics, for a repository.


# **metrics_entitlements_account_list**
> ::models::EntitlementUsageMetrics metrics_entitlements_account_list(ctx, ctx, owner, optional)
View for listing entitlement token metrics, across an account.

View for listing entitlement token metrics, across an account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 
 **finish** | **String**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | 
 **start** | **String**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | 
 **tokens** | **String**| A comma seperated list of tokens (slug perm) to include in the results. | 

### Return type

[**::models::EntitlementUsageMetrics**](EntitlementUsageMetrics.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metrics_entitlements_repo_list**
> ::models::EntitlementUsageMetrics metrics_entitlements_repo_list(ctx, ctx, owner, repo, optional)
View for listing entitlement token metrics, for a repository.

View for listing entitlement token metrics, for a repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 
 **finish** | **String**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | 
 **start** | **String**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | 
 **tokens** | **String**| A comma seperated list of tokens (slug perm) to include in the results. | 

### Return type

[**::models::EntitlementUsageMetrics**](EntitlementUsageMetrics.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metrics_packages_list**
> ::models::PackageUsageMetrics metrics_packages_list(ctx, ctx, owner, repo, optional)
View for listing package usage metrics, for a repository.

View for listing package usage metrics, for a repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 
 **finish** | **String**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | 
 **packages** | **String**| A comma seperated list of packages (slug perm) to include in the results. | 
 **start** | **String**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | 

### Return type

[**::models::PackageUsageMetrics**](PackageUsageMetrics.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

