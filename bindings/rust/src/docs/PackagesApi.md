# \PackagesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**packages_copy**](PackagesApi.md#packages_copy) | **Post** /packages/{owner}/{repo}/{identifier}/copy/ | Copy a package to another repository.
[**packages_delete**](PackagesApi.md#packages_delete) | **Delete** /packages/{owner}/{repo}/{identifier}/ | Delete a specific package in a repository.
[**packages_dependencies**](PackagesApi.md#packages_dependencies) | **Get** /packages/{owner}/{repo}/{identifier}/dependencies/ | Get the list of dependencies for a package. Transitive dependencies are included where supported.
[**packages_list**](PackagesApi.md#packages_list) | **Get** /packages/{owner}/{repo}/ | Get a list of all packages associated with repository.
[**packages_move**](PackagesApi.md#packages_move) | **Post** /packages/{owner}/{repo}/{identifier}/move/ | Move a package to another repository.
[**packages_quarantine**](PackagesApi.md#packages_quarantine) | **Post** /packages/{owner}/{repo}/{identifier}/quarantine/ | Quarantine or release a package.
[**packages_read**](PackagesApi.md#packages_read) | **Get** /packages/{owner}/{repo}/{identifier}/ | Get a specific package in a repository.
[**packages_resync**](PackagesApi.md#packages_resync) | **Post** /packages/{owner}/{repo}/{identifier}/resync/ | Schedule a package for resynchronisation.
[**packages_scan**](PackagesApi.md#packages_scan) | **Post** /packages/{owner}/{repo}/{identifier}/scan/ | Schedule a package for scanning.
[**packages_status**](PackagesApi.md#packages_status) | **Get** /packages/{owner}/{repo}/{identifier}/status/ | Get the synchronization status for a package.
[**packages_tag**](PackagesApi.md#packages_tag) | **Post** /packages/{owner}/{repo}/{identifier}/tag/ | Add/Replace/Remove tags for a package.
[**packages_upload_alpine**](PackagesApi.md#packages_upload_alpine) | **Post** /packages/{owner}/{repo}/upload/alpine/ | Create a new Alpine package
[**packages_upload_cargo**](PackagesApi.md#packages_upload_cargo) | **Post** /packages/{owner}/{repo}/upload/cargo/ | Create a new Cargo package
[**packages_upload_cocoapods**](PackagesApi.md#packages_upload_cocoapods) | **Post** /packages/{owner}/{repo}/upload/cocoapods/ | Create a new CocoaPods package
[**packages_upload_composer**](PackagesApi.md#packages_upload_composer) | **Post** /packages/{owner}/{repo}/upload/composer/ | Create a new Composer package
[**packages_upload_conan**](PackagesApi.md#packages_upload_conan) | **Post** /packages/{owner}/{repo}/upload/conan/ | Create a new Conan package
[**packages_upload_conda**](PackagesApi.md#packages_upload_conda) | **Post** /packages/{owner}/{repo}/upload/conda/ | Create a new Conda package
[**packages_upload_cran**](PackagesApi.md#packages_upload_cran) | **Post** /packages/{owner}/{repo}/upload/cran/ | Create a new CRAN package
[**packages_upload_dart**](PackagesApi.md#packages_upload_dart) | **Post** /packages/{owner}/{repo}/upload/dart/ | Create a new Dart package
[**packages_upload_deb**](PackagesApi.md#packages_upload_deb) | **Post** /packages/{owner}/{repo}/upload/deb/ | Create a new Debian package
[**packages_upload_docker**](PackagesApi.md#packages_upload_docker) | **Post** /packages/{owner}/{repo}/upload/docker/ | Create a new Docker package
[**packages_upload_go**](PackagesApi.md#packages_upload_go) | **Post** /packages/{owner}/{repo}/upload/go/ | Create a new Go package
[**packages_upload_helm**](PackagesApi.md#packages_upload_helm) | **Post** /packages/{owner}/{repo}/upload/helm/ | Create a new Helm package
[**packages_upload_hex**](PackagesApi.md#packages_upload_hex) | **Post** /packages/{owner}/{repo}/upload/hex/ | Create a new Hex package
[**packages_upload_luarocks**](PackagesApi.md#packages_upload_luarocks) | **Post** /packages/{owner}/{repo}/upload/luarocks/ | Create a new LuaRocks package
[**packages_upload_maven**](PackagesApi.md#packages_upload_maven) | **Post** /packages/{owner}/{repo}/upload/maven/ | Create a new Maven package
[**packages_upload_npm**](PackagesApi.md#packages_upload_npm) | **Post** /packages/{owner}/{repo}/upload/npm/ | Create a new npm package
[**packages_upload_nuget**](PackagesApi.md#packages_upload_nuget) | **Post** /packages/{owner}/{repo}/upload/nuget/ | Create a new NuGet package
[**packages_upload_p2**](PackagesApi.md#packages_upload_p2) | **Post** /packages/{owner}/{repo}/upload/p2/ | Create a new P2 package
[**packages_upload_python**](PackagesApi.md#packages_upload_python) | **Post** /packages/{owner}/{repo}/upload/python/ | Create a new Python package
[**packages_upload_raw**](PackagesApi.md#packages_upload_raw) | **Post** /packages/{owner}/{repo}/upload/raw/ | Create a new Raw package
[**packages_upload_rpm**](PackagesApi.md#packages_upload_rpm) | **Post** /packages/{owner}/{repo}/upload/rpm/ | Create a new RedHat package
[**packages_upload_ruby**](PackagesApi.md#packages_upload_ruby) | **Post** /packages/{owner}/{repo}/upload/ruby/ | Create a new Ruby package
[**packages_upload_swift**](PackagesApi.md#packages_upload_swift) | **Post** /packages/{owner}/{repo}/upload/swift/ | Create a new Swift package
[**packages_upload_terraform**](PackagesApi.md#packages_upload_terraform) | **Post** /packages/{owner}/{repo}/upload/terraform/ | Create a new Terraform package
[**packages_upload_vagrant**](PackagesApi.md#packages_upload_vagrant) | **Post** /packages/{owner}/{repo}/upload/vagrant/ | Create a new Vagrant package
[**packages_validate_upload_alpine**](PackagesApi.md#packages_validate_upload_alpine) | **Post** /packages/{owner}/{repo}/validate-upload/alpine/ | Validate parameters for create Alpine package
[**packages_validate_upload_cargo**](PackagesApi.md#packages_validate_upload_cargo) | **Post** /packages/{owner}/{repo}/validate-upload/cargo/ | Validate parameters for create Cargo package
[**packages_validate_upload_cocoapods**](PackagesApi.md#packages_validate_upload_cocoapods) | **Post** /packages/{owner}/{repo}/validate-upload/cocoapods/ | Validate parameters for create CocoaPods package
[**packages_validate_upload_composer**](PackagesApi.md#packages_validate_upload_composer) | **Post** /packages/{owner}/{repo}/validate-upload/composer/ | Validate parameters for create Composer package
[**packages_validate_upload_conan**](PackagesApi.md#packages_validate_upload_conan) | **Post** /packages/{owner}/{repo}/validate-upload/conan/ | Validate parameters for create Conan package
[**packages_validate_upload_conda**](PackagesApi.md#packages_validate_upload_conda) | **Post** /packages/{owner}/{repo}/validate-upload/conda/ | Validate parameters for create Conda package
[**packages_validate_upload_cran**](PackagesApi.md#packages_validate_upload_cran) | **Post** /packages/{owner}/{repo}/validate-upload/cran/ | Validate parameters for create CRAN package
[**packages_validate_upload_dart**](PackagesApi.md#packages_validate_upload_dart) | **Post** /packages/{owner}/{repo}/validate-upload/dart/ | Validate parameters for create Dart package
[**packages_validate_upload_deb**](PackagesApi.md#packages_validate_upload_deb) | **Post** /packages/{owner}/{repo}/validate-upload/deb/ | Validate parameters for create Debian package
[**packages_validate_upload_docker**](PackagesApi.md#packages_validate_upload_docker) | **Post** /packages/{owner}/{repo}/validate-upload/docker/ | Validate parameters for create Docker package
[**packages_validate_upload_go**](PackagesApi.md#packages_validate_upload_go) | **Post** /packages/{owner}/{repo}/validate-upload/go/ | Validate parameters for create Go package
[**packages_validate_upload_helm**](PackagesApi.md#packages_validate_upload_helm) | **Post** /packages/{owner}/{repo}/validate-upload/helm/ | Validate parameters for create Helm package
[**packages_validate_upload_hex**](PackagesApi.md#packages_validate_upload_hex) | **Post** /packages/{owner}/{repo}/validate-upload/hex/ | Validate parameters for create Hex package
[**packages_validate_upload_luarocks**](PackagesApi.md#packages_validate_upload_luarocks) | **Post** /packages/{owner}/{repo}/validate-upload/luarocks/ | Validate parameters for create LuaRocks package
[**packages_validate_upload_maven**](PackagesApi.md#packages_validate_upload_maven) | **Post** /packages/{owner}/{repo}/validate-upload/maven/ | Validate parameters for create Maven package
[**packages_validate_upload_npm**](PackagesApi.md#packages_validate_upload_npm) | **Post** /packages/{owner}/{repo}/validate-upload/npm/ | Validate parameters for create npm package
[**packages_validate_upload_nuget**](PackagesApi.md#packages_validate_upload_nuget) | **Post** /packages/{owner}/{repo}/validate-upload/nuget/ | Validate parameters for create NuGet package
[**packages_validate_upload_p2**](PackagesApi.md#packages_validate_upload_p2) | **Post** /packages/{owner}/{repo}/validate-upload/p2/ | Validate parameters for create P2 package
[**packages_validate_upload_python**](PackagesApi.md#packages_validate_upload_python) | **Post** /packages/{owner}/{repo}/validate-upload/python/ | Validate parameters for create Python package
[**packages_validate_upload_raw**](PackagesApi.md#packages_validate_upload_raw) | **Post** /packages/{owner}/{repo}/validate-upload/raw/ | Validate parameters for create Raw package
[**packages_validate_upload_rpm**](PackagesApi.md#packages_validate_upload_rpm) | **Post** /packages/{owner}/{repo}/validate-upload/rpm/ | Validate parameters for create RedHat package
[**packages_validate_upload_ruby**](PackagesApi.md#packages_validate_upload_ruby) | **Post** /packages/{owner}/{repo}/validate-upload/ruby/ | Validate parameters for create Ruby package
[**packages_validate_upload_swift**](PackagesApi.md#packages_validate_upload_swift) | **Post** /packages/{owner}/{repo}/validate-upload/swift/ | Validate parameters for create Swift package
[**packages_validate_upload_terraform**](PackagesApi.md#packages_validate_upload_terraform) | **Post** /packages/{owner}/{repo}/validate-upload/terraform/ | Validate parameters for create Terraform package
[**packages_validate_upload_vagrant**](PackagesApi.md#packages_validate_upload_vagrant) | **Post** /packages/{owner}/{repo}/validate-upload/vagrant/ | Validate parameters for create Vagrant package


# **packages_copy**
> ::models::PackageCopy packages_copy(ctx, ctx, owner, repo, identifier, optional)
Copy a package to another repository.

Copy a package to another repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**PackageCopyRequest**](PackageCopyRequest.md)|  | 

### Return type

[**::models::PackageCopy**](PackageCopy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_delete**
> packages_delete(ctx, ctx, owner, repo, identifier)
Delete a specific package in a repository.

Delete a specific package in a repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_dependencies**
> ::models::PackageDependencies packages_dependencies(ctx, ctx, owner, repo, identifier)
Get the list of dependencies for a package. Transitive dependencies are included where supported.

Get the list of dependencies for a package. Transitive dependencies are included where supported.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

[**::models::PackageDependencies**](PackageDependencies.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_list**
> Vec<::models::Package> packages_list(ctx, ctx, owner, repo, optional)
Get a list of all packages associated with repository.

Get a list of all packages associated with repository.

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
 **page** | **i32**| A page number within the paginated result set. | 
 **page_size** | **i32**| Number of results to return per page. | 
 **query** | **String**| A search term for querying names, filenames, versions, distributions, architectures, formats or statuses of packages. | [default to ]
 **sort** | **String**| A field for sorting objects in ascending or descending order. | [default to -date]

### Return type

[**Vec<::models::Package>**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_move**
> ::models::PackageMove packages_move(ctx, ctx, owner, repo, identifier, optional)
Move a package to another repository.

Move a package to another repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**PackageMoveRequest**](PackageMoveRequest.md)|  | 

### Return type

[**::models::PackageMove**](PackageMove.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_quarantine**
> ::models::PackageQuarantine packages_quarantine(ctx, ctx, owner, repo, identifier, optional)
Quarantine or release a package.

Quarantine or release a package.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**PackageQuarantineRequest**](PackageQuarantineRequest.md)|  | 

### Return type

[**::models::PackageQuarantine**](PackageQuarantine.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_read**
> ::models::Package packages_read(ctx, ctx, owner, repo, identifier)
Get a specific package in a repository.

Get a specific package in a repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

[**::models::Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_resync**
> ::models::PackageResync packages_resync(ctx, ctx, owner, repo, identifier)
Schedule a package for resynchronisation.

Schedule a package for resynchronisation.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

[**::models::PackageResync**](PackageResync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_scan**
> ::models::Package packages_scan(ctx, ctx, owner, repo, identifier)
Schedule a package for scanning.

Schedule a package for scanning.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

[**::models::Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_status**
> ::models::PackageStatus packages_status(ctx, ctx, owner, repo, identifier)
Get the synchronization status for a package.

Get the synchronization status for a package.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
  **identifier** | **String**|  | 

### Return type

[**::models::PackageStatus**](PackageStatus.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_tag**
> ::models::Package packages_tag(ctx, ctx, owner, repo, identifier, optional)
Add/Replace/Remove tags for a package.

Add/Replace/Remove tags for a package.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
  **identifier** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **identifier** | **String**|  | 
 **data** | [**PackageTagRequest**](PackageTagRequest.md)|  | 

### Return type

[**::models::Package**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_alpine**
> ::models::AlpinePackageUpload packages_upload_alpine(ctx, ctx, owner, repo, optional)
Create a new Alpine package

Create a new Alpine package

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
 **data** | [**AlpinePackageUploadRequest**](AlpinePackageUploadRequest.md)|  | 

### Return type

[**::models::AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_cargo**
> ::models::CargoPackageUpload packages_upload_cargo(ctx, ctx, owner, repo, optional)
Create a new Cargo package

Create a new Cargo package

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
 **data** | [**CargoPackageUploadRequest**](CargoPackageUploadRequest.md)|  | 

### Return type

[**::models::CargoPackageUpload**](CargoPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_cocoapods**
> ::models::CocoapodsPackageUpload packages_upload_cocoapods(ctx, ctx, owner, repo, optional)
Create a new CocoaPods package

Create a new CocoaPods package

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
 **data** | [**CocoapodsPackageUploadRequest**](CocoapodsPackageUploadRequest.md)|  | 

### Return type

[**::models::CocoapodsPackageUpload**](CocoapodsPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_composer**
> ::models::ComposerPackageUpload packages_upload_composer(ctx, ctx, owner, repo, optional)
Create a new Composer package

Create a new Composer package

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
 **data** | [**ComposerPackageUploadRequest**](ComposerPackageUploadRequest.md)|  | 

### Return type

[**::models::ComposerPackageUpload**](ComposerPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_conan**
> ::models::ConanPackageUpload packages_upload_conan(ctx, ctx, owner, repo, optional)
Create a new Conan package

Create a new Conan package

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
 **data** | [**ConanPackageUploadRequest**](ConanPackageUploadRequest.md)|  | 

### Return type

[**::models::ConanPackageUpload**](ConanPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_conda**
> ::models::CondaPackageUpload packages_upload_conda(ctx, ctx, owner, repo, optional)
Create a new Conda package

Create a new Conda package

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
 **data** | [**CondaPackageUploadRequest**](CondaPackageUploadRequest.md)|  | 

### Return type

[**::models::CondaPackageUpload**](CondaPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_cran**
> ::models::CranPackageUpload packages_upload_cran(ctx, ctx, owner, repo, optional)
Create a new CRAN package

Create a new CRAN package

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
 **data** | [**CranPackageUploadRequest**](CranPackageUploadRequest.md)|  | 

### Return type

[**::models::CranPackageUpload**](CranPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_dart**
> ::models::DartPackageUpload packages_upload_dart(ctx, ctx, owner, repo, optional)
Create a new Dart package

Create a new Dart package

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
 **data** | [**DartPackageUploadRequest**](DartPackageUploadRequest.md)|  | 

### Return type

[**::models::DartPackageUpload**](DartPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_deb**
> ::models::DebPackageUpload packages_upload_deb(ctx, ctx, owner, repo, optional)
Create a new Debian package

Create a new Debian package

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
 **data** | [**DebPackageUploadRequest**](DebPackageUploadRequest.md)|  | 

### Return type

[**::models::DebPackageUpload**](DebPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_docker**
> ::models::DockerPackageUpload packages_upload_docker(ctx, ctx, owner, repo, optional)
Create a new Docker package

Create a new Docker package

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
 **data** | [**DockerPackageUploadRequest**](DockerPackageUploadRequest.md)|  | 

### Return type

[**::models::DockerPackageUpload**](DockerPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_go**
> ::models::GoPackageUpload packages_upload_go(ctx, ctx, owner, repo, optional)
Create a new Go package

Create a new Go package

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
 **data** | [**GoPackageUploadRequest**](GoPackageUploadRequest.md)|  | 

### Return type

[**::models::GoPackageUpload**](GoPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_helm**
> ::models::HelmPackageUpload packages_upload_helm(ctx, ctx, owner, repo, optional)
Create a new Helm package

Create a new Helm package

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
 **data** | [**HelmPackageUploadRequest**](HelmPackageUploadRequest.md)|  | 

### Return type

[**::models::HelmPackageUpload**](HelmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_hex**
> ::models::HexPackageUpload packages_upload_hex(ctx, ctx, owner, repo, optional)
Create a new Hex package

Create a new Hex package

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
 **data** | [**HexPackageUploadRequest**](HexPackageUploadRequest.md)|  | 

### Return type

[**::models::HexPackageUpload**](HexPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_luarocks**
> ::models::LuarocksPackageUpload packages_upload_luarocks(ctx, ctx, owner, repo, optional)
Create a new LuaRocks package

Create a new LuaRocks package

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
 **data** | [**LuarocksPackageUploadRequest**](LuarocksPackageUploadRequest.md)|  | 

### Return type

[**::models::LuarocksPackageUpload**](LuarocksPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_maven**
> ::models::MavenPackageUpload packages_upload_maven(ctx, ctx, owner, repo, optional)
Create a new Maven package

Create a new Maven package

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
 **data** | [**MavenPackageUploadRequest**](MavenPackageUploadRequest.md)|  | 

### Return type

[**::models::MavenPackageUpload**](MavenPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_npm**
> ::models::NpmPackageUpload packages_upload_npm(ctx, ctx, owner, repo, optional)
Create a new npm package

Create a new npm package

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
 **data** | [**NpmPackageUploadRequest**](NpmPackageUploadRequest.md)|  | 

### Return type

[**::models::NpmPackageUpload**](NpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_nuget**
> ::models::NugetPackageUpload packages_upload_nuget(ctx, ctx, owner, repo, optional)
Create a new NuGet package

Create a new NuGet package

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
 **data** | [**NugetPackageUploadRequest**](NugetPackageUploadRequest.md)|  | 

### Return type

[**::models::NugetPackageUpload**](NugetPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_p2**
> ::models::P2PackageUpload packages_upload_p2(ctx, ctx, owner, repo, optional)
Create a new P2 package

Create a new P2 package

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
 **data** | [**P2PackageUploadRequest**](P2PackageUploadRequest.md)|  | 

### Return type

[**::models::P2PackageUpload**](P2PackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_python**
> ::models::PythonPackageUpload packages_upload_python(ctx, ctx, owner, repo, optional)
Create a new Python package

Create a new Python package

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
 **data** | [**PythonPackageUploadRequest**](PythonPackageUploadRequest.md)|  | 

### Return type

[**::models::PythonPackageUpload**](PythonPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_raw**
> ::models::RawPackageUpload packages_upload_raw(ctx, ctx, owner, repo, optional)
Create a new Raw package

Create a new Raw package

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
 **data** | [**RawPackageUploadRequest**](RawPackageUploadRequest.md)|  | 

### Return type

[**::models::RawPackageUpload**](RawPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_rpm**
> ::models::RpmPackageUpload packages_upload_rpm(ctx, ctx, owner, repo, optional)
Create a new RedHat package

Create a new RedHat package

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
 **data** | [**RpmPackageUploadRequest**](RpmPackageUploadRequest.md)|  | 

### Return type

[**::models::RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_ruby**
> ::models::RubyPackageUpload packages_upload_ruby(ctx, ctx, owner, repo, optional)
Create a new Ruby package

Create a new Ruby package

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
 **data** | [**RubyPackageUploadRequest**](RubyPackageUploadRequest.md)|  | 

### Return type

[**::models::RubyPackageUpload**](RubyPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_swift**
> ::models::SwiftPackageUpload packages_upload_swift(ctx, ctx, owner, repo, optional)
Create a new Swift package

Create a new Swift package

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
 **data** | [**SwiftPackageUploadRequest**](SwiftPackageUploadRequest.md)|  | 

### Return type

[**::models::SwiftPackageUpload**](SwiftPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_terraform**
> ::models::TerraformPackageUpload packages_upload_terraform(ctx, ctx, owner, repo, optional)
Create a new Terraform package

Create a new Terraform package

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
 **data** | [**TerraformPackageUploadRequest**](TerraformPackageUploadRequest.md)|  | 

### Return type

[**::models::TerraformPackageUpload**](TerraformPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_upload_vagrant**
> ::models::VagrantPackageUpload packages_upload_vagrant(ctx, ctx, owner, repo, optional)
Create a new Vagrant package

Create a new Vagrant package

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
 **data** | [**VagrantPackageUploadRequest**](VagrantPackageUploadRequest.md)|  | 

### Return type

[**::models::VagrantPackageUpload**](VagrantPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_alpine**
> packages_validate_upload_alpine(ctx, ctx, owner, repo, optional)
Validate parameters for create Alpine package

Validate parameters for create Alpine package

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
 **data** | [**AlpinePackageUploadRequest**](AlpinePackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_cargo**
> packages_validate_upload_cargo(ctx, ctx, owner, repo, optional)
Validate parameters for create Cargo package

Validate parameters for create Cargo package

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
 **data** | [**CargoPackageUploadRequest**](CargoPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_cocoapods**
> packages_validate_upload_cocoapods(ctx, ctx, owner, repo, optional)
Validate parameters for create CocoaPods package

Validate parameters for create CocoaPods package

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
 **data** | [**CocoapodsPackageUploadRequest**](CocoapodsPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_composer**
> packages_validate_upload_composer(ctx, ctx, owner, repo, optional)
Validate parameters for create Composer package

Validate parameters for create Composer package

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
 **data** | [**ComposerPackageUploadRequest**](ComposerPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_conan**
> packages_validate_upload_conan(ctx, ctx, owner, repo, optional)
Validate parameters for create Conan package

Validate parameters for create Conan package

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
 **data** | [**ConanPackageUploadRequest**](ConanPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_conda**
> packages_validate_upload_conda(ctx, ctx, owner, repo, optional)
Validate parameters for create Conda package

Validate parameters for create Conda package

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
 **data** | [**CondaPackageUploadRequest**](CondaPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_cran**
> packages_validate_upload_cran(ctx, ctx, owner, repo, optional)
Validate parameters for create CRAN package

Validate parameters for create CRAN package

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
 **data** | [**CranPackageUploadRequest**](CranPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_dart**
> packages_validate_upload_dart(ctx, ctx, owner, repo, optional)
Validate parameters for create Dart package

Validate parameters for create Dart package

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
 **data** | [**DartPackageUploadRequest**](DartPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_deb**
> packages_validate_upload_deb(ctx, ctx, owner, repo, optional)
Validate parameters for create Debian package

Validate parameters for create Debian package

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
 **data** | [**DebPackageUploadRequest**](DebPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_docker**
> packages_validate_upload_docker(ctx, ctx, owner, repo, optional)
Validate parameters for create Docker package

Validate parameters for create Docker package

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
 **data** | [**DockerPackageUploadRequest**](DockerPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_go**
> packages_validate_upload_go(ctx, ctx, owner, repo, optional)
Validate parameters for create Go package

Validate parameters for create Go package

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
 **data** | [**GoPackageUploadRequest**](GoPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_helm**
> packages_validate_upload_helm(ctx, ctx, owner, repo, optional)
Validate parameters for create Helm package

Validate parameters for create Helm package

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
 **data** | [**HelmPackageUploadRequest**](HelmPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_hex**
> packages_validate_upload_hex(ctx, ctx, owner, repo, optional)
Validate parameters for create Hex package

Validate parameters for create Hex package

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
 **data** | [**HexPackageUploadRequest**](HexPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_luarocks**
> packages_validate_upload_luarocks(ctx, ctx, owner, repo, optional)
Validate parameters for create LuaRocks package

Validate parameters for create LuaRocks package

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
 **data** | [**LuarocksPackageUploadRequest**](LuarocksPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_maven**
> packages_validate_upload_maven(ctx, ctx, owner, repo, optional)
Validate parameters for create Maven package

Validate parameters for create Maven package

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
 **data** | [**MavenPackageUploadRequest**](MavenPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_npm**
> packages_validate_upload_npm(ctx, ctx, owner, repo, optional)
Validate parameters for create npm package

Validate parameters for create npm package

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
 **data** | [**NpmPackageUploadRequest**](NpmPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_nuget**
> packages_validate_upload_nuget(ctx, ctx, owner, repo, optional)
Validate parameters for create NuGet package

Validate parameters for create NuGet package

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
 **data** | [**NugetPackageUploadRequest**](NugetPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_p2**
> packages_validate_upload_p2(ctx, ctx, owner, repo, optional)
Validate parameters for create P2 package

Validate parameters for create P2 package

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
 **data** | [**P2PackageUploadRequest**](P2PackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_python**
> packages_validate_upload_python(ctx, ctx, owner, repo, optional)
Validate parameters for create Python package

Validate parameters for create Python package

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
 **data** | [**PythonPackageUploadRequest**](PythonPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_raw**
> packages_validate_upload_raw(ctx, ctx, owner, repo, optional)
Validate parameters for create Raw package

Validate parameters for create Raw package

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
 **data** | [**RawPackageUploadRequest**](RawPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_rpm**
> packages_validate_upload_rpm(ctx, ctx, owner, repo, optional)
Validate parameters for create RedHat package

Validate parameters for create RedHat package

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
 **data** | [**RpmPackageUploadRequest**](RpmPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_ruby**
> packages_validate_upload_ruby(ctx, ctx, owner, repo, optional)
Validate parameters for create Ruby package

Validate parameters for create Ruby package

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
 **data** | [**RubyPackageUploadRequest**](RubyPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_swift**
> packages_validate_upload_swift(ctx, ctx, owner, repo, optional)
Validate parameters for create Swift package

Validate parameters for create Swift package

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
 **data** | [**SwiftPackageUploadRequest**](SwiftPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_terraform**
> packages_validate_upload_terraform(ctx, ctx, owner, repo, optional)
Validate parameters for create Terraform package

Validate parameters for create Terraform package

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
 **data** | [**TerraformPackageUploadRequest**](TerraformPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **packages_validate_upload_vagrant**
> packages_validate_upload_vagrant(ctx, ctx, owner, repo, optional)
Validate parameters for create Vagrant package

Validate parameters for create Vagrant package

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
 **data** | [**VagrantPackageUploadRequest**](VagrantPackageUploadRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

