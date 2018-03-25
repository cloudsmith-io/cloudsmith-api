# \EntitlementsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntitlementsCreate**](EntitlementsApi.md#EntitlementsCreate) | **Post** /entitlements/{owner}/{repo}/ | Create a specific entitlement in a repository.
[**EntitlementsDelete**](EntitlementsApi.md#EntitlementsDelete) | **Delete** /entitlements/{owner}/{repo}/{slug_perm}/ | Delete a specific entitlement in a repository.
[**EntitlementsList**](EntitlementsApi.md#EntitlementsList) | **Get** /entitlements/{owner}/{repo}/ | Get a list of all entitlements in a repository.
[**EntitlementsPartialUpdate**](EntitlementsApi.md#EntitlementsPartialUpdate) | **Patch** /entitlements/{owner}/{repo}/{slug_perm}/ | Update a specific entitlement in a repository.
[**EntitlementsRead**](EntitlementsApi.md#EntitlementsRead) | **Get** /entitlements/{owner}/{repo}/{slug_perm}/ | Views for working with repository entitlements.
[**EntitlementsRefresh**](EntitlementsApi.md#EntitlementsRefresh) | **Post** /entitlements/{owner}/{repo}/{slug_perm}/refresh/ | Refresh an entitlement token in a repository.
[**EntitlementsSync**](EntitlementsApi.md#EntitlementsSync) | **Post** /entitlements/{owner}/{repo}/sync/ | Synchronise tokens from a source repository.


# **EntitlementsCreate**
> RepositoryToken EntitlementsCreate($owner, $repo, $data)

Create a specific entitlement in a repository.

Create a specific entitlement in a repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**EntitlementsCreate**](EntitlementsCreate.md)|  | [optional] 

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EntitlementsDelete**
> EntitlementsDelete($owner, $repo, $slugPerm)

Delete a specific entitlement in a repository.

Delete a specific entitlement in a repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **slugPerm** | **string**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EntitlementsList**
> []RepositoryToken EntitlementsList($owner, $repo, $page, $pageSize)

Get a list of all entitlements in a repository.

Get a list of all entitlements in a repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 

### Return type

[**[]RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EntitlementsPartialUpdate**
> RepositoryToken EntitlementsPartialUpdate($owner, $repo, $slugPerm, $data)

Update a specific entitlement in a repository.

Update a specific entitlement in a repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **slugPerm** | **string**|  | 
 **data** | [**EntitlementsPartialUpdate**](EntitlementsPartialUpdate.md)|  | [optional] 

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EntitlementsRead**
> RepositoryToken EntitlementsRead($owner, $repo, $slugPerm)

Views for working with repository entitlements.

Views for working with repository entitlements.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **slugPerm** | **string**|  | 

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EntitlementsRefresh**
> RepositoryTokenRefresh EntitlementsRefresh($owner, $repo, $slugPerm, $data)

Refresh an entitlement token in a repository.

Refresh an entitlement token in a repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **slugPerm** | **string**|  | 
 **data** | [**EntitlementsRefresh**](EntitlementsRefresh.md)|  | [optional] 

### Return type

[**RepositoryTokenRefresh**](RepositoryTokenRefresh.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EntitlementsSync**
> RepositoryTokenSync EntitlementsSync($owner, $repo, $data)

Synchronise tokens from a source repository.

Synchronise tokens from a source repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**EntitlementsSync**](EntitlementsSync.md)|  | [optional] 

### Return type

[**RepositoryTokenSync**](RepositoryTokenSync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

