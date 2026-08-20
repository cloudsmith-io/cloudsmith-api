# cloudsmith_api.OpenidApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**openid_create**](OpenidApi.md#openid_create) | **POST** /openid/{owner}/ | Get a JWT token for a configured service account belonging to the requesting org.


# **openid_create**
> Oidc1 openid_create(owner, data=data)

Get a JWT token for a configured service account belonging to the requesting org.

Get a JWT token for a configured service account belonging to the requesting org.

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
api_instance = cloudsmith_api.OpenidApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
data = cloudsmith_api.OidcRequest() # OidcRequest |  (optional)

try:
    # Get a JWT token for a configured service account belonging to the requesting org.
    api_response = api_instance.openid_create(owner, data=data)
    pprint(api_response)
except ApiException as e:
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

