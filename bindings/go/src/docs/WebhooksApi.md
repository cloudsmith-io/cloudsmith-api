# \WebhooksApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**WebhooksCreate**](WebhooksApi.md#WebhooksCreate) | **Post** /webhooks/{owner}/{repo}/ | Create a specific webhook in a repository.
[**WebhooksDelete**](WebhooksApi.md#WebhooksDelete) | **Delete** /webhooks/{owner}/{repo}/{identifier}/ | Delete a specific webhook in a repository.
[**WebhooksList**](WebhooksApi.md#WebhooksList) | **Get** /webhooks/{owner}/{repo}/ | Get a list of all webhooks in a repository.
[**WebhooksPartialUpdate**](WebhooksApi.md#WebhooksPartialUpdate) | **Patch** /webhooks/{owner}/{repo}/{identifier}/ | Update a specific webhook in a repository.
[**WebhooksRead**](WebhooksApi.md#WebhooksRead) | **Get** /webhooks/{owner}/{repo}/{identifier}/ | Views for working with repository webhooks.


# **WebhooksCreate**
> RepositoryWebhook WebhooksCreate($owner, $repo, $data)

Create a specific webhook in a repository.

Create a specific webhook in a repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**WebhooksCreate**](WebhooksCreate.md)|  | [optional] 

### Return type

[**RepositoryWebhook**](RepositoryWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WebhooksDelete**
> WebhooksDelete($owner, $repo, $identifier)

Delete a specific webhook in a repository.

Delete a specific webhook in a repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **identifier** | **string**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WebhooksList**
> []RepositoryWebhook WebhooksList($owner, $repo, $page, $pageSize)

Get a list of all webhooks in a repository.

Get a list of all webhooks in a repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 

### Return type

[**[]RepositoryWebhook**](RepositoryWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WebhooksPartialUpdate**
> RepositoryWebhook WebhooksPartialUpdate($owner, $repo, $identifier, $data)

Update a specific webhook in a repository.

Update a specific webhook in a repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **identifier** | **string**|  | 
 **data** | [**WebhooksPartialUpdate**](WebhooksPartialUpdate.md)|  | [optional] 

### Return type

[**RepositoryWebhook**](RepositoryWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WebhooksRead**
> RepositoryWebhook WebhooksRead($owner, $repo, $identifier)

Views for working with repository webhooks.

Views for working with repository webhooks.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **identifier** | **string**|  | 

### Return type

[**RepositoryWebhook**](RepositoryWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

