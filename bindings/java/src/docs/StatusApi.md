# StatusApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**statusCheckBasic**](StatusApi.md#statusCheckBasic) | **GET** /status/check/basic/ | Endpoint to check basic API connectivity. |


<a id="statusCheckBasic"></a>
# **statusCheckBasic**
> StatusBasic statusCheckBasic()

Endpoint to check basic API connectivity.

Endpoint to check basic API connectivity.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.StatusApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudsmith.io");

    StatusApi apiInstance = new StatusApi(defaultClient);
    try {
      StatusBasic result = apiInstance.statusCheckBasic();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#statusCheckBasic");
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

[**StatusBasic**](StatusBasic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status check was successful |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

