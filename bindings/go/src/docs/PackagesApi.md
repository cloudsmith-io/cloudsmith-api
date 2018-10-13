# \PackagesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PackagesCopy**](PackagesApi.md#PackagesCopy) | **Post** /packages/{owner}/{repo}/{identifier}/copy/ | Copy a package to another repository.
[**PackagesDelete**](PackagesApi.md#PackagesDelete) | **Delete** /packages/{owner}/{repo}/{identifier}/ | Delete a specific package in a repository.
[**PackagesList**](PackagesApi.md#PackagesList) | **Get** /packages/{owner}/{repo}/ | Views for working with repository packages.
[**PackagesMove**](PackagesApi.md#PackagesMove) | **Post** /packages/{owner}/{repo}/{identifier}/move/ | Move a package to another repository.
[**PackagesRead**](PackagesApi.md#PackagesRead) | **Get** /packages/{owner}/{repo}/{identifier}/ | Get a specific package in a repository.
[**PackagesResync**](PackagesApi.md#PackagesResync) | **Post** /packages/{owner}/{repo}/{identifier}/resync/ | Schedule a package for resynchronisation.
[**PackagesStatus**](PackagesApi.md#PackagesStatus) | **Get** /packages/{owner}/{repo}/{identifier}/status/ | Get the synchronisation status for a package.
[**PackagesUploadAlpine**](PackagesApi.md#PackagesUploadAlpine) | **Post** /packages/{owner}/{repo}/upload/alpine/ | Create a new Alpine package
[**PackagesUploadComposer**](PackagesApi.md#PackagesUploadComposer) | **Post** /packages/{owner}/{repo}/upload/composer/ | Create a new Composer package
[**PackagesUploadDeb**](PackagesApi.md#PackagesUploadDeb) | **Post** /packages/{owner}/{repo}/upload/deb/ | Create a new Debian package
[**PackagesUploadMaven**](PackagesApi.md#PackagesUploadMaven) | **Post** /packages/{owner}/{repo}/upload/maven/ | Create a new Maven package
[**PackagesUploadNpm**](PackagesApi.md#PackagesUploadNpm) | **Post** /packages/{owner}/{repo}/upload/npm/ | Create a new Npm package
[**PackagesUploadPython**](PackagesApi.md#PackagesUploadPython) | **Post** /packages/{owner}/{repo}/upload/python/ | Create a new Python package
[**PackagesUploadRaw**](PackagesApi.md#PackagesUploadRaw) | **Post** /packages/{owner}/{repo}/upload/raw/ | Create a new Raw package
[**PackagesUploadRpm**](PackagesApi.md#PackagesUploadRpm) | **Post** /packages/{owner}/{repo}/upload/rpm/ | Create a new RedHat package
[**PackagesUploadRuby**](PackagesApi.md#PackagesUploadRuby) | **Post** /packages/{owner}/{repo}/upload/ruby/ | Create a new Ruby package
[**PackagesUploadVagrant**](PackagesApi.md#PackagesUploadVagrant) | **Post** /packages/{owner}/{repo}/upload/vagrant/ | Create a new Vagrant package
[**PackagesValidateUploadAlpine**](PackagesApi.md#PackagesValidateUploadAlpine) | **Post** /packages/{owner}/{repo}/validate-upload/alpine/ | Validate parameters for create Alpine package
[**PackagesValidateUploadComposer**](PackagesApi.md#PackagesValidateUploadComposer) | **Post** /packages/{owner}/{repo}/validate-upload/composer/ | Validate parameters for create Composer package
[**PackagesValidateUploadDeb**](PackagesApi.md#PackagesValidateUploadDeb) | **Post** /packages/{owner}/{repo}/validate-upload/deb/ | Validate parameters for create Debian package
[**PackagesValidateUploadMaven**](PackagesApi.md#PackagesValidateUploadMaven) | **Post** /packages/{owner}/{repo}/validate-upload/maven/ | Validate parameters for create Maven package
[**PackagesValidateUploadNpm**](PackagesApi.md#PackagesValidateUploadNpm) | **Post** /packages/{owner}/{repo}/validate-upload/npm/ | Validate parameters for create Npm package
[**PackagesValidateUploadPython**](PackagesApi.md#PackagesValidateUploadPython) | **Post** /packages/{owner}/{repo}/validate-upload/python/ | Validate parameters for create Python package
[**PackagesValidateUploadRaw**](PackagesApi.md#PackagesValidateUploadRaw) | **Post** /packages/{owner}/{repo}/validate-upload/raw/ | Validate parameters for create Raw package
[**PackagesValidateUploadRpm**](PackagesApi.md#PackagesValidateUploadRpm) | **Post** /packages/{owner}/{repo}/validate-upload/rpm/ | Validate parameters for create RedHat package
[**PackagesValidateUploadRuby**](PackagesApi.md#PackagesValidateUploadRuby) | **Post** /packages/{owner}/{repo}/validate-upload/ruby/ | Validate parameters for create Ruby package
[**PackagesValidateUploadVagrant**](PackagesApi.md#PackagesValidateUploadVagrant) | **Post** /packages/{owner}/{repo}/validate-upload/vagrant/ | Validate parameters for create Vagrant package


# **PackagesCopy**
> PackageCopy PackagesCopy($owner, $repo, $identifier, $data)

Copy a package to another repository.

Copy a package to another repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **identifier** | **string**|  | 
 **data** | [**PackagesCopy**](PackagesCopy.md)|  | [optional] 

### Return type

[**PackageCopy**](PackageCopy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesDelete**
> PackagesDelete($owner, $repo, $identifier)

Delete a specific package in a repository.

Delete a specific package in a repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **identifier** | **string**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesList**
> []ModelPackage PackagesList($owner, $repo, $page, $pageSize, $query)

Views for working with repository packages.

Views for working with repository packages.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 
 **query** | **string**| A search term for querying names, filenames, versions, distributions, architectures, formats or statuses of packages. | [optional] 

### Return type

[**[]ModelPackage**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesMove**
> PackageMove PackagesMove($owner, $repo, $identifier, $data)

Move a package to another repository.

Move a package to another repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **identifier** | **string**|  | 
 **data** | [**PackagesMove**](PackagesMove.md)|  | [optional] 

### Return type

[**PackageMove**](PackageMove.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesRead**
> ModelPackage PackagesRead($owner, $repo, $identifier)

Get a specific package in a repository.

Get a specific package in a repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **identifier** | **string**|  | 

### Return type

[**ModelPackage**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesResync**
> ModelPackage PackagesResync($owner, $repo, $identifier)

Schedule a package for resynchronisation.

Schedule a package for resynchronisation.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **identifier** | **string**|  | 

### Return type

[**ModelPackage**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesStatus**
> PackageStatus PackagesStatus($owner, $repo, $identifier)

Get the synchronisation status for a package.

Get the synchronisation status for a package.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **identifier** | **string**|  | 

### Return type

[**PackageStatus**](PackageStatus.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadAlpine**
> ModelPackage PackagesUploadAlpine($owner, $repo, $data)

Create a new Alpine package

Create a new Alpine package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesUploadAlpine**](PackagesUploadAlpine.md)|  | [optional] 

### Return type

[**ModelPackage**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadComposer**
> ModelPackage PackagesUploadComposer($owner, $repo, $data)

Create a new Composer package

Create a new Composer package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesUploadComposer**](PackagesUploadComposer.md)|  | [optional] 

### Return type

[**ModelPackage**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadDeb**
> ModelPackage PackagesUploadDeb($owner, $repo, $data)

Create a new Debian package

Create a new Debian package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesUploadDeb**](PackagesUploadDeb.md)|  | [optional] 

### Return type

[**ModelPackage**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadMaven**
> MavenPackageUpload PackagesUploadMaven($owner, $repo, $data)

Create a new Maven package

Create a new Maven package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesUploadMaven**](PackagesUploadMaven.md)|  | [optional] 

### Return type

[**MavenPackageUpload**](MavenPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadNpm**
> ModelPackage PackagesUploadNpm($owner, $repo, $data)

Create a new Npm package

Create a new Npm package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesUploadNpm**](PackagesUploadNpm.md)|  | [optional] 

### Return type

[**ModelPackage**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadPython**
> ModelPackage PackagesUploadPython($owner, $repo, $data)

Create a new Python package

Create a new Python package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesUploadPython**](PackagesUploadPython.md)|  | [optional] 

### Return type

[**ModelPackage**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadRaw**
> RawPackageUpload PackagesUploadRaw($owner, $repo, $data)

Create a new Raw package

Create a new Raw package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesUploadRaw**](PackagesUploadRaw.md)|  | [optional] 

### Return type

[**RawPackageUpload**](RawPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadRpm**
> ModelPackage PackagesUploadRpm($owner, $repo, $data)

Create a new RedHat package

Create a new RedHat package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesUploadRpm**](PackagesUploadRpm.md)|  | [optional] 

### Return type

[**ModelPackage**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadRuby**
> ModelPackage PackagesUploadRuby($owner, $repo, $data)

Create a new Ruby package

Create a new Ruby package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesUploadRuby**](PackagesUploadRuby.md)|  | [optional] 

### Return type

[**ModelPackage**](Package.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadVagrant**
> VagrantPackageUpload PackagesUploadVagrant($owner, $repo, $data)

Create a new Vagrant package

Create a new Vagrant package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesUploadVagrant**](PackagesUploadVagrant.md)|  | [optional] 

### Return type

[**VagrantPackageUpload**](VagrantPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadAlpine**
> PackagesValidateUploadAlpine($owner, $repo, $data)

Validate parameters for create Alpine package

Validate parameters for create Alpine package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesValidateuploadAlpine**](PackagesValidateuploadAlpine.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadComposer**
> PackagesValidateUploadComposer($owner, $repo, $data)

Validate parameters for create Composer package

Validate parameters for create Composer package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesValidateuploadComposer**](PackagesValidateuploadComposer.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadDeb**
> PackagesValidateUploadDeb($owner, $repo, $data)

Validate parameters for create Debian package

Validate parameters for create Debian package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesValidateuploadDeb**](PackagesValidateuploadDeb.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadMaven**
> PackagesValidateUploadMaven($owner, $repo, $data)

Validate parameters for create Maven package

Validate parameters for create Maven package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesValidateuploadMaven**](PackagesValidateuploadMaven.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadNpm**
> PackagesValidateUploadNpm($owner, $repo, $data)

Validate parameters for create Npm package

Validate parameters for create Npm package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesValidateuploadNpm**](PackagesValidateuploadNpm.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadPython**
> PackagesValidateUploadPython($owner, $repo, $data)

Validate parameters for create Python package

Validate parameters for create Python package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesValidateuploadPython**](PackagesValidateuploadPython.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadRaw**
> PackagesValidateUploadRaw($owner, $repo, $data)

Validate parameters for create Raw package

Validate parameters for create Raw package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesValidateuploadRaw**](PackagesValidateuploadRaw.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadRpm**
> PackagesValidateUploadRpm($owner, $repo, $data)

Validate parameters for create RedHat package

Validate parameters for create RedHat package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesValidateuploadRpm**](PackagesValidateuploadRpm.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadRuby**
> PackagesValidateUploadRuby($owner, $repo, $data)

Validate parameters for create Ruby package

Validate parameters for create Ruby package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesValidateuploadRuby**](PackagesValidateuploadRuby.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesValidateUploadVagrant**
> PackagesValidateUploadVagrant($owner, $repo, $data)

Validate parameters for create Vagrant package

Validate parameters for create Vagrant package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesValidateuploadVagrant**](PackagesValidateuploadVagrant.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

