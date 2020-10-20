# \QuotaApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**QuotaHistoryRead**](QuotaApi.md#QuotaHistoryRead) | **Get** /quota/history/{owner}/ | Quota history for a given namespace.
[**QuotaOssHistoryRead**](QuotaApi.md#QuotaOssHistoryRead) | **Get** /quota/oss/history/{owner}/ | Open-source Quota history for a given namespace.
[**QuotaOssRead**](QuotaApi.md#QuotaOssRead) | **Get** /quota/oss/{owner}/ | Open-source Quota usage for a given namespace.
[**QuotaRead**](QuotaApi.md#QuotaRead) | **Get** /quota/{owner}/ | Quota usage for a given namespace.


# **QuotaHistoryRead**
> QuotaHistory QuotaHistoryRead($owner)

Quota history for a given namespace.

Quota history for a given namespace.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 

### Return type

[**QuotaHistory**](QuotaHistory.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QuotaOssHistoryRead**
> QuotaHistory QuotaOssHistoryRead($owner)

Open-source Quota history for a given namespace.

Open-source Quota history for a given namespace.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 

### Return type

[**QuotaHistory**](QuotaHistory.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QuotaOssRead**
> Quota QuotaOssRead($owner)

Open-source Quota usage for a given namespace.

Open-source Quota usage for a given namespace.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 

### Return type

[**Quota**](Quota.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **QuotaRead**
> Quota QuotaRead($owner)

Quota usage for a given namespace.

Quota usage for a given namespace.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 

### Return type

[**Quota**](Quota.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

