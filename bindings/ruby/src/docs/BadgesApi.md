# CloudsmithApi::BadgesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**badges_version_list**](BadgesApi.md#badges_version_list) | **GET** /badges/version/{owner}/{repo}/{package_format}/{package_name}/{package_version}/{package_identifiers}/ | Get latest package version for a package or package group.


# **badges_version_list**
> PackageVersionBadgeResponse badges_version_list(owner, repo, package_format, package_name, package_version, package_identifiers, opts)

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

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

package_format = 'package_format_example' # String | 

package_name = 'package_name_example' # String | 

package_version = 'package_version_example' # String | 

package_identifiers = 'package_identifiers_example' # String | 

opts = { 
  badge_token: '', # String | Badge token to authenticate for private packages
  cache_seconds: '300', # String | Override the shields.io badge cacheSeconds value.
  color: '12577E', # String | Override the shields.io badge color value.
  label: 'cloudsmith', # String | Override the shields.io badge label value.
  label_color: '021F2F', # String | Override the shields.io badge labelColor value.
  logo_color: '45B6EE', # String | Override the shields.io badge logoColor value.
  logo_width: '10', # String | Override the shields.io badge logoWidth value.
  render: false, # BOOLEAN | If true, badge will be rendered
  shields: false, # BOOLEAN | If true, a shields response will be generated
  show_latest: false, # BOOLEAN | If true, for latest version badges a '(latest)' suffix is added
  style: 'flat-square' # String | Override the shields.io badge style value.
}

begin
  #Get latest package version for a package or package group.
  result = api_instance.badges_version_list(owner, repo, package_format, package_name, package_version, package_identifiers, opts)
  p result
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
 **badge_token** | **String**| Badge token to authenticate for private packages | [optional] [default to ]
 **cache_seconds** | **String**| Override the shields.io badge cacheSeconds value. | [optional] [default to 300]
 **color** | **String**| Override the shields.io badge color value. | [optional] [default to 12577E]
 **label** | **String**| Override the shields.io badge label value. | [optional] [default to cloudsmith]
 **label_color** | **String**| Override the shields.io badge labelColor value. | [optional] [default to 021F2F]
 **logo_color** | **String**| Override the shields.io badge logoColor value. | [optional] [default to 45B6EE]
 **logo_width** | **String**| Override the shields.io badge logoWidth value. | [optional] [default to 10]
 **render** | **BOOLEAN**| If true, badge will be rendered | [optional] [default to false]
 **shields** | **BOOLEAN**| If true, a shields response will be generated | [optional] [default to false]
 **show_latest** | **BOOLEAN**| If true, for latest version badges a &#39;(latest)&#39; suffix is added | [optional] [default to false]
 **style** | **String**| Override the shields.io badge style value. | [optional] [default to flat-square]

### Return type

[**PackageVersionBadgeResponse**](PackageVersionBadgeResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



