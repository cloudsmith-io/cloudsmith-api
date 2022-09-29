# cloudsmith_api.ReposApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repos_all_list**](ReposApi.md#repos_all_list) | **GET** /repos/ | Get a list of all repositories associated with current user.
[**repos_create**](ReposApi.md#repos_create) | **POST** /repos/{owner}/ | Create a new repository in a given namespace.
[**repos_delete**](ReposApi.md#repos_delete) | **DELETE** /repos/{owner}/{identifier}/ | Delete a repository in a given namespace.
[**repos_gpg_create**](ReposApi.md#repos_gpg_create) | **POST** /repos/{owner}/{identifier}/gpg/ | Set the active GPG key for the Repository.
[**repos_gpg_list**](ReposApi.md#repos_gpg_list) | **GET** /repos/{owner}/{identifier}/gpg/ | Retrieve the active GPG key for the Repository.
[**repos_gpg_regenerate**](ReposApi.md#repos_gpg_regenerate) | **POST** /repos/{owner}/{identifier}/gpg/regenerate/ | Regenerate GPG Key for the Repository.
[**repos_list**](ReposApi.md#repos_list) | **GET** /repos/{owner}/ | Get a list of all repositories within a namespace.
[**repos_partial_update**](ReposApi.md#repos_partial_update) | **PATCH** /repos/{owner}/{identifier}/ | Update details about a repository in a given namespace.
[**repos_privileges_list**](ReposApi.md#repos_privileges_list) | **GET** /repos/{owner}/{identifier}/privileges | List all explicity created privileges for the repository.
[**repos_privileges_partial_update**](ReposApi.md#repos_privileges_partial_update) | **PATCH** /repos/{owner}/{identifier}/privileges | Modify privileges for the repository.
[**repos_privileges_update**](ReposApi.md#repos_privileges_update) | **PUT** /repos/{owner}/{identifier}/privileges | Replace all existing repository privileges with those specified.
[**repos_read**](ReposApi.md#repos_read) | **GET** /repos/{owner}/{identifier}/ | Get a specific repository.
[**repos_rsa_create**](ReposApi.md#repos_rsa_create) | **POST** /repos/{owner}/{identifier}/rsa/ | Set the active RSA key for the Repository.
[**repos_rsa_list**](ReposApi.md#repos_rsa_list) | **GET** /repos/{owner}/{identifier}/rsa/ | Retrieve the active RSA key for the Repository.
[**repos_rsa_regenerate**](ReposApi.md#repos_rsa_regenerate) | **POST** /repos/{owner}/{identifier}/rsa/regenerate/ | Regenerate RSA Key for the Repository.


# **repos_all_list**
> list[Repository] repos_all_list(page=page, page_size=page_size)

Get a list of all repositories associated with current user.

Get a list of all repositories associated with current user.

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
api_instance = cloudsmith_api.ReposApi(cloudsmith_api.ApiClient(configuration))
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # Get a list of all repositories associated with current user.
    api_response = api_instance.repos_all_list(page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_all_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[Repository]**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create**
> RepositoryCreate repos_create(owner, data=data)

Create a new repository in a given namespace.

Create a new repository in a given namespace.

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
api_instance = cloudsmith_api.ReposApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
data = cloudsmith_api.ReposCreate() # ReposCreate |  (optional)

try:
    # Create a new repository in a given namespace.
    api_response = api_instance.repos_create(owner, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **data** | [**ReposCreate**](ReposCreate.md)|  | [optional] 

### Return type

[**RepositoryCreate**](RepositoryCreate.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete**
> repos_delete(owner, identifier)

Delete a repository in a given namespace.

Delete a repository in a given namespace.

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
api_instance = cloudsmith_api.ReposApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
identifier = 'identifier_example' # str | 

try:
    # Delete a repository in a given namespace.
    api_instance.repos_delete(owner, identifier)
except ApiException as e:
    print("Exception when calling ReposApi->repos_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_gpg_create**
> RepositoryGpgKey repos_gpg_create(owner, identifier, data=data)

Set the active GPG key for the Repository.

Set the active GPG key for the Repository.

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
api_instance = cloudsmith_api.ReposApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
identifier = 'identifier_example' # str | 
data = cloudsmith_api.ReposGpgCreate() # ReposGpgCreate |  (optional)

try:
    # Set the active GPG key for the Repository.
    api_response = api_instance.repos_gpg_create(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_gpg_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**ReposGpgCreate**](ReposGpgCreate.md)|  | [optional] 

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_gpg_list**
> RepositoryGpgKey repos_gpg_list(owner, identifier)

Retrieve the active GPG key for the Repository.

Retrieve the active GPG key for the Repository.

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
api_instance = cloudsmith_api.ReposApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
identifier = 'identifier_example' # str | 

try:
    # Retrieve the active GPG key for the Repository.
    api_response = api_instance.repos_gpg_list(owner, identifier)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_gpg_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_gpg_regenerate**
> RepositoryGpgKey repos_gpg_regenerate(owner, identifier)

Regenerate GPG Key for the Repository.

Regenerate GPG Key for the Repository.

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
api_instance = cloudsmith_api.ReposApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
identifier = 'identifier_example' # str | 

try:
    # Regenerate GPG Key for the Repository.
    api_response = api_instance.repos_gpg_regenerate(owner, identifier)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_gpg_regenerate: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list**
> list[Repository] repos_list(owner, page=page, page_size=page_size)

Get a list of all repositories within a namespace.

Get a list of all repositories within a namespace.

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
api_instance = cloudsmith_api.ReposApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # Get a list of all repositories within a namespace.
    api_response = api_instance.repos_list(owner, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[Repository]**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_partial_update**
> Repository repos_partial_update(owner, identifier, data=data)

Update details about a repository in a given namespace.

Update details about a repository in a given namespace.

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
api_instance = cloudsmith_api.ReposApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
identifier = 'identifier_example' # str | 
data = cloudsmith_api.ReposPartialUpdate() # ReposPartialUpdate |  (optional)

try:
    # Update details about a repository in a given namespace.
    api_response = api_instance.repos_partial_update(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**ReposPartialUpdate**](ReposPartialUpdate.md)|  | [optional] 

### Return type

[**Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_privileges_list**
> RepositoryPrivilegeInput repos_privileges_list(owner, identifier, page=page, page_size=page_size)

List all explicity created privileges for the repository.

List all explicity created privileges for the repository.

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
api_instance = cloudsmith_api.ReposApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
identifier = 'identifier_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)

try:
    # List all explicity created privileges for the repository.
    api_response = api_instance.repos_privileges_list(owner, identifier, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_privileges_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**RepositoryPrivilegeInput**](RepositoryPrivilegeInput.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_privileges_partial_update**
> repos_privileges_partial_update(owner, identifier, data=data)

Modify privileges for the repository.

Modify privileges for the repository.

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
api_instance = cloudsmith_api.ReposApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
identifier = 'identifier_example' # str | 
data = cloudsmith_api.ReposPrivilegesPartialUpdate() # ReposPrivilegesPartialUpdate |  (optional)

try:
    # Modify privileges for the repository.
    api_instance.repos_privileges_partial_update(owner, identifier, data=data)
except ApiException as e:
    print("Exception when calling ReposApi->repos_privileges_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**ReposPrivilegesPartialUpdate**](ReposPrivilegesPartialUpdate.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_privileges_update**
> repos_privileges_update(owner, identifier, data=data)

Replace all existing repository privileges with those specified.

Replace all existing repository privileges with those specified.

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
api_instance = cloudsmith_api.ReposApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
identifier = 'identifier_example' # str | 
data = cloudsmith_api.ReposPrivilegesUpdate() # ReposPrivilegesUpdate |  (optional)

try:
    # Replace all existing repository privileges with those specified.
    api_instance.repos_privileges_update(owner, identifier, data=data)
except ApiException as e:
    print("Exception when calling ReposApi->repos_privileges_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**ReposPrivilegesUpdate**](ReposPrivilegesUpdate.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_read**
> Repository repos_read(owner, identifier)

Get a specific repository.

Get a specific repository.

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
api_instance = cloudsmith_api.ReposApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
identifier = 'identifier_example' # str | 

try:
    # Get a specific repository.
    api_response = api_instance.repos_read(owner, identifier)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 

### Return type

[**Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_rsa_create**
> RepositoryRsaKey repos_rsa_create(owner, identifier, data=data)

Set the active RSA key for the Repository.

Set the active RSA key for the Repository.

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
api_instance = cloudsmith_api.ReposApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
identifier = 'identifier_example' # str | 
data = cloudsmith_api.ReposRsaCreate() # ReposRsaCreate |  (optional)

try:
    # Set the active RSA key for the Repository.
    api_response = api_instance.repos_rsa_create(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_rsa_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**ReposRsaCreate**](ReposRsaCreate.md)|  | [optional] 

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_rsa_list**
> RepositoryRsaKey repos_rsa_list(owner, identifier)

Retrieve the active RSA key for the Repository.

Retrieve the active RSA key for the Repository.

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
api_instance = cloudsmith_api.ReposApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
identifier = 'identifier_example' # str | 

try:
    # Retrieve the active RSA key for the Repository.
    api_response = api_instance.repos_rsa_list(owner, identifier)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_rsa_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_rsa_regenerate**
> RepositoryRsaKey repos_rsa_regenerate(owner, identifier)

Regenerate RSA Key for the Repository.

Regenerate RSA Key for the Repository.

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
api_instance = cloudsmith_api.ReposApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
identifier = 'identifier_example' # str | 

try:
    # Regenerate RSA Key for the Repository.
    api_response = api_instance.repos_rsa_regenerate(owner, identifier)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_rsa_regenerate: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

