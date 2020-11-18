# cloudsmith_api.VulnerabilitiesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vulnerabilities_list**](VulnerabilitiesApi.md#vulnerabilities_list) | **GET** /vulnerabilities/{owner}/ | Checks feature is within plan before listing results.
[**vulnerabilities_list0**](VulnerabilitiesApi.md#vulnerabilities_list0) | **GET** /vulnerabilities/{owner}/{repo}/ | Checks feature is within plan before listing results.
[**vulnerabilities_list1**](VulnerabilitiesApi.md#vulnerabilities_list1) | **GET** /vulnerabilities/{owner}/{repo}/{package}/ | Checks feature is within plan before listing results.
[**vulnerabilities_read**](VulnerabilitiesApi.md#vulnerabilities_read) | **GET** /vulnerabilities/{owner}/{repo}/{package}/{scan_id}/ | Checks feature is within plan before retrieving results.


# **vulnerabilities_list**
> list[VulnerabilityScanResultsList] vulnerabilities_list(owner, page=page, page_size=page_size)

Checks feature is within plan before listing results.

Checks feature is within plan before listing results.

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

# create an instance of the API class
api_instance = cloudsmith_api.VulnerabilitiesApi()
owner = 'owner_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try: 
    # Checks feature is within plan before listing results.
    api_response = api_instance.vulnerabilities_list(owner, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VulnerabilitiesApi->vulnerabilities_list: %s\n" % e)
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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vulnerabilities_list0**
> list[VulnerabilityScanResultsList] vulnerabilities_list0(owner, repo, page=page, page_size=page_size)

Checks feature is within plan before listing results.

Checks feature is within plan before listing results.

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

# create an instance of the API class
api_instance = cloudsmith_api.VulnerabilitiesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try: 
    # Checks feature is within plan before listing results.
    api_response = api_instance.vulnerabilities_list0(owner, repo, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VulnerabilitiesApi->vulnerabilities_list0: %s\n" % e)
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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vulnerabilities_list1**
> list[VulnerabilityScanResultsList] vulnerabilities_list1(owner, repo, package, page=page, page_size=page_size)

Checks feature is within plan before listing results.

Checks feature is within plan before listing results.

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

# create an instance of the API class
api_instance = cloudsmith_api.VulnerabilitiesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
package = 'package_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try: 
    # Checks feature is within plan before listing results.
    api_response = api_instance.vulnerabilities_list1(owner, repo, package, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VulnerabilitiesApi->vulnerabilities_list1: %s\n" % e)
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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vulnerabilities_read**
> VulnerabilityScanResults vulnerabilities_read(owner, repo, package, scan_id)

Checks feature is within plan before retrieving results.

Checks feature is within plan before retrieving results.

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

# create an instance of the API class
api_instance = cloudsmith_api.VulnerabilitiesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
package = 'package_example' # str | 
scan_id = 'scan_id_example' # str | 

try: 
    # Checks feature is within plan before retrieving results.
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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

