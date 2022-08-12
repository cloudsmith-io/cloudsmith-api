# AuditLogApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auditLogList**](AuditLogApi.md#auditLogList) | **GET** /audit-log/{owner}/ | Lists audit log entries for a specific namespace.
[**auditLogList0**](AuditLogApi.md#auditLogList0) | **GET** /audit-log/{owner}/{repo}/ | Lists audit log entries for a specific repository.


<a name="auditLogList"></a>
# **auditLogList**
> List&lt;NamespaceAuditLog&gt; auditLogList(owner, page, pageSize, query)

Lists audit log entries for a specific namespace.

Lists audit log entries for a specific namespace.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.AuditLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

AuditLogApi apiInstance = new AuditLogApi();
String owner = "owner_example"; // String | 
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
String query = "query_example"; // String | A search term for querying events, actors, or timestamps of log records.
try {
    List<NamespaceAuditLog> result = apiInstance.auditLogList(owner, page, pageSize, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditLogApi#auditLogList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **page** | **Integer**| A page number within the paginated result set. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]
 **query** | **String**| A search term for querying events, actors, or timestamps of log records. | [optional]

### Return type

[**List&lt;NamespaceAuditLog&gt;**](NamespaceAuditLog.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="auditLogList0"></a>
# **auditLogList0**
> List&lt;RepositoryAuditLog&gt; auditLogList0(owner, repo, page, pageSize, query)

Lists audit log entries for a specific repository.

Lists audit log entries for a specific repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.AuditLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

AuditLogApi apiInstance = new AuditLogApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
String query = "query_example"; // String | A search term for querying events, actors, or timestamps of log records.
try {
    List<RepositoryAuditLog> result = apiInstance.auditLogList0(owner, repo, page, pageSize, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditLogApi#auditLogList0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **page** | **Integer**| A page number within the paginated result set. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]
 **query** | **String**| A search term for querying events, actors, or timestamps of log records. | [optional]

### Return type

[**List&lt;RepositoryAuditLog&gt;**](RepositoryAuditLog.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

