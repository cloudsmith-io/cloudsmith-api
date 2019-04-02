# UserApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userSelf**](UserApi.md#userSelf) | **GET** /user/self/ | Provide a brief for the current user (if any).
[**userTokenCreate**](UserApi.md#userTokenCreate) | **POST** /user/token/ | Retrieve the API key/token for the authenticated user.


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

// Configure API key authorization: csrf_token
ApiKeyAuth csrf_token = (ApiKeyAuth) defaultClient.getAuthentication("csrf_token");
csrf_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//csrf_token.setApiKeyPrefix("Token");

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

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="userTokenCreate"></a>
# **userTokenCreate**
> UserAuthToken userTokenCreate(data)

Retrieve the API key/token for the authenticated user.

Retrieve the API key/token for the authenticated user.

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

// Configure API key authorization: csrf_token
ApiKeyAuth csrf_token = (ApiKeyAuth) defaultClient.getAuthentication("csrf_token");
csrf_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//csrf_token.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
UserTokenCreate data = new UserTokenCreate(); // UserTokenCreate | 
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
 **data** | [**UserTokenCreate**](UserTokenCreate.md)|  | [optional]

### Return type

[**UserAuthToken**](UserAuthToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic), [csrf_token](../README.md#csrf_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

