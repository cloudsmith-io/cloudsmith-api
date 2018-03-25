# CloudsmithApi::EntitlementsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entitlements_create**](EntitlementsApi.md#entitlements_create) | **POST** /entitlements/{owner}/{repo}/ | Create a specific entitlement in a repository.
[**entitlements_delete**](EntitlementsApi.md#entitlements_delete) | **DELETE** /entitlements/{owner}/{repo}/{slug_perm}/ | Delete a specific entitlement in a repository.
[**entitlements_list**](EntitlementsApi.md#entitlements_list) | **GET** /entitlements/{owner}/{repo}/ | Get a list of all entitlements in a repository.
[**entitlements_partial_update**](EntitlementsApi.md#entitlements_partial_update) | **PATCH** /entitlements/{owner}/{repo}/{slug_perm}/ | Update a specific entitlement in a repository.
[**entitlements_read**](EntitlementsApi.md#entitlements_read) | **GET** /entitlements/{owner}/{repo}/{slug_perm}/ | Views for working with repository entitlements.
[**entitlements_refresh**](EntitlementsApi.md#entitlements_refresh) | **POST** /entitlements/{owner}/{repo}/{slug_perm}/refresh/ | Refresh an entitlement token in a repository.
[**entitlements_sync**](EntitlementsApi.md#entitlements_sync) | **POST** /entitlements/{owner}/{repo}/sync/ | Synchronise tokens from a source repository.


# **entitlements_create**
> RepositoryToken entitlements_create(owner, repo, opts)

Create a specific entitlement in a repository.

Create a specific entitlement in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  show_tokens: true, # BOOLEAN | Show entitlement token strings in results
  data: CloudsmithApi::EntitlementsCreate.new # EntitlementsCreate | 
}

begin
  #Create a specific entitlement in a repository.
  result = api_instance.entitlements_create(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling EntitlementsApi->entitlements_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **show_tokens** | **BOOLEAN**| Show entitlement token strings in results | [optional] 
 **data** | [**EntitlementsCreate**](EntitlementsCreate.md)|  | [optional] 

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **entitlements_delete**
> entitlements_delete(owner, repo, slug_perm, opts)

Delete a specific entitlement in a repository.

Delete a specific entitlement in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

slug_perm = "slug_perm_example" # String | 

opts = { 
  show_tokens: true # BOOLEAN | Show entitlement token strings in results
}

begin
  #Delete a specific entitlement in a repository.
  api_instance.entitlements_delete(owner, repo, slug_perm, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling EntitlementsApi->entitlements_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **slug_perm** | **String**|  | 
 **show_tokens** | **BOOLEAN**| Show entitlement token strings in results | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **entitlements_list**
> Array&lt;RepositoryToken&gt; entitlements_list(owner, repo, opts)

Get a list of all entitlements in a repository.

Get a list of all entitlements in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  show_tokens: true # BOOLEAN | Show entitlement token strings in results
}

begin
  #Get a list of all entitlements in a repository.
  result = api_instance.entitlements_list(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling EntitlementsApi->entitlements_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 
 **show_tokens** | **BOOLEAN**| Show entitlement token strings in results | [optional] 

### Return type

[**Array&lt;RepositoryToken&gt;**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **entitlements_partial_update**
> RepositoryToken entitlements_partial_update(owner, repo, slug_perm, opts)

Update a specific entitlement in a repository.

Update a specific entitlement in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

slug_perm = "slug_perm_example" # String | 

opts = { 
  show_tokens: true, # BOOLEAN | Show entitlement token strings in results
  data: CloudsmithApi::EntitlementsPartialUpdate.new # EntitlementsPartialUpdate | 
}

begin
  #Update a specific entitlement in a repository.
  result = api_instance.entitlements_partial_update(owner, repo, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling EntitlementsApi->entitlements_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **slug_perm** | **String**|  | 
 **show_tokens** | **BOOLEAN**| Show entitlement token strings in results | [optional] 
 **data** | [**EntitlementsPartialUpdate**](EntitlementsPartialUpdate.md)|  | [optional] 

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **entitlements_read**
> RepositoryToken entitlements_read(owner, repo, slug_perm, opts)

Views for working with repository entitlements.

Views for working with repository entitlements.

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

api_instance = CloudsmithApi::EntitlementsApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

slug_perm = "slug_perm_example" # String | 

opts = { 
  show_tokens: true # BOOLEAN | Show entitlement token strings in results
}

begin
  #Views for working with repository entitlements.
  result = api_instance.entitlements_read(owner, repo, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling EntitlementsApi->entitlements_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **slug_perm** | **String**|  | 
 **show_tokens** | **BOOLEAN**| Show entitlement token strings in results | [optional] 

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **entitlements_refresh**
> RepositoryTokenRefresh entitlements_refresh(owner, repo, slug_perm, opts)

Refresh an entitlement token in a repository.

Refresh an entitlement token in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

slug_perm = "slug_perm_example" # String | 

opts = { 
  show_tokens: true, # BOOLEAN | Show entitlement token strings in results
  data: CloudsmithApi::EntitlementsRefresh.new # EntitlementsRefresh | 
}

begin
  #Refresh an entitlement token in a repository.
  result = api_instance.entitlements_refresh(owner, repo, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling EntitlementsApi->entitlements_refresh: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **slug_perm** | **String**|  | 
 **show_tokens** | **BOOLEAN**| Show entitlement token strings in results | [optional] 
 **data** | [**EntitlementsRefresh**](EntitlementsRefresh.md)|  | [optional] 

### Return type

[**RepositoryTokenRefresh**](RepositoryTokenRefresh.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **entitlements_sync**
> RepositoryTokenSync entitlements_sync(owner, repo, opts)

Synchronise tokens from a source repository.

Synchronise tokens from a source repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  show_tokens: true, # BOOLEAN | Show entitlement token strings in results
  data: CloudsmithApi::EntitlementsSync.new # EntitlementsSync | 
}

begin
  #Synchronise tokens from a source repository.
  result = api_instance.entitlements_sync(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling EntitlementsApi->entitlements_sync: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **show_tokens** | **BOOLEAN**| Show entitlement token strings in results | [optional] 
 **data** | [**EntitlementsSync**](EntitlementsSync.md)|  | [optional] 

### Return type

[**RepositoryTokenSync**](RepositoryTokenSync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



