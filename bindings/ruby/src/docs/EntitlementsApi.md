# CloudsmithApi::EntitlementsApi

All URIs are relative to *https://api.cloudsmith.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entitlements_create**](EntitlementsApi.md#entitlements_create) | **POST** /entitlements/{owner}/{repo}/ | Create a specific entitlement in a repository.
[**entitlements_delete**](EntitlementsApi.md#entitlements_delete) | **DELETE** /entitlements/{owner}/{repo}/{identifier}/ | Delete a specific entitlement in a repository.
[**entitlements_disable**](EntitlementsApi.md#entitlements_disable) | **POST** /entitlements/{owner}/{repo}/{identifier}/disable/ | Disable an entitlement token in a repository.
[**entitlements_enable**](EntitlementsApi.md#entitlements_enable) | **POST** /entitlements/{owner}/{repo}/{identifier}/enable/ | Enable an entitlement token in a repository.
[**entitlements_list**](EntitlementsApi.md#entitlements_list) | **GET** /entitlements/{owner}/{repo}/ | Get a list of all entitlements in a repository.
[**entitlements_partial_update**](EntitlementsApi.md#entitlements_partial_update) | **PATCH** /entitlements/{owner}/{repo}/{identifier}/ | Update a specific entitlement in a repository.
[**entitlements_read**](EntitlementsApi.md#entitlements_read) | **GET** /entitlements/{owner}/{repo}/{identifier}/ | Get a specific entitlement in a repository.
[**entitlements_refresh**](EntitlementsApi.md#entitlements_refresh) | **POST** /entitlements/{owner}/{repo}/{identifier}/refresh/ | Refresh an entitlement token in a repository.
[**entitlements_reset**](EntitlementsApi.md#entitlements_reset) | **POST** /entitlements/{owner}/{repo}/{identifier}/reset/ | Reset the statistics for an entitlement token in a repository.
[**entitlements_sync**](EntitlementsApi.md#entitlements_sync) | **POST** /entitlements/{owner}/{repo}/sync/ | Synchronise tokens from a source repository.


# **entitlements_create**
> RepositoryTokenResponse entitlements_create(owner, repo, opts)

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
end

api_instance = CloudsmithApi::EntitlementsApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::RepositoryTokenRequest.new, # RepositoryTokenRequest | 
  show_tokens: false # BOOLEAN | Show entitlement token strings in results
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
 **data** | [**RepositoryTokenRequest**](RepositoryTokenRequest.md)|  | [optional] 
 **show_tokens** | **BOOLEAN**| Show entitlement token strings in results | [optional] [default to false]

### Return type

[**RepositoryTokenResponse**](RepositoryTokenResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **entitlements_delete**
> entitlements_delete(owner, repo, identifier)

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
end

api_instance = CloudsmithApi::EntitlementsApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Delete a specific entitlement in a repository.
  api_instance.entitlements_delete(owner, repo, identifier)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling EntitlementsApi->entitlements_delete: #{e}"
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



# **entitlements_disable**
> entitlements_disable(owner, repo, identifier)

Disable an entitlement token in a repository.

Disable an entitlement token in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Disable an entitlement token in a repository.
  api_instance.entitlements_disable(owner, repo, identifier)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling EntitlementsApi->entitlements_disable: #{e}"
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



# **entitlements_enable**
> entitlements_enable(owner, repo, identifier)

Enable an entitlement token in a repository.

Enable an entitlement token in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Enable an entitlement token in a repository.
  api_instance.entitlements_enable(owner, repo, identifier)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling EntitlementsApi->entitlements_enable: #{e}"
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



# **entitlements_list**
> Array&lt;RepositoryTokenResponse&gt; entitlements_list(owner, repo, opts)

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
end

api_instance = CloudsmithApi::EntitlementsApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  show_tokens: false, # BOOLEAN | Show entitlement token strings in results
  query: 'query_example', # String | A search term for querying names of entitlements.
  active: false # BOOLEAN | If true, only include active tokens
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
 **show_tokens** | **BOOLEAN**| Show entitlement token strings in results | [optional] [default to false]
 **query** | **String**| A search term for querying names of entitlements. | [optional] 
 **active** | **BOOLEAN**| If true, only include active tokens | [optional] [default to false]

### Return type

[**Array&lt;RepositoryTokenResponse&gt;**](RepositoryTokenResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **entitlements_partial_update**
> RepositoryTokenResponse entitlements_partial_update(owner, repo, identifier, opts)

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
end

api_instance = CloudsmithApi::EntitlementsApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::RepositoryTokenRequestPatch.new, # RepositoryTokenRequestPatch | 
  show_tokens: false # BOOLEAN | Show entitlement token strings in results
}

begin
  #Update a specific entitlement in a repository.
  result = api_instance.entitlements_partial_update(owner, repo, identifier, opts)
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
 **identifier** | **String**|  | 
 **data** | [**RepositoryTokenRequestPatch**](RepositoryTokenRequestPatch.md)|  | [optional] 
 **show_tokens** | **BOOLEAN**| Show entitlement token strings in results | [optional] [default to false]

### Return type

[**RepositoryTokenResponse**](RepositoryTokenResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **entitlements_read**
> RepositoryTokenResponse entitlements_read(owner, repo, identifier, opts)

Get a specific entitlement in a repository.

Get a specific entitlement in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  fuzzy: false, # BOOLEAN | If true, entitlement identifiers including name will be fuzzy matched.
  show_tokens: false # BOOLEAN | Show entitlement token strings in results
}

begin
  #Get a specific entitlement in a repository.
  result = api_instance.entitlements_read(owner, repo, identifier, opts)
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
 **identifier** | **String**|  | 
 **fuzzy** | **BOOLEAN**| If true, entitlement identifiers including name will be fuzzy matched. | [optional] [default to false]
 **show_tokens** | **BOOLEAN**| Show entitlement token strings in results | [optional] [default to false]

### Return type

[**RepositoryTokenResponse**](RepositoryTokenResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **entitlements_refresh**
> RepositoryTokenRefreshResponse entitlements_refresh(owner, repo, identifier, opts)

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
end

api_instance = CloudsmithApi::EntitlementsApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::RepositoryTokenRefreshRequest.new, # RepositoryTokenRefreshRequest | 
  show_tokens: false # BOOLEAN | Show entitlement token strings in results
}

begin
  #Refresh an entitlement token in a repository.
  result = api_instance.entitlements_refresh(owner, repo, identifier, opts)
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
 **identifier** | **String**|  | 
 **data** | [**RepositoryTokenRefreshRequest**](RepositoryTokenRefreshRequest.md)|  | [optional] 
 **show_tokens** | **BOOLEAN**| Show entitlement token strings in results | [optional] [default to false]

### Return type

[**RepositoryTokenRefreshResponse**](RepositoryTokenRefreshResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **entitlements_reset**
> entitlements_reset(owner, repo, identifier, opts)

Reset the statistics for an entitlement token in a repository.

Reset the statistics for an entitlement token in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  show_tokens: false # BOOLEAN | Show entitlement token strings in results
}

begin
  #Reset the statistics for an entitlement token in a repository.
  api_instance.entitlements_reset(owner, repo, identifier, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling EntitlementsApi->entitlements_reset: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 
 **show_tokens** | **BOOLEAN**| Show entitlement token strings in results | [optional] [default to false]

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **entitlements_sync**
> RepositoryTokenSyncResponse entitlements_sync(owner, repo, opts)

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
end

api_instance = CloudsmithApi::EntitlementsApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  data: CloudsmithApi::RepositoryTokenSyncRequest.new, # RepositoryTokenSyncRequest | 
  show_tokens: false # BOOLEAN | Show entitlement token strings in results
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
 **data** | [**RepositoryTokenSyncRequest**](RepositoryTokenSyncRequest.md)|  | [optional] 
 **show_tokens** | **BOOLEAN**| Show entitlement token strings in results | [optional] [default to false]

### Return type

[**RepositoryTokenSyncResponse**](RepositoryTokenSyncResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



