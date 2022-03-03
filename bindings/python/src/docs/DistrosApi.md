# cloudsmith_api.DistrosApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**distros_list**](DistrosApi.md#distros_list) | **GET** /distros/ | Get a list of all supported distributions.
[**distros_read**](DistrosApi.md#distros_read) | **GET** /distros/{slug}/ | View for viewing/listing distributions.


# **distros_list**
> list[Distribution] distros_list()

Get a list of all supported distributions.

Get a list of all supported distributions.

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
api_instance = cloudsmith_api.DistrosApi(cloudsmith_api.ApiClient(configuration))

try:
    # Get a list of all supported distributions.
    api_response = api_instance.distros_list()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DistrosApi->distros_list: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Distribution]**](Distribution.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **distros_read**
> Distribution distros_read(slug)

View for viewing/listing distributions.

View for viewing/listing distributions.

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
api_instance = cloudsmith_api.DistrosApi(cloudsmith_api.ApiClient(configuration))
slug = 'slug_example' # str | 

try:
    # View for viewing/listing distributions.
    api_response = api_instance.distros_read(slug)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DistrosApi->distros_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **str**|  | 

### Return type

[**Distribution**](Distribution.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

