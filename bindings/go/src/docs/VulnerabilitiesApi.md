# \VulnerabilitiesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**VulnerabilitiesList**](VulnerabilitiesApi.md#VulnerabilitiesList) | **Get** /vulnerabilities/{owner}/ | Checks feature is within plan before listing results.
[**VulnerabilitiesList0**](VulnerabilitiesApi.md#VulnerabilitiesList0) | **Get** /vulnerabilities/{owner}/{repo}/ | Checks feature is within plan before listing results.
[**VulnerabilitiesList1**](VulnerabilitiesApi.md#VulnerabilitiesList1) | **Get** /vulnerabilities/{owner}/{repo}/{package}/ | Check package identifier is valid before querying results.
[**VulnerabilitiesRead**](VulnerabilitiesApi.md#VulnerabilitiesRead) | **Get** /vulnerabilities/{owner}/{repo}/{package}/{scan_id}/ | Checks feature is within plan before retrieving results.


# **VulnerabilitiesList**
> []VulnerabilityScanResultsList VulnerabilitiesList($owner, $page, $pageSize)

Checks feature is within plan before listing results.

Checks feature is within plan before listing results.


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

Checks feature is within plan before listing results.

Checks feature is within plan before listing results.


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

Check package identifier is valid before querying results.

Check package identifier is valid before querying results.


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

Checks feature is within plan before retrieving results.

Checks feature is within plan before retrieving results.


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

