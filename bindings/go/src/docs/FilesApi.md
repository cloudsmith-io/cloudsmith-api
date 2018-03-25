# \FilesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FilesCreate**](FilesApi.md#FilesCreate) | **Post** /files/{owner}/{repo}/ | Request URL(s) to POST new package file upload(s) to.
[**FilesValidate**](FilesApi.md#FilesValidate) | **Post** /files/{owner}/{repo}/validate/ | Validate parameters used for create.


# **FilesCreate**
> PackageFileUpload FilesCreate($owner, $repo, $data)

Request URL(s) to POST new package file upload(s) to.

Request URL(s) to POST new package file upload(s) to.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**FilesCreate**](FilesCreate.md)|  | [optional] 

### Return type

[**PackageFileUpload**](PackageFileUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
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

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

