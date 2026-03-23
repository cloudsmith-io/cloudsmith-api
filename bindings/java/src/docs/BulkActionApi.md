# BulkActionApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkAction**](BulkActionApi.md#bulkAction) | **POST** /bulk-action/{owner}/ | 


<a name="bulkAction"></a>
# **bulkAction**
> PackageBulkActionResponse bulkAction(owner, data)



Perform bulk operations on multiple packages within a repository or across all accessible repositories. If &#39;repository&#39; is provided, actions are limited to that repository. If &#39;repository&#39; is omitted, actions are performed across all repositories the user has access to within the workspace. Returns a list of successfully actioned packages and any packages that failed with error details. 

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.BulkActionApi;

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

BulkActionApi apiInstance = new BulkActionApi();
String owner = "owner_example"; // String | 
PackageBulkAction data = new PackageBulkAction(); // PackageBulkAction | 
try {
    PackageBulkActionResponse result = apiInstance.bulkAction(owner, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkActionApi#bulkAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **data** | [**PackageBulkAction**](PackageBulkAction.md)|  | [optional]

### Return type

[**PackageBulkActionResponse**](PackageBulkActionResponse.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

