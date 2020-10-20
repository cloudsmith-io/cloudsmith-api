# \VulnerabilitiesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**VulnerabilitiesList**](VulnerabilitiesApi.md#VulnerabilitiesList) | **Get** /vulnerabilities/{owner}/ | Read-only view to list vulnerabiltiy scan results within a Namespace.
[**VulnerabilitiesList0**](VulnerabilitiesApi.md#VulnerabilitiesList0) | **Get** /vulnerabilities/{owner}/{repo}/ | Read-only views to list vulnerabiltiy scan results within a Repository.
[**VulnerabilitiesList1**](VulnerabilitiesApi.md#VulnerabilitiesList1) | **Get** /vulnerabilities/{owner}/{repo}/{package}/ | Read-only views to list vulnerabiltiy scan results within a Repository
[**VulnerabilitiesRead**](VulnerabilitiesApi.md#VulnerabilitiesRead) | **Get** /vulnerabilities/{owner}/{repo}/{package}/{scan_id}/ | Read-only view to retrieve vulnerability scans results using a


# **VulnerabilitiesList**
> []VulnerabilityScanResultsList VulnerabilitiesList($owner, $page, $pageSize)

Read-only view to list vulnerabiltiy scan results within a Namespace.

Read-only view to list vulnerabiltiy scan results within a Namespace.


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

Read-only views to list vulnerabiltiy scan results within a Repository.

Read-only views to list vulnerabiltiy scan results within a Repository.


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

Read-only views to list vulnerabiltiy scan results within a Repository

Read-only views to list vulnerabiltiy scan results within a Repository for a given Package identifier.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **package_** | **string**| The package that the scan result relates to. | 
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

Read-only view to retrieve vulnerability scans results using a

Read-only view to retrieve vulnerability scans results using a vulnerabiltiy scan results identifier (slug_perm).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **package_** | **string**| The package that the scan result relates to. | 
 **scanId** | **string**| A sequential identifier that increments by one for each new scan result within a package. These are always unique and can be used to reference the scan results elsewhere (e.g. via the CLI.) | 

### Return type

[**VulnerabilityScanResults**](VulnerabilityScanResults.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

