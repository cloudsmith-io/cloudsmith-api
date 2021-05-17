# StatusApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statusCheckBasic**](StatusApi.md#statusCheckBasic) | **GET** /status/check/basic/ | Endpoint to check basic API connectivity.


<a name="statusCheckBasic"></a>
# **statusCheckBasic**
> StatusBasic statusCheckBasic()

Endpoint to check basic API connectivity.

Endpoint to check basic API connectivity.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.apis.StatusApi;


StatusApi apiInstance = new StatusApi();
try {
    StatusBasic result = apiInstance.statusCheckBasic();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatusApi#statusCheckBasic");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StatusBasic**](StatusBasic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

