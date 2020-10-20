# CloudsmithApi::BadgesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**badges_version_list**](BadgesApi.md#badges_version_list) | **GET** /badges/version/{owner}/{repo}/{package_format}/{package_name}/{package_version}/{package_identifiers}/ | Get latest package version for a package or package group.


# **badges_version_list**
> badges_version_list(owner, repo, package_format, package_name, package_version, package_identifiers, opts)

Get latest package version for a package or package group.

Get latest package version for a package or package group.

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

api_instance = CloudsmithApi::BadgesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

package_format = "package_format_example" # String | 

package_name = "package_name_example" # String | 

package_version = "package_version_example" # String | 

package_identifiers = "package_identifiers_example" # String | 

opts = { 
  badge_token: "badge_token_example", # String | Badge token to authenticate for private packages
  render: true # BOOLEAN | If true, badge will be rendered
}

begin
  #Get latest package version for a package or package group.
  api_instance.badges_version_list(owner, repo, package_format, package_name, package_version, package_identifiers, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling BadgesApi->badges_version_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **package_format** | **String**|  | 
 **package_name** | **String**|  | 
 **package_version** | **String**|  | 
 **package_identifiers** | **String**|  | 
 **badge_token** | **String**| Badge token to authenticate for private packages | [optional] 
 **render** | **BOOLEAN**| If true, badge will be rendered | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



