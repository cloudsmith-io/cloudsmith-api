# cloudsmith_api.EntitlementsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entitlements_create**](EntitlementsApi.md#entitlements_create) | **POST** /entitlements/{owner}/{repo}/ | Create a specific entitlement in a repository.
[**entitlements_delete**](EntitlementsApi.md#entitlements_delete) | **DELETE** /entitlements/{owner}/{repo}/{identifier}/ | Delete a specific entitlement in a repository.
[**entitlements_disable**](EntitlementsApi.md#entitlements_disable) | **POST** /entitlements/{owner}/{repo}/{identifier}/disable/ | Disable an entitlement token in a repository.
[**entitlements_enable**](EntitlementsApi.md#entitlements_enable) | **POST** /entitlements/{owner}/{repo}/{identifier}/enable/ | Enable an entitlement token in a repository.
[**entitlements_list**](EntitlementsApi.md#entitlements_list) | **GET** /entitlements/{owner}/{repo}/ | Get a list of all entitlements in a repository.
[**entitlements_partial_update**](EntitlementsApi.md#entitlements_partial_update) | **PATCH** /entitlements/{owner}/{repo}/{identifier}/ | Update a specific entitlement in a repository.
[**entitlements_read**](EntitlementsApi.md#entitlements_read) | **GET** /entitlements/{owner}/{repo}/{identifier}/ | Get a specific entitlement in a repository.
[**entitlements_refresh**](EntitlementsApi.md#entitlements_refresh) | **POST** /entitlements/{owner}/{repo}/{identifier}/refresh/ | Refresh an entitlement token in a repository.
[**entitlements_reset**](EntitlementsApi.md#entitlements_reset) | **POST** /entitlements/{owner}/{repo}/{identifier}/reset/ | Reset the statistics for an entitlement token in a repository.
[**entitlements_sync**](EntitlementsApi.md#entitlements_sync) | **POST** /entitlements/{owner}/{repo}/sync/ | Synchronise tokens from a source repository.
[**entitlements_toggle_private_broadcasts**](EntitlementsApi.md#entitlements_toggle_private_broadcasts) | **POST** /entitlements/{owner}/{repo}/{identifier}/toggle-private-broadcasts/ | Set private broadcast access for an entitlement token in a repository.


# **entitlements_create**
> RepositoryToken entitlements_create(owner, repo, show_tokens=show_tokens, data=data)

Create a specific entitlement in a repository.

Create a specific entitlement in a repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.repository_token import RepositoryToken
from cloudsmith_api.models.repository_token_request import RepositoryTokenRequest
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
    api_instance = cloudsmith_api.EntitlementsApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    show_tokens = False # bool | Show entitlement token strings in results (optional) (default to False)
    data = cloudsmith_api.RepositoryTokenRequest() # RepositoryTokenRequest |  (optional)

    try:
        # Create a specific entitlement in a repository.
        api_response = api_instance.entitlements_create(owner, repo, show_tokens=show_tokens, data=data)
        print("The response of EntitlementsApi->entitlements_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EntitlementsApi->entitlements_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **show_tokens** | **bool**| Show entitlement token strings in results | [optional] [default to False]
 **data** | [**RepositoryTokenRequest**](RepositoryTokenRequest.md)|  | [optional] 

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created the specified entitlement |  -  |
**404** | Owner namespace or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entitlements_delete**
> entitlements_delete(owner, repo, identifier)

Delete a specific entitlement in a repository.

Delete a specific entitlement in a repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
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
    api_instance = cloudsmith_api.EntitlementsApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 

    try:
        # Delete a specific entitlement in a repository.
        api_instance.entitlements_delete(owner, repo, identifier)
    except Exception as e:
        print("Exception when calling EntitlementsApi->entitlements_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Soft-deleted the specified entitlement token successfully. |  -  |
**400** | The entitlement cannot be deleted. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entitlements_disable**
> entitlements_disable(owner, repo, identifier)

Disable an entitlement token in a repository.

Disable an entitlement token in a repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
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
    api_instance = cloudsmith_api.EntitlementsApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 

    try:
        # Disable an entitlement token in a repository.
        api_instance.entitlements_disable(owner, repo, identifier)
    except Exception as e:
        print("Exception when calling EntitlementsApi->entitlements_disable: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The entitlement token has been disabled. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entitlements_enable**
> entitlements_enable(owner, repo, identifier)

Enable an entitlement token in a repository.

Enable an entitlement token in a repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
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
    api_instance = cloudsmith_api.EntitlementsApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 

    try:
        # Enable an entitlement token in a repository.
        api_instance.entitlements_enable(owner, repo, identifier)
    except Exception as e:
        print("Exception when calling EntitlementsApi->entitlements_enable: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The entitlement token has been enabled. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entitlements_list**
> List[RepositoryToken] entitlements_list(owner, repo, page=page, page_size=page_size, show_tokens=show_tokens, query=query, active=active, exclude_other_user_tokens=exclude_other_user_tokens, sort=sort)

Get a list of all entitlements in a repository.

Get a list of all entitlements in a repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.repository_token import RepositoryToken
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
    api_instance = cloudsmith_api.EntitlementsApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)
    show_tokens = False # bool | Show entitlement token strings in results (optional) (default to False)
    query = 'query_example' # str | A search term for querying names of entitlements. (optional)
    active = False # bool | If true, only include active tokens (optional) (default to False)
    exclude_other_user_tokens = False # bool | If true, exclude user tokens that belong to other users (optional) (default to False)
    sort = 'name' # str | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name. (optional) (default to 'name')

    try:
        # Get a list of all entitlements in a repository.
        api_response = api_instance.entitlements_list(owner, repo, page=page, page_size=page_size, show_tokens=show_tokens, query=query, active=active, exclude_other_user_tokens=exclude_other_user_tokens, sort=sort)
        print("The response of EntitlementsApi->entitlements_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EntitlementsApi->entitlements_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **show_tokens** | **bool**| Show entitlement token strings in results | [optional] [default to False]
 **query** | **str**| A search term for querying names of entitlements. | [optional] 
 **active** | **bool**| If true, only include active tokens | [optional] [default to False]
 **exclude_other_user_tokens** | **bool**| If true, exclude user tokens that belong to other users | [optional] [default to False]
 **sort** | **str**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name. | [optional] [default to &#39;name&#39;]

### Return type

[**List[RepositoryToken]**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the list of entitlement tokens |  -  |
**404** | Owner namespace or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entitlements_partial_update**
> RepositoryToken entitlements_partial_update(owner, repo, identifier, show_tokens=show_tokens, data=data)

Update a specific entitlement in a repository.

Update a specific entitlement in a repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.repository_token import RepositoryToken
from cloudsmith_api.models.repository_token_request_patch import RepositoryTokenRequestPatch
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
    api_instance = cloudsmith_api.EntitlementsApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 
    show_tokens = False # bool | Show entitlement token strings in results (optional) (default to False)
    data = cloudsmith_api.RepositoryTokenRequestPatch() # RepositoryTokenRequestPatch |  (optional)

    try:
        # Update a specific entitlement in a repository.
        api_response = api_instance.entitlements_partial_update(owner, repo, identifier, show_tokens=show_tokens, data=data)
        print("The response of EntitlementsApi->entitlements_partial_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EntitlementsApi->entitlements_partial_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 
 **show_tokens** | **bool**| Show entitlement token strings in results | [optional] [default to False]
 **data** | [**RepositoryTokenRequestPatch**](RepositoryTokenRequestPatch.md)|  | [optional] 

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated the specified entitlement |  -  |
**400** | The entitlement cannot be edited. |  -  |
**404** | Owner namespace or repository not found |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entitlements_read**
> RepositoryToken entitlements_read(owner, repo, identifier, fuzzy=fuzzy, show_tokens=show_tokens)

Get a specific entitlement in a repository.

Get a specific entitlement in a repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.repository_token import RepositoryToken
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
    api_instance = cloudsmith_api.EntitlementsApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 
    fuzzy = False # bool | If true, entitlement identifiers including name will be fuzzy matched. (optional) (default to False)
    show_tokens = False # bool | Show entitlement token strings in results (optional) (default to False)

    try:
        # Get a specific entitlement in a repository.
        api_response = api_instance.entitlements_read(owner, repo, identifier, fuzzy=fuzzy, show_tokens=show_tokens)
        print("The response of EntitlementsApi->entitlements_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EntitlementsApi->entitlements_read: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 
 **fuzzy** | **bool**| If true, entitlement identifiers including name will be fuzzy matched. | [optional] [default to False]
 **show_tokens** | **bool**| Show entitlement token strings in results | [optional] [default to False]

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the specified entitlement |  -  |
**400** | Couldn&#39;t retrieve the specified token because the request contains an error. |  -  |
**404** | Owner namespace or repository not found |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entitlements_refresh**
> RepositoryTokenRefresh entitlements_refresh(owner, repo, identifier, show_tokens=show_tokens, data=data)

Refresh an entitlement token in a repository.

Refresh an entitlement token in a repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.repository_token_refresh import RepositoryTokenRefresh
from cloudsmith_api.models.repository_token_refresh_request import RepositoryTokenRefreshRequest
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
    api_instance = cloudsmith_api.EntitlementsApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 
    show_tokens = False # bool | Show entitlement token strings in results (optional) (default to False)
    data = cloudsmith_api.RepositoryTokenRefreshRequest() # RepositoryTokenRefreshRequest |  (optional)

    try:
        # Refresh an entitlement token in a repository.
        api_response = api_instance.entitlements_refresh(owner, repo, identifier, show_tokens=show_tokens, data=data)
        print("The response of EntitlementsApi->entitlements_refresh:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EntitlementsApi->entitlements_refresh: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 
 **show_tokens** | **bool**| Show entitlement token strings in results | [optional] [default to False]
 **data** | [**RepositoryTokenRefreshRequest**](RepositoryTokenRefreshRequest.md)|  | [optional] 

### Return type

[**RepositoryTokenRefresh**](RepositoryTokenRefresh.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The entitlement token has been refreshed. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entitlements_reset**
> entitlements_reset(owner, repo, identifier, show_tokens=show_tokens)

Reset the statistics for an entitlement token in a repository.

Reset the statistics for an entitlement token in a repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
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
    api_instance = cloudsmith_api.EntitlementsApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 
    show_tokens = False # bool | Show entitlement token strings in results (optional) (default to False)

    try:
        # Reset the statistics for an entitlement token in a repository.
        api_instance.entitlements_reset(owner, repo, identifier, show_tokens=show_tokens)
    except Exception as e:
        print("Exception when calling EntitlementsApi->entitlements_reset: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 
 **show_tokens** | **bool**| Show entitlement token strings in results | [optional] [default to False]

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The entitlement token statistics have been reset. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entitlements_sync**
> RepositoryTokenSync entitlements_sync(owner, repo, show_tokens=show_tokens, data=data)

Synchronise tokens from a source repository.

Synchronise tokens from a source repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.repository_token_sync import RepositoryTokenSync
from cloudsmith_api.models.repository_token_sync_request import RepositoryTokenSyncRequest
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
    api_instance = cloudsmith_api.EntitlementsApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    show_tokens = False # bool | Show entitlement token strings in results (optional) (default to False)
    data = cloudsmith_api.RepositoryTokenSyncRequest() # RepositoryTokenSyncRequest |  (optional)

    try:
        # Synchronise tokens from a source repository.
        api_response = api_instance.entitlements_sync(owner, repo, show_tokens=show_tokens, data=data)
        print("The response of EntitlementsApi->entitlements_sync:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EntitlementsApi->entitlements_sync: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **show_tokens** | **bool**| Show entitlement token strings in results | [optional] [default to False]
 **data** | [**RepositoryTokenSyncRequest**](RepositoryTokenSyncRequest.md)|  | [optional] 

### Return type

[**RepositoryTokenSync**](RepositoryTokenSync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The tokens have been synchronised from the source repository. |  -  |
**404** | Owner namespace or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entitlements_toggle_private_broadcasts**
> entitlements_toggle_private_broadcasts(owner, repo, identifier, data=data)

Set private broadcast access for an entitlement token in a repository.

Set private broadcast access for an entitlement token in a repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.repository_token_private_broadcasts_request import RepositoryTokenPrivateBroadcastsRequest
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
    api_instance = cloudsmith_api.EntitlementsApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 
    data = cloudsmith_api.RepositoryTokenPrivateBroadcastsRequest() # RepositoryTokenPrivateBroadcastsRequest |  (optional)

    try:
        # Set private broadcast access for an entitlement token in a repository.
        api_instance.entitlements_toggle_private_broadcasts(owner, repo, identifier, data=data)
    except Exception as e:
        print("Exception when calling EntitlementsApi->entitlements_toggle_private_broadcasts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**RepositoryTokenPrivateBroadcastsRequest**](RepositoryTokenPrivateBroadcastsRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Private broadcasts access has been updated for the entitlement token. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

