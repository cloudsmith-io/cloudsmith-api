# CloudsmithApi::PackagesApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**packages_copy**](PackagesApi.md#packages_copy) | **POST** /packages/{owner}/{repo}/{identifier}/copy/ | Copy a package to another repository. |
| [**packages_delete**](PackagesApi.md#packages_delete) | **DELETE** /packages/{owner}/{repo}/{identifier}/ | Delete a specific package in a repository. |
| [**packages_dependencies**](PackagesApi.md#packages_dependencies) | **GET** /packages/{owner}/{repo}/{identifier}/dependencies/ | Get the list of dependencies for a package. Transitive dependencies are included where supported. |
| [**packages_groups_list**](PackagesApi.md#packages_groups_list) | **GET** /packages/{owner}/{repo}/groups/ | Return a list of Package Groups in a repository. |
| [**packages_list**](PackagesApi.md#packages_list) | **GET** /packages/{owner}/{repo}/ | Get a list of all packages associated with repository. |
| [**packages_move**](PackagesApi.md#packages_move) | **POST** /packages/{owner}/{repo}/{identifier}/move/ | Move a package to another repository. |
| [**packages_quarantine**](PackagesApi.md#packages_quarantine) | **POST** /packages/{owner}/{repo}/{identifier}/quarantine/ | Quarantine or release a package. |
| [**packages_read**](PackagesApi.md#packages_read) | **GET** /packages/{owner}/{repo}/{identifier}/ | Get a specific package in a repository. |
| [**packages_resync**](PackagesApi.md#packages_resync) | **POST** /packages/{owner}/{repo}/{identifier}/resync/ | Schedule a package for resynchronisation. |
| [**packages_scan**](PackagesApi.md#packages_scan) | **POST** /packages/{owner}/{repo}/{identifier}/scan/ | Schedule a package for scanning. |
| [**packages_status**](PackagesApi.md#packages_status) | **GET** /packages/{owner}/{repo}/{identifier}/status/ | Get the synchronization status for a package. |
| [**packages_tag**](PackagesApi.md#packages_tag) | **POST** /packages/{owner}/{repo}/{identifier}/tag/ | Add/Replace/Remove tags for a package. |
| [**packages_update_license**](PackagesApi.md#packages_update_license) | **PATCH** /packages/{owner}/{repo}/{identifier}/update-license/ | Update the license for a package. |
| [**packages_upload_alpine**](PackagesApi.md#packages_upload_alpine) | **POST** /packages/{owner}/{repo}/upload/alpine/ | Create a new Alpine package |
| [**packages_upload_cargo**](PackagesApi.md#packages_upload_cargo) | **POST** /packages/{owner}/{repo}/upload/cargo/ | Create a new Cargo package |
| [**packages_upload_cocoapods**](PackagesApi.md#packages_upload_cocoapods) | **POST** /packages/{owner}/{repo}/upload/cocoapods/ | Create a new CocoaPods package |
| [**packages_upload_composer**](PackagesApi.md#packages_upload_composer) | **POST** /packages/{owner}/{repo}/upload/composer/ | Create a new Composer package |
| [**packages_upload_conan**](PackagesApi.md#packages_upload_conan) | **POST** /packages/{owner}/{repo}/upload/conan/ | Create a new Conan package |
| [**packages_upload_conda**](PackagesApi.md#packages_upload_conda) | **POST** /packages/{owner}/{repo}/upload/conda/ | Create a new Conda package |
| [**packages_upload_cran**](PackagesApi.md#packages_upload_cran) | **POST** /packages/{owner}/{repo}/upload/cran/ | Create a new CRAN package |
| [**packages_upload_dart**](PackagesApi.md#packages_upload_dart) | **POST** /packages/{owner}/{repo}/upload/dart/ | Create a new Dart package |
| [**packages_upload_deb**](PackagesApi.md#packages_upload_deb) | **POST** /packages/{owner}/{repo}/upload/deb/ | Create a new Debian package |
| [**packages_upload_docker**](PackagesApi.md#packages_upload_docker) | **POST** /packages/{owner}/{repo}/upload/docker/ | Create a new Docker package |
| [**packages_upload_generic**](PackagesApi.md#packages_upload_generic) | **POST** /packages/{owner}/{repo}/upload/generic/ | Create a new Generic package |
| [**packages_upload_go**](PackagesApi.md#packages_upload_go) | **POST** /packages/{owner}/{repo}/upload/go/ | Create a new Go package |
| [**packages_upload_helm**](PackagesApi.md#packages_upload_helm) | **POST** /packages/{owner}/{repo}/upload/helm/ | Create a new Helm package |
| [**packages_upload_hex**](PackagesApi.md#packages_upload_hex) | **POST** /packages/{owner}/{repo}/upload/hex/ | Create a new Hex package |
| [**packages_upload_huggingface**](PackagesApi.md#packages_upload_huggingface) | **POST** /packages/{owner}/{repo}/upload/huggingface/ | Create a new HuggingFace package |
| [**packages_upload_luarocks**](PackagesApi.md#packages_upload_luarocks) | **POST** /packages/{owner}/{repo}/upload/luarocks/ | Create a new LuaRocks package |
| [**packages_upload_maven**](PackagesApi.md#packages_upload_maven) | **POST** /packages/{owner}/{repo}/upload/maven/ | Create a new Maven package |
| [**packages_upload_mcp**](PackagesApi.md#packages_upload_mcp) | **POST** /packages/{owner}/{repo}/upload/mcp/ | Create a new MCP package |
| [**packages_upload_nix**](PackagesApi.md#packages_upload_nix) | **POST** /packages/{owner}/{repo}/upload/nix/ | Create a new Nix package |
| [**packages_upload_npm**](PackagesApi.md#packages_upload_npm) | **POST** /packages/{owner}/{repo}/upload/npm/ | Create a new npm package |
| [**packages_upload_nuget**](PackagesApi.md#packages_upload_nuget) | **POST** /packages/{owner}/{repo}/upload/nuget/ | Create a new NuGet package |
| [**packages_upload_p2**](PackagesApi.md#packages_upload_p2) | **POST** /packages/{owner}/{repo}/upload/p2/ | Create a new P2 package |
| [**packages_upload_python**](PackagesApi.md#packages_upload_python) | **POST** /packages/{owner}/{repo}/upload/python/ | Create a new Python package |
| [**packages_upload_raw**](PackagesApi.md#packages_upload_raw) | **POST** /packages/{owner}/{repo}/upload/raw/ | Create a new Raw package |
| [**packages_upload_rpm**](PackagesApi.md#packages_upload_rpm) | **POST** /packages/{owner}/{repo}/upload/rpm/ | Create a new RedHat package |
| [**packages_upload_ruby**](PackagesApi.md#packages_upload_ruby) | **POST** /packages/{owner}/{repo}/upload/ruby/ | Create a new Ruby package |
| [**packages_upload_skills**](PackagesApi.md#packages_upload_skills) | **POST** /packages/{owner}/{repo}/upload/skills/ | Create a new AI Skills package |
| [**packages_upload_swift**](PackagesApi.md#packages_upload_swift) | **POST** /packages/{owner}/{repo}/upload/swift/ | Create a new Swift package |
| [**packages_upload_terraform**](PackagesApi.md#packages_upload_terraform) | **POST** /packages/{owner}/{repo}/upload/terraform/ | Create a new Terraform package |
| [**packages_upload_vagrant**](PackagesApi.md#packages_upload_vagrant) | **POST** /packages/{owner}/{repo}/upload/vagrant/ | Create a new Vagrant package |
| [**packages_upload_vsx**](PackagesApi.md#packages_upload_vsx) | **POST** /packages/{owner}/{repo}/upload/vsx/ | Create a new VSX package |
| [**packages_validate_upload_alpine**](PackagesApi.md#packages_validate_upload_alpine) | **POST** /packages/{owner}/{repo}/validate-upload/alpine/ | Validate parameters for create Alpine package |
| [**packages_validate_upload_cargo**](PackagesApi.md#packages_validate_upload_cargo) | **POST** /packages/{owner}/{repo}/validate-upload/cargo/ | Validate parameters for create Cargo package |
| [**packages_validate_upload_cocoapods**](PackagesApi.md#packages_validate_upload_cocoapods) | **POST** /packages/{owner}/{repo}/validate-upload/cocoapods/ | Validate parameters for create CocoaPods package |
| [**packages_validate_upload_composer**](PackagesApi.md#packages_validate_upload_composer) | **POST** /packages/{owner}/{repo}/validate-upload/composer/ | Validate parameters for create Composer package |
| [**packages_validate_upload_conan**](PackagesApi.md#packages_validate_upload_conan) | **POST** /packages/{owner}/{repo}/validate-upload/conan/ | Validate parameters for create Conan package |
| [**packages_validate_upload_conda**](PackagesApi.md#packages_validate_upload_conda) | **POST** /packages/{owner}/{repo}/validate-upload/conda/ | Validate parameters for create Conda package |
| [**packages_validate_upload_cran**](PackagesApi.md#packages_validate_upload_cran) | **POST** /packages/{owner}/{repo}/validate-upload/cran/ | Validate parameters for create CRAN package |
| [**packages_validate_upload_dart**](PackagesApi.md#packages_validate_upload_dart) | **POST** /packages/{owner}/{repo}/validate-upload/dart/ | Validate parameters for create Dart package |
| [**packages_validate_upload_deb**](PackagesApi.md#packages_validate_upload_deb) | **POST** /packages/{owner}/{repo}/validate-upload/deb/ | Validate parameters for create Debian package |
| [**packages_validate_upload_docker**](PackagesApi.md#packages_validate_upload_docker) | **POST** /packages/{owner}/{repo}/validate-upload/docker/ | Validate parameters for create Docker package |
| [**packages_validate_upload_generic**](PackagesApi.md#packages_validate_upload_generic) | **POST** /packages/{owner}/{repo}/validate-upload/generic/ | Validate parameters for create Generic package |
| [**packages_validate_upload_go**](PackagesApi.md#packages_validate_upload_go) | **POST** /packages/{owner}/{repo}/validate-upload/go/ | Validate parameters for create Go package |
| [**packages_validate_upload_helm**](PackagesApi.md#packages_validate_upload_helm) | **POST** /packages/{owner}/{repo}/validate-upload/helm/ | Validate parameters for create Helm package |
| [**packages_validate_upload_hex**](PackagesApi.md#packages_validate_upload_hex) | **POST** /packages/{owner}/{repo}/validate-upload/hex/ | Validate parameters for create Hex package |
| [**packages_validate_upload_huggingface**](PackagesApi.md#packages_validate_upload_huggingface) | **POST** /packages/{owner}/{repo}/validate-upload/huggingface/ | Validate parameters for create HuggingFace package |
| [**packages_validate_upload_luarocks**](PackagesApi.md#packages_validate_upload_luarocks) | **POST** /packages/{owner}/{repo}/validate-upload/luarocks/ | Validate parameters for create LuaRocks package |
| [**packages_validate_upload_maven**](PackagesApi.md#packages_validate_upload_maven) | **POST** /packages/{owner}/{repo}/validate-upload/maven/ | Validate parameters for create Maven package |
| [**packages_validate_upload_mcp**](PackagesApi.md#packages_validate_upload_mcp) | **POST** /packages/{owner}/{repo}/validate-upload/mcp/ | Validate parameters for create MCP package |
| [**packages_validate_upload_nix**](PackagesApi.md#packages_validate_upload_nix) | **POST** /packages/{owner}/{repo}/validate-upload/nix/ | Validate parameters for create Nix package |
| [**packages_validate_upload_npm**](PackagesApi.md#packages_validate_upload_npm) | **POST** /packages/{owner}/{repo}/validate-upload/npm/ | Validate parameters for create npm package |
| [**packages_validate_upload_nuget**](PackagesApi.md#packages_validate_upload_nuget) | **POST** /packages/{owner}/{repo}/validate-upload/nuget/ | Validate parameters for create NuGet package |
| [**packages_validate_upload_p2**](PackagesApi.md#packages_validate_upload_p2) | **POST** /packages/{owner}/{repo}/validate-upload/p2/ | Validate parameters for create P2 package |
| [**packages_validate_upload_python**](PackagesApi.md#packages_validate_upload_python) | **POST** /packages/{owner}/{repo}/validate-upload/python/ | Validate parameters for create Python package |
| [**packages_validate_upload_raw**](PackagesApi.md#packages_validate_upload_raw) | **POST** /packages/{owner}/{repo}/validate-upload/raw/ | Validate parameters for create Raw package |
| [**packages_validate_upload_rpm**](PackagesApi.md#packages_validate_upload_rpm) | **POST** /packages/{owner}/{repo}/validate-upload/rpm/ | Validate parameters for create RedHat package |
| [**packages_validate_upload_ruby**](PackagesApi.md#packages_validate_upload_ruby) | **POST** /packages/{owner}/{repo}/validate-upload/ruby/ | Validate parameters for create Ruby package |
| [**packages_validate_upload_skills**](PackagesApi.md#packages_validate_upload_skills) | **POST** /packages/{owner}/{repo}/validate-upload/skills/ | Validate parameters for create AI Skills package |
| [**packages_validate_upload_swift**](PackagesApi.md#packages_validate_upload_swift) | **POST** /packages/{owner}/{repo}/validate-upload/swift/ | Validate parameters for create Swift package |
| [**packages_validate_upload_terraform**](PackagesApi.md#packages_validate_upload_terraform) | **POST** /packages/{owner}/{repo}/validate-upload/terraform/ | Validate parameters for create Terraform package |
| [**packages_validate_upload_vagrant**](PackagesApi.md#packages_validate_upload_vagrant) | **POST** /packages/{owner}/{repo}/validate-upload/vagrant/ | Validate parameters for create Vagrant package |
| [**packages_validate_upload_vsx**](PackagesApi.md#packages_validate_upload_vsx) | **POST** /packages/{owner}/{repo}/validate-upload/vsx/ | Validate parameters for create VSX package |


## packages_copy

> <PackageCopy> packages_copy(owner, repo, identifier, opts)

Copy a package to another repository.

Copy a package to another repository.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 
opts = {
  data: CloudsmithApi::PackageCopyRequest.new({destination: 'destination_example'}) # PackageCopyRequest | 
}

begin
  # Copy a package to another repository.
  result = api_instance.packages_copy(owner, repo, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_copy: #{e}"
end
```

#### Using the packages_copy_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackageCopy>, Integer, Hash)> packages_copy_with_http_info(owner, repo, identifier, opts)

```ruby
begin
  # Copy a package to another repository.
  data, status_code, headers = api_instance.packages_copy_with_http_info(owner, repo, identifier, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackageCopy>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_copy_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **identifier** | **String** |  |  |
| **data** | [**PackageCopyRequest**](PackageCopyRequest.md) |  | [optional] |

### Return type

[**PackageCopy**](PackageCopy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_delete

> packages_delete(owner, repo, identifier)

Delete a specific package in a repository.

Delete a specific package in a repository.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 

begin
  # Delete a specific package in a repository.
  api_instance.packages_delete(owner, repo, identifier)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_delete: #{e}"
end
```

#### Using the packages_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_delete_with_http_info(owner, repo, identifier)

```ruby
begin
  # Delete a specific package in a repository.
  data, status_code, headers = api_instance.packages_delete_with_http_info(owner, repo, identifier)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **identifier** | **String** |  |  |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## packages_dependencies

> <PackageDependencies> packages_dependencies(owner, repo, identifier, opts)

Get the list of dependencies for a package. Transitive dependencies are included where supported.

Get the list of dependencies for a package. Transitive dependencies are included where supported.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 
opts = {
  include_connected_repositories: true # Boolean | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in.
}

begin
  # Get the list of dependencies for a package. Transitive dependencies are included where supported.
  result = api_instance.packages_dependencies(owner, repo, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_dependencies: #{e}"
end
```

#### Using the packages_dependencies_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackageDependencies>, Integer, Hash)> packages_dependencies_with_http_info(owner, repo, identifier, opts)

```ruby
begin
  # Get the list of dependencies for a package. Transitive dependencies are included where supported.
  data, status_code, headers = api_instance.packages_dependencies_with_http_info(owner, repo, identifier, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackageDependencies>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_dependencies_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **identifier** | **String** |  |  |
| **include_connected_repositories** | **Boolean** | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in. | [optional][default to false] |

### Return type

[**PackageDependencies**](PackageDependencies.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## packages_groups_list

> <PackagesGroupsList200Response> packages_groups_list(owner, repo, opts)

Return a list of Package Groups in a repository.

Return a list of Package Groups in a repository.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  group_by: 'group_by_example', # String | A field to group packages by. Available options: name, backend_kind.
  hide_subcomponents: true, # Boolean | Whether to hide packages which are subcomponents of another package in the results
  include_connected_repositories: true, # Boolean | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false.
  query: 'query_example', # String | A search term for querying names, filenames, versions, distributions, architectures, formats, or statuses of packages.
  sort: 'sort_example' # String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name, count, num_downloads, size, last_push, backend_kind.
}

begin
  # Return a list of Package Groups in a repository.
  result = api_instance.packages_groups_list(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_groups_list: #{e}"
end
```

#### Using the packages_groups_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackagesGroupsList200Response>, Integer, Hash)> packages_groups_list_with_http_info(owner, repo, opts)

```ruby
begin
  # Return a list of Package Groups in a repository.
  data, status_code, headers = api_instance.packages_groups_list_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackagesGroupsList200Response>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_groups_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |
| **group_by** | **String** | A field to group packages by. Available options: name, backend_kind. | [optional][default to &#39;name&#39;] |
| **hide_subcomponents** | **Boolean** | Whether to hide packages which are subcomponents of another package in the results | [optional][default to false] |
| **include_connected_repositories** | **Boolean** | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. | [optional][default to false] |
| **query** | **String** | A search term for querying names, filenames, versions, distributions, architectures, formats, or statuses of packages. | [optional] |
| **sort** | **String** | A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name, count, num_downloads, size, last_push, backend_kind. | [optional][default to &#39;name&#39;] |

### Return type

[**PackagesGroupsList200Response**](PackagesGroupsList200Response.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## packages_list

> <Array<Package>> packages_list(owner, repo, opts)

Get a list of all packages associated with repository.

Get a list of all packages associated with repository.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  include_connected_repositories: true, # Boolean | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in.
  query: 'query_example', # String | A search term for querying names, filenames, versions, distributions, architectures, formats, statuses or display sources (display_source:upstream, display_source:manual_upload, display_source:connected_repository) of packages.
  sort: 'sort_example' # String | A field for sorting objects in ascending or descending order.
}

begin
  # Get a list of all packages associated with repository.
  result = api_instance.packages_list(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_list: #{e}"
end
```

#### Using the packages_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<Package>>, Integer, Hash)> packages_list_with_http_info(owner, repo, opts)

```ruby
begin
  # Get a list of all packages associated with repository.
  data, status_code, headers = api_instance.packages_list_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<Package>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |
| **include_connected_repositories** | **Boolean** | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in. | [optional][default to false] |
| **query** | **String** | A search term for querying names, filenames, versions, distributions, architectures, formats, statuses or display sources (display_source:upstream, display_source:manual_upload, display_source:connected_repository) of packages. | [optional] |
| **sort** | **String** | A field for sorting objects in ascending or descending order. | [optional][default to &#39;-date&#39;] |

### Return type

[**Array&lt;Package&gt;**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## packages_move

> <PackageMove> packages_move(owner, repo, identifier, opts)

Move a package to another repository.

Move a package to another repository.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 
opts = {
  data: CloudsmithApi::PackageMoveRequest.new({destination: 'destination_example'}) # PackageMoveRequest | 
}

begin
  # Move a package to another repository.
  result = api_instance.packages_move(owner, repo, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_move: #{e}"
end
```

#### Using the packages_move_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackageMove>, Integer, Hash)> packages_move_with_http_info(owner, repo, identifier, opts)

```ruby
begin
  # Move a package to another repository.
  data, status_code, headers = api_instance.packages_move_with_http_info(owner, repo, identifier, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackageMove>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_move_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **identifier** | **String** |  |  |
| **data** | [**PackageMoveRequest**](PackageMoveRequest.md) |  | [optional] |

### Return type

[**PackageMove**](PackageMove.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_quarantine

> <PackageQuarantine> packages_quarantine(owner, repo, identifier, opts)

Quarantine or release a package.

Quarantine or release a package.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 
opts = {
  data: CloudsmithApi::PackageQuarantineRequest.new # PackageQuarantineRequest | 
}

begin
  # Quarantine or release a package.
  result = api_instance.packages_quarantine(owner, repo, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_quarantine: #{e}"
end
```

#### Using the packages_quarantine_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackageQuarantine>, Integer, Hash)> packages_quarantine_with_http_info(owner, repo, identifier, opts)

```ruby
begin
  # Quarantine or release a package.
  data, status_code, headers = api_instance.packages_quarantine_with_http_info(owner, repo, identifier, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackageQuarantine>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_quarantine_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **identifier** | **String** |  |  |
| **data** | [**PackageQuarantineRequest**](PackageQuarantineRequest.md) |  | [optional] |

### Return type

[**PackageQuarantine**](PackageQuarantine.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_read

> <PackageDetail> packages_read(owner, repo, identifier, opts)

Get a specific package in a repository.

Get a specific package in a repository.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 
opts = {
  include_connected_repositories: true # Boolean | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in.
}

begin
  # Get a specific package in a repository.
  result = api_instance.packages_read(owner, repo, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_read: #{e}"
end
```

#### Using the packages_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackageDetail>, Integer, Hash)> packages_read_with_http_info(owner, repo, identifier, opts)

```ruby
begin
  # Get a specific package in a repository.
  data, status_code, headers = api_instance.packages_read_with_http_info(owner, repo, identifier, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackageDetail>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **identifier** | **String** |  |  |
| **include_connected_repositories** | **Boolean** | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in. | [optional][default to false] |

### Return type

[**PackageDetail**](PackageDetail.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## packages_resync

> <PackageResync> packages_resync(owner, repo, identifier)

Schedule a package for resynchronisation.

Schedule a package for resynchronisation.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 

begin
  # Schedule a package for resynchronisation.
  result = api_instance.packages_resync(owner, repo, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_resync: #{e}"
end
```

#### Using the packages_resync_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackageResync>, Integer, Hash)> packages_resync_with_http_info(owner, repo, identifier)

```ruby
begin
  # Schedule a package for resynchronisation.
  data, status_code, headers = api_instance.packages_resync_with_http_info(owner, repo, identifier)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackageResync>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_resync_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **identifier** | **String** |  |  |

### Return type

[**PackageResync**](PackageResync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## packages_scan

> <Package> packages_scan(owner, repo, identifier)

Schedule a package for scanning.

Schedule a package for scanning.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 

begin
  # Schedule a package for scanning.
  result = api_instance.packages_scan(owner, repo, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_scan: #{e}"
end
```

#### Using the packages_scan_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Package>, Integer, Hash)> packages_scan_with_http_info(owner, repo, identifier)

```ruby
begin
  # Schedule a package for scanning.
  data, status_code, headers = api_instance.packages_scan_with_http_info(owner, repo, identifier)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Package>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_scan_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **identifier** | **String** |  |  |

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## packages_status

> <PackageStatus> packages_status(owner, repo, identifier, opts)

Get the synchronization status for a package.

Get the synchronization status for a package.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 
opts = {
  include_connected_repositories: true # Boolean | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in.
}

begin
  # Get the synchronization status for a package.
  result = api_instance.packages_status(owner, repo, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_status: #{e}"
end
```

#### Using the packages_status_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PackageStatus>, Integer, Hash)> packages_status_with_http_info(owner, repo, identifier, opts)

```ruby
begin
  # Get the synchronization status for a package.
  data, status_code, headers = api_instance.packages_status_with_http_info(owner, repo, identifier, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PackageStatus>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_status_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **identifier** | **String** |  |  |
| **include_connected_repositories** | **Boolean** | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in. | [optional][default to false] |

### Return type

[**PackageStatus**](PackageStatus.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## packages_tag

> <Package> packages_tag(owner, repo, identifier, opts)

Add/Replace/Remove tags for a package.

Add/Replace/Remove tags for a package.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 
opts = {
  data: CloudsmithApi::PackageTagRequest.new # PackageTagRequest | 
}

begin
  # Add/Replace/Remove tags for a package.
  result = api_instance.packages_tag(owner, repo, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_tag: #{e}"
end
```

#### Using the packages_tag_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Package>, Integer, Hash)> packages_tag_with_http_info(owner, repo, identifier, opts)

```ruby
begin
  # Add/Replace/Remove tags for a package.
  data, status_code, headers = api_instance.packages_tag_with_http_info(owner, repo, identifier, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Package>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_tag_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **identifier** | **String** |  |  |
| **data** | [**PackageTagRequest**](PackageTagRequest.md) |  | [optional] |

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_update_license

> <Package> packages_update_license(owner, repo, identifier, opts)

Update the license for a package.

Update the license for a package.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 
opts = {
  data: CloudsmithApi::PackageLicenseRequestPatch.new({spdx_license: 'spdx_license_example'}) # PackageLicenseRequestPatch | 
}

begin
  # Update the license for a package.
  result = api_instance.packages_update_license(owner, repo, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_update_license: #{e}"
end
```

#### Using the packages_update_license_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Package>, Integer, Hash)> packages_update_license_with_http_info(owner, repo, identifier, opts)

```ruby
begin
  # Update the license for a package.
  data, status_code, headers = api_instance.packages_update_license_with_http_info(owner, repo, identifier, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Package>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_update_license_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **identifier** | **String** |  |  |
| **data** | [**PackageLicenseRequestPatch**](PackageLicenseRequestPatch.md) |  | [optional] |

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_alpine

> <AlpinePackageUpload> packages_upload_alpine(owner, repo, opts)

Create a new Alpine package

Create a new Alpine package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::AlpinePackageUploadRequest.new({distribution: 'distribution_example', package_file: 'package_file_example'}) # AlpinePackageUploadRequest | 
}

begin
  # Create a new Alpine package
  result = api_instance.packages_upload_alpine(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_alpine: #{e}"
end
```

#### Using the packages_upload_alpine_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AlpinePackageUpload>, Integer, Hash)> packages_upload_alpine_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Alpine package
  data, status_code, headers = api_instance.packages_upload_alpine_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AlpinePackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_alpine_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**AlpinePackageUploadRequest**](AlpinePackageUploadRequest.md) |  | [optional] |

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_cargo

> <CargoPackageUpload> packages_upload_cargo(owner, repo, opts)

Create a new Cargo package

Create a new Cargo package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::CargoPackageUploadRequest.new({package_file: 'package_file_example'}) # CargoPackageUploadRequest | 
}

begin
  # Create a new Cargo package
  result = api_instance.packages_upload_cargo(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_cargo: #{e}"
end
```

#### Using the packages_upload_cargo_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CargoPackageUpload>, Integer, Hash)> packages_upload_cargo_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Cargo package
  data, status_code, headers = api_instance.packages_upload_cargo_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CargoPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_cargo_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**CargoPackageUploadRequest**](CargoPackageUploadRequest.md) |  | [optional] |

### Return type

[**CargoPackageUpload**](CargoPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_cocoapods

> <CocoapodsPackageUpload> packages_upload_cocoapods(owner, repo, opts)

Create a new CocoaPods package

Create a new CocoaPods package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::CocoapodsPackageUploadRequest.new({package_file: 'package_file_example'}) # CocoapodsPackageUploadRequest | 
}

begin
  # Create a new CocoaPods package
  result = api_instance.packages_upload_cocoapods(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_cocoapods: #{e}"
end
```

#### Using the packages_upload_cocoapods_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CocoapodsPackageUpload>, Integer, Hash)> packages_upload_cocoapods_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new CocoaPods package
  data, status_code, headers = api_instance.packages_upload_cocoapods_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CocoapodsPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_cocoapods_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**CocoapodsPackageUploadRequest**](CocoapodsPackageUploadRequest.md) |  | [optional] |

### Return type

[**CocoapodsPackageUpload**](CocoapodsPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_composer

> <ComposerPackageUpload> packages_upload_composer(owner, repo, opts)

Create a new Composer package

Create a new Composer package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::ComposerPackageUploadRequest.new({package_file: 'package_file_example'}) # ComposerPackageUploadRequest | 
}

begin
  # Create a new Composer package
  result = api_instance.packages_upload_composer(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_composer: #{e}"
end
```

#### Using the packages_upload_composer_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ComposerPackageUpload>, Integer, Hash)> packages_upload_composer_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Composer package
  data, status_code, headers = api_instance.packages_upload_composer_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ComposerPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_composer_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**ComposerPackageUploadRequest**](ComposerPackageUploadRequest.md) |  | [optional] |

### Return type

[**ComposerPackageUpload**](ComposerPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_conan

> <ConanPackageUpload> packages_upload_conan(owner, repo, opts)

Create a new Conan package

Create a new Conan package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::ConanPackageUploadRequest.new({info_file: 'info_file_example', manifest_file: 'manifest_file_example', metadata_file: 'metadata_file_example', package_file: 'package_file_example'}) # ConanPackageUploadRequest | 
}

begin
  # Create a new Conan package
  result = api_instance.packages_upload_conan(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_conan: #{e}"
end
```

#### Using the packages_upload_conan_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConanPackageUpload>, Integer, Hash)> packages_upload_conan_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Conan package
  data, status_code, headers = api_instance.packages_upload_conan_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConanPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_conan_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**ConanPackageUploadRequest**](ConanPackageUploadRequest.md) |  | [optional] |

### Return type

[**ConanPackageUpload**](ConanPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_conda

> <CondaPackageUpload> packages_upload_conda(owner, repo, opts)

Create a new Conda package

Create a new Conda package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::CondaPackageUploadRequest.new({package_file: 'package_file_example'}) # CondaPackageUploadRequest | 
}

begin
  # Create a new Conda package
  result = api_instance.packages_upload_conda(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_conda: #{e}"
end
```

#### Using the packages_upload_conda_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CondaPackageUpload>, Integer, Hash)> packages_upload_conda_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Conda package
  data, status_code, headers = api_instance.packages_upload_conda_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CondaPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_conda_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**CondaPackageUploadRequest**](CondaPackageUploadRequest.md) |  | [optional] |

### Return type

[**CondaPackageUpload**](CondaPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_cran

> <CranPackageUpload> packages_upload_cran(owner, repo, opts)

Create a new CRAN package

Create a new CRAN package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::CranPackageUploadRequest.new({package_file: 'package_file_example'}) # CranPackageUploadRequest | 
}

begin
  # Create a new CRAN package
  result = api_instance.packages_upload_cran(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_cran: #{e}"
end
```

#### Using the packages_upload_cran_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CranPackageUpload>, Integer, Hash)> packages_upload_cran_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new CRAN package
  data, status_code, headers = api_instance.packages_upload_cran_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CranPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_cran_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**CranPackageUploadRequest**](CranPackageUploadRequest.md) |  | [optional] |

### Return type

[**CranPackageUpload**](CranPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_dart

> <DartPackageUpload> packages_upload_dart(owner, repo, opts)

Create a new Dart package

Create a new Dart package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::DartPackageUploadRequest.new({package_file: 'package_file_example'}) # DartPackageUploadRequest | 
}

begin
  # Create a new Dart package
  result = api_instance.packages_upload_dart(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_dart: #{e}"
end
```

#### Using the packages_upload_dart_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DartPackageUpload>, Integer, Hash)> packages_upload_dart_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Dart package
  data, status_code, headers = api_instance.packages_upload_dart_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DartPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_dart_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**DartPackageUploadRequest**](DartPackageUploadRequest.md) |  | [optional] |

### Return type

[**DartPackageUpload**](DartPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_deb

> <DebPackageUpload> packages_upload_deb(owner, repo, opts)

Create a new Debian package

Create a new Debian package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::DebPackageUploadRequest.new({distribution: 'distribution_example', package_file: 'package_file_example'}) # DebPackageUploadRequest | 
}

begin
  # Create a new Debian package
  result = api_instance.packages_upload_deb(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_deb: #{e}"
end
```

#### Using the packages_upload_deb_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DebPackageUpload>, Integer, Hash)> packages_upload_deb_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Debian package
  data, status_code, headers = api_instance.packages_upload_deb_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DebPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_deb_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**DebPackageUploadRequest**](DebPackageUploadRequest.md) |  | [optional] |

### Return type

[**DebPackageUpload**](DebPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_docker

> <DockerPackageUpload> packages_upload_docker(owner, repo, opts)

Create a new Docker package

Create a new Docker package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::DockerPackageUploadRequest.new({package_file: 'package_file_example'}) # DockerPackageUploadRequest | 
}

begin
  # Create a new Docker package
  result = api_instance.packages_upload_docker(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_docker: #{e}"
end
```

#### Using the packages_upload_docker_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DockerPackageUpload>, Integer, Hash)> packages_upload_docker_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Docker package
  data, status_code, headers = api_instance.packages_upload_docker_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DockerPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_docker_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**DockerPackageUploadRequest**](DockerPackageUploadRequest.md) |  | [optional] |

### Return type

[**DockerPackageUpload**](DockerPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_generic

> <GenericPackageUpload> packages_upload_generic(owner, repo, opts)

Create a new Generic package

Create a new Generic package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::GenericPackageUploadRequest.new({filepath: 'filepath_example', package_file: 'package_file_example'}) # GenericPackageUploadRequest | 
}

begin
  # Create a new Generic package
  result = api_instance.packages_upload_generic(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_generic: #{e}"
end
```

#### Using the packages_upload_generic_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenericPackageUpload>, Integer, Hash)> packages_upload_generic_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Generic package
  data, status_code, headers = api_instance.packages_upload_generic_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenericPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_generic_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**GenericPackageUploadRequest**](GenericPackageUploadRequest.md) |  | [optional] |

### Return type

[**GenericPackageUpload**](GenericPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_go

> <GoPackageUpload> packages_upload_go(owner, repo, opts)

Create a new Go package

Create a new Go package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::GoPackageUploadRequest.new({package_file: 'package_file_example'}) # GoPackageUploadRequest | 
}

begin
  # Create a new Go package
  result = api_instance.packages_upload_go(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_go: #{e}"
end
```

#### Using the packages_upload_go_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GoPackageUpload>, Integer, Hash)> packages_upload_go_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Go package
  data, status_code, headers = api_instance.packages_upload_go_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GoPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_go_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**GoPackageUploadRequest**](GoPackageUploadRequest.md) |  | [optional] |

### Return type

[**GoPackageUpload**](GoPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_helm

> <HelmPackageUpload> packages_upload_helm(owner, repo, opts)

Create a new Helm package

Create a new Helm package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::HelmPackageUploadRequest.new({package_file: 'package_file_example'}) # HelmPackageUploadRequest | 
}

begin
  # Create a new Helm package
  result = api_instance.packages_upload_helm(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_helm: #{e}"
end
```

#### Using the packages_upload_helm_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<HelmPackageUpload>, Integer, Hash)> packages_upload_helm_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Helm package
  data, status_code, headers = api_instance.packages_upload_helm_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <HelmPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_helm_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**HelmPackageUploadRequest**](HelmPackageUploadRequest.md) |  | [optional] |

### Return type

[**HelmPackageUpload**](HelmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_hex

> <HexPackageUpload> packages_upload_hex(owner, repo, opts)

Create a new Hex package

Create a new Hex package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::HexPackageUploadRequest.new({package_file: 'package_file_example'}) # HexPackageUploadRequest | 
}

begin
  # Create a new Hex package
  result = api_instance.packages_upload_hex(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_hex: #{e}"
end
```

#### Using the packages_upload_hex_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<HexPackageUpload>, Integer, Hash)> packages_upload_hex_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Hex package
  data, status_code, headers = api_instance.packages_upload_hex_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <HexPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_hex_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**HexPackageUploadRequest**](HexPackageUploadRequest.md) |  | [optional] |

### Return type

[**HexPackageUpload**](HexPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_huggingface

> <HuggingfacePackageUpload> packages_upload_huggingface(owner, repo, opts)

Create a new HuggingFace package

Create a new HuggingFace package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::HuggingfacePackageUploadRequest.new({package_file: 'package_file_example'}) # HuggingfacePackageUploadRequest | 
}

begin
  # Create a new HuggingFace package
  result = api_instance.packages_upload_huggingface(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_huggingface: #{e}"
end
```

#### Using the packages_upload_huggingface_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<HuggingfacePackageUpload>, Integer, Hash)> packages_upload_huggingface_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new HuggingFace package
  data, status_code, headers = api_instance.packages_upload_huggingface_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <HuggingfacePackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_huggingface_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**HuggingfacePackageUploadRequest**](HuggingfacePackageUploadRequest.md) |  | [optional] |

### Return type

[**HuggingfacePackageUpload**](HuggingfacePackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_luarocks

> <LuarocksPackageUpload> packages_upload_luarocks(owner, repo, opts)

Create a new LuaRocks package

Create a new LuaRocks package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::LuarocksPackageUploadRequest.new({package_file: 'package_file_example'}) # LuarocksPackageUploadRequest | 
}

begin
  # Create a new LuaRocks package
  result = api_instance.packages_upload_luarocks(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_luarocks: #{e}"
end
```

#### Using the packages_upload_luarocks_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LuarocksPackageUpload>, Integer, Hash)> packages_upload_luarocks_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new LuaRocks package
  data, status_code, headers = api_instance.packages_upload_luarocks_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LuarocksPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_luarocks_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**LuarocksPackageUploadRequest**](LuarocksPackageUploadRequest.md) |  | [optional] |

### Return type

[**LuarocksPackageUpload**](LuarocksPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_maven

> <MavenPackageUpload> packages_upload_maven(owner, repo, opts)

Create a new Maven package

Create a new Maven package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::MavenPackageUploadRequest.new({package_file: 'package_file_example'}) # MavenPackageUploadRequest | 
}

begin
  # Create a new Maven package
  result = api_instance.packages_upload_maven(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_maven: #{e}"
end
```

#### Using the packages_upload_maven_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MavenPackageUpload>, Integer, Hash)> packages_upload_maven_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Maven package
  data, status_code, headers = api_instance.packages_upload_maven_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MavenPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_maven_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**MavenPackageUploadRequest**](MavenPackageUploadRequest.md) |  | [optional] |

### Return type

[**MavenPackageUpload**](MavenPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_mcp

> <McpPackageUpload> packages_upload_mcp(owner, repo, opts)

Create a new MCP package

Create a new MCP package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::McpPackageUploadRequest.new({package_file: 'package_file_example'}) # McpPackageUploadRequest | 
}

begin
  # Create a new MCP package
  result = api_instance.packages_upload_mcp(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_mcp: #{e}"
end
```

#### Using the packages_upload_mcp_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<McpPackageUpload>, Integer, Hash)> packages_upload_mcp_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new MCP package
  data, status_code, headers = api_instance.packages_upload_mcp_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <McpPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_mcp_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**McpPackageUploadRequest**](McpPackageUploadRequest.md) |  | [optional] |

### Return type

[**McpPackageUpload**](McpPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_nix

> <NixPackageUpload> packages_upload_nix(owner, repo, opts)

Create a new Nix package

Create a new Nix package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::NixPackageUploadRequest.new({package_file: 'package_file_example'}) # NixPackageUploadRequest | 
}

begin
  # Create a new Nix package
  result = api_instance.packages_upload_nix(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_nix: #{e}"
end
```

#### Using the packages_upload_nix_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<NixPackageUpload>, Integer, Hash)> packages_upload_nix_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Nix package
  data, status_code, headers = api_instance.packages_upload_nix_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <NixPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_nix_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**NixPackageUploadRequest**](NixPackageUploadRequest.md) |  | [optional] |

### Return type

[**NixPackageUpload**](NixPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_npm

> <NpmPackageUpload> packages_upload_npm(owner, repo, opts)

Create a new npm package

Create a new npm package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::NpmPackageUploadRequest.new({package_file: 'package_file_example'}) # NpmPackageUploadRequest | 
}

begin
  # Create a new npm package
  result = api_instance.packages_upload_npm(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_npm: #{e}"
end
```

#### Using the packages_upload_npm_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<NpmPackageUpload>, Integer, Hash)> packages_upload_npm_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new npm package
  data, status_code, headers = api_instance.packages_upload_npm_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <NpmPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_npm_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**NpmPackageUploadRequest**](NpmPackageUploadRequest.md) |  | [optional] |

### Return type

[**NpmPackageUpload**](NpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_nuget

> <NugetPackageUpload> packages_upload_nuget(owner, repo, opts)

Create a new NuGet package

Create a new NuGet package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::NugetPackageUploadRequest.new({package_file: 'package_file_example'}) # NugetPackageUploadRequest | 
}

begin
  # Create a new NuGet package
  result = api_instance.packages_upload_nuget(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_nuget: #{e}"
end
```

#### Using the packages_upload_nuget_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<NugetPackageUpload>, Integer, Hash)> packages_upload_nuget_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new NuGet package
  data, status_code, headers = api_instance.packages_upload_nuget_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <NugetPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_nuget_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**NugetPackageUploadRequest**](NugetPackageUploadRequest.md) |  | [optional] |

### Return type

[**NugetPackageUpload**](NugetPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_p2

> <P2PackageUpload> packages_upload_p2(owner, repo, opts)

Create a new P2 package

Create a new P2 package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::P2PackageUploadRequest.new({package_file: 'package_file_example'}) # P2PackageUploadRequest | 
}

begin
  # Create a new P2 package
  result = api_instance.packages_upload_p2(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_p2: #{e}"
end
```

#### Using the packages_upload_p2_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<P2PackageUpload>, Integer, Hash)> packages_upload_p2_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new P2 package
  data, status_code, headers = api_instance.packages_upload_p2_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <P2PackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_p2_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**P2PackageUploadRequest**](P2PackageUploadRequest.md) |  | [optional] |

### Return type

[**P2PackageUpload**](P2PackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_python

> <PythonPackageUpload> packages_upload_python(owner, repo, opts)

Create a new Python package

Create a new Python package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::PythonPackageUploadRequest.new({package_file: 'package_file_example'}) # PythonPackageUploadRequest | 
}

begin
  # Create a new Python package
  result = api_instance.packages_upload_python(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_python: #{e}"
end
```

#### Using the packages_upload_python_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PythonPackageUpload>, Integer, Hash)> packages_upload_python_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Python package
  data, status_code, headers = api_instance.packages_upload_python_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PythonPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_python_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**PythonPackageUploadRequest**](PythonPackageUploadRequest.md) |  | [optional] |

### Return type

[**PythonPackageUpload**](PythonPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_raw

> <RawPackageUpload> packages_upload_raw(owner, repo, opts)

Create a new Raw package

Create a new Raw package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::RawPackageUploadRequest.new({package_file: 'package_file_example'}) # RawPackageUploadRequest | 
}

begin
  # Create a new Raw package
  result = api_instance.packages_upload_raw(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_raw: #{e}"
end
```

#### Using the packages_upload_raw_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RawPackageUpload>, Integer, Hash)> packages_upload_raw_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Raw package
  data, status_code, headers = api_instance.packages_upload_raw_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RawPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_raw_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**RawPackageUploadRequest**](RawPackageUploadRequest.md) |  | [optional] |

### Return type

[**RawPackageUpload**](RawPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_rpm

> <RpmPackageUpload> packages_upload_rpm(owner, repo, opts)

Create a new RedHat package

Create a new RedHat package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::RpmPackageUploadRequest.new({distribution: 'distribution_example', package_file: 'package_file_example'}) # RpmPackageUploadRequest | 
}

begin
  # Create a new RedHat package
  result = api_instance.packages_upload_rpm(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_rpm: #{e}"
end
```

#### Using the packages_upload_rpm_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RpmPackageUpload>, Integer, Hash)> packages_upload_rpm_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new RedHat package
  data, status_code, headers = api_instance.packages_upload_rpm_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RpmPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_rpm_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**RpmPackageUploadRequest**](RpmPackageUploadRequest.md) |  | [optional] |

### Return type

[**RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_ruby

> <RubyPackageUpload> packages_upload_ruby(owner, repo, opts)

Create a new Ruby package

Create a new Ruby package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::RubyPackageUploadRequest.new({package_file: 'package_file_example'}) # RubyPackageUploadRequest | 
}

begin
  # Create a new Ruby package
  result = api_instance.packages_upload_ruby(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_ruby: #{e}"
end
```

#### Using the packages_upload_ruby_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RubyPackageUpload>, Integer, Hash)> packages_upload_ruby_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Ruby package
  data, status_code, headers = api_instance.packages_upload_ruby_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RubyPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_ruby_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**RubyPackageUploadRequest**](RubyPackageUploadRequest.md) |  | [optional] |

### Return type

[**RubyPackageUpload**](RubyPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_skills

> <SkillsPackageUpload> packages_upload_skills(owner, repo, opts)

Create a new AI Skills package

Create a new AI Skills package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::SkillsPackageUploadRequest.new({name: 'name_example', package_file: 'package_file_example', version: 'version_example'}) # SkillsPackageUploadRequest | 
}

begin
  # Create a new AI Skills package
  result = api_instance.packages_upload_skills(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_skills: #{e}"
end
```

#### Using the packages_upload_skills_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SkillsPackageUpload>, Integer, Hash)> packages_upload_skills_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new AI Skills package
  data, status_code, headers = api_instance.packages_upload_skills_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SkillsPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_skills_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**SkillsPackageUploadRequest**](SkillsPackageUploadRequest.md) |  | [optional] |

### Return type

[**SkillsPackageUpload**](SkillsPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_swift

> <SwiftPackageUpload> packages_upload_swift(owner, repo, opts)

Create a new Swift package

Create a new Swift package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::SwiftPackageUploadRequest.new({name: 'name_example', package_file: 'package_file_example', scope: 'scope_example', version: 'version_example'}) # SwiftPackageUploadRequest | 
}

begin
  # Create a new Swift package
  result = api_instance.packages_upload_swift(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_swift: #{e}"
end
```

#### Using the packages_upload_swift_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SwiftPackageUpload>, Integer, Hash)> packages_upload_swift_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Swift package
  data, status_code, headers = api_instance.packages_upload_swift_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SwiftPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_swift_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**SwiftPackageUploadRequest**](SwiftPackageUploadRequest.md) |  | [optional] |

### Return type

[**SwiftPackageUpload**](SwiftPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_terraform

> <TerraformPackageUpload> packages_upload_terraform(owner, repo, opts)

Create a new Terraform package

Create a new Terraform package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::TerraformPackageUploadRequest.new({package_file: 'package_file_example'}) # TerraformPackageUploadRequest | 
}

begin
  # Create a new Terraform package
  result = api_instance.packages_upload_terraform(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_terraform: #{e}"
end
```

#### Using the packages_upload_terraform_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<TerraformPackageUpload>, Integer, Hash)> packages_upload_terraform_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Terraform package
  data, status_code, headers = api_instance.packages_upload_terraform_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <TerraformPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_terraform_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**TerraformPackageUploadRequest**](TerraformPackageUploadRequest.md) |  | [optional] |

### Return type

[**TerraformPackageUpload**](TerraformPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_vagrant

> <VagrantPackageUpload> packages_upload_vagrant(owner, repo, opts)

Create a new Vagrant package

Create a new Vagrant package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::VagrantPackageUploadRequest.new({name: 'name_example', package_file: 'package_file_example', provider: 'provider_example', version: 'version_example'}) # VagrantPackageUploadRequest | 
}

begin
  # Create a new Vagrant package
  result = api_instance.packages_upload_vagrant(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_vagrant: #{e}"
end
```

#### Using the packages_upload_vagrant_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<VagrantPackageUpload>, Integer, Hash)> packages_upload_vagrant_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new Vagrant package
  data, status_code, headers = api_instance.packages_upload_vagrant_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <VagrantPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_vagrant_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**VagrantPackageUploadRequest**](VagrantPackageUploadRequest.md) |  | [optional] |

### Return type

[**VagrantPackageUpload**](VagrantPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_upload_vsx

> <VsxPackageUpload> packages_upload_vsx(owner, repo, opts)

Create a new VSX package

Create a new VSX package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::VsxPackageUploadRequest.new({package_file: 'package_file_example'}) # VsxPackageUploadRequest | 
}

begin
  # Create a new VSX package
  result = api_instance.packages_upload_vsx(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_vsx: #{e}"
end
```

#### Using the packages_upload_vsx_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<VsxPackageUpload>, Integer, Hash)> packages_upload_vsx_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a new VSX package
  data, status_code, headers = api_instance.packages_upload_vsx_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <VsxPackageUpload>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_upload_vsx_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**VsxPackageUploadRequest**](VsxPackageUploadRequest.md) |  | [optional] |

### Return type

[**VsxPackageUpload**](VsxPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_alpine

> packages_validate_upload_alpine(owner, repo, opts)

Validate parameters for create Alpine package

Validate parameters for create Alpine package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::AlpinePackageUploadRequest.new({distribution: 'distribution_example', package_file: 'package_file_example'}) # AlpinePackageUploadRequest | 
}

begin
  # Validate parameters for create Alpine package
  api_instance.packages_validate_upload_alpine(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_alpine: #{e}"
end
```

#### Using the packages_validate_upload_alpine_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_alpine_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Alpine package
  data, status_code, headers = api_instance.packages_validate_upload_alpine_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_alpine_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**AlpinePackageUploadRequest**](AlpinePackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_cargo

> packages_validate_upload_cargo(owner, repo, opts)

Validate parameters for create Cargo package

Validate parameters for create Cargo package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::CargoPackageUploadRequest.new({package_file: 'package_file_example'}) # CargoPackageUploadRequest | 
}

begin
  # Validate parameters for create Cargo package
  api_instance.packages_validate_upload_cargo(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_cargo: #{e}"
end
```

#### Using the packages_validate_upload_cargo_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_cargo_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Cargo package
  data, status_code, headers = api_instance.packages_validate_upload_cargo_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_cargo_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**CargoPackageUploadRequest**](CargoPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_cocoapods

> packages_validate_upload_cocoapods(owner, repo, opts)

Validate parameters for create CocoaPods package

Validate parameters for create CocoaPods package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::CocoapodsPackageUploadRequest.new({package_file: 'package_file_example'}) # CocoapodsPackageUploadRequest | 
}

begin
  # Validate parameters for create CocoaPods package
  api_instance.packages_validate_upload_cocoapods(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_cocoapods: #{e}"
end
```

#### Using the packages_validate_upload_cocoapods_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_cocoapods_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create CocoaPods package
  data, status_code, headers = api_instance.packages_validate_upload_cocoapods_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_cocoapods_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**CocoapodsPackageUploadRequest**](CocoapodsPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_composer

> packages_validate_upload_composer(owner, repo, opts)

Validate parameters for create Composer package

Validate parameters for create Composer package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::ComposerPackageUploadRequest.new({package_file: 'package_file_example'}) # ComposerPackageUploadRequest | 
}

begin
  # Validate parameters for create Composer package
  api_instance.packages_validate_upload_composer(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_composer: #{e}"
end
```

#### Using the packages_validate_upload_composer_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_composer_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Composer package
  data, status_code, headers = api_instance.packages_validate_upload_composer_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_composer_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**ComposerPackageUploadRequest**](ComposerPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_conan

> packages_validate_upload_conan(owner, repo, opts)

Validate parameters for create Conan package

Validate parameters for create Conan package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::ConanPackageUploadRequest.new({info_file: 'info_file_example', manifest_file: 'manifest_file_example', metadata_file: 'metadata_file_example', package_file: 'package_file_example'}) # ConanPackageUploadRequest | 
}

begin
  # Validate parameters for create Conan package
  api_instance.packages_validate_upload_conan(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_conan: #{e}"
end
```

#### Using the packages_validate_upload_conan_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_conan_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Conan package
  data, status_code, headers = api_instance.packages_validate_upload_conan_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_conan_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**ConanPackageUploadRequest**](ConanPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_conda

> packages_validate_upload_conda(owner, repo, opts)

Validate parameters for create Conda package

Validate parameters for create Conda package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::CondaPackageUploadRequest.new({package_file: 'package_file_example'}) # CondaPackageUploadRequest | 
}

begin
  # Validate parameters for create Conda package
  api_instance.packages_validate_upload_conda(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_conda: #{e}"
end
```

#### Using the packages_validate_upload_conda_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_conda_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Conda package
  data, status_code, headers = api_instance.packages_validate_upload_conda_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_conda_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**CondaPackageUploadRequest**](CondaPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_cran

> packages_validate_upload_cran(owner, repo, opts)

Validate parameters for create CRAN package

Validate parameters for create CRAN package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::CranPackageUploadRequest.new({package_file: 'package_file_example'}) # CranPackageUploadRequest | 
}

begin
  # Validate parameters for create CRAN package
  api_instance.packages_validate_upload_cran(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_cran: #{e}"
end
```

#### Using the packages_validate_upload_cran_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_cran_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create CRAN package
  data, status_code, headers = api_instance.packages_validate_upload_cran_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_cran_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**CranPackageUploadRequest**](CranPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_dart

> packages_validate_upload_dart(owner, repo, opts)

Validate parameters for create Dart package

Validate parameters for create Dart package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::DartPackageUploadRequest.new({package_file: 'package_file_example'}) # DartPackageUploadRequest | 
}

begin
  # Validate parameters for create Dart package
  api_instance.packages_validate_upload_dart(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_dart: #{e}"
end
```

#### Using the packages_validate_upload_dart_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_dart_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Dart package
  data, status_code, headers = api_instance.packages_validate_upload_dart_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_dart_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**DartPackageUploadRequest**](DartPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_deb

> packages_validate_upload_deb(owner, repo, opts)

Validate parameters for create Debian package

Validate parameters for create Debian package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::DebPackageUploadRequest.new({distribution: 'distribution_example', package_file: 'package_file_example'}) # DebPackageUploadRequest | 
}

begin
  # Validate parameters for create Debian package
  api_instance.packages_validate_upload_deb(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_deb: #{e}"
end
```

#### Using the packages_validate_upload_deb_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_deb_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Debian package
  data, status_code, headers = api_instance.packages_validate_upload_deb_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_deb_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**DebPackageUploadRequest**](DebPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_docker

> packages_validate_upload_docker(owner, repo, opts)

Validate parameters for create Docker package

Validate parameters for create Docker package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::DockerPackageUploadRequest.new({package_file: 'package_file_example'}) # DockerPackageUploadRequest | 
}

begin
  # Validate parameters for create Docker package
  api_instance.packages_validate_upload_docker(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_docker: #{e}"
end
```

#### Using the packages_validate_upload_docker_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_docker_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Docker package
  data, status_code, headers = api_instance.packages_validate_upload_docker_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_docker_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**DockerPackageUploadRequest**](DockerPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_generic

> packages_validate_upload_generic(owner, repo, opts)

Validate parameters for create Generic package

Validate parameters for create Generic package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::GenericPackageUploadRequest.new({filepath: 'filepath_example', package_file: 'package_file_example'}) # GenericPackageUploadRequest | 
}

begin
  # Validate parameters for create Generic package
  api_instance.packages_validate_upload_generic(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_generic: #{e}"
end
```

#### Using the packages_validate_upload_generic_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_generic_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Generic package
  data, status_code, headers = api_instance.packages_validate_upload_generic_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_generic_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**GenericPackageUploadRequest**](GenericPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_go

> packages_validate_upload_go(owner, repo, opts)

Validate parameters for create Go package

Validate parameters for create Go package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::GoPackageUploadRequest.new({package_file: 'package_file_example'}) # GoPackageUploadRequest | 
}

begin
  # Validate parameters for create Go package
  api_instance.packages_validate_upload_go(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_go: #{e}"
end
```

#### Using the packages_validate_upload_go_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_go_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Go package
  data, status_code, headers = api_instance.packages_validate_upload_go_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_go_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**GoPackageUploadRequest**](GoPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_helm

> packages_validate_upload_helm(owner, repo, opts)

Validate parameters for create Helm package

Validate parameters for create Helm package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::HelmPackageUploadRequest.new({package_file: 'package_file_example'}) # HelmPackageUploadRequest | 
}

begin
  # Validate parameters for create Helm package
  api_instance.packages_validate_upload_helm(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_helm: #{e}"
end
```

#### Using the packages_validate_upload_helm_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_helm_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Helm package
  data, status_code, headers = api_instance.packages_validate_upload_helm_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_helm_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**HelmPackageUploadRequest**](HelmPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_hex

> packages_validate_upload_hex(owner, repo, opts)

Validate parameters for create Hex package

Validate parameters for create Hex package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::HexPackageUploadRequest.new({package_file: 'package_file_example'}) # HexPackageUploadRequest | 
}

begin
  # Validate parameters for create Hex package
  api_instance.packages_validate_upload_hex(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_hex: #{e}"
end
```

#### Using the packages_validate_upload_hex_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_hex_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Hex package
  data, status_code, headers = api_instance.packages_validate_upload_hex_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_hex_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**HexPackageUploadRequest**](HexPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_huggingface

> packages_validate_upload_huggingface(owner, repo, opts)

Validate parameters for create HuggingFace package

Validate parameters for create HuggingFace package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::HuggingfacePackageUploadRequest.new({package_file: 'package_file_example'}) # HuggingfacePackageUploadRequest | 
}

begin
  # Validate parameters for create HuggingFace package
  api_instance.packages_validate_upload_huggingface(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_huggingface: #{e}"
end
```

#### Using the packages_validate_upload_huggingface_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_huggingface_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create HuggingFace package
  data, status_code, headers = api_instance.packages_validate_upload_huggingface_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_huggingface_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**HuggingfacePackageUploadRequest**](HuggingfacePackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_luarocks

> packages_validate_upload_luarocks(owner, repo, opts)

Validate parameters for create LuaRocks package

Validate parameters for create LuaRocks package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::LuarocksPackageUploadRequest.new({package_file: 'package_file_example'}) # LuarocksPackageUploadRequest | 
}

begin
  # Validate parameters for create LuaRocks package
  api_instance.packages_validate_upload_luarocks(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_luarocks: #{e}"
end
```

#### Using the packages_validate_upload_luarocks_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_luarocks_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create LuaRocks package
  data, status_code, headers = api_instance.packages_validate_upload_luarocks_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_luarocks_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**LuarocksPackageUploadRequest**](LuarocksPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_maven

> packages_validate_upload_maven(owner, repo, opts)

Validate parameters for create Maven package

Validate parameters for create Maven package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::MavenPackageUploadRequest.new({package_file: 'package_file_example'}) # MavenPackageUploadRequest | 
}

begin
  # Validate parameters for create Maven package
  api_instance.packages_validate_upload_maven(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_maven: #{e}"
end
```

#### Using the packages_validate_upload_maven_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_maven_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Maven package
  data, status_code, headers = api_instance.packages_validate_upload_maven_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_maven_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**MavenPackageUploadRequest**](MavenPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_mcp

> packages_validate_upload_mcp(owner, repo, opts)

Validate parameters for create MCP package

Validate parameters for create MCP package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::McpPackageUploadRequest.new({package_file: 'package_file_example'}) # McpPackageUploadRequest | 
}

begin
  # Validate parameters for create MCP package
  api_instance.packages_validate_upload_mcp(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_mcp: #{e}"
end
```

#### Using the packages_validate_upload_mcp_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_mcp_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create MCP package
  data, status_code, headers = api_instance.packages_validate_upload_mcp_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_mcp_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**McpPackageUploadRequest**](McpPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_nix

> packages_validate_upload_nix(owner, repo, opts)

Validate parameters for create Nix package

Validate parameters for create Nix package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::NixPackageUploadRequest.new({package_file: 'package_file_example'}) # NixPackageUploadRequest | 
}

begin
  # Validate parameters for create Nix package
  api_instance.packages_validate_upload_nix(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_nix: #{e}"
end
```

#### Using the packages_validate_upload_nix_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_nix_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Nix package
  data, status_code, headers = api_instance.packages_validate_upload_nix_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_nix_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**NixPackageUploadRequest**](NixPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_npm

> packages_validate_upload_npm(owner, repo, opts)

Validate parameters for create npm package

Validate parameters for create npm package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::NpmPackageUploadRequest.new({package_file: 'package_file_example'}) # NpmPackageUploadRequest | 
}

begin
  # Validate parameters for create npm package
  api_instance.packages_validate_upload_npm(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_npm: #{e}"
end
```

#### Using the packages_validate_upload_npm_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_npm_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create npm package
  data, status_code, headers = api_instance.packages_validate_upload_npm_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_npm_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**NpmPackageUploadRequest**](NpmPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_nuget

> packages_validate_upload_nuget(owner, repo, opts)

Validate parameters for create NuGet package

Validate parameters for create NuGet package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::NugetPackageUploadRequest.new({package_file: 'package_file_example'}) # NugetPackageUploadRequest | 
}

begin
  # Validate parameters for create NuGet package
  api_instance.packages_validate_upload_nuget(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_nuget: #{e}"
end
```

#### Using the packages_validate_upload_nuget_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_nuget_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create NuGet package
  data, status_code, headers = api_instance.packages_validate_upload_nuget_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_nuget_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**NugetPackageUploadRequest**](NugetPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_p2

> packages_validate_upload_p2(owner, repo, opts)

Validate parameters for create P2 package

Validate parameters for create P2 package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::P2PackageUploadRequest.new({package_file: 'package_file_example'}) # P2PackageUploadRequest | 
}

begin
  # Validate parameters for create P2 package
  api_instance.packages_validate_upload_p2(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_p2: #{e}"
end
```

#### Using the packages_validate_upload_p2_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_p2_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create P2 package
  data, status_code, headers = api_instance.packages_validate_upload_p2_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_p2_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**P2PackageUploadRequest**](P2PackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_python

> packages_validate_upload_python(owner, repo, opts)

Validate parameters for create Python package

Validate parameters for create Python package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::PythonPackageUploadRequest.new({package_file: 'package_file_example'}) # PythonPackageUploadRequest | 
}

begin
  # Validate parameters for create Python package
  api_instance.packages_validate_upload_python(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_python: #{e}"
end
```

#### Using the packages_validate_upload_python_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_python_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Python package
  data, status_code, headers = api_instance.packages_validate_upload_python_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_python_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**PythonPackageUploadRequest**](PythonPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_raw

> packages_validate_upload_raw(owner, repo, opts)

Validate parameters for create Raw package

Validate parameters for create Raw package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::RawPackageUploadRequest.new({package_file: 'package_file_example'}) # RawPackageUploadRequest | 
}

begin
  # Validate parameters for create Raw package
  api_instance.packages_validate_upload_raw(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_raw: #{e}"
end
```

#### Using the packages_validate_upload_raw_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_raw_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Raw package
  data, status_code, headers = api_instance.packages_validate_upload_raw_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_raw_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**RawPackageUploadRequest**](RawPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_rpm

> packages_validate_upload_rpm(owner, repo, opts)

Validate parameters for create RedHat package

Validate parameters for create RedHat package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::RpmPackageUploadRequest.new({distribution: 'distribution_example', package_file: 'package_file_example'}) # RpmPackageUploadRequest | 
}

begin
  # Validate parameters for create RedHat package
  api_instance.packages_validate_upload_rpm(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_rpm: #{e}"
end
```

#### Using the packages_validate_upload_rpm_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_rpm_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create RedHat package
  data, status_code, headers = api_instance.packages_validate_upload_rpm_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_rpm_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**RpmPackageUploadRequest**](RpmPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_ruby

> packages_validate_upload_ruby(owner, repo, opts)

Validate parameters for create Ruby package

Validate parameters for create Ruby package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::RubyPackageUploadRequest.new({package_file: 'package_file_example'}) # RubyPackageUploadRequest | 
}

begin
  # Validate parameters for create Ruby package
  api_instance.packages_validate_upload_ruby(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_ruby: #{e}"
end
```

#### Using the packages_validate_upload_ruby_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_ruby_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Ruby package
  data, status_code, headers = api_instance.packages_validate_upload_ruby_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_ruby_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**RubyPackageUploadRequest**](RubyPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_skills

> packages_validate_upload_skills(owner, repo, opts)

Validate parameters for create AI Skills package

Validate parameters for create AI Skills package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::SkillsPackageUploadRequest.new({name: 'name_example', package_file: 'package_file_example', version: 'version_example'}) # SkillsPackageUploadRequest | 
}

begin
  # Validate parameters for create AI Skills package
  api_instance.packages_validate_upload_skills(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_skills: #{e}"
end
```

#### Using the packages_validate_upload_skills_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_skills_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create AI Skills package
  data, status_code, headers = api_instance.packages_validate_upload_skills_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_skills_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**SkillsPackageUploadRequest**](SkillsPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_swift

> packages_validate_upload_swift(owner, repo, opts)

Validate parameters for create Swift package

Validate parameters for create Swift package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::SwiftPackageUploadRequest.new({name: 'name_example', package_file: 'package_file_example', scope: 'scope_example', version: 'version_example'}) # SwiftPackageUploadRequest | 
}

begin
  # Validate parameters for create Swift package
  api_instance.packages_validate_upload_swift(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_swift: #{e}"
end
```

#### Using the packages_validate_upload_swift_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_swift_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Swift package
  data, status_code, headers = api_instance.packages_validate_upload_swift_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_swift_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**SwiftPackageUploadRequest**](SwiftPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_terraform

> packages_validate_upload_terraform(owner, repo, opts)

Validate parameters for create Terraform package

Validate parameters for create Terraform package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::TerraformPackageUploadRequest.new({package_file: 'package_file_example'}) # TerraformPackageUploadRequest | 
}

begin
  # Validate parameters for create Terraform package
  api_instance.packages_validate_upload_terraform(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_terraform: #{e}"
end
```

#### Using the packages_validate_upload_terraform_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_terraform_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Terraform package
  data, status_code, headers = api_instance.packages_validate_upload_terraform_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_terraform_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**TerraformPackageUploadRequest**](TerraformPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_vagrant

> packages_validate_upload_vagrant(owner, repo, opts)

Validate parameters for create Vagrant package

Validate parameters for create Vagrant package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::VagrantPackageUploadRequest.new({name: 'name_example', package_file: 'package_file_example', provider: 'provider_example', version: 'version_example'}) # VagrantPackageUploadRequest | 
}

begin
  # Validate parameters for create Vagrant package
  api_instance.packages_validate_upload_vagrant(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_vagrant: #{e}"
end
```

#### Using the packages_validate_upload_vagrant_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_vagrant_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create Vagrant package
  data, status_code, headers = api_instance.packages_validate_upload_vagrant_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_vagrant_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**VagrantPackageUploadRequest**](VagrantPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## packages_validate_upload_vsx

> packages_validate_upload_vsx(owner, repo, opts)

Validate parameters for create VSX package

Validate parameters for create VSX package

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::PackagesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  data: CloudsmithApi::VsxPackageUploadRequest.new({package_file: 'package_file_example'}) # VsxPackageUploadRequest | 
}

begin
  # Validate parameters for create VSX package
  api_instance.packages_validate_upload_vsx(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_vsx: #{e}"
end
```

#### Using the packages_validate_upload_vsx_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> packages_validate_upload_vsx_with_http_info(owner, repo, opts)

```ruby
begin
  # Validate parameters for create VSX package
  data, status_code, headers = api_instance.packages_validate_upload_vsx_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling PackagesApi->packages_validate_upload_vsx_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **data** | [**VsxPackageUploadRequest**](VsxPackageUploadRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

