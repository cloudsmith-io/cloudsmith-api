# \QuotaApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**QuotaHistoryList**](QuotaApi.md#QuotaHistoryList) | **Get** /quota/{owner}/history/ | Quota history for a given namespace.
[**QuotaList**](QuotaApi.md#QuotaList) | **Get** /quota/{owner}/ | Quota usage for a given namespace.
[**QuotaOssHistoryList**](QuotaApi.md#QuotaOssHistoryList) | **Get** /quota/{owner}/oss/history/ | Open-source Quota history for a given namespace.
[**QuotaOssList**](QuotaApi.md#QuotaOssList) | **Get** /quota/{owner}/oss/ | Open-source Quota usage for a given namespace.


# **QuotaHistoryList**
> []QuotaHistory QuotaHistoryList($owner, $page, $pageSize)

Quota history for a given namespace.

Quota history for a given namespace.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 

### Return type

[**[]QuotaHistory**](QuotaHistory.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QuotaList**
> []Quota QuotaList($owner, $page, $pageSize)

Quota usage for a given namespace.

Quota usage for a given namespace.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 

### Return type

[**[]Quota**](Quota.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QuotaOssHistoryList**
> []QuotaHistory QuotaOssHistoryList($owner, $page, $pageSize)

Open-source Quota history for a given namespace.

Open-source Quota history for a given namespace.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 

### Return type

[**[]QuotaHistory**](QuotaHistory.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QuotaOssList**
> []Quota QuotaOssList($owner, $page, $pageSize)

Open-source Quota usage for a given namespace.

Open-source Quota usage for a given namespace.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 

### Return type

[**[]Quota**](Quota.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

