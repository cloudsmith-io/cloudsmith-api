# CloudsmithApi::ReposApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repos_all_list**](ReposApi.md#repos_all_list) | **GET** /repos/ | Get a list of all repositories associated with current user.
[**repos_create**](ReposApi.md#repos_create) | **POST** /repos/{owner}/ | Create a new repository in a given namespace.
[**repos_delete**](ReposApi.md#repos_delete) | **DELETE** /repos/{owner}/{identifier}/ | Delete a repository in a given namespace.
[**repos_gpg_create**](ReposApi.md#repos_gpg_create) | **POST** /repos/{owner}/{identifier}/gpg/ | Set the active GPG key for the Repository.
[**repos_gpg_list**](ReposApi.md#repos_gpg_list) | **GET** /repos/{owner}/{identifier}/gpg/ | Retrieve the active GPG key for the Repository.
[**repos_gpg_regenerate**](ReposApi.md#repos_gpg_regenerate) | **POST** /repos/{owner}/{identifier}/gpg/regenerate/ | Regenerate GPG Key for the Repository.
[**repos_list**](ReposApi.md#repos_list) | **GET** /repos/{owner}/ | Get a list of all repositories within a namespace.
[**repos_partial_update**](ReposApi.md#repos_partial_update) | **PATCH** /repos/{owner}/{identifier}/ | Update details about a repository in a given namespace.
[**repos_privileges_list**](ReposApi.md#repos_privileges_list) | **GET** /repos/{owner}/{identifier}/privileges | List all explicity created privileges for the repository.
[**repos_privileges_partial_update**](ReposApi.md#repos_privileges_partial_update) | **PATCH** /repos/{owner}/{identifier}/privileges | Modify privileges for the repository.
[**repos_privileges_update**](ReposApi.md#repos_privileges_update) | **PUT** /repos/{owner}/{identifier}/privileges | Replace all existing repository privileges with those specified.
[**repos_read**](ReposApi.md#repos_read) | **GET** /repos/{owner}/{identifier}/ | Get a specific repository.
[**repos_rsa_create**](ReposApi.md#repos_rsa_create) | **POST** /repos/{owner}/{identifier}/rsa/ | Set the active RSA key for the Repository.
[**repos_rsa_list**](ReposApi.md#repos_rsa_list) | **GET** /repos/{owner}/{identifier}/rsa/ | Retrieve the active RSA key for the Repository.
[**repos_rsa_regenerate**](ReposApi.md#repos_rsa_regenerate) | **POST** /repos/{owner}/{identifier}/rsa/regenerate/ | Regenerate RSA Key for the Repository.


# **repos_all_list**
> Array&lt;Repository&gt; repos_all_list(opts)

Get a list of all repositories associated with current user.

Get a list of all repositories associated with current user.

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

api_instance = CloudsmithApi::ReposApi.new

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Get a list of all repositories associated with current user.
  result = api_instance.repos_all_list(opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_all_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;Repository&gt;**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **repos_create**
> RepositoryCreate repos_create(owner, opts)

Create a new repository in a given namespace.

Create a new repository in a given namespace.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

opts = { 
  data: CloudsmithApi::ReposCreate.new # ReposCreate | 
}

begin
  #Create a new repository in a given namespace.
  result = api_instance.repos_create(owner, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **data** | [**ReposCreate**](ReposCreate.md)|  | [optional] 

### Return type

[**RepositoryCreate**](RepositoryCreate.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **repos_delete**
> repos_delete(owner, identifier)

Delete a repository in a given namespace.

Delete a repository in a given namespace.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Delete a repository in a given namespace.
  api_instance.repos_delete(owner, identifier)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **repos_gpg_create**
> RepositoryGpgKey repos_gpg_create(owner, identifier, opts)

Set the active GPG key for the Repository.

Set the active GPG key for the Repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::ReposGpgCreate.new # ReposGpgCreate | 
}

begin
  #Set the active GPG key for the Repository.
  result = api_instance.repos_gpg_create(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_gpg_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**ReposGpgCreate**](ReposGpgCreate.md)|  | [optional] 

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **repos_gpg_list**
> RepositoryGpgKey repos_gpg_list(owner, identifier)

Retrieve the active GPG key for the Repository.

Retrieve the active GPG key for the Repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Retrieve the active GPG key for the Repository.
  result = api_instance.repos_gpg_list(owner, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_gpg_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **repos_gpg_regenerate**
> RepositoryGpgKey repos_gpg_regenerate(owner, identifier)

Regenerate GPG Key for the Repository.

Regenerate GPG Key for the Repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Regenerate GPG Key for the Repository.
  result = api_instance.repos_gpg_regenerate(owner, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_gpg_regenerate: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **repos_list**
> Array&lt;Repository&gt; repos_list(owner, opts)

Get a list of all repositories within a namespace.

Get a list of all repositories within a namespace.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Get a list of all repositories within a namespace.
  result = api_instance.repos_list(owner, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;Repository&gt;**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **repos_partial_update**
> Repository repos_partial_update(owner, identifier, opts)

Update details about a repository in a given namespace.

Update details about a repository in a given namespace.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::ReposPartialUpdate.new # ReposPartialUpdate | 
}

begin
  #Update details about a repository in a given namespace.
  result = api_instance.repos_partial_update(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**ReposPartialUpdate**](ReposPartialUpdate.md)|  | [optional] 

### Return type

[**Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **repos_privileges_list**
> RepositoryPrivilegeInput repos_privileges_list(owner, identifier, opts)

List all explicity created privileges for the repository.

List all explicity created privileges for the repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #List all explicity created privileges for the repository.
  result = api_instance.repos_privileges_list(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_privileges_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**RepositoryPrivilegeInput**](RepositoryPrivilegeInput.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **repos_privileges_partial_update**
> repos_privileges_partial_update(owner, identifier, opts)

Modify privileges for the repository.

Modify privileges for the repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::ReposPrivilegesPartialUpdate.new # ReposPrivilegesPartialUpdate | 
}

begin
  #Modify privileges for the repository.
  api_instance.repos_privileges_partial_update(owner, identifier, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_privileges_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**ReposPrivilegesPartialUpdate**](ReposPrivilegesPartialUpdate.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **repos_privileges_update**
> repos_privileges_update(owner, identifier, opts)

Replace all existing repository privileges with those specified.

Replace all existing repository privileges with those specified.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::ReposPrivilegesUpdate.new # ReposPrivilegesUpdate | 
}

begin
  #Replace all existing repository privileges with those specified.
  api_instance.repos_privileges_update(owner, identifier, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_privileges_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**ReposPrivilegesUpdate**](ReposPrivilegesUpdate.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **repos_read**
> Repository repos_read(owner, identifier)

Get a specific repository.

Get a specific repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Get a specific repository.
  result = api_instance.repos_read(owner, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

[**Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **repos_rsa_create**
> RepositoryRsaKey repos_rsa_create(owner, identifier, opts)

Set the active RSA key for the Repository.

Set the active RSA key for the Repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::ReposRsaCreate.new # ReposRsaCreate | 
}

begin
  #Set the active RSA key for the Repository.
  result = api_instance.repos_rsa_create(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_rsa_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**ReposRsaCreate**](ReposRsaCreate.md)|  | [optional] 

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **repos_rsa_list**
> RepositoryRsaKey repos_rsa_list(owner, identifier)

Retrieve the active RSA key for the Repository.

Retrieve the active RSA key for the Repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Retrieve the active RSA key for the Repository.
  result = api_instance.repos_rsa_list(owner, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_rsa_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **repos_rsa_regenerate**
> RepositoryRsaKey repos_rsa_regenerate(owner, identifier)

Regenerate RSA Key for the Repository.

Regenerate RSA Key for the Repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Regenerate RSA Key for the Repository.
  result = api_instance.repos_rsa_regenerate(owner, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_rsa_regenerate: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



