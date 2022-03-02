# \VulnerabilitiesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**VulnerabilitiesList**](VulnerabilitiesApi.md#VulnerabilitiesList) | **Get** /vulnerabilities/{owner}/ | Lists scan results for a specific namespace.
[**VulnerabilitiesList0**](VulnerabilitiesApi.md#VulnerabilitiesList0) | **Get** /vulnerabilities/{owner}/{repo}/ | Lists scan results for a specific repository.
[**VulnerabilitiesList1**](VulnerabilitiesApi.md#VulnerabilitiesList1) | **Get** /vulnerabilities/{owner}/{repo}/{package}/ | Lists scan results for a specific package.
[**VulnerabilitiesRead**](VulnerabilitiesApi.md#VulnerabilitiesRead) | **Get** /vulnerabilities/{owner}/{repo}/{package}/{scan_id}/ | Returns a Scan Result.


# **VulnerabilitiesList**
> []VulnerabilityScanResultsList VulnerabilitiesList(ctx, owner, optional)
Lists scan results for a specific namespace.

Lists scan results for a specific namespace.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
 **optional** | ***VulnerabilitiesApiVulnerabilitiesListOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a VulnerabilitiesApiVulnerabilitiesListOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **page** | **optional.Int32**| A page number within the paginated result set. | 
 **pageSize** | **optional.Int32**| Number of results to return per page. | 

### Return type

[**[]VulnerabilityScanResultsList**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VulnerabilitiesList0**
> []VulnerabilityScanResultsList VulnerabilitiesList0(ctx, owner, repo, optional)
Lists scan results for a specific repository.

Lists scan results for a specific repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***VulnerabilitiesApiVulnerabilitiesList0Opts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a VulnerabilitiesApiVulnerabilitiesList0Opts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **page** | **optional.Int32**| A page number within the paginated result set. | 
 **pageSize** | **optional.Int32**| Number of results to return per page. | 

### Return type

[**[]VulnerabilityScanResultsList**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VulnerabilitiesList1**
> []VulnerabilityScanResultsList VulnerabilitiesList1(ctx, owner, repo, package_, optional)
Lists scan results for a specific package.

Lists scan results for a specific package.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
  **package_** | **string**|  | 
 **optional** | ***VulnerabilitiesApiVulnerabilitiesList1Opts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a VulnerabilitiesApiVulnerabilitiesList1Opts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **page** | **optional.Int32**| A page number within the paginated result set. | 
 **pageSize** | **optional.Int32**| Number of results to return per page. | 

### Return type

[**[]VulnerabilityScanResultsList**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VulnerabilitiesRead**
> VulnerabilityScanResults VulnerabilitiesRead(ctx, owner, repo, package_, scanId)
Returns a Scan Result.

Returns a Scan Result.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
  **package_** | **string**|  | 
  **scanId** | **string**|  | 

### Return type

[**VulnerabilityScanResults**](VulnerabilityScanResults.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

