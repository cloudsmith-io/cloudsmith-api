# \ReposApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ReposAllList**](ReposApi.md#ReposAllList) | **Get** /repos/ | Get a list of all repositories associated with current user.
[**ReposList**](ReposApi.md#ReposList) | **Get** /repos/{owner}/ | Get a list of all repositories within a namespace.
[**ReposRead**](ReposApi.md#ReposRead) | **Get** /repos/{owner}/{slug}/ | Views for working with repositories.


# **ReposAllList**
> []Repository ReposAllList($page, $pageSize)

Get a list of all repositories associated with current user.

Get a list of all repositories associated with current user.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 

### Return type

[**[]Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReposList**
> []Repository ReposList($owner, $page, $pageSize)

Get a list of all repositories within a namespace.

Get a list of all repositories within a namespace.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 

### Return type

[**[]Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReposRead**
> Repository ReposRead($owner, $slug)

Views for working with repositories.

Views for working with repositories.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **slug** | **string**|  | 

### Return type

[**Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

