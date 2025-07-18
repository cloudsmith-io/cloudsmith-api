# cloudsmith_api.NamespacesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**namespaces_list**](NamespacesApi.md#namespaces_list) | **GET** /namespaces/ | Get a list of all namespaces the user belongs to.
[**namespaces_read**](NamespacesApi.md#namespaces_read) | **GET** /namespaces/{slug}/ | Get a specific namespace that the user belongs to.


# **namespaces_list**
> list[Namespace] namespaces_list(page=page, page_size=page_size)

Get a list of all namespaces the user belongs to.

Get a list of all namespaces the user belongs to.

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
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.NamespacesApi(cloudsmith_api.ApiClient(configuration))
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # Get a list of all namespaces the user belongs to.
    api_response = api_instance.namespaces_list(page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NamespacesApi->namespaces_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[Namespace]**](Namespace.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **namespaces_read**
> Namespace namespaces_read(slug)

Get a specific namespace that the user belongs to.

Get a specific namespace that the user belongs to.

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
# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.NamespacesApi(cloudsmith_api.ApiClient(configuration))
slug = 'slug_example' # str | 

try:
    # Get a specific namespace that the user belongs to.
    api_response = api_instance.namespaces_read(slug)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NamespacesApi->namespaces_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **str**|  | 

### Return type

[**Namespace**](Namespace.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

