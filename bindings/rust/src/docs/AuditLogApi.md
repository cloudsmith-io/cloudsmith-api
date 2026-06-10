# \AuditLogApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audit_log_namespace_list**](AuditLogApi.md#audit_log_namespace_list) | **Get** /audit-log/{owner}/ | Lists audit log entries for a specific namespace.
[**audit_log_repo_list**](AuditLogApi.md#audit_log_repo_list) | **Get** /audit-log/{owner}/{repo}/ | Lists audit log entries for a specific repository.


# **audit_log_namespace_list**
> Vec<::models::NamespaceAuditLog> audit_log_namespace_list(ctx, ctx, owner, optional)
Lists audit log entries for a specific namespace.

Lists audit log entries for a specific namespace.

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
 **query** | **String**| A search term for querying events, actors, or timestamps of log records. | 

### Return type

[**Vec<::models::NamespaceAuditLog>**](NamespaceAuditLog.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audit_log_repo_list**
> Vec<::models::RepositoryAuditLog> audit_log_repo_list(ctx, ctx, owner, repo, optional)
Lists audit log entries for a specific repository.

Lists audit log entries for a specific repository.

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
 **query** | **String**| A search term for querying events, actors, or timestamps of log records. | 

### Return type

[**Vec<::models::RepositoryAuditLog>**](RepositoryAuditLog.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

