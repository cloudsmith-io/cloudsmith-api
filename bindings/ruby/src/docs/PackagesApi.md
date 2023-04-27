# CloudsmithApi::PackagesApi

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
> PackageCopy packages_copy(owner, repo, identifier, opts)

Copy a package to another repository.

Copy a package to another repository.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::PackageCopyRequest.new # PackageCopyRequest | 
}

begin
  #Copy a package to another repository.
  result = api_instance.packages_copy(owner, repo, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_copy: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**PackageCopyRequest**](PackageCopyRequest.md)|  | [optional] 

### Return type

[**PackageCopy**](PackageCopy.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_delete**
> packages_delete(owner, repo, identifier)

Delete a specific package in a repository.

Delete a specific package in a repository.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Delete a specific package in a repository.
  api_instance.packages_delete(owner, repo, identifier)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_dependencies**
> PackageDependencies packages_dependencies(owner, repo, identifier)

Get the list of dependencies for a package. Transitive dependencies are included where supported.

Get the list of dependencies for a package. Transitive dependencies are included where supported.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Get the list of dependencies for a package. Transitive dependencies are included where supported.
  result = api_instance.packages_dependencies(owner, repo, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_dependencies: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

[**PackageDependencies**](PackageDependencies.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_list**
> Array&lt;Package&gt; packages_list(owner, repo, opts)

Get a list of all packages associated with repository.

Get a list of all packages associated with repository.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  query: '', # String | A search term for querying names, filenames, versions, distributions, architectures, formats or statuses of packages.
  sort: '-date' # String | A field for sorting objects in ascending or descending order.
}

begin
  #Get a list of all packages associated with repository.
  result = api_instance.packages_list(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 
 **query** | **String**| A search term for querying names, filenames, versions, distributions, architectures, formats or statuses of packages. | [optional] [default to ]
 **sort** | **String**| A field for sorting objects in ascending or descending order. | [optional] [default to -date]

### Return type

[**Array&lt;Package&gt;**](Package.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_move**
> PackageMove packages_move(owner, repo, identifier, opts)

Move a package to another repository.

Move a package to another repository.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::PackageMoveRequest.new # PackageMoveRequest | 
}

begin
  #Move a package to another repository.
  result = api_instance.packages_move(owner, repo, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_move: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**PackageMoveRequest**](PackageMoveRequest.md)|  | [optional] 

### Return type

[**PackageMove**](PackageMove.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_quarantine**
> PackageQuarantine packages_quarantine(owner, repo, identifier, opts)

Quarantine or restore a package.

Quarantine or restore a package.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::PackageQuarantineRequest.new # PackageQuarantineRequest | 
}

begin
  #Quarantine or restore a package.
  result = api_instance.packages_quarantine(owner, repo, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_quarantine: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**PackageQuarantineRequest**](PackageQuarantineRequest.md)|  | [optional] 

### Return type

[**PackageQuarantine**](PackageQuarantine.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_read**
> Package packages_read(owner, repo, identifier)

Get a specific package in a repository.

Get a specific package in a repository.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Get a specific package in a repository.
  result = api_instance.packages_read(owner, repo, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_resync**
> PackageResync packages_resync(owner, repo, identifier)

Schedule a package for resynchronisation.

Schedule a package for resynchronisation.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Schedule a package for resynchronisation.
  result = api_instance.packages_resync(owner, repo, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_resync: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

[**PackageResync**](PackageResync.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_scan**
> Package packages_scan(owner, repo, identifier)

Schedule a package for scanning.

Schedule a package for scanning.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Schedule a package for scanning.
  result = api_instance.packages_scan(owner, repo, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_scan: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_status**
> PackageStatus packages_status(owner, repo, identifier)

Get the synchronisation status for a package.

Get the synchronisation status for a package.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Get the synchronisation status for a package.
  result = api_instance.packages_status(owner, repo, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_status: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

[**PackageStatus**](PackageStatus.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_tag**
> Package packages_tag(owner, repo, identifier, opts)

Add/Replace/Remove tags for a package.

Add/Replace/Remove tags for a package.

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::PackageTagRequest.new # PackageTagRequest | 
}

begin
  #Add/Replace/Remove tags for a package.
  result = api_instance.packages_tag(owner, repo, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_tag: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**PackageTagRequest**](PackageTagRequest.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_alpine**
> AlpinePackageUpload packages_upload_alpine(owner, repo, opts)

Create a new Alpine package

Create a new Alpine package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::AlpinePackageUploadRequest.new # AlpinePackageUploadRequest | 
}

begin
  #Create a new Alpine package
  result = api_instance.packages_upload_alpine(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_alpine: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**AlpinePackageUploadRequest**](AlpinePackageUploadRequest.md)|  | [optional] 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_cargo**
> CargoPackageUpload packages_upload_cargo(owner, repo, opts)

Create a new Cargo package

Create a new Cargo package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::CargoPackageUploadRequest.new # CargoPackageUploadRequest | 
}

begin
  #Create a new Cargo package
  result = api_instance.packages_upload_cargo(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_cargo: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**CargoPackageUploadRequest**](CargoPackageUploadRequest.md)|  | [optional] 

### Return type

[**CargoPackageUpload**](CargoPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_cocoapods**
> CocoapodsPackageUpload packages_upload_cocoapods(owner, repo, opts)

Create a new CocoaPods package

Create a new CocoaPods package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::CocoapodsPackageUploadRequest.new # CocoapodsPackageUploadRequest | 
}

begin
  #Create a new CocoaPods package
  result = api_instance.packages_upload_cocoapods(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_cocoapods: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**CocoapodsPackageUploadRequest**](CocoapodsPackageUploadRequest.md)|  | [optional] 

### Return type

[**CocoapodsPackageUpload**](CocoapodsPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_composer**
> ComposerPackageUpload packages_upload_composer(owner, repo, opts)

Create a new Composer package

Create a new Composer package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::ComposerPackageUploadRequest.new # ComposerPackageUploadRequest | 
}

begin
  #Create a new Composer package
  result = api_instance.packages_upload_composer(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_composer: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**ComposerPackageUploadRequest**](ComposerPackageUploadRequest.md)|  | [optional] 

### Return type

[**ComposerPackageUpload**](ComposerPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_conan**
> ConanPackageUpload packages_upload_conan(owner, repo, opts)

Create a new Conan package

Create a new Conan package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::ConanPackageUploadRequest.new # ConanPackageUploadRequest | 
}

begin
  #Create a new Conan package
  result = api_instance.packages_upload_conan(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_conan: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**ConanPackageUploadRequest**](ConanPackageUploadRequest.md)|  | [optional] 

### Return type

[**ConanPackageUpload**](ConanPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_conda**
> CondaPackageUpload packages_upload_conda(owner, repo, opts)

Create a new Conda package

Create a new Conda package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::CondaPackageUploadRequest.new # CondaPackageUploadRequest | 
}

begin
  #Create a new Conda package
  result = api_instance.packages_upload_conda(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_conda: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**CondaPackageUploadRequest**](CondaPackageUploadRequest.md)|  | [optional] 

### Return type

[**CondaPackageUpload**](CondaPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_cran**
> CranPackageUpload packages_upload_cran(owner, repo, opts)

Create a new CRAN package

Create a new CRAN package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::CranPackageUploadRequest.new # CranPackageUploadRequest | 
}

begin
  #Create a new CRAN package
  result = api_instance.packages_upload_cran(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_cran: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**CranPackageUploadRequest**](CranPackageUploadRequest.md)|  | [optional] 

### Return type

[**CranPackageUpload**](CranPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_dart**
> DartPackageUpload packages_upload_dart(owner, repo, opts)

Create a new Dart package

Create a new Dart package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::DartPackageUploadRequest.new # DartPackageUploadRequest | 
}

begin
  #Create a new Dart package
  result = api_instance.packages_upload_dart(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_dart: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**DartPackageUploadRequest**](DartPackageUploadRequest.md)|  | [optional] 

### Return type

[**DartPackageUpload**](DartPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_deb**
> DebPackageUpload packages_upload_deb(owner, repo, opts)

Create a new Debian package

Create a new Debian package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::DebPackageUploadRequest.new # DebPackageUploadRequest | 
}

begin
  #Create a new Debian package
  result = api_instance.packages_upload_deb(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_deb: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**DebPackageUploadRequest**](DebPackageUploadRequest.md)|  | [optional] 

### Return type

[**DebPackageUpload**](DebPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_docker**
> DockerPackageUpload packages_upload_docker(owner, repo, opts)

Create a new Docker package

Create a new Docker package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::DockerPackageUploadRequest.new # DockerPackageUploadRequest | 
}

begin
  #Create a new Docker package
  result = api_instance.packages_upload_docker(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_docker: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**DockerPackageUploadRequest**](DockerPackageUploadRequest.md)|  | [optional] 

### Return type

[**DockerPackageUpload**](DockerPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_go**
> GoPackageUpload packages_upload_go(owner, repo, opts)

Create a new Go package

Create a new Go package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::GoPackageUploadRequest.new # GoPackageUploadRequest | 
}

begin
  #Create a new Go package
  result = api_instance.packages_upload_go(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_go: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**GoPackageUploadRequest**](GoPackageUploadRequest.md)|  | [optional] 

### Return type

[**GoPackageUpload**](GoPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_helm**
> HelmPackageUpload packages_upload_helm(owner, repo, opts)

Create a new Helm package

Create a new Helm package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::HelmPackageUploadRequest.new # HelmPackageUploadRequest | 
}

begin
  #Create a new Helm package
  result = api_instance.packages_upload_helm(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_helm: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**HelmPackageUploadRequest**](HelmPackageUploadRequest.md)|  | [optional] 

### Return type

[**HelmPackageUpload**](HelmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_luarocks**
> LuarocksPackageUpload packages_upload_luarocks(owner, repo, opts)

Create a new LuaRocks package

Create a new LuaRocks package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::LuarocksPackageUploadRequest.new # LuarocksPackageUploadRequest | 
}

begin
  #Create a new LuaRocks package
  result = api_instance.packages_upload_luarocks(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_luarocks: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**LuarocksPackageUploadRequest**](LuarocksPackageUploadRequest.md)|  | [optional] 

### Return type

[**LuarocksPackageUpload**](LuarocksPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_maven**
> MavenPackageUpload packages_upload_maven(owner, repo, opts)

Create a new Maven package

Create a new Maven package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::MavenPackageUploadRequest.new # MavenPackageUploadRequest | 
}

begin
  #Create a new Maven package
  result = api_instance.packages_upload_maven(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_maven: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**MavenPackageUploadRequest**](MavenPackageUploadRequest.md)|  | [optional] 

### Return type

[**MavenPackageUpload**](MavenPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_npm**
> NpmPackageUpload packages_upload_npm(owner, repo, opts)

Create a new npm package

Create a new npm package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::NpmPackageUploadRequest.new # NpmPackageUploadRequest | 
}

begin
  #Create a new npm package
  result = api_instance.packages_upload_npm(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_npm: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**NpmPackageUploadRequest**](NpmPackageUploadRequest.md)|  | [optional] 

### Return type

[**NpmPackageUpload**](NpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_nuget**
> NugetPackageUpload packages_upload_nuget(owner, repo, opts)

Create a new NuGet package

Create a new NuGet package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::NugetPackageUploadRequest.new # NugetPackageUploadRequest | 
}

begin
  #Create a new NuGet package
  result = api_instance.packages_upload_nuget(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_nuget: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**NugetPackageUploadRequest**](NugetPackageUploadRequest.md)|  | [optional] 

### Return type

[**NugetPackageUpload**](NugetPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_p2**
> P2PackageUpload packages_upload_p2(owner, repo, opts)

Create a new P2 package

Create a new P2 package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::P2PackageUploadRequest.new # P2PackageUploadRequest | 
}

begin
  #Create a new P2 package
  result = api_instance.packages_upload_p2(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_p2: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**P2PackageUploadRequest**](P2PackageUploadRequest.md)|  | [optional] 

### Return type

[**P2PackageUpload**](P2PackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_python**
> PythonPackageUpload packages_upload_python(owner, repo, opts)

Create a new Python package

Create a new Python package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::PythonPackageUploadRequest.new # PythonPackageUploadRequest | 
}

begin
  #Create a new Python package
  result = api_instance.packages_upload_python(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_python: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**PythonPackageUploadRequest**](PythonPackageUploadRequest.md)|  | [optional] 

### Return type

[**PythonPackageUpload**](PythonPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_raw**
> RawPackageUpload packages_upload_raw(owner, repo, opts)

Create a new Raw package

Create a new Raw package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::RawPackageUploadRequest.new # RawPackageUploadRequest | 
}

begin
  #Create a new Raw package
  result = api_instance.packages_upload_raw(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_raw: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**RawPackageUploadRequest**](RawPackageUploadRequest.md)|  | [optional] 

### Return type

[**RawPackageUpload**](RawPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_rpm**
> RpmPackageUpload packages_upload_rpm(owner, repo, opts)

Create a new RedHat package

Create a new RedHat package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::RpmPackageUploadRequest.new # RpmPackageUploadRequest | 
}

begin
  #Create a new RedHat package
  result = api_instance.packages_upload_rpm(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_rpm: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**RpmPackageUploadRequest**](RpmPackageUploadRequest.md)|  | [optional] 

### Return type

[**RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_ruby**
> RubyPackageUpload packages_upload_ruby(owner, repo, opts)

Create a new Ruby package

Create a new Ruby package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::RubyPackageUploadRequest.new # RubyPackageUploadRequest | 
}

begin
  #Create a new Ruby package
  result = api_instance.packages_upload_ruby(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_ruby: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**RubyPackageUploadRequest**](RubyPackageUploadRequest.md)|  | [optional] 

### Return type

[**RubyPackageUpload**](RubyPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_terraform**
> TerraformPackageUpload packages_upload_terraform(owner, repo, opts)

Create a new Terraform package

Create a new Terraform package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::TerraformPackageUploadRequest.new # TerraformPackageUploadRequest | 
}

begin
  #Create a new Terraform package
  result = api_instance.packages_upload_terraform(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_terraform: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**TerraformPackageUploadRequest**](TerraformPackageUploadRequest.md)|  | [optional] 

### Return type

[**TerraformPackageUpload**](TerraformPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_upload_vagrant**
> VagrantPackageUpload packages_upload_vagrant(owner, repo, opts)

Create a new Vagrant package

Create a new Vagrant package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::VagrantPackageUploadRequest.new # VagrantPackageUploadRequest | 
}

begin
  #Create a new Vagrant package
  result = api_instance.packages_upload_vagrant(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_upload_vagrant: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**VagrantPackageUploadRequest**](VagrantPackageUploadRequest.md)|  | [optional] 

### Return type

[**VagrantPackageUpload**](VagrantPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_alpine**
> packages_validate_upload_alpine(owner, repo, opts)

Validate parameters for create Alpine package

Validate parameters for create Alpine package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::AlpinePackageUploadRequest.new # AlpinePackageUploadRequest | 
}

begin
  #Validate parameters for create Alpine package
  api_instance.packages_validate_upload_alpine(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_alpine: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**AlpinePackageUploadRequest**](AlpinePackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_cargo**
> packages_validate_upload_cargo(owner, repo, opts)

Validate parameters for create Cargo package

Validate parameters for create Cargo package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::CargoPackageUploadRequest.new # CargoPackageUploadRequest | 
}

begin
  #Validate parameters for create Cargo package
  api_instance.packages_validate_upload_cargo(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_cargo: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**CargoPackageUploadRequest**](CargoPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_cocoapods**
> packages_validate_upload_cocoapods(owner, repo, opts)

Validate parameters for create CocoaPods package

Validate parameters for create CocoaPods package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::CocoapodsPackageUploadRequest.new # CocoapodsPackageUploadRequest | 
}

begin
  #Validate parameters for create CocoaPods package
  api_instance.packages_validate_upload_cocoapods(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_cocoapods: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**CocoapodsPackageUploadRequest**](CocoapodsPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_composer**
> packages_validate_upload_composer(owner, repo, opts)

Validate parameters for create Composer package

Validate parameters for create Composer package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::ComposerPackageUploadRequest.new # ComposerPackageUploadRequest | 
}

begin
  #Validate parameters for create Composer package
  api_instance.packages_validate_upload_composer(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_composer: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**ComposerPackageUploadRequest**](ComposerPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_conan**
> packages_validate_upload_conan(owner, repo, opts)

Validate parameters for create Conan package

Validate parameters for create Conan package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::ConanPackageUploadRequest.new # ConanPackageUploadRequest | 
}

begin
  #Validate parameters for create Conan package
  api_instance.packages_validate_upload_conan(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_conan: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**ConanPackageUploadRequest**](ConanPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_conda**
> packages_validate_upload_conda(owner, repo, opts)

Validate parameters for create Conda package

Validate parameters for create Conda package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::CondaPackageUploadRequest.new # CondaPackageUploadRequest | 
}

begin
  #Validate parameters for create Conda package
  api_instance.packages_validate_upload_conda(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_conda: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**CondaPackageUploadRequest**](CondaPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_cran**
> packages_validate_upload_cran(owner, repo, opts)

Validate parameters for create CRAN package

Validate parameters for create CRAN package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::CranPackageUploadRequest.new # CranPackageUploadRequest | 
}

begin
  #Validate parameters for create CRAN package
  api_instance.packages_validate_upload_cran(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_cran: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**CranPackageUploadRequest**](CranPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_dart**
> packages_validate_upload_dart(owner, repo, opts)

Validate parameters for create Dart package

Validate parameters for create Dart package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::DartPackageUploadRequest.new # DartPackageUploadRequest | 
}

begin
  #Validate parameters for create Dart package
  api_instance.packages_validate_upload_dart(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_dart: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**DartPackageUploadRequest**](DartPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_deb**
> packages_validate_upload_deb(owner, repo, opts)

Validate parameters for create Debian package

Validate parameters for create Debian package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::DebPackageUploadRequest.new # DebPackageUploadRequest | 
}

begin
  #Validate parameters for create Debian package
  api_instance.packages_validate_upload_deb(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_deb: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**DebPackageUploadRequest**](DebPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_docker**
> packages_validate_upload_docker(owner, repo, opts)

Validate parameters for create Docker package

Validate parameters for create Docker package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::DockerPackageUploadRequest.new # DockerPackageUploadRequest | 
}

begin
  #Validate parameters for create Docker package
  api_instance.packages_validate_upload_docker(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_docker: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**DockerPackageUploadRequest**](DockerPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_go**
> packages_validate_upload_go(owner, repo, opts)

Validate parameters for create Go package

Validate parameters for create Go package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::GoPackageUploadRequest.new # GoPackageUploadRequest | 
}

begin
  #Validate parameters for create Go package
  api_instance.packages_validate_upload_go(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_go: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**GoPackageUploadRequest**](GoPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_helm**
> packages_validate_upload_helm(owner, repo, opts)

Validate parameters for create Helm package

Validate parameters for create Helm package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::HelmPackageUploadRequest.new # HelmPackageUploadRequest | 
}

begin
  #Validate parameters for create Helm package
  api_instance.packages_validate_upload_helm(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_helm: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**HelmPackageUploadRequest**](HelmPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_luarocks**
> packages_validate_upload_luarocks(owner, repo, opts)

Validate parameters for create LuaRocks package

Validate parameters for create LuaRocks package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::LuarocksPackageUploadRequest.new # LuarocksPackageUploadRequest | 
}

begin
  #Validate parameters for create LuaRocks package
  api_instance.packages_validate_upload_luarocks(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_luarocks: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**LuarocksPackageUploadRequest**](LuarocksPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_maven**
> packages_validate_upload_maven(owner, repo, opts)

Validate parameters for create Maven package

Validate parameters for create Maven package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::MavenPackageUploadRequest.new # MavenPackageUploadRequest | 
}

begin
  #Validate parameters for create Maven package
  api_instance.packages_validate_upload_maven(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_maven: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**MavenPackageUploadRequest**](MavenPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_npm**
> packages_validate_upload_npm(owner, repo, opts)

Validate parameters for create npm package

Validate parameters for create npm package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::NpmPackageUploadRequest.new # NpmPackageUploadRequest | 
}

begin
  #Validate parameters for create npm package
  api_instance.packages_validate_upload_npm(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_npm: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**NpmPackageUploadRequest**](NpmPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_nuget**
> packages_validate_upload_nuget(owner, repo, opts)

Validate parameters for create NuGet package

Validate parameters for create NuGet package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::NugetPackageUploadRequest.new # NugetPackageUploadRequest | 
}

begin
  #Validate parameters for create NuGet package
  api_instance.packages_validate_upload_nuget(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_nuget: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**NugetPackageUploadRequest**](NugetPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_p2**
> packages_validate_upload_p2(owner, repo, opts)

Validate parameters for create P2 package

Validate parameters for create P2 package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::P2PackageUploadRequest.new # P2PackageUploadRequest | 
}

begin
  #Validate parameters for create P2 package
  api_instance.packages_validate_upload_p2(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_p2: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**P2PackageUploadRequest**](P2PackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_python**
> packages_validate_upload_python(owner, repo, opts)

Validate parameters for create Python package

Validate parameters for create Python package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::PythonPackageUploadRequest.new # PythonPackageUploadRequest | 
}

begin
  #Validate parameters for create Python package
  api_instance.packages_validate_upload_python(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_python: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**PythonPackageUploadRequest**](PythonPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_raw**
> packages_validate_upload_raw(owner, repo, opts)

Validate parameters for create Raw package

Validate parameters for create Raw package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::RawPackageUploadRequest.new # RawPackageUploadRequest | 
}

begin
  #Validate parameters for create Raw package
  api_instance.packages_validate_upload_raw(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_raw: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**RawPackageUploadRequest**](RawPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_rpm**
> packages_validate_upload_rpm(owner, repo, opts)

Validate parameters for create RedHat package

Validate parameters for create RedHat package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::RpmPackageUploadRequest.new # RpmPackageUploadRequest | 
}

begin
  #Validate parameters for create RedHat package
  api_instance.packages_validate_upload_rpm(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_rpm: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**RpmPackageUploadRequest**](RpmPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_ruby**
> packages_validate_upload_ruby(owner, repo, opts)

Validate parameters for create Ruby package

Validate parameters for create Ruby package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::RubyPackageUploadRequest.new # RubyPackageUploadRequest | 
}

begin
  #Validate parameters for create Ruby package
  api_instance.packages_validate_upload_ruby(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_ruby: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**RubyPackageUploadRequest**](RubyPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_terraform**
> packages_validate_upload_terraform(owner, repo, opts)

Validate parameters for create Terraform package

Validate parameters for create Terraform package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::TerraformPackageUploadRequest.new # TerraformPackageUploadRequest | 
}

begin
  #Validate parameters for create Terraform package
  api_instance.packages_validate_upload_terraform(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_terraform: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**TerraformPackageUploadRequest**](TerraformPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **packages_validate_upload_vagrant**
> packages_validate_upload_vagrant(owner, repo, opts)

Validate parameters for create Vagrant package

Validate parameters for create Vagrant package

### Example
```ruby
# load the gem
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-Api-Key'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::VagrantPackageUploadRequest.new # VagrantPackageUploadRequest | 
}

begin
  #Validate parameters for create Vagrant package
  api_instance.packages_validate_upload_vagrant(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_validate_upload_vagrant: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**VagrantPackageUploadRequest**](VagrantPackageUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



