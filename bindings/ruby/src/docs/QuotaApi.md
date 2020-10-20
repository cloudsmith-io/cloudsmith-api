# CloudsmithApi::QuotaApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**quota_history_read**](QuotaApi.md#quota_history_read) | **GET** /quota/history/{owner}/ | Quota history for a given namespace.
[**quota_oss_history_read**](QuotaApi.md#quota_oss_history_read) | **GET** /quota/oss/history/{owner}/ | Open-source Quota history for a given namespace.
[**quota_oss_read**](QuotaApi.md#quota_oss_read) | **GET** /quota/oss/{owner}/ | Open-source Quota usage for a given namespace.
[**quota_read**](QuotaApi.md#quota_read) | **GET** /quota/{owner}/ | Quota usage for a given namespace.


# **quota_history_read**
> QuotaHistory quota_history_read(owner)

Quota history for a given namespace.

Quota history for a given namespace.

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

api_instance = CloudsmithApi::QuotaApi.new

owner = "owner_example" # String | 


begin
  #Quota history for a given namespace.
  result = api_instance.quota_history_read(owner)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling QuotaApi->quota_history_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 

### Return type

[**QuotaHistory**](QuotaHistory.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **quota_oss_history_read**
> QuotaHistory quota_oss_history_read(owner)

Open-source Quota history for a given namespace.

Open-source Quota history for a given namespace.

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

api_instance = CloudsmithApi::QuotaApi.new

owner = "owner_example" # String | 


begin
  #Open-source Quota history for a given namespace.
  result = api_instance.quota_oss_history_read(owner)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling QuotaApi->quota_oss_history_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 

### Return type

[**QuotaHistory**](QuotaHistory.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **quota_oss_read**
> Quota quota_oss_read(owner)

Open-source Quota usage for a given namespace.

Open-source Quota usage for a given namespace.

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

api_instance = CloudsmithApi::QuotaApi.new

owner = "owner_example" # String | 


begin
  #Open-source Quota usage for a given namespace.
  result = api_instance.quota_oss_read(owner)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling QuotaApi->quota_oss_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 

### Return type

[**Quota**](Quota.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **quota_read**
> Quota quota_read(owner)

Quota usage for a given namespace.

Quota usage for a given namespace.

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

api_instance = CloudsmithApi::QuotaApi.new

owner = "owner_example" # String | 


begin
  #Quota usage for a given namespace.
  result = api_instance.quota_read(owner)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling QuotaApi->quota_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 

### Return type

[**Quota**](Quota.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



