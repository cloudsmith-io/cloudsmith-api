# \BadgesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BadgesVersionList**](BadgesApi.md#BadgesVersionList) | **Get** /badges/version/{owner}/{repo}/{package_format}/{package_name}/{package_version}/{package_identifiers}/ | Get latest package version for a package or package group.


# **BadgesVersionList**
> BadgesVersionList($owner, $repo, $packageFormat, $packageName, $packageVersion, $packageIdentifiers, $badgeToken, $render)

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
 **render** | **bool**| If true, badge will be rendered | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

