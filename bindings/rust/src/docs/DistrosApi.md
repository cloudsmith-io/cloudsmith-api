# \DistrosApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**distros_list**](DistrosApi.md#distros_list) | **Get** /distros/ | Get a list of all supported distributions.
[**distros_read**](DistrosApi.md#distros_read) | **Get** /distros/{slug}/ | View for viewing/listing distributions.


# **distros_list**
> Vec<::models::DistributionFull> distros_list(ctx, ctx, )
Get a list of all supported distributions.

Get a list of all supported distributions.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Vec<::models::DistributionFull>**](DistributionFull.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **distros_read**
> ::models::DistributionFull distros_read(ctx, ctx, slug)
View for viewing/listing distributions.

View for viewing/listing distributions.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **slug** | **String**|  | 

### Return type

[**::models::DistributionFull**](DistributionFull.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

