# cloudsmith_api.MetricsApi

All URIs are relative to *https://api.cloudsmith.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**metrics_entitlements_account_list**](MetricsApi.md#metrics_entitlements_account_list) | **GET** /metrics/entitlements/{owner}/ | View for listing entitlement token metrics, across an account.
[**metrics_entitlements_repo_list**](MetricsApi.md#metrics_entitlements_repo_list) | **GET** /metrics/entitlements/{owner}/{repo}/ | View for listing entitlement token metrics, for a repository.
[**metrics_packages_list**](MetricsApi.md#metrics_packages_list) | **GET** /metrics/packages/{owner}/{repo}/ | View for listing package usage metrics, for a repository.


# **metrics_entitlements_account_list**
> EntitlementUsageMetricsResponse metrics_entitlements_account_list(owner, page=page, page_size=page_size, finish=finish, start=start, tokens=tokens)

View for listing entitlement token metrics, across an account.

View for listing entitlement token metrics, across an account.

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
api_instance = cloudsmith_api.MetricsApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)
finish = 'finish_example' # str | Include metrics upto and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'. (optional)
start = 'start_example' # str | Include metrics from and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'. (optional)
tokens = 'tokens_example' # str | A comma seperated list of tokens (slug perm) to include in the results. (optional)

try:
    # View for listing entitlement token metrics, across an account.
    api_response = api_instance.metrics_entitlements_account_list(owner, page=page, page_size=page_size, finish=finish, start=start, tokens=tokens)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MetricsApi->metrics_entitlements_account_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **finish** | **str**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 
 **start** | **str**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 
 **tokens** | **str**| A comma seperated list of tokens (slug perm) to include in the results. | [optional] 

### Return type

[**EntitlementUsageMetricsResponse**](EntitlementUsageMetricsResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metrics_entitlements_repo_list**
> EntitlementUsageMetricsResponse metrics_entitlements_repo_list(owner, repo, page=page, page_size=page_size, finish=finish, start=start, tokens=tokens)

View for listing entitlement token metrics, for a repository.

View for listing entitlement token metrics, for a repository.

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
api_instance = cloudsmith_api.MetricsApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)
finish = 'finish_example' # str | Include metrics upto and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'. (optional)
start = 'start_example' # str | Include metrics from and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'. (optional)
tokens = 'tokens_example' # str | A comma seperated list of tokens (slug perm) to include in the results. (optional)

try:
    # View for listing entitlement token metrics, for a repository.
    api_response = api_instance.metrics_entitlements_repo_list(owner, repo, page=page, page_size=page_size, finish=finish, start=start, tokens=tokens)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MetricsApi->metrics_entitlements_repo_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **finish** | **str**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 
 **start** | **str**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 
 **tokens** | **str**| A comma seperated list of tokens (slug perm) to include in the results. | [optional] 

### Return type

[**EntitlementUsageMetricsResponse**](EntitlementUsageMetricsResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metrics_packages_list**
> PackageUsageMetricsResponse metrics_packages_list(owner, repo, page=page, page_size=page_size, finish=finish, packages=packages, start=start)

View for listing package usage metrics, for a repository.

View for listing package usage metrics, for a repository.

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
api_instance = cloudsmith_api.MetricsApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)
finish = 'finish_example' # str | Include metrics upto and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'. (optional)
packages = 'packages_example' # str | A comma seperated list of packages (slug perm) to include in the results. (optional)
start = 'start_example' # str | Include metrics from and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'. (optional)

try:
    # View for listing package usage metrics, for a repository.
    api_response = api_instance.metrics_packages_list(owner, repo, page=page, page_size=page_size, finish=finish, packages=packages, start=start)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MetricsApi->metrics_packages_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **finish** | **str**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 
 **packages** | **str**| A comma seperated list of packages (slug perm) to include in the results. | [optional] 
 **start** | **str**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 

### Return type

[**PackageUsageMetricsResponse**](PackageUsageMetricsResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

