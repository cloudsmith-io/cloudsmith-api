# UsersApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usersProfileRead**](UsersApi.md#usersProfileRead) | **GET** /users/profile/{slug}/ | Provide a brief for the specified user (if any). |


<a id="usersProfileRead"></a>
# **usersProfileRead**
> UserProfile usersProfileRead(slug)

Provide a brief for the specified user (if any).

Provide a brief for the specified user (if any).

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      UserProfile result = apiInstance.usersProfileRead(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersProfileRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **slug** | **String**|  | |

### Return type

[**UserProfile**](UserProfile.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved details for the specified user (or current user, if none was specified) |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

