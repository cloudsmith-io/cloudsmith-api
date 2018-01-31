# \PackagesApi

All URIs are relative to *https://api-prd.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PackagesDelete**](PackagesApi.md#PackagesDelete) | **Delete** /packages/{owner}/{repo}/{slug}/ | Delete a specific package in a repository.
[**PackagesList**](PackagesApi.md#PackagesList) | **Get** /packages/{owner}/{repo}/ | Views for working with repository packages.
[**PackagesRead**](PackagesApi.md#PackagesRead) | **Get** /packages/{owner}/{repo}/{slug}/ | Get a specific package in a repository.
[**PackagesStatus**](PackagesApi.md#PackagesStatus) | **Get** /packages/{owner}/{repo}/{slug}/status/ | Get the synchronisation status for a package.
[**PackagesUploadDeb**](PackagesApi.md#PackagesUploadDeb) | **Post** /packages/{owner}/{repo}/upload/deb/ | Create a new Debian package
[**PackagesUploadMaven**](PackagesApi.md#PackagesUploadMaven) | **Post** /packages/{owner}/{repo}/upload/maven/ | Create a new Maven package
[**PackagesUploadPython**](PackagesApi.md#PackagesUploadPython) | **Post** /packages/{owner}/{repo}/upload/python/ | Create a new Python package
[**PackagesUploadRaw**](PackagesApi.md#PackagesUploadRaw) | **Post** /packages/{owner}/{repo}/upload/raw/ | Create a new Raw package
[**PackagesUploadRpm**](PackagesApi.md#PackagesUploadRpm) | **Post** /packages/{owner}/{repo}/upload/rpm/ | Create a new RedHat package
[**PackagesUploadRuby**](PackagesApi.md#PackagesUploadRuby) | **Post** /packages/{owner}/{repo}/upload/ruby/ | Create a new Ruby package
[**PackagesUploadVagrant**](PackagesApi.md#PackagesUploadVagrant) | **Post** /packages/{owner}/{repo}/upload/vagrant/ | Create a new Vagrant package
[**PackagesValidateUploadDeb**](PackagesApi.md#PackagesValidateUploadDeb) | **Post** /packages/{owner}/{repo}/validate-upload/deb/ | Validate parameters for create Debian package
[**PackagesValidateUploadMaven**](PackagesApi.md#PackagesValidateUploadMaven) | **Post** /packages/{owner}/{repo}/validate-upload/maven/ | Validate parameters for create Maven package
[**PackagesValidateUploadPython**](PackagesApi.md#PackagesValidateUploadPython) | **Post** /packages/{owner}/{repo}/validate-upload/python/ | Validate parameters for create Python package
[**PackagesValidateUploadRaw**](PackagesApi.md#PackagesValidateUploadRaw) | **Post** /packages/{owner}/{repo}/validate-upload/raw/ | Validate parameters for create Raw package
[**PackagesValidateUploadRpm**](PackagesApi.md#PackagesValidateUploadRpm) | **Post** /packages/{owner}/{repo}/validate-upload/rpm/ | Validate parameters for create RedHat package
[**PackagesValidateUploadRuby**](PackagesApi.md#PackagesValidateUploadRuby) | **Post** /packages/{owner}/{repo}/validate-upload/ruby/ | Validate parameters for create Ruby package
[**PackagesValidateUploadVagrant**](PackagesApi.md#PackagesValidateUploadVagrant) | **Post** /packages/{owner}/{repo}/validate-upload/vagrant/ | Validate parameters for create Vagrant package


# **PackagesDelete**
> PackagesDelete($owner, $repo, $slug)

Delete a specific package in a repository.

Delete a specific package in a repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **slug** | **string**|  | 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesList**
> []RpmPackageUpload PackagesList($owner, $repo, $page, $pageSize)

Views for working with repository packages.

Views for working with repository packages.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **page** | **int32**| A page number within the paginated result set. | [optional] 
 **pageSize** | **int32**| Number of results to return per page. | [optional] 

### Return type

[**[]RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesRead**
> RpmPackageUpload PackagesRead($owner, $repo, $slug)

Get a specific package in a repository.

Get a specific package in a repository.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **slug** | **string**|  | 

### Return type

[**RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesStatus**
> PackageStatus PackagesStatus($owner, $repo, $slug)

Get the synchronisation status for a package.

Get the synchronisation status for a package.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **slug** | **string**|  | 

### Return type

[**PackageStatus**](PackageStatus.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadDeb**
> RpmPackageUpload PackagesUploadDeb($owner, $repo, $data)

Create a new Debian package

Create a new Debian package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesUploadDeb**](PackagesUploadDeb.md)|  | [optional] 

### Return type

[**RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadMaven**
> MavenPackageUpload PackagesUploadMaven($repo, $owner, $data)

Create a new Maven package

Create a new Maven package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | **string**|  | 
 **owner** | **string**|  | 
 **data** | [**PackagesUploadMaven**](PackagesUploadMaven.md)|  | [optional] 

### Return type

[**MavenPackageUpload**](MavenPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadPython**
> RpmPackageUpload PackagesUploadPython($owner, $repo, $data)

Create a new Python package

Create a new Python package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesUploadPython**](PackagesUploadPython.md)|  | [optional] 

### Return type

[**RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadRaw**
> RpmPackageUpload PackagesUploadRaw($owner, $repo, $data)

Create a new Raw package

Create a new Raw package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesUploadRaw**](PackagesUploadRaw.md)|  | [optional] 

### Return type

[**RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadRpm**
> RpmPackageUpload PackagesUploadRpm($owner, $repo, $data)

Create a new RedHat package

Create a new RedHat package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesUploadRpm**](PackagesUploadRpm.md)|  | [optional] 

### Return type

[**RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PackagesUploadRuby**
> RpmPackageUpload PackagesUploadRuby($owner, $repo, $data)

Create a new Ruby package

Create a new Ruby package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **data** | [**PackagesUploadRuby**](PackagesUploadRuby.md)|  | [optional] 

### Return type

[**RpmPackageUpload**](RpmPackageUpload.md)

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
> PackagesValidateUploadMaven($repo, $owner, $data)

Validate parameters for create Maven package

Validate parameters for create Maven package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | **string**|  | 
 **owner** | **string**|  | 
 **data** | [**PackagesValidateuploadMaven**](PackagesValidateuploadMaven.md)|  | [optional] 

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

