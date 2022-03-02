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
> FilesAbort(ctx, owner, repo, identifier, optional)
Abort a multipart file upload.

Abort a multipart file upload.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
  **identifier** | **string**|  | 
 **optional** | ***FilesApiFilesAbortOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a FilesApiFilesAbortOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **data** | [**optional.Interface of FilesAbort**](FilesAbort.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FilesComplete**
> PackageFileUpload FilesComplete(ctx, owner, repo, identifier, optional)
Complete a multipart file upload.

Complete a multipart file upload.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
  **identifier** | **string**|  | 
 **optional** | ***FilesApiFilesCompleteOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a FilesApiFilesCompleteOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **data** | [**optional.Interface of FilesComplete**](FilesComplete.md)|  | 

### Return type

[**PackageFileUpload**](PackageFileUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FilesCreate**
> PackageFileUpload FilesCreate(ctx, owner, repo, optional)
Request URL(s) to upload new package file upload(s) to.

Request URL(s) to upload new package file upload(s) to.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***FilesApiFilesCreateOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a FilesApiFilesCreateOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of FilesCreate**](FilesCreate.md)|  | 

### Return type

[**PackageFileUpload**](PackageFileUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FilesInfo**
> PackageFilePartsUpload FilesInfo(ctx, owner, repo, identifier)
Get upload information for a multipart file upload.

Get upload information for a multipart file upload.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
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
> FilesValidate(ctx, owner, repo, optional)
Validate parameters used for create.

Validate parameters used for create.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***FilesApiFilesValidateOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a FilesApiFilesValidateOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of FilesValidate**](FilesValidate.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

