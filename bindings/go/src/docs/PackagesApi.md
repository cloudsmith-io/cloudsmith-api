# \PackagesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PackagesCopy**](PackagesApi.md#PackagesCopy) | **Post** /packages/{owner}/{repo}/{identifier}/copy/ | Copy a package to another repository.
[**PackagesDelete**](PackagesApi.md#PackagesDelete) | **Delete** /packages/{owner}/{repo}/{identifier}/ | Delete a specific package in a repository.
[**PackagesDependencies**](PackagesApi.md#PackagesDependencies) | **Get** /packages/{owner}/{repo}/{identifier}/dependencies/ | Get the direct (non-transitive) dependencies list for a package.
[**PackagesList**](PackagesApi.md#PackagesList) | **Get** /packages/{owner}/{repo}/ | Get a list of all packages associated with repository.
[**PackagesMove**](PackagesApi.md#PackagesMove) | **Post** /packages/{owner}/{repo}/{identifier}/move/ | Move a package to another repository.
[**PackagesRead**](PackagesApi.md#PackagesRead) | **Get** /packages/{owner}/{repo}/{identifier}/ | Get a specific package in a repository.
[**PackagesResync**](PackagesApi.md#PackagesResync) | **Post** /packages/{owner}/{repo}/{identifier}/resync/ | Schedule a package for resynchronisation.
[**PackagesScan**](PackagesApi.md#PackagesScan) | **Post** /packages/{owner}/{repo}/{identifier}/scan/ | Schedule a package for scanning.
[**PackagesStatus**](PackagesApi.md#PackagesStatus) | **Get** /packages/{owner}/{repo}/{identifier}/status/ | Get the synchronisation status for a package.
[**PackagesTag**](PackagesApi.md#PackagesTag) | **Post** /packages/{owner}/{repo}/{identifier}/tag/ | Add/Replace/Remove tags for a package.
[**PackagesUploadAlpine**](PackagesApi.md#PackagesUploadAlpine) | **Post** /packages/{owner}/{repo}/upload/alpine/ | Create a new Alpine package
[**PackagesUploadCargo**](PackagesApi.md#PackagesUploadCargo) | **Post** /packages/{owner}/{repo}/upload/cargo/ | Create a new Cargo package
[**PackagesUploadCocoapods**](PackagesApi.md#PackagesUploadCocoapods) | **Post** /packages/{owner}/{repo}/upload/cocoapods/ | Create a new CocoaPods package
[**PackagesUploadComposer**](PackagesApi.md#PackagesUploadComposer) | **Post** /packages/{owner}/{repo}/upload/composer/ | Create a new Composer package
[**PackagesUploadConan**](PackagesApi.md#PackagesUploadConan) | **Post** /packages/{owner}/{repo}/upload/conan/ | Create a new Conan package
[**PackagesUploadConda**](PackagesApi.md#PackagesUploadConda) | **Post** /packages/{owner}/{repo}/upload/conda/ | Create a new Conda package
[**PackagesUploadCran**](PackagesApi.md#PackagesUploadCran) | **Post** /packages/{owner}/{repo}/upload/cran/ | Create a new CRAN package
[**PackagesUploadDart**](PackagesApi.md#PackagesUploadDart) | **Post** /packages/{owner}/{repo}/upload/dart/ | Create a new Dart package
[**PackagesUploadDeb**](PackagesApi.md#PackagesUploadDeb) | **Post** /packages/{owner}/{repo}/upload/deb/ | Create a new Debian package
[**PackagesUploadDocker**](PackagesApi.md#PackagesUploadDocker) | **Post** /packages/{owner}/{repo}/upload/docker/ | Create a new Docker package
[**PackagesUploadGo**](PackagesApi.md#PackagesUploadGo) | **Post** /packages/{owner}/{repo}/upload/go/ | Create a new Go package
[**PackagesUploadHelm**](PackagesApi.md#PackagesUploadHelm) | **Post** /packages/{owner}/{repo}/upload/helm/ | Create a new Helm package
[**PackagesUploadLuarocks**](PackagesApi.md#PackagesUploadLuarocks) | **Post** /packages/{owner}/{repo}/upload/luarocks/ | Create a new LuaRocks package
[**PackagesUploadMaven**](PackagesApi.md#PackagesUploadMaven) | **Post** /packages/{owner}/{repo}/upload/maven/ | Create a new Maven package
[**PackagesUploadNpm**](PackagesApi.md#PackagesUploadNpm) | **Post** /packages/{owner}/{repo}/upload/npm/ | Create a new npm package
[**PackagesUploadNuget**](PackagesApi.md#PackagesUploadNuget) | **Post** /packages/{owner}/{repo}/upload/nuget/ | Create a new NuGet package
[**PackagesUploadP2**](PackagesApi.md#PackagesUploadP2) | **Post** /packages/{owner}/{repo}/upload/p2/ | Create a new P2 package
[**PackagesUploadPython**](PackagesApi.md#PackagesUploadPython) | **Post** /packages/{owner}/{repo}/upload/python/ | Create a new Python package
[**PackagesUploadRaw**](PackagesApi.md#PackagesUploadRaw) | **Post** /packages/{owner}/{repo}/upload/raw/ | Create a new Raw package
[**PackagesUploadRpm**](PackagesApi.md#PackagesUploadRpm) | **Post** /packages/{owner}/{repo}/upload/rpm/ | Create a new RedHat package
[**PackagesUploadRuby**](PackagesApi.md#PackagesUploadRuby) | **Post** /packages/{owner}/{repo}/upload/ruby/ | Create a new Ruby package
[**PackagesUploadTerraform**](PackagesApi.md#PackagesUploadTerraform) | **Post** /packages/{owner}/{repo}/upload/terraform/ | Create a new Terraform package
[**PackagesUploadVagrant**](PackagesApi.md#PackagesUploadVagrant) | **Post** /packages/{owner}/{repo}/upload/vagrant/ | Create a new Vagrant package
[**PackagesValidateUploadAlpine**](PackagesApi.md#PackagesValidateUploadAlpine) | **Post** /packages/{owner}/{repo}/validate-upload/alpine/ | Validate parameters for create Alpine package
[**PackagesValidateUploadCargo**](PackagesApi.md#PackagesValidateUploadCargo) | **Post** /packages/{owner}/{repo}/validate-upload/cargo/ | Validate parameters for create Cargo package
[**PackagesValidateUploadCocoapods**](PackagesApi.md#PackagesValidateUploadCocoapods) | **Post** /packages/{owner}/{repo}/validate-upload/cocoapods/ | Validate parameters for create CocoaPods package
[**PackagesValidateUploadComposer**](PackagesApi.md#PackagesValidateUploadComposer) | **Post** /packages/{owner}/{repo}/validate-upload/composer/ | Validate parameters for create Composer package
[**PackagesValidateUploadConan**](PackagesApi.md#PackagesValidateUploadConan) | **Post** /packages/{owner}/{repo}/validate-upload/conan/ | Validate parameters for create Conan package
[**PackagesValidateUploadConda**](PackagesApi.md#PackagesValidateUploadConda) | **Post** /packages/{owner}/{repo}/validate-upload/conda/ | Validate parameters for create Conda package
[**PackagesValidateUploadCran**](PackagesApi.md#PackagesValidateUploadCran) | **Post** /packages/{owner}/{repo}/validate-upload/cran/ | Validate parameters for create CRAN package
[**PackagesValidateUploadDart**](PackagesApi.md#PackagesValidateUploadDart) | **Post** /packages/{owner}/{repo}/validate-upload/dart/ | Validate parameters for create Dart package
[**PackagesValidateUploadDeb**](PackagesApi.md#PackagesValidateUploadDeb) | **Post** /packages/{owner}/{repo}/validate-upload/deb/ | Validate parameters for create Debian package
[**PackagesValidateUploadDocker**](PackagesApi.md#PackagesValidateUploadDocker) | **Post** /packages/{owner}/{repo}/validate-upload/docker/ | Validate parameters for create Docker package
[**PackagesValidateUploadGo**](PackagesApi.md#PackagesValidateUploadGo) | **Post** /packages/{owner}/{repo}/validate-upload/go/ | Validate parameters for create Go package
[**PackagesValidateUploadHelm**](PackagesApi.md#PackagesValidateUploadHelm) | **Post** /packages/{owner}/{repo}/validate-upload/helm/ | Validate parameters for create Helm package
[**PackagesValidateUploadLuarocks**](PackagesApi.md#PackagesValidateUploadLuarocks) | **Post** /packages/{owner}/{repo}/validate-upload/luarocks/ | Validate parameters for create LuaRocks package
[**PackagesValidateUploadMaven**](PackagesApi.md#PackagesValidateUploadMaven) | **Post** /packages/{owner}/{repo}/validate-upload/maven/ | Validate parameters for create Maven package
[**PackagesValidateUploadNpm**](PackagesApi.md#PackagesValidateUploadNpm) | **Post** /packages/{owner}/{repo}/validate-upload/npm/ | Validate parameters for create npm package
[**PackagesValidateUploadNuget**](PackagesApi.md#PackagesValidateUploadNuget) | **Post** /packages/{owner}/{repo}/validate-upload/nuget/ | Validate parameters for create NuGet package
[**PackagesValidateUploadP2**](PackagesApi.md#PackagesValidateUploadP2) | **Post** /packages/{owner}/{repo}/validate-upload/p2/ | Validate parameters for create P2 package
[**PackagesValidateUploadPython**](PackagesApi.md#PackagesValidateUploadPython) | **Post** /packages/{owner}/{repo}/validate-upload/python/ | Validate parameters for create Python package
[**PackagesValidateUploadRaw**](PackagesApi.md#PackagesValidateUploadRaw) | **Post** /packages/{owner}/{repo}/validate-upload/raw/ | Validate parameters for create Raw package
[**PackagesValidateUploadRpm**](PackagesApi.md#PackagesValidateUploadRpm) | **Post** /packages/{owner}/{repo}/validate-upload/rpm/ | Validate parameters for create RedHat package
[**PackagesValidateUploadRuby**](PackagesApi.md#PackagesValidateUploadRuby) | **Post** /packages/{owner}/{repo}/validate-upload/ruby/ | Validate parameters for create Ruby package
[**PackagesValidateUploadTerraform**](PackagesApi.md#PackagesValidateUploadTerraform) | **Post** /packages/{owner}/{repo}/validate-upload/terraform/ | Validate parameters for create Terraform package
[**PackagesValidateUploadVagrant**](PackagesApi.md#PackagesValidateUploadVagrant) | **Post** /packages/{owner}/{repo}/validate-upload/vagrant/ | Validate parameters for create Vagrant package


# **PackagesCopy**
> PackageCopy PackagesCopy(ctx, owner, repo, identifier, optional)
Copy a package to another repository.

Copy a package to another repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
  **identifier** | **string**|  | 
 **optional** | ***PackagesApiPackagesCopyOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesCopyOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **data** | [**optional.Interface of PackagesCopy**](PackagesCopy.md)|  | 

### Return type

[**PackageCopy**](PackageCopy.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesDelete**
> PackagesDelete(ctx, owner, repo, identifier)
Delete a specific package in a repository.

Delete a specific package in a repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
  **identifier** | **string**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesDependencies**
> PackageDependencies PackagesDependencies(ctx, owner, repo, identifier)
Get the direct (non-transitive) dependencies list for a package.

Get the direct (non-transitive) dependencies list for a package.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
  **identifier** | **string**|  | 

### Return type

[**PackageDependencies**](PackageDependencies.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesList**
> []ModelPackage PackagesList(ctx, owner, repo, optional)
Get a list of all packages associated with repository.

Get a list of all packages associated with repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesListOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesListOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **page** | **optional.Int32**| A page number within the paginated result set. | 
 **pageSize** | **optional.Int32**| Number of results to return per page. | 
 **query** | **optional.String**| A search term for querying names, filenames, versions, distributions, architectures, formats or statuses of packages. | 
 **sort** | **optional.String**| A field for sorting objects in ascending or descending order. | 

### Return type

[**[]ModelPackage**](Package.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesMove**
> PackageMove PackagesMove(ctx, owner, repo, identifier, optional)
Move a package to another repository.

Move a package to another repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
  **identifier** | **string**|  | 
 **optional** | ***PackagesApiPackagesMoveOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesMoveOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **data** | [**optional.Interface of PackagesMove**](PackagesMove.md)|  | 

### Return type

[**PackageMove**](PackageMove.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesRead**
> ModelPackage PackagesRead(ctx, owner, repo, identifier)
Get a specific package in a repository.

Get a specific package in a repository.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
  **identifier** | **string**|  | 

### Return type

[**ModelPackage**](Package.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesResync**
> ModelPackage PackagesResync(ctx, owner, repo, identifier)
Schedule a package for resynchronisation.

Schedule a package for resynchronisation.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
  **identifier** | **string**|  | 

### Return type

[**ModelPackage**](Package.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesScan**
> ModelPackage PackagesScan(ctx, owner, repo, identifier)
Schedule a package for scanning.

Schedule a package for scanning.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
  **identifier** | **string**|  | 

### Return type

[**ModelPackage**](Package.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesStatus**
> PackageStatus PackagesStatus(ctx, owner, repo, identifier)
Get the synchronisation status for a package.

Get the synchronisation status for a package.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
  **identifier** | **string**|  | 

### Return type

[**PackageStatus**](PackageStatus.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesTag**
> ModelPackage PackagesTag(ctx, owner, repo, identifier, optional)
Add/Replace/Remove tags for a package.

Add/Replace/Remove tags for a package.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
  **identifier** | **string**|  | 
 **optional** | ***PackagesApiPackagesTagOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesTagOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **data** | [**optional.Interface of PackagesTag**](PackagesTag.md)|  | 

### Return type

[**ModelPackage**](Package.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadAlpine**
> AlpinePackageUpload PackagesUploadAlpine(ctx, owner, repo, optional)
Create a new Alpine package

Create a new Alpine package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadAlpineOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadAlpineOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadAlpine**](PackagesUploadAlpine.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadCargo**
> AlpinePackageUpload PackagesUploadCargo(ctx, owner, repo, optional)
Create a new Cargo package

Create a new Cargo package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadCargoOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadCargoOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadCargo**](PackagesUploadCargo.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadCocoapods**
> AlpinePackageUpload PackagesUploadCocoapods(ctx, owner, repo, optional)
Create a new CocoaPods package

Create a new CocoaPods package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadCocoapodsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadCocoapodsOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadCocoapods**](PackagesUploadCocoapods.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadComposer**
> AlpinePackageUpload PackagesUploadComposer(ctx, owner, repo, optional)
Create a new Composer package

Create a new Composer package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadComposerOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadComposerOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadComposer**](PackagesUploadComposer.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadConan**
> ConanPackageUpload PackagesUploadConan(ctx, owner, repo, optional)
Create a new Conan package

Create a new Conan package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadConanOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadConanOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadConan**](PackagesUploadConan.md)|  | 

### Return type

[**ConanPackageUpload**](ConanPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadConda**
> AlpinePackageUpload PackagesUploadConda(ctx, owner, repo, optional)
Create a new Conda package

Create a new Conda package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadCondaOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadCondaOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadConda**](PackagesUploadConda.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadCran**
> AlpinePackageUpload PackagesUploadCran(ctx, owner, repo, optional)
Create a new CRAN package

Create a new CRAN package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadCranOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadCranOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadCran**](PackagesUploadCran.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadDart**
> AlpinePackageUpload PackagesUploadDart(ctx, owner, repo, optional)
Create a new Dart package

Create a new Dart package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadDartOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadDartOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadDart**](PackagesUploadDart.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadDeb**
> AlpinePackageUpload PackagesUploadDeb(ctx, owner, repo, optional)
Create a new Debian package

Create a new Debian package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadDebOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadDebOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadDeb**](PackagesUploadDeb.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadDocker**
> AlpinePackageUpload PackagesUploadDocker(ctx, owner, repo, optional)
Create a new Docker package

Create a new Docker package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadDockerOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadDockerOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadDocker**](PackagesUploadDocker.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadGo**
> AlpinePackageUpload PackagesUploadGo(ctx, owner, repo, optional)
Create a new Go package

Create a new Go package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadGoOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadGoOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadGo**](PackagesUploadGo.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadHelm**
> AlpinePackageUpload PackagesUploadHelm(ctx, owner, repo, optional)
Create a new Helm package

Create a new Helm package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadHelmOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadHelmOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadHelm**](PackagesUploadHelm.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadLuarocks**
> AlpinePackageUpload PackagesUploadLuarocks(ctx, owner, repo, optional)
Create a new LuaRocks package

Create a new LuaRocks package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadLuarocksOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadLuarocksOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadLuarocks**](PackagesUploadLuarocks.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadMaven**
> MavenPackageUpload PackagesUploadMaven(ctx, owner, repo, optional)
Create a new Maven package

Create a new Maven package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadMavenOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadMavenOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadMaven**](PackagesUploadMaven.md)|  | 

### Return type

[**MavenPackageUpload**](MavenPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadNpm**
> AlpinePackageUpload PackagesUploadNpm(ctx, owner, repo, optional)
Create a new npm package

Create a new npm package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadNpmOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadNpmOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadNpm**](PackagesUploadNpm.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadNuget**
> AlpinePackageUpload PackagesUploadNuget(ctx, owner, repo, optional)
Create a new NuGet package

Create a new NuGet package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadNugetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadNugetOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadNuget**](PackagesUploadNuget.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadP2**
> AlpinePackageUpload PackagesUploadP2(ctx, owner, repo, optional)
Create a new P2 package

Create a new P2 package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadP2Opts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadP2Opts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadP2**](PackagesUploadP2.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadPython**
> AlpinePackageUpload PackagesUploadPython(ctx, owner, repo, optional)
Create a new Python package

Create a new Python package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadPythonOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadPythonOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadPython**](PackagesUploadPython.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadRaw**
> RawPackageUpload PackagesUploadRaw(ctx, owner, repo, optional)
Create a new Raw package

Create a new Raw package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadRawOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadRawOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadRaw**](PackagesUploadRaw.md)|  | 

### Return type

[**RawPackageUpload**](RawPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadRpm**
> AlpinePackageUpload PackagesUploadRpm(ctx, owner, repo, optional)
Create a new RedHat package

Create a new RedHat package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadRpmOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadRpmOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadRpm**](PackagesUploadRpm.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadRuby**
> AlpinePackageUpload PackagesUploadRuby(ctx, owner, repo, optional)
Create a new Ruby package

Create a new Ruby package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadRubyOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadRubyOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadRuby**](PackagesUploadRuby.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadTerraform**
> AlpinePackageUpload PackagesUploadTerraform(ctx, owner, repo, optional)
Create a new Terraform package

Create a new Terraform package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadTerraformOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadTerraformOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadTerraform**](PackagesUploadTerraform.md)|  | 

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadVagrant**
> VagrantPackageUpload PackagesUploadVagrant(ctx, owner, repo, optional)
Create a new Vagrant package

Create a new Vagrant package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesUploadVagrantOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesUploadVagrantOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesUploadVagrant**](PackagesUploadVagrant.md)|  | 

### Return type

[**VagrantPackageUpload**](VagrantPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadAlpine**
> PackagesValidateUploadAlpine(ctx, owner, repo, optional)
Validate parameters for create Alpine package

Validate parameters for create Alpine package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadAlpineOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadAlpineOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadAlpine**](PackagesValidateuploadAlpine.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadCargo**
> PackagesValidateUploadCargo(ctx, owner, repo, optional)
Validate parameters for create Cargo package

Validate parameters for create Cargo package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadCargoOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadCargoOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadCargo**](PackagesValidateuploadCargo.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadCocoapods**
> PackagesValidateUploadCocoapods(ctx, owner, repo, optional)
Validate parameters for create CocoaPods package

Validate parameters for create CocoaPods package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadCocoapodsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadCocoapodsOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadCocoapods**](PackagesValidateuploadCocoapods.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadComposer**
> PackagesValidateUploadComposer(ctx, owner, repo, optional)
Validate parameters for create Composer package

Validate parameters for create Composer package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadComposerOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadComposerOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadComposer**](PackagesValidateuploadComposer.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadConan**
> PackagesValidateUploadConan(ctx, owner, repo, optional)
Validate parameters for create Conan package

Validate parameters for create Conan package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadConanOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadConanOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadConan**](PackagesValidateuploadConan.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadConda**
> PackagesValidateUploadConda(ctx, owner, repo, optional)
Validate parameters for create Conda package

Validate parameters for create Conda package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadCondaOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadCondaOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadConda**](PackagesValidateuploadConda.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadCran**
> PackagesValidateUploadCran(ctx, owner, repo, optional)
Validate parameters for create CRAN package

Validate parameters for create CRAN package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadCranOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadCranOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadCran**](PackagesValidateuploadCran.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadDart**
> PackagesValidateUploadDart(ctx, owner, repo, optional)
Validate parameters for create Dart package

Validate parameters for create Dart package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadDartOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadDartOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadDart**](PackagesValidateuploadDart.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadDeb**
> PackagesValidateUploadDeb(ctx, owner, repo, optional)
Validate parameters for create Debian package

Validate parameters for create Debian package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadDebOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadDebOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadDeb**](PackagesValidateuploadDeb.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadDocker**
> PackagesValidateUploadDocker(ctx, owner, repo, optional)
Validate parameters for create Docker package

Validate parameters for create Docker package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadDockerOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadDockerOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadDocker**](PackagesValidateuploadDocker.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadGo**
> PackagesValidateUploadGo(ctx, owner, repo, optional)
Validate parameters for create Go package

Validate parameters for create Go package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadGoOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadGoOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadGo**](PackagesValidateuploadGo.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadHelm**
> PackagesValidateUploadHelm(ctx, owner, repo, optional)
Validate parameters for create Helm package

Validate parameters for create Helm package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadHelmOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadHelmOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadHelm**](PackagesValidateuploadHelm.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadLuarocks**
> PackagesValidateUploadLuarocks(ctx, owner, repo, optional)
Validate parameters for create LuaRocks package

Validate parameters for create LuaRocks package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadLuarocksOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadLuarocksOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadLuarocks**](PackagesValidateuploadLuarocks.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadMaven**
> PackagesValidateUploadMaven(ctx, owner, repo, optional)
Validate parameters for create Maven package

Validate parameters for create Maven package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadMavenOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadMavenOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadMaven**](PackagesValidateuploadMaven.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadNpm**
> PackagesValidateUploadNpm(ctx, owner, repo, optional)
Validate parameters for create npm package

Validate parameters for create npm package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadNpmOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadNpmOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadNpm**](PackagesValidateuploadNpm.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadNuget**
> PackagesValidateUploadNuget(ctx, owner, repo, optional)
Validate parameters for create NuGet package

Validate parameters for create NuGet package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadNugetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadNugetOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadNuget**](PackagesValidateuploadNuget.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadP2**
> PackagesValidateUploadP2(ctx, owner, repo, optional)
Validate parameters for create P2 package

Validate parameters for create P2 package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadP2Opts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadP2Opts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadP2**](PackagesValidateuploadP2.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadPython**
> PackagesValidateUploadPython(ctx, owner, repo, optional)
Validate parameters for create Python package

Validate parameters for create Python package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadPythonOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadPythonOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadPython**](PackagesValidateuploadPython.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadRaw**
> PackagesValidateUploadRaw(ctx, owner, repo, optional)
Validate parameters for create Raw package

Validate parameters for create Raw package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadRawOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadRawOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadRaw**](PackagesValidateuploadRaw.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadRpm**
> PackagesValidateUploadRpm(ctx, owner, repo, optional)
Validate parameters for create RedHat package

Validate parameters for create RedHat package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadRpmOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadRpmOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadRpm**](PackagesValidateuploadRpm.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadRuby**
> PackagesValidateUploadRuby(ctx, owner, repo, optional)
Validate parameters for create Ruby package

Validate parameters for create Ruby package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadRubyOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadRubyOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadRuby**](PackagesValidateuploadRuby.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadTerraform**
> PackagesValidateUploadTerraform(ctx, owner, repo, optional)
Validate parameters for create Terraform package

Validate parameters for create Terraform package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadTerraformOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadTerraformOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadTerraform**](PackagesValidateuploadTerraform.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadVagrant**
> PackagesValidateUploadVagrant(ctx, owner, repo, optional)
Validate parameters for create Vagrant package

Validate parameters for create Vagrant package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
 **optional** | ***PackagesApiPackagesValidateUploadVagrantOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PackagesApiPackagesValidateUploadVagrantOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **data** | [**optional.Interface of PackagesValidateuploadVagrant**](PackagesValidateuploadVagrant.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

