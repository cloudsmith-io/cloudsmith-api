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

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_bulk_action_response import PackageBulkActionResponse
from cloudsmith_api.models.package_recycle_bin import PackageRecycleBin
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
    api_instance = cloudsmith_api.RecycleBinApi(api_client)
    owner = 'owner_example' # str | 
    data = cloudsmith_api.PackageRecycleBin() # PackageRecycleBin |  (optional)

    try:
        api_response = api_instance.recycle_bin_action(owner, data=data)
        print("The response of RecycleBinApi->recycle_bin_action:\n")
        pprint(api_response)
    except Exception as e:
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

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **recycle_bin_list**
> List[RecycleBinPackage] recycle_bin_list(owner, page=page, page_size=page_size, repository=repository)

List soft-deleted packages in recycle bin

Retrieve all soft-deleted packages in the workspace. Optionally filter by repository using the 'repository' query parameter.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.recycle_bin_package import RecycleBinPackage
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
    api_instance = cloudsmith_api.RecycleBinApi(api_client)
    owner = 'owner_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)
    repository = 'repository_example' # str | Filter packages by repository slug (optional)

    try:
        # List soft-deleted packages in recycle bin
        api_response = api_instance.recycle_bin_list(owner, page=page, page_size=page_size, repository=repository)
        print("The response of RecycleBinApi->recycle_bin_list:\n")
        pprint(api_response)
    except Exception as e:
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

[**List[RecycleBinPackage]**](RecycleBinPackage.md)

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

