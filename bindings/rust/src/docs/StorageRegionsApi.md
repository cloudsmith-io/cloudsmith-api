# \StorageRegionsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**storage_regions_list**](StorageRegionsApi.md#storage_regions_list) | **Get** /storage-regions/ | Get a list of all available storage regions.
[**storage_regions_read**](StorageRegionsApi.md#storage_regions_read) | **Get** /storage-regions/{slug}/ | Get a specific storage region.


# **storage_regions_list**
> Vec<::models::StorageRegion> storage_regions_list(ctx, ctx, )
Get a list of all available storage regions.

Get a list of all available storage regions.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Vec<::models::StorageRegion>**](StorageRegion.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storage_regions_read**
> ::models::StorageRegion storage_regions_read(ctx, ctx, slug)
Get a specific storage region.

Get a specific storage region.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **slug** | **String**|  | 

### Return type

[**::models::StorageRegion**](StorageRegion.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

