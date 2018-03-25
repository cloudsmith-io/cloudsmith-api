# cloudsmith_api.EntitlementsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entitlements_create**](EntitlementsApi.md#entitlements_create) | **POST** /entitlements/{owner}/{repo}/ | Create a specific entitlement in a repository.
[**entitlements_delete**](EntitlementsApi.md#entitlements_delete) | **DELETE** /entitlements/{owner}/{repo}/{slug_perm}/ | Delete a specific entitlement in a repository.
[**entitlements_list**](EntitlementsApi.md#entitlements_list) | **GET** /entitlements/{owner}/{repo}/ | Get a list of all entitlements in a repository.
[**entitlements_partial_update**](EntitlementsApi.md#entitlements_partial_update) | **PATCH** /entitlements/{owner}/{repo}/{slug_perm}/ | Update a specific entitlement in a repository.
[**entitlements_read**](EntitlementsApi.md#entitlements_read) | **GET** /entitlements/{owner}/{repo}/{slug_perm}/ | Views for working with repository entitlements.
[**entitlements_refresh**](EntitlementsApi.md#entitlements_refresh) | **POST** /entitlements/{owner}/{repo}/{slug_perm}/refresh/ | Refresh an entitlement token in a repository.
[**entitlements_sync**](EntitlementsApi.md#entitlements_sync) | **POST** /entitlements/{owner}/{repo}/sync/ | Synchronise tokens from a source repository.


# **entitlements_create**
> RepositoryToken entitlements_create(owner, repo, data=data)

Create a specific entitlement in a repository.

Create a specific entitlement in a repository.

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
# Configure HTTP basic authorization: basic
cloudsmith_api.configuration.username = 'YOUR_USERNAME'
cloudsmith_api.configuration.password = 'YOUR_PASSWORD'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.EntitlementsApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.EntitlementsCreate() # EntitlementsCreate |  (optional)

try: 
    # Create a specific entitlement in a repository.
    api_response = api_instance.entitlements_create(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitlementsApi->entitlements_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**EntitlementsCreate**](EntitlementsCreate.md)|  | [optional] 

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entitlements_delete**
> entitlements_delete(owner, repo, slug_perm)

Delete a specific entitlement in a repository.

Delete a specific entitlement in a repository.

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
# Configure HTTP basic authorization: basic
cloudsmith_api.configuration.username = 'YOUR_USERNAME'
cloudsmith_api.configuration.password = 'YOUR_PASSWORD'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.EntitlementsApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
slug_perm = 'slug_perm_example' # str | 

try: 
    # Delete a specific entitlement in a repository.
    api_instance.entitlements_delete(owner, repo, slug_perm)
except ApiException as e:
    print("Exception when calling EntitlementsApi->entitlements_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entitlements_list**
> list[RepositoryToken] entitlements_list(owner, repo, page=page, page_size=page_size)

Get a list of all entitlements in a repository.

Get a list of all entitlements in a repository.

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
# Configure HTTP basic authorization: basic
cloudsmith_api.configuration.username = 'YOUR_USERNAME'
cloudsmith_api.configuration.password = 'YOUR_PASSWORD'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.EntitlementsApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try: 
    # Get a list of all entitlements in a repository.
    api_response = api_instance.entitlements_list(owner, repo, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitlementsApi->entitlements_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[RepositoryToken]**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entitlements_partial_update**
> RepositoryToken entitlements_partial_update(owner, repo, slug_perm, data=data)

Update a specific entitlement in a repository.

Update a specific entitlement in a repository.

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
# Configure HTTP basic authorization: basic
cloudsmith_api.configuration.username = 'YOUR_USERNAME'
cloudsmith_api.configuration.password = 'YOUR_PASSWORD'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.EntitlementsApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.EntitlementsPartialUpdate() # EntitlementsPartialUpdate |  (optional)

try: 
    # Update a specific entitlement in a repository.
    api_response = api_instance.entitlements_partial_update(owner, repo, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitlementsApi->entitlements_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**EntitlementsPartialUpdate**](EntitlementsPartialUpdate.md)|  | [optional] 

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entitlements_read**
> RepositoryToken entitlements_read(owner, repo, slug_perm)

Views for working with repository entitlements.

Views for working with repository entitlements.

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
# Configure HTTP basic authorization: basic
cloudsmith_api.configuration.username = 'YOUR_USERNAME'
cloudsmith_api.configuration.password = 'YOUR_PASSWORD'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.EntitlementsApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
slug_perm = 'slug_perm_example' # str | 

try: 
    # Views for working with repository entitlements.
    api_response = api_instance.entitlements_read(owner, repo, slug_perm)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitlementsApi->entitlements_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entitlements_refresh**
> RepositoryTokenRefresh entitlements_refresh(owner, repo, slug_perm, data=data)

Refresh an entitlement token in a repository.

Refresh an entitlement token in a repository.

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
# Configure HTTP basic authorization: basic
cloudsmith_api.configuration.username = 'YOUR_USERNAME'
cloudsmith_api.configuration.password = 'YOUR_PASSWORD'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.EntitlementsApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.EntitlementsRefresh() # EntitlementsRefresh |  (optional)

try: 
    # Refresh an entitlement token in a repository.
    api_response = api_instance.entitlements_refresh(owner, repo, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitlementsApi->entitlements_refresh: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**EntitlementsRefresh**](EntitlementsRefresh.md)|  | [optional] 

### Return type

[**RepositoryTokenRefresh**](RepositoryTokenRefresh.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entitlements_sync**
> RepositoryTokenSync entitlements_sync(owner, repo, data=data)

Synchronise tokens from a source repository.

Synchronise tokens from a source repository.

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
# Configure HTTP basic authorization: basic
cloudsmith_api.configuration.username = 'YOUR_USERNAME'
cloudsmith_api.configuration.password = 'YOUR_PASSWORD'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.EntitlementsApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.EntitlementsSync() # EntitlementsSync |  (optional)

try: 
    # Synchronise tokens from a source repository.
    api_response = api_instance.entitlements_sync(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitlementsApi->entitlements_sync: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**EntitlementsSync**](EntitlementsSync.md)|  | [optional] 

### Return type

[**RepositoryTokenSync**](RepositoryTokenSync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

