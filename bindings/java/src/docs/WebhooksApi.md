# WebhooksApi

All URIs are relative to *https://api.cloudsmith.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhooksCreate**](WebhooksApi.md#webhooksCreate) | **POST** /webhooks/{owner}/{repo}/ | Create a specific webhook in a repository.
[**webhooksDelete**](WebhooksApi.md#webhooksDelete) | **DELETE** /webhooks/{owner}/{repo}/{identifier}/ | Delete a specific webhook in a repository.
[**webhooksList**](WebhooksApi.md#webhooksList) | **GET** /webhooks/{owner}/{repo}/ | Get a list of all webhooks in a repository.
[**webhooksPartialUpdate**](WebhooksApi.md#webhooksPartialUpdate) | **PATCH** /webhooks/{owner}/{repo}/{identifier}/ | Update a specific webhook in a repository.
[**webhooksRead**](WebhooksApi.md#webhooksRead) | **GET** /webhooks/{owner}/{repo}/{identifier}/ | Views for working with repository webhooks.


<a name="webhooksCreate"></a>
# **webhooksCreate**
> RepositoryWebhookResponse webhooksCreate(owner, repo, data)

Create a specific webhook in a repository.

Create a specific webhook in a repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
RepositoryWebhookRequest data = new RepositoryWebhookRequest(); // RepositoryWebhookRequest | 
try {
    RepositoryWebhookResponse result = apiInstance.webhooksCreate(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#webhooksCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**RepositoryWebhookRequest**](RepositoryWebhookRequest.md)|  | [optional]

### Return type

[**RepositoryWebhookResponse**](RepositoryWebhookResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="webhooksDelete"></a>
# **webhooksDelete**
> webhooksDelete(owner, repo, identifier)

Delete a specific webhook in a repository.

Delete a specific webhook in a repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    apiInstance.webhooksDelete(owner, repo, identifier);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#webhooksDelete");
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

<a name="webhooksList"></a>
# **webhooksList**
> List&lt;RepositoryWebhookResponse&gt; webhooksList(owner, repo, page, pageSize)

Get a list of all webhooks in a repository.

Get a list of all webhooks in a repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
try {
    List<RepositoryWebhookResponse> result = apiInstance.webhooksList(owner, repo, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#webhooksList");
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

### Return type

[**List&lt;RepositoryWebhookResponse&gt;**](RepositoryWebhookResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="webhooksPartialUpdate"></a>
# **webhooksPartialUpdate**
> RepositoryWebhookResponse webhooksPartialUpdate(owner, repo, identifier, data)

Update a specific webhook in a repository.

Update a specific webhook in a repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
RepositoryWebhookRequestPatch data = new RepositoryWebhookRequestPatch(); // RepositoryWebhookRequestPatch | 
try {
    RepositoryWebhookResponse result = apiInstance.webhooksPartialUpdate(owner, repo, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#webhooksPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**RepositoryWebhookRequestPatch**](RepositoryWebhookRequestPatch.md)|  | [optional]

### Return type

[**RepositoryWebhookResponse**](RepositoryWebhookResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="webhooksRead"></a>
# **webhooksRead**
> RepositoryWebhookResponse webhooksRead(owner, repo, identifier)

Views for working with repository webhooks.

Views for working with repository webhooks.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    RepositoryWebhookResponse result = apiInstance.webhooksRead(owner, repo, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#webhooksRead");
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

[**RepositoryWebhookResponse**](RepositoryWebhookResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

