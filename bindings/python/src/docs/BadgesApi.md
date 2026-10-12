# cloudsmith_api.BadgesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**badges_version_list**](BadgesApi.md#badges_version_list) | **GET** /badges/version/{owner}/{repo}/{package_format}/{package_name}/{package_version}/{package_identifiers}/ | Get latest package version for a package or package group.


# **badges_version_list**
> object badges_version_list(owner, repo, package_format, package_name, package_version, package_identifiers, badge_token=badge_token, cache_seconds=cache_seconds, color=color, label=label, label_color=label_color, logo_color=logo_color, logo_width=logo_width, render=render, shields=shields, show_latest=show_latest, style=style)

Get latest package version for a package or package group.

Get latest package version for a package or package group.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
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
    api_instance = cloudsmith_api.BadgesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    package_format = 'package_format_example' # str | 
    package_name = 'package_name_example' # str | 
    package_version = 'package_version_example' # str | 
    package_identifiers = 'package_identifiers_example' # str | 
    badge_token = 'badge_token_example' # str | Badge token to authenticate for private packages (optional)
    cache_seconds = '300' # str | Override the shields.io badge cacheSeconds value. (optional) (default to '300')
    color = '12577E' # str | Override the shields.io badge color value. (optional) (default to '12577E')
    label = 'cloudsmith' # str | Override the shields.io badge label value. (optional) (default to 'cloudsmith')
    label_color = '021F2F' # str | Override the shields.io badge labelColor value. (optional) (default to '021F2F')
    logo_color = '45B6EE' # str | Override the shields.io badge logoColor value. (optional) (default to '45B6EE')
    logo_width = '10' # str | Override the shields.io badge logoWidth value. (optional) (default to '10')
    render = False # bool | If true, badge will be rendered (optional) (default to False)
    shields = False # bool | If true, a shields response will be generated (optional) (default to False)
    show_latest = False # bool | If true, for latest version badges a '(latest)' suffix is added (optional) (default to False)
    style = 'flat-square' # str | Override the shields.io badge style value. (optional) (default to 'flat-square')

    try:
        # Get latest package version for a package or package group.
        api_response = api_instance.badges_version_list(owner, repo, package_format, package_name, package_version, package_identifiers, badge_token=badge_token, cache_seconds=cache_seconds, color=color, label=label, label_color=label_color, logo_color=logo_color, logo_width=logo_width, render=render, shields=shields, show_latest=show_latest, style=style)
        print("The response of BadgesApi->badges_version_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BadgesApi->badges_version_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **package_format** | **str**|  | 
 **package_name** | **str**|  | 
 **package_version** | **str**|  | 
 **package_identifiers** | **str**|  | 
 **badge_token** | **str**| Badge token to authenticate for private packages | [optional] 
 **cache_seconds** | **str**| Override the shields.io badge cacheSeconds value. | [optional] [default to &#39;300&#39;]
 **color** | **str**| Override the shields.io badge color value. | [optional] [default to &#39;12577E&#39;]
 **label** | **str**| Override the shields.io badge label value. | [optional] [default to &#39;cloudsmith&#39;]
 **label_color** | **str**| Override the shields.io badge labelColor value. | [optional] [default to &#39;021F2F&#39;]
 **logo_color** | **str**| Override the shields.io badge logoColor value. | [optional] [default to &#39;45B6EE&#39;]
 **logo_width** | **str**| Override the shields.io badge logoWidth value. | [optional] [default to &#39;10&#39;]
 **render** | **bool**| If true, badge will be rendered | [optional] [default to False]
 **shields** | **bool**| If true, a shields response will be generated | [optional] [default to False]
 **show_latest** | **bool**| If true, for latest version badges a &#39;(latest)&#39; suffix is added | [optional] [default to False]
 **style** | **str**| Override the shields.io badge style value. | [optional] [default to &#39;flat-square&#39;]

### Return type

**object**

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

