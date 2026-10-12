# CloudsmithApi::UserApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**user_self**](UserApi.md#user_self) | **GET** /user/self/ | Provide a brief for the current user (if any). |
| [**user_token_create**](UserApi.md#user_token_create) | **POST** /user/token/ | Create or retrieve API token for a user. |
| [**user_tokens_create**](UserApi.md#user_tokens_create) | **POST** /user/tokens/ | Create an API key for the user that is currently authenticated. |
| [**user_tokens_list**](UserApi.md#user_tokens_list) | **GET** /user/tokens/ | Retrieve the API key assigned to the user that is currently authenticated. |
| [**user_tokens_refresh**](UserApi.md#user_tokens_refresh) | **PUT** /user/tokens/{slug_perm}/refresh/ | Refresh the specified API key for the user that is currently authenticated. |


## user_self

> <UserBrief> user_self

Provide a brief for the current user (if any).

Provide a brief for the current user (if any).

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

api_instance = CloudsmithApi::UserApi.new

begin
  # Provide a brief for the current user (if any).
  result = api_instance.user_self
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling UserApi->user_self: #{e}"
end
```

#### Using the user_self_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UserBrief>, Integer, Hash)> user_self_with_http_info

```ruby
begin
  # Provide a brief for the current user (if any).
  data, status_code, headers = api_instance.user_self_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UserBrief>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling UserApi->user_self_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**UserBrief**](UserBrief.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## user_token_create

> <UserAuthToken> user_token_create(opts)

Create or retrieve API token for a user.

Handles both: - Users authenticating with basic credentials to get a token - Two-factor authentication flow

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::UserApi.new
opts = {
  data: CloudsmithApi::UserAuthTokenRequest.new # UserAuthTokenRequest | 
}

begin
  # Create or retrieve API token for a user.
  result = api_instance.user_token_create(opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling UserApi->user_token_create: #{e}"
end
```

#### Using the user_token_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UserAuthToken>, Integer, Hash)> user_token_create_with_http_info(opts)

```ruby
begin
  # Create or retrieve API token for a user.
  data, status_code, headers = api_instance.user_token_create_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UserAuthToken>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling UserApi->user_token_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **data** | [**UserAuthTokenRequest**](UserAuthTokenRequest.md) |  | [optional] |

### Return type

[**UserAuthToken**](UserAuthToken.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## user_tokens_create

> <UserAuthenticationToken> user_tokens_create

Create an API key for the user that is currently authenticated.

Create an API key for the user that is currently authenticated.

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

api_instance = CloudsmithApi::UserApi.new

begin
  # Create an API key for the user that is currently authenticated.
  result = api_instance.user_tokens_create
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling UserApi->user_tokens_create: #{e}"
end
```

#### Using the user_tokens_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UserAuthenticationToken>, Integer, Hash)> user_tokens_create_with_http_info

```ruby
begin
  # Create an API key for the user that is currently authenticated.
  data, status_code, headers = api_instance.user_tokens_create_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UserAuthenticationToken>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling UserApi->user_tokens_create_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**UserAuthenticationToken**](UserAuthenticationToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## user_tokens_list

> <UserTokensList200Response> user_tokens_list(opts)

Retrieve the API key assigned to the user that is currently authenticated.

Retrieve the API key assigned to the user that is currently authenticated.

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

api_instance = CloudsmithApi::UserApi.new
opts = {
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  # Retrieve the API key assigned to the user that is currently authenticated.
  result = api_instance.user_tokens_list(opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling UserApi->user_tokens_list: #{e}"
end
```

#### Using the user_tokens_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UserTokensList200Response>, Integer, Hash)> user_tokens_list_with_http_info(opts)

```ruby
begin
  # Retrieve the API key assigned to the user that is currently authenticated.
  data, status_code, headers = api_instance.user_tokens_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UserTokensList200Response>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling UserApi->user_tokens_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |

### Return type

[**UserTokensList200Response**](UserTokensList200Response.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## user_tokens_refresh

> <UserAuthenticationToken> user_tokens_refresh(slug_perm)

Refresh the specified API key for the user that is currently authenticated.

Refresh the specified API key for the user that is currently authenticated.

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

api_instance = CloudsmithApi::UserApi.new
slug_perm = 'slug_perm_example' # String | 

begin
  # Refresh the specified API key for the user that is currently authenticated.
  result = api_instance.user_tokens_refresh(slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling UserApi->user_tokens_refresh: #{e}"
end
```

#### Using the user_tokens_refresh_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UserAuthenticationToken>, Integer, Hash)> user_tokens_refresh_with_http_info(slug_perm)

```ruby
begin
  # Refresh the specified API key for the user that is currently authenticated.
  data, status_code, headers = api_instance.user_tokens_refresh_with_http_info(slug_perm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UserAuthenticationToken>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling UserApi->user_tokens_refresh_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **slug_perm** | **String** |  |  |

### Return type

[**UserAuthenticationToken**](UserAuthenticationToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

