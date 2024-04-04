# CloudsmithApi::ReposApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repos_create**](ReposApi.md#repos_create) | **POST** /repos/{owner}/ | Create a new repository in a given namespace.
[**repos_delete**](ReposApi.md#repos_delete) | **DELETE** /repos/{owner}/{identifier}/ | Delete a repository in a given namespace.
[**repos_geoip_disable**](ReposApi.md#repos_geoip_disable) | **POST** /repos/{owner}/{identifier}/geoip/disable/ | Disable GeoIP for this repository.
[**repos_geoip_enable**](ReposApi.md#repos_geoip_enable) | **POST** /repos/{owner}/{identifier}/geoip/enable/ | Enable GeoIP for this repository.
[**repos_geoip_partial_update**](ReposApi.md#repos_geoip_partial_update) | **PATCH** /repos/{owner}/{identifier}/geoip | Partially update repository geoip rules.
[**repos_geoip_read**](ReposApi.md#repos_geoip_read) | **GET** /repos/{owner}/{identifier}/geoip | List all repository geoip rules.
[**repos_geoip_test**](ReposApi.md#repos_geoip_test) | **POST** /repos/{owner}/{identifier}/geoip/test/ | Test a list of IP addresses against the repository&#39;s current GeoIP rules.
[**repos_geoip_update**](ReposApi.md#repos_geoip_update) | **PUT** /repos/{owner}/{identifier}/geoip | Replace repository geoip rules.
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
[**repos_upstream_cran_create**](ReposApi.md#repos_upstream_cran_create) | **POST** /repos/{owner}/{identifier}/upstream/cran/ | Create a CRAN upstream config for this repository.
[**repos_upstream_cran_delete**](ReposApi.md#repos_upstream_cran_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Delete a CRAN upstream config for this repository.
[**repos_upstream_cran_list**](ReposApi.md#repos_upstream_cran_list) | **GET** /repos/{owner}/{identifier}/upstream/cran/ | List CRAN upstream configs for this repository.
[**repos_upstream_cran_partial_update**](ReposApi.md#repos_upstream_cran_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Partially update a CRAN upstream config for this repository.
[**repos_upstream_cran_read**](ReposApi.md#repos_upstream_cran_read) | **GET** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Retrieve a CRAN upstream config for this repository.
[**repos_upstream_cran_update**](ReposApi.md#repos_upstream_cran_update) | **PUT** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Update a CRAN upstream config for this repository.
[**repos_upstream_dart_create**](ReposApi.md#repos_upstream_dart_create) | **POST** /repos/{owner}/{identifier}/upstream/dart/ | Create a Dart upstream config for this repository.
[**repos_upstream_dart_delete**](ReposApi.md#repos_upstream_dart_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Delete a Dart upstream config for this repository.
[**repos_upstream_dart_list**](ReposApi.md#repos_upstream_dart_list) | **GET** /repos/{owner}/{identifier}/upstream/dart/ | List Dart upstream configs for this repository.
[**repos_upstream_dart_partial_update**](ReposApi.md#repos_upstream_dart_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Partially update a Dart upstream config for this repository.
[**repos_upstream_dart_read**](ReposApi.md#repos_upstream_dart_read) | **GET** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Retrieve a Dart upstream config for this repository.
[**repos_upstream_dart_update**](ReposApi.md#repos_upstream_dart_update) | **PUT** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Update a Dart upstream config for this repository.
[**repos_upstream_deb_create**](ReposApi.md#repos_upstream_deb_create) | **POST** /repos/{owner}/{identifier}/upstream/deb/ | Create a Debian upstream config for this repository.
[**repos_upstream_deb_delete**](ReposApi.md#repos_upstream_deb_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Delete a Debian upstream config for this repository.
[**repos_upstream_deb_list**](ReposApi.md#repos_upstream_deb_list) | **GET** /repos/{owner}/{identifier}/upstream/deb/ | List Debian upstream configs for this repository.
[**repos_upstream_deb_partial_update**](ReposApi.md#repos_upstream_deb_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Partially update a Debian upstream config for this repository.
[**repos_upstream_deb_read**](ReposApi.md#repos_upstream_deb_read) | **GET** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Retrieve a Debian upstream config for this repository.
[**repos_upstream_deb_update**](ReposApi.md#repos_upstream_deb_update) | **PUT** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Update a Debian upstream config for this repository.
[**repos_upstream_docker_create**](ReposApi.md#repos_upstream_docker_create) | **POST** /repos/{owner}/{identifier}/upstream/docker/ | Create a Docker upstream config for this repository.
[**repos_upstream_docker_delete**](ReposApi.md#repos_upstream_docker_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Delete a Docker upstream config for this repository.
[**repos_upstream_docker_list**](ReposApi.md#repos_upstream_docker_list) | **GET** /repos/{owner}/{identifier}/upstream/docker/ | List Docker upstream configs for this repository.
[**repos_upstream_docker_partial_update**](ReposApi.md#repos_upstream_docker_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Partially update a Docker upstream config for this repository.
[**repos_upstream_docker_read**](ReposApi.md#repos_upstream_docker_read) | **GET** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Retrieve a Docker upstream config for this repository.
[**repos_upstream_docker_update**](ReposApi.md#repos_upstream_docker_update) | **PUT** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Update a Docker upstream config for this repository.
[**repos_upstream_helm_create**](ReposApi.md#repos_upstream_helm_create) | **POST** /repos/{owner}/{identifier}/upstream/helm/ | Create a Helm upstream config for this repository.
[**repos_upstream_helm_delete**](ReposApi.md#repos_upstream_helm_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Delete a Helm upstream config for this repository.
[**repos_upstream_helm_list**](ReposApi.md#repos_upstream_helm_list) | **GET** /repos/{owner}/{identifier}/upstream/helm/ | List Helm upstream configs for this repository.
[**repos_upstream_helm_partial_update**](ReposApi.md#repos_upstream_helm_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Partially update a Helm upstream config for this repository.
[**repos_upstream_helm_read**](ReposApi.md#repos_upstream_helm_read) | **GET** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Retrieve a Helm upstream config for this repository.
[**repos_upstream_helm_update**](ReposApi.md#repos_upstream_helm_update) | **PUT** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Update a Helm upstream config for this repository.
[**repos_upstream_maven_create**](ReposApi.md#repos_upstream_maven_create) | **POST** /repos/{owner}/{identifier}/upstream/maven/ | Create a Maven upstream config for this repository.
[**repos_upstream_maven_delete**](ReposApi.md#repos_upstream_maven_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Delete a Maven upstream config for this repository.
[**repos_upstream_maven_list**](ReposApi.md#repos_upstream_maven_list) | **GET** /repos/{owner}/{identifier}/upstream/maven/ | List Maven upstream configs for this repository.
[**repos_upstream_maven_partial_update**](ReposApi.md#repos_upstream_maven_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Partially update a Maven upstream config for this repository.
[**repos_upstream_maven_read**](ReposApi.md#repos_upstream_maven_read) | **GET** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Retrieve a Maven upstream config for this repository.
[**repos_upstream_maven_update**](ReposApi.md#repos_upstream_maven_update) | **PUT** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Update a Maven upstream config for this repository.
[**repos_upstream_npm_create**](ReposApi.md#repos_upstream_npm_create) | **POST** /repos/{owner}/{identifier}/upstream/npm/ | Create a npm upstream config for this repository.
[**repos_upstream_npm_delete**](ReposApi.md#repos_upstream_npm_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Delete a npm upstream config for this repository.
[**repos_upstream_npm_list**](ReposApi.md#repos_upstream_npm_list) | **GET** /repos/{owner}/{identifier}/upstream/npm/ | List npm upstream configs for this repository.
[**repos_upstream_npm_partial_update**](ReposApi.md#repos_upstream_npm_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Partially update a npm upstream config for this repository.
[**repos_upstream_npm_read**](ReposApi.md#repos_upstream_npm_read) | **GET** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Retrieve a npm upstream config for this repository.
[**repos_upstream_npm_update**](ReposApi.md#repos_upstream_npm_update) | **PUT** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Update a npm upstream config for this repository.
[**repos_upstream_nuget_create**](ReposApi.md#repos_upstream_nuget_create) | **POST** /repos/{owner}/{identifier}/upstream/nuget/ | Create a NuGet upstream config for this repository.
[**repos_upstream_nuget_delete**](ReposApi.md#repos_upstream_nuget_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Delete a NuGet upstream config for this repository.
[**repos_upstream_nuget_list**](ReposApi.md#repos_upstream_nuget_list) | **GET** /repos/{owner}/{identifier}/upstream/nuget/ | List NuGet upstream configs for this repository.
[**repos_upstream_nuget_partial_update**](ReposApi.md#repos_upstream_nuget_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Partially update a NuGet upstream config for this repository.
[**repos_upstream_nuget_read**](ReposApi.md#repos_upstream_nuget_read) | **GET** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Retrieve a NuGet upstream config for this repository.
[**repos_upstream_nuget_update**](ReposApi.md#repos_upstream_nuget_update) | **PUT** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Update a NuGet upstream config for this repository.
[**repos_upstream_python_create**](ReposApi.md#repos_upstream_python_create) | **POST** /repos/{owner}/{identifier}/upstream/python/ | Create a Python upstream config for this repository.
[**repos_upstream_python_delete**](ReposApi.md#repos_upstream_python_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Delete a Python upstream config for this repository.
[**repos_upstream_python_list**](ReposApi.md#repos_upstream_python_list) | **GET** /repos/{owner}/{identifier}/upstream/python/ | List Python upstream configs for this repository.
[**repos_upstream_python_partial_update**](ReposApi.md#repos_upstream_python_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Partially update a Python upstream config for this repository.
[**repos_upstream_python_read**](ReposApi.md#repos_upstream_python_read) | **GET** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Retrieve a Python upstream config for this repository.
[**repos_upstream_python_update**](ReposApi.md#repos_upstream_python_update) | **PUT** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Update a Python upstream config for this repository.
[**repos_upstream_rpm_create**](ReposApi.md#repos_upstream_rpm_create) | **POST** /repos/{owner}/{identifier}/upstream/rpm/ | Create a RedHat upstream config for this repository.
[**repos_upstream_rpm_delete**](ReposApi.md#repos_upstream_rpm_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Delete a RedHat upstream config for this repository.
[**repos_upstream_rpm_list**](ReposApi.md#repos_upstream_rpm_list) | **GET** /repos/{owner}/{identifier}/upstream/rpm/ | List RedHat upstream configs for this repository.
[**repos_upstream_rpm_partial_update**](ReposApi.md#repos_upstream_rpm_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Partially update a RedHat upstream config for this repository.
[**repos_upstream_rpm_read**](ReposApi.md#repos_upstream_rpm_read) | **GET** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Retrieve a RedHat upstream config for this repository.
[**repos_upstream_rpm_update**](ReposApi.md#repos_upstream_rpm_update) | **PUT** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Update a RedHat upstream config for this repository.
[**repos_upstream_ruby_create**](ReposApi.md#repos_upstream_ruby_create) | **POST** /repos/{owner}/{identifier}/upstream/ruby/ | Create a Ruby upstream config for this repository.
[**repos_upstream_ruby_delete**](ReposApi.md#repos_upstream_ruby_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Delete a Ruby upstream config for this repository.
[**repos_upstream_ruby_list**](ReposApi.md#repos_upstream_ruby_list) | **GET** /repos/{owner}/{identifier}/upstream/ruby/ | List Ruby upstream configs for this repository.
[**repos_upstream_ruby_partial_update**](ReposApi.md#repos_upstream_ruby_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Partially update a Ruby upstream config for this repository.
[**repos_upstream_ruby_read**](ReposApi.md#repos_upstream_ruby_read) | **GET** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Retrieve a Ruby upstream config for this repository.
[**repos_upstream_ruby_update**](ReposApi.md#repos_upstream_ruby_update) | **PUT** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Update a Ruby upstream config for this repository.
[**repos_upstream_swift_create**](ReposApi.md#repos_upstream_swift_create) | **POST** /repos/{owner}/{identifier}/upstream/swift/ | Create a Swift upstream config for this repository.
[**repos_upstream_swift_delete**](ReposApi.md#repos_upstream_swift_delete) | **DELETE** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Delete a Swift upstream config for this repository.
[**repos_upstream_swift_list**](ReposApi.md#repos_upstream_swift_list) | **GET** /repos/{owner}/{identifier}/upstream/swift/ | List Swift upstream configs for this repository.
[**repos_upstream_swift_partial_update**](ReposApi.md#repos_upstream_swift_partial_update) | **PATCH** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Partially update a Swift upstream config for this repository.
[**repos_upstream_swift_read**](ReposApi.md#repos_upstream_swift_read) | **GET** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Retrieve a Swift upstream config for this repository.
[**repos_upstream_swift_update**](ReposApi.md#repos_upstream_swift_update) | **PUT** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Update a Swift upstream config for this repository.
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
  data: CloudsmithApi::RespositoryGeoIpEnableDisableRequest.new # RespositoryGeoIpEnableDisableRequest | 
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
 **data** | [**RespositoryGeoIpEnableDisableRequest**](RespositoryGeoIpEnableDisableRequest.md)|  | [optional] 

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
  data: CloudsmithApi::RespositoryGeoIpEnableDisableRequest.new # RespositoryGeoIpEnableDisableRequest | 
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
 **data** | [**RespositoryGeoIpEnableDisableRequest**](RespositoryGeoIpEnableDisableRequest.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_geoip_partial_update**
> RepositoryGeoIpRules repos_geoip_partial_update(owner, identifier, opts)

Partially update repository geoip rules.

Partially update repository geoip rules.

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
  data: CloudsmithApi::RepositoryGeoIpRulesRequestPatch.new # RepositoryGeoIpRulesRequestPatch | 
}

begin
  #Partially update repository geoip rules.
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
 **data** | [**RepositoryGeoIpRulesRequestPatch**](RepositoryGeoIpRulesRequestPatch.md)|  | [optional] 

### Return type

[**RepositoryGeoIpRules**](RepositoryGeoIpRules.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_geoip_read**
> RepositoryGeoIpRules repos_geoip_read(owner, identifier)

List all repository geoip rules.

List all repository geoip rules.

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
  #List all repository geoip rules.
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
> RepositoryGeoIpTestAddressResponse repos_geoip_test(owner, identifier, opts)

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
  data: CloudsmithApi::RepositoryGeoIpTestAddress.new # RepositoryGeoIpTestAddress | 
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
 **data** | [**RepositoryGeoIpTestAddress**](RepositoryGeoIpTestAddress.md)|  | [optional] 

### Return type

[**RepositoryGeoIpTestAddressResponse**](RepositoryGeoIpTestAddressResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_geoip_update**
> RepositoryGeoIpRules repos_geoip_update(owner, identifier, opts)

Replace repository geoip rules.

Replace repository geoip rules.

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
  data: CloudsmithApi::RepositoryGeoIpRulesRequest.new # RepositoryGeoIpRulesRequest | 
}

begin
  #Replace repository geoip rules.
  result = api_instance.repos_geoip_update(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_geoip_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryGeoIpRulesRequest**](RepositoryGeoIpRulesRequest.md)|  | [optional] 

### Return type

[**RepositoryGeoIpRules**](RepositoryGeoIpRules.md)

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



# **repos_upstream_cran_create**
> CranUpstream repos_upstream_cran_create(owner, identifier, opts)

Create a CRAN upstream config for this repository.

Create a CRAN upstream config for this repository.

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
  data: CloudsmithApi::CranUpstreamRequest.new # CranUpstreamRequest | 
}

begin
  #Create a CRAN upstream config for this repository.
  result = api_instance.repos_upstream_cran_create(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_cran_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**CranUpstreamRequest**](CranUpstreamRequest.md)|  | [optional] 

### Return type

[**CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_cran_delete**
> repos_upstream_cran_delete(owner, identifier, slug_perm)

Delete a CRAN upstream config for this repository.

Delete a CRAN upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a CRAN upstream config for this repository.
  api_instance.repos_upstream_cran_delete(owner, identifier, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_cran_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_cran_list**
> Array&lt;CranUpstream&gt; repos_upstream_cran_list(owner, identifier, opts)

List CRAN upstream configs for this repository.

List CRAN upstream configs for this repository.

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
  #List CRAN upstream configs for this repository.
  result = api_instance.repos_upstream_cran_list(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_cran_list: #{e}"
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

[**Array&lt;CranUpstream&gt;**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_cran_partial_update**
> CranUpstream repos_upstream_cran_partial_update(owner, identifier, slug_perm, opts)

Partially update a CRAN upstream config for this repository.

Partially update a CRAN upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::CranUpstreamRequestPatch.new # CranUpstreamRequestPatch | 
}

begin
  #Partially update a CRAN upstream config for this repository.
  result = api_instance.repos_upstream_cran_partial_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_cran_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**CranUpstreamRequestPatch**](CranUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_cran_read**
> CranUpstream repos_upstream_cran_read(owner, identifier, slug_perm)

Retrieve a CRAN upstream config for this repository.

Retrieve a CRAN upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Retrieve a CRAN upstream config for this repository.
  result = api_instance.repos_upstream_cran_read(owner, identifier, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_cran_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_cran_update**
> CranUpstream repos_upstream_cran_update(owner, identifier, slug_perm, opts)

Update a CRAN upstream config for this repository.

Update a CRAN upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::CranUpstreamRequest.new # CranUpstreamRequest | 
}

begin
  #Update a CRAN upstream config for this repository.
  result = api_instance.repos_upstream_cran_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_cran_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**CranUpstreamRequest**](CranUpstreamRequest.md)|  | [optional] 

### Return type

[**CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_dart_create**
> DartUpstream repos_upstream_dart_create(owner, identifier, opts)

Create a Dart upstream config for this repository.

Create a Dart upstream config for this repository.

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
  data: CloudsmithApi::DartUpstreamRequest.new # DartUpstreamRequest | 
}

begin
  #Create a Dart upstream config for this repository.
  result = api_instance.repos_upstream_dart_create(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_dart_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**DartUpstreamRequest**](DartUpstreamRequest.md)|  | [optional] 

### Return type

[**DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_dart_delete**
> repos_upstream_dart_delete(owner, identifier, slug_perm)

Delete a Dart upstream config for this repository.

Delete a Dart upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a Dart upstream config for this repository.
  api_instance.repos_upstream_dart_delete(owner, identifier, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_dart_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_dart_list**
> Array&lt;DartUpstream&gt; repos_upstream_dart_list(owner, identifier, opts)

List Dart upstream configs for this repository.

List Dart upstream configs for this repository.

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
  #List Dart upstream configs for this repository.
  result = api_instance.repos_upstream_dart_list(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_dart_list: #{e}"
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

[**Array&lt;DartUpstream&gt;**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_dart_partial_update**
> DartUpstream repos_upstream_dart_partial_update(owner, identifier, slug_perm, opts)

Partially update a Dart upstream config for this repository.

Partially update a Dart upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::DartUpstreamRequestPatch.new # DartUpstreamRequestPatch | 
}

begin
  #Partially update a Dart upstream config for this repository.
  result = api_instance.repos_upstream_dart_partial_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_dart_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**DartUpstreamRequestPatch**](DartUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_dart_read**
> DartUpstream repos_upstream_dart_read(owner, identifier, slug_perm)

Retrieve a Dart upstream config for this repository.

Retrieve a Dart upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Retrieve a Dart upstream config for this repository.
  result = api_instance.repos_upstream_dart_read(owner, identifier, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_dart_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_dart_update**
> DartUpstream repos_upstream_dart_update(owner, identifier, slug_perm, opts)

Update a Dart upstream config for this repository.

Update a Dart upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::DartUpstreamRequest.new # DartUpstreamRequest | 
}

begin
  #Update a Dart upstream config for this repository.
  result = api_instance.repos_upstream_dart_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_dart_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**DartUpstreamRequest**](DartUpstreamRequest.md)|  | [optional] 

### Return type

[**DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_deb_create**
> DebUpstream repos_upstream_deb_create(owner, identifier, opts)

Create a Debian upstream config for this repository.

Create a Debian upstream config for this repository.

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
  data: CloudsmithApi::DebUpstreamRequest.new # DebUpstreamRequest | 
}

begin
  #Create a Debian upstream config for this repository.
  result = api_instance.repos_upstream_deb_create(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_deb_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**DebUpstreamRequest**](DebUpstreamRequest.md)|  | [optional] 

### Return type

[**DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_deb_delete**
> repos_upstream_deb_delete(owner, identifier, slug_perm)

Delete a Debian upstream config for this repository.

Delete a Debian upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a Debian upstream config for this repository.
  api_instance.repos_upstream_deb_delete(owner, identifier, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_deb_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_deb_list**
> Array&lt;DebUpstream&gt; repos_upstream_deb_list(owner, identifier, opts)

List Debian upstream configs for this repository.

List Debian upstream configs for this repository.

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
  #List Debian upstream configs for this repository.
  result = api_instance.repos_upstream_deb_list(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_deb_list: #{e}"
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

[**Array&lt;DebUpstream&gt;**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_deb_partial_update**
> DebUpstream repos_upstream_deb_partial_update(owner, identifier, slug_perm, opts)

Partially update a Debian upstream config for this repository.

Partially update a Debian upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::DebUpstreamRequestPatch.new # DebUpstreamRequestPatch | 
}

begin
  #Partially update a Debian upstream config for this repository.
  result = api_instance.repos_upstream_deb_partial_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_deb_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**DebUpstreamRequestPatch**](DebUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_deb_read**
> DebUpstream repos_upstream_deb_read(owner, identifier, slug_perm)

Retrieve a Debian upstream config for this repository.

Retrieve a Debian upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Retrieve a Debian upstream config for this repository.
  result = api_instance.repos_upstream_deb_read(owner, identifier, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_deb_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_deb_update**
> DebUpstream repos_upstream_deb_update(owner, identifier, slug_perm, opts)

Update a Debian upstream config for this repository.

Update a Debian upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::DebUpstreamRequest.new # DebUpstreamRequest | 
}

begin
  #Update a Debian upstream config for this repository.
  result = api_instance.repos_upstream_deb_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_deb_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**DebUpstreamRequest**](DebUpstreamRequest.md)|  | [optional] 

### Return type

[**DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_docker_create**
> DockerUpstream repos_upstream_docker_create(owner, identifier, opts)

Create a Docker upstream config for this repository.

Create a Docker upstream config for this repository.

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
  data: CloudsmithApi::DockerUpstreamRequest.new # DockerUpstreamRequest | 
}

begin
  #Create a Docker upstream config for this repository.
  result = api_instance.repos_upstream_docker_create(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_docker_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**DockerUpstreamRequest**](DockerUpstreamRequest.md)|  | [optional] 

### Return type

[**DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_docker_delete**
> repos_upstream_docker_delete(owner, identifier, slug_perm)

Delete a Docker upstream config for this repository.

Delete a Docker upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a Docker upstream config for this repository.
  api_instance.repos_upstream_docker_delete(owner, identifier, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_docker_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_docker_list**
> Array&lt;DockerUpstream&gt; repos_upstream_docker_list(owner, identifier, opts)

List Docker upstream configs for this repository.

List Docker upstream configs for this repository.

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
  #List Docker upstream configs for this repository.
  result = api_instance.repos_upstream_docker_list(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_docker_list: #{e}"
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

[**Array&lt;DockerUpstream&gt;**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_docker_partial_update**
> DockerUpstream repos_upstream_docker_partial_update(owner, identifier, slug_perm, opts)

Partially update a Docker upstream config for this repository.

Partially update a Docker upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::DockerUpstreamRequestPatch.new # DockerUpstreamRequestPatch | 
}

begin
  #Partially update a Docker upstream config for this repository.
  result = api_instance.repos_upstream_docker_partial_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_docker_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**DockerUpstreamRequestPatch**](DockerUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_docker_read**
> DockerUpstream repos_upstream_docker_read(owner, identifier, slug_perm)

Retrieve a Docker upstream config for this repository.

Retrieve a Docker upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Retrieve a Docker upstream config for this repository.
  result = api_instance.repos_upstream_docker_read(owner, identifier, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_docker_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_docker_update**
> DockerUpstream repos_upstream_docker_update(owner, identifier, slug_perm, opts)

Update a Docker upstream config for this repository.

Update a Docker upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::DockerUpstreamRequest.new # DockerUpstreamRequest | 
}

begin
  #Update a Docker upstream config for this repository.
  result = api_instance.repos_upstream_docker_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_docker_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**DockerUpstreamRequest**](DockerUpstreamRequest.md)|  | [optional] 

### Return type

[**DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_helm_create**
> HelmUpstream repos_upstream_helm_create(owner, identifier, opts)

Create a Helm upstream config for this repository.

Create a Helm upstream config for this repository.

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
  data: CloudsmithApi::HelmUpstreamRequest.new # HelmUpstreamRequest | 
}

begin
  #Create a Helm upstream config for this repository.
  result = api_instance.repos_upstream_helm_create(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_helm_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**HelmUpstreamRequest**](HelmUpstreamRequest.md)|  | [optional] 

### Return type

[**HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_helm_delete**
> repos_upstream_helm_delete(owner, identifier, slug_perm)

Delete a Helm upstream config for this repository.

Delete a Helm upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a Helm upstream config for this repository.
  api_instance.repos_upstream_helm_delete(owner, identifier, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_helm_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_helm_list**
> Array&lt;HelmUpstream&gt; repos_upstream_helm_list(owner, identifier, opts)

List Helm upstream configs for this repository.

List Helm upstream configs for this repository.

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
  #List Helm upstream configs for this repository.
  result = api_instance.repos_upstream_helm_list(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_helm_list: #{e}"
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

[**Array&lt;HelmUpstream&gt;**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_helm_partial_update**
> HelmUpstream repos_upstream_helm_partial_update(owner, identifier, slug_perm, opts)

Partially update a Helm upstream config for this repository.

Partially update a Helm upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::HelmUpstreamRequestPatch.new # HelmUpstreamRequestPatch | 
}

begin
  #Partially update a Helm upstream config for this repository.
  result = api_instance.repos_upstream_helm_partial_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_helm_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**HelmUpstreamRequestPatch**](HelmUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_helm_read**
> HelmUpstream repos_upstream_helm_read(owner, identifier, slug_perm)

Retrieve a Helm upstream config for this repository.

Retrieve a Helm upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Retrieve a Helm upstream config for this repository.
  result = api_instance.repos_upstream_helm_read(owner, identifier, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_helm_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_helm_update**
> HelmUpstream repos_upstream_helm_update(owner, identifier, slug_perm, opts)

Update a Helm upstream config for this repository.

Update a Helm upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::HelmUpstreamRequest.new # HelmUpstreamRequest | 
}

begin
  #Update a Helm upstream config for this repository.
  result = api_instance.repos_upstream_helm_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_helm_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**HelmUpstreamRequest**](HelmUpstreamRequest.md)|  | [optional] 

### Return type

[**HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_maven_create**
> MavenUpstream repos_upstream_maven_create(owner, identifier, opts)

Create a Maven upstream config for this repository.

Create a Maven upstream config for this repository.

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
  data: CloudsmithApi::MavenUpstreamRequest.new # MavenUpstreamRequest | 
}

begin
  #Create a Maven upstream config for this repository.
  result = api_instance.repos_upstream_maven_create(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_maven_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**MavenUpstreamRequest**](MavenUpstreamRequest.md)|  | [optional] 

### Return type

[**MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_maven_delete**
> repos_upstream_maven_delete(owner, identifier, slug_perm)

Delete a Maven upstream config for this repository.

Delete a Maven upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a Maven upstream config for this repository.
  api_instance.repos_upstream_maven_delete(owner, identifier, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_maven_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_maven_list**
> Array&lt;MavenUpstream&gt; repos_upstream_maven_list(owner, identifier, opts)

List Maven upstream configs for this repository.

List Maven upstream configs for this repository.

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
  #List Maven upstream configs for this repository.
  result = api_instance.repos_upstream_maven_list(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_maven_list: #{e}"
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

[**Array&lt;MavenUpstream&gt;**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_maven_partial_update**
> MavenUpstream repos_upstream_maven_partial_update(owner, identifier, slug_perm, opts)

Partially update a Maven upstream config for this repository.

Partially update a Maven upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::MavenUpstreamRequestPatch.new # MavenUpstreamRequestPatch | 
}

begin
  #Partially update a Maven upstream config for this repository.
  result = api_instance.repos_upstream_maven_partial_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_maven_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**MavenUpstreamRequestPatch**](MavenUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_maven_read**
> MavenUpstream repos_upstream_maven_read(owner, identifier, slug_perm)

Retrieve a Maven upstream config for this repository.

Retrieve a Maven upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Retrieve a Maven upstream config for this repository.
  result = api_instance.repos_upstream_maven_read(owner, identifier, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_maven_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_maven_update**
> MavenUpstream repos_upstream_maven_update(owner, identifier, slug_perm, opts)

Update a Maven upstream config for this repository.

Update a Maven upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::MavenUpstreamRequest.new # MavenUpstreamRequest | 
}

begin
  #Update a Maven upstream config for this repository.
  result = api_instance.repos_upstream_maven_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_maven_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**MavenUpstreamRequest**](MavenUpstreamRequest.md)|  | [optional] 

### Return type

[**MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_npm_create**
> NpmUpstream repos_upstream_npm_create(owner, identifier, opts)

Create a npm upstream config for this repository.

Create a npm upstream config for this repository.

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
  data: CloudsmithApi::NpmUpstreamRequest.new # NpmUpstreamRequest | 
}

begin
  #Create a npm upstream config for this repository.
  result = api_instance.repos_upstream_npm_create(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_npm_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**NpmUpstreamRequest**](NpmUpstreamRequest.md)|  | [optional] 

### Return type

[**NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_npm_delete**
> repos_upstream_npm_delete(owner, identifier, slug_perm)

Delete a npm upstream config for this repository.

Delete a npm upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a npm upstream config for this repository.
  api_instance.repos_upstream_npm_delete(owner, identifier, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_npm_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_npm_list**
> Array&lt;NpmUpstream&gt; repos_upstream_npm_list(owner, identifier, opts)

List npm upstream configs for this repository.

List npm upstream configs for this repository.

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
  #List npm upstream configs for this repository.
  result = api_instance.repos_upstream_npm_list(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_npm_list: #{e}"
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

[**Array&lt;NpmUpstream&gt;**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_npm_partial_update**
> NpmUpstream repos_upstream_npm_partial_update(owner, identifier, slug_perm, opts)

Partially update a npm upstream config for this repository.

Partially update a npm upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::NpmUpstreamRequestPatch.new # NpmUpstreamRequestPatch | 
}

begin
  #Partially update a npm upstream config for this repository.
  result = api_instance.repos_upstream_npm_partial_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_npm_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**NpmUpstreamRequestPatch**](NpmUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_npm_read**
> NpmUpstream repos_upstream_npm_read(owner, identifier, slug_perm)

Retrieve a npm upstream config for this repository.

Retrieve a npm upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Retrieve a npm upstream config for this repository.
  result = api_instance.repos_upstream_npm_read(owner, identifier, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_npm_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_npm_update**
> NpmUpstream repos_upstream_npm_update(owner, identifier, slug_perm, opts)

Update a npm upstream config for this repository.

Update a npm upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::NpmUpstreamRequest.new # NpmUpstreamRequest | 
}

begin
  #Update a npm upstream config for this repository.
  result = api_instance.repos_upstream_npm_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_npm_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**NpmUpstreamRequest**](NpmUpstreamRequest.md)|  | [optional] 

### Return type

[**NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_nuget_create**
> NugetUpstream repos_upstream_nuget_create(owner, identifier, opts)

Create a NuGet upstream config for this repository.

Create a NuGet upstream config for this repository.

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
  data: CloudsmithApi::NugetUpstreamRequest.new # NugetUpstreamRequest | 
}

begin
  #Create a NuGet upstream config for this repository.
  result = api_instance.repos_upstream_nuget_create(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_nuget_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**NugetUpstreamRequest**](NugetUpstreamRequest.md)|  | [optional] 

### Return type

[**NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_nuget_delete**
> repos_upstream_nuget_delete(owner, identifier, slug_perm)

Delete a NuGet upstream config for this repository.

Delete a NuGet upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a NuGet upstream config for this repository.
  api_instance.repos_upstream_nuget_delete(owner, identifier, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_nuget_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_nuget_list**
> Array&lt;NugetUpstream&gt; repos_upstream_nuget_list(owner, identifier, opts)

List NuGet upstream configs for this repository.

List NuGet upstream configs for this repository.

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
  #List NuGet upstream configs for this repository.
  result = api_instance.repos_upstream_nuget_list(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_nuget_list: #{e}"
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

[**Array&lt;NugetUpstream&gt;**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_nuget_partial_update**
> NugetUpstream repos_upstream_nuget_partial_update(owner, identifier, slug_perm, opts)

Partially update a NuGet upstream config for this repository.

Partially update a NuGet upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::NugetUpstreamRequestPatch.new # NugetUpstreamRequestPatch | 
}

begin
  #Partially update a NuGet upstream config for this repository.
  result = api_instance.repos_upstream_nuget_partial_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_nuget_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**NugetUpstreamRequestPatch**](NugetUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_nuget_read**
> NugetUpstream repos_upstream_nuget_read(owner, identifier, slug_perm)

Retrieve a NuGet upstream config for this repository.

Retrieve a NuGet upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Retrieve a NuGet upstream config for this repository.
  result = api_instance.repos_upstream_nuget_read(owner, identifier, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_nuget_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_nuget_update**
> NugetUpstream repos_upstream_nuget_update(owner, identifier, slug_perm, opts)

Update a NuGet upstream config for this repository.

Update a NuGet upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::NugetUpstreamRequest.new # NugetUpstreamRequest | 
}

begin
  #Update a NuGet upstream config for this repository.
  result = api_instance.repos_upstream_nuget_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_nuget_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**NugetUpstreamRequest**](NugetUpstreamRequest.md)|  | [optional] 

### Return type

[**NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_python_create**
> PythonUpstream repos_upstream_python_create(owner, identifier, opts)

Create a Python upstream config for this repository.

Create a Python upstream config for this repository.

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
  data: CloudsmithApi::PythonUpstreamRequest.new # PythonUpstreamRequest | 
}

begin
  #Create a Python upstream config for this repository.
  result = api_instance.repos_upstream_python_create(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_python_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**PythonUpstreamRequest**](PythonUpstreamRequest.md)|  | [optional] 

### Return type

[**PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_python_delete**
> repos_upstream_python_delete(owner, identifier, slug_perm)

Delete a Python upstream config for this repository.

Delete a Python upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a Python upstream config for this repository.
  api_instance.repos_upstream_python_delete(owner, identifier, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_python_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_python_list**
> Array&lt;PythonUpstream&gt; repos_upstream_python_list(owner, identifier, opts)

List Python upstream configs for this repository.

List Python upstream configs for this repository.

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
  #List Python upstream configs for this repository.
  result = api_instance.repos_upstream_python_list(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_python_list: #{e}"
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

[**Array&lt;PythonUpstream&gt;**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_python_partial_update**
> PythonUpstream repos_upstream_python_partial_update(owner, identifier, slug_perm, opts)

Partially update a Python upstream config for this repository.

Partially update a Python upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::PythonUpstreamRequestPatch.new # PythonUpstreamRequestPatch | 
}

begin
  #Partially update a Python upstream config for this repository.
  result = api_instance.repos_upstream_python_partial_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_python_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**PythonUpstreamRequestPatch**](PythonUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_python_read**
> PythonUpstream repos_upstream_python_read(owner, identifier, slug_perm)

Retrieve a Python upstream config for this repository.

Retrieve a Python upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Retrieve a Python upstream config for this repository.
  result = api_instance.repos_upstream_python_read(owner, identifier, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_python_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_python_update**
> PythonUpstream repos_upstream_python_update(owner, identifier, slug_perm, opts)

Update a Python upstream config for this repository.

Update a Python upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::PythonUpstreamRequest.new # PythonUpstreamRequest | 
}

begin
  #Update a Python upstream config for this repository.
  result = api_instance.repos_upstream_python_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_python_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**PythonUpstreamRequest**](PythonUpstreamRequest.md)|  | [optional] 

### Return type

[**PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_rpm_create**
> RpmUpstream repos_upstream_rpm_create(owner, identifier, opts)

Create a RedHat upstream config for this repository.

Create a RedHat upstream config for this repository.

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
  data: CloudsmithApi::RpmUpstreamRequest.new # RpmUpstreamRequest | 
}

begin
  #Create a RedHat upstream config for this repository.
  result = api_instance.repos_upstream_rpm_create(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_rpm_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RpmUpstreamRequest**](RpmUpstreamRequest.md)|  | [optional] 

### Return type

[**RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_rpm_delete**
> repos_upstream_rpm_delete(owner, identifier, slug_perm)

Delete a RedHat upstream config for this repository.

Delete a RedHat upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a RedHat upstream config for this repository.
  api_instance.repos_upstream_rpm_delete(owner, identifier, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_rpm_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_rpm_list**
> Array&lt;RpmUpstream&gt; repos_upstream_rpm_list(owner, identifier, opts)

List RedHat upstream configs for this repository.

List RedHat upstream configs for this repository.

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
  #List RedHat upstream configs for this repository.
  result = api_instance.repos_upstream_rpm_list(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_rpm_list: #{e}"
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

[**Array&lt;RpmUpstream&gt;**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_rpm_partial_update**
> RpmUpstream repos_upstream_rpm_partial_update(owner, identifier, slug_perm, opts)

Partially update a RedHat upstream config for this repository.

Partially update a RedHat upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::RpmUpstreamRequestPatch.new # RpmUpstreamRequestPatch | 
}

begin
  #Partially update a RedHat upstream config for this repository.
  result = api_instance.repos_upstream_rpm_partial_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_rpm_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**RpmUpstreamRequestPatch**](RpmUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_rpm_read**
> RpmUpstream repos_upstream_rpm_read(owner, identifier, slug_perm)

Retrieve a RedHat upstream config for this repository.

Retrieve a RedHat upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Retrieve a RedHat upstream config for this repository.
  result = api_instance.repos_upstream_rpm_read(owner, identifier, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_rpm_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_rpm_update**
> RpmUpstream repos_upstream_rpm_update(owner, identifier, slug_perm, opts)

Update a RedHat upstream config for this repository.

Update a RedHat upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::RpmUpstreamRequest.new # RpmUpstreamRequest | 
}

begin
  #Update a RedHat upstream config for this repository.
  result = api_instance.repos_upstream_rpm_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_rpm_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**RpmUpstreamRequest**](RpmUpstreamRequest.md)|  | [optional] 

### Return type

[**RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_ruby_create**
> RubyUpstream repos_upstream_ruby_create(owner, identifier, opts)

Create a Ruby upstream config for this repository.

Create a Ruby upstream config for this repository.

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
  data: CloudsmithApi::RubyUpstreamRequest.new # RubyUpstreamRequest | 
}

begin
  #Create a Ruby upstream config for this repository.
  result = api_instance.repos_upstream_ruby_create(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_ruby_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RubyUpstreamRequest**](RubyUpstreamRequest.md)|  | [optional] 

### Return type

[**RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_ruby_delete**
> repos_upstream_ruby_delete(owner, identifier, slug_perm)

Delete a Ruby upstream config for this repository.

Delete a Ruby upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a Ruby upstream config for this repository.
  api_instance.repos_upstream_ruby_delete(owner, identifier, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_ruby_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_ruby_list**
> Array&lt;RubyUpstream&gt; repos_upstream_ruby_list(owner, identifier, opts)

List Ruby upstream configs for this repository.

List Ruby upstream configs for this repository.

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
  #List Ruby upstream configs for this repository.
  result = api_instance.repos_upstream_ruby_list(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_ruby_list: #{e}"
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

[**Array&lt;RubyUpstream&gt;**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_ruby_partial_update**
> RubyUpstream repos_upstream_ruby_partial_update(owner, identifier, slug_perm, opts)

Partially update a Ruby upstream config for this repository.

Partially update a Ruby upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::RubyUpstreamRequestPatch.new # RubyUpstreamRequestPatch | 
}

begin
  #Partially update a Ruby upstream config for this repository.
  result = api_instance.repos_upstream_ruby_partial_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_ruby_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**RubyUpstreamRequestPatch**](RubyUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_ruby_read**
> RubyUpstream repos_upstream_ruby_read(owner, identifier, slug_perm)

Retrieve a Ruby upstream config for this repository.

Retrieve a Ruby upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Retrieve a Ruby upstream config for this repository.
  result = api_instance.repos_upstream_ruby_read(owner, identifier, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_ruby_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_ruby_update**
> RubyUpstream repos_upstream_ruby_update(owner, identifier, slug_perm, opts)

Update a Ruby upstream config for this repository.

Update a Ruby upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::RubyUpstreamRequest.new # RubyUpstreamRequest | 
}

begin
  #Update a Ruby upstream config for this repository.
  result = api_instance.repos_upstream_ruby_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_ruby_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**RubyUpstreamRequest**](RubyUpstreamRequest.md)|  | [optional] 

### Return type

[**RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_swift_create**
> SwiftUpstream repos_upstream_swift_create(owner, identifier, opts)

Create a Swift upstream config for this repository.

Create a Swift upstream config for this repository.

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
  data: CloudsmithApi::SwiftUpstreamRequest.new # SwiftUpstreamRequest | 
}

begin
  #Create a Swift upstream config for this repository.
  result = api_instance.repos_upstream_swift_create(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_swift_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**SwiftUpstreamRequest**](SwiftUpstreamRequest.md)|  | [optional] 

### Return type

[**SwiftUpstream**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_swift_delete**
> repos_upstream_swift_delete(owner, identifier, slug_perm)

Delete a Swift upstream config for this repository.

Delete a Swift upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Delete a Swift upstream config for this repository.
  api_instance.repos_upstream_swift_delete(owner, identifier, slug_perm)
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_swift_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_swift_list**
> Array&lt;SwiftUpstream&gt; repos_upstream_swift_list(owner, identifier, opts)

List Swift upstream configs for this repository.

List Swift upstream configs for this repository.

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
  #List Swift upstream configs for this repository.
  result = api_instance.repos_upstream_swift_list(owner, identifier, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_swift_list: #{e}"
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

[**Array&lt;SwiftUpstream&gt;**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_swift_partial_update**
> SwiftUpstream repos_upstream_swift_partial_update(owner, identifier, slug_perm, opts)

Partially update a Swift upstream config for this repository.

Partially update a Swift upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::SwiftUpstreamRequestPatch.new # SwiftUpstreamRequestPatch | 
}

begin
  #Partially update a Swift upstream config for this repository.
  result = api_instance.repos_upstream_swift_partial_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_swift_partial_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**SwiftUpstreamRequestPatch**](SwiftUpstreamRequestPatch.md)|  | [optional] 

### Return type

[**SwiftUpstream**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_swift_read**
> SwiftUpstream repos_upstream_swift_read(owner, identifier, slug_perm)

Retrieve a Swift upstream config for this repository.

Retrieve a Swift upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 


begin
  #Retrieve a Swift upstream config for this repository.
  result = api_instance.repos_upstream_swift_read(owner, identifier, slug_perm)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_swift_read: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 

### Return type

[**SwiftUpstream**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **repos_upstream_swift_update**
> SwiftUpstream repos_upstream_swift_update(owner, identifier, slug_perm, opts)

Update a Swift upstream config for this repository.

Update a Swift upstream config for this repository.

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

slug_perm = 'slug_perm_example' # String | 

opts = { 
  data: CloudsmithApi::SwiftUpstreamRequest.new # SwiftUpstreamRequest | 
}

begin
  #Update a Swift upstream config for this repository.
  result = api_instance.repos_upstream_swift_update(owner, identifier, slug_perm, opts)
  p result
rescue CloudsmithApi::ApiError => e
  puts "Exception when calling ReposApi->repos_upstream_swift_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**SwiftUpstreamRequest**](SwiftUpstreamRequest.md)|  | [optional] 

### Return type

[**SwiftUpstream**](SwiftUpstream.md)

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



