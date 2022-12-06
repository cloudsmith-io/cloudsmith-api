# cloudsmith_api.AuditLogApi

All URIs are relative to *https://api.cloudsmith.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audit_log_namespace_list**](AuditLogApi.md#audit_log_namespace_list) | **GET** /audit-log/{owner}/ | Lists audit log entries for a specific namespace.
[**audit_log_repo_list**](AuditLogApi.md#audit_log_repo_list) | **GET** /audit-log/{owner}/{repo}/ | Lists audit log entries for a specific repository.


# **audit_log_namespace_list**
> list[NamespaceAuditLogResponse] audit_log_namespace_list(owner, page=page, page_size=page_size, query=query)

Lists audit log entries for a specific namespace.

Lists audit log entries for a specific namespace.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.AuditLogApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)
query = 'query_example' # str | A search term for querying events, actors, or timestamps of log records. (optional)

try:
    # Lists audit log entries for a specific namespace.
    api_response = api_instance.audit_log_namespace_list(owner, page=page, page_size=page_size, query=query)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AuditLogApi->audit_log_namespace_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **query** | **str**| A search term for querying events, actors, or timestamps of log records. | [optional] 

### Return type

[**list[NamespaceAuditLogResponse]**](NamespaceAuditLogResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audit_log_repo_list**
> list[RepositoryAuditLogResponse] audit_log_repo_list(owner, repo, page=page, page_size=page_size, query=query)

Lists audit log entries for a specific repository.

Lists audit log entries for a specific repository.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
configuration = cloudsmith_api.Configuration()
configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Api-Key'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.AuditLogApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)
query = 'query_example' # str | A search term for querying events, actors, or timestamps of log records. (optional)

try:
    # Lists audit log entries for a specific repository.
    api_response = api_instance.audit_log_repo_list(owner, repo, page=page, page_size=page_size, query=query)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AuditLogApi->audit_log_repo_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **query** | **str**| A search term for querying events, actors, or timestamps of log records. | [optional] 

### Return type

[**list[RepositoryAuditLogResponse]**](RepositoryAuditLogResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

