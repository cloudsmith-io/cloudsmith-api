# RecycleBinApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**recycleBinList**](RecycleBinApi.md#recycleBinList) | **GET** /recycle-bin/{owner}/ | List soft-deleted packages in recycle bin
[**recycleBinRecycleBinAction**](RecycleBinApi.md#recycleBinRecycleBinAction) | **POST** /recycle-bin/{owner}/action/ | 


<a name="recycleBinList"></a>
# **recycleBinList**
> List&lt;RecycleBinPackage&gt; recycleBinList(owner, page, pageSize, repository)

List soft-deleted packages in recycle bin

Retrieve all soft-deleted packages in the workspace. Optionally filter by repository using the &#39;repository&#39; query parameter.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.RecycleBinApi;

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

RecycleBinApi apiInstance = new RecycleBinApi();
String owner = "owner_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
String repository = "repository_example"; // String | Filter packages by repository slug
try {
    List<RecycleBinPackage> result = apiInstance.recycleBinList(owner, page, pageSize, repository);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecycleBinApi#recycleBinList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]
 **repository** | **String**| Filter packages by repository slug | [optional]

### Return type

[**List&lt;RecycleBinPackage&gt;**](RecycleBinPackage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="recycleBinRecycleBinAction"></a>
# **recycleBinRecycleBinAction**
> PackageBulkActionResponse recycleBinRecycleBinAction(owner, data)



Perform actions on soft-deleted packages in the recycle bin. Supported actions: permanently delete (hard delete), restore. Returns a list of successfully actioned packages and any packages that failed with error details. 

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.RecycleBinApi;

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

RecycleBinApi apiInstance = new RecycleBinApi();
String owner = "owner_example"; // String | 
PackageRecycleBin data = new PackageRecycleBin(); // PackageRecycleBin | 
try {
    PackageBulkActionResponse result = apiInstance.recycleBinRecycleBinAction(owner, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecycleBinApi#recycleBinRecycleBinAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **data** | [**PackageRecycleBin**](PackageRecycleBin.md)|  | [optional]

### Return type

[**PackageBulkActionResponse**](PackageBulkActionResponse.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

