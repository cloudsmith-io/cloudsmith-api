# cloudsmith_api.QuotaApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**quota_history_list**](QuotaApi.md#quota_history_list) | **GET** /quota/{owner}/history/ | Quota history for a given namespace.
[**quota_list**](QuotaApi.md#quota_list) | **GET** /quota/{owner}/ | Quota usage for a given namespace.
[**quota_oss_history_list**](QuotaApi.md#quota_oss_history_list) | **GET** /quota/{owner}/oss/history/ | Open-source Quota history for a given namespace.
[**quota_oss_list**](QuotaApi.md#quota_oss_list) | **GET** /quota/{owner}/oss/ | Open-source Quota usage for a given namespace.


# **quota_history_list**
> list[QuotaHistory] quota_history_list(owner, page=page, page_size=page_size)

Quota history for a given namespace.

Quota history for a given namespace.

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
api_instance = cloudsmith_api.QuotaApi()
owner = 'owner_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try: 
    # Quota history for a given namespace.
    api_response = api_instance.quota_history_list(owner, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuotaApi->quota_history_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[QuotaHistory]**](QuotaHistory.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **quota_list**
> list[Quota] quota_list(owner, page=page, page_size=page_size)

Quota usage for a given namespace.

Quota usage for a given namespace.

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
api_instance = cloudsmith_api.QuotaApi()
owner = 'owner_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try: 
    # Quota usage for a given namespace.
    api_response = api_instance.quota_list(owner, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuotaApi->quota_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[Quota]**](Quota.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **quota_oss_history_list**
> list[QuotaHistory] quota_oss_history_list(owner, page=page, page_size=page_size)

Open-source Quota history for a given namespace.

Open-source Quota history for a given namespace.

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
api_instance = cloudsmith_api.QuotaApi()
owner = 'owner_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try: 
    # Open-source Quota history for a given namespace.
    api_response = api_instance.quota_oss_history_list(owner, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuotaApi->quota_oss_history_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[QuotaHistory]**](QuotaHistory.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **quota_oss_list**
> list[Quota] quota_oss_list(owner, page=page, page_size=page_size)

Open-source Quota usage for a given namespace.

Open-source Quota usage for a given namespace.

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
api_instance = cloudsmith_api.QuotaApi()
owner = 'owner_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try: 
    # Open-source Quota usage for a given namespace.
    api_response = api_instance.quota_oss_list(owner, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuotaApi->quota_oss_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[Quota]**](Quota.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

