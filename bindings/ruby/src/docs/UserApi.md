# CloudsmithApi::UserApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_self**](UserApi.md#user_self) | **GET** /user/self/ | Provide a brief for the current user (if any).
[**user_token_create**](UserApi.md#user_token_create) | **POST** /user/token/ | Retrieve/Create API key/token for the authenticated user.


# **user_self**
> UserBrief user_self

Provide a brief for the current user (if any).

Provide a brief for the current user (if any).

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

api_instance = CloudsmithApi::UserApi.new

begin
  #Provide a brief for the current user (if any).
  result = api_instance.user_self
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling UserApi->user_self: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserBrief**](UserBrief.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **user_token_create**
> UserAuthToken user_token_create(opts)

Retrieve/Create API key/token for the authenticated user.

Retrieve/Create API key/token for the authenticated user.

### Example
```ruby
# load the gem
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
  #Retrieve/Create API key/token for the authenticated user.
  result = api_instance.user_token_create(opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling UserApi->user_token_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**UserAuthTokenRequest**](UserAuthTokenRequest.md)|  | [optional] 

### Return type

[**UserAuthToken**](UserAuthToken.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



