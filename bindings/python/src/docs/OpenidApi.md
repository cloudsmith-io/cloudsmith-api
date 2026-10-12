# cloudsmith_api.OpenidApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**openid_create**](OpenidApi.md#openid_create) | **POST** /openid/{owner}/ | Get a JWT token for a configured service account belonging to the requesting org.


# **openid_create**
> Oidc1 openid_create(owner, data=data)

Get a JWT token for a configured service account belonging to the requesting org.

Get a JWT token for a configured service
account belonging to the requesting org.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.oidc1 import Oidc1
from cloudsmith_api.models.oidc_request import OidcRequest
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
    api_instance = cloudsmith_api.OpenidApi(api_client)
    owner = 'owner_example' # str | 
    data = cloudsmith_api.OidcRequest() # OidcRequest |  (optional)

    try:
        # Get a JWT token for a configured service account belonging to the requesting org.
        api_response = api_instance.openid_create(owner, data=data)
        print("The response of OpenidApi->openid_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenidApi->openid_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **data** | [**OidcRequest**](OidcRequest.md)|  | [optional] 

### Return type

[**Oidc1**](Oidc1.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | The JWT cannot be created. |  -  |
**401** | OIDC token cannot be authenticated. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

