# CloudsmithApi::FilesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**files_create**](FilesApi.md#files_create) | **POST** /files/{owner}/{repo}/ | Request URL(s) to POST new package file upload(s) to.
[**files_validate**](FilesApi.md#files_validate) | **POST** /files/{owner}/{repo}/validate/ | Validate parameters used for create.


# **files_create**
> PackageFileUpload files_create(owner, repo, opts)

Request URL(s) to POST new package file upload(s) to.

Request URL(s) to POST new package file upload(s) to.

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

api_instance = CloudsmithApi::FilesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::FilesCreate.new # FilesCreate | 
}

begin
  #Request URL(s) to POST new package file upload(s) to.
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
 **data** | [**FilesCreate**](FilesCreate.md)|  | [optional] 

### Return type

[**PackageFileUpload**](PackageFileUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::FilesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::FilesValidate.new # FilesValidate | 
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
 **data** | [**FilesValidate**](FilesValidate.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



