# \StorageRegionsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**StorageRegionsList**](StorageRegionsApi.md#StorageRegionsList) | **Get** /storage-regions/ | Get a list of all available storage regions.
[**StorageRegionsRead**](StorageRegionsApi.md#StorageRegionsRead) | **Get** /storage-regions/{slug}/ | Get a specific storage region.


# **StorageRegionsList**
> []StorageRegion StorageRegionsList(ctx, )
Get a list of all available storage regions.

Get a list of all available storage regions.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]StorageRegion**](StorageRegion.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StorageRegionsRead**
> StorageRegion StorageRegionsRead(ctx, slug)
Get a specific storage region.

Get a specific storage region.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **slug** | **string**|  | 

### Return type

[**StorageRegion**](StorageRegion.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

