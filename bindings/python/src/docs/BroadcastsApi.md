# cloudsmith_api.BroadcastsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**broadcasts_create_broadcast_token**](BroadcastsApi.md#broadcasts_create_broadcast_token) | **POST** /broadcasts/{org}/broadcast-token/ | Create a broadcast token.


# **broadcasts_create_broadcast_token**
> BroadcastToken broadcasts_create_broadcast_token(org, data=data)

Create a broadcast token.

Create a broadcast token.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.broadcast_token import BroadcastToken
from cloudsmith_api.models.broadcast_token_input import BroadcastTokenInput
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
    api_instance = cloudsmith_api.BroadcastsApi(api_client)
    org = 'org_example' # str | 
    data = cloudsmith_api.BroadcastTokenInput() # BroadcastTokenInput |  (optional)

    try:
        # Create a broadcast token.
        api_response = api_instance.broadcasts_create_broadcast_token(org, data=data)
        print("The response of BroadcastsApi->broadcasts_create_broadcast_token:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BroadcastsApi->broadcasts_create_broadcast_token: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**|  | 
 **data** | [**BroadcastTokenInput**](BroadcastTokenInput.md)|  | [optional] 

### Return type

[**BroadcastToken**](BroadcastToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**200** | OK |  -  |
**422** | Entitlement token parameter is required. |  -  |
**404** | Entitlement token not found |  -  |
**400** | Request could not be processed (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

