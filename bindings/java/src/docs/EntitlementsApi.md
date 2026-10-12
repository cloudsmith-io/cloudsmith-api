# EntitlementsApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**entitlementsCreate**](EntitlementsApi.md#entitlementsCreate) | **POST** /entitlements/{owner}/{repo}/ | Create a specific entitlement in a repository. |
| [**entitlementsDelete**](EntitlementsApi.md#entitlementsDelete) | **DELETE** /entitlements/{owner}/{repo}/{identifier}/ | Delete a specific entitlement in a repository. |
| [**entitlementsDisable**](EntitlementsApi.md#entitlementsDisable) | **POST** /entitlements/{owner}/{repo}/{identifier}/disable/ | Disable an entitlement token in a repository. |
| [**entitlementsEnable**](EntitlementsApi.md#entitlementsEnable) | **POST** /entitlements/{owner}/{repo}/{identifier}/enable/ | Enable an entitlement token in a repository. |
| [**entitlementsList**](EntitlementsApi.md#entitlementsList) | **GET** /entitlements/{owner}/{repo}/ | Get a list of all entitlements in a repository. |
| [**entitlementsPartialUpdate**](EntitlementsApi.md#entitlementsPartialUpdate) | **PATCH** /entitlements/{owner}/{repo}/{identifier}/ | Update a specific entitlement in a repository. |
| [**entitlementsRead**](EntitlementsApi.md#entitlementsRead) | **GET** /entitlements/{owner}/{repo}/{identifier}/ | Get a specific entitlement in a repository. |
| [**entitlementsRefresh**](EntitlementsApi.md#entitlementsRefresh) | **POST** /entitlements/{owner}/{repo}/{identifier}/refresh/ | Refresh an entitlement token in a repository. |
| [**entitlementsReset**](EntitlementsApi.md#entitlementsReset) | **POST** /entitlements/{owner}/{repo}/{identifier}/reset/ | Reset the statistics for an entitlement token in a repository. |
| [**entitlementsSync**](EntitlementsApi.md#entitlementsSync) | **POST** /entitlements/{owner}/{repo}/sync/ | Synchronise tokens from a source repository. |
| [**entitlementsTogglePrivateBroadcasts**](EntitlementsApi.md#entitlementsTogglePrivateBroadcasts) | **POST** /entitlements/{owner}/{repo}/{identifier}/toggle-private-broadcasts/ | Set private broadcast access for an entitlement token in a repository. |


<a id="entitlementsCreate"></a>
# **entitlementsCreate**
> RepositoryToken entitlementsCreate(owner, repo, showTokens, data)

Create a specific entitlement in a repository.

Create a specific entitlement in a repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.EntitlementsApi;

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

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    Boolean showTokens = false; // Boolean | Show entitlement token strings in results
    RepositoryTokenRequest data = new RepositoryTokenRequest(); // RepositoryTokenRequest | 
    try {
      RepositoryToken result = apiInstance.entitlementsCreate(owner, repo, showTokens, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#entitlementsCreate");
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
| **showTokens** | **Boolean**| Show entitlement token strings in results | [optional] [default to false] |
| **data** | [**RepositoryTokenRequest**](RepositoryTokenRequest.md)|  | [optional] |

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created the specified entitlement |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="entitlementsDelete"></a>
# **entitlementsDelete**
> entitlementsDelete(owner, repo, identifier)

Delete a specific entitlement in a repository.

Delete a specific entitlement in a repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.EntitlementsApi;

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

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      apiInstance.entitlementsDelete(owner, repo, identifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#entitlementsDelete");
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

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Soft-deleted the specified entitlement token successfully. |  -  |
| **400** | The entitlement cannot be deleted. |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="entitlementsDisable"></a>
# **entitlementsDisable**
> entitlementsDisable(owner, repo, identifier)

Disable an entitlement token in a repository.

Disable an entitlement token in a repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.EntitlementsApi;

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

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      apiInstance.entitlementsDisable(owner, repo, identifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#entitlementsDisable");
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

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The entitlement token has been disabled. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="entitlementsEnable"></a>
# **entitlementsEnable**
> entitlementsEnable(owner, repo, identifier)

Enable an entitlement token in a repository.

Enable an entitlement token in a repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.EntitlementsApi;

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

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      apiInstance.entitlementsEnable(owner, repo, identifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#entitlementsEnable");
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

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The entitlement token has been enabled. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="entitlementsList"></a>
# **entitlementsList**
> List&lt;RepositoryToken&gt; entitlementsList(owner, repo, page, pageSize, showTokens, query, active, excludeOtherUserTokens, sort)

Get a list of all entitlements in a repository.

Get a list of all entitlements in a repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.EntitlementsApi;

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

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    Boolean showTokens = false; // Boolean | Show entitlement token strings in results
    String query = "query_example"; // String | A search term for querying names of entitlements.
    Boolean active = false; // Boolean | If true, only include active tokens
    Boolean excludeOtherUserTokens = false; // Boolean | If true, exclude user tokens that belong to other users
    String sort = "name"; // String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name.
    try {
      List<RepositoryToken> result = apiInstance.entitlementsList(owner, repo, page, pageSize, showTokens, query, active, excludeOtherUserTokens, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#entitlementsList");
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
| **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional] |
| **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional] |
| **showTokens** | **Boolean**| Show entitlement token strings in results | [optional] [default to false] |
| **query** | **String**| A search term for querying names of entitlements. | [optional] |
| **active** | **Boolean**| If true, only include active tokens | [optional] [default to false] |
| **excludeOtherUserTokens** | **Boolean**| If true, exclude user tokens that belong to other users | [optional] [default to false] |
| **sort** | **String**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name. | [optional] [default to name] |

### Return type

[**List&lt;RepositoryToken&gt;**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the list of entitlement tokens |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="entitlementsPartialUpdate"></a>
# **entitlementsPartialUpdate**
> RepositoryToken entitlementsPartialUpdate(owner, repo, identifier, showTokens, data)

Update a specific entitlement in a repository.

Update a specific entitlement in a repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.EntitlementsApi;

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

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    Boolean showTokens = false; // Boolean | Show entitlement token strings in results
    RepositoryTokenRequestPatch data = new RepositoryTokenRequestPatch(); // RepositoryTokenRequestPatch | 
    try {
      RepositoryToken result = apiInstance.entitlementsPartialUpdate(owner, repo, identifier, showTokens, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#entitlementsPartialUpdate");
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
| **showTokens** | **Boolean**| Show entitlement token strings in results | [optional] [default to false] |
| **data** | [**RepositoryTokenRequestPatch**](RepositoryTokenRequestPatch.md)|  | [optional] |

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated the specified entitlement |  -  |
| **400** | The entitlement cannot be edited. |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="entitlementsRead"></a>
# **entitlementsRead**
> RepositoryToken entitlementsRead(owner, repo, identifier, fuzzy, showTokens)

Get a specific entitlement in a repository.

Get a specific entitlement in a repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.EntitlementsApi;

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

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    Boolean fuzzy = false; // Boolean | If true, entitlement identifiers including name will be fuzzy matched.
    Boolean showTokens = false; // Boolean | Show entitlement token strings in results
    try {
      RepositoryToken result = apiInstance.entitlementsRead(owner, repo, identifier, fuzzy, showTokens);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#entitlementsRead");
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
| **fuzzy** | **Boolean**| If true, entitlement identifiers including name will be fuzzy matched. | [optional] [default to false] |
| **showTokens** | **Boolean**| Show entitlement token strings in results | [optional] [default to false] |

### Return type

[**RepositoryToken**](RepositoryToken.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the specified entitlement |  -  |
| **400** | Couldn&#39;t retrieve the specified token because the request contains an error. |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="entitlementsRefresh"></a>
# **entitlementsRefresh**
> RepositoryTokenRefresh entitlementsRefresh(owner, repo, identifier, showTokens, data)

Refresh an entitlement token in a repository.

Refresh an entitlement token in a repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.EntitlementsApi;

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

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    Boolean showTokens = false; // Boolean | Show entitlement token strings in results
    RepositoryTokenRefreshRequest data = new RepositoryTokenRefreshRequest(); // RepositoryTokenRefreshRequest | 
    try {
      RepositoryTokenRefresh result = apiInstance.entitlementsRefresh(owner, repo, identifier, showTokens, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#entitlementsRefresh");
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
| **showTokens** | **Boolean**| Show entitlement token strings in results | [optional] [default to false] |
| **data** | [**RepositoryTokenRefreshRequest**](RepositoryTokenRefreshRequest.md)|  | [optional] |

### Return type

[**RepositoryTokenRefresh**](RepositoryTokenRefresh.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The entitlement token has been refreshed. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="entitlementsReset"></a>
# **entitlementsReset**
> entitlementsReset(owner, repo, identifier, showTokens)

Reset the statistics for an entitlement token in a repository.

Reset the statistics for an entitlement token in a repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.EntitlementsApi;

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

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    Boolean showTokens = false; // Boolean | Show entitlement token strings in results
    try {
      apiInstance.entitlementsReset(owner, repo, identifier, showTokens);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#entitlementsReset");
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
| **showTokens** | **Boolean**| Show entitlement token strings in results | [optional] [default to false] |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The entitlement token statistics have been reset. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="entitlementsSync"></a>
# **entitlementsSync**
> RepositoryTokenSync entitlementsSync(owner, repo, showTokens, data)

Synchronise tokens from a source repository.

Synchronise tokens from a source repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.EntitlementsApi;

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

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    Boolean showTokens = false; // Boolean | Show entitlement token strings in results
    RepositoryTokenSyncRequest data = new RepositoryTokenSyncRequest(); // RepositoryTokenSyncRequest | 
    try {
      RepositoryTokenSync result = apiInstance.entitlementsSync(owner, repo, showTokens, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#entitlementsSync");
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
| **showTokens** | **Boolean**| Show entitlement token strings in results | [optional] [default to false] |
| **data** | [**RepositoryTokenSyncRequest**](RepositoryTokenSyncRequest.md)|  | [optional] |

### Return type

[**RepositoryTokenSync**](RepositoryTokenSync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The tokens have been synchronised from the source repository. |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="entitlementsTogglePrivateBroadcasts"></a>
# **entitlementsTogglePrivateBroadcasts**
> entitlementsTogglePrivateBroadcasts(owner, repo, identifier, data)

Set private broadcast access for an entitlement token in a repository.

Set private broadcast access for an entitlement token in a repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.EntitlementsApi;

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

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    RepositoryTokenPrivateBroadcastsRequest data = new RepositoryTokenPrivateBroadcastsRequest(); // RepositoryTokenPrivateBroadcastsRequest | 
    try {
      apiInstance.entitlementsTogglePrivateBroadcasts(owner, repo, identifier, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#entitlementsTogglePrivateBroadcasts");
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
| **data** | [**RepositoryTokenPrivateBroadcastsRequest**](RepositoryTokenPrivateBroadcastsRequest.md)|  | [optional] |

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
| **200** | Private broadcasts access has been updated for the entitlement token. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

