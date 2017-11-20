# CloudsmithApi::PackagesApi

All URIs are relative to *https://api-prd.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**packages_delete**](PackagesApi.md#packages_delete) | **DELETE** /packages/{owner}/{repo}/{slug}/ | Delete a specific package in a repository.
[**packages_list**](PackagesApi.md#packages_list) | **GET** /packages/{owner}/{repo}/ | Views for working with repository packages.
[**packages_read**](PackagesApi.md#packages_read) | **GET** /packages/{owner}/{repo}/{slug}/ | Get a specific package in a repository.
[**packages_status**](PackagesApi.md#packages_status) | **GET** /packages/{owner}/{repo}/{slug}/status/ | Get the synchronisation status for a package.
[**packages_upload_deb**](PackagesApi.md#packages_upload_deb) | **POST** /packages/{owner}/{repo}/upload/deb/ | Create a new Debian package
[**packages_upload_maven**](PackagesApi.md#packages_upload_maven) | **POST** /packages/{owner}/{repo}/upload/maven/ | Create a new Maven package
[**packages_upload_python**](PackagesApi.md#packages_upload_python) | **POST** /packages/{owner}/{repo}/upload/python/ | Create a new Python package
[**packages_upload_raw**](PackagesApi.md#packages_upload_raw) | **POST** /packages/{owner}/{repo}/upload/raw/ | Create a new Raw package
[**packages_upload_rpm**](PackagesApi.md#packages_upload_rpm) | **POST** /packages/{owner}/{repo}/upload/rpm/ | Create a new RedHat package
[**packages_upload_ruby**](PackagesApi.md#packages_upload_ruby) | **POST** /packages/{owner}/{repo}/upload/ruby/ | Create a new Ruby package
[**packages_upload_vagrant**](PackagesApi.md#packages_upload_vagrant) | **POST** /packages/{owner}/{repo}/upload/vagrant/ | Create a new Vagrant package
[**packages_validate_upload_deb**](PackagesApi.md#packages_validate_upload_deb) | **POST** /packages/{owner}/{repo}/validate-upload/deb/ | Validate parameters for create Debian package
[**packages_validate_upload_maven**](PackagesApi.md#packages_validate_upload_maven) | **POST** /packages/{owner}/{repo}/validate-upload/maven/ | Validate parameters for create Maven package
[**packages_validate_upload_python**](PackagesApi.md#packages_validate_upload_python) | **POST** /packages/{owner}/{repo}/validate-upload/python/ | Validate parameters for create Python package
[**packages_validate_upload_raw**](PackagesApi.md#packages_validate_upload_raw) | **POST** /packages/{owner}/{repo}/validate-upload/raw/ | Validate parameters for create Raw package
[**packages_validate_upload_rpm**](PackagesApi.md#packages_validate_upload_rpm) | **POST** /packages/{owner}/{repo}/validate-upload/rpm/ | Validate parameters for create RedHat package
[**packages_validate_upload_ruby**](PackagesApi.md#packages_validate_upload_ruby) | **POST** /packages/{owner}/{repo}/validate-upload/ruby/ | Validate parameters for create Ruby package
[**packages_validate_upload_vagrant**](PackagesApi.md#packages_validate_upload_vagrant) | **POST** /packages/{owner}/{repo}/validate-upload/vagrant/ | Validate parameters for create Vagrant package


# **packages_delete**
> packages_delete(owner, repo, slug)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

slug = "slug_example" # String | 


begin
  #Delete a specific package in a repository.
  api_instance.packages_delete(owner, repo, slug)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling PackagesApi->packages_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **slug** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **packages_list**
> Array&lt;RpmPackageUpload&gt; packages_list(owner, repo, opts)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

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
  page_size: 56 # Integer | Number of results to return per page.
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

### Return type

[**Array&lt;RpmPackageUpload&gt;**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **packages_read**
> RpmPackageUpload packages_read(owner, repo, slug)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

slug = "slug_example" # String | 


begin
  #Get a specific package in a repository.
  result = api_instance.packages_read(owner, repo, slug)
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
 **slug** | **String**|  | 

### Return type

[**RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **packages_status**
> PackageStatus packages_status(owner, repo, slug)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::PackagesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

slug = "slug_example" # String | 


begin
  #Get the synchronisation status for a package.
  result = api_instance.packages_status(owner, repo, slug)
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
 **slug** | **String**|  | 

### Return type

[**PackageStatus**](PackageStatus.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **packages_upload_deb**
> RpmPackageUpload packages_upload_deb(owner, repo, opts)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

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

[**RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

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

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **packages_upload_python**
> RpmPackageUpload packages_upload_python(owner, repo, opts)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

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

[**RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **packages_upload_raw**
> RpmPackageUpload packages_upload_raw(owner, repo, opts)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

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

[**RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

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

[**RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **packages_upload_ruby**
> RpmPackageUpload packages_upload_ruby(owner, repo, opts)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

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

[**RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

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

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

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

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

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

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

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

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

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

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

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

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

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

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

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

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



