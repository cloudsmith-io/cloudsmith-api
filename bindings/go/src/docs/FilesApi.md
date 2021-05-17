# \FilesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FilesAbort**](FilesApi.md#FilesAbort) | **Post** /files/{owner}/{repo}/{identifier}/abort/ | Abort a multipart file upload.
[**FilesComplete**](FilesApi.md#FilesComplete) | **Post** /files/{owner}/{repo}/{identifier}/complete/ | Complete a multipart file upload.
[**FilesCreate**](FilesApi.md#FilesCreate) | **Post** /files/{owner}/{repo}/ | Request URL(s) to upload new package file upload(s) to.
[**FilesInfo**](FilesApi.md#FilesInfo) | **Get** /files/{owner}/{repo}/{identifier}/info/ | Get upload information for a multipart file upload.
[**FilesValidate**](FilesApi.md#FilesValidate) | **Post** /files/{owner}/{repo}/validate/ | Validate parameters used for create.


# **FilesAbort**
> FilesAbort($owner, $repo, $identifier, $data)

Abort a multipart file upload.

Abort a multipart file upload.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **identifier** | **string**|  | 
 **data** | [**FilesAbort**](FilesAbort.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FilesComplete**
> PackageFileUpload FilesComplete($owner, $repo, $identifier, $data)

Complete a multipart file upload.

Complete a multipart file upload.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **identifier** | **string**|  | 
 **data** | [**FilesComplete**](FilesComplete.md)|  | [optional] 

### Return type

[**PackageFileUpload**](PackageFileUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FilesCreate**
> PackageFileUpload FilesCreate($owner, $repo, $data)

Request URL(s) to upload new package file upload(s) to.

Request URL(s) to upload new package file upload(s) to.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**FilesCreate**](FilesCreate.md)|  | [optional] 

### Return type

[**PackageFileUpload**](PackageFileUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FilesInfo**
> PackageFilePartsUpload FilesInfo($owner, $repo, $identifier)

Get upload information for a multipart file upload.

Get upload information for a multipart file upload.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **identifier** | **string**|  | 

### Return type

[**PackageFilePartsUpload**](PackageFilePartsUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FilesValidate**
> FilesValidate($owner, $repo, $data)

Validate parameters used for create.

Validate parameters used for create.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**FilesValidate**](FilesValidate.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

