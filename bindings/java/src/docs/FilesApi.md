# FilesApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filesAbort**](FilesApi.md#filesAbort) | **POST** /files/{owner}/{repo}/{identifier}/abort/ | Abort a multipart file upload.
[**filesComplete**](FilesApi.md#filesComplete) | **POST** /files/{owner}/{repo}/{identifier}/complete/ | Complete a multipart file upload.
[**filesCreate**](FilesApi.md#filesCreate) | **POST** /files/{owner}/{repo}/ | Request URL(s) to upload new package file upload(s) to.
[**filesInfo**](FilesApi.md#filesInfo) | **GET** /files/{owner}/{repo}/{identifier}/info/ | Get upload information to perform a multipart file upload.
[**filesValidate**](FilesApi.md#filesValidate) | **POST** /files/{owner}/{repo}/validate/ | Validate parameters used for create.


<a name="filesAbort"></a>
# **filesAbort**
> filesAbort(owner, repo, identifier, data)

Abort a multipart file upload.

Abort a multipart file upload.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

FilesApi apiInstance = new FilesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
PackageFileUploadRequest data = new PackageFileUploadRequest(); // PackageFileUploadRequest | 
try {
    apiInstance.filesAbort(owner, repo, identifier, data);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#filesAbort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**PackageFileUploadRequest**](PackageFileUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesComplete"></a>
# **filesComplete**
> PackageFileUpload filesComplete(owner, repo, identifier, data)

Complete a multipart file upload.

Complete a multipart file upload.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

FilesApi apiInstance = new FilesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
PackageFileUploadRequest data = new PackageFileUploadRequest(); // PackageFileUploadRequest | 
try {
    PackageFileUpload result = apiInstance.filesComplete(owner, repo, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#filesComplete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**PackageFileUploadRequest**](PackageFileUploadRequest.md)|  | [optional]

### Return type

[**PackageFileUpload**](PackageFileUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesCreate"></a>
# **filesCreate**
> PackageFileUpload filesCreate(owner, repo, data)

Request URL(s) to upload new package file upload(s) to.

Request URL(s) to upload new package file upload(s) to.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

FilesApi apiInstance = new FilesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackageFileUploadRequest data = new PackageFileUploadRequest(); // PackageFileUploadRequest | 
try {
    PackageFileUpload result = apiInstance.filesCreate(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#filesCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackageFileUploadRequest**](PackageFileUploadRequest.md)|  | [optional]

### Return type

[**PackageFileUpload**](PackageFileUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesInfo"></a>
# **filesInfo**
> PackageFilePartsUpload filesInfo(owner, repo, identifier, filename, partNumber)

Get upload information to perform a multipart file upload.

Get upload information to perform a multipart file upload.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

FilesApi apiInstance = new FilesApi();
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
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **identifier** | **String**|  |
 **filename** | **String**| The filename of the file being uploaded |
 **partNumber** | **java.math.BigInteger**| The part number to be uploaded next | [optional]

### Return type

[**PackageFilePartsUpload**](PackageFilePartsUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesValidate"></a>
# **filesValidate**
> filesValidate(owner, repo, data)

Validate parameters used for create.

Validate parameters used for create.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

FilesApi apiInstance = new FilesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackageFileUploadRequest data = new PackageFileUploadRequest(); // PackageFileUploadRequest | 
try {
    apiInstance.filesValidate(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#filesValidate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackageFileUploadRequest**](PackageFileUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

