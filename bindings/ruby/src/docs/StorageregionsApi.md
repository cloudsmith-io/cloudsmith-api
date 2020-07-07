# CloudsmithApi::StorageregionsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**storage_regions_list**](StorageregionsApi.md#storage_regions_list) | **GET** /storage-regions/ | Get a list of all available storage regions.
[**storage_regions_read**](StorageregionsApi.md#storage_regions_read) | **GET** /storage-regions/{slug}/ | Get a specific storage region.


# **storage_regions_list**
> Array&lt;StorageRegion&gt; storage_regions_list

Get a list of all available storage regions.

Get a list of all available storage regions.

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

api_instance = CloudsmithApi::StorageregionsApi.new

begin
  #Get a list of all available storage regions.
  result = api_instance.storage_regions_list
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling StorageregionsApi->storage_regions_list: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;StorageRegion&gt;**](StorageRegion.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **storage_regions_read**
> StorageRegion storage_regions_read(slug)

Get a specific storage region.

Get a specific storage region.

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

api_instance = CloudsmithApi::StorageregionsApi.new

slug = "slug_example" # String | 


begin
  #Get a specific storage region.
  result = api_instance.storage_regions_read(slug)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling StorageregionsApi->storage_regions_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **String**|  | 

### Return type

[**StorageRegion**](StorageRegion.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



