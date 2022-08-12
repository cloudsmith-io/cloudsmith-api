# CloudsmithApi::AuditLogApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audit_log_list**](AuditLogApi.md#audit_log_list) | **GET** /audit-log/{owner}/ | Lists audit log entries for a specific namespace.
[**audit_log_list0**](AuditLogApi.md#audit_log_list0) | **GET** /audit-log/{owner}/{repo}/ | Lists audit log entries for a specific repository.


# **audit_log_list**
> Array&lt;NamespaceAuditLog&gt; audit_log_list(owner, opts)

Lists audit log entries for a specific namespace.

Lists audit log entries for a specific namespace.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::AuditLogApi.new

owner = 'owner_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  query: 'query_example' # String | A search term for querying events, actors, or timestamps of log records.
}

begin
  #Lists audit log entries for a specific namespace.
  result = api_instance.audit_log_list(owner, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling AuditLogApi->audit_log_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 
 **query** | **String**| A search term for querying events, actors, or timestamps of log records. | [optional] 

### Return type

[**Array&lt;NamespaceAuditLog&gt;**](NamespaceAuditLog.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **audit_log_list0**
> Array&lt;RepositoryAuditLog&gt; audit_log_list0(owner, repo, opts)

Lists audit log entries for a specific repository.

Lists audit log entries for a specific repository.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::AuditLogApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  query: 'query_example' # String | A search term for querying events, actors, or timestamps of log records.
}

begin
  #Lists audit log entries for a specific repository.
  result = api_instance.audit_log_list0(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling AuditLogApi->audit_log_list0: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 
 **query** | **String**| A search term for querying events, actors, or timestamps of log records. | [optional] 

### Return type

[**Array&lt;RepositoryAuditLog&gt;**](RepositoryAuditLog.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



