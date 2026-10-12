# CloudsmithApi::VulnerabilitiesApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**vulnerabilities_namespace_list**](VulnerabilitiesApi.md#vulnerabilities_namespace_list) | **GET** /vulnerabilities/{owner}/ | Lists scan results for a specific namespace. |
| [**vulnerabilities_package_list**](VulnerabilitiesApi.md#vulnerabilities_package_list) | **GET** /vulnerabilities/{owner}/{repo}/{package}/ | Lists scan results for a specific package. |
| [**vulnerabilities_read**](VulnerabilitiesApi.md#vulnerabilities_read) | **GET** /vulnerabilities/{owner}/{repo}/{package}/{identifier}/ | Get a scan result. |
| [**vulnerabilities_repo_list**](VulnerabilitiesApi.md#vulnerabilities_repo_list) | **GET** /vulnerabilities/{owner}/{repo}/ | Lists scan results for a specific repository. |


## vulnerabilities_namespace_list

> <Array<VulnerabilityScanResultsList>> vulnerabilities_namespace_list(owner, opts)

Lists scan results for a specific namespace.

Lists scan results for a specific namespace.

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

api_instance = CloudsmithApi::VulnerabilitiesApi.new
owner = 'owner_example' # String | 
opts = {
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  # Lists scan results for a specific namespace.
  result = api_instance.vulnerabilities_namespace_list(owner, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling VulnerabilitiesApi->vulnerabilities_namespace_list: #{e}"
end
```

#### Using the vulnerabilities_namespace_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<VulnerabilityScanResultsList>>, Integer, Hash)> vulnerabilities_namespace_list_with_http_info(owner, opts)

```ruby
begin
  # Lists scan results for a specific namespace.
  data, status_code, headers = api_instance.vulnerabilities_namespace_list_with_http_info(owner, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<VulnerabilityScanResultsList>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling VulnerabilitiesApi->vulnerabilities_namespace_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |

### Return type

[**Array&lt;VulnerabilityScanResultsList&gt;**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## vulnerabilities_package_list

> <Array<VulnerabilityScanResultsList>> vulnerabilities_package_list(owner, repo, package, opts)

Lists scan results for a specific package.

Lists scan results for a specific package.

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

api_instance = CloudsmithApi::VulnerabilitiesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
package = 'package_example' # String | 
opts = {
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  # Lists scan results for a specific package.
  result = api_instance.vulnerabilities_package_list(owner, repo, package, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling VulnerabilitiesApi->vulnerabilities_package_list: #{e}"
end
```

#### Using the vulnerabilities_package_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<VulnerabilityScanResultsList>>, Integer, Hash)> vulnerabilities_package_list_with_http_info(owner, repo, package, opts)

```ruby
begin
  # Lists scan results for a specific package.
  data, status_code, headers = api_instance.vulnerabilities_package_list_with_http_info(owner, repo, package, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<VulnerabilityScanResultsList>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling VulnerabilitiesApi->vulnerabilities_package_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **package** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |

### Return type

[**Array&lt;VulnerabilityScanResultsList&gt;**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## vulnerabilities_read

> <VulnerabilityScanResults> vulnerabilities_read(owner, repo, package, identifier)

Get a scan result.

Get a scan result.

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

api_instance = CloudsmithApi::VulnerabilitiesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
package = 'package_example' # String | 
identifier = 'identifier_example' # String | 

begin
  # Get a scan result.
  result = api_instance.vulnerabilities_read(owner, repo, package, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling VulnerabilitiesApi->vulnerabilities_read: #{e}"
end
```

#### Using the vulnerabilities_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<VulnerabilityScanResults>, Integer, Hash)> vulnerabilities_read_with_http_info(owner, repo, package, identifier)

```ruby
begin
  # Get a scan result.
  data, status_code, headers = api_instance.vulnerabilities_read_with_http_info(owner, repo, package, identifier)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <VulnerabilityScanResults>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling VulnerabilitiesApi->vulnerabilities_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **package** | **String** |  |  |
| **identifier** | **String** |  |  |

### Return type

[**VulnerabilityScanResults**](VulnerabilityScanResults.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## vulnerabilities_repo_list

> <Array<VulnerabilityScanResultsList>> vulnerabilities_repo_list(owner, repo, opts)

Lists scan results for a specific repository.

Lists scan results for a specific repository.

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

api_instance = CloudsmithApi::VulnerabilitiesApi.new
owner = 'owner_example' # String | 
repo = 'repo_example' # String | 
opts = {
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  # Lists scan results for a specific repository.
  result = api_instance.vulnerabilities_repo_list(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Error when calling VulnerabilitiesApi->vulnerabilities_repo_list: #{e}"
end
```

#### Using the vulnerabilities_repo_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<VulnerabilityScanResultsList>>, Integer, Hash)> vulnerabilities_repo_list_with_http_info(owner, repo, opts)

```ruby
begin
  # Lists scan results for a specific repository.
  data, status_code, headers = api_instance.vulnerabilities_repo_list_with_http_info(owner, repo, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<VulnerabilityScanResultsList>>
rescue CloudsmithApi::ApiError => e
  puts "Error when calling VulnerabilitiesApi->vulnerabilities_repo_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **String** |  |  |
| **repo** | **String** |  |  |
| **page** | **Integer** | A page number within the paginated result set. | [optional] |
| **page_size** | **Integer** | Number of results to return per page. | [optional] |

### Return type

[**Array&lt;VulnerabilityScanResultsList&gt;**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

