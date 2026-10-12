# cloudsmith_api.PackagesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**packages_copy**](PackagesApi.md#packages_copy) | **POST** /packages/{owner}/{repo}/{identifier}/copy/ | Copy a package to another repository.
[**packages_delete**](PackagesApi.md#packages_delete) | **DELETE** /packages/{owner}/{repo}/{identifier}/ | Delete a specific package in a repository.
[**packages_dependencies**](PackagesApi.md#packages_dependencies) | **GET** /packages/{owner}/{repo}/{identifier}/dependencies/ | Get the list of dependencies for a package. Transitive dependencies are included where supported.
[**packages_groups_list**](PackagesApi.md#packages_groups_list) | **GET** /packages/{owner}/{repo}/groups/ | Return a list of Package Groups in a repository.
[**packages_list**](PackagesApi.md#packages_list) | **GET** /packages/{owner}/{repo}/ | Get a list of all packages associated with repository.
[**packages_move**](PackagesApi.md#packages_move) | **POST** /packages/{owner}/{repo}/{identifier}/move/ | Move a package to another repository.
[**packages_quarantine**](PackagesApi.md#packages_quarantine) | **POST** /packages/{owner}/{repo}/{identifier}/quarantine/ | Quarantine or release a package.
[**packages_read**](PackagesApi.md#packages_read) | **GET** /packages/{owner}/{repo}/{identifier}/ | Get a specific package in a repository.
[**packages_resync**](PackagesApi.md#packages_resync) | **POST** /packages/{owner}/{repo}/{identifier}/resync/ | Schedule a package for resynchronisation.
[**packages_scan**](PackagesApi.md#packages_scan) | **POST** /packages/{owner}/{repo}/{identifier}/scan/ | Schedule a package for scanning.
[**packages_status**](PackagesApi.md#packages_status) | **GET** /packages/{owner}/{repo}/{identifier}/status/ | Get the synchronization status for a package.
[**packages_tag**](PackagesApi.md#packages_tag) | **POST** /packages/{owner}/{repo}/{identifier}/tag/ | Add/Replace/Remove tags for a package.
[**packages_update_license**](PackagesApi.md#packages_update_license) | **PATCH** /packages/{owner}/{repo}/{identifier}/update-license/ | Update the license for a package.
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
[**packages_upload_generic**](PackagesApi.md#packages_upload_generic) | **POST** /packages/{owner}/{repo}/upload/generic/ | Create a new Generic package
[**packages_upload_go**](PackagesApi.md#packages_upload_go) | **POST** /packages/{owner}/{repo}/upload/go/ | Create a new Go package
[**packages_upload_helm**](PackagesApi.md#packages_upload_helm) | **POST** /packages/{owner}/{repo}/upload/helm/ | Create a new Helm package
[**packages_upload_hex**](PackagesApi.md#packages_upload_hex) | **POST** /packages/{owner}/{repo}/upload/hex/ | Create a new Hex package
[**packages_upload_huggingface**](PackagesApi.md#packages_upload_huggingface) | **POST** /packages/{owner}/{repo}/upload/huggingface/ | Create a new HuggingFace package
[**packages_upload_luarocks**](PackagesApi.md#packages_upload_luarocks) | **POST** /packages/{owner}/{repo}/upload/luarocks/ | Create a new LuaRocks package
[**packages_upload_maven**](PackagesApi.md#packages_upload_maven) | **POST** /packages/{owner}/{repo}/upload/maven/ | Create a new Maven package
[**packages_upload_mcp**](PackagesApi.md#packages_upload_mcp) | **POST** /packages/{owner}/{repo}/upload/mcp/ | Create a new MCP package
[**packages_upload_nix**](PackagesApi.md#packages_upload_nix) | **POST** /packages/{owner}/{repo}/upload/nix/ | Create a new Nix package
[**packages_upload_npm**](PackagesApi.md#packages_upload_npm) | **POST** /packages/{owner}/{repo}/upload/npm/ | Create a new npm package
[**packages_upload_nuget**](PackagesApi.md#packages_upload_nuget) | **POST** /packages/{owner}/{repo}/upload/nuget/ | Create a new NuGet package
[**packages_upload_p2**](PackagesApi.md#packages_upload_p2) | **POST** /packages/{owner}/{repo}/upload/p2/ | Create a new P2 package
[**packages_upload_python**](PackagesApi.md#packages_upload_python) | **POST** /packages/{owner}/{repo}/upload/python/ | Create a new Python package
[**packages_upload_raw**](PackagesApi.md#packages_upload_raw) | **POST** /packages/{owner}/{repo}/upload/raw/ | Create a new Raw package
[**packages_upload_rpm**](PackagesApi.md#packages_upload_rpm) | **POST** /packages/{owner}/{repo}/upload/rpm/ | Create a new RedHat package
[**packages_upload_ruby**](PackagesApi.md#packages_upload_ruby) | **POST** /packages/{owner}/{repo}/upload/ruby/ | Create a new Ruby package
[**packages_upload_skills**](PackagesApi.md#packages_upload_skills) | **POST** /packages/{owner}/{repo}/upload/skills/ | Create a new AI Skills package
[**packages_upload_swift**](PackagesApi.md#packages_upload_swift) | **POST** /packages/{owner}/{repo}/upload/swift/ | Create a new Swift package
[**packages_upload_terraform**](PackagesApi.md#packages_upload_terraform) | **POST** /packages/{owner}/{repo}/upload/terraform/ | Create a new Terraform package
[**packages_upload_vagrant**](PackagesApi.md#packages_upload_vagrant) | **POST** /packages/{owner}/{repo}/upload/vagrant/ | Create a new Vagrant package
[**packages_upload_vsx**](PackagesApi.md#packages_upload_vsx) | **POST** /packages/{owner}/{repo}/upload/vsx/ | Create a new VSX package
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
[**packages_validate_upload_generic**](PackagesApi.md#packages_validate_upload_generic) | **POST** /packages/{owner}/{repo}/validate-upload/generic/ | Validate parameters for create Generic package
[**packages_validate_upload_go**](PackagesApi.md#packages_validate_upload_go) | **POST** /packages/{owner}/{repo}/validate-upload/go/ | Validate parameters for create Go package
[**packages_validate_upload_helm**](PackagesApi.md#packages_validate_upload_helm) | **POST** /packages/{owner}/{repo}/validate-upload/helm/ | Validate parameters for create Helm package
[**packages_validate_upload_hex**](PackagesApi.md#packages_validate_upload_hex) | **POST** /packages/{owner}/{repo}/validate-upload/hex/ | Validate parameters for create Hex package
[**packages_validate_upload_huggingface**](PackagesApi.md#packages_validate_upload_huggingface) | **POST** /packages/{owner}/{repo}/validate-upload/huggingface/ | Validate parameters for create HuggingFace package
[**packages_validate_upload_luarocks**](PackagesApi.md#packages_validate_upload_luarocks) | **POST** /packages/{owner}/{repo}/validate-upload/luarocks/ | Validate parameters for create LuaRocks package
[**packages_validate_upload_maven**](PackagesApi.md#packages_validate_upload_maven) | **POST** /packages/{owner}/{repo}/validate-upload/maven/ | Validate parameters for create Maven package
[**packages_validate_upload_mcp**](PackagesApi.md#packages_validate_upload_mcp) | **POST** /packages/{owner}/{repo}/validate-upload/mcp/ | Validate parameters for create MCP package
[**packages_validate_upload_nix**](PackagesApi.md#packages_validate_upload_nix) | **POST** /packages/{owner}/{repo}/validate-upload/nix/ | Validate parameters for create Nix package
[**packages_validate_upload_npm**](PackagesApi.md#packages_validate_upload_npm) | **POST** /packages/{owner}/{repo}/validate-upload/npm/ | Validate parameters for create npm package
[**packages_validate_upload_nuget**](PackagesApi.md#packages_validate_upload_nuget) | **POST** /packages/{owner}/{repo}/validate-upload/nuget/ | Validate parameters for create NuGet package
[**packages_validate_upload_p2**](PackagesApi.md#packages_validate_upload_p2) | **POST** /packages/{owner}/{repo}/validate-upload/p2/ | Validate parameters for create P2 package
[**packages_validate_upload_python**](PackagesApi.md#packages_validate_upload_python) | **POST** /packages/{owner}/{repo}/validate-upload/python/ | Validate parameters for create Python package
[**packages_validate_upload_raw**](PackagesApi.md#packages_validate_upload_raw) | **POST** /packages/{owner}/{repo}/validate-upload/raw/ | Validate parameters for create Raw package
[**packages_validate_upload_rpm**](PackagesApi.md#packages_validate_upload_rpm) | **POST** /packages/{owner}/{repo}/validate-upload/rpm/ | Validate parameters for create RedHat package
[**packages_validate_upload_ruby**](PackagesApi.md#packages_validate_upload_ruby) | **POST** /packages/{owner}/{repo}/validate-upload/ruby/ | Validate parameters for create Ruby package
[**packages_validate_upload_skills**](PackagesApi.md#packages_validate_upload_skills) | **POST** /packages/{owner}/{repo}/validate-upload/skills/ | Validate parameters for create AI Skills package
[**packages_validate_upload_swift**](PackagesApi.md#packages_validate_upload_swift) | **POST** /packages/{owner}/{repo}/validate-upload/swift/ | Validate parameters for create Swift package
[**packages_validate_upload_terraform**](PackagesApi.md#packages_validate_upload_terraform) | **POST** /packages/{owner}/{repo}/validate-upload/terraform/ | Validate parameters for create Terraform package
[**packages_validate_upload_vagrant**](PackagesApi.md#packages_validate_upload_vagrant) | **POST** /packages/{owner}/{repo}/validate-upload/vagrant/ | Validate parameters for create Vagrant package
[**packages_validate_upload_vsx**](PackagesApi.md#packages_validate_upload_vsx) | **POST** /packages/{owner}/{repo}/validate-upload/vsx/ | Validate parameters for create VSX package


# **packages_copy**
> PackageCopy packages_copy(owner, repo, identifier, data=data)

Copy a package to another repository.

Copy a package to another repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_copy import PackageCopy
from cloudsmith_api.models.package_copy_request import PackageCopyRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 
    data = cloudsmith_api.PackageCopyRequest() # PackageCopyRequest |  (optional)

    try:
        # Copy a package to another repository.
        api_response = api_instance.packages_copy(owner, repo, identifier, data=data)
        print("The response of PackagesApi->packages_copy:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Copied specified package to destination repository. |  -  |
**400** | The package is in the wrong state for the requested operation. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_delete**
> packages_delete(owner, repo, identifier)

Delete a specific package in a repository.

Delete a specific package in a repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 

    try:
        # Delete a specific package in a repository.
        api_instance.packages_delete(owner, repo, identifier)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Deleted the specified package successfully. |  -  |
**400** | The package cannot be deleted. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_dependencies**
> PackageDependencies packages_dependencies(owner, repo, identifier, include_connected_repositories=include_connected_repositories)

Get the list of dependencies for a package. Transitive dependencies are included where supported.

Get the list of dependencies for a package. Transitive dependencies are included where supported.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_dependencies import PackageDependencies
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 
    include_connected_repositories = False # bool | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in. (optional) (default to False)

    try:
        # Get the list of dependencies for a package. Transitive dependencies are included where supported.
        api_response = api_instance.packages_dependencies(owner, repo, identifier, include_connected_repositories=include_connected_repositories)
        print("The response of PackagesApi->packages_dependencies:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_dependencies: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 
 **include_connected_repositories** | **bool**| If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in. | [optional] [default to False]

### Return type

[**PackageDependencies**](PackageDependencies.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved stored dependencies for specified package. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_groups_list**
> PackagesGroupsList200Response packages_groups_list(owner, repo, page=page, page_size=page_size, group_by=group_by, hide_subcomponents=hide_subcomponents, include_connected_repositories=include_connected_repositories, query=query, sort=sort)

Return a list of Package Groups in a repository.

Return a list of Package Groups in a repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.packages_groups_list200_response import PackagesGroupsList200Response
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)
    group_by = 'name' # str | A field to group packages by. Available options: name, backend_kind. (optional) (default to 'name')
    hide_subcomponents = False # bool | Whether to hide packages which are subcomponents of another package in the results (optional) (default to False)
    include_connected_repositories = False # bool | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. (optional) (default to False)
    query = 'query_example' # str | A search term for querying names, filenames, versions, distributions, architectures, formats, or statuses of packages. (optional)
    sort = 'name' # str | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name, count, num_downloads, size, last_push, backend_kind. (optional) (default to 'name')

    try:
        # Return a list of Package Groups in a repository.
        api_response = api_instance.packages_groups_list(owner, repo, page=page, page_size=page_size, group_by=group_by, hide_subcomponents=hide_subcomponents, include_connected_repositories=include_connected_repositories, query=query, sort=sort)
        print("The response of PackagesApi->packages_groups_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_groups_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **group_by** | **str**| A field to group packages by. Available options: name, backend_kind. | [optional] [default to &#39;name&#39;]
 **hide_subcomponents** | **bool**| Whether to hide packages which are subcomponents of another package in the results | [optional] [default to False]
 **include_connected_repositories** | **bool**| If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. | [optional] [default to False]
 **query** | **str**| A search term for querying names, filenames, versions, distributions, architectures, formats, or statuses of packages. | [optional] 
 **sort** | **str**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name, count, num_downloads, size, last_push, backend_kind. | [optional] [default to &#39;name&#39;]

### Return type

[**PackagesGroupsList200Response**](PackagesGroupsList200Response.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the list of package groups. |  -  |
**404** | Owner namespace or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_list**
> List[Package] packages_list(owner, repo, page=page, page_size=page_size, include_connected_repositories=include_connected_repositories, query=query, sort=sort)

Get a list of all packages associated with repository.

Get a list of all packages associated with repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package import Package
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    page = 56 # int | A page number within the paginated result set. (optional)
    page_size = 56 # int | Number of results to return per page. (optional)
    include_connected_repositories = False # bool | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in. (optional) (default to False)
    query = 'query_example' # str | A search term for querying names, filenames, versions, distributions, architectures, formats, statuses or display sources (display_source:upstream, display_source:manual_upload, display_source:connected_repository) of packages. (optional)
    sort = '-date' # str | A field for sorting objects in ascending or descending order. (optional) (default to '-date')

    try:
        # Get a list of all packages associated with repository.
        api_response = api_instance.packages_list(owner, repo, page=page, page_size=page_size, include_connected_repositories=include_connected_repositories, query=query, sort=sort)
        print("The response of PackagesApi->packages_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **page** | **int**| A page number within the paginated result set. | [optional] 
 **page_size** | **int**| Number of results to return per page. | [optional] 
 **include_connected_repositories** | **bool**| If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in. | [optional] [default to False]
 **query** | **str**| A search term for querying names, filenames, versions, distributions, architectures, formats, statuses or display sources (display_source:upstream, display_source:manual_upload, display_source:connected_repository) of packages. | [optional] 
 **sort** | **str**| A field for sorting objects in ascending or descending order. | [optional] [default to &#39;-date&#39;]

### Return type

[**List[Package]**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the list of packages |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_move**
> PackageMove packages_move(owner, repo, identifier, data=data)

Move a package to another repository.

Move a package to another repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_move import PackageMove
from cloudsmith_api.models.package_move_request import PackageMoveRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 
    data = cloudsmith_api.PackageMoveRequest() # PackageMoveRequest |  (optional)

    try:
        # Move a package to another repository.
        api_response = api_instance.packages_move(owner, repo, identifier, data=data)
        print("The response of PackagesApi->packages_move:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Moved specified package to destination repository. |  -  |
**400** | The package is in the wrong state for the requested operation. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_quarantine**
> PackageQuarantine packages_quarantine(owner, repo, identifier, data=data)

Quarantine or release a package.

Quarantine or release a package.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_quarantine import PackageQuarantine
from cloudsmith_api.models.package_quarantine_request import PackageQuarantineRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 
    data = cloudsmith_api.PackageQuarantineRequest() # PackageQuarantineRequest |  (optional)

    try:
        # Quarantine or release a package.
        api_response = api_instance.packages_quarantine(owner, repo, identifier, data=data)
        print("The response of PackagesApi->packages_quarantine:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Changed the package&#39;s quarantine status. |  -  |
**400** | The package is in the wrong state for the requested operation. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_read**
> PackageDetail packages_read(owner, repo, identifier, include_connected_repositories=include_connected_repositories)

Get a specific package in a repository.

Get a specific package in a repository.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_detail import PackageDetail
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 
    include_connected_repositories = False # bool | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in. (optional) (default to False)

    try:
        # Get a specific package in a repository.
        api_response = api_instance.packages_read(owner, repo, identifier, include_connected_repositories=include_connected_repositories)
        print("The response of PackagesApi->packages_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_read: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 
 **include_connected_repositories** | **bool**| If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in. | [optional] [default to False]

### Return type

[**PackageDetail**](PackageDetail.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved the specified package successfully. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_resync**
> PackageResync packages_resync(owner, repo, identifier)

Schedule a package for resynchronisation.

Schedule a package for resynchronisation.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_resync import PackageResync
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 

    try:
        # Schedule a package for resynchronisation.
        api_response = api_instance.packages_resync(owner, repo, identifier)
        print("The response of PackagesApi->packages_resync:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Scheduled the package for resynchronisation. |  -  |
**400** | The package is in the wrong state for the requested operation. |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_scan**
> Package packages_scan(owner, repo, identifier)

Schedule a package for scanning.

Schedule a package for scanning.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package import Package
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 

    try:
        # Schedule a package for scanning.
        api_response = api_instance.packages_scan(owner, repo, identifier)
        print("The response of PackagesApi->packages_scan:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Scheduled the package for scanning. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_status**
> PackageStatus packages_status(owner, repo, identifier, include_connected_repositories=include_connected_repositories)

Get the synchronization status for a package.

Get the synchronization status for a package.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package_status import PackageStatus
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 
    include_connected_repositories = False # bool | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in. (optional) (default to False)

    try:
        # Get the synchronization status for a package.
        api_response = api_instance.packages_status(owner, repo, identifier, include_connected_repositories=include_connected_repositories)
        print("The response of PackagesApi->packages_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 
 **include_connected_repositories** | **bool**| If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in. | [optional] [default to False]

### Return type

[**PackageStatus**](PackageStatus.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved status for specified package. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_tag**
> Package packages_tag(owner, repo, identifier, data=data)

Add/Replace/Remove tags for a package.

Add/Replace/Remove tags for a package.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package import Package
from cloudsmith_api.models.package_tag_request import PackageTagRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 
    data = cloudsmith_api.PackageTagRequest() # PackageTagRequest |  (optional)

    try:
        # Add/Replace/Remove tags for a package.
        api_response = api_instance.packages_tag(owner, repo, identifier, data=data)
        print("The response of PackagesApi->packages_tag:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Modified tags for the package. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_update_license**
> Package packages_update_license(owner, repo, identifier, data=data)

Update the license for a package.

Update the license for a package.

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.package import Package
from cloudsmith_api.models.package_license_request_patch import PackageLicenseRequestPatch
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    identifier = 'identifier_example' # str | 
    data = cloudsmith_api.PackageLicenseRequestPatch() # PackageLicenseRequestPatch |  (optional)

    try:
        # Update the license for a package.
        api_response = api_instance.packages_update_license(owner, repo, identifier, data=data)
        print("The response of PackagesApi->packages_update_license:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_update_license: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **identifier** | **str**|  | 
 **data** | [**PackageLicenseRequestPatch**](PackageLicenseRequestPatch.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Modified tags for the package. |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_alpine**
> AlpinePackageUpload packages_upload_alpine(owner, repo, data=data)

Create a new Alpine package

Create a new Alpine package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.alpine_package_upload import AlpinePackageUpload
from cloudsmith_api.models.alpine_package_upload_request import AlpinePackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.AlpinePackageUploadRequest() # AlpinePackageUploadRequest |  (optional)

    try:
        # Create a new Alpine package
        api_response = api_instance.packages_upload_alpine(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_alpine:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_cargo**
> CargoPackageUpload packages_upload_cargo(owner, repo, data=data)

Create a new Cargo package

Create a new Cargo package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.cargo_package_upload import CargoPackageUpload
from cloudsmith_api.models.cargo_package_upload_request import CargoPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.CargoPackageUploadRequest() # CargoPackageUploadRequest |  (optional)

    try:
        # Create a new Cargo package
        api_response = api_instance.packages_upload_cargo(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_cargo:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_cocoapods**
> CocoapodsPackageUpload packages_upload_cocoapods(owner, repo, data=data)

Create a new CocoaPods package

Create a new CocoaPods package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.cocoapods_package_upload import CocoapodsPackageUpload
from cloudsmith_api.models.cocoapods_package_upload_request import CocoapodsPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.CocoapodsPackageUploadRequest() # CocoapodsPackageUploadRequest |  (optional)

    try:
        # Create a new CocoaPods package
        api_response = api_instance.packages_upload_cocoapods(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_cocoapods:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_composer**
> ComposerPackageUpload packages_upload_composer(owner, repo, data=data)

Create a new Composer package

Create a new Composer package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.composer_package_upload import ComposerPackageUpload
from cloudsmith_api.models.composer_package_upload_request import ComposerPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.ComposerPackageUploadRequest() # ComposerPackageUploadRequest |  (optional)

    try:
        # Create a new Composer package
        api_response = api_instance.packages_upload_composer(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_composer:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_conan**
> ConanPackageUpload packages_upload_conan(owner, repo, data=data)

Create a new Conan package

Create a new Conan package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.conan_package_upload import ConanPackageUpload
from cloudsmith_api.models.conan_package_upload_request import ConanPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.ConanPackageUploadRequest() # ConanPackageUploadRequest |  (optional)

    try:
        # Create a new Conan package
        api_response = api_instance.packages_upload_conan(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_conan:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_conda**
> CondaPackageUpload packages_upload_conda(owner, repo, data=data)

Create a new Conda package

Create a new Conda package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.conda_package_upload import CondaPackageUpload
from cloudsmith_api.models.conda_package_upload_request import CondaPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.CondaPackageUploadRequest() # CondaPackageUploadRequest |  (optional)

    try:
        # Create a new Conda package
        api_response = api_instance.packages_upload_conda(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_conda:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_cran**
> CranPackageUpload packages_upload_cran(owner, repo, data=data)

Create a new CRAN package

Create a new CRAN package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.cran_package_upload import CranPackageUpload
from cloudsmith_api.models.cran_package_upload_request import CranPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.CranPackageUploadRequest() # CranPackageUploadRequest |  (optional)

    try:
        # Create a new CRAN package
        api_response = api_instance.packages_upload_cran(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_cran:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_dart**
> DartPackageUpload packages_upload_dart(owner, repo, data=data)

Create a new Dart package

Create a new Dart package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.dart_package_upload import DartPackageUpload
from cloudsmith_api.models.dart_package_upload_request import DartPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.DartPackageUploadRequest() # DartPackageUploadRequest |  (optional)

    try:
        # Create a new Dart package
        api_response = api_instance.packages_upload_dart(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_dart:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_deb**
> DebPackageUpload packages_upload_deb(owner, repo, data=data)

Create a new Debian package

Create a new Debian package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.deb_package_upload import DebPackageUpload
from cloudsmith_api.models.deb_package_upload_request import DebPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.DebPackageUploadRequest() # DebPackageUploadRequest |  (optional)

    try:
        # Create a new Debian package
        api_response = api_instance.packages_upload_deb(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_deb:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_docker**
> DockerPackageUpload packages_upload_docker(owner, repo, data=data)

Create a new Docker package

Create a new Docker package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.docker_package_upload import DockerPackageUpload
from cloudsmith_api.models.docker_package_upload_request import DockerPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.DockerPackageUploadRequest() # DockerPackageUploadRequest |  (optional)

    try:
        # Create a new Docker package
        api_response = api_instance.packages_upload_docker(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_docker:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_generic**
> GenericPackageUpload packages_upload_generic(owner, repo, data=data)

Create a new Generic package

Create a new Generic package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.generic_package_upload import GenericPackageUpload
from cloudsmith_api.models.generic_package_upload_request import GenericPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.GenericPackageUploadRequest() # GenericPackageUploadRequest |  (optional)

    try:
        # Create a new Generic package
        api_response = api_instance.packages_upload_generic(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_generic:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_upload_generic: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**GenericPackageUploadRequest**](GenericPackageUploadRequest.md)|  | [optional] 

### Return type

[**GenericPackageUpload**](GenericPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_go**
> GoPackageUpload packages_upload_go(owner, repo, data=data)

Create a new Go package

Create a new Go package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.go_package_upload import GoPackageUpload
from cloudsmith_api.models.go_package_upload_request import GoPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.GoPackageUploadRequest() # GoPackageUploadRequest |  (optional)

    try:
        # Create a new Go package
        api_response = api_instance.packages_upload_go(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_go:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_helm**
> HelmPackageUpload packages_upload_helm(owner, repo, data=data)

Create a new Helm package

Create a new Helm package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.helm_package_upload import HelmPackageUpload
from cloudsmith_api.models.helm_package_upload_request import HelmPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.HelmPackageUploadRequest() # HelmPackageUploadRequest |  (optional)

    try:
        # Create a new Helm package
        api_response = api_instance.packages_upload_helm(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_helm:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_hex**
> HexPackageUpload packages_upload_hex(owner, repo, data=data)

Create a new Hex package

Create a new Hex package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.hex_package_upload import HexPackageUpload
from cloudsmith_api.models.hex_package_upload_request import HexPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.HexPackageUploadRequest() # HexPackageUploadRequest |  (optional)

    try:
        # Create a new Hex package
        api_response = api_instance.packages_upload_hex(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_hex:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_upload_hex: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**HexPackageUploadRequest**](HexPackageUploadRequest.md)|  | [optional] 

### Return type

[**HexPackageUpload**](HexPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_huggingface**
> HuggingfacePackageUpload packages_upload_huggingface(owner, repo, data=data)

Create a new HuggingFace package

Create a new HuggingFace package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.huggingface_package_upload import HuggingfacePackageUpload
from cloudsmith_api.models.huggingface_package_upload_request import HuggingfacePackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.HuggingfacePackageUploadRequest() # HuggingfacePackageUploadRequest |  (optional)

    try:
        # Create a new HuggingFace package
        api_response = api_instance.packages_upload_huggingface(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_huggingface:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_upload_huggingface: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**HuggingfacePackageUploadRequest**](HuggingfacePackageUploadRequest.md)|  | [optional] 

### Return type

[**HuggingfacePackageUpload**](HuggingfacePackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_luarocks**
> LuarocksPackageUpload packages_upload_luarocks(owner, repo, data=data)

Create a new LuaRocks package

Create a new LuaRocks package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.luarocks_package_upload import LuarocksPackageUpload
from cloudsmith_api.models.luarocks_package_upload_request import LuarocksPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.LuarocksPackageUploadRequest() # LuarocksPackageUploadRequest |  (optional)

    try:
        # Create a new LuaRocks package
        api_response = api_instance.packages_upload_luarocks(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_luarocks:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_maven**
> MavenPackageUpload packages_upload_maven(owner, repo, data=data)

Create a new Maven package

Create a new Maven package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.maven_package_upload import MavenPackageUpload
from cloudsmith_api.models.maven_package_upload_request import MavenPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.MavenPackageUploadRequest() # MavenPackageUploadRequest |  (optional)

    try:
        # Create a new Maven package
        api_response = api_instance.packages_upload_maven(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_maven:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_mcp**
> McpPackageUpload packages_upload_mcp(owner, repo, data=data)

Create a new MCP package

Create a new MCP package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.mcp_package_upload import McpPackageUpload
from cloudsmith_api.models.mcp_package_upload_request import McpPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.McpPackageUploadRequest() # McpPackageUploadRequest |  (optional)

    try:
        # Create a new MCP package
        api_response = api_instance.packages_upload_mcp(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_mcp:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_upload_mcp: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**McpPackageUploadRequest**](McpPackageUploadRequest.md)|  | [optional] 

### Return type

[**McpPackageUpload**](McpPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_nix**
> NixPackageUpload packages_upload_nix(owner, repo, data=data)

Create a new Nix package

Create a new Nix package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.nix_package_upload import NixPackageUpload
from cloudsmith_api.models.nix_package_upload_request import NixPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.NixPackageUploadRequest() # NixPackageUploadRequest |  (optional)

    try:
        # Create a new Nix package
        api_response = api_instance.packages_upload_nix(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_nix:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_upload_nix: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**NixPackageUploadRequest**](NixPackageUploadRequest.md)|  | [optional] 

### Return type

[**NixPackageUpload**](NixPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_npm**
> NpmPackageUpload packages_upload_npm(owner, repo, data=data)

Create a new npm package

Create a new npm package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.npm_package_upload import NpmPackageUpload
from cloudsmith_api.models.npm_package_upload_request import NpmPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.NpmPackageUploadRequest() # NpmPackageUploadRequest |  (optional)

    try:
        # Create a new npm package
        api_response = api_instance.packages_upload_npm(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_npm:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_nuget**
> NugetPackageUpload packages_upload_nuget(owner, repo, data=data)

Create a new NuGet package

Create a new NuGet package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.nuget_package_upload import NugetPackageUpload
from cloudsmith_api.models.nuget_package_upload_request import NugetPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.NugetPackageUploadRequest() # NugetPackageUploadRequest |  (optional)

    try:
        # Create a new NuGet package
        api_response = api_instance.packages_upload_nuget(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_nuget:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_p2**
> P2PackageUpload packages_upload_p2(owner, repo, data=data)

Create a new P2 package

Create a new P2 package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.p2_package_upload import P2PackageUpload
from cloudsmith_api.models.p2_package_upload_request import P2PackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.P2PackageUploadRequest() # P2PackageUploadRequest |  (optional)

    try:
        # Create a new P2 package
        api_response = api_instance.packages_upload_p2(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_p2:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_python**
> PythonPackageUpload packages_upload_python(owner, repo, data=data)

Create a new Python package

Create a new Python package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.python_package_upload import PythonPackageUpload
from cloudsmith_api.models.python_package_upload_request import PythonPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.PythonPackageUploadRequest() # PythonPackageUploadRequest |  (optional)

    try:
        # Create a new Python package
        api_response = api_instance.packages_upload_python(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_python:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_raw**
> RawPackageUpload packages_upload_raw(owner, repo, data=data)

Create a new Raw package

Create a new Raw package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.raw_package_upload import RawPackageUpload
from cloudsmith_api.models.raw_package_upload_request import RawPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.RawPackageUploadRequest() # RawPackageUploadRequest |  (optional)

    try:
        # Create a new Raw package
        api_response = api_instance.packages_upload_raw(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_raw:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_rpm**
> RpmPackageUpload packages_upload_rpm(owner, repo, data=data)

Create a new RedHat package

Create a new RedHat package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.rpm_package_upload import RpmPackageUpload
from cloudsmith_api.models.rpm_package_upload_request import RpmPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.RpmPackageUploadRequest() # RpmPackageUploadRequest |  (optional)

    try:
        # Create a new RedHat package
        api_response = api_instance.packages_upload_rpm(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_rpm:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_ruby**
> RubyPackageUpload packages_upload_ruby(owner, repo, data=data)

Create a new Ruby package

Create a new Ruby package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.ruby_package_upload import RubyPackageUpload
from cloudsmith_api.models.ruby_package_upload_request import RubyPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.RubyPackageUploadRequest() # RubyPackageUploadRequest |  (optional)

    try:
        # Create a new Ruby package
        api_response = api_instance.packages_upload_ruby(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_ruby:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_skills**
> SkillsPackageUpload packages_upload_skills(owner, repo, data=data)

Create a new AI Skills package

Create a new AI Skills package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.skills_package_upload import SkillsPackageUpload
from cloudsmith_api.models.skills_package_upload_request import SkillsPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.SkillsPackageUploadRequest() # SkillsPackageUploadRequest |  (optional)

    try:
        # Create a new AI Skills package
        api_response = api_instance.packages_upload_skills(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_skills:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_upload_skills: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**SkillsPackageUploadRequest**](SkillsPackageUploadRequest.md)|  | [optional] 

### Return type

[**SkillsPackageUpload**](SkillsPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_swift**
> SwiftPackageUpload packages_upload_swift(owner, repo, data=data)

Create a new Swift package

Create a new Swift package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.swift_package_upload import SwiftPackageUpload
from cloudsmith_api.models.swift_package_upload_request import SwiftPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.SwiftPackageUploadRequest() # SwiftPackageUploadRequest |  (optional)

    try:
        # Create a new Swift package
        api_response = api_instance.packages_upload_swift(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_swift:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_upload_swift: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**SwiftPackageUploadRequest**](SwiftPackageUploadRequest.md)|  | [optional] 

### Return type

[**SwiftPackageUpload**](SwiftPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_terraform**
> TerraformPackageUpload packages_upload_terraform(owner, repo, data=data)

Create a new Terraform package

Create a new Terraform package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.terraform_package_upload import TerraformPackageUpload
from cloudsmith_api.models.terraform_package_upload_request import TerraformPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.TerraformPackageUploadRequest() # TerraformPackageUploadRequest |  (optional)

    try:
        # Create a new Terraform package
        api_response = api_instance.packages_upload_terraform(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_terraform:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_vagrant**
> VagrantPackageUpload packages_upload_vagrant(owner, repo, data=data)

Create a new Vagrant package

Create a new Vagrant package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.vagrant_package_upload import VagrantPackageUpload
from cloudsmith_api.models.vagrant_package_upload_request import VagrantPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.VagrantPackageUploadRequest() # VagrantPackageUploadRequest |  (optional)

    try:
        # Create a new Vagrant package
        api_response = api_instance.packages_upload_vagrant(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_vagrant:\n")
        pprint(api_response)
    except Exception as e:
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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_vsx**
> VsxPackageUpload packages_upload_vsx(owner, repo, data=data)

Create a new VSX package

Create a new VSX package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.vsx_package_upload import VsxPackageUpload
from cloudsmith_api.models.vsx_package_upload_request import VsxPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.VsxPackageUploadRequest() # VsxPackageUploadRequest |  (optional)

    try:
        # Create a new VSX package
        api_response = api_instance.packages_upload_vsx(owner, repo, data=data)
        print("The response of PackagesApi->packages_upload_vsx:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_upload_vsx: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**VsxPackageUploadRequest**](VsxPackageUploadRequest.md)|  | [optional] 

### Return type

[**VsxPackageUpload**](VsxPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Upload acknowledged and queued for synchronization. |  -  |
**404** | Namespace (owner) or repository not found |  -  |
**400** | Request could not be processed (see detail). |  -  |
**422** | Missing or invalid parameters (see detail). |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_alpine**
> packages_validate_upload_alpine(owner, repo, data=data)

Validate parameters for create Alpine package

Validate parameters for create Alpine package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.alpine_package_upload_request import AlpinePackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.AlpinePackageUploadRequest() # AlpinePackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Alpine package
        api_instance.packages_validate_upload_alpine(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_cargo**
> packages_validate_upload_cargo(owner, repo, data=data)

Validate parameters for create Cargo package

Validate parameters for create Cargo package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.cargo_package_upload_request import CargoPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.CargoPackageUploadRequest() # CargoPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Cargo package
        api_instance.packages_validate_upload_cargo(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_cocoapods**
> packages_validate_upload_cocoapods(owner, repo, data=data)

Validate parameters for create CocoaPods package

Validate parameters for create CocoaPods package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.cocoapods_package_upload_request import CocoapodsPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.CocoapodsPackageUploadRequest() # CocoapodsPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create CocoaPods package
        api_instance.packages_validate_upload_cocoapods(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_composer**
> packages_validate_upload_composer(owner, repo, data=data)

Validate parameters for create Composer package

Validate parameters for create Composer package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.composer_package_upload_request import ComposerPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.ComposerPackageUploadRequest() # ComposerPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Composer package
        api_instance.packages_validate_upload_composer(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_conan**
> packages_validate_upload_conan(owner, repo, data=data)

Validate parameters for create Conan package

Validate parameters for create Conan package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.conan_package_upload_request import ConanPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.ConanPackageUploadRequest() # ConanPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Conan package
        api_instance.packages_validate_upload_conan(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_conda**
> packages_validate_upload_conda(owner, repo, data=data)

Validate parameters for create Conda package

Validate parameters for create Conda package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.conda_package_upload_request import CondaPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.CondaPackageUploadRequest() # CondaPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Conda package
        api_instance.packages_validate_upload_conda(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_cran**
> packages_validate_upload_cran(owner, repo, data=data)

Validate parameters for create CRAN package

Validate parameters for create CRAN package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.cran_package_upload_request import CranPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.CranPackageUploadRequest() # CranPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create CRAN package
        api_instance.packages_validate_upload_cran(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_dart**
> packages_validate_upload_dart(owner, repo, data=data)

Validate parameters for create Dart package

Validate parameters for create Dart package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.dart_package_upload_request import DartPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.DartPackageUploadRequest() # DartPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Dart package
        api_instance.packages_validate_upload_dart(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_deb**
> packages_validate_upload_deb(owner, repo, data=data)

Validate parameters for create Debian package

Validate parameters for create Debian package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.deb_package_upload_request import DebPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.DebPackageUploadRequest() # DebPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Debian package
        api_instance.packages_validate_upload_deb(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_docker**
> packages_validate_upload_docker(owner, repo, data=data)

Validate parameters for create Docker package

Validate parameters for create Docker package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.docker_package_upload_request import DockerPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.DockerPackageUploadRequest() # DockerPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Docker package
        api_instance.packages_validate_upload_docker(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_generic**
> packages_validate_upload_generic(owner, repo, data=data)

Validate parameters for create Generic package

Validate parameters for create Generic package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.generic_package_upload_request import GenericPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.GenericPackageUploadRequest() # GenericPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Generic package
        api_instance.packages_validate_upload_generic(owner, repo, data=data)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_validate_upload_generic: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**GenericPackageUploadRequest**](GenericPackageUploadRequest.md)|  | [optional] 

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

# **packages_validate_upload_go**
> packages_validate_upload_go(owner, repo, data=data)

Validate parameters for create Go package

Validate parameters for create Go package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.go_package_upload_request import GoPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.GoPackageUploadRequest() # GoPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Go package
        api_instance.packages_validate_upload_go(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_helm**
> packages_validate_upload_helm(owner, repo, data=data)

Validate parameters for create Helm package

Validate parameters for create Helm package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.helm_package_upload_request import HelmPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.HelmPackageUploadRequest() # HelmPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Helm package
        api_instance.packages_validate_upload_helm(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_hex**
> packages_validate_upload_hex(owner, repo, data=data)

Validate parameters for create Hex package

Validate parameters for create Hex package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.hex_package_upload_request import HexPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.HexPackageUploadRequest() # HexPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Hex package
        api_instance.packages_validate_upload_hex(owner, repo, data=data)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_validate_upload_hex: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**HexPackageUploadRequest**](HexPackageUploadRequest.md)|  | [optional] 

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

# **packages_validate_upload_huggingface**
> packages_validate_upload_huggingface(owner, repo, data=data)

Validate parameters for create HuggingFace package

Validate parameters for create HuggingFace package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.huggingface_package_upload_request import HuggingfacePackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.HuggingfacePackageUploadRequest() # HuggingfacePackageUploadRequest |  (optional)

    try:
        # Validate parameters for create HuggingFace package
        api_instance.packages_validate_upload_huggingface(owner, repo, data=data)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_validate_upload_huggingface: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**HuggingfacePackageUploadRequest**](HuggingfacePackageUploadRequest.md)|  | [optional] 

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

# **packages_validate_upload_luarocks**
> packages_validate_upload_luarocks(owner, repo, data=data)

Validate parameters for create LuaRocks package

Validate parameters for create LuaRocks package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.luarocks_package_upload_request import LuarocksPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.LuarocksPackageUploadRequest() # LuarocksPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create LuaRocks package
        api_instance.packages_validate_upload_luarocks(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_maven**
> packages_validate_upload_maven(owner, repo, data=data)

Validate parameters for create Maven package

Validate parameters for create Maven package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.maven_package_upload_request import MavenPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.MavenPackageUploadRequest() # MavenPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Maven package
        api_instance.packages_validate_upload_maven(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_mcp**
> packages_validate_upload_mcp(owner, repo, data=data)

Validate parameters for create MCP package

Validate parameters for create MCP package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.mcp_package_upload_request import McpPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.McpPackageUploadRequest() # McpPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create MCP package
        api_instance.packages_validate_upload_mcp(owner, repo, data=data)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_validate_upload_mcp: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**McpPackageUploadRequest**](McpPackageUploadRequest.md)|  | [optional] 

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

# **packages_validate_upload_nix**
> packages_validate_upload_nix(owner, repo, data=data)

Validate parameters for create Nix package

Validate parameters for create Nix package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.nix_package_upload_request import NixPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.NixPackageUploadRequest() # NixPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Nix package
        api_instance.packages_validate_upload_nix(owner, repo, data=data)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_validate_upload_nix: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**NixPackageUploadRequest**](NixPackageUploadRequest.md)|  | [optional] 

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

# **packages_validate_upload_npm**
> packages_validate_upload_npm(owner, repo, data=data)

Validate parameters for create npm package

Validate parameters for create npm package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.npm_package_upload_request import NpmPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.NpmPackageUploadRequest() # NpmPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create npm package
        api_instance.packages_validate_upload_npm(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_nuget**
> packages_validate_upload_nuget(owner, repo, data=data)

Validate parameters for create NuGet package

Validate parameters for create NuGet package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.nuget_package_upload_request import NugetPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.NugetPackageUploadRequest() # NugetPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create NuGet package
        api_instance.packages_validate_upload_nuget(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_p2**
> packages_validate_upload_p2(owner, repo, data=data)

Validate parameters for create P2 package

Validate parameters for create P2 package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.p2_package_upload_request import P2PackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.P2PackageUploadRequest() # P2PackageUploadRequest |  (optional)

    try:
        # Validate parameters for create P2 package
        api_instance.packages_validate_upload_p2(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_python**
> packages_validate_upload_python(owner, repo, data=data)

Validate parameters for create Python package

Validate parameters for create Python package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.python_package_upload_request import PythonPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.PythonPackageUploadRequest() # PythonPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Python package
        api_instance.packages_validate_upload_python(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_raw**
> packages_validate_upload_raw(owner, repo, data=data)

Validate parameters for create Raw package

Validate parameters for create Raw package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.raw_package_upload_request import RawPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.RawPackageUploadRequest() # RawPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Raw package
        api_instance.packages_validate_upload_raw(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_rpm**
> packages_validate_upload_rpm(owner, repo, data=data)

Validate parameters for create RedHat package

Validate parameters for create RedHat package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.rpm_package_upload_request import RpmPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.RpmPackageUploadRequest() # RpmPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create RedHat package
        api_instance.packages_validate_upload_rpm(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_ruby**
> packages_validate_upload_ruby(owner, repo, data=data)

Validate parameters for create Ruby package

Validate parameters for create Ruby package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.ruby_package_upload_request import RubyPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.RubyPackageUploadRequest() # RubyPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Ruby package
        api_instance.packages_validate_upload_ruby(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_skills**
> packages_validate_upload_skills(owner, repo, data=data)

Validate parameters for create AI Skills package

Validate parameters for create AI Skills package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.skills_package_upload_request import SkillsPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.SkillsPackageUploadRequest() # SkillsPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create AI Skills package
        api_instance.packages_validate_upload_skills(owner, repo, data=data)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_validate_upload_skills: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**SkillsPackageUploadRequest**](SkillsPackageUploadRequest.md)|  | [optional] 

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

# **packages_validate_upload_swift**
> packages_validate_upload_swift(owner, repo, data=data)

Validate parameters for create Swift package

Validate parameters for create Swift package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.swift_package_upload_request import SwiftPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.SwiftPackageUploadRequest() # SwiftPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Swift package
        api_instance.packages_validate_upload_swift(owner, repo, data=data)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_validate_upload_swift: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**SwiftPackageUploadRequest**](SwiftPackageUploadRequest.md)|  | [optional] 

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

# **packages_validate_upload_terraform**
> packages_validate_upload_terraform(owner, repo, data=data)

Validate parameters for create Terraform package

Validate parameters for create Terraform package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.terraform_package_upload_request import TerraformPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.TerraformPackageUploadRequest() # TerraformPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Terraform package
        api_instance.packages_validate_upload_terraform(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_vagrant**
> packages_validate_upload_vagrant(owner, repo, data=data)

Validate parameters for create Vagrant package

Validate parameters for create Vagrant package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.vagrant_package_upload_request import VagrantPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.VagrantPackageUploadRequest() # VagrantPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create Vagrant package
        api_instance.packages_validate_upload_vagrant(owner, repo, data=data)
    except Exception as e:
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

# **packages_validate_upload_vsx**
> packages_validate_upload_vsx(owner, repo, data=data)

Validate parameters for create VSX package

Validate parameters for create VSX package

### Example

* Api Key Authentication (apikey):
* Basic Authentication (basic):

```python
import cloudsmith_api
from cloudsmith_api.models.vsx_package_upload_request import VsxPackageUploadRequest
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
    api_instance = cloudsmith_api.PackagesApi(api_client)
    owner = 'owner_example' # str | 
    repo = 'repo_example' # str | 
    data = cloudsmith_api.VsxPackageUploadRequest() # VsxPackageUploadRequest |  (optional)

    try:
        # Validate parameters for create VSX package
        api_instance.packages_validate_upload_vsx(owner, repo, data=data)
    except Exception as e:
        print("Exception when calling PackagesApi->packages_validate_upload_vsx: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**|  | 
 **repo** | **str**|  | 
 **data** | [**VsxPackageUploadRequest**](VsxPackageUploadRequest.md)|  | [optional] 

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

