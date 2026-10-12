# cloudsmith_api.StatusApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**status_check_basic**](StatusApi.md#status_check_basic) | **GET** /status/check/basic/ | Endpoint to check basic API connectivity.


# **status_check_basic**
> StatusBasic status_check_basic()

Endpoint to check basic API connectivity.

Endpoint to check basic API connectivity.

### Example


```python
import cloudsmith_api
from cloudsmith_api.models.status_basic import StatusBasic
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudsmith.io
# See configuration.py for a list of all supported configuration parameters.
configuration = cloudsmith_api.Configuration(
    host = "https://api.cloudsmith.io"
)


# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.StatusApi(api_client)

    try:
        # Endpoint to check basic API connectivity.
        api_response = api_instance.status_check_basic()
        print("The response of StatusApi->status_check_basic:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StatusApi->status_check_basic: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**StatusBasic**](StatusBasic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Status check was successful |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

