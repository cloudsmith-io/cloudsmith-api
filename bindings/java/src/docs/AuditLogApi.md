# AuditLogApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auditLogNamespaceList**](AuditLogApi.md#auditLogNamespaceList) | **GET** /audit-log/{owner}/ | Lists audit log entries for a specific namespace.
[**auditLogRepoList**](AuditLogApi.md#auditLogRepoList) | **GET** /audit-log/{owner}/{repo}/ | Lists audit log entries for a specific repository.


<a name="auditLogNamespaceList"></a>
# **auditLogNamespaceList**
> List&lt;NamespaceAuditLog&gt; auditLogNamespaceList(owner, page, pageSize, query)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AuditLogApi apiInstance = new AuditLogApi();
String owner = "owner_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
String query = "query_example"; // String | A search term for querying events, actors, or timestamps of log records.
try {
    List<NamespaceAuditLog> result = apiInstance.auditLogNamespaceList(owner, page, pageSize, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditLogApi#auditLogNamespaceList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]
 **query** | **String**| A search term for querying events, actors, or timestamps of log records. | [optional]

### Return type

[**List&lt;NamespaceAuditLog&gt;**](NamespaceAuditLog.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auditLogRepoList"></a>
# **auditLogRepoList**
> List&lt;RepositoryAuditLog&gt; auditLogRepoList(owner, repo, page, pageSize, query)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AuditLogApi apiInstance = new AuditLogApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
String query = "query_example"; // String | A search term for querying events, actors, or timestamps of log records.
try {
    List<RepositoryAuditLog> result = apiInstance.auditLogRepoList(owner, repo, page, pageSize, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditLogApi#auditLogRepoList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]
 **query** | **String**| A search term for querying events, actors, or timestamps of log records. | [optional]

### Return type

[**List&lt;RepositoryAuditLog&gt;**](RepositoryAuditLog.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

