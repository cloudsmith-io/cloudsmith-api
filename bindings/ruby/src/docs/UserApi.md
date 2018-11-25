# CloudsmithApi::UserApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_self**](UserApi.md#user_self) | **GET** /user/self/ | Provide a brief for the current user (if any).
[**user_token_create**](UserApi.md#user_token_create) | **POST** /user/token/ | Retrieve the API key/token for the authenticated user.


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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
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

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **user_token_create**
> UserAuthToken user_token_create(opts)

Retrieve the API key/token for the authenticated user.

Retrieve the API key/token for the authenticated user.

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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::UserApi.new

opts = { 
  data: CloudsmithApi::UserTokenCreate.new # UserTokenCreate | 
}

begin
  #Retrieve the API key/token for the authenticated user.
  result = api_instance.user_token_create(opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling UserApi->user_token_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**UserTokenCreate**](UserTokenCreate.md)|  | [optional] 

### Return type

[**UserAuthToken**](UserAuthToken.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



