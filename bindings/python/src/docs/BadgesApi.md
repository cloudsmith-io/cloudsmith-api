# cloudsmith_api.BadgesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**badges_version_list**](BadgesApi.md#badges_version_list) | **GET** /badges/version/{owner}/{repo}/{package_format}/{package_name}/{package_version}/{package_identifiers}/ | Get latest package version for a package or package group.


# **badges_version_list**
> PackageVersionBadge badges_version_list(owner, repo, package_format, package_name, package_version, package_identifiers, badge_token=badge_token, cache_seconds=cache_seconds, color=color, label=label, label_color=label_color, logo_color=logo_color, logo_width=logo_width, render=render, shields=shields, show_latest=show_latest, style=style)

Get latest package version for a package or package group.

Get latest package version for a package or package group.

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
api_instance = cloudsmith_api.BadgesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
package_format = 'package_format_example' # str | 
package_name = 'package_name_example' # str | 
package_version = 'package_version_example' # str | 
package_identifiers = 'package_identifiers_example' # str | 
badge_token = '' # str | Badge token to authenticate for private packages (optional) (default to )
cache_seconds = '300' # str | Override the shields.io badge cacheSeconds value. (optional) (default to 300)
color = '12577E' # str | Override the shields.io badge color value. (optional) (default to 12577E)
label = 'cloudsmith' # str | Override the shields.io badge label value. (optional) (default to cloudsmith)
label_color = '021F2F' # str | Override the shields.io badge labelColor value. (optional) (default to 021F2F)
logo_color = '45B6EE' # str | Override the shields.io badge logoColor value. (optional) (default to 45B6EE)
logo_width = '10' # str | Override the shields.io badge logoWidth value. (optional) (default to 10)
render = false # bool | If true, badge will be rendered (optional) (default to false)
shields = false # bool | If true, a shields response will be generated (optional) (default to false)
show_latest = false # bool | If true, for latest version badges a '(latest)' suffix is added (optional) (default to false)
style = 'flat-square' # str | Override the shields.io badge style value. (optional) (default to flat-square)

try:
    # Get latest package version for a package or package group.
    api_response = api_instance.badges_version_list(owner, repo, package_format, package_name, package_version, package_identifiers, badge_token=badge_token, cache_seconds=cache_seconds, color=color, label=label, label_color=label_color, logo_color=logo_color, logo_width=logo_width, render=render, shields=shields, show_latest=show_latest, style=style)
    pprint(api_response)
except ApiException as e:
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
 **badge_token** | **str**| Badge token to authenticate for private packages | [optional] [default to ]
 **cache_seconds** | **str**| Override the shields.io badge cacheSeconds value. | [optional] [default to 300]
 **color** | **str**| Override the shields.io badge color value. | [optional] [default to 12577E]
 **label** | **str**| Override the shields.io badge label value. | [optional] [default to cloudsmith]
 **label_color** | **str**| Override the shields.io badge labelColor value. | [optional] [default to 021F2F]
 **logo_color** | **str**| Override the shields.io badge logoColor value. | [optional] [default to 45B6EE]
 **logo_width** | **str**| Override the shields.io badge logoWidth value. | [optional] [default to 10]
 **render** | **bool**| If true, badge will be rendered | [optional] [default to false]
 **shields** | **bool**| If true, a shields response will be generated | [optional] [default to false]
 **show_latest** | **bool**| If true, for latest version badges a &#39;(latest)&#39; suffix is added | [optional] [default to false]
 **style** | **str**| Override the shields.io badge style value. | [optional] [default to flat-square]

### Return type

[**PackageVersionBadge**](PackageVersionBadge.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

