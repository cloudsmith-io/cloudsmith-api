# cloudsmith_api.RatesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rates_limits_list**](RatesApi.md#rates_limits_list) | **GET** /rates/limits/ | Endpoint to check rate limits for current user.


# **rates_limits_list**
> ResourcesRateCheck rates_limits_list()

Endpoint to check rate limits for current user.

Endpoint to check rate limits for current user.

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
api_instance = cloudsmith_api.RatesApi(cloudsmith_api.ApiClient(configuration))

try:
    # Endpoint to check rate limits for current user.
    api_response = api_instance.rates_limits_list()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RatesApi->rates_limits_list: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResourcesRateCheck**](ResourcesRateCheck.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

