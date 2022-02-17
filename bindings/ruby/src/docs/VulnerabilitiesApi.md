# CloudsmithApi::VulnerabilitiesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vulnerabilities_list**](VulnerabilitiesApi.md#vulnerabilities_list) | **GET** /vulnerabilities/{owner}/ | Lists scan results for a specific namespace.
[**vulnerabilities_list0**](VulnerabilitiesApi.md#vulnerabilities_list0) | **GET** /vulnerabilities/{owner}/{repo}/ | Lists scan results for a specific repository.
[**vulnerabilities_list1**](VulnerabilitiesApi.md#vulnerabilities_list1) | **GET** /vulnerabilities/{owner}/{repo}/{package}/ | Lists scan results for a specific package.
[**vulnerabilities_read**](VulnerabilitiesApi.md#vulnerabilities_read) | **GET** /vulnerabilities/{owner}/{repo}/{package}/{scan_id}/ | Returns a Scan Result.


# **vulnerabilities_list**
> Array&lt;VulnerabilityScanResultsList&gt; vulnerabilities_list(owner, opts)

Lists scan results for a specific namespace.

Lists scan results for a specific namespace.

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

api_instance = CloudsmithApi::VulnerabilitiesApi.new

owner = "owner_example" # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Lists scan results for a specific namespace.
  result = api_instance.vulnerabilities_list(owner, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling VulnerabilitiesApi->vulnerabilities_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;VulnerabilityScanResultsList&gt;**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **vulnerabilities_list0**
> Array&lt;VulnerabilityScanResultsList&gt; vulnerabilities_list0(owner, repo, opts)

Lists scan results for a specific repository.

Lists scan results for a specific repository.

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

api_instance = CloudsmithApi::VulnerabilitiesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Lists scan results for a specific repository.
  result = api_instance.vulnerabilities_list0(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling VulnerabilitiesApi->vulnerabilities_list0: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;VulnerabilityScanResultsList&gt;**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **vulnerabilities_list1**
> Array&lt;VulnerabilityScanResultsList&gt; vulnerabilities_list1(owner, repo, package, opts)

Lists scan results for a specific package.

Lists scan results for a specific package.

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

api_instance = CloudsmithApi::VulnerabilitiesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

package = "package_example" # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Lists scan results for a specific package.
  result = api_instance.vulnerabilities_list1(owner, repo, package, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling VulnerabilitiesApi->vulnerabilities_list1: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **package** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;VulnerabilityScanResultsList&gt;**](VulnerabilityScanResultsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **vulnerabilities_read**
> VulnerabilityScanResults vulnerabilities_read(owner, repo, package, scan_id)

Returns a Scan Result.

Returns a Scan Result.

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

api_instance = CloudsmithApi::VulnerabilitiesApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

package = "package_example" # String | 

scan_id = "scan_id_example" # String | 


begin
  #Returns a Scan Result.
  result = api_instance.vulnerabilities_read(owner, repo, package, scan_id)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling VulnerabilitiesApi->vulnerabilities_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **package** | **String**|  | 
 **scan_id** | **String**|  | 

### Return type

[**VulnerabilityScanResults**](VulnerabilityScanResults.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



