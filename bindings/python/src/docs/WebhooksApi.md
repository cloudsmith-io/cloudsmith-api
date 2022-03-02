# cloudsmith_api.WebhooksApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhooks_create**](WebhooksApi.md#webhooks_create) | **POST** /webhooks/{owner}/{repo}/ | Create a specific webhook in a repository.
[**webhooks_delete**](WebhooksApi.md#webhooks_delete) | **DELETE** /webhooks/{owner}/{repo}/{identifier}/ | Delete a specific webhook in a repository.
[**webhooks_list**](WebhooksApi.md#webhooks_list) | **GET** /webhooks/{owner}/{repo}/ | Get a list of all webhooks in a repository.
[**webhooks_partial_update**](WebhooksApi.md#webhooks_partial_update) | **PATCH** /webhooks/{owner}/{repo}/{identifier}/ | Update a specific webhook in a repository.
[**webhooks_read**](WebhooksApi.md#webhooks_read) | **GET** /webhooks/{owner}/{repo}/{identifier}/ | Views for working with repository webhooks.


# **webhooks_create**
> RepositoryWebhook webhooks_create(owner, repo, data=data)

Create a specific webhook in a repository.

Create a specific webhook in a repository.

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
api_instance = cloudsmith_api.WebhooksApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.WebhooksCreate() # WebhooksCreate |  (optional)

try:
    # Create a specific webhook in a repository.
    api_response = api_instance.webhooks_create(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WebhooksApi->webhooks_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**WebhooksCreate**](WebhooksCreate.md)|  | [optional] 

### Return type

[**RepositoryWebhook**](RepositoryWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **webhooks_delete**
> webhooks_delete(owner, repo, identifier)

Delete a specific webhook in a repository.

Delete a specific webhook in a repository.

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
api_instance = cloudsmith_api.WebhooksApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
identifier = 'identifier_example' # str | 

try:
    # Delete a specific webhook in a repository.
    api_instance.webhooks_delete(owner, repo, identifier)
except ApiException as e:
    print("Exception when calling WebhooksApi->webhooks_delete: %s\n" % e)
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

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **webhooks_list**
> list[RepositoryWebhook] webhooks_list(owner, repo, page=page, page_size=page_size)

Get a list of all webhooks in a repository.

Get a list of all webhooks in a repository.

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
api_instance = cloudsmith_api.WebhooksApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # Get a list of all webhooks in a repository.
    api_response = api_instance.webhooks_list(owner, repo, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WebhooksApi->webhooks_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[RepositoryWebhook]**](RepositoryWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **webhooks_partial_update**
> RepositoryWebhook webhooks_partial_update(owner, repo, identifier, data=data)

Update a specific webhook in a repository.

Update a specific webhook in a repository.

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
api_instance = cloudsmith_api.WebhooksApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
identifier = 'identifier_example' # str | 
data = cloudsmith_api.WebhooksPartialUpdate() # WebhooksPartialUpdate |  (optional)

try:
    # Update a specific webhook in a repository.
    api_response = api_instance.webhooks_partial_update(owner, repo, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WebhooksApi->webhooks_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**WebhooksPartialUpdate**](WebhooksPartialUpdate.md)|  | [optional] 

### Return type

[**RepositoryWebhook**](RepositoryWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **webhooks_read**
> RepositoryWebhook webhooks_read(owner, repo, identifier)

Views for working with repository webhooks.

Views for working with repository webhooks.

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
api_instance = cloudsmith_api.WebhooksApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
identifier = 'identifier_example' # str | 

try:
    # Views for working with repository webhooks.
    api_response = api_instance.webhooks_read(owner, repo, identifier)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WebhooksApi->webhooks_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 

### Return type

[**RepositoryWebhook**](RepositoryWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

