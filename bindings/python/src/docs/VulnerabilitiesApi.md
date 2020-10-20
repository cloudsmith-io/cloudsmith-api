# cloudsmith_api.VulnerabilitiesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vulnerabilities_list**](VulnerabilitiesApi.md#vulnerabilities_list) | **GET** /vulnerabilities/{owner}/ | Read-only view to list vulnerabiltiy scan results within a Namespace.
[**vulnerabilities_list0**](VulnerabilitiesApi.md#vulnerabilities_list0) | **GET** /vulnerabilities/{owner}/{repo}/ | Read-only views to list vulnerabiltiy scan results within a Repository.
[**vulnerabilities_list1**](VulnerabilitiesApi.md#vulnerabilities_list1) | **GET** /vulnerabilities/{owner}/{repo}/{package}/ | Read-only views to list vulnerabiltiy scan results within a Repository
[**vulnerabilities_read**](VulnerabilitiesApi.md#vulnerabilities_read) | **GET** /vulnerabilities/{owner}/{repo}/{package}/{scan_id}/ | Read-only view to retrieve vulnerability scans results using a


# **vulnerabilities_list**
> list[VulnerabilityScanResultsList] vulnerabilities_list(owner, page=page, page_size=page_size)

Read-only view to list vulnerabiltiy scan results within a Namespace.

Read-only view to list vulnerabiltiy scan results within a Namespace.

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
    # Read-only view to list vulnerabiltiy scan results within a Namespace.
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

Read-only views to list vulnerabiltiy scan results within a Repository.

Read-only views to list vulnerabiltiy scan results within a Repository.

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
    # Read-only views to list vulnerabiltiy scan results within a Repository.
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

Read-only views to list vulnerabiltiy scan results within a Repository

Read-only views to list vulnerabiltiy scan results within a Repository for a given Package identifier.

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
package = 'package_example' # str | The package that the scan result relates to.
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try: 
    # Read-only views to list vulnerabiltiy scan results within a Repository
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
 **package** | **str**| The package that the scan result relates to. | 
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

Read-only view to retrieve vulnerability scans results using a

Read-only view to retrieve vulnerability scans results using a vulnerabiltiy scan results identifier (slug_perm).

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
package = 'package_example' # str | The package that the scan result relates to.
scan_id = 'scan_id_example' # str | A sequential identifier that increments by one for each new scan result within a package. These are always unique and can be used to reference the scan results elsewhere (e.g. via the CLI.)

try: 
    # Read-only view to retrieve vulnerability scans results using a
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
 **package** | **str**| The package that the scan result relates to. | 
 **scan_id** | **str**| A sequential identifier that increments by one for each new scan result within a package. These are always unique and can be used to reference the scan results elsewhere (e.g. via the CLI.) | 

### Return type

[**VulnerabilityScanResults**](VulnerabilityScanResults.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

