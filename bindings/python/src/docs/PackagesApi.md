# cloudsmith_api.PackagesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**packages_copy**](PackagesApi.md#packages_copy) | **POST** /packages/{owner}/{repo}/{identifier}/copy/ | Copy a package to another repository.
[**packages_delete**](PackagesApi.md#packages_delete) | **DELETE** /packages/{owner}/{repo}/{identifier}/ | Delete a specific package in a repository.
[**packages_list**](PackagesApi.md#packages_list) | **GET** /packages/{owner}/{repo}/ | Get a list of all packages associated with repository.
[**packages_move**](PackagesApi.md#packages_move) | **POST** /packages/{owner}/{repo}/{identifier}/move/ | Move a package to another repository.
[**packages_read**](PackagesApi.md#packages_read) | **GET** /packages/{owner}/{repo}/{identifier}/ | Get a specific package in a repository.
[**packages_resync**](PackagesApi.md#packages_resync) | **POST** /packages/{owner}/{repo}/{identifier}/resync/ | Schedule a package for resynchronisation.
[**packages_status**](PackagesApi.md#packages_status) | **GET** /packages/{owner}/{repo}/{identifier}/status/ | Get the synchronisation status for a package.
[**packages_upload_alpine**](PackagesApi.md#packages_upload_alpine) | **POST** /packages/{owner}/{repo}/upload/alpine/ | Create a new Alpine package
[**packages_upload_cargo**](PackagesApi.md#packages_upload_cargo) | **POST** /packages/{owner}/{repo}/upload/cargo/ | Create a new Cargo package
[**packages_upload_composer**](PackagesApi.md#packages_upload_composer) | **POST** /packages/{owner}/{repo}/upload/composer/ | Create a new Composer package
[**packages_upload_cran**](PackagesApi.md#packages_upload_cran) | **POST** /packages/{owner}/{repo}/upload/cran/ | Create a new CRAN package
[**packages_upload_deb**](PackagesApi.md#packages_upload_deb) | **POST** /packages/{owner}/{repo}/upload/deb/ | Create a new Debian package
[**packages_upload_docker**](PackagesApi.md#packages_upload_docker) | **POST** /packages/{owner}/{repo}/upload/docker/ | Create a new Docker package
[**packages_upload_go**](PackagesApi.md#packages_upload_go) | **POST** /packages/{owner}/{repo}/upload/go/ | Create a new Go package
[**packages_upload_helm**](PackagesApi.md#packages_upload_helm) | **POST** /packages/{owner}/{repo}/upload/helm/ | Create a new Helm package
[**packages_upload_luarocks**](PackagesApi.md#packages_upload_luarocks) | **POST** /packages/{owner}/{repo}/upload/luarocks/ | Create a new LuaRocks package
[**packages_upload_maven**](PackagesApi.md#packages_upload_maven) | **POST** /packages/{owner}/{repo}/upload/maven/ | Create a new Maven package
[**packages_upload_npm**](PackagesApi.md#packages_upload_npm) | **POST** /packages/{owner}/{repo}/upload/npm/ | Create a new npm package
[**packages_upload_nuget**](PackagesApi.md#packages_upload_nuget) | **POST** /packages/{owner}/{repo}/upload/nuget/ | Create a new NuGet package
[**packages_upload_python**](PackagesApi.md#packages_upload_python) | **POST** /packages/{owner}/{repo}/upload/python/ | Create a new Python package
[**packages_upload_raw**](PackagesApi.md#packages_upload_raw) | **POST** /packages/{owner}/{repo}/upload/raw/ | Create a new Raw package
[**packages_upload_rpm**](PackagesApi.md#packages_upload_rpm) | **POST** /packages/{owner}/{repo}/upload/rpm/ | Create a new RedHat package
[**packages_upload_ruby**](PackagesApi.md#packages_upload_ruby) | **POST** /packages/{owner}/{repo}/upload/ruby/ | Create a new Ruby package
[**packages_upload_vagrant**](PackagesApi.md#packages_upload_vagrant) | **POST** /packages/{owner}/{repo}/upload/vagrant/ | Create a new Vagrant package
[**packages_validate_upload_alpine**](PackagesApi.md#packages_validate_upload_alpine) | **POST** /packages/{owner}/{repo}/validate-upload/alpine/ | Validate parameters for create Alpine package
[**packages_validate_upload_cargo**](PackagesApi.md#packages_validate_upload_cargo) | **POST** /packages/{owner}/{repo}/validate-upload/cargo/ | Validate parameters for create Cargo package
[**packages_validate_upload_composer**](PackagesApi.md#packages_validate_upload_composer) | **POST** /packages/{owner}/{repo}/validate-upload/composer/ | Validate parameters for create Composer package
[**packages_validate_upload_cran**](PackagesApi.md#packages_validate_upload_cran) | **POST** /packages/{owner}/{repo}/validate-upload/cran/ | Validate parameters for create CRAN package
[**packages_validate_upload_deb**](PackagesApi.md#packages_validate_upload_deb) | **POST** /packages/{owner}/{repo}/validate-upload/deb/ | Validate parameters for create Debian package
[**packages_validate_upload_docker**](PackagesApi.md#packages_validate_upload_docker) | **POST** /packages/{owner}/{repo}/validate-upload/docker/ | Validate parameters for create Docker package
[**packages_validate_upload_go**](PackagesApi.md#packages_validate_upload_go) | **POST** /packages/{owner}/{repo}/validate-upload/go/ | Validate parameters for create Go package
[**packages_validate_upload_helm**](PackagesApi.md#packages_validate_upload_helm) | **POST** /packages/{owner}/{repo}/validate-upload/helm/ | Validate parameters for create Helm package
[**packages_validate_upload_luarocks**](PackagesApi.md#packages_validate_upload_luarocks) | **POST** /packages/{owner}/{repo}/validate-upload/luarocks/ | Validate parameters for create LuaRocks package
[**packages_validate_upload_maven**](PackagesApi.md#packages_validate_upload_maven) | **POST** /packages/{owner}/{repo}/validate-upload/maven/ | Validate parameters for create Maven package
[**packages_validate_upload_npm**](PackagesApi.md#packages_validate_upload_npm) | **POST** /packages/{owner}/{repo}/validate-upload/npm/ | Validate parameters for create npm package
[**packages_validate_upload_nuget**](PackagesApi.md#packages_validate_upload_nuget) | **POST** /packages/{owner}/{repo}/validate-upload/nuget/ | Validate parameters for create NuGet package
[**packages_validate_upload_python**](PackagesApi.md#packages_validate_upload_python) | **POST** /packages/{owner}/{repo}/validate-upload/python/ | Validate parameters for create Python package
[**packages_validate_upload_raw**](PackagesApi.md#packages_validate_upload_raw) | **POST** /packages/{owner}/{repo}/validate-upload/raw/ | Validate parameters for create Raw package
[**packages_validate_upload_rpm**](PackagesApi.md#packages_validate_upload_rpm) | **POST** /packages/{owner}/{repo}/validate-upload/rpm/ | Validate parameters for create RedHat package
[**packages_validate_upload_ruby**](PackagesApi.md#packages_validate_upload_ruby) | **POST** /packages/{owner}/{repo}/validate-upload/ruby/ | Validate parameters for create Ruby package
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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
identifier = 'identifier_example' # str | 
data = cloudsmith_api.PackagesCopy() # PackagesCopy |  (optional)

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
 **data** | [**PackagesCopy**](PackagesCopy.md)|  | [optional] 

### Return type

[**PackageCopy**](PackageCopy.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
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

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_list**
> list[Package] packages_list(owner, repo, page=page, page_size=page_size, query=query)

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
page = 56 # int | A page number within the paginated result set. (optional)
page_size = 56 # int | Number of results to return per page. (optional)
query = 'query_example' # str | A search term for querying names, filenames, versions, distributions, architectures, formats or statuses of packages. (optional)

try: 
    # Get a list of all packages associated with repository.
    api_response = api_instance.packages_list(owner, repo, page=page, page_size=page_size, query=query)
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
 **query** | **str**| A search term for querying names, filenames, versions, distributions, architectures, formats or statuses of packages. | [optional] 

### Return type

[**list[Package]**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
identifier = 'identifier_example' # str | 
data = cloudsmith_api.PackagesMove() # PackagesMove |  (optional)

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
 **data** | [**PackagesMove**](PackagesMove.md)|  | [optional] 

### Return type

[**PackageMove**](PackageMove.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
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

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_resync**
> Package packages_resync(owner, repo, identifier, data=data)

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
identifier = 'identifier_example' # str | 
data = cloudsmith_api.PackagesResync() # PackagesResync |  (optional)

try: 
    # Schedule a package for resynchronisation.
    api_response = api_instance.packages_resync(owner, repo, identifier, data=data)
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
 **data** | [**PackagesResync**](PackagesResync.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
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

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_alpine**
> Package packages_upload_alpine(owner, repo, data=data)

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesUploadAlpine() # PackagesUploadAlpine |  (optional)

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
 **data** | [**PackagesUploadAlpine**](PackagesUploadAlpine.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_cargo**
> Package packages_upload_cargo(owner, repo, data=data)

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesUploadCargo() # PackagesUploadCargo |  (optional)

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
 **data** | [**PackagesUploadCargo**](PackagesUploadCargo.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_composer**
> Package packages_upload_composer(owner, repo, data=data)

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesUploadComposer() # PackagesUploadComposer |  (optional)

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
 **data** | [**PackagesUploadComposer**](PackagesUploadComposer.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_cran**
> Package packages_upload_cran(owner, repo, data=data)

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesUploadCran() # PackagesUploadCran |  (optional)

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
 **data** | [**PackagesUploadCran**](PackagesUploadCran.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_deb**
> Package packages_upload_deb(owner, repo, data=data)

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesUploadDeb() # PackagesUploadDeb |  (optional)

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
 **data** | [**PackagesUploadDeb**](PackagesUploadDeb.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_docker**
> Package packages_upload_docker(owner, repo, data=data)

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesUploadDocker() # PackagesUploadDocker |  (optional)

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
 **data** | [**PackagesUploadDocker**](PackagesUploadDocker.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_go**
> Package packages_upload_go(owner, repo, data=data)

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesUploadGo() # PackagesUploadGo |  (optional)

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
 **data** | [**PackagesUploadGo**](PackagesUploadGo.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_helm**
> Package packages_upload_helm(owner, repo, data=data)

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesUploadHelm() # PackagesUploadHelm |  (optional)

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
 **data** | [**PackagesUploadHelm**](PackagesUploadHelm.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_luarocks**
> Package packages_upload_luarocks(owner, repo, data=data)

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesUploadLuarocks() # PackagesUploadLuarocks |  (optional)

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
 **data** | [**PackagesUploadLuarocks**](PackagesUploadLuarocks.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesUploadMaven() # PackagesUploadMaven |  (optional)

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
 **data** | [**PackagesUploadMaven**](PackagesUploadMaven.md)|  | [optional] 

### Return type

[**MavenPackageUpload**](MavenPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_npm**
> Package packages_upload_npm(owner, repo, data=data)

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesUploadNpm() # PackagesUploadNpm |  (optional)

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
 **data** | [**PackagesUploadNpm**](PackagesUploadNpm.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_nuget**
> Package packages_upload_nuget(owner, repo, data=data)

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesUploadNuget() # PackagesUploadNuget |  (optional)

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
 **data** | [**PackagesUploadNuget**](PackagesUploadNuget.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_python**
> Package packages_upload_python(owner, repo, data=data)

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesUploadPython() # PackagesUploadPython |  (optional)

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
 **data** | [**PackagesUploadPython**](PackagesUploadPython.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesUploadRaw() # PackagesUploadRaw |  (optional)

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
 **data** | [**PackagesUploadRaw**](PackagesUploadRaw.md)|  | [optional] 

### Return type

[**RawPackageUpload**](RawPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_rpm**
> Package packages_upload_rpm(owner, repo, data=data)

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesUploadRpm() # PackagesUploadRpm |  (optional)

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
 **data** | [**PackagesUploadRpm**](PackagesUploadRpm.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_ruby**
> Package packages_upload_ruby(owner, repo, data=data)

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesUploadRuby() # PackagesUploadRuby |  (optional)

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
 **data** | [**PackagesUploadRuby**](PackagesUploadRuby.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesUploadVagrant() # PackagesUploadVagrant |  (optional)

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
 **data** | [**PackagesUploadVagrant**](PackagesUploadVagrant.md)|  | [optional] 

### Return type

[**VagrantPackageUpload**](VagrantPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesValidateuploadAlpine() # PackagesValidateuploadAlpine |  (optional)

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
 **data** | [**PackagesValidateuploadAlpine**](PackagesValidateuploadAlpine.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesValidateuploadCargo() # PackagesValidateuploadCargo |  (optional)

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
 **data** | [**PackagesValidateuploadCargo**](PackagesValidateuploadCargo.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesValidateuploadComposer() # PackagesValidateuploadComposer |  (optional)

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
 **data** | [**PackagesValidateuploadComposer**](PackagesValidateuploadComposer.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesValidateuploadCran() # PackagesValidateuploadCran |  (optional)

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
 **data** | [**PackagesValidateuploadCran**](PackagesValidateuploadCran.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesValidateuploadDeb() # PackagesValidateuploadDeb |  (optional)

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
 **data** | [**PackagesValidateuploadDeb**](PackagesValidateuploadDeb.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesValidateuploadDocker() # PackagesValidateuploadDocker |  (optional)

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
 **data** | [**PackagesValidateuploadDocker**](PackagesValidateuploadDocker.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesValidateuploadGo() # PackagesValidateuploadGo |  (optional)

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
 **data** | [**PackagesValidateuploadGo**](PackagesValidateuploadGo.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesValidateuploadHelm() # PackagesValidateuploadHelm |  (optional)

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
 **data** | [**PackagesValidateuploadHelm**](PackagesValidateuploadHelm.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesValidateuploadLuarocks() # PackagesValidateuploadLuarocks |  (optional)

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
 **data** | [**PackagesValidateuploadLuarocks**](PackagesValidateuploadLuarocks.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesValidateuploadMaven() # PackagesValidateuploadMaven |  (optional)

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
 **data** | [**PackagesValidateuploadMaven**](PackagesValidateuploadMaven.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesValidateuploadNpm() # PackagesValidateuploadNpm |  (optional)

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
 **data** | [**PackagesValidateuploadNpm**](PackagesValidateuploadNpm.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesValidateuploadNuget() # PackagesValidateuploadNuget |  (optional)

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
 **data** | [**PackagesValidateuploadNuget**](PackagesValidateuploadNuget.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesValidateuploadPython() # PackagesValidateuploadPython |  (optional)

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
 **data** | [**PackagesValidateuploadPython**](PackagesValidateuploadPython.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesValidateuploadRaw() # PackagesValidateuploadRaw |  (optional)

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
 **data** | [**PackagesValidateuploadRaw**](PackagesValidateuploadRaw.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesValidateuploadRpm() # PackagesValidateuploadRpm |  (optional)

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
 **data** | [**PackagesValidateuploadRpm**](PackagesValidateuploadRpm.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesValidateuploadRuby() # PackagesValidateuploadRuby |  (optional)

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
 **data** | [**PackagesValidateuploadRuby**](PackagesValidateuploadRuby.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# Configure API key authorization: csrf_token
cloudsmith_api.configuration.api_key['X-CSRFToken'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-CSRFToken'] = 'Bearer'

# create an instance of the API class
api_instance = cloudsmith_api.PackagesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
data = cloudsmith_api.PackagesValidateuploadVagrant() # PackagesValidateuploadVagrant |  (optional)

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
 **data** | [**PackagesValidateuploadVagrant**](PackagesValidateuploadVagrant.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

