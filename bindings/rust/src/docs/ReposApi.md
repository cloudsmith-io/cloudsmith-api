# \ReposApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**api_repos_geoip_status**](ReposApi.md#api_repos_geoip_status) | **Get** /repos/{owner}/{identifier}/geoip/status/ | Retrieve the GeoIP status for this repository.
[**repo_retention_partial_update**](ReposApi.md#repo_retention_partial_update) | **Patch** /repos/{owner}/{repo}/retention/ | Update the retention rules for the repository.
[**repo_retention_read**](ReposApi.md#repo_retention_read) | **Get** /repos/{owner}/{repo}/retention/ | Retrieve the retention rules for the repository.
[**repos_create**](ReposApi.md#repos_create) | **Post** /repos/{owner}/ | Create a new repository in a given namespace.
[**repos_delete**](ReposApi.md#repos_delete) | **Delete** /repos/{owner}/{identifier}/ | Delete a repository in a given namespace.
[**repos_ecdsa_create**](ReposApi.md#repos_ecdsa_create) | **Post** /repos/{owner}/{identifier}/ecdsa/ | Set the active ECDSA key for the Repository.
[**repos_ecdsa_list**](ReposApi.md#repos_ecdsa_list) | **Get** /repos/{owner}/{identifier}/ecdsa/ | Retrieve the active ECDSA key for the Repository.
[**repos_ecdsa_regenerate**](ReposApi.md#repos_ecdsa_regenerate) | **Post** /repos/{owner}/{identifier}/ecdsa/regenerate/ | Regenerate ECDSA Key for the Repository.
[**repos_geoip_disable**](ReposApi.md#repos_geoip_disable) | **Post** /repos/{owner}/{identifier}/geoip/disable/ | Disable GeoIP for this repository.
[**repos_geoip_enable**](ReposApi.md#repos_geoip_enable) | **Post** /repos/{owner}/{identifier}/geoip/enable/ | Enable GeoIP for this repository.
[**repos_geoip_partial_update**](ReposApi.md#repos_geoip_partial_update) | **Patch** /repos/{owner}/{identifier}/geoip | Partially update repository geoip rules.
[**repos_geoip_read**](ReposApi.md#repos_geoip_read) | **Get** /repos/{owner}/{identifier}/geoip | List all repository geoip rules.
[**repos_geoip_test**](ReposApi.md#repos_geoip_test) | **Post** /repos/{owner}/{identifier}/geoip/test/ | Test a list of IP addresses against the repository&#39;s current GeoIP rules.
[**repos_geoip_update**](ReposApi.md#repos_geoip_update) | **Put** /repos/{owner}/{identifier}/geoip | Replace repository geoip rules.
[**repos_gpg_create**](ReposApi.md#repos_gpg_create) | **Post** /repos/{owner}/{identifier}/gpg/ | Set the active GPG key for the Repository.
[**repos_gpg_list**](ReposApi.md#repos_gpg_list) | **Get** /repos/{owner}/{identifier}/gpg/ | Retrieve the active GPG key for the Repository.
[**repos_gpg_regenerate**](ReposApi.md#repos_gpg_regenerate) | **Post** /repos/{owner}/{identifier}/gpg/regenerate/ | Regenerate GPG Key for the Repository.
[**repos_namespace_list**](ReposApi.md#repos_namespace_list) | **Get** /repos/{owner}/ | Get a list of all repositories within a namespace.
[**repos_partial_update**](ReposApi.md#repos_partial_update) | **Patch** /repos/{owner}/{identifier}/ | Update details about a repository in a given namespace.
[**repos_privileges_list**](ReposApi.md#repos_privileges_list) | **Get** /repos/{owner}/{identifier}/privileges | List all explicity created privileges for the repository.
[**repos_privileges_partial_update**](ReposApi.md#repos_privileges_partial_update) | **Patch** /repos/{owner}/{identifier}/privileges | Modify privileges for the repository.
[**repos_privileges_update**](ReposApi.md#repos_privileges_update) | **Put** /repos/{owner}/{identifier}/privileges | Replace all existing repository privileges with those specified.
[**repos_read**](ReposApi.md#repos_read) | **Get** /repos/{owner}/{identifier}/ | Get a specific repository.
[**repos_rsa_create**](ReposApi.md#repos_rsa_create) | **Post** /repos/{owner}/{identifier}/rsa/ | Set the active RSA key for the Repository.
[**repos_rsa_list**](ReposApi.md#repos_rsa_list) | **Get** /repos/{owner}/{identifier}/rsa/ | Retrieve the active RSA key for the Repository.
[**repos_rsa_regenerate**](ReposApi.md#repos_rsa_regenerate) | **Post** /repos/{owner}/{identifier}/rsa/regenerate/ | Regenerate RSA Key for the Repository.
[**repos_transfer_region**](ReposApi.md#repos_transfer_region) | **Post** /repos/{owner}/{repo}/transfer-region/ | Transfer a repository to a different region.
[**repos_upstream_composer_create**](ReposApi.md#repos_upstream_composer_create) | **Post** /repos/{owner}/{identifier}/upstream/composer/ | Create a Composer upstream config for this repository.
[**repos_upstream_composer_delete**](ReposApi.md#repos_upstream_composer_delete) | **Delete** /repos/{owner}/{identifier}/upstream/composer/{slug_perm}/ | Delete a Composer upstream config for this repository.
[**repos_upstream_composer_list**](ReposApi.md#repos_upstream_composer_list) | **Get** /repos/{owner}/{identifier}/upstream/composer/ | List Composer upstream configs for this repository.
[**repos_upstream_composer_partial_update**](ReposApi.md#repos_upstream_composer_partial_update) | **Patch** /repos/{owner}/{identifier}/upstream/composer/{slug_perm}/ | Partially update a Composer upstream config for this repository.
[**repos_upstream_composer_read**](ReposApi.md#repos_upstream_composer_read) | **Get** /repos/{owner}/{identifier}/upstream/composer/{slug_perm}/ | Retrieve a Composer upstream config for this repository.
[**repos_upstream_composer_update**](ReposApi.md#repos_upstream_composer_update) | **Put** /repos/{owner}/{identifier}/upstream/composer/{slug_perm}/ | Update a Composer upstream config for this repository.
[**repos_upstream_cran_create**](ReposApi.md#repos_upstream_cran_create) | **Post** /repos/{owner}/{identifier}/upstream/cran/ | Create a CRAN upstream config for this repository.
[**repos_upstream_cran_delete**](ReposApi.md#repos_upstream_cran_delete) | **Delete** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Delete a CRAN upstream config for this repository.
[**repos_upstream_cran_list**](ReposApi.md#repos_upstream_cran_list) | **Get** /repos/{owner}/{identifier}/upstream/cran/ | List CRAN upstream configs for this repository.
[**repos_upstream_cran_partial_update**](ReposApi.md#repos_upstream_cran_partial_update) | **Patch** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Partially update a CRAN upstream config for this repository.
[**repos_upstream_cran_read**](ReposApi.md#repos_upstream_cran_read) | **Get** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Retrieve a CRAN upstream config for this repository.
[**repos_upstream_cran_update**](ReposApi.md#repos_upstream_cran_update) | **Put** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Update a CRAN upstream config for this repository.
[**repos_upstream_dart_create**](ReposApi.md#repos_upstream_dart_create) | **Post** /repos/{owner}/{identifier}/upstream/dart/ | Create a Dart upstream config for this repository.
[**repos_upstream_dart_delete**](ReposApi.md#repos_upstream_dart_delete) | **Delete** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Delete a Dart upstream config for this repository.
[**repos_upstream_dart_list**](ReposApi.md#repos_upstream_dart_list) | **Get** /repos/{owner}/{identifier}/upstream/dart/ | List Dart upstream configs for this repository.
[**repos_upstream_dart_partial_update**](ReposApi.md#repos_upstream_dart_partial_update) | **Patch** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Partially update a Dart upstream config for this repository.
[**repos_upstream_dart_read**](ReposApi.md#repos_upstream_dart_read) | **Get** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Retrieve a Dart upstream config for this repository.
[**repos_upstream_dart_update**](ReposApi.md#repos_upstream_dart_update) | **Put** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Update a Dart upstream config for this repository.
[**repos_upstream_deb_create**](ReposApi.md#repos_upstream_deb_create) | **Post** /repos/{owner}/{identifier}/upstream/deb/ | Create a Debian upstream config for this repository.
[**repos_upstream_deb_delete**](ReposApi.md#repos_upstream_deb_delete) | **Delete** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Delete a Debian upstream config for this repository.
[**repos_upstream_deb_list**](ReposApi.md#repos_upstream_deb_list) | **Get** /repos/{owner}/{identifier}/upstream/deb/ | List Debian upstream configs for this repository.
[**repos_upstream_deb_partial_update**](ReposApi.md#repos_upstream_deb_partial_update) | **Patch** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Partially update a Debian upstream config for this repository.
[**repos_upstream_deb_read**](ReposApi.md#repos_upstream_deb_read) | **Get** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Retrieve a Debian upstream config for this repository.
[**repos_upstream_deb_update**](ReposApi.md#repos_upstream_deb_update) | **Put** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Update a Debian upstream config for this repository.
[**repos_upstream_docker_create**](ReposApi.md#repos_upstream_docker_create) | **Post** /repos/{owner}/{identifier}/upstream/docker/ | Create a Docker upstream config for this repository.
[**repos_upstream_docker_delete**](ReposApi.md#repos_upstream_docker_delete) | **Delete** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Delete a Docker upstream config for this repository.
[**repos_upstream_docker_list**](ReposApi.md#repos_upstream_docker_list) | **Get** /repos/{owner}/{identifier}/upstream/docker/ | List Docker upstream configs for this repository.
[**repos_upstream_docker_partial_update**](ReposApi.md#repos_upstream_docker_partial_update) | **Patch** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Partially update a Docker upstream config for this repository.
[**repos_upstream_docker_read**](ReposApi.md#repos_upstream_docker_read) | **Get** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Retrieve a Docker upstream config for this repository.
[**repos_upstream_docker_update**](ReposApi.md#repos_upstream_docker_update) | **Put** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Update a Docker upstream config for this repository.
[**repos_upstream_helm_create**](ReposApi.md#repos_upstream_helm_create) | **Post** /repos/{owner}/{identifier}/upstream/helm/ | Create a Helm upstream config for this repository.
[**repos_upstream_helm_delete**](ReposApi.md#repos_upstream_helm_delete) | **Delete** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Delete a Helm upstream config for this repository.
[**repos_upstream_helm_list**](ReposApi.md#repos_upstream_helm_list) | **Get** /repos/{owner}/{identifier}/upstream/helm/ | List Helm upstream configs for this repository.
[**repos_upstream_helm_partial_update**](ReposApi.md#repos_upstream_helm_partial_update) | **Patch** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Partially update a Helm upstream config for this repository.
[**repos_upstream_helm_read**](ReposApi.md#repos_upstream_helm_read) | **Get** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Retrieve a Helm upstream config for this repository.
[**repos_upstream_helm_update**](ReposApi.md#repos_upstream_helm_update) | **Put** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Update a Helm upstream config for this repository.
[**repos_upstream_hex_create**](ReposApi.md#repos_upstream_hex_create) | **Post** /repos/{owner}/{identifier}/upstream/hex/ | Create a Hex upstream config for this repository.
[**repos_upstream_hex_delete**](ReposApi.md#repos_upstream_hex_delete) | **Delete** /repos/{owner}/{identifier}/upstream/hex/{slug_perm}/ | Delete a Hex upstream config for this repository.
[**repos_upstream_hex_list**](ReposApi.md#repos_upstream_hex_list) | **Get** /repos/{owner}/{identifier}/upstream/hex/ | List Hex upstream configs for this repository.
[**repos_upstream_hex_partial_update**](ReposApi.md#repos_upstream_hex_partial_update) | **Patch** /repos/{owner}/{identifier}/upstream/hex/{slug_perm}/ | Partially update a Hex upstream config for this repository.
[**repos_upstream_hex_read**](ReposApi.md#repos_upstream_hex_read) | **Get** /repos/{owner}/{identifier}/upstream/hex/{slug_perm}/ | Retrieve a Hex upstream config for this repository.
[**repos_upstream_hex_update**](ReposApi.md#repos_upstream_hex_update) | **Put** /repos/{owner}/{identifier}/upstream/hex/{slug_perm}/ | Update a Hex upstream config for this repository.
[**repos_upstream_maven_create**](ReposApi.md#repos_upstream_maven_create) | **Post** /repos/{owner}/{identifier}/upstream/maven/ | Create a Maven upstream config for this repository.
[**repos_upstream_maven_delete**](ReposApi.md#repos_upstream_maven_delete) | **Delete** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Delete a Maven upstream config for this repository.
[**repos_upstream_maven_list**](ReposApi.md#repos_upstream_maven_list) | **Get** /repos/{owner}/{identifier}/upstream/maven/ | List Maven upstream configs for this repository.
[**repos_upstream_maven_partial_update**](ReposApi.md#repos_upstream_maven_partial_update) | **Patch** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Partially update a Maven upstream config for this repository.
[**repos_upstream_maven_read**](ReposApi.md#repos_upstream_maven_read) | **Get** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Retrieve a Maven upstream config for this repository.
[**repos_upstream_maven_update**](ReposApi.md#repos_upstream_maven_update) | **Put** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Update a Maven upstream config for this repository.
[**repos_upstream_npm_create**](ReposApi.md#repos_upstream_npm_create) | **Post** /repos/{owner}/{identifier}/upstream/npm/ | Create a npm upstream config for this repository.
[**repos_upstream_npm_delete**](ReposApi.md#repos_upstream_npm_delete) | **Delete** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Delete a npm upstream config for this repository.
[**repos_upstream_npm_list**](ReposApi.md#repos_upstream_npm_list) | **Get** /repos/{owner}/{identifier}/upstream/npm/ | List npm upstream configs for this repository.
[**repos_upstream_npm_partial_update**](ReposApi.md#repos_upstream_npm_partial_update) | **Patch** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Partially update a npm upstream config for this repository.
[**repos_upstream_npm_read**](ReposApi.md#repos_upstream_npm_read) | **Get** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Retrieve a npm upstream config for this repository.
[**repos_upstream_npm_update**](ReposApi.md#repos_upstream_npm_update) | **Put** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Update a npm upstream config for this repository.
[**repos_upstream_nuget_create**](ReposApi.md#repos_upstream_nuget_create) | **Post** /repos/{owner}/{identifier}/upstream/nuget/ | Create a NuGet upstream config for this repository.
[**repos_upstream_nuget_delete**](ReposApi.md#repos_upstream_nuget_delete) | **Delete** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Delete a NuGet upstream config for this repository.
[**repos_upstream_nuget_list**](ReposApi.md#repos_upstream_nuget_list) | **Get** /repos/{owner}/{identifier}/upstream/nuget/ | List NuGet upstream configs for this repository.
[**repos_upstream_nuget_partial_update**](ReposApi.md#repos_upstream_nuget_partial_update) | **Patch** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Partially update a NuGet upstream config for this repository.
[**repos_upstream_nuget_read**](ReposApi.md#repos_upstream_nuget_read) | **Get** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Retrieve a NuGet upstream config for this repository.
[**repos_upstream_nuget_update**](ReposApi.md#repos_upstream_nuget_update) | **Put** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Update a NuGet upstream config for this repository.
[**repos_upstream_python_create**](ReposApi.md#repos_upstream_python_create) | **Post** /repos/{owner}/{identifier}/upstream/python/ | Create a Python upstream config for this repository.
[**repos_upstream_python_delete**](ReposApi.md#repos_upstream_python_delete) | **Delete** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Delete a Python upstream config for this repository.
[**repos_upstream_python_list**](ReposApi.md#repos_upstream_python_list) | **Get** /repos/{owner}/{identifier}/upstream/python/ | List Python upstream configs for this repository.
[**repos_upstream_python_partial_update**](ReposApi.md#repos_upstream_python_partial_update) | **Patch** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Partially update a Python upstream config for this repository.
[**repos_upstream_python_read**](ReposApi.md#repos_upstream_python_read) | **Get** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Retrieve a Python upstream config for this repository.
[**repos_upstream_python_update**](ReposApi.md#repos_upstream_python_update) | **Put** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Update a Python upstream config for this repository.
[**repos_upstream_rpm_create**](ReposApi.md#repos_upstream_rpm_create) | **Post** /repos/{owner}/{identifier}/upstream/rpm/ | Create a RedHat upstream config for this repository.
[**repos_upstream_rpm_delete**](ReposApi.md#repos_upstream_rpm_delete) | **Delete** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Delete a RedHat upstream config for this repository.
[**repos_upstream_rpm_list**](ReposApi.md#repos_upstream_rpm_list) | **Get** /repos/{owner}/{identifier}/upstream/rpm/ | List RedHat upstream configs for this repository.
[**repos_upstream_rpm_partial_update**](ReposApi.md#repos_upstream_rpm_partial_update) | **Patch** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Partially update a RedHat upstream config for this repository.
[**repos_upstream_rpm_read**](ReposApi.md#repos_upstream_rpm_read) | **Get** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Retrieve a RedHat upstream config for this repository.
[**repos_upstream_rpm_update**](ReposApi.md#repos_upstream_rpm_update) | **Put** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Update a RedHat upstream config for this repository.
[**repos_upstream_ruby_create**](ReposApi.md#repos_upstream_ruby_create) | **Post** /repos/{owner}/{identifier}/upstream/ruby/ | Create a Ruby upstream config for this repository.
[**repos_upstream_ruby_delete**](ReposApi.md#repos_upstream_ruby_delete) | **Delete** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Delete a Ruby upstream config for this repository.
[**repos_upstream_ruby_list**](ReposApi.md#repos_upstream_ruby_list) | **Get** /repos/{owner}/{identifier}/upstream/ruby/ | List Ruby upstream configs for this repository.
[**repos_upstream_ruby_partial_update**](ReposApi.md#repos_upstream_ruby_partial_update) | **Patch** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Partially update a Ruby upstream config for this repository.
[**repos_upstream_ruby_read**](ReposApi.md#repos_upstream_ruby_read) | **Get** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Retrieve a Ruby upstream config for this repository.
[**repos_upstream_ruby_update**](ReposApi.md#repos_upstream_ruby_update) | **Put** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Update a Ruby upstream config for this repository.
[**repos_upstream_swift_create**](ReposApi.md#repos_upstream_swift_create) | **Post** /repos/{owner}/{identifier}/upstream/swift/ | Create a Swift upstream config for this repository.
[**repos_upstream_swift_delete**](ReposApi.md#repos_upstream_swift_delete) | **Delete** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Delete a Swift upstream config for this repository.
[**repos_upstream_swift_list**](ReposApi.md#repos_upstream_swift_list) | **Get** /repos/{owner}/{identifier}/upstream/swift/ | List Swift upstream configs for this repository.
[**repos_upstream_swift_partial_update**](ReposApi.md#repos_upstream_swift_partial_update) | **Patch** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Partially update a Swift upstream config for this repository.
[**repos_upstream_swift_read**](ReposApi.md#repos_upstream_swift_read) | **Get** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Retrieve a Swift upstream config for this repository.
[**repos_upstream_swift_update**](ReposApi.md#repos_upstream_swift_update) | **Put** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Update a Swift upstream config for this repository.
[**repos_user_list**](ReposApi.md#repos_user_list) | **Get** /repos/ | Get a list of all repositories associated with current user.
[**repos_x509_ecdsa_list**](ReposApi.md#repos_x509_ecdsa_list) | **Get** /repos/{owner}/{identifier}/x509-ecdsa/ | Retrieve the active X.509 ECDSA certificate for the Repository.
[**repos_x509_rsa_list**](ReposApi.md#repos_x509_rsa_list) | **Get** /repos/{owner}/{identifier}/x509-rsa/ | Retrieve the active X.509 RSA certificate for the Repository.


# **api_repos_geoip_status**
> ::models::RepositoryGeoIpStatus api_repos_geoip_status(ctx, ctx, owner, identifier)
Retrieve the GeoIP status for this repository.

Retrieve the GeoIP status for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

[**::models::RepositoryGeoIpStatus**](RepositoryGeoIpStatus.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repo_retention_partial_update**
> ::models::RepositoryRetentionRules repo_retention_partial_update(ctx, ctx, owner, repo, optional)
Update the retention rules for the repository.

Update the retention rules for the repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**RepositoryRetentionRulesRequestPatch**](RepositoryRetentionRulesRequestPatch.md)|  | 

### Return type

[**::models::RepositoryRetentionRules**](RepositoryRetentionRules.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repo_retention_read**
> ::models::RepositoryRetentionRules repo_retention_read(ctx, ctx, owner, repo)
Retrieve the retention rules for the repository.

Retrieve the retention rules for the repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 

### Return type

[**::models::RepositoryRetentionRules**](RepositoryRetentionRules.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create**
> ::models::RepositoryCreate repos_create(ctx, ctx, owner, optional)
Create a new repository in a given namespace.

Create a new repository in a given namespace.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **data** | [**RepositoryCreateRequest**](RepositoryCreateRequest.md)|  | 

### Return type

[**::models::RepositoryCreate**](RepositoryCreate.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete**
> repos_delete(ctx, ctx, owner, identifier)
Delete a repository in a given namespace.

Delete a repository in a given namespace.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_ecdsa_create**
> ::models::RepositoryEcdsaKey repos_ecdsa_create(ctx, ctx, owner, identifier, optional)
Set the active ECDSA key for the Repository.

Set the active ECDSA key for the Repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryEcdsaKeyCreate**](RepositoryEcdsaKeyCreate.md)|  | 

### Return type

[**::models::RepositoryEcdsaKey**](RepositoryEcdsaKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_ecdsa_list**
> ::models::RepositoryEcdsaKey repos_ecdsa_list(ctx, ctx, owner, identifier)
Retrieve the active ECDSA key for the Repository.

Retrieve the active ECDSA key for the Repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

[**::models::RepositoryEcdsaKey**](RepositoryEcdsaKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_ecdsa_regenerate**
> ::models::RepositoryEcdsaKey repos_ecdsa_regenerate(ctx, ctx, owner, identifier)
Regenerate ECDSA Key for the Repository.

Regenerate ECDSA Key for the Repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

[**::models::RepositoryEcdsaKey**](RepositoryEcdsaKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_geoip_disable**
> repos_geoip_disable(ctx, ctx, owner, identifier, optional)
Disable GeoIP for this repository.

Disable GeoIP for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RespositoryGeoIpEnableDisableRequest**](RespositoryGeoIpEnableDisableRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_geoip_enable**
> repos_geoip_enable(ctx, ctx, owner, identifier, optional)
Enable GeoIP for this repository.

Enable GeoIP for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RespositoryGeoIpEnableDisableRequest**](RespositoryGeoIpEnableDisableRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_geoip_partial_update**
> ::models::RepositoryGeoIpRules repos_geoip_partial_update(ctx, ctx, owner, identifier, optional)
Partially update repository geoip rules.

Partially update repository geoip rules.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryGeoIpRulesRequestPatch**](RepositoryGeoIpRulesRequestPatch.md)|  | 

### Return type

[**::models::RepositoryGeoIpRules**](RepositoryGeoIpRules.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_geoip_read**
> ::models::RepositoryGeoIpRules repos_geoip_read(ctx, ctx, owner, identifier)
List all repository geoip rules.

List all repository geoip rules.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

[**::models::RepositoryGeoIpRules**](RepositoryGeoIpRules.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_geoip_test**
> ::models::RepositoryGeoIpTestAddressResponse repos_geoip_test(ctx, ctx, owner, identifier, optional)
Test a list of IP addresses against the repository's current GeoIP rules.

Test a list of IP addresses against the repository's current GeoIP rules.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryGeoIpTestAddress**](RepositoryGeoIpTestAddress.md)|  | 

### Return type

[**::models::RepositoryGeoIpTestAddressResponse**](RepositoryGeoIpTestAddressResponse.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_geoip_update**
> ::models::RepositoryGeoIpRules repos_geoip_update(ctx, ctx, owner, identifier, optional)
Replace repository geoip rules.

Replace repository geoip rules.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryGeoIpRulesRequest**](RepositoryGeoIpRulesRequest.md)|  | 

### Return type

[**::models::RepositoryGeoIpRules**](RepositoryGeoIpRules.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_gpg_create**
> ::models::RepositoryGpgKey repos_gpg_create(ctx, ctx, owner, identifier, optional)
Set the active GPG key for the Repository.

Set the active GPG key for the Repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryGpgKeyCreate**](RepositoryGpgKeyCreate.md)|  | 

### Return type

[**::models::RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_gpg_list**
> ::models::RepositoryGpgKey repos_gpg_list(ctx, ctx, owner, identifier)
Retrieve the active GPG key for the Repository.

Retrieve the active GPG key for the Repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

[**::models::RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_gpg_regenerate**
> ::models::RepositoryGpgKey repos_gpg_regenerate(ctx, ctx, owner, identifier)
Regenerate GPG Key for the Repository.

Regenerate GPG Key for the Repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

[**::models::RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_namespace_list**
> Vec<::models::Repository> repos_namespace_list(ctx, ctx, owner, optional)
Get a list of all repositories within a namespace.

Get a list of all repositories within a namespace.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::Repository>**](Repository.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_partial_update**
> ::models::Repository repos_partial_update(ctx, ctx, owner, identifier, optional)
Update details about a repository in a given namespace.

Update details about a repository in a given namespace.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryRequestPatch**](RepositoryRequestPatch.md)|  | 

### Return type

[**::models::Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_privileges_list**
> ::models::RepositoryPrivilegeInput repos_privileges_list(ctx, ctx, owner, identifier, optional)
List all explicity created privileges for the repository.

List all explicity created privileges for the repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**::models::RepositoryPrivilegeInput**](RepositoryPrivilegeInput.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_privileges_partial_update**
> repos_privileges_partial_update(ctx, ctx, owner, identifier, optional)
Modify privileges for the repository.

Modify privileges for the repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryPrivilegeInputRequestPatch**](RepositoryPrivilegeInputRequestPatch.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_privileges_update**
> repos_privileges_update(ctx, ctx, owner, identifier, optional)
Replace all existing repository privileges with those specified.

Replace all existing repository privileges with those specified.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryPrivilegeInputRequest**](RepositoryPrivilegeInputRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_read**
> ::models::Repository repos_read(ctx, ctx, owner, identifier)
Get a specific repository.

Get a specific repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

[**::models::Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_rsa_create**
> ::models::RepositoryRsaKey repos_rsa_create(ctx, ctx, owner, identifier, optional)
Set the active RSA key for the Repository.

Set the active RSA key for the Repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RepositoryRsaKeyCreate**](RepositoryRsaKeyCreate.md)|  | 

### Return type

[**::models::RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_rsa_list**
> ::models::RepositoryRsaKey repos_rsa_list(ctx, ctx, owner, identifier)
Retrieve the active RSA key for the Repository.

Retrieve the active RSA key for the Repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

[**::models::RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_rsa_regenerate**
> ::models::RepositoryRsaKey repos_rsa_regenerate(ctx, ctx, owner, identifier)
Regenerate RSA Key for the Repository.

Regenerate RSA Key for the Repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

[**::models::RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_transfer_region**
> repos_transfer_region(ctx, ctx, owner, repo, optional)
Transfer a repository to a different region.

Transfer a repository to a different region.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **data** | [**RepositoryTransferRegionRequest**](RepositoryTransferRegionRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_composer_create**
> ::models::ComposerUpstream repos_upstream_composer_create(ctx, ctx, owner, identifier, optional)
Create a Composer upstream config for this repository.

Create a Composer upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**ComposerUpstreamRequest**](ComposerUpstreamRequest.md)|  | 

### Return type

[**::models::ComposerUpstream**](ComposerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_composer_delete**
> repos_upstream_composer_delete(ctx, ctx, owner, identifier, slug_perm)
Delete a Composer upstream config for this repository.

Delete a Composer upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_composer_list**
> Vec<::models::ComposerUpstream> repos_upstream_composer_list(ctx, ctx, owner, identifier, optional)
List Composer upstream configs for this repository.

List Composer upstream configs for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::ComposerUpstream>**](ComposerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_composer_partial_update**
> ::models::ComposerUpstream repos_upstream_composer_partial_update(ctx, ctx, owner, identifier, slug_perm, optional)
Partially update a Composer upstream config for this repository.

Partially update a Composer upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**ComposerUpstreamRequestPatch**](ComposerUpstreamRequestPatch.md)|  | 

### Return type

[**::models::ComposerUpstream**](ComposerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_composer_read**
> ::models::ComposerUpstream repos_upstream_composer_read(ctx, ctx, owner, identifier, slug_perm)
Retrieve a Composer upstream config for this repository.

Retrieve a Composer upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::ComposerUpstream**](ComposerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_composer_update**
> ::models::ComposerUpstream repos_upstream_composer_update(ctx, ctx, owner, identifier, slug_perm, optional)
Update a Composer upstream config for this repository.

Update a Composer upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**ComposerUpstreamRequest**](ComposerUpstreamRequest.md)|  | 

### Return type

[**::models::ComposerUpstream**](ComposerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_cran_create**
> ::models::CranUpstream repos_upstream_cran_create(ctx, ctx, owner, identifier, optional)
Create a CRAN upstream config for this repository.

Create a CRAN upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**CranUpstreamRequest**](CranUpstreamRequest.md)|  | 

### Return type

[**::models::CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_cran_delete**
> repos_upstream_cran_delete(ctx, ctx, owner, identifier, slug_perm)
Delete a CRAN upstream config for this repository.

Delete a CRAN upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_cran_list**
> Vec<::models::CranUpstream> repos_upstream_cran_list(ctx, ctx, owner, identifier, optional)
List CRAN upstream configs for this repository.

List CRAN upstream configs for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::CranUpstream>**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_cran_partial_update**
> ::models::CranUpstream repos_upstream_cran_partial_update(ctx, ctx, owner, identifier, slug_perm, optional)
Partially update a CRAN upstream config for this repository.

Partially update a CRAN upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**CranUpstreamRequestPatch**](CranUpstreamRequestPatch.md)|  | 

### Return type

[**::models::CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_cran_read**
> ::models::CranUpstream repos_upstream_cran_read(ctx, ctx, owner, identifier, slug_perm)
Retrieve a CRAN upstream config for this repository.

Retrieve a CRAN upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_cran_update**
> ::models::CranUpstream repos_upstream_cran_update(ctx, ctx, owner, identifier, slug_perm, optional)
Update a CRAN upstream config for this repository.

Update a CRAN upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**CranUpstreamRequest**](CranUpstreamRequest.md)|  | 

### Return type

[**::models::CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_dart_create**
> ::models::DartUpstream repos_upstream_dart_create(ctx, ctx, owner, identifier, optional)
Create a Dart upstream config for this repository.

Create a Dart upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**DartUpstreamRequest**](DartUpstreamRequest.md)|  | 

### Return type

[**::models::DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_dart_delete**
> repos_upstream_dart_delete(ctx, ctx, owner, identifier, slug_perm)
Delete a Dart upstream config for this repository.

Delete a Dart upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_dart_list**
> Vec<::models::DartUpstream> repos_upstream_dart_list(ctx, ctx, owner, identifier, optional)
List Dart upstream configs for this repository.

List Dart upstream configs for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::DartUpstream>**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_dart_partial_update**
> ::models::DartUpstream repos_upstream_dart_partial_update(ctx, ctx, owner, identifier, slug_perm, optional)
Partially update a Dart upstream config for this repository.

Partially update a Dart upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**DartUpstreamRequestPatch**](DartUpstreamRequestPatch.md)|  | 

### Return type

[**::models::DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_dart_read**
> ::models::DartUpstream repos_upstream_dart_read(ctx, ctx, owner, identifier, slug_perm)
Retrieve a Dart upstream config for this repository.

Retrieve a Dart upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_dart_update**
> ::models::DartUpstream repos_upstream_dart_update(ctx, ctx, owner, identifier, slug_perm, optional)
Update a Dart upstream config for this repository.

Update a Dart upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**DartUpstreamRequest**](DartUpstreamRequest.md)|  | 

### Return type

[**::models::DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_deb_create**
> ::models::DebUpstream repos_upstream_deb_create(ctx, ctx, owner, identifier, optional)
Create a Debian upstream config for this repository.

Create a Debian upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**DebUpstreamRequest**](DebUpstreamRequest.md)|  | 

### Return type

[**::models::DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_deb_delete**
> repos_upstream_deb_delete(ctx, ctx, owner, identifier, slug_perm)
Delete a Debian upstream config for this repository.

Delete a Debian upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_deb_list**
> Vec<::models::DebUpstream> repos_upstream_deb_list(ctx, ctx, owner, identifier, optional)
List Debian upstream configs for this repository.

List Debian upstream configs for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::DebUpstream>**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_deb_partial_update**
> ::models::DebUpstream repos_upstream_deb_partial_update(ctx, ctx, owner, identifier, slug_perm, optional)
Partially update a Debian upstream config for this repository.

Partially update a Debian upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**DebUpstreamRequestPatch**](DebUpstreamRequestPatch.md)|  | 

### Return type

[**::models::DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_deb_read**
> ::models::DebUpstream repos_upstream_deb_read(ctx, ctx, owner, identifier, slug_perm)
Retrieve a Debian upstream config for this repository.

Retrieve a Debian upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_deb_update**
> ::models::DebUpstream repos_upstream_deb_update(ctx, ctx, owner, identifier, slug_perm, optional)
Update a Debian upstream config for this repository.

Update a Debian upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**DebUpstreamRequest**](DebUpstreamRequest.md)|  | 

### Return type

[**::models::DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_docker_create**
> ::models::DockerUpstream repos_upstream_docker_create(ctx, ctx, owner, identifier, optional)
Create a Docker upstream config for this repository.

Create a Docker upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**DockerUpstreamRequest**](DockerUpstreamRequest.md)|  | 

### Return type

[**::models::DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_docker_delete**
> repos_upstream_docker_delete(ctx, ctx, owner, identifier, slug_perm)
Delete a Docker upstream config for this repository.

Delete a Docker upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_docker_list**
> Vec<::models::DockerUpstream> repos_upstream_docker_list(ctx, ctx, owner, identifier, optional)
List Docker upstream configs for this repository.

List Docker upstream configs for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::DockerUpstream>**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_docker_partial_update**
> ::models::DockerUpstream repos_upstream_docker_partial_update(ctx, ctx, owner, identifier, slug_perm, optional)
Partially update a Docker upstream config for this repository.

Partially update a Docker upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**DockerUpstreamRequestPatch**](DockerUpstreamRequestPatch.md)|  | 

### Return type

[**::models::DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_docker_read**
> ::models::DockerUpstream repos_upstream_docker_read(ctx, ctx, owner, identifier, slug_perm)
Retrieve a Docker upstream config for this repository.

Retrieve a Docker upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_docker_update**
> ::models::DockerUpstream repos_upstream_docker_update(ctx, ctx, owner, identifier, slug_perm, optional)
Update a Docker upstream config for this repository.

Update a Docker upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**DockerUpstreamRequest**](DockerUpstreamRequest.md)|  | 

### Return type

[**::models::DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_helm_create**
> ::models::HelmUpstream repos_upstream_helm_create(ctx, ctx, owner, identifier, optional)
Create a Helm upstream config for this repository.

Create a Helm upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**HelmUpstreamRequest**](HelmUpstreamRequest.md)|  | 

### Return type

[**::models::HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_helm_delete**
> repos_upstream_helm_delete(ctx, ctx, owner, identifier, slug_perm)
Delete a Helm upstream config for this repository.

Delete a Helm upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_helm_list**
> Vec<::models::HelmUpstream> repos_upstream_helm_list(ctx, ctx, owner, identifier, optional)
List Helm upstream configs for this repository.

List Helm upstream configs for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::HelmUpstream>**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_helm_partial_update**
> ::models::HelmUpstream repos_upstream_helm_partial_update(ctx, ctx, owner, identifier, slug_perm, optional)
Partially update a Helm upstream config for this repository.

Partially update a Helm upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**HelmUpstreamRequestPatch**](HelmUpstreamRequestPatch.md)|  | 

### Return type

[**::models::HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_helm_read**
> ::models::HelmUpstream repos_upstream_helm_read(ctx, ctx, owner, identifier, slug_perm)
Retrieve a Helm upstream config for this repository.

Retrieve a Helm upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_helm_update**
> ::models::HelmUpstream repos_upstream_helm_update(ctx, ctx, owner, identifier, slug_perm, optional)
Update a Helm upstream config for this repository.

Update a Helm upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**HelmUpstreamRequest**](HelmUpstreamRequest.md)|  | 

### Return type

[**::models::HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_hex_create**
> ::models::HexUpstream repos_upstream_hex_create(ctx, ctx, owner, identifier, optional)
Create a Hex upstream config for this repository.

Create a Hex upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**HexUpstreamRequest**](HexUpstreamRequest.md)|  | 

### Return type

[**::models::HexUpstream**](HexUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_hex_delete**
> repos_upstream_hex_delete(ctx, ctx, owner, identifier, slug_perm)
Delete a Hex upstream config for this repository.

Delete a Hex upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_hex_list**
> Vec<::models::HexUpstream> repos_upstream_hex_list(ctx, ctx, owner, identifier, optional)
List Hex upstream configs for this repository.

List Hex upstream configs for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::HexUpstream>**](HexUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_hex_partial_update**
> ::models::HexUpstream repos_upstream_hex_partial_update(ctx, ctx, owner, identifier, slug_perm, optional)
Partially update a Hex upstream config for this repository.

Partially update a Hex upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**HexUpstreamRequestPatch**](HexUpstreamRequestPatch.md)|  | 

### Return type

[**::models::HexUpstream**](HexUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_hex_read**
> ::models::HexUpstream repos_upstream_hex_read(ctx, ctx, owner, identifier, slug_perm)
Retrieve a Hex upstream config for this repository.

Retrieve a Hex upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::HexUpstream**](HexUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_hex_update**
> ::models::HexUpstream repos_upstream_hex_update(ctx, ctx, owner, identifier, slug_perm, optional)
Update a Hex upstream config for this repository.

Update a Hex upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**HexUpstreamRequest**](HexUpstreamRequest.md)|  | 

### Return type

[**::models::HexUpstream**](HexUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_maven_create**
> ::models::MavenUpstream repos_upstream_maven_create(ctx, ctx, owner, identifier, optional)
Create a Maven upstream config for this repository.

Create a Maven upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**MavenUpstreamRequest**](MavenUpstreamRequest.md)|  | 

### Return type

[**::models::MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_maven_delete**
> repos_upstream_maven_delete(ctx, ctx, owner, identifier, slug_perm)
Delete a Maven upstream config for this repository.

Delete a Maven upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_maven_list**
> Vec<::models::MavenUpstream> repos_upstream_maven_list(ctx, ctx, owner, identifier, optional)
List Maven upstream configs for this repository.

List Maven upstream configs for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::MavenUpstream>**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_maven_partial_update**
> ::models::MavenUpstream repos_upstream_maven_partial_update(ctx, ctx, owner, identifier, slug_perm, optional)
Partially update a Maven upstream config for this repository.

Partially update a Maven upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**MavenUpstreamRequestPatch**](MavenUpstreamRequestPatch.md)|  | 

### Return type

[**::models::MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_maven_read**
> ::models::MavenUpstream repos_upstream_maven_read(ctx, ctx, owner, identifier, slug_perm)
Retrieve a Maven upstream config for this repository.

Retrieve a Maven upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_maven_update**
> ::models::MavenUpstream repos_upstream_maven_update(ctx, ctx, owner, identifier, slug_perm, optional)
Update a Maven upstream config for this repository.

Update a Maven upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**MavenUpstreamRequest**](MavenUpstreamRequest.md)|  | 

### Return type

[**::models::MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_npm_create**
> ::models::NpmUpstream repos_upstream_npm_create(ctx, ctx, owner, identifier, optional)
Create a npm upstream config for this repository.

Create a npm upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**NpmUpstreamRequest**](NpmUpstreamRequest.md)|  | 

### Return type

[**::models::NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_npm_delete**
> repos_upstream_npm_delete(ctx, ctx, owner, identifier, slug_perm)
Delete a npm upstream config for this repository.

Delete a npm upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_npm_list**
> Vec<::models::NpmUpstream> repos_upstream_npm_list(ctx, ctx, owner, identifier, optional)
List npm upstream configs for this repository.

List npm upstream configs for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::NpmUpstream>**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_npm_partial_update**
> ::models::NpmUpstream repos_upstream_npm_partial_update(ctx, ctx, owner, identifier, slug_perm, optional)
Partially update a npm upstream config for this repository.

Partially update a npm upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**NpmUpstreamRequestPatch**](NpmUpstreamRequestPatch.md)|  | 

### Return type

[**::models::NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_npm_read**
> ::models::NpmUpstream repos_upstream_npm_read(ctx, ctx, owner, identifier, slug_perm)
Retrieve a npm upstream config for this repository.

Retrieve a npm upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_npm_update**
> ::models::NpmUpstream repos_upstream_npm_update(ctx, ctx, owner, identifier, slug_perm, optional)
Update a npm upstream config for this repository.

Update a npm upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**NpmUpstreamRequest**](NpmUpstreamRequest.md)|  | 

### Return type

[**::models::NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_nuget_create**
> ::models::NugetUpstream repos_upstream_nuget_create(ctx, ctx, owner, identifier, optional)
Create a NuGet upstream config for this repository.

Create a NuGet upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**NugetUpstreamRequest**](NugetUpstreamRequest.md)|  | 

### Return type

[**::models::NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_nuget_delete**
> repos_upstream_nuget_delete(ctx, ctx, owner, identifier, slug_perm)
Delete a NuGet upstream config for this repository.

Delete a NuGet upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_nuget_list**
> Vec<::models::NugetUpstream> repos_upstream_nuget_list(ctx, ctx, owner, identifier, optional)
List NuGet upstream configs for this repository.

List NuGet upstream configs for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::NugetUpstream>**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_nuget_partial_update**
> ::models::NugetUpstream repos_upstream_nuget_partial_update(ctx, ctx, owner, identifier, slug_perm, optional)
Partially update a NuGet upstream config for this repository.

Partially update a NuGet upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**NugetUpstreamRequestPatch**](NugetUpstreamRequestPatch.md)|  | 

### Return type

[**::models::NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_nuget_read**
> ::models::NugetUpstream repos_upstream_nuget_read(ctx, ctx, owner, identifier, slug_perm)
Retrieve a NuGet upstream config for this repository.

Retrieve a NuGet upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_nuget_update**
> ::models::NugetUpstream repos_upstream_nuget_update(ctx, ctx, owner, identifier, slug_perm, optional)
Update a NuGet upstream config for this repository.

Update a NuGet upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**NugetUpstreamRequest**](NugetUpstreamRequest.md)|  | 

### Return type

[**::models::NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_python_create**
> ::models::PythonUpstream repos_upstream_python_create(ctx, ctx, owner, identifier, optional)
Create a Python upstream config for this repository.

Create a Python upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**PythonUpstreamRequest**](PythonUpstreamRequest.md)|  | 

### Return type

[**::models::PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_python_delete**
> repos_upstream_python_delete(ctx, ctx, owner, identifier, slug_perm)
Delete a Python upstream config for this repository.

Delete a Python upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_python_list**
> Vec<::models::PythonUpstream> repos_upstream_python_list(ctx, ctx, owner, identifier, optional)
List Python upstream configs for this repository.

List Python upstream configs for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::PythonUpstream>**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_python_partial_update**
> ::models::PythonUpstream repos_upstream_python_partial_update(ctx, ctx, owner, identifier, slug_perm, optional)
Partially update a Python upstream config for this repository.

Partially update a Python upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**PythonUpstreamRequestPatch**](PythonUpstreamRequestPatch.md)|  | 

### Return type

[**::models::PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_python_read**
> ::models::PythonUpstream repos_upstream_python_read(ctx, ctx, owner, identifier, slug_perm)
Retrieve a Python upstream config for this repository.

Retrieve a Python upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_python_update**
> ::models::PythonUpstream repos_upstream_python_update(ctx, ctx, owner, identifier, slug_perm, optional)
Update a Python upstream config for this repository.

Update a Python upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**PythonUpstreamRequest**](PythonUpstreamRequest.md)|  | 

### Return type

[**::models::PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_rpm_create**
> ::models::RpmUpstream repos_upstream_rpm_create(ctx, ctx, owner, identifier, optional)
Create a RedHat upstream config for this repository.

Create a RedHat upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RpmUpstreamRequest**](RpmUpstreamRequest.md)|  | 

### Return type

[**::models::RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_rpm_delete**
> repos_upstream_rpm_delete(ctx, ctx, owner, identifier, slug_perm)
Delete a RedHat upstream config for this repository.

Delete a RedHat upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_rpm_list**
> Vec<::models::RpmUpstream> repos_upstream_rpm_list(ctx, ctx, owner, identifier, optional)
List RedHat upstream configs for this repository.

List RedHat upstream configs for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::RpmUpstream>**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_rpm_partial_update**
> ::models::RpmUpstream repos_upstream_rpm_partial_update(ctx, ctx, owner, identifier, slug_perm, optional)
Partially update a RedHat upstream config for this repository.

Partially update a RedHat upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**RpmUpstreamRequestPatch**](RpmUpstreamRequestPatch.md)|  | 

### Return type

[**::models::RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_rpm_read**
> ::models::RpmUpstream repos_upstream_rpm_read(ctx, ctx, owner, identifier, slug_perm)
Retrieve a RedHat upstream config for this repository.

Retrieve a RedHat upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_rpm_update**
> ::models::RpmUpstream repos_upstream_rpm_update(ctx, ctx, owner, identifier, slug_perm, optional)
Update a RedHat upstream config for this repository.

Update a RedHat upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**RpmUpstreamRequest**](RpmUpstreamRequest.md)|  | 

### Return type

[**::models::RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_ruby_create**
> ::models::RubyUpstream repos_upstream_ruby_create(ctx, ctx, owner, identifier, optional)
Create a Ruby upstream config for this repository.

Create a Ruby upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**RubyUpstreamRequest**](RubyUpstreamRequest.md)|  | 

### Return type

[**::models::RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_ruby_delete**
> repos_upstream_ruby_delete(ctx, ctx, owner, identifier, slug_perm)
Delete a Ruby upstream config for this repository.

Delete a Ruby upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_ruby_list**
> Vec<::models::RubyUpstream> repos_upstream_ruby_list(ctx, ctx, owner, identifier, optional)
List Ruby upstream configs for this repository.

List Ruby upstream configs for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::RubyUpstream>**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_ruby_partial_update**
> ::models::RubyUpstream repos_upstream_ruby_partial_update(ctx, ctx, owner, identifier, slug_perm, optional)
Partially update a Ruby upstream config for this repository.

Partially update a Ruby upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**RubyUpstreamRequestPatch**](RubyUpstreamRequestPatch.md)|  | 

### Return type

[**::models::RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_ruby_read**
> ::models::RubyUpstream repos_upstream_ruby_read(ctx, ctx, owner, identifier, slug_perm)
Retrieve a Ruby upstream config for this repository.

Retrieve a Ruby upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_ruby_update**
> ::models::RubyUpstream repos_upstream_ruby_update(ctx, ctx, owner, identifier, slug_perm, optional)
Update a Ruby upstream config for this repository.

Update a Ruby upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**RubyUpstreamRequest**](RubyUpstreamRequest.md)|  | 

### Return type

[**::models::RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_swift_create**
> ::models::SwiftUpstream repos_upstream_swift_create(ctx, ctx, owner, identifier, optional)
Create a Swift upstream config for this repository.

Create a Swift upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**SwiftUpstreamRequest**](SwiftUpstreamRequest.md)|  | 

### Return type

[**::models::SwiftUpstream**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_swift_delete**
> repos_upstream_swift_delete(ctx, ctx, owner, identifier, slug_perm)
Delete a Swift upstream config for this repository.

Delete a Swift upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_swift_list**
> Vec<::models::SwiftUpstream> repos_upstream_swift_list(ctx, ctx, owner, identifier, optional)
List Swift upstream configs for this repository.

List Swift upstream configs for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::SwiftUpstream>**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_swift_partial_update**
> ::models::SwiftUpstream repos_upstream_swift_partial_update(ctx, ctx, owner, identifier, slug_perm, optional)
Partially update a Swift upstream config for this repository.

Partially update a Swift upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**SwiftUpstreamRequestPatch**](SwiftUpstreamRequestPatch.md)|  | 

### Return type

[**::models::SwiftUpstream**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_swift_read**
> ::models::SwiftUpstream repos_upstream_swift_read(ctx, ctx, owner, identifier, slug_perm)
Retrieve a Swift upstream config for this repository.

Retrieve a Swift upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 

### Return type

[**::models::SwiftUpstream**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upstream_swift_update**
> ::models::SwiftUpstream repos_upstream_swift_update(ctx, ctx, owner, identifier, slug_perm, optional)
Update a Swift upstream config for this repository.

Update a Swift upstream config for this repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 
  **slug_perm** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **identifier** | **String**|  | 
 **slug_perm** | **String**|  | 
 **data** | [**SwiftUpstreamRequest**](SwiftUpstreamRequest.md)|  | 

### Return type

[**::models::SwiftUpstream**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_user_list**
> Vec<::models::Repository> repos_user_list(ctx, ctx, optional)
Get a list of all repositories associated with current user.

Get a list of all repositories associated with current user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 

### Return type

[**Vec<::models::Repository>**](Repository.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_x509_ecdsa_list**
> ::models::RepositoryX509EcdsaCertificate repos_x509_ecdsa_list(ctx, ctx, owner, identifier)
Retrieve the active X.509 ECDSA certificate for the Repository.

Retrieve the active X.509 ECDSA certificate for the Repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

[**::models::RepositoryX509EcdsaCertificate**](RepositoryX509EcdsaCertificate.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_x509_rsa_list**
> ::models::RepositoryX509RsaCertificate repos_x509_rsa_list(ctx, ctx, owner, identifier)
Retrieve the active X.509 RSA certificate for the Repository.

Retrieve the active X.509 RSA certificate for the Repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

[**::models::RepositoryX509RsaCertificate**](RepositoryX509RsaCertificate.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

