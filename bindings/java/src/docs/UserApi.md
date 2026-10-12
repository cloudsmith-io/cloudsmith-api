# UserApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userSelf**](UserApi.md#userSelf) | **GET** /user/self/ | Provide a brief for the current user (if any). |
| [**userTokenCreate**](UserApi.md#userTokenCreate) | **POST** /user/token/ | Create or retrieve API token for a user. |
| [**userTokensCreate**](UserApi.md#userTokensCreate) | **POST** /user/tokens/ | Create an API key for the user that is currently authenticated. |
| [**userTokensList**](UserApi.md#userTokensList) | **GET** /user/tokens/ | Retrieve the API key assigned to the user that is currently authenticated. |
| [**userTokensRefresh**](UserApi.md#userTokensRefresh) | **PUT** /user/tokens/{slug_perm}/refresh/ | Refresh the specified API key for the user that is currently authenticated. |


<a id="userSelf"></a>
# **userSelf**
> UserBrief userSelf()

Provide a brief for the current user (if any).

Provide a brief for the current user (if any).

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.UserApi;

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

    UserApi apiInstance = new UserApi(defaultClient);
    try {
      UserBrief result = apiInstance.userSelf();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#userSelf");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserBrief**](UserBrief.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved brief for the current user |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="userTokenCreate"></a>
# **userTokenCreate**
> UserAuthToken userTokenCreate(data)

Create or retrieve API token for a user.

Handles both: - Users authenticating with basic credentials to get a token - Two-factor authentication flow

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");
    
    // Configure HTTP basic authorization: basic
    HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
    basic.setUsername("YOUR USERNAME");
    basic.setPassword("YOUR PASSWORD");

    UserApi apiInstance = new UserApi(defaultClient);
    UserAuthTokenRequest data = new UserAuthTokenRequest(); // UserAuthTokenRequest | 
    try {
      UserAuthToken result = apiInstance.userTokenCreate(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#userTokenCreate");
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
| **data** | [**UserAuthTokenRequest**](UserAuthTokenRequest.md)|  | [optional] |

### Return type

[**UserAuthToken**](UserAuthToken.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Retrieved/created user API token/key. |  -  |
| **403** | Locked out. |  -  |
| **422** | Failed to authenticate. |  -  |
| **400** | Request could not be processed (see detail). |  -  |

<a id="userTokensCreate"></a>
# **userTokensCreate**
> UserAuthenticationToken userTokensCreate()

Create an API key for the user that is currently authenticated.

Create an API key for the user that is currently authenticated.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.UserApi;

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

    UserApi apiInstance = new UserApi(defaultClient);
    try {
      UserAuthenticationToken result = apiInstance.userTokensCreate();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#userTokensCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserAuthenticationToken**](UserAuthenticationToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created an API key for the user that is currently authenticated. |  -  |
| **400** | User has already created an API key. |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="userTokensList"></a>
# **userTokensList**
> UserTokensList200Response userTokensList(page, pageSize)

Retrieve the API key assigned to the user that is currently authenticated.

Retrieve the API key assigned to the user that is currently authenticated.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.UserApi;

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

    UserApi apiInstance = new UserApi(defaultClient);
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      UserTokensList200Response result = apiInstance.userTokensList(page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#userTokensList");
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
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |

### Return type

[**UserTokensList200Response**](UserTokensList200Response.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the API key for the user that is currently authenticated. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="userTokensRefresh"></a>
# **userTokensRefresh**
> UserAuthenticationToken userTokensRefresh(slugPerm)

Refresh the specified API key for the user that is currently authenticated.

Refresh the specified API key for the user that is currently authenticated.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.UserApi;

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

    UserApi apiInstance = new UserApi(defaultClient);
    String slugPerm = "slugPerm_example"; // String | 
    try {
      UserAuthenticationToken result = apiInstance.userTokensRefresh(slugPerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#userTokensRefresh");
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
| **slugPerm** | **String**|  | |

### Return type

[**UserAuthenticationToken**](UserAuthenticationToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully refreshed the API key. |  -  |
| **404** | The specified API key cannot be found. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

