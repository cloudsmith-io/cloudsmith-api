# UsersApi

All URIs are relative to *https://api.cloudsmith.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersProfileRead**](UsersApi.md#usersProfileRead) | **GET** /users/profile/{slug}/ | Provide a brief for the specified user (if any).


<a name="usersProfileRead"></a>
# **usersProfileRead**
> UserProfileResponse usersProfileRead(slug)

Provide a brief for the specified user (if any).

Provide a brief for the specified user (if any).

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
String slug = "slug_example"; // String | 
try {
    UserProfileResponse result = apiInstance.usersProfileRead(slug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersProfileRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **String**|  |

### Return type

[**UserProfileResponse**](UserProfileResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

