# cloudsmith_api.FilesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**files_abort**](FilesApi.md#files_abort) | **POST** /files/{owner}/{repo}/{identifier}/abort/ | Abort a multipart file upload.
[**files_complete**](FilesApi.md#files_complete) | **POST** /files/{owner}/{repo}/{identifier}/complete/ | Complete a multipart file upload.
[**files_create**](FilesApi.md#files_create) | **POST** /files/{owner}/{repo}/ | Request URL(s) to upload new package file upload(s) to.
[**files_info**](FilesApi.md#files_info) | **GET** /files/{owner}/{repo}/{identifier}/info/ | Get upload information to perform a multipart file upload.
[**files_validate**](FilesApi.md#files_validate) | **POST** /files/{owner}/{repo}/validate/ | Validate parameters used for create.


# **files_abort**
> files_abort(owner, repo, identifier, data=data)

Abort a multipart file upload.

Abort a multipart file upload.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_file_upload_request import PackageFileUploadRequest
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
    api_instance = cloudsmith_api.FilesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 
    data = cloudsmith_api.PackageFileUploadRequest() # PackageFileUploadRequest |  (optional)

    try:
        # Abort a multipart file upload.
        api_instance.files_abort(owner, repo, identifier, data=data)
    except Exception as e:
        print("Exception when calling FilesApi->files_abort: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**PackageFileUploadRequest**](PackageFileUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The multipart upload was aborted successfully. |  -  |
**400** | The multipart upload could not be aborted. |  -  |
**404** | Namespace (owner), repository or upload file not found |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **files_complete**
> PackageFileUpload files_complete(owner, repo, identifier, data=data)

Complete a multipart file upload.

Complete a multipart file upload.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_file_upload import PackageFileUpload
from cloudsmith_api.models.package_file_upload_request import PackageFileUploadRequest
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
    api_instance = cloudsmith_api.FilesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 
    data = cloudsmith_api.PackageFileUploadRequest() # PackageFileUploadRequest |  (optional)

    try:
        # Complete a multipart file upload.
        api_response = api_instance.files_complete(owner, repo, identifier, data=data)
        print("The response of FilesApi->files_complete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FilesApi->files_complete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**PackageFileUploadRequest**](PackageFileUploadRequest.md)|  | [optional] 

### Return type

[**PackageFileUpload**](PackageFileUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The multipart upload was completed successfully. |  -  |
**400** | The multipart upload could not be completed. |  -  |
**404** | Namespace (owner), repository or upload file not found |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **files_create**
> PackageFileUpload files_create(owner, repo, data=data)

Request URL(s) to upload new package file upload(s) to.

Request URL(s) to upload new package file upload(s) to.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_file_upload import PackageFileUpload
from cloudsmith_api.models.package_file_upload_request import PackageFileUploadRequest
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
    api_instance = cloudsmith_api.FilesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.PackageFileUploadRequest() # PackageFileUploadRequest |  (optional)

    try:
        # Request URL(s) to upload new package file upload(s) to.
        api_response = api_instance.files_create(owner, repo, data=data)
        print("The response of FilesApi->files_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FilesApi->files_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**PackageFileUploadRequest**](PackageFileUploadRequest.md)|  | [optional] 

### Return type

[**PackageFileUpload**](PackageFileUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | The upload request was accepted |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **files_info**
> PackageFilePartsUpload files_info(owner, repo, identifier, filename, part_number=part_number)

Get upload information to perform a multipart file upload.

Get upload information to perform a multipart file upload.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_file_parts_upload import PackageFilePartsUpload
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
    api_instance = cloudsmith_api.FilesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 
    filename = 'filename_example' # str | The filename of the file being uploaded
    part_number = 56 # int | The part number to be uploaded next (optional)

    try:
        # Get upload information to perform a multipart file upload.
        api_response = api_instance.files_info(owner, repo, identifier, filename, part_number=part_number)
        print("The response of FilesApi->files_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FilesApi->files_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 
 **filename** | **str**| The filename of the file being uploaded | 
 **part_number** | **int**| The part number to be uploaded next | [optional] 

### Return type

[**PackageFilePartsUpload**](PackageFilePartsUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Information for multipart uploaded retrieved successfully. |  -  |
**400** | The provided upload file was not a multipart upload. |  -  |
**404** | Namespace (owner), repository or upload file not found |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **files_validate**
> files_validate(owner, repo, data=data)

Validate parameters used for create.

Validate parameters used for create.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_file_upload_request import PackageFileUploadRequest
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
    api_instance = cloudsmith_api.FilesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.PackageFileUploadRequest() # PackageFileUploadRequest |  (optional)

    try:
        # Validate parameters used for create.
        api_instance.files_validate(owner, repo, data=data)
    except Exception as e:
        print("Exception when calling FilesApi->files_validate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**PackageFileUploadRequest**](PackageFileUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Validation was successful, parameters are OK. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

