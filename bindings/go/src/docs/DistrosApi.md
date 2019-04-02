# \DistrosApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DistrosList**](DistrosApi.md#DistrosList) | **Get** /distros/ | Get a list of all supported distributions.
[**DistrosRead**](DistrosApi.md#DistrosRead) | **Get** /distros/{slug}/ | View for viewing/listing distributions.


# **DistrosList**
> []Distribution DistrosList()

Get a list of all supported distributions.

Get a list of all supported distributions.


### Parameters
This endpoint does not need any parameter.

### Return type

[**[]Distribution**](Distribution.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DistrosRead**
> Distribution DistrosRead($slug)

View for viewing/listing distributions.

View for viewing/listing distributions.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **string**|  | 

### Return type

[**Distribution**](Distribution.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

