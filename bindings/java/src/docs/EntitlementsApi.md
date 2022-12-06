# EntitlementsApi

All URIs are relative to *https://api.cloudsmith.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entitlementsCreate**](EntitlementsApi.md#entitlementsCreate) | **POST** /entitlements/{owner}/{repo}/ | Create a specific entitlement in a repository.
[**entitlementsDelete**](EntitlementsApi.md#entitlementsDelete) | **DELETE** /entitlements/{owner}/{repo}/{identifier}/ | Delete a specific entitlement in a repository.
[**entitlementsDisable**](EntitlementsApi.md#entitlementsDisable) | **POST** /entitlements/{owner}/{repo}/{identifier}/disable/ | Disable an entitlement token in a repository.
[**entitlementsEnable**](EntitlementsApi.md#entitlementsEnable) | **POST** /entitlements/{owner}/{repo}/{identifier}/enable/ | Enable an entitlement token in a repository.
[**entitlementsList**](EntitlementsApi.md#entitlementsList) | **GET** /entitlements/{owner}/{repo}/ | Get a list of all entitlements in a repository.
[**entitlementsPartialUpdate**](EntitlementsApi.md#entitlementsPartialUpdate) | **PATCH** /entitlements/{owner}/{repo}/{identifier}/ | Update a specific entitlement in a repository.
[**entitlementsRead**](EntitlementsApi.md#entitlementsRead) | **GET** /entitlements/{owner}/{repo}/{identifier}/ | Get a specific entitlement in a repository.
[**entitlementsRefresh**](EntitlementsApi.md#entitlementsRefresh) | **POST** /entitlements/{owner}/{repo}/{identifier}/refresh/ | Refresh an entitlement token in a repository.
[**entitlementsReset**](EntitlementsApi.md#entitlementsReset) | **POST** /entitlements/{owner}/{repo}/{identifier}/reset/ | Reset the statistics for an entitlement token in a repository.
[**entitlementsSync**](EntitlementsApi.md#entitlementsSync) | **POST** /entitlements/{owner}/{repo}/sync/ | Synchronise tokens from a source repository.


<a name="entitlementsCreate"></a>
# **entitlementsCreate**
> RepositoryTokenResponse entitlementsCreate(owner, repo, data, showTokens)

Create a specific entitlement in a repository.

Create a specific entitlement in a repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.EntitlementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

EntitlementsApi apiInstance = new EntitlementsApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
RepositoryTokenRequest data = new RepositoryTokenRequest(); // RepositoryTokenRequest | 
Boolean showTokens = false; // Boolean | Show entitlement token strings in results
try {
    RepositoryTokenResponse result = apiInstance.entitlementsCreate(owner, repo, data, showTokens);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitlementsApi#entitlementsCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**RepositoryTokenRequest**](RepositoryTokenRequest.md)|  | [optional]
 **showTokens** | **Boolean**| Show entitlement token strings in results | [optional] [default to false]

### Return type

[**RepositoryTokenResponse**](RepositoryTokenResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="entitlementsDelete"></a>
# **entitlementsDelete**
> entitlementsDelete(owner, repo, identifier)

Delete a specific entitlement in a repository.

Delete a specific entitlement in a repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.EntitlementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

EntitlementsApi apiInstance = new EntitlementsApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    apiInstance.entitlementsDelete(owner, repo, identifier);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitlementsApi#entitlementsDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **identifier** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="entitlementsDisable"></a>
# **entitlementsDisable**
> entitlementsDisable(owner, repo, identifier)

Disable an entitlement token in a repository.

Disable an entitlement token in a repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.EntitlementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

EntitlementsApi apiInstance = new EntitlementsApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    apiInstance.entitlementsDisable(owner, repo, identifier);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitlementsApi#entitlementsDisable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **identifier** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="entitlementsEnable"></a>
# **entitlementsEnable**
> entitlementsEnable(owner, repo, identifier)

Enable an entitlement token in a repository.

Enable an entitlement token in a repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.EntitlementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

EntitlementsApi apiInstance = new EntitlementsApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    apiInstance.entitlementsEnable(owner, repo, identifier);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitlementsApi#entitlementsEnable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **identifier** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="entitlementsList"></a>
# **entitlementsList**
> List&lt;RepositoryTokenResponse&gt; entitlementsList(owner, repo, page, pageSize, showTokens, query, active)

Get a list of all entitlements in a repository.

Get a list of all entitlements in a repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.EntitlementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

EntitlementsApi apiInstance = new EntitlementsApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
Boolean showTokens = false; // Boolean | Show entitlement token strings in results
String query = "query_example"; // String | A search term for querying names of entitlements.
Boolean active = false; // Boolean | If true, only include active tokens
try {
    List<RepositoryTokenResponse> result = apiInstance.entitlementsList(owner, repo, page, pageSize, showTokens, query, active);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitlementsApi#entitlementsList");
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
 **showTokens** | **Boolean**| Show entitlement token strings in results | [optional] [default to false]
 **query** | **String**| A search term for querying names of entitlements. | [optional]
 **active** | **Boolean**| If true, only include active tokens | [optional] [default to false]

### Return type

[**List&lt;RepositoryTokenResponse&gt;**](RepositoryTokenResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="entitlementsPartialUpdate"></a>
# **entitlementsPartialUpdate**
> RepositoryTokenResponse entitlementsPartialUpdate(owner, repo, identifier, data, showTokens)

Update a specific entitlement in a repository.

Update a specific entitlement in a repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.EntitlementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

EntitlementsApi apiInstance = new EntitlementsApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
RepositoryTokenRequestPatch data = new RepositoryTokenRequestPatch(); // RepositoryTokenRequestPatch | 
Boolean showTokens = false; // Boolean | Show entitlement token strings in results
try {
    RepositoryTokenResponse result = apiInstance.entitlementsPartialUpdate(owner, repo, identifier, data, showTokens);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitlementsApi#entitlementsPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**RepositoryTokenRequestPatch**](RepositoryTokenRequestPatch.md)|  | [optional]
 **showTokens** | **Boolean**| Show entitlement token strings in results | [optional] [default to false]

### Return type

[**RepositoryTokenResponse**](RepositoryTokenResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="entitlementsRead"></a>
# **entitlementsRead**
> RepositoryTokenResponse entitlementsRead(owner, repo, identifier, fuzzy, showTokens)

Get a specific entitlement in a repository.

Get a specific entitlement in a repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.EntitlementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

EntitlementsApi apiInstance = new EntitlementsApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
Boolean fuzzy = false; // Boolean | If true, entitlement identifiers including name will be fuzzy matched.
Boolean showTokens = false; // Boolean | Show entitlement token strings in results
try {
    RepositoryTokenResponse result = apiInstance.entitlementsRead(owner, repo, identifier, fuzzy, showTokens);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitlementsApi#entitlementsRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **identifier** | **String**|  |
 **fuzzy** | **Boolean**| If true, entitlement identifiers including name will be fuzzy matched. | [optional] [default to false]
 **showTokens** | **Boolean**| Show entitlement token strings in results | [optional] [default to false]

### Return type

[**RepositoryTokenResponse**](RepositoryTokenResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="entitlementsRefresh"></a>
# **entitlementsRefresh**
> RepositoryTokenRefreshResponse entitlementsRefresh(owner, repo, identifier, data, showTokens)

Refresh an entitlement token in a repository.

Refresh an entitlement token in a repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.EntitlementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

EntitlementsApi apiInstance = new EntitlementsApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
RepositoryTokenRefreshRequest data = new RepositoryTokenRefreshRequest(); // RepositoryTokenRefreshRequest | 
Boolean showTokens = false; // Boolean | Show entitlement token strings in results
try {
    RepositoryTokenRefreshResponse result = apiInstance.entitlementsRefresh(owner, repo, identifier, data, showTokens);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitlementsApi#entitlementsRefresh");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**RepositoryTokenRefreshRequest**](RepositoryTokenRefreshRequest.md)|  | [optional]
 **showTokens** | **Boolean**| Show entitlement token strings in results | [optional] [default to false]

### Return type

[**RepositoryTokenRefreshResponse**](RepositoryTokenRefreshResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="entitlementsReset"></a>
# **entitlementsReset**
> entitlementsReset(owner, repo, identifier, showTokens)

Reset the statistics for an entitlement token in a repository.

Reset the statistics for an entitlement token in a repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.EntitlementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

EntitlementsApi apiInstance = new EntitlementsApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
Boolean showTokens = false; // Boolean | Show entitlement token strings in results
try {
    apiInstance.entitlementsReset(owner, repo, identifier, showTokens);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitlementsApi#entitlementsReset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **identifier** | **String**|  |
 **showTokens** | **Boolean**| Show entitlement token strings in results | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="entitlementsSync"></a>
# **entitlementsSync**
> RepositoryTokenSyncResponse entitlementsSync(owner, repo, data, showTokens)

Synchronise tokens from a source repository.

Synchronise tokens from a source repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.EntitlementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

EntitlementsApi apiInstance = new EntitlementsApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
RepositoryTokenSyncRequest data = new RepositoryTokenSyncRequest(); // RepositoryTokenSyncRequest | 
Boolean showTokens = false; // Boolean | Show entitlement token strings in results
try {
    RepositoryTokenSyncResponse result = apiInstance.entitlementsSync(owner, repo, data, showTokens);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitlementsApi#entitlementsSync");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**RepositoryTokenSyncRequest**](RepositoryTokenSyncRequest.md)|  | [optional]
 **showTokens** | **Boolean**| Show entitlement token strings in results | [optional] [default to false]

### Return type

[**RepositoryTokenSyncResponse**](RepositoryTokenSyncResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

