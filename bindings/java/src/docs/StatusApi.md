# StatusApi

All URIs are relative to *https://api.cloudsmith.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statusCheckBasic**](StatusApi.md#statusCheckBasic) | **GET** /status/check/basic/ | Endpoint to check basic API connectivity.


<a name="statusCheckBasic"></a>
# **statusCheckBasic**
> StatusBasicResponse statusCheckBasic()

Endpoint to check basic API connectivity.

Endpoint to check basic API connectivity.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.apis.StatusApi;


StatusApi apiInstance = new StatusApi();
try {
    StatusBasicResponse result = apiInstance.statusCheckBasic();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatusApi#statusCheckBasic");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StatusBasicResponse**](StatusBasicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

