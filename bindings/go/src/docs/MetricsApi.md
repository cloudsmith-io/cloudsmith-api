# \MetricsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MetricsEntitlementsUsageList**](MetricsApi.md#MetricsEntitlementsUsageList) | **Get** /metrics/{owner}/{repo}/entitlements/usage/ | View for listing entitlement token usage as a metric.
[**MetricsPackagesUsageList**](MetricsApi.md#MetricsPackagesUsageList) | **Get** /metrics/{owner}/{repo}/packages/usage/ | View for listing package usage metrics by user.


# **MetricsEntitlementsUsageList**
> []EntitlementTokenMetric MetricsEntitlementsUsageList($owner, $repo, $page, $pageSize, $finish, $start, $tokens)

View for listing entitlement token usage as a metric.

View for listing entitlement token usage as a metric.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 
 **finish** | **int32**| Filter token usage ending before this datetime (UTC by default unless otherwise specified). Defaults to now if not supplied. | [optional] 
 **start** | **int32**| Filter token usage starting from this datetime (UTC by default unless otherwise specified)). | [optional] 
 **tokens** | **string**| A comma seperated list of tokens (slug perm) to include in the results. | [optional] 

### Return type

[**[]EntitlementTokenMetric**](EntitlementTokenMetric.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MetricsPackagesUsageList**
> []PackageUsageMetric MetricsPackagesUsageList($owner, $repo, $page, $pageSize, $finish, $packages, $start)

View for listing package usage metrics by user.

View for listing package usage metrics by user.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 
 **finish** | **int32**| Filter token usage ending before this datetime (UTC). Defaults to now if not supplied. | [optional] 
 **packages** | **string**| A comma seperated list of packages (slug perm) to include in the results. | [optional] 
 **start** | **int32**| Filter token usage starting from this datetime (UTC)). | [optional] 

### Return type

[**[]PackageUsageMetric**](PackageUsageMetric.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
