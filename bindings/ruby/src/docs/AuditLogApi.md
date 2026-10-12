# CloudsmithApi::AuditLogApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**audit_log_namespace_list**](AuditLogApi.md#audit_log_namespace_list) | **GET** /audit-log/{owner}/ | Lists audit log entries for a specific namespace. |
| [**audit_log_repo_list**](AuditLogApi.md#audit_log_repo_list) | **GET** /audit-log/{owner}/{repo}/ | Lists audit log entries for a specific repository. |


## audit_log_namespace_list

> <Array<NamespaceAuditLog>> audit_log_namespace_list(owner, opts)

Lists audit log entries for a specific namespace.

Lists audit log entries for a specific namespace.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::AuditLogApi.new
owner = 'owner_example' # String | 
opts = {
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  query: 'query_example' # String | A search term for querying events, actors, or timestamps of log records.
}

begin
  # Lists audit log entries for a specific namespace.
  result = api_instance.audit_log_namespace_list(owner, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling AuditLogApi->audit_log_namespace_list: #{e}"
end
```

#### Using the audit_log_namespace_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<NamespaceAuditLog>>, Integer, Hash)> audit_log_namespace_list_with_http_info(owner, opts)

```ruby
begin
  # Lists audit log entries for a specific namespace.
  data, status_code, headers = api_instance.audit_log_namespace_list_with_http_info(owner, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<NamespaceAuditLog>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling AuditLogApi->audit_log_namespace_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |
| **query** | **String** | A search term for querying events, actors, or timestamps of log records. | [optional] |

### Return type

[**Array&lt;NamespaceAuditLog&gt;**](NamespaceAuditLog.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## audit_log_repo_list

> <Array<RepositoryAuditLog>> audit_log_repo_list(owner, repo, opts)

Lists audit log entries for a specific repository.

Lists audit log entries for a specific repository.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
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
  # Lists audit log entries for a specific repository.
  result = api_instance.audit_log_repo_list(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling AuditLogApi->audit_log_repo_list: #{e}"
end
```

#### Using the audit_log_repo_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<RepositoryAuditLog>>, Integer, Hash)> audit_log_repo_list_with_http_info(owner, repo, opts)

```ruby
begin
  # Lists audit log entries for a specific repository.
  data, status_code, headers = api_instance.audit_log_repo_list_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<RepositoryAuditLog>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling AuditLogApi->audit_log_repo_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |
| **query** | **String** | A search term for querying events, actors, or timestamps of log records. | [optional] |

### Return type

[**Array&lt;RepositoryAuditLog&gt;**](RepositoryAuditLog.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

