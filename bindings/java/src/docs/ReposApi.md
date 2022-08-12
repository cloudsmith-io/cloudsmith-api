# ReposApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reposAllList**](ReposApi.md#reposAllList) | **GET** /repos/ | Get a list of all repositories associated with current user.
[**reposCreate**](ReposApi.md#reposCreate) | **POST** /repos/{owner}/ | Create a new repository in a given namespace.
[**reposDelete**](ReposApi.md#reposDelete) | **DELETE** /repos/{owner}/{identifier}/ | Delete a repository in a given namespace.
[**reposGpgCreate**](ReposApi.md#reposGpgCreate) | **POST** /repos/{owner}/{identifier}/gpg/ | Set the active GPG key for the Repository.
[**reposGpgList**](ReposApi.md#reposGpgList) | **GET** /repos/{owner}/{identifier}/gpg/ | Retrieve the active GPG key for the Repository.
[**reposGpgRegenerate**](ReposApi.md#reposGpgRegenerate) | **POST** /repos/{owner}/{identifier}/gpg/regenerate/ | Regenerate GPG Key for the Repository.
[**reposList**](ReposApi.md#reposList) | **GET** /repos/{owner}/ | Get a list of all repositories within a namespace.
[**reposPartialUpdate**](ReposApi.md#reposPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/ | Update details about a repository in a given namespace.
[**reposPrivilegesDelete**](ReposApi.md#reposPrivilegesDelete) | **DELETE** /repos/{owner}/{identifier}/privileges | Remove the specified repository privileges.
[**reposPrivilegesList**](ReposApi.md#reposPrivilegesList) | **GET** /repos/{owner}/{identifier}/privileges | List all explicity created privileges for the repository.
[**reposPrivilegesPartialUpdate**](ReposApi.md#reposPrivilegesPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/privileges | Update the specified repository privileges.
[**reposPrivilegesUpdate**](ReposApi.md#reposPrivilegesUpdate) | **PUT** /repos/{owner}/{identifier}/privileges | Replace all existing repository privileges with those specified.
[**reposRead**](ReposApi.md#reposRead) | **GET** /repos/{owner}/{identifier}/ | Get a specific repository.
[**reposRsaCreate**](ReposApi.md#reposRsaCreate) | **POST** /repos/{owner}/{identifier}/rsa/ | Set the active RSA key for the Repository.
[**reposRsaList**](ReposApi.md#reposRsaList) | **GET** /repos/{owner}/{identifier}/rsa/ | Retrieve the active RSA key for the Repository.
[**reposRsaRegenerate**](ReposApi.md#reposRsaRegenerate) | **POST** /repos/{owner}/{identifier}/rsa/regenerate/ | Regenerate RSA Key for the Repository.


<a name="reposAllList"></a>
# **reposAllList**
> List&lt;Repository&gt; reposAllList(page, pageSize)

Get a list of all repositories associated with current user.

Get a list of all repositories associated with current user.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.ReposApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReposApi apiInstance = new ReposApi();
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
try {
    List<Repository> result = apiInstance.reposAllList(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposAllList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| A page number within the paginated result set. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]

### Return type

[**List&lt;Repository&gt;**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reposCreate"></a>
# **reposCreate**
> RepositoryCreate reposCreate(owner, data)

Create a new repository in a given namespace.

Create a new repository in a given namespace.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.ReposApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReposApi apiInstance = new ReposApi();
String owner = "owner_example"; // String | 
ReposCreate data = new ReposCreate(); // ReposCreate | 
try {
    RepositoryCreate result = apiInstance.reposCreate(owner, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **data** | [**ReposCreate**](ReposCreate.md)|  | [optional]

### Return type

[**RepositoryCreate**](RepositoryCreate.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="reposDelete"></a>
# **reposDelete**
> reposDelete(owner, identifier)

Delete a repository in a given namespace.

Delete a repository in a given namespace.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.ReposApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReposApi apiInstance = new ReposApi();
String owner = "owner_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    apiInstance.reposDelete(owner, identifier);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reposGpgCreate"></a>
# **reposGpgCreate**
> RepositoryGpgKey reposGpgCreate(owner, identifier, data)

Set the active GPG key for the Repository.

Set the active GPG key for the Repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.ReposApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReposApi apiInstance = new ReposApi();
String owner = "owner_example"; // String | 
String identifier = "identifier_example"; // String | 
ReposGpgCreate data = new ReposGpgCreate(); // ReposGpgCreate | 
try {
    RepositoryGpgKey result = apiInstance.reposGpgCreate(owner, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposGpgCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**ReposGpgCreate**](ReposGpgCreate.md)|  | [optional]

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="reposGpgList"></a>
# **reposGpgList**
> RepositoryGpgKey reposGpgList(owner, identifier)

Retrieve the active GPG key for the Repository.

Retrieve the active GPG key for the Repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.ReposApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReposApi apiInstance = new ReposApi();
String owner = "owner_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    RepositoryGpgKey result = apiInstance.reposGpgList(owner, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposGpgList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reposGpgRegenerate"></a>
# **reposGpgRegenerate**
> RepositoryGpgKey reposGpgRegenerate(owner, identifier)

Regenerate GPG Key for the Repository.

Regenerate GPG Key for the Repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.ReposApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReposApi apiInstance = new ReposApi();
String owner = "owner_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    RepositoryGpgKey result = apiInstance.reposGpgRegenerate(owner, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposGpgRegenerate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reposList"></a>
# **reposList**
> List&lt;Repository&gt; reposList(owner, page, pageSize)

Get a list of all repositories within a namespace.

Get a list of all repositories within a namespace.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.ReposApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReposApi apiInstance = new ReposApi();
String owner = "owner_example"; // String | 
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
try {
    List<Repository> result = apiInstance.reposList(owner, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **page** | **Integer**| A page number within the paginated result set. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]

### Return type

[**List&lt;Repository&gt;**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reposPartialUpdate"></a>
# **reposPartialUpdate**
> Repository reposPartialUpdate(owner, identifier, data)

Update details about a repository in a given namespace.

Update details about a repository in a given namespace.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.ReposApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReposApi apiInstance = new ReposApi();
String owner = "owner_example"; // String | 
String identifier = "identifier_example"; // String | 
ReposPartialUpdate data = new ReposPartialUpdate(); // ReposPartialUpdate | 
try {
    Repository result = apiInstance.reposPartialUpdate(owner, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**ReposPartialUpdate**](ReposPartialUpdate.md)|  | [optional]

### Return type

[**Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="reposPrivilegesDelete"></a>
# **reposPrivilegesDelete**
> reposPrivilegesDelete(owner, identifier)

Remove the specified repository privileges.

Remove the specified repository privileges.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.ReposApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReposApi apiInstance = new ReposApi();
String owner = "owner_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    apiInstance.reposPrivilegesDelete(owner, identifier);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposPrivilegesDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reposPrivilegesList"></a>
# **reposPrivilegesList**
> List&lt;RepositoryPrivilegeList&gt; reposPrivilegesList(owner, identifier)

List all explicity created privileges for the repository.

List all explicity created privileges for the repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.ReposApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReposApi apiInstance = new ReposApi();
String owner = "owner_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    List<RepositoryPrivilegeList> result = apiInstance.reposPrivilegesList(owner, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposPrivilegesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |

### Return type

[**List&lt;RepositoryPrivilegeList&gt;**](RepositoryPrivilegeList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reposPrivilegesPartialUpdate"></a>
# **reposPrivilegesPartialUpdate**
> reposPrivilegesPartialUpdate(owner, identifier)

Update the specified repository privileges.

Update the specified repository privileges.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.ReposApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReposApi apiInstance = new ReposApi();
String owner = "owner_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    apiInstance.reposPrivilegesPartialUpdate(owner, identifier);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposPrivilegesPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reposPrivilegesUpdate"></a>
# **reposPrivilegesUpdate**
> RepositoryPrivilegeList reposPrivilegesUpdate(owner, identifier)

Replace all existing repository privileges with those specified.

Replace all existing repository privileges with those specified.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.ReposApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReposApi apiInstance = new ReposApi();
String owner = "owner_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    RepositoryPrivilegeList result = apiInstance.reposPrivilegesUpdate(owner, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposPrivilegesUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |

### Return type

[**RepositoryPrivilegeList**](RepositoryPrivilegeList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reposRead"></a>
# **reposRead**
> Repository reposRead(owner, identifier)

Get a specific repository.

Get a specific repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.ReposApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReposApi apiInstance = new ReposApi();
String owner = "owner_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    Repository result = apiInstance.reposRead(owner, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |

### Return type

[**Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reposRsaCreate"></a>
# **reposRsaCreate**
> RepositoryRsaKey reposRsaCreate(owner, identifier, data)

Set the active RSA key for the Repository.

Set the active RSA key for the Repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.ReposApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReposApi apiInstance = new ReposApi();
String owner = "owner_example"; // String | 
String identifier = "identifier_example"; // String | 
ReposRsaCreate data = new ReposRsaCreate(); // ReposRsaCreate | 
try {
    RepositoryRsaKey result = apiInstance.reposRsaCreate(owner, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposRsaCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**ReposRsaCreate**](ReposRsaCreate.md)|  | [optional]

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="reposRsaList"></a>
# **reposRsaList**
> RepositoryRsaKey reposRsaList(owner, identifier)

Retrieve the active RSA key for the Repository.

Retrieve the active RSA key for the Repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.ReposApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReposApi apiInstance = new ReposApi();
String owner = "owner_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    RepositoryRsaKey result = apiInstance.reposRsaList(owner, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposRsaList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reposRsaRegenerate"></a>
# **reposRsaRegenerate**
> RepositoryRsaKey reposRsaRegenerate(owner, identifier)

Regenerate RSA Key for the Repository.

Regenerate RSA Key for the Repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.ReposApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReposApi apiInstance = new ReposApi();
String owner = "owner_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    RepositoryRsaKey result = apiInstance.reposRsaRegenerate(owner, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposRsaRegenerate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

