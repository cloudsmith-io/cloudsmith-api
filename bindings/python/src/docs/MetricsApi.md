# cloudsmith_api.MetricsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**metrics_entitlements_usage_list**](MetricsApi.md#metrics_entitlements_usage_list) | **GET** /metrics/{owner}/{repo}/entitlements/usage/ | View for listing entitlement token usage as a metric.


# **metrics_entitlements_usage_list**
> list[EntitlmentTokenMetric] metrics_entitlements_usage_list(owner, repo, page=page, page_size=page_size, finish=finish, start=start, tokens=tokens)

View for listing entitlement token usage as a metric.

View for listing entitlement token usage as a metric.

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
api_instance = cloudsmith_api.MetricsApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)
finish = 56 # int | Filter token usage ending before this timestamp. Defaults to now if not supplied. (optional)
start = 56 # int | Filter token usage starting from this timestamp (seconds since Jan 01 1970. (UTC)). (optional)
tokens = 'tokens_example' # str | A comma seperated list of tokens (slug perm) to include in the results. (optional)

try: 
    # View for listing entitlement token usage as a metric.
    api_response = api_instance.metrics_entitlements_usage_list(owner, repo, page=page, page_size=page_size, finish=finish, start=start, tokens=tokens)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MetricsApi->metrics_entitlements_usage_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **finish** | **int**| Filter token usage ending before this timestamp. Defaults to now if not supplied. | [optional] 
 **start** | **int**| Filter token usage starting from this timestamp (seconds since Jan 01 1970. (UTC)). | [optional] 
 **tokens** | **str**| A comma seperated list of tokens (slug perm) to include in the results. | [optional] 

### Return type

[**list[EntitlmentTokenMetric]**](EntitlmentTokenMetric.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
