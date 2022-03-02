# CloudsmithApi::MetricsApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**metrics_entitlements_list**](MetricsApi.md#metrics_entitlements_list) | **GET** /metrics/entitlements/{owner}/ | View for listing entitlement token metrics, across an account.
[**metrics_entitlements_list0**](MetricsApi.md#metrics_entitlements_list0) | **GET** /metrics/entitlements/{owner}/{repo}/ | View for listing entitlement token metrics, for a repository.
[**metrics_packages_list**](MetricsApi.md#metrics_packages_list) | **GET** /metrics/packages/{owner}/{repo}/ | View for listing package usage metrics, for a repository.


# **metrics_entitlements_list**
> EntitlementUsageMetrics metrics_entitlements_list(owner, opts)

View for listing entitlement token metrics, across an account.

View for listing entitlement token metrics, across an account.

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

api_instance = CloudsmithApi::MetricsApi.new

owner = 'owner_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  finish: 'finish_example', # String | Include metrics upto and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
  start: 'start_example', # String | Include metrics from and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
  tokens: 'tokens_example' # String | A comma seperated list of tokens (slug perm) to include in the results.
}

begin
  #View for listing entitlement token metrics, across an account.
  result = api_instance.metrics_entitlements_list(owner, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling MetricsApi->metrics_entitlements_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 
 **finish** | **String**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 
 **start** | **String**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 
 **tokens** | **String**| A comma seperated list of tokens (slug perm) to include in the results. | [optional] 

### Return type

[**EntitlementUsageMetrics**](EntitlementUsageMetrics.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **metrics_entitlements_list0**
> EntitlementUsageMetrics metrics_entitlements_list0(owner, repo, opts)

View for listing entitlement token metrics, for a repository.

View for listing entitlement token metrics, for a repository.

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

api_instance = CloudsmithApi::MetricsApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  finish: 'finish_example', # String | Include metrics upto and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
  start: 'start_example', # String | Include metrics from and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
  tokens: 'tokens_example' # String | A comma seperated list of tokens (slug perm) to include in the results.
}

begin
  #View for listing entitlement token metrics, for a repository.
  result = api_instance.metrics_entitlements_list0(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling MetricsApi->metrics_entitlements_list0: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 
 **finish** | **String**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 
 **start** | **String**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 
 **tokens** | **String**| A comma seperated list of tokens (slug perm) to include in the results. | [optional] 

### Return type

[**EntitlementUsageMetrics**](EntitlementUsageMetrics.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **metrics_packages_list**
> PackageUsageMetrics metrics_packages_list(owner, repo, opts)

View for listing package usage metrics, for a repository.

View for listing package usage metrics, for a repository.

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

api_instance = CloudsmithApi::MetricsApi.new

owner = 'owner_example' # String | 

repo = 'repo_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  finish: 'finish_example', # String | Include metrics upto and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
  packages: 'packages_example', # String | A comma seperated list of packages (slug perm) to include in the results.
  start: 'start_example' # String | Include metrics from and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
}

begin
  #View for listing package usage metrics, for a repository.
  result = api_instance.metrics_packages_list(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling MetricsApi->metrics_packages_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 
 **finish** | **String**| Include metrics upto and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 
 **packages** | **String**| A comma seperated list of packages (slug perm) to include in the results. | [optional] 
 **start** | **String**| Include metrics from and including this UTC date or UTC datetime. For example &#39;2020-12-31&#39; or &#39;2021-12-13T00:00:00Z&#39;. | [optional] 

### Return type

[**PackageUsageMetrics**](PackageUsageMetrics.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



