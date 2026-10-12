# CloudsmithApi::BadgesApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**badges_version_list**](BadgesApi.md#badges_version_list) | **GET** /badges/version/{owner}/{repo}/{package_format}/{package_name}/{package_version}/{package_identifiers}/ | Get latest package version for a package or package group. |


## badges_version_list

> Object badges_version_list(owner, repo, package_format, package_name, package_version, package_identifiers, opts)

Get latest package version for a package or package group.

Get latest package version for a package or package group.

### Examples

```ruby
require 'time'
require 'cloudsmith-api'
# setup authorization
CloudsmithApi.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['X-Api-Key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['X-Api-Key'] = 'Bearer'

  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = CloudsmithApi::BadgesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
package_format = 'package_format_example' # String | 
package_name = 'package_name_example' # String | 
package_version = 'package_version_example' # String | 
package_identifiers = 'package_identifiers_example' # String | 
opts = {
  badge_token: 'badge_token_example', # String | Badge token to authenticate for private packages
  cache_seconds: 'cache_seconds_example', # String | Override the shields.io badge cacheSeconds value.
  color: 'color_example', # String | Override the shields.io badge color value.
  label: 'label_example', # String | Override the shields.io badge label value.
  label_color: 'label_color_example', # String | Override the shields.io badge labelColor value.
  logo_color: 'logo_color_example', # String | Override the shields.io badge logoColor value.
  logo_width: 'logo_width_example', # String | Override the shields.io badge logoWidth value.
  render: true, # Boolean | If true, badge will be rendered
  shields: true, # Boolean | If true, a shields response will be generated
  show_latest: true, # Boolean | If true, for latest version badges a '(latest)' suffix is added
  style: 'style_example' # String | Override the shields.io badge style value.
}

begin
  # Get latest package version for a package or package group.
  result = api_instance.badges_version_list(owner, repo, package_format, package_name, package_version, package_identifiers, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling BadgesApi->badges_version_list: #{e}"
end
```

#### Using the badges_version_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Object, Integer, Hash)> badges_version_list_with_http_info(owner, repo, package_format, package_name, package_version, package_identifiers, opts)

```ruby
begin
  # Get latest package version for a package or package group.
  data, status_code, headers = api_instance.badges_version_list_with_http_info(owner, repo, package_format, package_name, package_version, package_identifiers, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Object
rescue CloudsmithApi::ApiError => e
  puts "Error when calling BadgesApi->badges_version_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **package_format** | **String** |  |  |
| **package_name** | **String** |  |  |
| **package_version** | **String** |  |  |
| **package_identifiers** | **String** |  |  |
| **badge_token** | **String** | Badge token to authenticate for private packages | [optional] |
| **cache_seconds** | **String** | Override the shields.io badge cacheSeconds value. | [optional][default to &#39;300&#39;] |
| **color** | **String** | Override the shields.io badge color value. | [optional][default to &#39;12577E&#39;] |
| **label** | **String** | Override the shields.io badge label value. | [optional][default to &#39;cloudsmith&#39;] |
| **label_color** | **String** | Override the shields.io badge labelColor value. | [optional][default to &#39;021F2F&#39;] |
| **logo_color** | **String** | Override the shields.io badge logoColor value. | [optional][default to &#39;45B6EE&#39;] |
| **logo_width** | **String** | Override the shields.io badge logoWidth value. | [optional][default to &#39;10&#39;] |
| **render** | **Boolean** | If true, badge will be rendered | [optional][default to false] |
| **shields** | **Boolean** | If true, a shields response will be generated | [optional][default to false] |
| **show_latest** | **Boolean** | If true, for latest version badges a &#39;(latest)&#39; suffix is added | [optional][default to false] |
| **style** | **String** | Override the shields.io badge style value. | [optional][default to &#39;flat-square&#39;] |

### Return type

**Object**

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

