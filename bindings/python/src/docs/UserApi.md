# cloudsmith_api.UserApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_self**](UserApi.md#user_self) | **GET** /user/self/ | Provide a brief for the current user (if any).
[**user_token_create**](UserApi.md#user_token_create) | **POST** /user/token/ | Retrieve/Create API key/token for the authenticated user.


# **user_self**
> UserBrief user_self()

Provide a brief for the current user (if any).

Provide a brief for the current user (if any).

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
# Configure API key authorization: token
configuration = cloudsmith_api.Configuration()
configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Authorization'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.UserApi(cloudsmith_api.ApiClient(configuration))

try:
    # Provide a brief for the current user (if any).
    api_response = api_instance.user_self()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_self: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserBrief**](UserBrief.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_token_create**
> UserAuthToken user_token_create(data=data)

Retrieve/Create API key/token for the authenticated user.

Retrieve/Create API key/token for the authenticated user.

### Example
```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudsmith_api.UserApi(cloudsmith_api.ApiClient(configuration))
data = cloudsmith_api.UserAuthTokenRequest() # UserAuthTokenRequest |  (optional)

try:
    # Retrieve/Create API key/token for the authenticated user.
    api_response = api_instance.user_token_create(data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_token_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**UserAuthTokenRequest**](UserAuthTokenRequest.md)|  | [optional] 

### Return type

[**UserAuthToken**](UserAuthToken.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

