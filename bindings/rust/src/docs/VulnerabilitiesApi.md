# \VulnerabilitiesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vulnerabilities_namespace_list**](VulnerabilitiesApi.md#vulnerabilities_namespace_list) | **Get** /vulnerabilities/{owner}/ | Lists scan results for a specific namespace.
[**vulnerabilities_package_list**](VulnerabilitiesApi.md#vulnerabilities_package_list) | **Get** /vulnerabilities/{owner}/{repo}/{package}/ | Lists scan results for a specific package.
[**vulnerabilities_read**](VulnerabilitiesApi.md#vulnerabilities_read) | **Get** /vulnerabilities/{owner}/{repo}/{package}/{identifier}/ | Get a scan result.
[**vulnerabilities_repo_list**](VulnerabilitiesApi.md#vulnerabilities_repo_list) | **Get** /vulnerabilities/{owner}/{repo}/ | Lists scan results for a specific repository.


# **vulnerabilities_namespace_list**
> Vec<::models::VulnerabilityScanResultsList> vulnerabilities_namespace_list(ctx, ctx, owner, optional)
Lists scan results for a specific namespace.

Lists scan results for a specific namespace.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::VulnerabilityScanResultsList>**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vulnerabilities_package_list**
> Vec<::models::VulnerabilityScanResultsList> vulnerabilities_package_list(ctx, ctx, owner, repo, package, optional)
Lists scan results for a specific package.

Lists scan results for a specific package.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
  **package** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **package** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::VulnerabilityScanResultsList>**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vulnerabilities_read**
> ::models::VulnerabilityScanResults vulnerabilities_read(ctx, ctx, owner, repo, package, identifier)
Get a scan result.

Get a scan result.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
  **package** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

[**::models::VulnerabilityScanResults**](VulnerabilityScanResults.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vulnerabilities_repo_list**
> Vec<::models::VulnerabilityScanResultsList> vulnerabilities_repo_list(ctx, ctx, owner, repo, optional)
Lists scan results for a specific repository.

Lists scan results for a specific repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::VulnerabilityScanResultsList>**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

