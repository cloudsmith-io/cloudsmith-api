# WebhooksApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**webhooksCreate**](WebhooksApi.md#webhooksCreate) | **POST** /webhooks/{owner}/{repo}/ | Create a specific webhook in a repository. |
| [**webhooksDelete**](WebhooksApi.md#webhooksDelete) | **DELETE** /webhooks/{owner}/{repo}/{identifier}/ | Delete a specific webhook in a repository. |
| [**webhooksList**](WebhooksApi.md#webhooksList) | **GET** /webhooks/{owner}/{repo}/ | Get a list of all webhooks in a repository. |
| [**webhooksPartialUpdate**](WebhooksApi.md#webhooksPartialUpdate) | **PATCH** /webhooks/{owner}/{repo}/{identifier}/ | Update a specific webhook in a repository. |
| [**webhooksRead**](WebhooksApi.md#webhooksRead) | **GET** /webhooks/{owner}/{repo}/{identifier}/ | Views for working with repository webhooks. |


<a id="webhooksCreate"></a>
# **webhooksCreate**
> RepositoryWebhook webhooksCreate(owner, repo, data)

Create a specific webhook in a repository.

Create a specific webhook in a repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.WebhooksApi;

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

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    RepositoryWebhookRequest data = new RepositoryWebhookRequest(); // RepositoryWebhookRequest | 
    try {
      RepositoryWebhook result = apiInstance.webhooksCreate(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhooksCreate");
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
| **data** | [**RepositoryWebhookRequest**](RepositoryWebhookRequest.md)|  | [optional] |

### Return type

[**RepositoryWebhook**](RepositoryWebhook.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created the specified webhook |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="webhooksDelete"></a>
# **webhooksDelete**
> webhooksDelete(owner, repo, identifier)

Delete a specific webhook in a repository.

Delete a specific webhook in a repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.WebhooksApi;

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

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      apiInstance.webhooksDelete(owner, repo, identifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhooksDelete");
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
| **204** | Deleted the specified webhook successfully. |  -  |
| **400** | The webhook cannot be deleted. |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="webhooksList"></a>
# **webhooksList**
> List&lt;RepositoryWebhook&gt; webhooksList(owner, repo, page, pageSize)

Get a list of all webhooks in a repository.

Get a list of all webhooks in a repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.WebhooksApi;

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

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    try {
      List<RepositoryWebhook> result = apiInstance.webhooksList(owner, repo, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhooksList");
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

### Return type

[**List&lt;RepositoryWebhook&gt;**](RepositoryWebhook.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the list of webhooks |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="webhooksPartialUpdate"></a>
# **webhooksPartialUpdate**
> RepositoryWebhook webhooksPartialUpdate(owner, repo, identifier, data)

Update a specific webhook in a repository.

Update a specific webhook in a repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.WebhooksApi;

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

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    RepositoryWebhookRequestPatch data = new RepositoryWebhookRequestPatch(); // RepositoryWebhookRequestPatch | 
    try {
      RepositoryWebhook result = apiInstance.webhooksPartialUpdate(owner, repo, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhooksPartialUpdate");
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
| **data** | [**RepositoryWebhookRequestPatch**](RepositoryWebhookRequestPatch.md)|  | [optional] |

### Return type

[**RepositoryWebhook**](RepositoryWebhook.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated the specified webhook |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="webhooksRead"></a>
# **webhooksRead**
> RepositoryWebhook webhooksRead(owner, repo, identifier)

Views for working with repository webhooks.

Views for working with repository webhooks.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.WebhooksApi;

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

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      RepositoryWebhook result = apiInstance.webhooksRead(owner, repo, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhooksRead");
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

[**RepositoryWebhook**](RepositoryWebhook.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

