# \StorageregionsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**StorageRegionsList**](StorageregionsApi.md#StorageRegionsList) | **Get** /storage-regions/ | Get a list of all available storage regions.
[**StorageRegionsRead**](StorageregionsApi.md#StorageRegionsRead) | **Get** /storage-regions/{slug}/ | Get a specific storage region.


# **StorageRegionsList**
> []StorageRegion StorageRegionsList()

Get a list of all available storage regions.

Get a list of all available storage regions.


### Parameters
This endpoint does not need any parameter.

### Return type

[**[]StorageRegion**](StorageRegion.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StorageRegionsRead**
> StorageRegion StorageRegionsRead($slug)

Get a specific storage region.

Get a specific storage region.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **string**|  | 

### Return type

[**StorageRegion**](StorageRegion.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

