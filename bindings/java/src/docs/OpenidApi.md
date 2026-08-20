# OpenidApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**openidCreate**](OpenidApi.md#openidCreate) | **POST** /openid/{owner}/ | Get a JWT token for a configured service account belonging to the requesting org.


<a name="openidCreate"></a>
# **openidCreate**
> Oidc1 openidCreate(owner, data)

Get a JWT token for a configured service account belonging to the requesting org.

Get a JWT token for a configured service account belonging to the requesting org.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.OpenidApi;

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

OpenidApi apiInstance = new OpenidApi();
String owner = "owner_example"; // String | 
OidcRequest data = new OidcRequest(); // OidcRequest | 
try {
    Oidc1 result = apiInstance.openidCreate(owner, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenidApi#openidCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **data** | [**OidcRequest**](OidcRequest.md)|  | [optional]

### Return type

[**Oidc1**](Oidc1.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

