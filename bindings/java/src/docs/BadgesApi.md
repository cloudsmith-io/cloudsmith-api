# BadgesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**badgesVersionList**](BadgesApi.md#badgesVersionList) | **GET** /badges/version/{owner}/{repo}/{package_format}/{package_name}/{package_version}/{package_identifiers}/ | Get latest package version for a package or package group.


<a name="badgesVersionList"></a>
# **badgesVersionList**
> badgesVersionList(owner, repo, packageFormat, packageName, packageVersion, packageIdentifiers, badgeToken, render)

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

// Configure API key authorization: csrf_token
ApiKeyAuth csrf_token = (ApiKeyAuth) defaultClient.getAuthentication("csrf_token");
csrf_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//csrf_token.setApiKeyPrefix("Token");

BadgesApi apiInstance = new BadgesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String packageFormat = "packageFormat_example"; // String | 
String packageName = "packageName_example"; // String | 
String packageVersion = "packageVersion_example"; // String | 
String packageIdentifiers = "packageIdentifiers_example"; // String | 
String badgeToken = "badgeToken_example"; // String | Badge token to authenticate for private packages
Boolean render = true; // Boolean | If true, badge will be rendered
try {
    apiInstance.badgesVersionList(owner, repo, packageFormat, packageName, packageVersion, packageIdentifiers, badgeToken, render);
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
 **render** | **Boolean**| If true, badge will be rendered | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

