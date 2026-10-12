# CloudsmithApi::NamespacesApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**namespaces_list**](NamespacesApi.md#namespaces_list) | **GET** /namespaces/ | Get a list of all namespaces the user belongs to. |
| [**namespaces_read**](NamespacesApi.md#namespaces_read) | **GET** /namespaces/{slug}/ | Get a specific namespace that the user belongs to. |


## namespaces_list

> <Array<Namespace>> namespaces_list(opts)

Get a list of all namespaces the user belongs to.

Get a list of all namespaces the user belongs to.

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

api_instance = CloudsmithApi::NamespacesApi.new
opts = {
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  # Get a list of all namespaces the user belongs to.
  result = api_instance.namespaces_list(opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling NamespacesApi->namespaces_list: #{e}"
end
```

#### Using the namespaces_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<Namespace>>, Integer, Hash)> namespaces_list_with_http_info(opts)

```ruby
begin
  # Get a list of all namespaces the user belongs to.
  data, status_code, headers = api_instance.namespaces_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<Namespace>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling NamespacesApi->namespaces_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |

### Return type

[**Array&lt;Namespace&gt;**](Namespace.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## namespaces_read

> <Namespace> namespaces_read(slug)

Get a specific namespace that the user belongs to.

Get a specific namespace that the user belongs to.

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

api_instance = CloudsmithApi::NamespacesApi.new
slug = 'slug_example' # String | 

begin
  # Get a specific namespace that the user belongs to.
  result = api_instance.namespaces_read(slug)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling NamespacesApi->namespaces_read: #{e}"
end
```

#### Using the namespaces_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Namespace>, Integer, Hash)> namespaces_read_with_http_info(slug)

```ruby
begin
  # Get a specific namespace that the user belongs to.
  data, status_code, headers = api_instance.namespaces_read_with_http_info(slug)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Namespace>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling NamespacesApi->namespaces_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **slug** | **String** |  |  |

### Return type

[**Namespace**](Namespace.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

