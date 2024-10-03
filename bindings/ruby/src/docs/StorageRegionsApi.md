# CloudsmithApi::StorageRegionsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**storage_regions_list**](StorageRegionsApi.md#storage_regions_list) | **GET** /storage-regions/ | Get a list of all available storage regions.
[**storage_regions_read**](StorageRegionsApi.md#storage_regions_read) | **GET** /storage-regions/{slug}/ | Get a specific storage region.


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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::StorageRegionsApi.new

begin
  #Get a list of all available storage regions.
  result = api_instance.storage_regions_list
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling StorageRegionsApi->storage_regions_list: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;StorageRegion&gt;**](StorageRegion.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



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

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::StorageRegionsApi.new

slug = 'slug_example' # String | 


begin
  #Get a specific storage region.
  result = api_instance.storage_regions_read(slug)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling StorageRegionsApi->storage_regions_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **String**|  | 

### Return type

[**StorageRegion**](StorageRegion.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



