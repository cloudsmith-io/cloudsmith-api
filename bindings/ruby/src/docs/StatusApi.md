# CloudsmithApi::StatusApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**status_check_basic**](StatusApi.md#status_check_basic) | **GET** /status/check/basic/ | Endpoint to check basic API connectivity. |


## status_check_basic

> <StatusBasic> status_check_basic

Endpoint to check basic API connectivity.

Endpoint to check basic API connectivity.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'

api_instance = CloudsmithApi::StatusApi.new

begin
  # Endpoint to check basic API connectivity.
  result = api_instance.status_check_basic
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling StatusApi->status_check_basic: #{e}"
end
```

#### Using the status_check_basic_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<StatusBasic>, Integer, Hash)> status_check_basic_with_http_info

```ruby
begin
  # Endpoint to check basic API connectivity.
  data, status_code, headers = api_instance.status_check_basic_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <StatusBasic>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling StatusApi->status_check_basic_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**StatusBasic**](StatusBasic.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

