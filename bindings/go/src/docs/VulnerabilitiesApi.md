# \VulnerabilitiesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**VulnerabilitiesList**](VulnerabilitiesApi.md#VulnerabilitiesList) | **Get** /vulnerabilities/{owner}/ | Lists scan results for a specific namespace.
[**VulnerabilitiesList0**](VulnerabilitiesApi.md#VulnerabilitiesList0) | **Get** /vulnerabilities/{owner}/{repo}/ | Lists scan results for a specific repository.
[**VulnerabilitiesList1**](VulnerabilitiesApi.md#VulnerabilitiesList1) | **Get** /vulnerabilities/{owner}/{repo}/{package}/ | Lists scan results for a specific package.
[**VulnerabilitiesRead**](VulnerabilitiesApi.md#VulnerabilitiesRead) | **Get** /vulnerabilities/{owner}/{repo}/{package}/{scan_id}/ | Returns a Scan Result.


# **VulnerabilitiesList**
> []VulnerabilityScanResultsList VulnerabilitiesList($owner, $page, $pageSize)

Lists scan results for a specific namespace.

Lists scan results for a specific namespace.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 

### Return type

[**[]VulnerabilityScanResultsList**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VulnerabilitiesList0**
> []VulnerabilityScanResultsList VulnerabilitiesList0($owner, $repo, $page, $pageSize)

Lists scan results for a specific repository.

Lists scan results for a specific repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 

### Return type

[**[]VulnerabilityScanResultsList**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VulnerabilitiesList1**
> []VulnerabilityScanResultsList VulnerabilitiesList1($owner, $repo, $package_, $page, $pageSize)

Lists scan results for a specific package.

Lists scan results for a specific package.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **package_** | **string**|  | 
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 

### Return type

[**[]VulnerabilityScanResultsList**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VulnerabilitiesRead**
> VulnerabilityScanResults VulnerabilitiesRead($owner, $repo, $package_, $scanId)

Returns a Scan Result.

Returns a Scan Result.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

