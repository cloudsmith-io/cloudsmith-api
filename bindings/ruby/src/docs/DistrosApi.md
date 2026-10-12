# CloudsmithApi::DistrosApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**distros_list**](DistrosApi.md#distros_list) | **GET** /distros/ | Get a list of all supported distributions. |
| [**distros_read**](DistrosApi.md#distros_read) | **GET** /distros/{slug}/ | View for viewing/listing distributions. |


## distros_list

> <Array<DistributionFull>> distros_list

Get a list of all supported distributions.

Get a list of all supported distributions.

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

api_instance = CloudsmithApi::DistrosApi.new

begin
  # Get a list of all supported distributions.
  result = api_instance.distros_list
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling DistrosApi->distros_list: #{e}"
end
```

#### Using the distros_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<DistributionFull>>, Integer, Hash)> distros_list_with_http_info

```ruby
begin
  # Get a list of all supported distributions.
  data, status_code, headers = api_instance.distros_list_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<DistributionFull>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling DistrosApi->distros_list_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Array&lt;DistributionFull&gt;**](DistributionFull.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## distros_read

> <DistributionFull> distros_read(slug)

View for viewing/listing distributions.

View for viewing/listing distributions.

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

api_instance = CloudsmithApi::DistrosApi.new
slug = 'slug_example' # String | 

begin
  # View for viewing/listing distributions.
  result = api_instance.distros_read(slug)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling DistrosApi->distros_read: #{e}"
end
```

#### Using the distros_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DistributionFull>, Integer, Hash)> distros_read_with_http_info(slug)

```ruby
begin
  # View for viewing/listing distributions.
  data, status_code, headers = api_instance.distros_read_with_http_info(slug)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DistributionFull>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling DistrosApi->distros_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **slug** | **String** |  |  |

### Return type

[**DistributionFull**](DistributionFull.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

