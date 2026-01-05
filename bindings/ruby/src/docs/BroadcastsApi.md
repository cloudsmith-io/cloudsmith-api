# CloudsmithApi::BroadcastsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**broadcasts_create_broadcast_token**](BroadcastsApi.md#broadcasts_create_broadcast_token) | **POST** /broadcasts/{org}/broadcast-token/ | Create a broadcast token.


# **broadcasts_create_broadcast_token**
> BroadcastToken broadcasts_create_broadcast_token(org, opts)

Create a broadcast token.

Create a broadcast token.

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
end

api_instance = CloudsmithApi::BroadcastsApi.new

org = 'org_example' # String | 

opts = { 
  data: CloudsmithApi::BroadcastTokenInput.new # BroadcastTokenInput | 
}

begin
  #Create a broadcast token.
  result = api_instance.broadcasts_create_broadcast_token(org, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling BroadcastsApi->broadcasts_create_broadcast_token: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **String**|  | 
 **data** | [**BroadcastTokenInput**](BroadcastTokenInput.md)|  | [optional] 

### Return type

[**BroadcastToken**](BroadcastToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



