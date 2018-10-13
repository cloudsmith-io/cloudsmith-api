# cloudsmith_api.FilesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**files_create**](FilesApi.md#files_create) | **POST** /files/{owner}/{repo}/ | Request URL(s) to POST new package file upload(s) to.
[**files_validate**](FilesApi.md#files_validate) | **POST** /files/{owner}/{repo}/validate/ | Validate parameters used for create.


# **files_create**
> PackageFileUpload files_create(owner, repo, data=data)

Request URL(s) to POST new package file upload(s) to.

Request URL(s) to POST new package file upload(s) to.

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
api_instance = cloudsmith_api.FilesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.FilesCreate() # FilesCreate |  (optional)

try: 
    # Request URL(s) to POST new package file upload(s) to.
    api_response = api_instance.files_create(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FilesApi->files_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**FilesCreate**](FilesCreate.md)|  | [optional] 

### Return type

[**PackageFileUpload**](PackageFileUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **files_validate**
> files_validate(owner, repo, data=data)

Validate parameters used for create.

Validate parameters used for create.

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
api_instance = cloudsmith_api.FilesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.FilesValidate() # FilesValidate |  (optional)

try: 
    # Validate parameters used for create.
    api_instance.files_validate(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling FilesApi->files_validate: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**FilesValidate**](FilesValidate.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

