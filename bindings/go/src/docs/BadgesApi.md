# \BadgesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BadgesVersionList**](BadgesApi.md#BadgesVersionList) | **Get** /badges/version/{owner}/{repo}/{package_format}/{package_name}/{package_version}/{package_identifiers}/ | Get latest package version for a package or package group.


# **BadgesVersionList**
> BadgesVersionList($owner, $repo, $packageFormat, $packageName, $packageVersion, $packageIdentifiers, $badgeToken, $cacheSeconds, $color, $label, $labelColor, $logoColor, $logoWidth, $render, $shields, $showLatest, $style)

Get latest package version for a package or package group.

Get latest package version for a package or package group.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**|  | 
 **repo** | **string**|  | 
 **packageFormat** | **string**|  | 
 **packageName** | **string**|  | 
 **packageVersion** | **string**|  | 
 **packageIdentifiers** | **string**|  | 
 **badgeToken** | **string**| Badge token to authenticate for private packages | [optional] 
 **cacheSeconds** | **string**| Override the shields.io badge cacheSeconds value. | [optional] 
 **color** | **string**| Override the shields.io badge color value. | [optional] 
 **label** | **string**| Override the shields.io badge label value. | [optional] 
 **labelColor** | **string**| Override the shields.io badge labelColor value. | [optional] 
 **logoColor** | **string**| Override the shields.io badge logoColor value. | [optional] 
 **logoWidth** | **string**| Override the shields.io badge logoWidth value. | [optional] 
 **render** | **bool**| If true, badge will be rendered | [optional] 
 **shields** | **bool**| If true, a shields response will be generated | [optional] 
 **showLatest** | **bool**| If true, for latest version badges a &#39;(latest)&#39; suffix is added | [optional] 
 **style** | **string**| Override the shields.io badge style value. | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

