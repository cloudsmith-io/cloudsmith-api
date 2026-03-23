# CloudsmithApi::BulkActionApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulk_action**](BulkActionApi.md#bulk_action) | **POST** /bulk-action/{owner}/ | 


# **bulk_action**
> PackageBulkActionResponse bulk_action(owner, opts)



Perform bulk operations on multiple packages within a repository or across all accessible repositories. If 'repository' is provided, actions are limited to that repository. If 'repository' is omitted, actions are performed across all repositories the user has access to within the workspace. Returns a list of successfully actioned packages and any packages that failed with error details. 

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

api_instance = CloudsmithApi::BulkActionApi.new

owner = 'owner_example' # String | 

opts = { 
  data: CloudsmithApi::PackageBulkAction.new # PackageBulkAction | 
}

begin
  result = api_instance.bulk_action(owner, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling BulkActionApi->bulk_action: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **data** | [**PackageBulkAction**](PackageBulkAction.md)|  | [optional] 

### Return type

[**PackageBulkActionResponse**](PackageBulkActionResponse.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



