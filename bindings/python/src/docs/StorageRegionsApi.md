# cloudsmith_api.StorageRegionsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**storage_regions_list**](StorageRegionsApi.md#storage_regions_list) | **GET** /storage-regions/ | Get a list of all available storage regions.
[**storage_regions_read**](StorageRegionsApi.md#storage_regions_read) | **GET** /storage-regions/{slug}/ | Get a specific storage region.


# **storage_regions_list**
> list[StorageRegion] storage_regions_list()

Get a list of all available storage regions.

Get a list of all available storage regions.

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
api_instance = cloudsmith_api.StorageRegionsApi(cloudsmith_api.ApiClient(configuration))

try:
    # Get a list of all available storage regions.
    api_response = api_instance.storage_regions_list()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling StorageRegionsApi->storage_regions_list: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[StorageRegion]**](StorageRegion.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storage_regions_read**
> StorageRegion storage_regions_read(slug)

Get a specific storage region.

Get a specific storage region.

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
api_instance = cloudsmith_api.StorageRegionsApi(cloudsmith_api.ApiClient(configuration))
slug = 'slug_example' # str | 

try:
    # Get a specific storage region.
    api_response = api_instance.storage_regions_read(slug)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling StorageRegionsApi->storage_regions_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **str**|  | 

### Return type

[**StorageRegion**](StorageRegion.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

