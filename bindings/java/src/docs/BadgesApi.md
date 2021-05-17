# BadgesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**badgesVersionList**](BadgesApi.md#badgesVersionList) | **GET** /badges/version/{owner}/{repo}/{package_format}/{package_name}/{package_version}/{package_identifiers}/ | Get latest package version for a package or package group.


<a name="badgesVersionList"></a>
# **badgesVersionList**
> badgesVersionList(owner, repo, packageFormat, packageName, packageVersion, packageIdentifiers, badgeToken, cacheSeconds, color, label, labelColor, logoColor, logoWidth, render, shields, showLatest, style)

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

BadgesApi apiInstance = new BadgesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String packageFormat = "packageFormat_example"; // String | 
String packageName = "packageName_example"; // String | 
String packageVersion = "packageVersion_example"; // String | 
String packageIdentifiers = "packageIdentifiers_example"; // String | 
String badgeToken = "badgeToken_example"; // String | Badge token to authenticate for private packages
String cacheSeconds = "cacheSeconds_example"; // String | Override the shields.io badge cacheSeconds value.
String color = "color_example"; // String | Override the shields.io badge color value.
String label = "label_example"; // String | Override the shields.io badge label value.
String labelColor = "labelColor_example"; // String | Override the shields.io badge labelColor value.
String logoColor = "logoColor_example"; // String | Override the shields.io badge logoColor value.
String logoWidth = "logoWidth_example"; // String | Override the shields.io badge logoWidth value.
Boolean render = true; // Boolean | If true, badge will be rendered
Boolean shields = true; // Boolean | If true, a shields response will be generated
Boolean showLatest = true; // Boolean | If true, for latest version badges a '(latest)' suffix is added
String style = "style_example"; // String | Override the shields.io badge style value.
try {
    apiInstance.badgesVersionList(owner, repo, packageFormat, packageName, packageVersion, packageIdentifiers, badgeToken, cacheSeconds, color, label, labelColor, logoColor, logoWidth, render, shields, showLatest, style);
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
 **badgeToken** | **String**| Badge token to authenticate for private packages | [optional]
 **cacheSeconds** | **String**| Override the shields.io badge cacheSeconds value. | [optional]
 **color** | **String**| Override the shields.io badge color value. | [optional]
 **label** | **String**| Override the shields.io badge label value. | [optional]
 **labelColor** | **String**| Override the shields.io badge labelColor value. | [optional]
 **logoColor** | **String**| Override the shields.io badge logoColor value. | [optional]
 **logoWidth** | **String**| Override the shields.io badge logoWidth value. | [optional]
 **render** | **Boolean**| If true, badge will be rendered | [optional]
 **shields** | **Boolean**| If true, a shields response will be generated | [optional]
 **showLatest** | **Boolean**| If true, for latest version badges a &#39;(latest)&#39; suffix is added | [optional]
 **style** | **String**| Override the shields.io badge style value. | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

