# cloudsmith_api.AuditLogApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audit_log_namespace_list**](AuditLogApi.md#audit_log_namespace_list) | **GET** /audit-log/{owner}/ | Lists audit log entries for a specific namespace.
[**audit_log_repo_list**](AuditLogApi.md#audit_log_repo_list) | **GET** /audit-log/{owner}/{repo}/ | Lists audit log entries for a specific repository.


# **audit_log_namespace_list**
> List[NamespaceAuditLog] audit_log_namespace_list(owner, page=page, page_size=page_size, query=query)

Lists audit log entries for a specific namespace.

Lists audit log entries for a specific namespace.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.namespace_audit_log import NamespaceAuditLog
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.AuditLogApi(api_client)
    owner = 'owner_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)
    query = 'query_example' # str | A search term for querying events, actors, or timestamps of log records. (optional)

    try:
        # Lists audit log entries for a specific namespace.
        api_response = api_instance.audit_log_namespace_list(owner, page=page, page_size=page_size, query=query)
        print("The response of AuditLogApi->audit_log_namespace_list:\n")
        pprint(api_response)
    except Exception as e:
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

[**List[NamespaceAuditLog]**](NamespaceAuditLog.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the list of audit log entries |  -  |
**402** | Audit logs are not active; upgrade your account! |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audit_log_repo_list**
> List[RepositoryAuditLog] audit_log_repo_list(owner, repo, page=page, page_size=page_size, query=query)

Lists audit log entries for a specific repository.

Lists audit log entries for a specific repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.repository_audit_log import RepositoryAuditLog
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikey
configuration.api_key['apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.AuditLogApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)
    query = 'query_example' # str | A search term for querying events, actors, or timestamps of log records. (optional)

    try:
        # Lists audit log entries for a specific repository.
        api_response = api_instance.audit_log_repo_list(owner, repo, page=page, page_size=page_size, query=query)
        print("The response of AuditLogApi->audit_log_repo_list:\n")
        pprint(api_response)
    except Exception as e:
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

[**List[RepositoryAuditLog]**](RepositoryAuditLog.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the list of audit log entries |  -  |
**402** | Audit logs are not active; upgrade your account! |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

