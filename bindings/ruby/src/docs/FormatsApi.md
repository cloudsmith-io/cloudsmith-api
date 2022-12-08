# CloudsmithApi::FormatsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**formats_list**](FormatsApi.md#formats_list) | **GET** /formats/ | Get a list of all supported package formats.
[**formats_read**](FormatsApi.md#formats_read) | **GET** /formats/{slug}/ | Get a specific supported package format.


# **formats_list**
> Array&lt;FormatResponse&gt; formats_list

Get a list of all supported package formats.

Get a list of all supported package formats.

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

api_instance = CloudsmithApi::FormatsApi.new

begin
  #Get a list of all supported package formats.
  result = api_instance.formats_list
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling FormatsApi->formats_list: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;FormatResponse&gt;**](FormatResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **formats_read**
> FormatResponse formats_read(slug)

Get a specific supported package format.

Get a specific supported package format.

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

api_instance = CloudsmithApi::FormatsApi.new

slug = 'slug_example' # String | 


begin
  #Get a specific supported package format.
  result = api_instance.formats_read(slug)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling FormatsApi->formats_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **String**|  | 

### Return type

[**FormatResponse**](FormatResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



