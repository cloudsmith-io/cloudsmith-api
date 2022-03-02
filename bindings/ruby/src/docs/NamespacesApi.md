# CloudsmithApi::NamespacesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**namespaces_list**](NamespacesApi.md#namespaces_list) | **GET** /namespaces/ | Get a list of all namespaces the user belongs to.
[**namespaces_read**](NamespacesApi.md#namespaces_read) | **GET** /namespaces/{slug}/ | Views for working with namespaces.


# **namespaces_list**
> Array&lt;Namespace&gt; namespaces_list(opts)

Get a list of all namespaces the user belongs to.

Get a list of all namespaces the user belongs to.

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

api_instance = CloudsmithApi::NamespacesApi.new

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Get a list of all namespaces the user belongs to.
  result = api_instance.namespaces_list(opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling NamespacesApi->namespaces_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;Namespace&gt;**](Namespace.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **namespaces_read**
> Namespace namespaces_read(slug)

Views for working with namespaces.

Views for working with namespaces.

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

api_instance = CloudsmithApi::NamespacesApi.new

slug = 'slug_example' # String | 


begin
  #Views for working with namespaces.
  result = api_instance.namespaces_read(slug)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling NamespacesApi->namespaces_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **String**|  | 

### Return type

[**Namespace**](Namespace.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



