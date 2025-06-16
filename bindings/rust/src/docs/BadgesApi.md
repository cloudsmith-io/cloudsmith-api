# \BadgesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**badges_version_list**](BadgesApi.md#badges_version_list) | **Get** /badges/version/{owner}/{repo}/{package_format}/{package_name}/{package_version}/{package_identifiers}/ | Get latest package version for a package or package group.


# **badges_version_list**
> ::models::PackageVersionBadge badges_version_list(ctx, ctx, owner, repo, package_format, package_name, package_version, package_identifiers, optional)
Get latest package version for a package or package group.

Get latest package version for a package or package group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **owner** | **String**|  | 
  **repo** | **String**|  | 
  **package_format** | **String**|  | 
  **package_name** | **String**|  | 
  **package_version** | **String**|  | 
  **package_identifiers** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  | 
 **repo** | **String**|  | 
 **package_format** | **String**|  | 
 **package_name** | **String**|  | 
 **package_version** | **String**|  | 
 **package_identifiers** | **String**|  | 
 **badge_token** | **String**| Badge token to authenticate for private packages | [default to ]
 **cache_seconds** | **String**| Override the shields.io badge cacheSeconds value. | [default to 300]
 **color** | **String**| Override the shields.io badge color value. | [default to 12577E]
 **label** | **String**| Override the shields.io badge label value. | [default to cloudsmith]
 **label_color** | **String**| Override the shields.io badge labelColor value. | [default to 021F2F]
 **logo_color** | **String**| Override the shields.io badge logoColor value. | [default to 45B6EE]
 **logo_width** | **String**| Override the shields.io badge logoWidth value. | [default to 10]
 **render** | **bool**| If true, badge will be rendered | [default to false]
 **shields** | **bool**| If true, a shields response will be generated | [default to false]
 **show_latest** | **bool**| If true, for latest version badges a &#39;(latest)&#39; suffix is added | [default to false]
 **style** | **String**| Override the shields.io badge style value. | [default to flat-square]

### Return type

[**::models::PackageVersionBadge**](PackageVersionBadge.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

