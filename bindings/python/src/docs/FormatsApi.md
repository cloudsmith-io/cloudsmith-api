# cloudsmith_api.FormatsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**formats_list**](FormatsApi.md#formats_list) | **GET** /formats/ | Get a list of all supported package formats.
[**formats_read**](FormatsApi.md#formats_read) | **GET** /formats/{slug}/ | Get a specific supported package format.


# **formats_list**
> list[Format] formats_list()

Get a list of all supported package formats.

Get a list of all supported package formats.

### Example 
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.FormatsApi()

try: 
    # Get a list of all supported package formats.
    api_response = api_instance.formats_list()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FormatsApi->formats_list: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Format]**](Format.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **formats_read**
> Format formats_read(slug)

Get a specific supported package format.

Get a specific supported package format.

### Example 
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.FormatsApi()
slug = 'slug_example' # str | 

try: 
    # Get a specific supported package format.
    api_response = api_instance.formats_read(slug)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FormatsApi->formats_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **str**|  | 

### Return type

[**Format**](Format.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

