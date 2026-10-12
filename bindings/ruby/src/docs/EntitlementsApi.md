# CloudsmithApi::EntitlementsApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**entitlements_create**](EntitlementsApi.md#entitlements_create) | **POST** /entitlements/{owner}/{repo}/ | Create a specific entitlement in a repository. |
| [**entitlements_delete**](EntitlementsApi.md#entitlements_delete) | **DELETE** /entitlements/{owner}/{repo}/{identifier}/ | Delete a specific entitlement in a repository. |
| [**entitlements_disable**](EntitlementsApi.md#entitlements_disable) | **POST** /entitlements/{owner}/{repo}/{identifier}/disable/ | Disable an entitlement token in a repository. |
| [**entitlements_enable**](EntitlementsApi.md#entitlements_enable) | **POST** /entitlements/{owner}/{repo}/{identifier}/enable/ | Enable an entitlement token in a repository. |
| [**entitlements_list**](EntitlementsApi.md#entitlements_list) | **GET** /entitlements/{owner}/{repo}/ | Get a list of all entitlements in a repository. |
| [**entitlements_partial_update**](EntitlementsApi.md#entitlements_partial_update) | **PATCH** /entitlements/{owner}/{repo}/{identifier}/ | Update a specific entitlement in a repository. |
| [**entitlements_read**](EntitlementsApi.md#entitlements_read) | **GET** /entitlements/{owner}/{repo}/{identifier}/ | Get a specific entitlement in a repository. |
| [**entitlements_refresh**](EntitlementsApi.md#entitlements_refresh) | **POST** /entitlements/{owner}/{repo}/{identifier}/refresh/ | Refresh an entitlement token in a repository. |
| [**entitlements_reset**](EntitlementsApi.md#entitlements_reset) | **POST** /entitlements/{owner}/{repo}/{identifier}/reset/ | Reset the statistics for an entitlement token in a repository. |
| [**entitlements_sync**](EntitlementsApi.md#entitlements_sync) | **POST** /entitlements/{owner}/{repo}/sync/ | Synchronise tokens from a source repository. |
| [**entitlements_toggle_private_broadcasts**](EntitlementsApi.md#entitlements_toggle_private_broadcasts) | **POST** /entitlements/{owner}/{repo}/{identifier}/toggle-private-broadcasts/ | Set private broadcast access for an entitlement token in a repository. |


## entitlements_create

> <RepositoryToken> entitlements_create(owner, repo, opts)

Create a specific entitlement in a repository.

Create a specific entitlement in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  show_tokens: true, # Boolean | Show entitlement token strings in results
  data: CloudsmithApi::RepositoryTokenRequest.new # RepositoryTokenRequest | 
}

begin
  # Create a specific entitlement in a repository.
  result = api_instance.entitlements_create(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_create: #{e}"
end
```

#### Using the entitlements_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RepositoryToken>, Integer, Hash)> entitlements_create_with_http_info(owner, repo, opts)

```ruby
begin
  # Create a specific entitlement in a repository.
  data, status_code, headers = api_instance.entitlements_create_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RepositoryToken>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **show_tokens** | **Boolean** | Show entitlement token strings in results | [optional][default to false] |
| **data** | [**RepositoryTokenRequest**](RepositoryTokenRequest.md) |  | [optional] |

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## entitlements_delete

> entitlements_delete(owner, repo, identifier)

Delete a specific entitlement in a repository.

Delete a specific entitlement in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 

begin
  # Delete a specific entitlement in a repository.
  api_instance.entitlements_delete(owner, repo, identifier)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_delete: #{e}"
end
```

#### Using the entitlements_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> entitlements_delete_with_http_info(owner, repo, identifier)

```ruby
begin
  # Delete a specific entitlement in a repository.
  data, status_code, headers = api_instance.entitlements_delete_with_http_info(owner, repo, identifier)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_delete_with_http_info: #{e}"
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


## entitlements_disable

> entitlements_disable(owner, repo, identifier)

Disable an entitlement token in a repository.

Disable an entitlement token in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 

begin
  # Disable an entitlement token in a repository.
  api_instance.entitlements_disable(owner, repo, identifier)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_disable: #{e}"
end
```

#### Using the entitlements_disable_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> entitlements_disable_with_http_info(owner, repo, identifier)

```ruby
begin
  # Disable an entitlement token in a repository.
  data, status_code, headers = api_instance.entitlements_disable_with_http_info(owner, repo, identifier)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_disable_with_http_info: #{e}"
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


## entitlements_enable

> entitlements_enable(owner, repo, identifier)

Enable an entitlement token in a repository.

Enable an entitlement token in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 

begin
  # Enable an entitlement token in a repository.
  api_instance.entitlements_enable(owner, repo, identifier)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_enable: #{e}"
end
```

#### Using the entitlements_enable_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> entitlements_enable_with_http_info(owner, repo, identifier)

```ruby
begin
  # Enable an entitlement token in a repository.
  data, status_code, headers = api_instance.entitlements_enable_with_http_info(owner, repo, identifier)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_enable_with_http_info: #{e}"
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


## entitlements_list

> <Array<RepositoryToken>> entitlements_list(owner, repo, opts)

Get a list of all entitlements in a repository.

Get a list of all entitlements in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  show_tokens: true, # Boolean | Show entitlement token strings in results
  query: 'query_example', # String | A search term for querying names of entitlements.
  active: true, # Boolean | If true, only include active tokens
  exclude_other_user_tokens: true, # Boolean | If true, exclude user tokens that belong to other users
  sort: 'sort_example' # String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name.
}

begin
  # Get a list of all entitlements in a repository.
  result = api_instance.entitlements_list(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_list: #{e}"
end
```

#### Using the entitlements_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<RepositoryToken>>, Integer, Hash)> entitlements_list_with_http_info(owner, repo, opts)

```ruby
begin
  # Get a list of all entitlements in a repository.
  data, status_code, headers = api_instance.entitlements_list_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<RepositoryToken>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |
| **show_tokens** | **Boolean** | Show entitlement token strings in results | [optional][default to false] |
| **query** | **String** | A search term for querying names of entitlements. | [optional] |
| **active** | **Boolean** | If true, only include active tokens | [optional][default to false] |
| **exclude_other_user_tokens** | **Boolean** | If true, exclude user tokens that belong to other users | [optional][default to false] |
| **sort** | **String** | A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name. | [optional][default to &#39;name&#39;] |

### Return type

[**Array&lt;RepositoryToken&gt;**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## entitlements_partial_update

> <RepositoryToken> entitlements_partial_update(owner, repo, identifier, opts)

Update a specific entitlement in a repository.

Update a specific entitlement in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 
opts = {
  show_tokens: true, # Boolean | Show entitlement token strings in results
  data: CloudsmithApi::RepositoryTokenRequestPatch.new # RepositoryTokenRequestPatch | 
}

begin
  # Update a specific entitlement in a repository.
  result = api_instance.entitlements_partial_update(owner, repo, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_partial_update: #{e}"
end
```

#### Using the entitlements_partial_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RepositoryToken>, Integer, Hash)> entitlements_partial_update_with_http_info(owner, repo, identifier, opts)

```ruby
begin
  # Update a specific entitlement in a repository.
  data, status_code, headers = api_instance.entitlements_partial_update_with_http_info(owner, repo, identifier, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RepositoryToken>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_partial_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **identifier** | **String** |  |  |
| **show_tokens** | **Boolean** | Show entitlement token strings in results | [optional][default to false] |
| **data** | [**RepositoryTokenRequestPatch**](RepositoryTokenRequestPatch.md) |  | [optional] |

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## entitlements_read

> <RepositoryToken> entitlements_read(owner, repo, identifier, opts)

Get a specific entitlement in a repository.

Get a specific entitlement in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 
opts = {
  fuzzy: true, # Boolean | If true, entitlement identifiers including name will be fuzzy matched.
  show_tokens: true # Boolean | Show entitlement token strings in results
}

begin
  # Get a specific entitlement in a repository.
  result = api_instance.entitlements_read(owner, repo, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_read: #{e}"
end
```

#### Using the entitlements_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RepositoryToken>, Integer, Hash)> entitlements_read_with_http_info(owner, repo, identifier, opts)

```ruby
begin
  # Get a specific entitlement in a repository.
  data, status_code, headers = api_instance.entitlements_read_with_http_info(owner, repo, identifier, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RepositoryToken>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **identifier** | **String** |  |  |
| **fuzzy** | **Boolean** | If true, entitlement identifiers including name will be fuzzy matched. | [optional][default to false] |
| **show_tokens** | **Boolean** | Show entitlement token strings in results | [optional][default to false] |

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## entitlements_refresh

> <RepositoryTokenRefresh> entitlements_refresh(owner, repo, identifier, opts)

Refresh an entitlement token in a repository.

Refresh an entitlement token in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 
opts = {
  show_tokens: true, # Boolean | Show entitlement token strings in results
  data: CloudsmithApi::RepositoryTokenRefreshRequest.new # RepositoryTokenRefreshRequest | 
}

begin
  # Refresh an entitlement token in a repository.
  result = api_instance.entitlements_refresh(owner, repo, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_refresh: #{e}"
end
```

#### Using the entitlements_refresh_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RepositoryTokenRefresh>, Integer, Hash)> entitlements_refresh_with_http_info(owner, repo, identifier, opts)

```ruby
begin
  # Refresh an entitlement token in a repository.
  data, status_code, headers = api_instance.entitlements_refresh_with_http_info(owner, repo, identifier, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RepositoryTokenRefresh>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_refresh_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **identifier** | **String** |  |  |
| **show_tokens** | **Boolean** | Show entitlement token strings in results | [optional][default to false] |
| **data** | [**RepositoryTokenRefreshRequest**](RepositoryTokenRefreshRequest.md) |  | [optional] |

### Return type

[**RepositoryTokenRefresh**](RepositoryTokenRefresh.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## entitlements_reset

> entitlements_reset(owner, repo, identifier, opts)

Reset the statistics for an entitlement token in a repository.

Reset the statistics for an entitlement token in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 
opts = {
  show_tokens: true # Boolean | Show entitlement token strings in results
}

begin
  # Reset the statistics for an entitlement token in a repository.
  api_instance.entitlements_reset(owner, repo, identifier, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_reset: #{e}"
end
```

#### Using the entitlements_reset_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> entitlements_reset_with_http_info(owner, repo, identifier, opts)

```ruby
begin
  # Reset the statistics for an entitlement token in a repository.
  data, status_code, headers = api_instance.entitlements_reset_with_http_info(owner, repo, identifier, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_reset_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **identifier** | **String** |  |  |
| **show_tokens** | **Boolean** | Show entitlement token strings in results | [optional][default to false] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## entitlements_sync

> <RepositoryTokenSync> entitlements_sync(owner, repo, opts)

Synchronise tokens from a source repository.

Synchronise tokens from a source repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  show_tokens: true, # Boolean | Show entitlement token strings in results
  data: CloudsmithApi::RepositoryTokenSyncRequest.new # RepositoryTokenSyncRequest | 
}

begin
  # Synchronise tokens from a source repository.
  result = api_instance.entitlements_sync(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_sync: #{e}"
end
```

#### Using the entitlements_sync_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RepositoryTokenSync>, Integer, Hash)> entitlements_sync_with_http_info(owner, repo, opts)

```ruby
begin
  # Synchronise tokens from a source repository.
  data, status_code, headers = api_instance.entitlements_sync_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RepositoryTokenSync>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_sync_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **show_tokens** | **Boolean** | Show entitlement token strings in results | [optional][default to false] |
| **data** | [**RepositoryTokenSyncRequest**](RepositoryTokenSyncRequest.md) |  | [optional] |

### Return type

[**RepositoryTokenSync**](RepositoryTokenSync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## entitlements_toggle_private_broadcasts

> entitlements_toggle_private_broadcasts(owner, repo, identifier, opts)

Set private broadcast access for an entitlement token in a repository.

Set private broadcast access for an entitlement token in a repository.

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

api_instance = CloudsmithApi::EntitlementsApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
identifier = 'identifier_example' # String | 
opts = {
  data: CloudsmithApi::RepositoryTokenPrivateBroadcastsRequest.new # RepositoryTokenPrivateBroadcastsRequest | 
}

begin
  # Set private broadcast access for an entitlement token in a repository.
  api_instance.entitlements_toggle_private_broadcasts(owner, repo, identifier, opts)
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_toggle_private_broadcasts: #{e}"
end
```

#### Using the entitlements_toggle_private_broadcasts_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> entitlements_toggle_private_broadcasts_with_http_info(owner, repo, identifier, opts)

```ruby
begin
  # Set private broadcast access for an entitlement token in a repository.
  data, status_code, headers = api_instance.entitlements_toggle_private_broadcasts_with_http_info(owner, repo, identifier, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue CloudsmithApi::ApiError => e
  puts "Error when calling EntitlementsApi->entitlements_toggle_private_broadcasts_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **identifier** | **String** |  |  |
| **data** | [**RepositoryTokenPrivateBroadcastsRequest**](RepositoryTokenPrivateBroadcastsRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

