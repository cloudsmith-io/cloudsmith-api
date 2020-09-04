# CloudsmithApi::MetricsApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**metrics_entitlements_usage_list**](MetricsApi.md#metrics_entitlements_usage_list) | **GET** /metrics/{owner}/{repo}/entitlements/usage/ | View for listing entitlement token usage as a metric.
[**metrics_packages_usage_list**](MetricsApi.md#metrics_packages_usage_list) | **GET** /metrics/{owner}/{repo}/packages/usage/ | View for listing package usage metrics by user.


# **metrics_entitlements_usage_list**
> Array&lt;EntitlementTokenMetric&gt; metrics_entitlements_usage_list(owner, repo, opts)

View for listing entitlement token usage as a metric.

View for listing entitlement token usage as a metric.

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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::MetricsApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  finish: 56, # Integer | Filter token usage ending before this datetime (UTC by default unless otherwise specified). Defaults to now if not supplied.
  start: 56, # Integer | Filter token usage starting from this datetime (UTC by default unless otherwise specified)).
  tokens: "tokens_example" # String | A comma seperated list of tokens (slug perm) to include in the results.
}

begin
  #View for listing entitlement token usage as a metric.
  result = api_instance.metrics_entitlements_usage_list(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling MetricsApi->metrics_entitlements_usage_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 
 **finish** | **Integer**| Filter token usage ending before this datetime (UTC by default unless otherwise specified). Defaults to now if not supplied. | [optional] 
 **start** | **Integer**| Filter token usage starting from this datetime (UTC by default unless otherwise specified)). | [optional] 
 **tokens** | **String**| A comma seperated list of tokens (slug perm) to include in the results. | [optional] 

### Return type

[**Array&lt;EntitlementTokenMetric&gt;**](EntitlementTokenMetric.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **metrics_packages_usage_list**
> Array&lt;PackageUsageMetric&gt; metrics_packages_usage_list(owner, repo, opts)

View for listing package usage metrics by user.

View for listing package usage metrics by user.

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

  # Configure API key authorization: csrf_token
  config.api_key['X-CSRFToken'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['X-CSRFToken'] = 'Bearer'
end

api_instance = CloudsmithApi::MetricsApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56, # Integer | Number of results to return per page.
  finish: 56, # Integer | Filter token usage ending before this datetime (UTC). Defaults to now if not supplied.
  packages: "packages_example", # String | A comma seperated list of packages (slug perm) to include in the results.
  start: 56 # Integer | Filter token usage starting from this datetime (UTC)).
}

begin
  #View for listing package usage metrics by user.
  result = api_instance.metrics_packages_usage_list(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling MetricsApi->metrics_packages_usage_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 
 **finish** | **Integer**| Filter token usage ending before this datetime (UTC). Defaults to now if not supplied. | [optional] 
 **packages** | **String**| A comma seperated list of packages (slug perm) to include in the results. | [optional] 
 **start** | **Integer**| Filter token usage starting from this datetime (UTC)). | [optional] 

### Return type

[**Array&lt;PackageUsageMetric&gt;**](PackageUsageMetric.md)

### Authorization

[apikey](../README.md#apikey), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



