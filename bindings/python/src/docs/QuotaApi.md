# cloudsmith_api.QuotaApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**quota_history_read**](QuotaApi.md#quota_history_read) | **GET** /quota/history/{owner}/ | Quota history for a given namespace.
[**quota_oss_history_read**](QuotaApi.md#quota_oss_history_read) | **GET** /quota/oss/history/{owner}/ | Open-source Quota history for a given namespace.
[**quota_oss_read**](QuotaApi.md#quota_oss_read) | **GET** /quota/oss/{owner}/ | Open-source Quota usage for a given namespace.
[**quota_read**](QuotaApi.md#quota_read) | **GET** /quota/{owner}/ | Quota usage for a given namespace.


# **quota_history_read**
> QuotaHistory quota_history_read(owner)

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

# create an instance of the API class
api_instance = cloudsmith_api.QuotaApi()
owner = 'owner_example' # str | 

try: 
    # Quota history for a given namespace.
    api_response = api_instance.quota_history_read(owner)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuotaApi->quota_history_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 

### Return type

[**QuotaHistory**](QuotaHistory.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **quota_oss_history_read**
> QuotaHistory quota_oss_history_read(owner)

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

# create an instance of the API class
api_instance = cloudsmith_api.QuotaApi()
owner = 'owner_example' # str | 

try: 
    # Open-source Quota history for a given namespace.
    api_response = api_instance.quota_oss_history_read(owner)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuotaApi->quota_oss_history_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 

### Return type

[**QuotaHistory**](QuotaHistory.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **quota_oss_read**
> Quota quota_oss_read(owner)

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

# create an instance of the API class
api_instance = cloudsmith_api.QuotaApi()
owner = 'owner_example' # str | 

try: 
    # Open-source Quota usage for a given namespace.
    api_response = api_instance.quota_oss_read(owner)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuotaApi->quota_oss_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 

### Return type

[**Quota**](Quota.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **quota_read**
> Quota quota_read(owner)

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

# create an instance of the API class
api_instance = cloudsmith_api.QuotaApi()
owner = 'owner_example' # str | 

try: 
    # Quota usage for a given namespace.
    api_response = api_instance.quota_read(owner)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuotaApi->quota_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 

### Return type

[**Quota**](Quota.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

