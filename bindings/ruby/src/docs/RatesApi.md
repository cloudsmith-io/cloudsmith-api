# CloudsmithApi::RatesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rates_limits_list**](RatesApi.md#rates_limits_list) | **GET** /rates/limits/ | Endpoint to check rate limits for current user.


# **rates_limits_list**
> ResourcesRateCheck rates_limits_list

Endpoint to check rate limits for current user.

Endpoint to check rate limits for current user.

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

  # Configure API key authorization: token
  config.api_key['Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['Authorization'] = 'Bearer'
end

api_instance = CloudsmithApi::RatesApi.new

begin
  #Endpoint to check rate limits for current user.
  result = api_instance.rates_limits_list
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling RatesApi->rates_limits_list: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResourcesRateCheck**](ResourcesRateCheck.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



