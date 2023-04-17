# cloudsmith_api.ReposApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repos_create**](ReposApi.md#repos_create) | **POST** /repos/{owner}/ | Create a new repository in a given namespace.
[**repos_delete**](ReposApi.md#repos_delete) | **DELETE** /repos/{owner}/{identifier}/ | Delete a repository in a given namespace.
[**repos_geoip_disable**](ReposApi.md#repos_geoip_disable) | **POST** /repos/{owner}/{identifier}/geoip/disable/ | Disable GeoIP for this repository.
[**repos_geoip_enable**](ReposApi.md#repos_geoip_enable) | **POST** /repos/{owner}/{identifier}/geoip/enable/ | Enable GeoIP for this repository.
[**repos_geoip_partial_update**](ReposApi.md#repos_geoip_partial_update) | **PATCH** /repos/{owner}/{identifier}/geoip | Partially update existing repository geoip rules with those specified
[**repos_geoip_read**](ReposApi.md#repos_geoip_read) | **GET** /repos/{owner}/{identifier}/geoip | List all created GeoIP rules for the repository.
[**repos_geoip_test**](ReposApi.md#repos_geoip_test) | **POST** /repos/{owner}/{identifier}/geoip/test/ | Test a list of IP addresses against the repository&#39;s current GeoIP rules.
[**repos_geoip_update**](ReposApi.md#repos_geoip_update) | **PUT** /repos/{owner}/{identifier}/geoip | Replace all existing repository geoip rules with those specified
[**repos_gpg_create**](ReposApi.md#repos_gpg_create) | **POST** /repos/{owner}/{identifier}/gpg/ | Set the active GPG key for the Repository.
[**repos_gpg_list**](ReposApi.md#repos_gpg_list) | **GET** /repos/{owner}/{identifier}/gpg/ | Retrieve the active GPG key for the Repository.
[**repos_gpg_regenerate**](ReposApi.md#repos_gpg_regenerate) | **POST** /repos/{owner}/{identifier}/gpg/regenerate/ | Regenerate GPG Key for the Repository.
[**repos_namespace_list**](ReposApi.md#repos_namespace_list) | **GET** /repos/{owner}/ | Get a list of all repositories within a namespace.
[**repos_partial_update**](ReposApi.md#repos_partial_update) | **PATCH** /repos/{owner}/{identifier}/ | Update details about a repository in a given namespace.
[**repos_privileges_list**](ReposApi.md#repos_privileges_list) | **GET** /repos/{owner}/{identifier}/privileges | List all explicity created privileges for the repository.
[**repos_privileges_partial_update**](ReposApi.md#repos_privileges_partial_update) | **PATCH** /repos/{owner}/{identifier}/privileges | Modify privileges for the repository.
[**repos_privileges_update**](ReposApi.md#repos_privileges_update) | **PUT** /repos/{owner}/{identifier}/privileges | Replace all existing repository privileges with those specified.
[**repos_read**](ReposApi.md#repos_read) | **GET** /repos/{owner}/{identifier}/ | Get a specific repository.
[**repos_rsa_create**](ReposApi.md#repos_rsa_create) | **POST** /repos/{owner}/{identifier}/rsa/ | Set the active RSA key for the Repository.
[**repos_rsa_list**](ReposApi.md#repos_rsa_list) | **GET** /repos/{owner}/{identifier}/rsa/ | Retrieve the active RSA key for the Repository.
[**repos_rsa_regenerate**](ReposApi.md#repos_rsa_regenerate) | **POST** /repos/{owner}/{identifier}/rsa/regenerate/ | Regenerate RSA Key for the Repository.
[**repos_user_list**](ReposApi.md#repos_user_list) | **GET** /repos/ | Get a list of all repositories associated with current user.


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
data = cloudsmith_api.RepositoryCreateRequest() # RepositoryCreateRequest |  (optional)

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
 **data** | [**RepositoryCreateRequest**](RepositoryCreateRequest.md)|  | [optional] 

### Return type

[**RepositoryCreate**](RepositoryCreate.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_geoip_disable**
> repos_geoip_disable(owner, identifier, data=data)

Disable GeoIP for this repository.

Disable GeoIP for this repository.

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
data = cloudsmith_api.RespositoryGeoIPEnableDisableRequest() # RespositoryGeoIPEnableDisableRequest |  (optional)

try:
    # Disable GeoIP for this repository.
    api_instance.repos_geoip_disable(owner, identifier, data=data)
except ApiException as e:
    print("Exception when calling ReposApi->repos_geoip_disable: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**RespositoryGeoIPEnableDisableRequest**](RespositoryGeoIPEnableDisableRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_geoip_enable**
> repos_geoip_enable(owner, identifier, data=data)

Enable GeoIP for this repository.

Enable GeoIP for this repository.

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
data = cloudsmith_api.RespositoryGeoIPEnableDisableRequest() # RespositoryGeoIPEnableDisableRequest |  (optional)

try:
    # Enable GeoIP for this repository.
    api_instance.repos_geoip_enable(owner, identifier, data=data)
except ApiException as e:
    print("Exception when calling ReposApi->repos_geoip_enable: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**RespositoryGeoIPEnableDisableRequest**](RespositoryGeoIPEnableDisableRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_geoip_partial_update**
> RepositoryGeoIpRules repos_geoip_partial_update(owner, identifier, data=data)

Partially update existing repository geoip rules with those specified

Partially update existing repository geoip rules with those specified

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
data = cloudsmith_api.RepositoryGeoIpRules2() # RepositoryGeoIpRules2 |  (optional)

try:
    # Partially update existing repository geoip rules with those specified
    api_response = api_instance.repos_geoip_partial_update(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_geoip_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**RepositoryGeoIpRules2**](RepositoryGeoIpRules2.md)|  | [optional] 

### Return type

[**RepositoryGeoIpRules**](RepositoryGeoIpRules.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_geoip_read**
> RepositoryGeoIpRules repos_geoip_read(owner, identifier)

List all created GeoIP rules for the repository.

List all created GeoIP rules for the repository.

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
    # List all created GeoIP rules for the repository.
    api_response = api_instance.repos_geoip_read(owner, identifier)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_geoip_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 

### Return type

[**RepositoryGeoIpRules**](RepositoryGeoIpRules.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_geoip_test**
> RepositoryGeoIPTestAddressResponse repos_geoip_test(owner, identifier, data=data)

Test a list of IP addresses against the repository's current GeoIP rules.

Test a list of IP addresses against the repository's current GeoIP rules.

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
data = cloudsmith_api.RepositoryGeoIPTestAddress() # RepositoryGeoIPTestAddress |  (optional)

try:
    # Test a list of IP addresses against the repository's current GeoIP rules.
    api_response = api_instance.repos_geoip_test(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_geoip_test: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**RepositoryGeoIPTestAddress**](RepositoryGeoIPTestAddress.md)|  | [optional] 

### Return type

[**RepositoryGeoIPTestAddressResponse**](RepositoryGeoIPTestAddressResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_geoip_update**
> repos_geoip_update(owner, identifier, data=data)

Replace all existing repository geoip rules with those specified

Replace all existing repository geoip rules with those specified

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
data = cloudsmith_api.RepositoryGeoIpRules1() # RepositoryGeoIpRules1 |  (optional)

try:
    # Replace all existing repository geoip rules with those specified
    api_instance.repos_geoip_update(owner, identifier, data=data)
except ApiException as e:
    print("Exception when calling ReposApi->repos_geoip_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**RepositoryGeoIpRules1**](RepositoryGeoIpRules1.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
data = cloudsmith_api.RepositoryGpgKeyCreate() # RepositoryGpgKeyCreate |  (optional)

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
 **data** | [**RepositoryGpgKeyCreate**](RepositoryGpgKeyCreate.md)|  | [optional] 

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_namespace_list**
> list[Repository] repos_namespace_list(owner, page=page, page_size=page_size)

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
    api_response = api_instance.repos_namespace_list(owner, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_namespace_list: %s\n" % e)
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

 - **Content-Type**: application/json
 - **Accept**: application/json

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
data = cloudsmith_api.RepositoryRequestPatch() # RepositoryRequestPatch |  (optional)

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
 **data** | [**RepositoryRequestPatch**](RepositoryRequestPatch.md)|  | [optional] 

### Return type

[**Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

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
data = cloudsmith_api.RepositoryPrivilegeInputRequestPatch() # RepositoryPrivilegeInputRequestPatch |  (optional)

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
 **data** | [**RepositoryPrivilegeInputRequestPatch**](RepositoryPrivilegeInputRequestPatch.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
data = cloudsmith_api.RepositoryPrivilegeInputRequest() # RepositoryPrivilegeInputRequest |  (optional)

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
 **data** | [**RepositoryPrivilegeInputRequest**](RepositoryPrivilegeInputRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

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
data = cloudsmith_api.RepositoryRsaKeyCreate() # RepositoryRsaKeyCreate |  (optional)

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
 **data** | [**RepositoryRsaKeyCreate**](RepositoryRsaKeyCreate.md)|  | [optional] 

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_user_list**
> list[Repository] repos_user_list(page=page, page_size=page_size)

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
    api_response = api_instance.repos_user_list(page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_user_list: %s\n" % e)
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

