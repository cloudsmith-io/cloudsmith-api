# \BadgesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BadgesVersionList**](BadgesApi.md#BadgesVersionList) | **Get** /badges/version/{owner}/{repo}/{package_format}/{package_name}/{package_version}/{package_identifiers}/ | Get latest package version for a package or package group.


# **BadgesVersionList**
> interface{} BadgesVersionList(ctx, owner, repo, packageFormat, packageName, packageVersion, packageIdentifiers, optional)
Get latest package version for a package or package group.

Get latest package version for a package or package group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**|  | 
  **repo** | **string**|  | 
  **packageFormat** | **string**|  | 
  **packageName** | **string**|  | 
  **packageVersion** | **string**|  | 
  **packageIdentifiers** | **string**|  | 
 **optional** | ***BadgesApiBadgesVersionListOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a BadgesApiBadgesVersionListOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------






 **badgeToken** | **optional.String**| Badge token to authenticate for private packages | 
 **cacheSeconds** | **optional.String**| Override the shields.io badge cacheSeconds value. | 
 **color** | **optional.String**| Override the shields.io badge color value. | 
 **label** | **optional.String**| Override the shields.io badge label value. | 
 **labelColor** | **optional.String**| Override the shields.io badge labelColor value. | 
 **logoColor** | **optional.String**| Override the shields.io badge logoColor value. | 
 **logoWidth** | **optional.String**| Override the shields.io badge logoWidth value. | 
 **render** | **optional.Bool**| If true, badge will be rendered | 
 **shields** | **optional.Bool**| If true, a shields response will be generated | 
 **showLatest** | **optional.Bool**| If true, for latest version badges a &#39;(latest)&#39; suffix is added | 
 **style** | **optional.String**| Override the shields.io badge style value. | 

### Return type

**interface{}**

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

