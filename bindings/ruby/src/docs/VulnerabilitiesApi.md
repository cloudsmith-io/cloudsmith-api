# CloudsmithApi::VulnerabilitiesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vulnerabilities_list**](VulnerabilitiesApi.md#vulnerabilities_list) | **GET** /vulnerabilities/{owner}/ | Read-only view to list vulnerabiltiy scan results within a Namespace.
[**vulnerabilities_list0**](VulnerabilitiesApi.md#vulnerabilities_list0) | **GET** /vulnerabilities/{owner}/{repo}/ | Read-only views to list vulnerabiltiy scan results within a Repository.
[**vulnerabilities_list1**](VulnerabilitiesApi.md#vulnerabilities_list1) | **GET** /vulnerabilities/{owner}/{repo}/{package}/ | Read-only views to list vulnerabiltiy scan results within a Repository
[**vulnerabilities_read**](VulnerabilitiesApi.md#vulnerabilities_read) | **GET** /vulnerabilities/{owner}/{repo}/{package}/{scan_id}/ | Read-only view to retrieve vulnerability scans results using a


# **vulnerabilities_list**
> Array&lt;VulnerabilityScanResultsList&gt; vulnerabilities_list(owner, opts)

Read-only view to list vulnerabiltiy scan results within a Namespace.

Read-only view to list vulnerabiltiy scan results within a Namespace.

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
  #Read-only view to list vulnerabiltiy scan results within a Namespace.
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

Read-only views to list vulnerabiltiy scan results within a Repository.

Read-only views to list vulnerabiltiy scan results within a Repository.

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
  #Read-only views to list vulnerabiltiy scan results within a Repository.
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

Read-only views to list vulnerabiltiy scan results within a Repository

Read-only views to list vulnerabiltiy scan results within a Repository for a given Package identifier.

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

package = "package_example" # String | The package that the scan result relates to.

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Read-only views to list vulnerabiltiy scan results within a Repository
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
 **package** | **String**| The package that the scan result relates to. | 
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

Read-only view to retrieve vulnerability scans results using a

Read-only view to retrieve vulnerability scans results using a vulnerabiltiy scan results identifier (slug_perm).

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

package = "package_example" # String | The package that the scan result relates to.

scan_id = "scan_id_example" # String | A sequential identifier that increments by one for each new scan result within a package. These are always unique and can be used to reference the scan results elsewhere (e.g. via the CLI.)


begin
  #Read-only view to retrieve vulnerability scans results using a
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
 **package** | **String**| The package that the scan result relates to. | 
 **scan_id** | **String**| A sequential identifier that increments by one for each new scan result within a package. These are always unique and can be used to reference the scan results elsewhere (e.g. via the CLI.) | 

### Return type

[**VulnerabilityScanResults**](VulnerabilityScanResults.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



