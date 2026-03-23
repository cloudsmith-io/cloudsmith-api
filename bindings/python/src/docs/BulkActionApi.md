# cloudsmith_api.BulkActionApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulk_action**](BulkActionApi.md#bulk_action) | **POST** /bulk-action/{owner}/ | 


# **bulk_action**
> PackageBulkActionResponse bulk_action(owner, data=data)



Perform bulk operations on multiple packages within a repository or across all accessible repositories. If 'repository' is provided, actions are limited to that repository. If 'repository' is omitted, actions are performed across all repositories the user has access to within the workspace. Returns a list of successfully actioned packages and any packages that failed with error details. 

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
api_instance = cloudsmith_api.BulkActionApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
data = cloudsmith_api.PackageBulkAction() # PackageBulkAction |  (optional)

try:
    api_response = api_instance.bulk_action(owner, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BulkActionApi->bulk_action: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **data** | [**PackageBulkAction**](PackageBulkAction.md)|  | [optional] 

### Return type

[**PackageBulkActionResponse**](PackageBulkActionResponse.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

