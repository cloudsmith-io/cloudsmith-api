# cloudsmith_api.UsersApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**users_profile_read**](UsersApi.md#users_profile_read) | **GET** /users/profile/{slug}/ | Provide a brief for the specified user (if any).


# **users_profile_read**
> UserProfile users_profile_read(slug)

Provide a brief for the specified user (if any).

Provide a brief for the specified user (if any).

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
api_instance = cloudsmith_api.UsersApi(cloudsmith_api.ApiClient(configuration))
slug = 'slug_example' # str | 

try:
    # Provide a brief for the specified user (if any).
    api_response = api_instance.users_profile_read(slug)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UsersApi->users_profile_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **str**|  | 

### Return type

[**UserProfile**](UserProfile.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

