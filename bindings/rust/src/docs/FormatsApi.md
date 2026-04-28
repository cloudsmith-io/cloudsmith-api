# \FormatsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**formats_list**](FormatsApi.md#formats_list) | **Get** /formats/ | Get a list of all supported package formats.
[**formats_read**](FormatsApi.md#formats_read) | **Get** /formats/{slug}/ | Get a specific supported package format.


# **formats_list**
> Vec<::models::Format> formats_list(ctx, ctx, )
Get a list of all supported package formats.

Get a list of all supported package formats.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Vec<::models::Format>**](Format.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **formats_read**
> ::models::Format formats_read(ctx, ctx, slug)
Get a specific supported package format.

Get a specific supported package format.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **slug** | **String**|  | 

### Return type

[**::models::Format**](Format.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

