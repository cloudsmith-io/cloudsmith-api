# UserApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userSelf**](UserApi.md#userSelf) | **GET** /user/self/ | Provide a brief for the current user (if any).
[**userTokenCreate**](UserApi.md#userTokenCreate) | **POST** /user/token/ | Create or retrieve API token for a user.
[**userTokensCreate**](UserApi.md#userTokensCreate) | **POST** /user/tokens/ | Create an API key for the user that is currently authenticated.
[**userTokensList**](UserApi.md#userTokensList) | **GET** /user/tokens/ | Retrieve the API key assigned to the user that is currently authenticated.
[**userTokensRefresh**](UserApi.md#userTokensRefresh) | **PUT** /user/tokens/{slug_perm}/refresh/ | Refresh the specified API key for the user that is currently authenticated.


<a name="userSelf"></a>
# **userSelf**
> UserBrief userSelf()

Provide a brief for the current user (if any).

Provide a brief for the current user (if any).

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.UserApi;

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

UserApi apiInstance = new UserApi();
try {
    UserBrief result = apiInstance.userSelf();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userSelf");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserBrief**](UserBrief.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userTokenCreate"></a>
# **userTokenCreate**
> UserAuthToken userTokenCreate(data)

Create or retrieve API token for a user.

Handles both: - Users authenticating with basic credentials to get a token - Two-factor authentication flow

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
UserAuthTokenRequest data = new UserAuthTokenRequest(); // UserAuthTokenRequest | 
try {
    UserAuthToken result = apiInstance.userTokenCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userTokenCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**UserAuthTokenRequest**](UserAuthTokenRequest.md)|  | [optional]

### Return type

[**UserAuthToken**](UserAuthToken.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userTokensCreate"></a>
# **userTokensCreate**
> UserAuthenticationToken userTokensCreate()

Create an API key for the user that is currently authenticated.

Create an API key for the user that is currently authenticated.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.UserApi;

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

UserApi apiInstance = new UserApi();
try {
    UserAuthenticationToken result = apiInstance.userTokensCreate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userTokensCreate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserAuthenticationToken**](UserAuthenticationToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userTokensList"></a>
# **userTokensList**
> InlineResponse2001 userTokensList(page, pageSize)

Retrieve the API key assigned to the user that is currently authenticated.

Retrieve the API key assigned to the user that is currently authenticated.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.UserApi;

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

UserApi apiInstance = new UserApi();
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
try {
    InlineResponse2001 result = apiInstance.userTokensList(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userTokensList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userTokensRefresh"></a>
# **userTokensRefresh**
> UserAuthenticationToken userTokensRefresh(slugPerm)

Refresh the specified API key for the user that is currently authenticated.

Refresh the specified API key for the user that is currently authenticated.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.UserApi;

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

UserApi apiInstance = new UserApi();
String slugPerm = "slugPerm_example"; // String | 
try {
    UserAuthenticationToken result = apiInstance.userTokensRefresh(slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userTokensRefresh");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slugPerm** | **String**|  |

### Return type

[**UserAuthenticationToken**](UserAuthenticationToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

