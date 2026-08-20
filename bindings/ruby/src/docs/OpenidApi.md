# CloudsmithApi::OpenidApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**openid_create**](OpenidApi.md#openid_create) | **POST** /openid/{owner}/ | Get a JWT token for a configured service account belonging to the requesting org.


# **openid_create**
> Oidc1 openid_create(owner, opts)

Get a JWT token for a configured service account belonging to the requesting org.

Get a JWT token for a configured service account belonging to the requesting org.

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

api_instance = CloudsmithApi::OpenidApi.new

owner = 'owner_example' # String | 

opts = { 
  data: CloudsmithApi::OidcRequest.new # OidcRequest | 
}

begin
  #Get a JWT token for a configured service account belonging to the requesting org.
  result = api_instance.openid_create(owner, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling OpenidApi->openid_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **data** | [**OidcRequest**](OidcRequest.md)|  | [optional] 

### Return type

[**Oidc1**](Oidc1.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



