# cloudsmith_api.PackagesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**packages_copy**](PackagesApi.md#packages_copy) | **POST** /packages/{owner}/{repo}/{identifier}/copy/ | Copy a package to another repository.
[**packages_delete**](PackagesApi.md#packages_delete) | **DELETE** /packages/{owner}/{repo}/{identifier}/ | Delete a specific package in a repository.
[**packages_dependencies**](PackagesApi.md#packages_dependencies) | **GET** /packages/{owner}/{repo}/{identifier}/dependencies/ | Get the list of dependencies for a package. Transitive dependencies are included where supported.
[**packages_list**](PackagesApi.md#packages_list) | **GET** /packages/{owner}/{repo}/ | Get a list of all packages associated with repository.
[**packages_move**](PackagesApi.md#packages_move) | **POST** /packages/{owner}/{repo}/{identifier}/move/ | Move a package to another repository.
[**packages_quarantine**](PackagesApi.md#packages_quarantine) | **POST** /packages/{owner}/{repo}/{identifier}/quarantine/ | Quarantine or restore a package.
[**packages_read**](PackagesApi.md#packages_read) | **GET** /packages/{owner}/{repo}/{identifier}/ | Get a specific package in a repository.
[**packages_resync**](PackagesApi.md#packages_resync) | **POST** /packages/{owner}/{repo}/{identifier}/resync/ | Schedule a package for resynchronisation.
[**packages_scan**](PackagesApi.md#packages_scan) | **POST** /packages/{owner}/{repo}/{identifier}/scan/ | Schedule a package for scanning.
[**packages_status**](PackagesApi.md#packages_status) | **GET** /packages/{owner}/{repo}/{identifier}/status/ | Get the synchronisation status for a package.
[**packages_tag**](PackagesApi.md#packages_tag) | **POST** /packages/{owner}/{repo}/{identifier}/tag/ | Add/Replace/Remove tags for a package.
[**packages_upload_alpine**](PackagesApi.md#packages_upload_alpine) | **POST** /packages/{owner}/{repo}/upload/alpine/ | Create a new Alpine package
[**packages_upload_cargo**](PackagesApi.md#packages_upload_cargo) | **POST** /packages/{owner}/{repo}/upload/cargo/ | Create a new Cargo package
[**packages_upload_cocoapods**](PackagesApi.md#packages_upload_cocoapods) | **POST** /packages/{owner}/{repo}/upload/cocoapods/ | Create a new CocoaPods package
[**packages_upload_composer**](PackagesApi.md#packages_upload_composer) | **POST** /packages/{owner}/{repo}/upload/composer/ | Create a new Composer package
[**packages_upload_conan**](PackagesApi.md#packages_upload_conan) | **POST** /packages/{owner}/{repo}/upload/conan/ | Create a new Conan package
[**packages_upload_conda**](PackagesApi.md#packages_upload_conda) | **POST** /packages/{owner}/{repo}/upload/conda/ | Create a new Conda package
[**packages_upload_cran**](PackagesApi.md#packages_upload_cran) | **POST** /packages/{owner}/{repo}/upload/cran/ | Create a new CRAN package
[**packages_upload_dart**](PackagesApi.md#packages_upload_dart) | **POST** /packages/{owner}/{repo}/upload/dart/ | Create a new Dart package
[**packages_upload_deb**](PackagesApi.md#packages_upload_deb) | **POST** /packages/{owner}/{repo}/upload/deb/ | Create a new Debian package
[**packages_upload_docker**](PackagesApi.md#packages_upload_docker) | **POST** /packages/{owner}/{repo}/upload/docker/ | Create a new Docker package
[**packages_upload_go**](PackagesApi.md#packages_upload_go) | **POST** /packages/{owner}/{repo}/upload/go/ | Create a new Go package
[**packages_upload_helm**](PackagesApi.md#packages_upload_helm) | **POST** /packages/{owner}/{repo}/upload/helm/ | Create a new Helm package
[**packages_upload_luarocks**](PackagesApi.md#packages_upload_luarocks) | **POST** /packages/{owner}/{repo}/upload/luarocks/ | Create a new LuaRocks package
[**packages_upload_maven**](PackagesApi.md#packages_upload_maven) | **POST** /packages/{owner}/{repo}/upload/maven/ | Create a new Maven package
[**packages_upload_npm**](PackagesApi.md#packages_upload_npm) | **POST** /packages/{owner}/{repo}/upload/npm/ | Create a new npm package
[**packages_upload_nuget**](PackagesApi.md#packages_upload_nuget) | **POST** /packages/{owner}/{repo}/upload/nuget/ | Create a new NuGet package
[**packages_upload_p2**](PackagesApi.md#packages_upload_p2) | **POST** /packages/{owner}/{repo}/upload/p2/ | Create a new P2 package
[**packages_upload_python**](PackagesApi.md#packages_upload_python) | **POST** /packages/{owner}/{repo}/upload/python/ | Create a new Python package
[**packages_upload_raw**](PackagesApi.md#packages_upload_raw) | **POST** /packages/{owner}/{repo}/upload/raw/ | Create a new Raw package
[**packages_upload_rpm**](PackagesApi.md#packages_upload_rpm) | **POST** /packages/{owner}/{repo}/upload/rpm/ | Create a new RedHat package
[**packages_upload_ruby**](PackagesApi.md#packages_upload_ruby) | **POST** /packages/{owner}/{repo}/upload/ruby/ | Create a new Ruby package
[**packages_upload_terraform**](PackagesApi.md#packages_upload_terraform) | **POST** /packages/{owner}/{repo}/upload/terraform/ | Create a new Terraform package
[**packages_upload_vagrant**](PackagesApi.md#packages_upload_vagrant) | **POST** /packages/{owner}/{repo}/upload/vagrant/ | Create a new Vagrant package
[**packages_validate_upload_alpine**](PackagesApi.md#packages_validate_upload_alpine) | **POST** /packages/{owner}/{repo}/validate-upload/alpine/ | Validate parameters for create Alpine package
[**packages_validate_upload_cargo**](PackagesApi.md#packages_validate_upload_cargo) | **POST** /packages/{owner}/{repo}/validate-upload/cargo/ | Validate parameters for create Cargo package
[**packages_validate_upload_cocoapods**](PackagesApi.md#packages_validate_upload_cocoapods) | **POST** /packages/{owner}/{repo}/validate-upload/cocoapods/ | Validate parameters for create CocoaPods package
[**packages_validate_upload_composer**](PackagesApi.md#packages_validate_upload_composer) | **POST** /packages/{owner}/{repo}/validate-upload/composer/ | Validate parameters for create Composer package
[**packages_validate_upload_conan**](PackagesApi.md#packages_validate_upload_conan) | **POST** /packages/{owner}/{repo}/validate-upload/conan/ | Validate parameters for create Conan package
[**packages_validate_upload_conda**](PackagesApi.md#packages_validate_upload_conda) | **POST** /packages/{owner}/{repo}/validate-upload/conda/ | Validate parameters for create Conda package
[**packages_validate_upload_cran**](PackagesApi.md#packages_validate_upload_cran) | **POST** /packages/{owner}/{repo}/validate-upload/cran/ | Validate parameters for create CRAN package
[**packages_validate_upload_dart**](PackagesApi.md#packages_validate_upload_dart) | **POST** /packages/{owner}/{repo}/validate-upload/dart/ | Validate parameters for create Dart package
[**packages_validate_upload_deb**](PackagesApi.md#packages_validate_upload_deb) | **POST** /packages/{owner}/{repo}/validate-upload/deb/ | Validate parameters for create Debian package
[**packages_validate_upload_docker**](PackagesApi.md#packages_validate_upload_docker) | **POST** /packages/{owner}/{repo}/validate-upload/docker/ | Validate parameters for create Docker package
[**packages_validate_upload_go**](PackagesApi.md#packages_validate_upload_go) | **POST** /packages/{owner}/{repo}/validate-upload/go/ | Validate parameters for create Go package
[**packages_validate_upload_helm**](PackagesApi.md#packages_validate_upload_helm) | **POST** /packages/{owner}/{repo}/validate-upload/helm/ | Validate parameters for create Helm package
[**packages_validate_upload_luarocks**](PackagesApi.md#packages_validate_upload_luarocks) | **POST** /packages/{owner}/{repo}/validate-upload/luarocks/ | Validate parameters for create LuaRocks package
[**packages_validate_upload_maven**](PackagesApi.md#packages_validate_upload_maven) | **POST** /packages/{owner}/{repo}/validate-upload/maven/ | Validate parameters for create Maven package
[**packages_validate_upload_npm**](PackagesApi.md#packages_validate_upload_npm) | **POST** /packages/{owner}/{repo}/validate-upload/npm/ | Validate parameters for create npm package
[**packages_validate_upload_nuget**](PackagesApi.md#packages_validate_upload_nuget) | **POST** /packages/{owner}/{repo}/validate-upload/nuget/ | Validate parameters for create NuGet package
[**packages_validate_upload_p2**](PackagesApi.md#packages_validate_upload_p2) | **POST** /packages/{owner}/{repo}/validate-upload/p2/ | Validate parameters for create P2 package
[**packages_validate_upload_python**](PackagesApi.md#packages_validate_upload_python) | **POST** /packages/{owner}/{repo}/validate-upload/python/ | Validate parameters for create Python package
[**packages_validate_upload_raw**](PackagesApi.md#packages_validate_upload_raw) | **POST** /packages/{owner}/{repo}/validate-upload/raw/ | Validate parameters for create Raw package
[**packages_validate_upload_rpm**](PackagesApi.md#packages_validate_upload_rpm) | **POST** /packages/{owner}/{repo}/validate-upload/rpm/ | Validate parameters for create RedHat package
[**packages_validate_upload_ruby**](PackagesApi.md#packages_validate_upload_ruby) | **POST** /packages/{owner}/{repo}/validate-upload/ruby/ | Validate parameters for create Ruby package
[**packages_validate_upload_terraform**](PackagesApi.md#packages_validate_upload_terraform) | **POST** /packages/{owner}/{repo}/validate-upload/terraform/ | Validate parameters for create Terraform package
[**packages_validate_upload_vagrant**](PackagesApi.md#packages_validate_upload_vagrant) | **POST** /packages/{owner}/{repo}/validate-upload/vagrant/ | Validate parameters for create Vagrant package


# **packages_copy**
> PackageCopy packages_copy(owner, repo, identifier, data=data)

Copy a package to another repository.

Copy a package to another repository.

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
identifier = 'identifier_example' # str | 
data = cloudsmith_api.PackageCopyRequest() # PackageCopyRequest |  (optional)

try:
    # Copy a package to another repository.
    api_response = api_instance.packages_copy(owner, repo, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_copy: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**PackageCopyRequest**](PackageCopyRequest.md)|  | [optional] 

### Return type

[**PackageCopy**](PackageCopy.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_delete**
> packages_delete(owner, repo, identifier)

Delete a specific package in a repository.

Delete a specific package in a repository.

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
identifier = 'identifier_example' # str | 

try:
    # Delete a specific package in a repository.
    api_instance.packages_delete(owner, repo, identifier)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_dependencies**
> PackageDependencies packages_dependencies(owner, repo, identifier)

Get the list of dependencies for a package. Transitive dependencies are included where supported.

Get the list of dependencies for a package. Transitive dependencies are included where supported.

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
identifier = 'identifier_example' # str | 

try:
    # Get the list of dependencies for a package. Transitive dependencies are included where supported.
    api_response = api_instance.packages_dependencies(owner, repo, identifier)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_dependencies: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 

### Return type

[**PackageDependencies**](PackageDependencies.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_list**
> list[Package] packages_list(owner, repo, page=page, page_size=page_size, query=query, sort=sort)

Get a list of all packages associated with repository.

Get a list of all packages associated with repository.

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)
query = '' # str | A search term for querying names, filenames, versions, distributions, architectures, formats or statuses of packages. (optional) (default to )
sort = '-date' # str | A field for sorting objects in ascending or descending order. (optional) (default to -date)

try:
    # Get a list of all packages associated with repository.
    api_response = api_instance.packages_list(owner, repo, page=page, page_size=page_size, query=query, sort=sort)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **query** | **str**| A search term for querying names, filenames, versions, distributions, architectures, formats or statuses of packages. | [optional] [default to ]
 **sort** | **str**| A field for sorting objects in ascending or descending order. | [optional] [default to -date]

### Return type

[**list[Package]**](Package.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_move**
> PackageMove packages_move(owner, repo, identifier, data=data)

Move a package to another repository.

Move a package to another repository.

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
identifier = 'identifier_example' # str | 
data = cloudsmith_api.PackageMoveRequest() # PackageMoveRequest |  (optional)

try:
    # Move a package to another repository.
    api_response = api_instance.packages_move(owner, repo, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_move: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**PackageMoveRequest**](PackageMoveRequest.md)|  | [optional] 

### Return type

[**PackageMove**](PackageMove.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_quarantine**
> PackageQuarantine packages_quarantine(owner, repo, identifier, data=data)

Quarantine or restore a package.

Quarantine or restore a package.

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
identifier = 'identifier_example' # str | 
data = cloudsmith_api.PackageQuarantineRequest() # PackageQuarantineRequest |  (optional)

try:
    # Quarantine or restore a package.
    api_response = api_instance.packages_quarantine(owner, repo, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_quarantine: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**PackageQuarantineRequest**](PackageQuarantineRequest.md)|  | [optional] 

### Return type

[**PackageQuarantine**](PackageQuarantine.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_read**
> Package packages_read(owner, repo, identifier)

Get a specific package in a repository.

Get a specific package in a repository.

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
identifier = 'identifier_example' # str | 

try:
    # Get a specific package in a repository.
    api_response = api_instance.packages_read(owner, repo, identifier)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_read: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_resync**
> PackageResync packages_resync(owner, repo, identifier)

Schedule a package for resynchronisation.

Schedule a package for resynchronisation.

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
identifier = 'identifier_example' # str | 

try:
    # Schedule a package for resynchronisation.
    api_response = api_instance.packages_resync(owner, repo, identifier)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_resync: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 

### Return type

[**PackageResync**](PackageResync.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_scan**
> Package packages_scan(owner, repo, identifier)

Schedule a package for scanning.

Schedule a package for scanning.

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
identifier = 'identifier_example' # str | 

try:
    # Schedule a package for scanning.
    api_response = api_instance.packages_scan(owner, repo, identifier)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_scan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_status**
> PackageStatus packages_status(owner, repo, identifier)

Get the synchronisation status for a package.

Get the synchronisation status for a package.

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
identifier = 'identifier_example' # str | 

try:
    # Get the synchronisation status for a package.
    api_response = api_instance.packages_status(owner, repo, identifier)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 

### Return type

[**PackageStatus**](PackageStatus.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_tag**
> Package packages_tag(owner, repo, identifier, data=data)

Add/Replace/Remove tags for a package.

Add/Replace/Remove tags for a package.

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
identifier = 'identifier_example' # str | 
data = cloudsmith_api.PackageTagRequest() # PackageTagRequest |  (optional)

try:
    # Add/Replace/Remove tags for a package.
    api_response = api_instance.packages_tag(owner, repo, identifier, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_tag: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**PackageTagRequest**](PackageTagRequest.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_alpine**
> AlpinePackageUpload packages_upload_alpine(owner, repo, data=data)

Create a new Alpine package

Create a new Alpine package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.AlpinePackageUploadRequest() # AlpinePackageUploadRequest |  (optional)

try:
    # Create a new Alpine package
    api_response = api_instance.packages_upload_alpine(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_alpine: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**AlpinePackageUploadRequest**](AlpinePackageUploadRequest.md)|  | [optional] 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_cargo**
> CargoPackageUpload packages_upload_cargo(owner, repo, data=data)

Create a new Cargo package

Create a new Cargo package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.CargoPackageUploadRequest() # CargoPackageUploadRequest |  (optional)

try:
    # Create a new Cargo package
    api_response = api_instance.packages_upload_cargo(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_cargo: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**CargoPackageUploadRequest**](CargoPackageUploadRequest.md)|  | [optional] 

### Return type

[**CargoPackageUpload**](CargoPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_cocoapods**
> CocoapodsPackageUpload packages_upload_cocoapods(owner, repo, data=data)

Create a new CocoaPods package

Create a new CocoaPods package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.CocoapodsPackageUploadRequest() # CocoapodsPackageUploadRequest |  (optional)

try:
    # Create a new CocoaPods package
    api_response = api_instance.packages_upload_cocoapods(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_cocoapods: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**CocoapodsPackageUploadRequest**](CocoapodsPackageUploadRequest.md)|  | [optional] 

### Return type

[**CocoapodsPackageUpload**](CocoapodsPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_composer**
> ComposerPackageUpload packages_upload_composer(owner, repo, data=data)

Create a new Composer package

Create a new Composer package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.ComposerPackageUploadRequest() # ComposerPackageUploadRequest |  (optional)

try:
    # Create a new Composer package
    api_response = api_instance.packages_upload_composer(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_composer: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**ComposerPackageUploadRequest**](ComposerPackageUploadRequest.md)|  | [optional] 

### Return type

[**ComposerPackageUpload**](ComposerPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_conan**
> ConanPackageUpload packages_upload_conan(owner, repo, data=data)

Create a new Conan package

Create a new Conan package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.ConanPackageUploadRequest() # ConanPackageUploadRequest |  (optional)

try:
    # Create a new Conan package
    api_response = api_instance.packages_upload_conan(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_conan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**ConanPackageUploadRequest**](ConanPackageUploadRequest.md)|  | [optional] 

### Return type

[**ConanPackageUpload**](ConanPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_conda**
> CondaPackageUpload packages_upload_conda(owner, repo, data=data)

Create a new Conda package

Create a new Conda package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.CondaPackageUploadRequest() # CondaPackageUploadRequest |  (optional)

try:
    # Create a new Conda package
    api_response = api_instance.packages_upload_conda(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_conda: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**CondaPackageUploadRequest**](CondaPackageUploadRequest.md)|  | [optional] 

### Return type

[**CondaPackageUpload**](CondaPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_cran**
> CranPackageUpload packages_upload_cran(owner, repo, data=data)

Create a new CRAN package

Create a new CRAN package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.CranPackageUploadRequest() # CranPackageUploadRequest |  (optional)

try:
    # Create a new CRAN package
    api_response = api_instance.packages_upload_cran(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_cran: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**CranPackageUploadRequest**](CranPackageUploadRequest.md)|  | [optional] 

### Return type

[**CranPackageUpload**](CranPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_dart**
> DartPackageUpload packages_upload_dart(owner, repo, data=data)

Create a new Dart package

Create a new Dart package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.DartPackageUploadRequest() # DartPackageUploadRequest |  (optional)

try:
    # Create a new Dart package
    api_response = api_instance.packages_upload_dart(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_dart: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**DartPackageUploadRequest**](DartPackageUploadRequest.md)|  | [optional] 

### Return type

[**DartPackageUpload**](DartPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_deb**
> DebPackageUpload packages_upload_deb(owner, repo, data=data)

Create a new Debian package

Create a new Debian package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.DebPackageUploadRequest() # DebPackageUploadRequest |  (optional)

try:
    # Create a new Debian package
    api_response = api_instance.packages_upload_deb(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_deb: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**DebPackageUploadRequest**](DebPackageUploadRequest.md)|  | [optional] 

### Return type

[**DebPackageUpload**](DebPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_docker**
> DockerPackageUpload packages_upload_docker(owner, repo, data=data)

Create a new Docker package

Create a new Docker package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.DockerPackageUploadRequest() # DockerPackageUploadRequest |  (optional)

try:
    # Create a new Docker package
    api_response = api_instance.packages_upload_docker(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_docker: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**DockerPackageUploadRequest**](DockerPackageUploadRequest.md)|  | [optional] 

### Return type

[**DockerPackageUpload**](DockerPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_go**
> GoPackageUpload packages_upload_go(owner, repo, data=data)

Create a new Go package

Create a new Go package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.GoPackageUploadRequest() # GoPackageUploadRequest |  (optional)

try:
    # Create a new Go package
    api_response = api_instance.packages_upload_go(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_go: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**GoPackageUploadRequest**](GoPackageUploadRequest.md)|  | [optional] 

### Return type

[**GoPackageUpload**](GoPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_helm**
> HelmPackageUpload packages_upload_helm(owner, repo, data=data)

Create a new Helm package

Create a new Helm package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.HelmPackageUploadRequest() # HelmPackageUploadRequest |  (optional)

try:
    # Create a new Helm package
    api_response = api_instance.packages_upload_helm(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_helm: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**HelmPackageUploadRequest**](HelmPackageUploadRequest.md)|  | [optional] 

### Return type

[**HelmPackageUpload**](HelmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_luarocks**
> LuarocksPackageUpload packages_upload_luarocks(owner, repo, data=data)

Create a new LuaRocks package

Create a new LuaRocks package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.LuarocksPackageUploadRequest() # LuarocksPackageUploadRequest |  (optional)

try:
    # Create a new LuaRocks package
    api_response = api_instance.packages_upload_luarocks(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_luarocks: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**LuarocksPackageUploadRequest**](LuarocksPackageUploadRequest.md)|  | [optional] 

### Return type

[**LuarocksPackageUpload**](LuarocksPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_maven**
> MavenPackageUpload packages_upload_maven(owner, repo, data=data)

Create a new Maven package

Create a new Maven package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.MavenPackageUploadRequest() # MavenPackageUploadRequest |  (optional)

try:
    # Create a new Maven package
    api_response = api_instance.packages_upload_maven(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_maven: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**MavenPackageUploadRequest**](MavenPackageUploadRequest.md)|  | [optional] 

### Return type

[**MavenPackageUpload**](MavenPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_npm**
> NpmPackageUpload packages_upload_npm(owner, repo, data=data)

Create a new npm package

Create a new npm package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.NpmPackageUploadRequest() # NpmPackageUploadRequest |  (optional)

try:
    # Create a new npm package
    api_response = api_instance.packages_upload_npm(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_npm: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**NpmPackageUploadRequest**](NpmPackageUploadRequest.md)|  | [optional] 

### Return type

[**NpmPackageUpload**](NpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_nuget**
> NugetPackageUpload packages_upload_nuget(owner, repo, data=data)

Create a new NuGet package

Create a new NuGet package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.NugetPackageUploadRequest() # NugetPackageUploadRequest |  (optional)

try:
    # Create a new NuGet package
    api_response = api_instance.packages_upload_nuget(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_nuget: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**NugetPackageUploadRequest**](NugetPackageUploadRequest.md)|  | [optional] 

### Return type

[**NugetPackageUpload**](NugetPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_p2**
> P2PackageUpload packages_upload_p2(owner, repo, data=data)

Create a new P2 package

Create a new P2 package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.P2PackageUploadRequest() # P2PackageUploadRequest |  (optional)

try:
    # Create a new P2 package
    api_response = api_instance.packages_upload_p2(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_p2: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**P2PackageUploadRequest**](P2PackageUploadRequest.md)|  | [optional] 

### Return type

[**P2PackageUpload**](P2PackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_python**
> PythonPackageUpload packages_upload_python(owner, repo, data=data)

Create a new Python package

Create a new Python package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PythonPackageUploadRequest() # PythonPackageUploadRequest |  (optional)

try:
    # Create a new Python package
    api_response = api_instance.packages_upload_python(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_python: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**PythonPackageUploadRequest**](PythonPackageUploadRequest.md)|  | [optional] 

### Return type

[**PythonPackageUpload**](PythonPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_raw**
> RawPackageUpload packages_upload_raw(owner, repo, data=data)

Create a new Raw package

Create a new Raw package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.RawPackageUploadRequest() # RawPackageUploadRequest |  (optional)

try:
    # Create a new Raw package
    api_response = api_instance.packages_upload_raw(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_raw: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**RawPackageUploadRequest**](RawPackageUploadRequest.md)|  | [optional] 

### Return type

[**RawPackageUpload**](RawPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_rpm**
> RpmPackageUpload packages_upload_rpm(owner, repo, data=data)

Create a new RedHat package

Create a new RedHat package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.RpmPackageUploadRequest() # RpmPackageUploadRequest |  (optional)

try:
    # Create a new RedHat package
    api_response = api_instance.packages_upload_rpm(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_rpm: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**RpmPackageUploadRequest**](RpmPackageUploadRequest.md)|  | [optional] 

### Return type

[**RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_ruby**
> RubyPackageUpload packages_upload_ruby(owner, repo, data=data)

Create a new Ruby package

Create a new Ruby package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.RubyPackageUploadRequest() # RubyPackageUploadRequest |  (optional)

try:
    # Create a new Ruby package
    api_response = api_instance.packages_upload_ruby(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_ruby: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**RubyPackageUploadRequest**](RubyPackageUploadRequest.md)|  | [optional] 

### Return type

[**RubyPackageUpload**](RubyPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_terraform**
> TerraformPackageUpload packages_upload_terraform(owner, repo, data=data)

Create a new Terraform package

Create a new Terraform package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.TerraformPackageUploadRequest() # TerraformPackageUploadRequest |  (optional)

try:
    # Create a new Terraform package
    api_response = api_instance.packages_upload_terraform(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_terraform: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**TerraformPackageUploadRequest**](TerraformPackageUploadRequest.md)|  | [optional] 

### Return type

[**TerraformPackageUpload**](TerraformPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_vagrant**
> VagrantPackageUpload packages_upload_vagrant(owner, repo, data=data)

Create a new Vagrant package

Create a new Vagrant package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.VagrantPackageUploadRequest() # VagrantPackageUploadRequest |  (optional)

try:
    # Create a new Vagrant package
    api_response = api_instance.packages_upload_vagrant(owner, repo, data=data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_upload_vagrant: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**VagrantPackageUploadRequest**](VagrantPackageUploadRequest.md)|  | [optional] 

### Return type

[**VagrantPackageUpload**](VagrantPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_alpine**
> packages_validate_upload_alpine(owner, repo, data=data)

Validate parameters for create Alpine package

Validate parameters for create Alpine package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.AlpinePackageUploadRequest() # AlpinePackageUploadRequest |  (optional)

try:
    # Validate parameters for create Alpine package
    api_instance.packages_validate_upload_alpine(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_alpine: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**AlpinePackageUploadRequest**](AlpinePackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_cargo**
> packages_validate_upload_cargo(owner, repo, data=data)

Validate parameters for create Cargo package

Validate parameters for create Cargo package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.CargoPackageUploadRequest() # CargoPackageUploadRequest |  (optional)

try:
    # Validate parameters for create Cargo package
    api_instance.packages_validate_upload_cargo(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_cargo: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**CargoPackageUploadRequest**](CargoPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_cocoapods**
> packages_validate_upload_cocoapods(owner, repo, data=data)

Validate parameters for create CocoaPods package

Validate parameters for create CocoaPods package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.CocoapodsPackageUploadRequest() # CocoapodsPackageUploadRequest |  (optional)

try:
    # Validate parameters for create CocoaPods package
    api_instance.packages_validate_upload_cocoapods(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_cocoapods: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**CocoapodsPackageUploadRequest**](CocoapodsPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_composer**
> packages_validate_upload_composer(owner, repo, data=data)

Validate parameters for create Composer package

Validate parameters for create Composer package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.ComposerPackageUploadRequest() # ComposerPackageUploadRequest |  (optional)

try:
    # Validate parameters for create Composer package
    api_instance.packages_validate_upload_composer(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_composer: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**ComposerPackageUploadRequest**](ComposerPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_conan**
> packages_validate_upload_conan(owner, repo, data=data)

Validate parameters for create Conan package

Validate parameters for create Conan package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.ConanPackageUploadRequest() # ConanPackageUploadRequest |  (optional)

try:
    # Validate parameters for create Conan package
    api_instance.packages_validate_upload_conan(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_conan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**ConanPackageUploadRequest**](ConanPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_conda**
> packages_validate_upload_conda(owner, repo, data=data)

Validate parameters for create Conda package

Validate parameters for create Conda package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.CondaPackageUploadRequest() # CondaPackageUploadRequest |  (optional)

try:
    # Validate parameters for create Conda package
    api_instance.packages_validate_upload_conda(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_conda: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**CondaPackageUploadRequest**](CondaPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_cran**
> packages_validate_upload_cran(owner, repo, data=data)

Validate parameters for create CRAN package

Validate parameters for create CRAN package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.CranPackageUploadRequest() # CranPackageUploadRequest |  (optional)

try:
    # Validate parameters for create CRAN package
    api_instance.packages_validate_upload_cran(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_cran: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**CranPackageUploadRequest**](CranPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_dart**
> packages_validate_upload_dart(owner, repo, data=data)

Validate parameters for create Dart package

Validate parameters for create Dart package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.DartPackageUploadRequest() # DartPackageUploadRequest |  (optional)

try:
    # Validate parameters for create Dart package
    api_instance.packages_validate_upload_dart(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_dart: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**DartPackageUploadRequest**](DartPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_deb**
> packages_validate_upload_deb(owner, repo, data=data)

Validate parameters for create Debian package

Validate parameters for create Debian package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.DebPackageUploadRequest() # DebPackageUploadRequest |  (optional)

try:
    # Validate parameters for create Debian package
    api_instance.packages_validate_upload_deb(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_deb: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**DebPackageUploadRequest**](DebPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_docker**
> packages_validate_upload_docker(owner, repo, data=data)

Validate parameters for create Docker package

Validate parameters for create Docker package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.DockerPackageUploadRequest() # DockerPackageUploadRequest |  (optional)

try:
    # Validate parameters for create Docker package
    api_instance.packages_validate_upload_docker(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_docker: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**DockerPackageUploadRequest**](DockerPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_go**
> packages_validate_upload_go(owner, repo, data=data)

Validate parameters for create Go package

Validate parameters for create Go package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.GoPackageUploadRequest() # GoPackageUploadRequest |  (optional)

try:
    # Validate parameters for create Go package
    api_instance.packages_validate_upload_go(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_go: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**GoPackageUploadRequest**](GoPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_helm**
> packages_validate_upload_helm(owner, repo, data=data)

Validate parameters for create Helm package

Validate parameters for create Helm package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.HelmPackageUploadRequest() # HelmPackageUploadRequest |  (optional)

try:
    # Validate parameters for create Helm package
    api_instance.packages_validate_upload_helm(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_helm: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**HelmPackageUploadRequest**](HelmPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_luarocks**
> packages_validate_upload_luarocks(owner, repo, data=data)

Validate parameters for create LuaRocks package

Validate parameters for create LuaRocks package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.LuarocksPackageUploadRequest() # LuarocksPackageUploadRequest |  (optional)

try:
    # Validate parameters for create LuaRocks package
    api_instance.packages_validate_upload_luarocks(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_luarocks: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**LuarocksPackageUploadRequest**](LuarocksPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_maven**
> packages_validate_upload_maven(owner, repo, data=data)

Validate parameters for create Maven package

Validate parameters for create Maven package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.MavenPackageUploadRequest() # MavenPackageUploadRequest |  (optional)

try:
    # Validate parameters for create Maven package
    api_instance.packages_validate_upload_maven(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_maven: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**MavenPackageUploadRequest**](MavenPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_npm**
> packages_validate_upload_npm(owner, repo, data=data)

Validate parameters for create npm package

Validate parameters for create npm package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.NpmPackageUploadRequest() # NpmPackageUploadRequest |  (optional)

try:
    # Validate parameters for create npm package
    api_instance.packages_validate_upload_npm(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_npm: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**NpmPackageUploadRequest**](NpmPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_nuget**
> packages_validate_upload_nuget(owner, repo, data=data)

Validate parameters for create NuGet package

Validate parameters for create NuGet package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.NugetPackageUploadRequest() # NugetPackageUploadRequest |  (optional)

try:
    # Validate parameters for create NuGet package
    api_instance.packages_validate_upload_nuget(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_nuget: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**NugetPackageUploadRequest**](NugetPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_p2**
> packages_validate_upload_p2(owner, repo, data=data)

Validate parameters for create P2 package

Validate parameters for create P2 package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.P2PackageUploadRequest() # P2PackageUploadRequest |  (optional)

try:
    # Validate parameters for create P2 package
    api_instance.packages_validate_upload_p2(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_p2: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**P2PackageUploadRequest**](P2PackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_python**
> packages_validate_upload_python(owner, repo, data=data)

Validate parameters for create Python package

Validate parameters for create Python package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PythonPackageUploadRequest() # PythonPackageUploadRequest |  (optional)

try:
    # Validate parameters for create Python package
    api_instance.packages_validate_upload_python(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_python: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**PythonPackageUploadRequest**](PythonPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_raw**
> packages_validate_upload_raw(owner, repo, data=data)

Validate parameters for create Raw package

Validate parameters for create Raw package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.RawPackageUploadRequest() # RawPackageUploadRequest |  (optional)

try:
    # Validate parameters for create Raw package
    api_instance.packages_validate_upload_raw(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_raw: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**RawPackageUploadRequest**](RawPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_rpm**
> packages_validate_upload_rpm(owner, repo, data=data)

Validate parameters for create RedHat package

Validate parameters for create RedHat package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.RpmPackageUploadRequest() # RpmPackageUploadRequest |  (optional)

try:
    # Validate parameters for create RedHat package
    api_instance.packages_validate_upload_rpm(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_rpm: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**RpmPackageUploadRequest**](RpmPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_ruby**
> packages_validate_upload_ruby(owner, repo, data=data)

Validate parameters for create Ruby package

Validate parameters for create Ruby package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.RubyPackageUploadRequest() # RubyPackageUploadRequest |  (optional)

try:
    # Validate parameters for create Ruby package
    api_instance.packages_validate_upload_ruby(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_ruby: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**RubyPackageUploadRequest**](RubyPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_terraform**
> packages_validate_upload_terraform(owner, repo, data=data)

Validate parameters for create Terraform package

Validate parameters for create Terraform package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.TerraformPackageUploadRequest() # TerraformPackageUploadRequest |  (optional)

try:
    # Validate parameters for create Terraform package
    api_instance.packages_validate_upload_terraform(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_terraform: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**TerraformPackageUploadRequest**](TerraformPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_vagrant**
> packages_validate_upload_vagrant(owner, repo, data=data)

Validate parameters for create Vagrant package

Validate parameters for create Vagrant package

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
api_instance = cloudsmith_api.PackagesApi(cloudsmith_api.ApiClient(configuration))
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.VagrantPackageUploadRequest() # VagrantPackageUploadRequest |  (optional)

try:
    # Validate parameters for create Vagrant package
    api_instance.packages_validate_upload_vagrant(owner, repo, data=data)
except ApiException as e:
    print("Exception when calling PackagesApi->packages_validate_upload_vagrant: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**VagrantPackageUploadRequest**](VagrantPackageUploadRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

