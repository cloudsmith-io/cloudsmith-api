# RatesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ratesLimitsList**](RatesApi.md#ratesLimitsList) | **GET** /rates/limits/ | Endpoint to check rate limits for current user.


<a name="ratesLimitsList"></a>
# **ratesLimitsList**
> ResourcesRateCheck ratesLimitsList()

Endpoint to check rate limits for current user.

Endpoint to check rate limits for current user.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.RatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

RatesApi apiInstance = new RatesApi();
try {
    ResourcesRateCheck result = apiInstance.ratesLimitsList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatesApi#ratesLimitsList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResourcesRateCheck**](ResourcesRateCheck.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

