# CloudsmithApi::RecycleBinApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**recycle_bin_list**](RecycleBinApi.md#recycle_bin_list) | **GET** /recycle-bin/{owner}/ | List soft-deleted packages in recycle bin
[**recycle_bin_recycle_bin_action**](RecycleBinApi.md#recycle_bin_recycle_bin_action) | **POST** /recycle-bin/{owner}/action/ | 


# **recycle_bin_list**
> Array&lt;RecycleBinPackage&gt; recycle_bin_list(owner, opts)

List soft-deleted packages in recycle bin

Retrieve all soft-deleted packages in the workspace. Optionally filter by repository using the 'repository' query parameter.

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

api_instance = CloudsmithApi::RecycleBinApi.new

owner = 'owner_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  repository: 'repository_example' # String | Filter packages by repository slug
}

begin
  #List soft-deleted packages in recycle bin
  result = api_instance.recycle_bin_list(owner, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling RecycleBinApi->recycle_bin_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 
 **repository** | **String**| Filter packages by repository slug | [optional] 

### Return type

[**Array&lt;RecycleBinPackage&gt;**](RecycleBinPackage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **recycle_bin_recycle_bin_action**
> PackageBulkActionResponse recycle_bin_recycle_bin_action(owner, opts)



Perform actions on soft-deleted packages in the recycle bin. Supported actions: permanently delete (hard delete), restore. Returns a list of successfully actioned packages and any packages that failed with error details. 

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

api_instance = CloudsmithApi::RecycleBinApi.new

owner = 'owner_example' # String | 

opts = { 
  data: CloudsmithApi::PackageRecycleBin.new # PackageRecycleBin | 
}

begin
  result = api_instance.recycle_bin_recycle_bin_action(owner, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling RecycleBinApi->recycle_bin_recycle_bin_action: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **data** | [**PackageRecycleBin**](PackageRecycleBin.md)|  | [optional] 

### Return type

[**PackageBulkActionResponse**](PackageBulkActionResponse.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



