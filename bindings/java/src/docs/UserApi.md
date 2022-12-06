# UserApi

All URIs are relative to *https://api.cloudsmith.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userSelf**](UserApi.md#userSelf) | **GET** /user/self/ | Provide a brief for the current user (if any).
[**userTokenCreate**](UserApi.md#userTokenCreate) | **POST** /user/token/ | Retrieve the API key/token for the authenticated user.


<a name="userSelf"></a>
# **userSelf**
> UserBriefResponse userSelf()

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

UserApi apiInstance = new UserApi();
try {
    UserBriefResponse result = apiInstance.userSelf();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userSelf");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserBriefResponse**](UserBriefResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userTokenCreate"></a>
# **userTokenCreate**
> UserAuthTokenResponse userTokenCreate(data)

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

UserApi apiInstance = new UserApi();
UserAuthTokenRequest data = new UserAuthTokenRequest(); // UserAuthTokenRequest | 
try {
    UserAuthTokenResponse result = apiInstance.userTokenCreate(data);
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

[**UserAuthTokenResponse**](UserAuthTokenResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

