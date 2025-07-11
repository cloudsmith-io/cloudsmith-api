# CloudsmithApi::FilesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**files_abort**](FilesApi.md#files_abort) | **POST** /files/{owner}/{repo}/{identifier}/abort/ | Abort a multipart file upload.
[**files_complete**](FilesApi.md#files_complete) | **POST** /files/{owner}/{repo}/{identifier}/complete/ | Complete a multipart file upload.
[**files_create**](FilesApi.md#files_create) | **POST** /files/{owner}/{repo}/ | Request URL(s) to upload new package file upload(s) to.
[**files_info**](FilesApi.md#files_info) | **GET** /files/{owner}/{repo}/{identifier}/info/ | Get upload information to perform a multipart file upload.
[**files_validate**](FilesApi.md#files_validate) | **POST** /files/{owner}/{repo}/validate/ | Validate parameters used for create.


# **files_abort**
> files_abort(owner, repo, identifier, opts)

Abort a multipart file upload.

Abort a multipart file upload.

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
end

api_instance = CloudsmithApi::FilesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::PackageFileUploadRequest.new # PackageFileUploadRequest | 
}

begin
  #Abort a multipart file upload.
  api_instance.files_abort(owner, repo, identifier, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling FilesApi->files_abort: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**PackageFileUploadRequest**](PackageFileUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **files_complete**
> PackageFileUpload files_complete(owner, repo, identifier, opts)

Complete a multipart file upload.

Complete a multipart file upload.

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
end

api_instance = CloudsmithApi::FilesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::PackageFileUploadRequest.new # PackageFileUploadRequest | 
}

begin
  #Complete a multipart file upload.
  result = api_instance.files_complete(owner, repo, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling FilesApi->files_complete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**PackageFileUploadRequest**](PackageFileUploadRequest.md)|  | [optional] 

### Return type

[**PackageFileUpload**](PackageFileUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **files_create**
> PackageFileUpload files_create(owner, repo, opts)

Request URL(s) to upload new package file upload(s) to.

Request URL(s) to upload new package file upload(s) to.

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
end

api_instance = CloudsmithApi::FilesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::PackageFileUploadRequest.new # PackageFileUploadRequest | 
}

begin
  #Request URL(s) to upload new package file upload(s) to.
  result = api_instance.files_create(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling FilesApi->files_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**PackageFileUploadRequest**](PackageFileUploadRequest.md)|  | [optional] 

### Return type

[**PackageFileUpload**](PackageFileUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **files_info**
> PackageFilePartsUpload files_info(owner, repo, identifier, filename, opts)

Get upload information to perform a multipart file upload.

Get upload information to perform a multipart file upload.

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
end

api_instance = CloudsmithApi::FilesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 

filename = 'filename_example' # String | The filename of the file being uploaded

opts = { 
  part_number: 56 # Integer | The part number to be uploaded next
}

begin
  #Get upload information to perform a multipart file upload.
  result = api_instance.files_info(owner, repo, identifier, filename, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling FilesApi->files_info: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 
 **filename** | **String**| The filename of the file being uploaded | 
 **part_number** | **Integer**| The part number to be uploaded next | [optional] 

### Return type

[**PackageFilePartsUpload**](PackageFilePartsUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **files_validate**
> files_validate(owner, repo, opts)

Validate parameters used for create.

Validate parameters used for create.

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
end

api_instance = CloudsmithApi::FilesApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::PackageFileUploadRequest.new # PackageFileUploadRequest | 
}

begin
  #Validate parameters used for create.
  api_instance.files_validate(owner, repo, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling FilesApi->files_validate: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**PackageFileUploadRequest**](PackageFileUploadRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



