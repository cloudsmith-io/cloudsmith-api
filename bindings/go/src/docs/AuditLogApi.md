# \AuditLogApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AuditLogList**](AuditLogApi.md#AuditLogList) | **Get** /audit-log/{owner}/ | Lists audit log entries for a specific namespace.
[**AuditLogList0**](AuditLogApi.md#AuditLogList0) | **Get** /audit-log/{owner}/{repo}/ | Lists audit log entries for a specific repository.


# **AuditLogList**
> []NamespaceAuditLog AuditLogList(ctx, owner, optional)
Lists audit log entries for a specific namespace.

Lists audit log entries for a specific namespace.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
 **optional** | ***AuditLogApiAuditLogListOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AuditLogApiAuditLogListOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **page** | **optional.Int32**| A page number within the paginated result set. | 
 **pageSize** | **optional.Int32**| Number of results to return per page. | 
 **query** | **optional.String**| A search term for querying events, actors, or timestamps of log records. | 

### Return type

[**[]NamespaceAuditLog**](NamespaceAuditLog.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AuditLogList0**
> []RepositoryAuditLog AuditLogList0(ctx, owner, repo, optional)
Lists audit log entries for a specific repository.

Lists audit log entries for a specific repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***AuditLogApiAuditLogList0Opts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AuditLogApiAuditLogList0Opts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **page** | **optional.Int32**| A page number within the paginated result set. | 
 **pageSize** | **optional.Int32**| Number of results to return per page. | 
 **query** | **optional.String**| A search term for querying events, actors, or timestamps of log records. | 

### Return type

[**[]RepositoryAuditLog**](RepositoryAuditLog.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

