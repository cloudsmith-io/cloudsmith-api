# cloudsmith_api.UserApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_self**](UserApi.md#user_self) | **GET** /user/self/ | Provide a brief for the current user (if any).
[**user_token_create**](UserApi.md#user_token_create) | **POST** /user/token/ | Create or retrieve API token for a user.
[**user_tokens_create**](UserApi.md#user_tokens_create) | **POST** /user/tokens/ | Create an API key for the user that is currently authenticated.
[**user_tokens_list**](UserApi.md#user_tokens_list) | **GET** /user/tokens/ | Retrieve the API key assigned to the user that is currently authenticated.
[**user_tokens_refresh**](UserApi.md#user_tokens_refresh) | **PUT** /user/tokens/{slug_perm}/refresh/ | Refresh the specified API key for the user that is currently authenticated.


# **user_self**
> UserBrief user_self()

Provide a brief for the current user (if any).

Provide a brief for the current user (if any).

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.user_brief import UserBrief
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
    api_instance = cloudsmith_api.UserApi(api_client)

    try:
        # Provide a brief for the current user (if any).
        api_response = api_instance.user_self()
        print("The response of UserApi->user_self:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->user_self: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**UserBrief**](UserBrief.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved brief for the current user |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_token_create**
> UserAuthToken user_token_create(data=data)

Create or retrieve API token for a user.

Handles both:
- Users authenticating with basic credentials to get a token
- Two-factor authentication flow

### Example

* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.user_auth_token import UserAuthToken
from cloudsmith_api.models.user_auth_token_request import UserAuthTokenRequest
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

# Configure HTTP basic authorization: basic
configuration = cloudsmith_api.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with cloudsmith_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cloudsmith_api.UserApi(api_client)
    data = cloudsmith_api.UserAuthTokenRequest() # UserAuthTokenRequest |  (optional)

    try:
        # Create or retrieve API token for a user.
        api_response = api_instance.user_token_create(data=data)
        print("The response of UserApi->user_token_create:\n")
        pprint(api_response)
    except Exception as e:
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

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Retrieved/created user API token/key. |  -  |
**403** | Locked out. |  -  |
**422** | Failed to authenticate. |  -  |
**400** | Request could not be processed (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_tokens_create**
> UserAuthenticationToken user_tokens_create()

Create an API key for the user that is currently authenticated.

Create an API key for the user that is currently authenticated.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.user_authentication_token import UserAuthenticationToken
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
    api_instance = cloudsmith_api.UserApi(api_client)

    try:
        # Create an API key for the user that is currently authenticated.
        api_response = api_instance.user_tokens_create()
        print("The response of UserApi->user_tokens_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->user_tokens_create: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**UserAuthenticationToken**](UserAuthenticationToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created an API key for the user that is currently authenticated. |  -  |
**400** | User has already created an API key. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_tokens_list**
> UserTokensList200Response user_tokens_list(page=page, page_size=page_size)

Retrieve the API key assigned to the user that is currently authenticated.

Retrieve the API key assigned to the user that is currently authenticated.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.user_tokens_list200_response import UserTokensList200Response
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
    api_instance = cloudsmith_api.UserApi(api_client)
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)

    try:
        # Retrieve the API key assigned to the user that is currently authenticated.
        api_response = api_instance.user_tokens_list(page=page, page_size=page_size)
        print("The response of UserApi->user_tokens_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->user_tokens_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**UserTokensList200Response**](UserTokensList200Response.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the API key for the user that is currently authenticated. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_tokens_refresh**
> UserAuthenticationToken user_tokens_refresh(slug_perm)

Refresh the specified API key for the user that is currently authenticated.

Refresh the specified API key for the user that is currently authenticated.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.user_authentication_token import UserAuthenticationToken
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
    api_instance = cloudsmith_api.UserApi(api_client)
    slug_perm = 'slug_perm_example' # str | 

    try:
        # Refresh the specified API key for the user that is currently authenticated.
        api_response = api_instance.user_tokens_refresh(slug_perm)
        print("The response of UserApi->user_tokens_refresh:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->user_tokens_refresh: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug_perm** | **str**|  | 

### Return type

[**UserAuthenticationToken**](UserAuthenticationToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully refreshed the API key. |  -  |
**404** | The specified API key cannot be found. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

