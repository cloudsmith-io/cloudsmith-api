# cloudsmith_api.BadgesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**badges_version_list**](BadgesApi.md#badges_version_list) | **GET** /badges/version/{owner}/{repo}/{package_format}/{package_name}/{package_version}/{package_identifiers}/ | Get latest package version for a package or package group.


# **badges_version_list**
> badges_version_list(owner, repo, package_format, package_name, package_version, package_identifiers, badge_token=badge_token, render=render)

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.BadgesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
package_format = 'package_format_example' # str | 
package_name = 'package_name_example' # str | 
package_version = 'package_version_example' # str | 
package_identifiers = 'package_identifiers_example' # str | 
badge_token = 'badge_token_example' # str | Badge token to authenticate for private packages (optional)
render = true # bool | If true, badge will be rendered (optional)

try: 
    # Get latest package version for a package or package group.
    api_instance.badges_version_list(owner, repo, package_format, package_name, package_version, package_identifiers, badge_token=badge_token, render=render)
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
 **badge_token** | **str**| Badge token to authenticate for private packages | [optional] 
 **render** | **bool**| If true, badge will be rendered | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

