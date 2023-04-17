# CloudsmithApi::ReposApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repos_create**](ReposApi.md#repos_create) | **POST** /repos/{owner}/ | Create a new repository in a given namespace.
[**repos_delete**](ReposApi.md#repos_delete) | **DELETE** /repos/{owner}/{identifier}/ | Delete a repository in a given namespace.
[**repos_geoip_disable**](ReposApi.md#repos_geoip_disable) | **POST** /repos/{owner}/{identifier}/geoip/disable/ | Disable GeoIP for this repository.
[**repos_geoip_enable**](ReposApi.md#repos_geoip_enable) | **POST** /repos/{owner}/{identifier}/geoip/enable/ | Enable GeoIP for this repository.
[**repos_geoip_partial_update**](ReposApi.md#repos_geoip_partial_update) | **PATCH** /repos/{owner}/{identifier}/geoip | Partially update existing repository geoip rules with those specified
[**repos_geoip_read**](ReposApi.md#repos_geoip_read) | **GET** /repos/{owner}/{identifier}/geoip | List all created GeoIP rules for the repository.
[**repos_geoip_test**](ReposApi.md#repos_geoip_test) | **POST** /repos/{owner}/{identifier}/geoip/test/ | Test a list of IP addresses against the repository&#39;s current GeoIP rules.
[**repos_geoip_update**](ReposApi.md#repos_geoip_update) | **PUT** /repos/{owner}/{identifier}/geoip | Replace all existing repository geoip rules with those specified
[**repos_gpg_create**](ReposApi.md#repos_gpg_create) | **POST** /repos/{owner}/{identifier}/gpg/ | Set the active GPG key for the Repository.
[**repos_gpg_list**](ReposApi.md#repos_gpg_list) | **GET** /repos/{owner}/{identifier}/gpg/ | Retrieve the active GPG key for the Repository.
[**repos_gpg_regenerate**](ReposApi.md#repos_gpg_regenerate) | **POST** /repos/{owner}/{identifier}/gpg/regenerate/ | Regenerate GPG Key for the Repository.
[**repos_namespace_list**](ReposApi.md#repos_namespace_list) | **GET** /repos/{owner}/ | Get a list of all repositories within a namespace.
[**repos_partial_update**](ReposApi.md#repos_partial_update) | **PATCH** /repos/{owner}/{identifier}/ | Update details about a repository in a given namespace.
[**repos_privileges_list**](ReposApi.md#repos_privileges_list) | **GET** /repos/{owner}/{identifier}/privileges | List all explicity created privileges for the repository.
[**repos_privileges_partial_update**](ReposApi.md#repos_privileges_partial_update) | **PATCH** /repos/{owner}/{identifier}/privileges | Modify privileges for the repository.
[**repos_privileges_update**](ReposApi.md#repos_privileges_update) | **PUT** /repos/{owner}/{identifier}/privileges | Replace all existing repository privileges with those specified.
[**repos_read**](ReposApi.md#repos_read) | **GET** /repos/{owner}/{identifier}/ | Get a specific repository.
[**repos_rsa_create**](ReposApi.md#repos_rsa_create) | **POST** /repos/{owner}/{identifier}/rsa/ | Set the active RSA key for the Repository.
[**repos_rsa_list**](ReposApi.md#repos_rsa_list) | **GET** /repos/{owner}/{identifier}/rsa/ | Retrieve the active RSA key for the Repository.
[**repos_rsa_regenerate**](ReposApi.md#repos_rsa_regenerate) | **POST** /repos/{owner}/{identifier}/rsa/regenerate/ | Regenerate RSA Key for the Repository.
[**repos_user_list**](ReposApi.md#repos_user_list) | **GET** /repos/ | Get a list of all repositories associated with current user.


# **repos_create**
> RepositoryCreate repos_create(owner, opts)

Create a new repository in a given namespace.

Create a new repository in a given namespace.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

opts = { 
  data: CloudsmithApi::RepositoryCreateRequest.new # RepositoryCreateRequest | 
}

begin
  #Create a new repository in a given namespace.
  result = api_instance.repos_create(owner, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **data** | [**RepositoryCreateRequest**](RepositoryCreateRequest.md)|  | [optional] 

### Return type

[**RepositoryCreate**](RepositoryCreate.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_delete**
> repos_delete(owner, identifier)

Delete a repository in a given namespace.

Delete a repository in a given namespace.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Delete a repository in a given namespace.
  api_instance.repos_delete(owner, identifier)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_geoip_disable**
> repos_geoip_disable(owner, identifier, opts)

Disable GeoIP for this repository.

Disable GeoIP for this repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::RespositoryGeoIPEnableDisableRequest.new # RespositoryGeoIPEnableDisableRequest | 
}

begin
  #Disable GeoIP for this repository.
  api_instance.repos_geoip_disable(owner, identifier, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_geoip_disable: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RespositoryGeoIPEnableDisableRequest**](RespositoryGeoIPEnableDisableRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_geoip_enable**
> repos_geoip_enable(owner, identifier, opts)

Enable GeoIP for this repository.

Enable GeoIP for this repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::RespositoryGeoIPEnableDisableRequest.new # RespositoryGeoIPEnableDisableRequest | 
}

begin
  #Enable GeoIP for this repository.
  api_instance.repos_geoip_enable(owner, identifier, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_geoip_enable: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RespositoryGeoIPEnableDisableRequest**](RespositoryGeoIPEnableDisableRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_geoip_partial_update**
> RepositoryGeoIpRules repos_geoip_partial_update(owner, identifier, opts)

Partially update existing repository geoip rules with those specified

Partially update existing repository geoip rules with those specified

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::RepositoryGeoIpRules2.new # RepositoryGeoIpRules2 | 
}

begin
  #Partially update existing repository geoip rules with those specified
  result = api_instance.repos_geoip_partial_update(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_geoip_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryGeoIpRules2**](RepositoryGeoIpRules2.md)|  | [optional] 

### Return type

[**RepositoryGeoIpRules**](RepositoryGeoIpRules.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_geoip_read**
> RepositoryGeoIpRules repos_geoip_read(owner, identifier)

List all created GeoIP rules for the repository.

List all created GeoIP rules for the repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #List all created GeoIP rules for the repository.
  result = api_instance.repos_geoip_read(owner, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_geoip_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

[**RepositoryGeoIpRules**](RepositoryGeoIpRules.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_geoip_test**
> RepositoryGeoIPTestAddressResponse repos_geoip_test(owner, identifier, opts)

Test a list of IP addresses against the repository's current GeoIP rules.

Test a list of IP addresses against the repository's current GeoIP rules.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::RepositoryGeoIPTestAddress.new # RepositoryGeoIPTestAddress | 
}

begin
  #Test a list of IP addresses against the repository's current GeoIP rules.
  result = api_instance.repos_geoip_test(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_geoip_test: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryGeoIPTestAddress**](RepositoryGeoIPTestAddress.md)|  | [optional] 

### Return type

[**RepositoryGeoIPTestAddressResponse**](RepositoryGeoIPTestAddressResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_geoip_update**
> repos_geoip_update(owner, identifier, opts)

Replace all existing repository geoip rules with those specified

Replace all existing repository geoip rules with those specified

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::RepositoryGeoIpRules1.new # RepositoryGeoIpRules1 | 
}

begin
  #Replace all existing repository geoip rules with those specified
  api_instance.repos_geoip_update(owner, identifier, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_geoip_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryGeoIpRules1**](RepositoryGeoIpRules1.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_gpg_create**
> RepositoryGpgKey repos_gpg_create(owner, identifier, opts)

Set the active GPG key for the Repository.

Set the active GPG key for the Repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::RepositoryGpgKeyCreate.new # RepositoryGpgKeyCreate | 
}

begin
  #Set the active GPG key for the Repository.
  result = api_instance.repos_gpg_create(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_gpg_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryGpgKeyCreate**](RepositoryGpgKeyCreate.md)|  | [optional] 

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_gpg_list**
> RepositoryGpgKey repos_gpg_list(owner, identifier)

Retrieve the active GPG key for the Repository.

Retrieve the active GPG key for the Repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Retrieve the active GPG key for the Repository.
  result = api_instance.repos_gpg_list(owner, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_gpg_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_gpg_regenerate**
> RepositoryGpgKey repos_gpg_regenerate(owner, identifier)

Regenerate GPG Key for the Repository.

Regenerate GPG Key for the Repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Regenerate GPG Key for the Repository.
  result = api_instance.repos_gpg_regenerate(owner, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_gpg_regenerate: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_namespace_list**
> Array&lt;Repository&gt; repos_namespace_list(owner, opts)

Get a list of all repositories within a namespace.

Get a list of all repositories within a namespace.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Get a list of all repositories within a namespace.
  result = api_instance.repos_namespace_list(owner, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_namespace_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;Repository&gt;**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_partial_update**
> Repository repos_partial_update(owner, identifier, opts)

Update details about a repository in a given namespace.

Update details about a repository in a given namespace.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::RepositoryRequestPatch.new # RepositoryRequestPatch | 
}

begin
  #Update details about a repository in a given namespace.
  result = api_instance.repos_partial_update(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryRequestPatch**](RepositoryRequestPatch.md)|  | [optional] 

### Return type

[**Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_privileges_list**
> RepositoryPrivilegeInput repos_privileges_list(owner, identifier, opts)

List all explicity created privileges for the repository.

List all explicity created privileges for the repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #List all explicity created privileges for the repository.
  result = api_instance.repos_privileges_list(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_privileges_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**RepositoryPrivilegeInput**](RepositoryPrivilegeInput.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_privileges_partial_update**
> repos_privileges_partial_update(owner, identifier, opts)

Modify privileges for the repository.

Modify privileges for the repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::RepositoryPrivilegeInputRequestPatch.new # RepositoryPrivilegeInputRequestPatch | 
}

begin
  #Modify privileges for the repository.
  api_instance.repos_privileges_partial_update(owner, identifier, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_privileges_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryPrivilegeInputRequestPatch**](RepositoryPrivilegeInputRequestPatch.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_privileges_update**
> repos_privileges_update(owner, identifier, opts)

Replace all existing repository privileges with those specified.

Replace all existing repository privileges with those specified.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::RepositoryPrivilegeInputRequest.new # RepositoryPrivilegeInputRequest | 
}

begin
  #Replace all existing repository privileges with those specified.
  api_instance.repos_privileges_update(owner, identifier, opts)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_privileges_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryPrivilegeInputRequest**](RepositoryPrivilegeInputRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_read**
> Repository repos_read(owner, identifier)

Get a specific repository.

Get a specific repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Get a specific repository.
  result = api_instance.repos_read(owner, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

[**Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_rsa_create**
> RepositoryRsaKey repos_rsa_create(owner, identifier, opts)

Set the active RSA key for the Repository.

Set the active RSA key for the Repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 

opts = { 
  data: CloudsmithApi::RepositoryRsaKeyCreate.new # RepositoryRsaKeyCreate | 
}

begin
  #Set the active RSA key for the Repository.
  result = api_instance.repos_rsa_create(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_rsa_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryRsaKeyCreate**](RepositoryRsaKeyCreate.md)|  | [optional] 

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_rsa_list**
> RepositoryRsaKey repos_rsa_list(owner, identifier)

Retrieve the active RSA key for the Repository.

Retrieve the active RSA key for the Repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Retrieve the active RSA key for the Repository.
  result = api_instance.repos_rsa_list(owner, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_rsa_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_rsa_regenerate**
> RepositoryRsaKey repos_rsa_regenerate(owner, identifier)

Regenerate RSA Key for the Repository.

Regenerate RSA Key for the Repository.

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

api_instance = CloudsmithApi::ReposApi.new

owner = 'owner_example' # String | 

identifier = 'identifier_example' # String | 


begin
  #Regenerate RSA Key for the Repository.
  result = api_instance.repos_rsa_regenerate(owner, identifier)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_rsa_regenerate: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_user_list**
> Array&lt;Repository&gt; repos_user_list(opts)

Get a list of all repositories associated with current user.

Get a list of all repositories associated with current user.

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

api_instance = CloudsmithApi::ReposApi.new

opts = { 
  page: 56, # Integer | A page number within the paginated result set.
  page_size: 56 # Integer | Number of results to return per page.
}

begin
  #Get a list of all repositories associated with current user.
  result = api_instance.repos_user_list(opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_user_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| A page number within the paginated result set. | [optional] 
 **page_size** | **Integer**| Number of results to return per page. | [optional] 

### Return type

[**Array&lt;Repository&gt;**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



