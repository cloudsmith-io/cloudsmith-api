# \FormatsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FormatsList**](FormatsApi.md#FormatsList) | **Get** /formats/ | Get a list of all supported package formats.
[**FormatsRead**](FormatsApi.md#FormatsRead) | **Get** /formats/{slug}/ | Get a specific supported package format.


# **FormatsList**
> []Format FormatsList()

Get a list of all supported package formats.

Get a list of all supported package formats.


### Parameters
This endpoint does not need any parameter.

### Return type

[**[]Format**](Format.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FormatsRead**
> Format FormatsRead($slug)

Get a specific supported package format.

Get a specific supported package format.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **string**|  | 

### Return type

[**Format**](Format.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

