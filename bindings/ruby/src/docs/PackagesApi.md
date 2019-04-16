# CloudsmithApi::PackagesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**packages_copy**](PackagesApi.md#packages_copy) | **POST** /packages/{owner}/{repo}/{identifier}/copy/ | Copy a package to another repository.
[**packages_delete**](PackagesApi.md#packages_delete) | **DELETE** /packages/{owner}/{repo}/{identifier}/ | Delete a specific package in a repository.
[**packages_list**](PackagesApi.md#packages_list) | **GET** /packages/{owner}/{repo}/ | Views for working with repository packages.
[**packages_move**](PackagesApi.md#packages_move) | **POST** /packages/{owner}/{repo}/{identifier}/move/ | Move a package to another repository.
[**packages_read**](PackagesApi.md#packages_read) | **GET** /packages/{owner}/{repo}/{identifier}/ | Get a specific package in a repository.
[**packages_resync**](PackagesApi.md#packages_resync) | **POST** /packages/{owner}/{repo}/{identifier}/resync/ | Schedule a package for resynchronisation.
[**packages_status**](PackagesApi.md#packages_status) | **GET** /packages/{owner}/{repo}/{identifier}/status/ | Get the synchronisation status for a package.
[**packages_upload_alpine**](PackagesApi.md#packages_upload_alpine) | **POST** /packages/{owner}/{repo}/upload/alpine/ | Create a new Alpine package
[**packages_upload_composer**](PackagesApi.md#packages_upload_composer) | **POST** /packages/{owner}/{repo}/upload/composer/ | Create a new Composer package
[**packages_upload_deb**](PackagesApi.md#packages_upload_deb) | **POST** /packages/{owner}/{repo}/upload/deb/ | Create a new Debian package
[**packages_upload_docker**](PackagesApi.md#packages_upload_docker) | **POST** /packages/{owner}/{repo}/upload/docker/ | Create a new Docker package
[**packages_upload_helm**](PackagesApi.md#packages_upload_helm) | **POST** /packages/{owner}/{repo}/upload/helm/ | Create a new Helm package
[**packages_upload_maven**](PackagesApi.md#packages_upload_maven) | **POST** /packages/{owner}/{repo}/upload/maven/ | Create a new Maven package
[**packages_upload_npm**](PackagesApi.md#packages_upload_npm) | **POST** /packages/{owner}/{repo}/upload/npm/ | Create a new npm package
[**packages_upload_python**](PackagesApi.md#packages_upload_python) | **POST** /packages/{owner}/{repo}/upload/python/ | Create a new Python package
[**packages_upload_raw**](PackagesApi.md#packages_upload_raw) | **POST** /packages/{owner}/{repo}/upload/raw/ | Create a new Raw package
[**packages_upload_rpm**](PackagesApi.md#packages_upload_rpm) | **POST** /packages/{owner}/{repo}/upload/rpm/ | Create a new RedHat package
[**packages_upload_ruby**](PackagesApi.md#packages_upload_ruby) | **POST** /packages/{owner}/{repo}/upload/ruby/ | Create a new Ruby package
[**packages_upload_vagrant**](PackagesApi.md#packages_upload_vagrant) | **POST** /packages/{owner}/{repo}/upload/vagrant/ | Create a new Vagrant package
[**packages_validate_upload_alpine**](PackagesApi.md#packages_validate_upload_alpine) | **POST** /packages/{owner}/{repo}/validate-upload/alpine/ | Validate parameters for create Alpine package
[**packages_validate_upload_composer**](PackagesApi.md#packages_validate_upload_composer) | **POST** /packages/{owner}/{repo}/validate-upload/composer/ | Validate parameters for create Composer package
[**packages_validate_upload_deb**](PackagesApi.md#packages_validate_upload_deb) | **POST** /packages/{owner}/{repo}/validate-upload/deb/ | Validate parameters for create Debian package
[**packages_validate_upload_docker**](PackagesApi.md#packages_validate_upload_docker) | **POST** /packages/{owner}/{repo}/validate-upload/docker/ | Validate parameters for create Docker package
[**packages_validate_upload_helm**](PackagesApi.md#packages_validate_upload_helm) | **POST** /packages/{owner}/{repo}/validate-upload/helm/ | Validate parameters for create Helm package
[**packages_validate_upload_maven**](PackagesApi.md#packages_validate_upload_maven) | **POST** /packages/{owner}/{repo}/validate-upload/maven/ | Validate parameters for create Maven package
[**packages_validate_upload_npm**](PackagesApi.md#packages_validate_upload_npm) | **POST** /packages/{owner}/{repo}/validate-upload/npm/ | Validate parameters for create npm package
[**packages_validate_upload_python**](PackagesApi.md#packages_validate_upload_python) | **POST** /packages/{owner}/{repo}/validate-upload/python/ | Validate parameters for create Python package
[**packages_validate_upload_raw**](PackagesApi.md#packages_validate_upload_raw) | **POST** /packages/{owner}/{repo}/validate-upload/raw/ | Validate parameters for create Raw package
[**packages_validate_upload_rpm**](PackagesApi.md#packages_validate_upload_rpm) | **POST** /packages/{owner}/{repo}/validate-upload/rpm/ | Validate parameters for create RedHat package
[**packages_validate_upload_ruby**](PackagesApi.md#packages_validate_upload_ruby) | **POST** /packages/{owner}/{repo}/validate-upload/ruby/ | Validate parameters for create Ruby package
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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

identifier = "identifier_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesCopy.new # PackagesCopy | 
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
 **data** | [**PackagesCopy**](PackagesCopy.md)|  | [optional] 

### Return type

[**PackageCopy**](PackageCopy.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

identifier = "identifier_example" # String | 


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

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **packages_list**
> Array&lt;Package&gt; packages_list(owner, repo, opts)

Views for working with repository packages.

Views for working with repository packages.

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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  query: "query_example" # String | A search term for querying names, filenames, versions, distributions, architectures, formats or statuses of packages.
}

begin
  #Views for working with repository packages.
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
 **query** | **String**| A search term for querying names, filenames, versions, distributions, architectures, formats or statuses of packages. | [optional] 

### Return type

[**Array&lt;Package&gt;**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

identifier = "identifier_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesMove.new # PackagesMove | 
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
 **data** | [**PackagesMove**](PackagesMove.md)|  | [optional] 

### Return type

[**PackageMove**](PackageMove.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

identifier = "identifier_example" # String | 


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

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **packages_resync**
> Package packages_resync(owner, repo, identifier, opts)

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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

identifier = "identifier_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesResync.new # PackagesResync | 
}

begin
  #Schedule a package for resynchronisation.
  result = api_instance.packages_resync(owner, repo, identifier, opts)
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
 **data** | [**PackagesResync**](PackagesResync.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

identifier = "identifier_example" # String | 


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

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **packages_upload_alpine**
> Package packages_upload_alpine(owner, repo, opts)

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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesUploadAlpine.new # PackagesUploadAlpine | 
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
 **data** | [**PackagesUploadAlpine**](PackagesUploadAlpine.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **packages_upload_composer**
> Package packages_upload_composer(owner, repo, opts)

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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesUploadComposer.new # PackagesUploadComposer | 
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
 **data** | [**PackagesUploadComposer**](PackagesUploadComposer.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **packages_upload_deb**
> Package packages_upload_deb(owner, repo, opts)

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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesUploadDeb.new # PackagesUploadDeb | 
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
 **data** | [**PackagesUploadDeb**](PackagesUploadDeb.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **packages_upload_docker**
> Package packages_upload_docker(owner, repo, opts)

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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesUploadDocker.new # PackagesUploadDocker | 
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
 **data** | [**PackagesUploadDocker**](PackagesUploadDocker.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **packages_upload_helm**
> Package packages_upload_helm(owner, repo, opts)

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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesUploadHelm.new # PackagesUploadHelm | 
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
 **data** | [**PackagesUploadHelm**](PackagesUploadHelm.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesUploadMaven.new # PackagesUploadMaven | 
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
 **data** | [**PackagesUploadMaven**](PackagesUploadMaven.md)|  | [optional] 

### Return type

[**MavenPackageUpload**](MavenPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **packages_upload_npm**
> Package packages_upload_npm(owner, repo, opts)

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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesUploadNpm.new # PackagesUploadNpm | 
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
 **data** | [**PackagesUploadNpm**](PackagesUploadNpm.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **packages_upload_python**
> Package packages_upload_python(owner, repo, opts)

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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesUploadPython.new # PackagesUploadPython | 
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
 **data** | [**PackagesUploadPython**](PackagesUploadPython.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesUploadRaw.new # PackagesUploadRaw | 
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
 **data** | [**PackagesUploadRaw**](PackagesUploadRaw.md)|  | [optional] 

### Return type

[**RawPackageUpload**](RawPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **packages_upload_rpm**
> Package packages_upload_rpm(owner, repo, opts)

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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesUploadRpm.new # PackagesUploadRpm | 
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
 **data** | [**PackagesUploadRpm**](PackagesUploadRpm.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **packages_upload_ruby**
> Package packages_upload_ruby(owner, repo, opts)

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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesUploadRuby.new # PackagesUploadRuby | 
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
 **data** | [**PackagesUploadRuby**](PackagesUploadRuby.md)|  | [optional] 

### Return type

[**Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesUploadVagrant.new # PackagesUploadVagrant | 
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
 **data** | [**PackagesUploadVagrant**](PackagesUploadVagrant.md)|  | [optional] 

### Return type

[**VagrantPackageUpload**](VagrantPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesValidateuploadAlpine.new # PackagesValidateuploadAlpine | 
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
 **data** | [**PackagesValidateuploadAlpine**](PackagesValidateuploadAlpine.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesValidateuploadComposer.new # PackagesValidateuploadComposer | 
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
 **data** | [**PackagesValidateuploadComposer**](PackagesValidateuploadComposer.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesValidateuploadDeb.new # PackagesValidateuploadDeb | 
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
 **data** | [**PackagesValidateuploadDeb**](PackagesValidateuploadDeb.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesValidateuploadDocker.new # PackagesValidateuploadDocker | 
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
 **data** | [**PackagesValidateuploadDocker**](PackagesValidateuploadDocker.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesValidateuploadHelm.new # PackagesValidateuploadHelm | 
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
 **data** | [**PackagesValidateuploadHelm**](PackagesValidateuploadHelm.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesValidateuploadMaven.new # PackagesValidateuploadMaven | 
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
 **data** | [**PackagesValidateuploadMaven**](PackagesValidateuploadMaven.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesValidateuploadNpm.new # PackagesValidateuploadNpm | 
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
 **data** | [**PackagesValidateuploadNpm**](PackagesValidateuploadNpm.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesValidateuploadPython.new # PackagesValidateuploadPython | 
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
 **data** | [**PackagesValidateuploadPython**](PackagesValidateuploadPython.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesValidateuploadRaw.new # PackagesValidateuploadRaw | 
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
 **data** | [**PackagesValidateuploadRaw**](PackagesValidateuploadRaw.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesValidateuploadRpm.new # PackagesValidateuploadRpm | 
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
 **data** | [**PackagesValidateuploadRpm**](PackagesValidateuploadRpm.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesValidateuploadRuby.new # PackagesValidateuploadRuby | 
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
 **data** | [**PackagesValidateuploadRuby**](PackagesValidateuploadRuby.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::PackagesValidateuploadVagrant.new # PackagesValidateuploadVagrant | 
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
 **data** | [**PackagesValidateuploadVagrant**](PackagesValidateuploadVagrant.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



