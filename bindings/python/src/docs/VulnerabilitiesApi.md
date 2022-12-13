# cloudsmith_api.VulnerabilitiesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vulnerabilities_namespace_list**](VulnerabilitiesApi.md#vulnerabilities_namespace_list) | **GET** /vulnerabilities/{owner}/ | Lists scan results for a specific namespace.
[**vulnerabilities_package_list**](VulnerabilitiesApi.md#vulnerabilities_package_list) | **GET** /vulnerabilities/{owner}/{repo}/{package}/ | Lists scan results for a specific package.
[**vulnerabilities_read**](VulnerabilitiesApi.md#vulnerabilities_read) | **GET** /vulnerabilities/{owner}/{repo}/{package}/{scan_id}/ | Returns a Scan Result.
[**vulnerabilities_repo_list**](VulnerabilitiesApi.md#vulnerabilities_repo_list) | **GET** /vulnerabilities/{owner}/{repo}/ | Lists scan results for a specific repository.


# **vulnerabilities_namespace_list**
> list[VulnerabilityScanResultsList] vulnerabilities_namespace_list(owner, page=page, page_size=page_size)

Lists scan results for a specific namespace.

Lists scan results for a specific namespace.

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

# create an instance of the API class
api_instance = cloudsmith_api.VulnerabilitiesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # Lists scan results for a specific namespace.
    api_response = api_instance.vulnerabilities_namespace_list(owner, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VulnerabilitiesApi->vulnerabilities_namespace_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[VulnerabilityScanResultsList]**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vulnerabilities_package_list**
> list[VulnerabilityScanResultsList] vulnerabilities_package_list(owner, repo, package, page=page, page_size=page_size)

Lists scan results for a specific package.

Lists scan results for a specific package.

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

# create an instance of the API class
api_instance = cloudsmith_api.VulnerabilitiesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
package = 'package_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # Lists scan results for a specific package.
    api_response = api_instance.vulnerabilities_package_list(owner, repo, package, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VulnerabilitiesApi->vulnerabilities_package_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **package** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[VulnerabilityScanResultsList]**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vulnerabilities_read**
> VulnerabilityScanResults vulnerabilities_read(owner, repo, package, scan_id)

Returns a Scan Result.

Returns a Scan Result.

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

# create an instance of the API class
api_instance = cloudsmith_api.VulnerabilitiesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
package = 'package_example' # str | 
scan_id = 'scan_id_example' # str | 

try:
    # Returns a Scan Result.
    api_response = api_instance.vulnerabilities_read(owner, repo, package, scan_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VulnerabilitiesApi->vulnerabilities_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **package** | **str**|  | 
 **scan_id** | **str**|  | 

### Return type

[**VulnerabilityScanResults**](VulnerabilityScanResults.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vulnerabilities_repo_list**
> list[VulnerabilityScanResultsList] vulnerabilities_repo_list(owner, repo, page=page, page_size=page_size)

Lists scan results for a specific repository.

Lists scan results for a specific repository.

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

# create an instance of the API class
api_instance = cloudsmith_api.VulnerabilitiesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # Lists scan results for a specific repository.
    api_response = api_instance.vulnerabilities_repo_list(owner, repo, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VulnerabilitiesApi->vulnerabilities_repo_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[VulnerabilityScanResultsList]**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

