# cloudsmith_api.ReposApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repos_create**](ReposApi.md#repos_create) | **POST** /repos/{owner}/ | Create a new repository in a given namespace.
[**repos_delete**](ReposApi.md#repos_delete) | **DELETE** /repos/{owner}/{identifier}/ | Delete a repository in a given namespace.
[**repos_geoip_disable**](ReposApi.md#repos_geoip_disable) | **POST** /repos/{owner}/{identifier}/geoip/disable/ | Disable GeoIP for this repository.
[**repos_geoip_enable**](ReposApi.md#repos_geoip_enable) | **POST** /repos/{owner}/{identifier}/geoip/enable/ | Enable GeoIP for this repository.
[**repos_geoip_partial_update**](ReposApi.md#repos_geoip_partial_update) | **PATCH** /repos/{owner}/{identifier}/geoip | Partially update repository geoip rules.
[**repos_geoip_read**](ReposApi.md#repos_geoip_read) | **GET** /repos/{owner}/{identifier}/geoip | List all repository geoip rules.
[**repos_geoip_test**](ReposApi.md#repos_geoip_test) | **POST** /repos/{owner}/{identifier}/geoip/test/ | Test a list of IP addresses against the repository&#39;s current GeoIP rules.
[**repos_geoip_update**](ReposApi.md#repos_geoip_update) | **PUT** /repos/{owner}/{identifier}/geoip | Replace repository geoip rules.
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
[**repos_upstream_cran_create**](ReposApi.md#repos_upstream_cran_create) | **POST** /repos/{owner}/{identifier}/upstream/cran/ | Create a CRAN upstream config for this repository.
[**repos_upstream_cran_delete**](ReposApi.md#repos_upstream_cran_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Delete a CRAN upstream config for this repository.
[**repos_upstream_cran_list**](ReposApi.md#repos_upstream_cran_list) | **GET** /repos/{owner}/{identifier}/upstream/cran/ | List CRAN upstream configs for this repository.
[**repos_upstream_cran_partial_update**](ReposApi.md#repos_upstream_cran_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Partially update a CRAN upstream config for this repository.
[**repos_upstream_cran_read**](ReposApi.md#repos_upstream_cran_read) | **GET** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Retrieve a CRAN upstream config for this repository.
[**repos_upstream_cran_update**](ReposApi.md#repos_upstream_cran_update) | **PUT** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Update a CRAN upstream config for this repository.
[**repos_upstream_dart_create**](ReposApi.md#repos_upstream_dart_create) | **POST** /repos/{owner}/{identifier}/upstream/dart/ | Create a Dart upstream config for this repository.
[**repos_upstream_dart_delete**](ReposApi.md#repos_upstream_dart_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Delete a Dart upstream config for this repository.
[**repos_upstream_dart_list**](ReposApi.md#repos_upstream_dart_list) | **GET** /repos/{owner}/{identifier}/upstream/dart/ | List Dart upstream configs for this repository.
[**repos_upstream_dart_partial_update**](ReposApi.md#repos_upstream_dart_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Partially update a Dart upstream config for this repository.
[**repos_upstream_dart_read**](ReposApi.md#repos_upstream_dart_read) | **GET** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Retrieve a Dart upstream config for this repository.
[**repos_upstream_dart_update**](ReposApi.md#repos_upstream_dart_update) | **PUT** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Update a Dart upstream config for this repository.
[**repos_upstream_deb_create**](ReposApi.md#repos_upstream_deb_create) | **POST** /repos/{owner}/{identifier}/upstream/deb/ | Create a Debian upstream config for this repository.
[**repos_upstream_deb_delete**](ReposApi.md#repos_upstream_deb_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Delete a Debian upstream config for this repository.
[**repos_upstream_deb_list**](ReposApi.md#repos_upstream_deb_list) | **GET** /repos/{owner}/{identifier}/upstream/deb/ | List Debian upstream configs for this repository.
[**repos_upstream_deb_partial_update**](ReposApi.md#repos_upstream_deb_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Partially update a Debian upstream config for this repository.
[**repos_upstream_deb_read**](ReposApi.md#repos_upstream_deb_read) | **GET** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Retrieve a Debian upstream config for this repository.
[**repos_upstream_deb_update**](ReposApi.md#repos_upstream_deb_update) | **PUT** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Update a Debian upstream config for this repository.
[**repos_upstream_docker_create**](ReposApi.md#repos_upstream_docker_create) | **POST** /repos/{owner}/{identifier}/upstream/docker/ | Create a Docker upstream config for this repository.
[**repos_upstream_docker_delete**](ReposApi.md#repos_upstream_docker_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Delete a Docker upstream config for this repository.
[**repos_upstream_docker_list**](ReposApi.md#repos_upstream_docker_list) | **GET** /repos/{owner}/{identifier}/upstream/docker/ | List Docker upstream configs for this repository.
[**repos_upstream_docker_partial_update**](ReposApi.md#repos_upstream_docker_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Partially update a Docker upstream config for this repository.
[**repos_upstream_docker_read**](ReposApi.md#repos_upstream_docker_read) | **GET** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Retrieve a Docker upstream config for this repository.
[**repos_upstream_docker_update**](ReposApi.md#repos_upstream_docker_update) | **PUT** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Update a Docker upstream config for this repository.
[**repos_upstream_helm_create**](ReposApi.md#repos_upstream_helm_create) | **POST** /repos/{owner}/{identifier}/upstream/helm/ | Create a Helm upstream config for this repository.
[**repos_upstream_helm_delete**](ReposApi.md#repos_upstream_helm_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Delete a Helm upstream config for this repository.
[**repos_upstream_helm_list**](ReposApi.md#repos_upstream_helm_list) | **GET** /repos/{owner}/{identifier}/upstream/helm/ | List Helm upstream configs for this repository.
[**repos_upstream_helm_partial_update**](ReposApi.md#repos_upstream_helm_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Partially update a Helm upstream config for this repository.
[**repos_upstream_helm_read**](ReposApi.md#repos_upstream_helm_read) | **GET** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Retrieve a Helm upstream config for this repository.
[**repos_upstream_helm_update**](ReposApi.md#repos_upstream_helm_update) | **PUT** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Update a Helm upstream config for this repository.
[**repos_upstream_maven_create**](ReposApi.md#repos_upstream_maven_create) | **POST** /repos/{owner}/{identifier}/upstream/maven/ | Create a Maven upstream config for this repository.
[**repos_upstream_maven_delete**](ReposApi.md#repos_upstream_maven_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Delete a Maven upstream config for this repository.
[**repos_upstream_maven_list**](ReposApi.md#repos_upstream_maven_list) | **GET** /repos/{owner}/{identifier}/upstream/maven/ | List Maven upstream configs for this repository.
[**repos_upstream_maven_partial_update**](ReposApi.md#repos_upstream_maven_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Partially update a Maven upstream config for this repository.
[**repos_upstream_maven_read**](ReposApi.md#repos_upstream_maven_read) | **GET** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Retrieve a Maven upstream config for this repository.
[**repos_upstream_maven_update**](ReposApi.md#repos_upstream_maven_update) | **PUT** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Update a Maven upstream config for this repository.
[**repos_upstream_npm_create**](ReposApi.md#repos_upstream_npm_create) | **POST** /repos/{owner}/{identifier}/upstream/npm/ | Create a npm upstream config for this repository.
[**repos_upstream_npm_delete**](ReposApi.md#repos_upstream_npm_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Delete a npm upstream config for this repository.
[**repos_upstream_npm_list**](ReposApi.md#repos_upstream_npm_list) | **GET** /repos/{owner}/{identifier}/upstream/npm/ | List npm upstream configs for this repository.
[**repos_upstream_npm_partial_update**](ReposApi.md#repos_upstream_npm_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Partially update a npm upstream config for this repository.
[**repos_upstream_npm_read**](ReposApi.md#repos_upstream_npm_read) | **GET** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Retrieve a npm upstream config for this repository.
[**repos_upstream_npm_update**](ReposApi.md#repos_upstream_npm_update) | **PUT** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Update a npm upstream config for this repository.
[**repos_upstream_nuget_create**](ReposApi.md#repos_upstream_nuget_create) | **POST** /repos/{owner}/{identifier}/upstream/nuget/ | Create a NuGet upstream config for this repository.
[**repos_upstream_nuget_delete**](ReposApi.md#repos_upstream_nuget_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Delete a NuGet upstream config for this repository.
[**repos_upstream_nuget_list**](ReposApi.md#repos_upstream_nuget_list) | **GET** /repos/{owner}/{identifier}/upstream/nuget/ | List NuGet upstream configs for this repository.
[**repos_upstream_nuget_partial_update**](ReposApi.md#repos_upstream_nuget_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Partially update a NuGet upstream config for this repository.
[**repos_upstream_nuget_read**](ReposApi.md#repos_upstream_nuget_read) | **GET** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Retrieve a NuGet upstream config for this repository.
[**repos_upstream_nuget_update**](ReposApi.md#repos_upstream_nuget_update) | **PUT** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Update a NuGet upstream config for this repository.
[**repos_upstream_python_create**](ReposApi.md#repos_upstream_python_create) | **POST** /repos/{owner}/{identifier}/upstream/python/ | Create a Python upstream config for this repository.
[**repos_upstream_python_delete**](ReposApi.md#repos_upstream_python_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Delete a Python upstream config for this repository.
[**repos_upstream_python_list**](ReposApi.md#repos_upstream_python_list) | **GET** /repos/{owner}/{identifier}/upstream/python/ | List Python upstream configs for this repository.
[**repos_upstream_python_partial_update**](ReposApi.md#repos_upstream_python_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Partially update a Python upstream config for this repository.
[**repos_upstream_python_read**](ReposApi.md#repos_upstream_python_read) | **GET** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Retrieve a Python upstream config for this repository.
[**repos_upstream_python_update**](ReposApi.md#repos_upstream_python_update) | **PUT** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Update a Python upstream config for this repository.
[**repos_upstream_rpm_create**](ReposApi.md#repos_upstream_rpm_create) | **POST** /repos/{owner}/{identifier}/upstream/rpm/ | Create a RedHat upstream config for this repository.
[**repos_upstream_rpm_delete**](ReposApi.md#repos_upstream_rpm_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Delete a RedHat upstream config for this repository.
[**repos_upstream_rpm_list**](ReposApi.md#repos_upstream_rpm_list) | **GET** /repos/{owner}/{identifier}/upstream/rpm/ | List RedHat upstream configs for this repository.
[**repos_upstream_rpm_partial_update**](ReposApi.md#repos_upstream_rpm_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Partially update a RedHat upstream config for this repository.
[**repos_upstream_rpm_read**](ReposApi.md#repos_upstream_rpm_read) | **GET** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Retrieve a RedHat upstream config for this repository.
[**repos_upstream_rpm_update**](ReposApi.md#repos_upstream_rpm_update) | **PUT** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Update a RedHat upstream config for this repository.
[**repos_upstream_ruby_create**](ReposApi.md#repos_upstream_ruby_create) | **POST** /repos/{owner}/{identifier}/upstream/ruby/ | Create a Ruby upstream config for this repository.
[**repos_upstream_ruby_delete**](ReposApi.md#repos_upstream_ruby_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Delete a Ruby upstream config for this repository.
[**repos_upstream_ruby_list**](ReposApi.md#repos_upstream_ruby_list) | **GET** /repos/{owner}/{identifier}/upstream/ruby/ | List Ruby upstream configs for this repository.
[**repos_upstream_ruby_partial_update**](ReposApi.md#repos_upstream_ruby_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Partially update a Ruby upstream config for this repository.
[**repos_upstream_ruby_read**](ReposApi.md#repos_upstream_ruby_read) | **GET** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Retrieve a Ruby upstream config for this repository.
[**repos_upstream_ruby_update**](ReposApi.md#repos_upstream_ruby_update) | **PUT** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Update a Ruby upstream config for this repository.
[**repos_upstream_swift_create**](ReposApi.md#repos_upstream_swift_create) | **POST** /repos/{owner}/{identifier}/upstream/swift/ | Create a Swift upstream config for this repository.
[**repos_upstream_swift_delete**](ReposApi.md#repos_upstream_swift_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Delete a Swift upstream config for this repository.
[**repos_upstream_swift_list**](ReposApi.md#repos_upstream_swift_list) | **GET** /repos/{owner}/{identifier}/upstream/swift/ | List Swift upstream configs for this repository.
[**repos_upstream_swift_partial_update**](ReposApi.md#repos_upstream_swift_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Partially update a Swift upstream config for this repository.
[**repos_upstream_swift_read**](ReposApi.md#repos_upstream_swift_read) | **GET** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Retrieve a Swift upstream config for this repository.
[**repos_upstream_swift_update**](ReposApi.md#repos_upstream_swift_update) | **PUT** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Update a Swift upstream config for this repository.
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
data = cloudsmith_api.RespositoryGeoIpEnableDisableRequest() # RespositoryGeoIpEnableDisableRequest |  (optional)

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
 **data** | [**RespositoryGeoIpEnableDisableRequest**](RespositoryGeoIpEnableDisableRequest.md)|  | [optional] 

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
data = cloudsmith_api.RespositoryGeoIpEnableDisableRequest() # RespositoryGeoIpEnableDisableRequest |  (optional)

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
 **data** | [**RespositoryGeoIpEnableDisableRequest**](RespositoryGeoIpEnableDisableRequest.md)|  | [optional] 

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

Partially update repository geoip rules.

Partially update repository geoip rules.

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
data = cloudsmith_api.RepositoryGeoIpRulesRequestPatch() # RepositoryGeoIpRulesRequestPatch |  (optional)

try:
    # Partially update repository geoip rules.
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
 **data** | [**RepositoryGeoIpRulesRequestPatch**](RepositoryGeoIpRulesRequestPatch.md)|  | [optional] 

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

List all repository geoip rules.

List all repository geoip rules.

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
    # List all repository geoip rules.
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
> RepositoryGeoIpTestAddressResponse repos_geoip_test(owner, identifier, data=data)

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
data = cloudsmith_api.RepositoryGeoIpTestAddress() # RepositoryGeoIpTestAddress |  (optional)

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
 **data** | [**RepositoryGeoIpTestAddress**](RepositoryGeoIpTestAddress.md)|  | [optional] 

### Return type

[**RepositoryGeoIpTestAddressResponse**](RepositoryGeoIpTestAddressResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_geoip_update**
> RepositoryGeoIpRules repos_geoip_update(owner, identifier, data=data)

Replace repository geoip rules.

Replace repository geoip rules.

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
data = cloudsmith_api.RepositoryGeoIpRulesRequest() # RepositoryGeoIpRulesRequest |  (optional)

try:
    # Replace repository geoip rules.
    api_response = api_instance.repos_geoip_update(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_geoip_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**RepositoryGeoIpRulesRequest**](RepositoryGeoIpRulesRequest.md)|  | [optional] 

### Return type

[**RepositoryGeoIpRules**](RepositoryGeoIpRules.md)

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

# **repos_upstream_cran_create**
> CranUpstream repos_upstream_cran_create(owner, identifier, data=data)

Create a CRAN upstream config for this repository.

Create a CRAN upstream config for this repository.

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
data = cloudsmith_api.CranUpstreamRequest() # CranUpstreamRequest |  (optional)

try:
    # Create a CRAN upstream config for this repository.
    api_response = api_instance.repos_upstream_cran_create(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_cran_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**CranUpstreamRequest**](CranUpstreamRequest.md)|  | [optional] 

### Return type

[**CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_cran_delete**
> repos_upstream_cran_delete(owner, identifier, slug_perm)

Delete a CRAN upstream config for this repository.

Delete a CRAN upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a CRAN upstream config for this repository.
    api_instance.repos_upstream_cran_delete(owner, identifier, slug_perm)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_cran_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_cran_list**
> list[CranUpstream] repos_upstream_cran_list(owner, identifier, page=page, page_size=page_size)

List CRAN upstream configs for this repository.

List CRAN upstream configs for this repository.

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
    # List CRAN upstream configs for this repository.
    api_response = api_instance.repos_upstream_cran_list(owner, identifier, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_cran_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[CranUpstream]**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_cran_partial_update**
> CranUpstream repos_upstream_cran_partial_update(owner, identifier, slug_perm, data=data)

Partially update a CRAN upstream config for this repository.

Partially update a CRAN upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.CranUpstreamRequestPatch() # CranUpstreamRequestPatch |  (optional)

try:
    # Partially update a CRAN upstream config for this repository.
    api_response = api_instance.repos_upstream_cran_partial_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_cran_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**CranUpstreamRequestPatch**](CranUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_cran_read**
> CranUpstream repos_upstream_cran_read(owner, identifier, slug_perm)

Retrieve a CRAN upstream config for this repository.

Retrieve a CRAN upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Retrieve a CRAN upstream config for this repository.
    api_response = api_instance.repos_upstream_cran_read(owner, identifier, slug_perm)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_cran_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_cran_update**
> CranUpstream repos_upstream_cran_update(owner, identifier, slug_perm, data=data)

Update a CRAN upstream config for this repository.

Update a CRAN upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.CranUpstreamRequest() # CranUpstreamRequest |  (optional)

try:
    # Update a CRAN upstream config for this repository.
    api_response = api_instance.repos_upstream_cran_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_cran_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**CranUpstreamRequest**](CranUpstreamRequest.md)|  | [optional] 

### Return type

[**CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_dart_create**
> DartUpstream repos_upstream_dart_create(owner, identifier, data=data)

Create a Dart upstream config for this repository.

Create a Dart upstream config for this repository.

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
data = cloudsmith_api.DartUpstreamRequest() # DartUpstreamRequest |  (optional)

try:
    # Create a Dart upstream config for this repository.
    api_response = api_instance.repos_upstream_dart_create(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_dart_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**DartUpstreamRequest**](DartUpstreamRequest.md)|  | [optional] 

### Return type

[**DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_dart_delete**
> repos_upstream_dart_delete(owner, identifier, slug_perm)

Delete a Dart upstream config for this repository.

Delete a Dart upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a Dart upstream config for this repository.
    api_instance.repos_upstream_dart_delete(owner, identifier, slug_perm)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_dart_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_dart_list**
> list[DartUpstream] repos_upstream_dart_list(owner, identifier, page=page, page_size=page_size)

List Dart upstream configs for this repository.

List Dart upstream configs for this repository.

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
    # List Dart upstream configs for this repository.
    api_response = api_instance.repos_upstream_dart_list(owner, identifier, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_dart_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[DartUpstream]**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_dart_partial_update**
> DartUpstream repos_upstream_dart_partial_update(owner, identifier, slug_perm, data=data)

Partially update a Dart upstream config for this repository.

Partially update a Dart upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.DartUpstreamRequestPatch() # DartUpstreamRequestPatch |  (optional)

try:
    # Partially update a Dart upstream config for this repository.
    api_response = api_instance.repos_upstream_dart_partial_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_dart_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**DartUpstreamRequestPatch**](DartUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_dart_read**
> DartUpstream repos_upstream_dart_read(owner, identifier, slug_perm)

Retrieve a Dart upstream config for this repository.

Retrieve a Dart upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Retrieve a Dart upstream config for this repository.
    api_response = api_instance.repos_upstream_dart_read(owner, identifier, slug_perm)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_dart_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_dart_update**
> DartUpstream repos_upstream_dart_update(owner, identifier, slug_perm, data=data)

Update a Dart upstream config for this repository.

Update a Dart upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.DartUpstreamRequest() # DartUpstreamRequest |  (optional)

try:
    # Update a Dart upstream config for this repository.
    api_response = api_instance.repos_upstream_dart_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_dart_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**DartUpstreamRequest**](DartUpstreamRequest.md)|  | [optional] 

### Return type

[**DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_deb_create**
> DebUpstream repos_upstream_deb_create(owner, identifier, data=data)

Create a Debian upstream config for this repository.

Create a Debian upstream config for this repository.

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
data = cloudsmith_api.DebUpstreamRequest() # DebUpstreamRequest |  (optional)

try:
    # Create a Debian upstream config for this repository.
    api_response = api_instance.repos_upstream_deb_create(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_deb_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**DebUpstreamRequest**](DebUpstreamRequest.md)|  | [optional] 

### Return type

[**DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_deb_delete**
> repos_upstream_deb_delete(owner, identifier, slug_perm)

Delete a Debian upstream config for this repository.

Delete a Debian upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a Debian upstream config for this repository.
    api_instance.repos_upstream_deb_delete(owner, identifier, slug_perm)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_deb_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_deb_list**
> list[DebUpstream] repos_upstream_deb_list(owner, identifier, page=page, page_size=page_size)

List Debian upstream configs for this repository.

List Debian upstream configs for this repository.

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
    # List Debian upstream configs for this repository.
    api_response = api_instance.repos_upstream_deb_list(owner, identifier, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_deb_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[DebUpstream]**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_deb_partial_update**
> DebUpstream repos_upstream_deb_partial_update(owner, identifier, slug_perm, data=data)

Partially update a Debian upstream config for this repository.

Partially update a Debian upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.DebUpstreamRequestPatch() # DebUpstreamRequestPatch |  (optional)

try:
    # Partially update a Debian upstream config for this repository.
    api_response = api_instance.repos_upstream_deb_partial_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_deb_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**DebUpstreamRequestPatch**](DebUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_deb_read**
> DebUpstream repos_upstream_deb_read(owner, identifier, slug_perm)

Retrieve a Debian upstream config for this repository.

Retrieve a Debian upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Retrieve a Debian upstream config for this repository.
    api_response = api_instance.repos_upstream_deb_read(owner, identifier, slug_perm)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_deb_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_deb_update**
> DebUpstream repos_upstream_deb_update(owner, identifier, slug_perm, data=data)

Update a Debian upstream config for this repository.

Update a Debian upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.DebUpstreamRequest() # DebUpstreamRequest |  (optional)

try:
    # Update a Debian upstream config for this repository.
    api_response = api_instance.repos_upstream_deb_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_deb_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**DebUpstreamRequest**](DebUpstreamRequest.md)|  | [optional] 

### Return type

[**DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_docker_create**
> DockerUpstream repos_upstream_docker_create(owner, identifier, data=data)

Create a Docker upstream config for this repository.

Create a Docker upstream config for this repository.

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
data = cloudsmith_api.DockerUpstreamRequest() # DockerUpstreamRequest |  (optional)

try:
    # Create a Docker upstream config for this repository.
    api_response = api_instance.repos_upstream_docker_create(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_docker_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**DockerUpstreamRequest**](DockerUpstreamRequest.md)|  | [optional] 

### Return type

[**DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_docker_delete**
> repos_upstream_docker_delete(owner, identifier, slug_perm)

Delete a Docker upstream config for this repository.

Delete a Docker upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a Docker upstream config for this repository.
    api_instance.repos_upstream_docker_delete(owner, identifier, slug_perm)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_docker_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_docker_list**
> list[DockerUpstream] repos_upstream_docker_list(owner, identifier, page=page, page_size=page_size)

List Docker upstream configs for this repository.

List Docker upstream configs for this repository.

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
    # List Docker upstream configs for this repository.
    api_response = api_instance.repos_upstream_docker_list(owner, identifier, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_docker_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[DockerUpstream]**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_docker_partial_update**
> DockerUpstream repos_upstream_docker_partial_update(owner, identifier, slug_perm, data=data)

Partially update a Docker upstream config for this repository.

Partially update a Docker upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.DockerUpstreamRequestPatch() # DockerUpstreamRequestPatch |  (optional)

try:
    # Partially update a Docker upstream config for this repository.
    api_response = api_instance.repos_upstream_docker_partial_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_docker_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**DockerUpstreamRequestPatch**](DockerUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_docker_read**
> DockerUpstream repos_upstream_docker_read(owner, identifier, slug_perm)

Retrieve a Docker upstream config for this repository.

Retrieve a Docker upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Retrieve a Docker upstream config for this repository.
    api_response = api_instance.repos_upstream_docker_read(owner, identifier, slug_perm)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_docker_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_docker_update**
> DockerUpstream repos_upstream_docker_update(owner, identifier, slug_perm, data=data)

Update a Docker upstream config for this repository.

Update a Docker upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.DockerUpstreamRequest() # DockerUpstreamRequest |  (optional)

try:
    # Update a Docker upstream config for this repository.
    api_response = api_instance.repos_upstream_docker_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_docker_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**DockerUpstreamRequest**](DockerUpstreamRequest.md)|  | [optional] 

### Return type

[**DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_helm_create**
> HelmUpstream repos_upstream_helm_create(owner, identifier, data=data)

Create a Helm upstream config for this repository.

Create a Helm upstream config for this repository.

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
data = cloudsmith_api.HelmUpstreamRequest() # HelmUpstreamRequest |  (optional)

try:
    # Create a Helm upstream config for this repository.
    api_response = api_instance.repos_upstream_helm_create(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_helm_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**HelmUpstreamRequest**](HelmUpstreamRequest.md)|  | [optional] 

### Return type

[**HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_helm_delete**
> repos_upstream_helm_delete(owner, identifier, slug_perm)

Delete a Helm upstream config for this repository.

Delete a Helm upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a Helm upstream config for this repository.
    api_instance.repos_upstream_helm_delete(owner, identifier, slug_perm)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_helm_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_helm_list**
> list[HelmUpstream] repos_upstream_helm_list(owner, identifier, page=page, page_size=page_size)

List Helm upstream configs for this repository.

List Helm upstream configs for this repository.

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
    # List Helm upstream configs for this repository.
    api_response = api_instance.repos_upstream_helm_list(owner, identifier, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_helm_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[HelmUpstream]**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_helm_partial_update**
> HelmUpstream repos_upstream_helm_partial_update(owner, identifier, slug_perm, data=data)

Partially update a Helm upstream config for this repository.

Partially update a Helm upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.HelmUpstreamRequestPatch() # HelmUpstreamRequestPatch |  (optional)

try:
    # Partially update a Helm upstream config for this repository.
    api_response = api_instance.repos_upstream_helm_partial_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_helm_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**HelmUpstreamRequestPatch**](HelmUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_helm_read**
> HelmUpstream repos_upstream_helm_read(owner, identifier, slug_perm)

Retrieve a Helm upstream config for this repository.

Retrieve a Helm upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Retrieve a Helm upstream config for this repository.
    api_response = api_instance.repos_upstream_helm_read(owner, identifier, slug_perm)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_helm_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_helm_update**
> HelmUpstream repos_upstream_helm_update(owner, identifier, slug_perm, data=data)

Update a Helm upstream config for this repository.

Update a Helm upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.HelmUpstreamRequest() # HelmUpstreamRequest |  (optional)

try:
    # Update a Helm upstream config for this repository.
    api_response = api_instance.repos_upstream_helm_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_helm_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**HelmUpstreamRequest**](HelmUpstreamRequest.md)|  | [optional] 

### Return type

[**HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_maven_create**
> MavenUpstream repos_upstream_maven_create(owner, identifier, data=data)

Create a Maven upstream config for this repository.

Create a Maven upstream config for this repository.

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
data = cloudsmith_api.MavenUpstreamRequest() # MavenUpstreamRequest |  (optional)

try:
    # Create a Maven upstream config for this repository.
    api_response = api_instance.repos_upstream_maven_create(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_maven_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**MavenUpstreamRequest**](MavenUpstreamRequest.md)|  | [optional] 

### Return type

[**MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_maven_delete**
> repos_upstream_maven_delete(owner, identifier, slug_perm)

Delete a Maven upstream config for this repository.

Delete a Maven upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a Maven upstream config for this repository.
    api_instance.repos_upstream_maven_delete(owner, identifier, slug_perm)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_maven_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_maven_list**
> list[MavenUpstream] repos_upstream_maven_list(owner, identifier, page=page, page_size=page_size)

List Maven upstream configs for this repository.

List Maven upstream configs for this repository.

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
    # List Maven upstream configs for this repository.
    api_response = api_instance.repos_upstream_maven_list(owner, identifier, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_maven_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[MavenUpstream]**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_maven_partial_update**
> MavenUpstream repos_upstream_maven_partial_update(owner, identifier, slug_perm, data=data)

Partially update a Maven upstream config for this repository.

Partially update a Maven upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.MavenUpstreamRequestPatch() # MavenUpstreamRequestPatch |  (optional)

try:
    # Partially update a Maven upstream config for this repository.
    api_response = api_instance.repos_upstream_maven_partial_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_maven_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**MavenUpstreamRequestPatch**](MavenUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_maven_read**
> MavenUpstream repos_upstream_maven_read(owner, identifier, slug_perm)

Retrieve a Maven upstream config for this repository.

Retrieve a Maven upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Retrieve a Maven upstream config for this repository.
    api_response = api_instance.repos_upstream_maven_read(owner, identifier, slug_perm)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_maven_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_maven_update**
> MavenUpstream repos_upstream_maven_update(owner, identifier, slug_perm, data=data)

Update a Maven upstream config for this repository.

Update a Maven upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.MavenUpstreamRequest() # MavenUpstreamRequest |  (optional)

try:
    # Update a Maven upstream config for this repository.
    api_response = api_instance.repos_upstream_maven_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_maven_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**MavenUpstreamRequest**](MavenUpstreamRequest.md)|  | [optional] 

### Return type

[**MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_npm_create**
> NpmUpstream repos_upstream_npm_create(owner, identifier, data=data)

Create a npm upstream config for this repository.

Create a npm upstream config for this repository.

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
data = cloudsmith_api.NpmUpstreamRequest() # NpmUpstreamRequest |  (optional)

try:
    # Create a npm upstream config for this repository.
    api_response = api_instance.repos_upstream_npm_create(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_npm_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**NpmUpstreamRequest**](NpmUpstreamRequest.md)|  | [optional] 

### Return type

[**NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_npm_delete**
> repos_upstream_npm_delete(owner, identifier, slug_perm)

Delete a npm upstream config for this repository.

Delete a npm upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a npm upstream config for this repository.
    api_instance.repos_upstream_npm_delete(owner, identifier, slug_perm)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_npm_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_npm_list**
> list[NpmUpstream] repos_upstream_npm_list(owner, identifier, page=page, page_size=page_size)

List npm upstream configs for this repository.

List npm upstream configs for this repository.

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
    # List npm upstream configs for this repository.
    api_response = api_instance.repos_upstream_npm_list(owner, identifier, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_npm_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[NpmUpstream]**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_npm_partial_update**
> NpmUpstream repos_upstream_npm_partial_update(owner, identifier, slug_perm, data=data)

Partially update a npm upstream config for this repository.

Partially update a npm upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.NpmUpstreamRequestPatch() # NpmUpstreamRequestPatch |  (optional)

try:
    # Partially update a npm upstream config for this repository.
    api_response = api_instance.repos_upstream_npm_partial_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_npm_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**NpmUpstreamRequestPatch**](NpmUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_npm_read**
> NpmUpstream repos_upstream_npm_read(owner, identifier, slug_perm)

Retrieve a npm upstream config for this repository.

Retrieve a npm upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Retrieve a npm upstream config for this repository.
    api_response = api_instance.repos_upstream_npm_read(owner, identifier, slug_perm)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_npm_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_npm_update**
> NpmUpstream repos_upstream_npm_update(owner, identifier, slug_perm, data=data)

Update a npm upstream config for this repository.

Update a npm upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.NpmUpstreamRequest() # NpmUpstreamRequest |  (optional)

try:
    # Update a npm upstream config for this repository.
    api_response = api_instance.repos_upstream_npm_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_npm_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**NpmUpstreamRequest**](NpmUpstreamRequest.md)|  | [optional] 

### Return type

[**NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_nuget_create**
> NugetUpstream repos_upstream_nuget_create(owner, identifier, data=data)

Create a NuGet upstream config for this repository.

Create a NuGet upstream config for this repository.

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
data = cloudsmith_api.NugetUpstreamRequest() # NugetUpstreamRequest |  (optional)

try:
    # Create a NuGet upstream config for this repository.
    api_response = api_instance.repos_upstream_nuget_create(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_nuget_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**NugetUpstreamRequest**](NugetUpstreamRequest.md)|  | [optional] 

### Return type

[**NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_nuget_delete**
> repos_upstream_nuget_delete(owner, identifier, slug_perm)

Delete a NuGet upstream config for this repository.

Delete a NuGet upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a NuGet upstream config for this repository.
    api_instance.repos_upstream_nuget_delete(owner, identifier, slug_perm)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_nuget_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_nuget_list**
> list[NugetUpstream] repos_upstream_nuget_list(owner, identifier, page=page, page_size=page_size)

List NuGet upstream configs for this repository.

List NuGet upstream configs for this repository.

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
    # List NuGet upstream configs for this repository.
    api_response = api_instance.repos_upstream_nuget_list(owner, identifier, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_nuget_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[NugetUpstream]**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_nuget_partial_update**
> NugetUpstream repos_upstream_nuget_partial_update(owner, identifier, slug_perm, data=data)

Partially update a NuGet upstream config for this repository.

Partially update a NuGet upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.NugetUpstreamRequestPatch() # NugetUpstreamRequestPatch |  (optional)

try:
    # Partially update a NuGet upstream config for this repository.
    api_response = api_instance.repos_upstream_nuget_partial_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_nuget_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**NugetUpstreamRequestPatch**](NugetUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_nuget_read**
> NugetUpstream repos_upstream_nuget_read(owner, identifier, slug_perm)

Retrieve a NuGet upstream config for this repository.

Retrieve a NuGet upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Retrieve a NuGet upstream config for this repository.
    api_response = api_instance.repos_upstream_nuget_read(owner, identifier, slug_perm)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_nuget_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_nuget_update**
> NugetUpstream repos_upstream_nuget_update(owner, identifier, slug_perm, data=data)

Update a NuGet upstream config for this repository.

Update a NuGet upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.NugetUpstreamRequest() # NugetUpstreamRequest |  (optional)

try:
    # Update a NuGet upstream config for this repository.
    api_response = api_instance.repos_upstream_nuget_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_nuget_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**NugetUpstreamRequest**](NugetUpstreamRequest.md)|  | [optional] 

### Return type

[**NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_python_create**
> PythonUpstream repos_upstream_python_create(owner, identifier, data=data)

Create a Python upstream config for this repository.

Create a Python upstream config for this repository.

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
data = cloudsmith_api.PythonUpstreamRequest() # PythonUpstreamRequest |  (optional)

try:
    # Create a Python upstream config for this repository.
    api_response = api_instance.repos_upstream_python_create(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_python_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**PythonUpstreamRequest**](PythonUpstreamRequest.md)|  | [optional] 

### Return type

[**PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_python_delete**
> repos_upstream_python_delete(owner, identifier, slug_perm)

Delete a Python upstream config for this repository.

Delete a Python upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a Python upstream config for this repository.
    api_instance.repos_upstream_python_delete(owner, identifier, slug_perm)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_python_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_python_list**
> list[PythonUpstream] repos_upstream_python_list(owner, identifier, page=page, page_size=page_size)

List Python upstream configs for this repository.

List Python upstream configs for this repository.

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
    # List Python upstream configs for this repository.
    api_response = api_instance.repos_upstream_python_list(owner, identifier, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_python_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[PythonUpstream]**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_python_partial_update**
> PythonUpstream repos_upstream_python_partial_update(owner, identifier, slug_perm, data=data)

Partially update a Python upstream config for this repository.

Partially update a Python upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.PythonUpstreamRequestPatch() # PythonUpstreamRequestPatch |  (optional)

try:
    # Partially update a Python upstream config for this repository.
    api_response = api_instance.repos_upstream_python_partial_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_python_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**PythonUpstreamRequestPatch**](PythonUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_python_read**
> PythonUpstream repos_upstream_python_read(owner, identifier, slug_perm)

Retrieve a Python upstream config for this repository.

Retrieve a Python upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Retrieve a Python upstream config for this repository.
    api_response = api_instance.repos_upstream_python_read(owner, identifier, slug_perm)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_python_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_python_update**
> PythonUpstream repos_upstream_python_update(owner, identifier, slug_perm, data=data)

Update a Python upstream config for this repository.

Update a Python upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.PythonUpstreamRequest() # PythonUpstreamRequest |  (optional)

try:
    # Update a Python upstream config for this repository.
    api_response = api_instance.repos_upstream_python_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_python_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**PythonUpstreamRequest**](PythonUpstreamRequest.md)|  | [optional] 

### Return type

[**PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_rpm_create**
> RpmUpstream repos_upstream_rpm_create(owner, identifier, data=data)

Create a RedHat upstream config for this repository.

Create a RedHat upstream config for this repository.

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
data = cloudsmith_api.RpmUpstreamRequest() # RpmUpstreamRequest |  (optional)

try:
    # Create a RedHat upstream config for this repository.
    api_response = api_instance.repos_upstream_rpm_create(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_rpm_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**RpmUpstreamRequest**](RpmUpstreamRequest.md)|  | [optional] 

### Return type

[**RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_rpm_delete**
> repos_upstream_rpm_delete(owner, identifier, slug_perm)

Delete a RedHat upstream config for this repository.

Delete a RedHat upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a RedHat upstream config for this repository.
    api_instance.repos_upstream_rpm_delete(owner, identifier, slug_perm)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_rpm_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_rpm_list**
> list[RpmUpstream] repos_upstream_rpm_list(owner, identifier, page=page, page_size=page_size)

List RedHat upstream configs for this repository.

List RedHat upstream configs for this repository.

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
    # List RedHat upstream configs for this repository.
    api_response = api_instance.repos_upstream_rpm_list(owner, identifier, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_rpm_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[RpmUpstream]**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_rpm_partial_update**
> RpmUpstream repos_upstream_rpm_partial_update(owner, identifier, slug_perm, data=data)

Partially update a RedHat upstream config for this repository.

Partially update a RedHat upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.RpmUpstreamRequestPatch() # RpmUpstreamRequestPatch |  (optional)

try:
    # Partially update a RedHat upstream config for this repository.
    api_response = api_instance.repos_upstream_rpm_partial_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_rpm_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**RpmUpstreamRequestPatch**](RpmUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_rpm_read**
> RpmUpstream repos_upstream_rpm_read(owner, identifier, slug_perm)

Retrieve a RedHat upstream config for this repository.

Retrieve a RedHat upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Retrieve a RedHat upstream config for this repository.
    api_response = api_instance.repos_upstream_rpm_read(owner, identifier, slug_perm)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_rpm_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_rpm_update**
> RpmUpstream repos_upstream_rpm_update(owner, identifier, slug_perm, data=data)

Update a RedHat upstream config for this repository.

Update a RedHat upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.RpmUpstreamRequest() # RpmUpstreamRequest |  (optional)

try:
    # Update a RedHat upstream config for this repository.
    api_response = api_instance.repos_upstream_rpm_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_rpm_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**RpmUpstreamRequest**](RpmUpstreamRequest.md)|  | [optional] 

### Return type

[**RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_ruby_create**
> RubyUpstream repos_upstream_ruby_create(owner, identifier, data=data)

Create a Ruby upstream config for this repository.

Create a Ruby upstream config for this repository.

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
data = cloudsmith_api.RubyUpstreamRequest() # RubyUpstreamRequest |  (optional)

try:
    # Create a Ruby upstream config for this repository.
    api_response = api_instance.repos_upstream_ruby_create(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_ruby_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**RubyUpstreamRequest**](RubyUpstreamRequest.md)|  | [optional] 

### Return type

[**RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_ruby_delete**
> repos_upstream_ruby_delete(owner, identifier, slug_perm)

Delete a Ruby upstream config for this repository.

Delete a Ruby upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a Ruby upstream config for this repository.
    api_instance.repos_upstream_ruby_delete(owner, identifier, slug_perm)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_ruby_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_ruby_list**
> list[RubyUpstream] repos_upstream_ruby_list(owner, identifier, page=page, page_size=page_size)

List Ruby upstream configs for this repository.

List Ruby upstream configs for this repository.

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
    # List Ruby upstream configs for this repository.
    api_response = api_instance.repos_upstream_ruby_list(owner, identifier, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_ruby_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[RubyUpstream]**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_ruby_partial_update**
> RubyUpstream repos_upstream_ruby_partial_update(owner, identifier, slug_perm, data=data)

Partially update a Ruby upstream config for this repository.

Partially update a Ruby upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.RubyUpstreamRequestPatch() # RubyUpstreamRequestPatch |  (optional)

try:
    # Partially update a Ruby upstream config for this repository.
    api_response = api_instance.repos_upstream_ruby_partial_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_ruby_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**RubyUpstreamRequestPatch**](RubyUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_ruby_read**
> RubyUpstream repos_upstream_ruby_read(owner, identifier, slug_perm)

Retrieve a Ruby upstream config for this repository.

Retrieve a Ruby upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Retrieve a Ruby upstream config for this repository.
    api_response = api_instance.repos_upstream_ruby_read(owner, identifier, slug_perm)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_ruby_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_ruby_update**
> RubyUpstream repos_upstream_ruby_update(owner, identifier, slug_perm, data=data)

Update a Ruby upstream config for this repository.

Update a Ruby upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.RubyUpstreamRequest() # RubyUpstreamRequest |  (optional)

try:
    # Update a Ruby upstream config for this repository.
    api_response = api_instance.repos_upstream_ruby_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_ruby_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**RubyUpstreamRequest**](RubyUpstreamRequest.md)|  | [optional] 

### Return type

[**RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_swift_create**
> SwiftUpstream repos_upstream_swift_create(owner, identifier, data=data)

Create a Swift upstream config for this repository.

Create a Swift upstream config for this repository.

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
data = cloudsmith_api.SwiftUpstreamRequest() # SwiftUpstreamRequest |  (optional)

try:
    # Create a Swift upstream config for this repository.
    api_response = api_instance.repos_upstream_swift_create(owner, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_swift_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**SwiftUpstreamRequest**](SwiftUpstreamRequest.md)|  | [optional] 

### Return type

[**SwiftUpstream**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_swift_delete**
> repos_upstream_swift_delete(owner, identifier, slug_perm)

Delete a Swift upstream config for this repository.

Delete a Swift upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Delete a Swift upstream config for this repository.
    api_instance.repos_upstream_swift_delete(owner, identifier, slug_perm)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_swift_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_swift_list**
> list[SwiftUpstream] repos_upstream_swift_list(owner, identifier, page=page, page_size=page_size)

List Swift upstream configs for this repository.

List Swift upstream configs for this repository.

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
    # List Swift upstream configs for this repository.
    api_response = api_instance.repos_upstream_swift_list(owner, identifier, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_swift_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 

### Return type

[**list[SwiftUpstream]**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_swift_partial_update**
> SwiftUpstream repos_upstream_swift_partial_update(owner, identifier, slug_perm, data=data)

Partially update a Swift upstream config for this repository.

Partially update a Swift upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.SwiftUpstreamRequestPatch() # SwiftUpstreamRequestPatch |  (optional)

try:
    # Partially update a Swift upstream config for this repository.
    api_response = api_instance.repos_upstream_swift_partial_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_swift_partial_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**SwiftUpstreamRequestPatch**](SwiftUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**SwiftUpstream**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_swift_read**
> SwiftUpstream repos_upstream_swift_read(owner, identifier, slug_perm)

Retrieve a Swift upstream config for this repository.

Retrieve a Swift upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 

try:
    # Retrieve a Swift upstream config for this repository.
    api_response = api_instance.repos_upstream_swift_read(owner, identifier, slug_perm)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_swift_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 

### Return type

[**SwiftUpstream**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_swift_update**
> SwiftUpstream repos_upstream_swift_update(owner, identifier, slug_perm, data=data)

Update a Swift upstream config for this repository.

Update a Swift upstream config for this repository.

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
slug_perm = 'slug_perm_example' # str | 
data = cloudsmith_api.SwiftUpstreamRequest() # SwiftUpstreamRequest |  (optional)

try:
    # Update a Swift upstream config for this repository.
    api_response = api_instance.repos_upstream_swift_update(owner, identifier, slug_perm, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReposApi->repos_upstream_swift_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **identifier** | **str**|  | 
 **slug_perm** | **str**|  | 
 **data** | [**SwiftUpstreamRequest**](SwiftUpstreamRequest.md)|  | [optional] 

### Return type

[**SwiftUpstream**](SwiftUpstream.md)

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

