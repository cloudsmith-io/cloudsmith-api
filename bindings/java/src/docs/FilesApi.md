# FilesApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**filesAbort**](FilesApi.md#filesAbort) | **POST** /files/{owner}/{repo}/{identifier}/abort/ | Abort a multipart file upload. |
| [**filesComplete**](FilesApi.md#filesComplete) | **POST** /files/{owner}/{repo}/{identifier}/complete/ | Complete a multipart file upload. |
| [**filesCreate**](FilesApi.md#filesCreate) | **POST** /files/{owner}/{repo}/ | Request URL(s) to upload new package file upload(s) to. |
| [**filesInfo**](FilesApi.md#filesInfo) | **GET** /files/{owner}/{repo}/{identifier}/info/ | Get upload information to perform a multipart file upload. |
| [**filesValidate**](FilesApi.md#filesValidate) | **POST** /files/{owner}/{repo}/validate/ | Validate parameters used for create. |


<a id="filesAbort"></a>
# **filesAbort**
> filesAbort(owner, repo, identifier, data)

Abort a multipart file upload.

Abort a multipart file upload.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    PackageFileUploadRequest data = new PackageFileUploadRequest(); // PackageFileUploadRequest | 
    try {
      apiInstance.filesAbort(owner, repo, identifier, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#filesAbort");
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
| **owner** | **String**|  | |
| **repo** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**PackageFileUploadRequest**](PackageFileUploadRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The multipart upload was aborted successfully. |  -  |
| **400** | The multipart upload could not be aborted. |  -  |
| **404** | Namespace (owner), repository or upload file not found |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="filesComplete"></a>
# **filesComplete**
> PackageFileUpload filesComplete(owner, repo, identifier, data)

Complete a multipart file upload.

Complete a multipart file upload.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    PackageFileUploadRequest data = new PackageFileUploadRequest(); // PackageFileUploadRequest | 
    try {
      PackageFileUpload result = apiInstance.filesComplete(owner, repo, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#filesComplete");
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
| **owner** | **String**|  | |
| **repo** | **String**|  | |
| **identifier** | **String**|  | |
| **data** | [**PackageFileUploadRequest**](PackageFileUploadRequest.md)|  | [optional] |

### Return type

[**PackageFileUpload**](PackageFileUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The multipart upload was completed successfully. |  -  |
| **400** | The multipart upload could not be completed. |  -  |
| **404** | Namespace (owner), repository or upload file not found |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="filesCreate"></a>
# **filesCreate**
> PackageFileUpload filesCreate(owner, repo, data)

Request URL(s) to upload new package file upload(s) to.

Request URL(s) to upload new package file upload(s) to.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    PackageFileUploadRequest data = new PackageFileUploadRequest(); // PackageFileUploadRequest | 
    try {
      PackageFileUpload result = apiInstance.filesCreate(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#filesCreate");
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
| **owner** | **String**|  | |
| **repo** | **String**|  | |
| **data** | [**PackageFileUploadRequest**](PackageFileUploadRequest.md)|  | [optional] |

### Return type

[**PackageFileUpload**](PackageFileUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The upload request was accepted |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="filesInfo"></a>
# **filesInfo**
> PackageFilePartsUpload filesInfo(owner, repo, identifier, filename, partNumber)

Get upload information to perform a multipart file upload.

Get upload information to perform a multipart file upload.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String filename = "filename_example"; // String | The filename of the file being uploaded
    java.math.BigInteger partNumber = new java.math.BigInteger(); // java.math.BigInteger | The part number to be uploaded next
    try {
      PackageFilePartsUpload result = apiInstance.filesInfo(owner, repo, identifier, filename, partNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#filesInfo");
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
| **owner** | **String**|  | |
| **repo** | **String**|  | |
| **identifier** | **String**|  | |
| **filename** | **String**| The filename of the file being uploaded | |
| **partNumber** | **java.math.BigInteger**| The part number to be uploaded next | [optional] |

### Return type

[**PackageFilePartsUpload**](PackageFilePartsUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Information for multipart uploaded retrieved successfully. |  -  |
| **400** | The provided upload file was not a multipart upload. |  -  |
| **404** | Namespace (owner), repository or upload file not found |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="filesValidate"></a>
# **filesValidate**
> filesValidate(owner, repo, data)

Validate parameters used for create.

Validate parameters used for create.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    PackageFileUploadRequest data = new PackageFileUploadRequest(); // PackageFileUploadRequest | 
    try {
      apiInstance.filesValidate(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#filesValidate");
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
| **owner** | **String**|  | |
| **repo** | **String**|  | |
| **data** | [**PackageFileUploadRequest**](PackageFileUploadRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

