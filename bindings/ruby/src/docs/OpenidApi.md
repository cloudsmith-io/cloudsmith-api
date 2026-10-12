# CloudsmithApi::OpenidApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**openid_create**](OpenidApi.md#openid_create) | **POST** /openid/{owner}/ | Get a JWT token for a configured service account belonging to the requesting org. |


## openid_create

> <Oidc1> openid_create(owner, opts)

Get a JWT token for a configured service account belonging to the requesting org.

Get a JWT token for a configured service account belonging to the requesting org.

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

api_instance = CloudsmithApi::OpenidApi.new
owner = 'owner_example' # String | 
opts = {
  data: CloudsmithApi::OidcRequest.new({oidc_token: 'oidc_token_example', service_slug: 'service_slug_example'}) # OidcRequest | 
}

begin
  # Get a JWT token for a configured service account belonging to the requesting org.
  result = api_instance.openid_create(owner, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OpenidApi->openid_create: #{e}"
end
```

#### Using the openid_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Oidc1>, Integer, Hash)> openid_create_with_http_info(owner, opts)

```ruby
begin
  # Get a JWT token for a configured service account belonging to the requesting org.
  data, status_code, headers = api_instance.openid_create_with_http_info(owner, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Oidc1>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling OpenidApi->openid_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **data** | [**OidcRequest**](OidcRequest.md) |  | [optional] |

### Return type

[**Oidc1**](Oidc1.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

