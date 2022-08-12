# \ReposApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ReposAllList**](ReposApi.md#ReposAllList) | **Get** /repos/ | Get a list of all repositories associated with current user.
[**ReposCreate**](ReposApi.md#ReposCreate) | **Post** /repos/{owner}/ | Create a new repository in a given namespace.
[**ReposDelete**](ReposApi.md#ReposDelete) | **Delete** /repos/{owner}/{identifier}/ | Delete a repository in a given namespace.
[**ReposGpgCreate**](ReposApi.md#ReposGpgCreate) | **Post** /repos/{owner}/{identifier}/gpg/ | Set the active GPG key for the Repository.
[**ReposGpgList**](ReposApi.md#ReposGpgList) | **Get** /repos/{owner}/{identifier}/gpg/ | Retrieve the active GPG key for the Repository.
[**ReposGpgRegenerate**](ReposApi.md#ReposGpgRegenerate) | **Post** /repos/{owner}/{identifier}/gpg/regenerate/ | Regenerate GPG Key for the Repository.
[**ReposList**](ReposApi.md#ReposList) | **Get** /repos/{owner}/ | Get a list of all repositories within a namespace.
[**ReposPartialUpdate**](ReposApi.md#ReposPartialUpdate) | **Patch** /repos/{owner}/{identifier}/ | Update details about a repository in a given namespace.
[**ReposPrivilegesDelete**](ReposApi.md#ReposPrivilegesDelete) | **Delete** /repos/{owner}/{identifier}/privileges | Remove the specified repository privileges.
[**ReposPrivilegesList**](ReposApi.md#ReposPrivilegesList) | **Get** /repos/{owner}/{identifier}/privileges | List all explicity created privileges for the repository.
[**ReposPrivilegesPartialUpdate**](ReposApi.md#ReposPrivilegesPartialUpdate) | **Patch** /repos/{owner}/{identifier}/privileges | Update the specified repository privileges.
[**ReposPrivilegesUpdate**](ReposApi.md#ReposPrivilegesUpdate) | **Put** /repos/{owner}/{identifier}/privileges | Replace all existing repository privileges with those specified.
[**ReposRead**](ReposApi.md#ReposRead) | **Get** /repos/{owner}/{identifier}/ | Get a specific repository.
[**ReposRsaCreate**](ReposApi.md#ReposRsaCreate) | **Post** /repos/{owner}/{identifier}/rsa/ | Set the active RSA key for the Repository.
[**ReposRsaList**](ReposApi.md#ReposRsaList) | **Get** /repos/{owner}/{identifier}/rsa/ | Retrieve the active RSA key for the Repository.
[**ReposRsaRegenerate**](ReposApi.md#ReposRsaRegenerate) | **Post** /repos/{owner}/{identifier}/rsa/regenerate/ | Regenerate RSA Key for the Repository.


# **ReposAllList**
> []Repository ReposAllList(ctx, optional)
Get a list of all repositories associated with current user.

Get a list of all repositories associated with current user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ReposApiReposAllListOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReposApiReposAllListOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **optional.Int32**| A page number within the paginated result set. | 
 **pageSize** | **optional.Int32**| Number of results to return per page. | 

### Return type

[**[]Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReposCreate**
> RepositoryCreate ReposCreate(ctx, owner, optional)
Create a new repository in a given namespace.

Create a new repository in a given namespace.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
 **optional** | ***ReposApiReposCreateOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReposApiReposCreateOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **data** | [**optional.Interface of ReposCreate**](ReposCreate.md)|  | 

### Return type

[**RepositoryCreate**](RepositoryCreate.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReposDelete**
> ReposDelete(ctx, owner, identifier)
Delete a repository in a given namespace.

Delete a repository in a given namespace.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **identifier** | **string**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReposGpgCreate**
> RepositoryGpgKey ReposGpgCreate(ctx, owner, identifier, optional)
Set the active GPG key for the Repository.

Set the active GPG key for the Repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **identifier** | **string**|  | 
 **optional** | ***ReposApiReposGpgCreateOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReposApiReposGpgCreateOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of ReposGpgCreate**](ReposGpgCreate.md)|  | 

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReposGpgList**
> RepositoryGpgKey ReposGpgList(ctx, owner, identifier)
Retrieve the active GPG key for the Repository.

Retrieve the active GPG key for the Repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **identifier** | **string**|  | 

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReposGpgRegenerate**
> RepositoryGpgKey ReposGpgRegenerate(ctx, owner, identifier)
Regenerate GPG Key for the Repository.

Regenerate GPG Key for the Repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **identifier** | **string**|  | 

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReposList**
> []Repository ReposList(ctx, owner, optional)
Get a list of all repositories within a namespace.

Get a list of all repositories within a namespace.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
 **optional** | ***ReposApiReposListOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReposApiReposListOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **page** | **optional.Int32**| A page number within the paginated result set. | 
 **pageSize** | **optional.Int32**| Number of results to return per page. | 

### Return type

[**[]Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReposPartialUpdate**
> Repository ReposPartialUpdate(ctx, owner, identifier, optional)
Update details about a repository in a given namespace.

Update details about a repository in a given namespace.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **identifier** | **string**|  | 
 **optional** | ***ReposApiReposPartialUpdateOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReposApiReposPartialUpdateOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of ReposPartialUpdate**](ReposPartialUpdate.md)|  | 

### Return type

[**Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReposPrivilegesDelete**
> ReposPrivilegesDelete(ctx, owner, identifier)
Remove the specified repository privileges.

Remove the specified repository privileges.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **identifier** | **string**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReposPrivilegesList**
> []RepositoryPrivilegeList ReposPrivilegesList(ctx, owner, identifier)
List all explicity created privileges for the repository.

List all explicity created privileges for the repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **identifier** | **string**|  | 

### Return type

[**[]RepositoryPrivilegeList**](RepositoryPrivilegeList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReposPrivilegesPartialUpdate**
> ReposPrivilegesPartialUpdate(ctx, owner, identifier)
Update the specified repository privileges.

Update the specified repository privileges.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **identifier** | **string**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReposPrivilegesUpdate**
> RepositoryPrivilegeList ReposPrivilegesUpdate(ctx, owner, identifier)
Replace all existing repository privileges with those specified.

Replace all existing repository privileges with those specified.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **identifier** | **string**|  | 

### Return type

[**RepositoryPrivilegeList**](RepositoryPrivilegeList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReposRead**
> Repository ReposRead(ctx, owner, identifier)
Get a specific repository.

Get a specific repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **identifier** | **string**|  | 

### Return type

[**Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReposRsaCreate**
> RepositoryRsaKey ReposRsaCreate(ctx, owner, identifier, optional)
Set the active RSA key for the Repository.

Set the active RSA key for the Repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **identifier** | **string**|  | 
 **optional** | ***ReposApiReposRsaCreateOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReposApiReposRsaCreateOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of ReposRsaCreate**](ReposRsaCreate.md)|  | 

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReposRsaList**
> RepositoryRsaKey ReposRsaList(ctx, owner, identifier)
Retrieve the active RSA key for the Repository.

Retrieve the active RSA key for the Repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **identifier** | **string**|  | 

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReposRsaRegenerate**
> RepositoryRsaKey ReposRsaRegenerate(ctx, owner, identifier)
Regenerate RSA Key for the Repository.

Regenerate RSA Key for the Repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **identifier** | **string**|  | 

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

