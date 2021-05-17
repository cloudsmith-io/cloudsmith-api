# CloudsmithApi::WebhooksApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhooks_create**](WebhooksApi.md#webhooks_create) | **POST** /webhooks/{owner}/{repo}/ | Create a specific webhook in a repository.
[**webhooks_delete**](WebhooksApi.md#webhooks_delete) | **DELETE** /webhooks/{owner}/{repo}/{identifier}/ | Delete a specific webhook in a repository.
[**webhooks_list**](WebhooksApi.md#webhooks_list) | **GET** /webhooks/{owner}/{repo}/ | Get a list of all webhooks in a repository.
[**webhooks_partial_update**](WebhooksApi.md#webhooks_partial_update) | **PATCH** /webhooks/{owner}/{repo}/{identifier}/ | Update a specific webhook in a repository.
[**webhooks_read**](WebhooksApi.md#webhooks_read) | **GET** /webhooks/{owner}/{repo}/{identifier}/ | Views for working with repository webhooks.


# **webhooks_create**
> RepositoryWebhook webhooks_create(owner, repo, opts)

Create a specific webhook in a repository.

Create a specific webhook in a repository.

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

api_instance = CloudsmithApi::WebhooksApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  data: CloudsmithApi::WebhooksCreate.new # WebhooksCreate | 
}

begin
  #Create a specific webhook in a repository.
  result = api_instance.webhooks_create(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling WebhooksApi->webhooks_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**WebhooksCreate**](WebhooksCreate.md)|  | [optional] 

### Return type

[**RepositoryWebhook**](RepositoryWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **webhooks_delete**
> webhooks_delete(owner, repo, identifier)

Delete a specific webhook in a repository.

Delete a specific webhook in a repository.

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

api_instance = CloudsmithApi::WebhooksApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

identifier = "identifier_example" # String | 


begin
  #Delete a specific webhook in a repository.
  api_instance.webhooks_delete(owner, repo, identifier)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling WebhooksApi->webhooks_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **webhooks_list**
> Array&lt;RepositoryWebhook&gt; webhooks_list(owner, repo, opts)

Get a list of all webhooks in a repository.

Get a list of all webhooks in a repository.

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

api_instance = CloudsmithApi::WebhooksApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Get a list of all webhooks in a repository.
  result = api_instance.webhooks_list(owner, repo, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling WebhooksApi->webhooks_list: #{e}"
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

[**Array&lt;RepositoryWebhook&gt;**](RepositoryWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **webhooks_partial_update**
> RepositoryWebhook webhooks_partial_update(owner, repo, identifier, opts)

Update a specific webhook in a repository.

Update a specific webhook in a repository.

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

api_instance = CloudsmithApi::WebhooksApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

identifier = "identifier_example" # String | 

opts = { 
  data: CloudsmithApi::WebhooksPartialUpdate.new # WebhooksPartialUpdate | 
}

begin
  #Update a specific webhook in a repository.
  result = api_instance.webhooks_partial_update(owner, repo, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling WebhooksApi->webhooks_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**WebhooksPartialUpdate**](WebhooksPartialUpdate.md)|  | [optional] 

### Return type

[**RepositoryWebhook**](RepositoryWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **webhooks_read**
> RepositoryWebhook webhooks_read(owner, repo, identifier)

Views for working with repository webhooks.

Views for working with repository webhooks.

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

api_instance = CloudsmithApi::WebhooksApi.new

owner = "owner_example" # String | 

repo = "repo_example" # String | 

identifier = "identifier_example" # String | 


begin
  #Views for working with repository webhooks.
  result = api_instance.webhooks_read(owner, repo, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling WebhooksApi->webhooks_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

[**RepositoryWebhook**](RepositoryWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



