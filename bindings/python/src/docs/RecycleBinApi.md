# cloudsmith_api.RecycleBinApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**recycle_bin_action**](RecycleBinApi.md#recycle_bin_action) | **POST** /recycle-bin/{owner}/action/ | 
[**recycle_bin_list**](RecycleBinApi.md#recycle_bin_list) | **GET** /recycle-bin/{owner}/ | List soft-deleted packages in recycle bin


# **recycle_bin_action**
> PackageBulkActionResponse recycle_bin_action(owner, data=data)



Perform actions on soft-deleted packages in the recycle bin. Supported actions: permanently delete (hard delete), restore. Returns a list of successfully actioned packages and any packages that failed with error details. 

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
api_instance = cloudsmith_api.RecycleBinApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
data = cloudsmith_api.PackageRecycleBin() # PackageRecycleBin |  (optional)

try:
    api_response = api_instance.recycle_bin_action(owner, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RecycleBinApi->recycle_bin_action: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **data** | [**PackageRecycleBin**](PackageRecycleBin.md)|  | [optional] 

### Return type

[**PackageBulkActionResponse**](PackageBulkActionResponse.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **recycle_bin_list**
> list[RecycleBinPackage] recycle_bin_list(owner, page=page, page_size=page_size, repository=repository)

List soft-deleted packages in recycle bin

Retrieve all soft-deleted packages in the workspace. Optionally filter by repository using the 'repository' query parameter.

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
api_instance = cloudsmith_api.RecycleBinApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)
repository = 'repository_example' # str | Filter packages by repository slug (optional)

try:
    # List soft-deleted packages in recycle bin
    api_response = api_instance.recycle_bin_list(owner, page=page, page_size=page_size, repository=repository)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RecycleBinApi->recycle_bin_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **repository** | **str**| Filter packages by repository slug | [optional] 

### Return type

[**list[RecycleBinPackage]**](RecycleBinPackage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

