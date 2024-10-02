# BadgesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**badgesVersionList**](BadgesApi.md#badgesVersionList) | **GET** /badges/version/{owner}/{repo}/{package_format}/{package_name}/{package_version}/{package_identifiers}/ | Get latest package version for a package or package group.


<a name="badgesVersionList"></a>
# **badgesVersionList**
> PackageVersionBadge badgesVersionList(owner, repo, packageFormat, packageName, packageVersion, packageIdentifiers, badgeToken, cacheSeconds, color, label, labelColor, logoColor, logoWidth, render, shields, showLatest, style)

Get latest package version for a package or package group.

Get latest package version for a package or package group.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.BadgesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

BadgesApi apiInstance = new BadgesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String packageFormat = "packageFormat_example"; // String | 
String packageName = "packageName_example"; // String | 
String packageVersion = "packageVersion_example"; // String | 
String packageIdentifiers = "packageIdentifiers_example"; // String | 
String badgeToken = ""; // String | Badge token to authenticate for private packages
String cacheSeconds = "300"; // String | Override the shields.io badge cacheSeconds value.
String color = "12577E"; // String | Override the shields.io badge color value.
String label = "cloudsmith"; // String | Override the shields.io badge label value.
String labelColor = "021F2F"; // String | Override the shields.io badge labelColor value.
String logoColor = "45B6EE"; // String | Override the shields.io badge logoColor value.
String logoWidth = "10"; // String | Override the shields.io badge logoWidth value.
Boolean render = false; // Boolean | If true, badge will be rendered
Boolean shields = false; // Boolean | If true, a shields response will be generated
Boolean showLatest = false; // Boolean | If true, for latest version badges a '(latest)' suffix is added
String style = "flat-square"; // String | Override the shields.io badge style value.
try {
    PackageVersionBadge result = apiInstance.badgesVersionList(owner, repo, packageFormat, packageName, packageVersion, packageIdentifiers, badgeToken, cacheSeconds, color, label, labelColor, logoColor, logoWidth, render, shields, showLatest, style);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BadgesApi#badgesVersionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **packageFormat** | **String**|  |
 **packageName** | **String**|  |
 **packageVersion** | **String**|  |
 **packageIdentifiers** | **String**|  |
 **badgeToken** | **String**| Badge token to authenticate for private packages | [optional] [default to ]
 **cacheSeconds** | **String**| Override the shields.io badge cacheSeconds value. | [optional] [default to 300]
 **color** | **String**| Override the shields.io badge color value. | [optional] [default to 12577E]
 **label** | **String**| Override the shields.io badge label value. | [optional] [default to cloudsmith]
 **labelColor** | **String**| Override the shields.io badge labelColor value. | [optional] [default to 021F2F]
 **logoColor** | **String**| Override the shields.io badge logoColor value. | [optional] [default to 45B6EE]
 **logoWidth** | **String**| Override the shields.io badge logoWidth value. | [optional] [default to 10]
 **render** | **Boolean**| If true, badge will be rendered | [optional] [default to false]
 **shields** | **Boolean**| If true, a shields response will be generated | [optional] [default to false]
 **showLatest** | **Boolean**| If true, for latest version badges a &#39;(latest)&#39; suffix is added | [optional] [default to false]
 **style** | **String**| Override the shields.io badge style value. | [optional] [default to flat-square]

### Return type

[**PackageVersionBadge**](PackageVersionBadge.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

