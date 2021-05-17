# CloudsmithApi::UsersApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**users_profile_read**](UsersApi.md#users_profile_read) | **GET** /users/profile/{slug}/ | Provide a brief for the specified user (if any).


# **users_profile_read**
> UserProfile users_profile_read(slug)

Provide a brief for the specified user (if any).

Provide a brief for the specified user (if any).

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

api_instance = CloudsmithApi::UsersApi.new

slug = "slug_example" # String | 


begin
  #Provide a brief for the specified user (if any).
  result = api_instance.users_profile_read(slug)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling UsersApi->users_profile_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **String**|  | 

### Return type

[**UserProfile**](UserProfile.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



