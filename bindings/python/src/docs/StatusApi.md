# cloudsmith_api.StatusApi

All URIs are relative to *https://api.cloudsmith.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**status_check_basic**](StatusApi.md#status_check_basic) | **GET** /status/check/basic/ | Endpoint to check basic API connectivity.


# **status_check_basic**
> StatusBasicResponse status_check_basic()

Endpoint to check basic API connectivity.

Endpoint to check basic API connectivity.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = cloudsmith_api.StatusApi()

try:
    # Endpoint to check basic API connectivity.
    api_response = api_instance.status_check_basic()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling StatusApi->status_check_basic: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StatusBasicResponse**](StatusBasicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

