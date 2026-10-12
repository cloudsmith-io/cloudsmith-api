# cloudsmith_api.RatesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rates_limits_list**](RatesApi.md#rates_limits_list) | **GET** /rates/limits/ | Endpoint to check rate limits for current user.


# **rates_limits_list**
> ResourcesRateCheck rates_limits_list()

Endpoint to check rate limits for current user.

Endpoint to check rate limits for current user.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.resources_rate_check import ResourcesRateCheck
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
    api_instance = cloudsmith_api.RatesApi(api_client)

    try:
        # Endpoint to check rate limits for current user.
        api_response = api_instance.rates_limits_list()
        print("The response of RatesApi->rates_limits_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RatesApi->rates_limits_list: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**ResourcesRateCheck**](ResourcesRateCheck.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Rate check was successful |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

