# ReposApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reposCreate**](ReposApi.md#reposCreate) | **POST** /repos/{owner}/ | Create a new repository in a given namespace.
[**reposDelete**](ReposApi.md#reposDelete) | **DELETE** /repos/{owner}/{identifier}/ | Delete a repository in a given namespace.
[**reposGeoipDisable**](ReposApi.md#reposGeoipDisable) | **POST** /repos/{owner}/{identifier}/geoip/disable/ | Disable GeoIP for this repository.
[**reposGeoipEnable**](ReposApi.md#reposGeoipEnable) | **POST** /repos/{owner}/{identifier}/geoip/enable/ | Enable GeoIP for this repository.
[**reposGeoipPartialUpdate**](ReposApi.md#reposGeoipPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/geoip | Partially update existing repository geoip rules with those specified
[**reposGeoipRead**](ReposApi.md#reposGeoipRead) | **GET** /repos/{owner}/{identifier}/geoip | List all created GeoIP rules for the repository.
[**reposGeoipTest**](ReposApi.md#reposGeoipTest) | **POST** /repos/{owner}/{identifier}/geoip/test/ | Test a list of IP addresses against the repository&#39;s current GeoIP rules.
[**reposGeoipUpdate**](ReposApi.md#reposGeoipUpdate) | **PUT** /repos/{owner}/{identifier}/geoip | Replace all existing repository geoip rules with those specified
[**reposGpgCreate**](ReposApi.md#reposGpgCreate) | **POST** /repos/{owner}/{identifier}/gpg/ | Set the active GPG key for the Repository.
[**reposGpgList**](ReposApi.md#reposGpgList) | **GET** /repos/{owner}/{identifier}/gpg/ | Retrieve the active GPG key for the Repository.
[**reposGpgRegenerate**](ReposApi.md#reposGpgRegenerate) | **POST** /repos/{owner}/{identifier}/gpg/regenerate/ | Regenerate GPG Key for the Repository.
[**reposNamespaceList**](ReposApi.md#reposNamespaceList) | **GET** /repos/{owner}/ | Get a list of all repositories within a namespace.
[**reposPartialUpdate**](ReposApi.md#reposPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/ | Update details about a repository in a given namespace.
[**reposPrivilegesList**](ReposApi.md#reposPrivilegesList) | **GET** /repos/{owner}/{identifier}/privileges | List all explicity created privileges for the repository.
[**reposPrivilegesPartialUpdate**](ReposApi.md#reposPrivilegesPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/privileges | Modify privileges for the repository.
[**reposPrivilegesUpdate**](ReposApi.md#reposPrivilegesUpdate) | **PUT** /repos/{owner}/{identifier}/privileges | Replace all existing repository privileges with those specified.
[**reposRead**](ReposApi.md#reposRead) | **GET** /repos/{owner}/{identifier}/ | Get a specific repository.
[**reposRsaCreate**](ReposApi.md#reposRsaCreate) | **POST** /repos/{owner}/{identifier}/rsa/ | Set the active RSA key for the Repository.
[**reposRsaList**](ReposApi.md#reposRsaList) | **GET** /repos/{owner}/{identifier}/rsa/ | Retrieve the active RSA key for the Repository.
[**reposRsaRegenerate**](ReposApi.md#reposRsaRegenerate) | **POST** /repos/{owner}/{identifier}/rsa/regenerate/ | Regenerate RSA Key for the Repository.
[**reposUserList**](ReposApi.md#reposUserList) | **GET** /repos/ | Get a list of all repositories associated with current user.


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
RepositoryCreateRequest data = new RepositoryCreateRequest(); // RepositoryCreateRequest | 
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
 **data** | [**RepositoryCreateRequest**](RepositoryCreateRequest.md)|  | [optional]

### Return type

[**RepositoryCreate**](RepositoryCreate.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposGeoipDisable"></a>
# **reposGeoipDisable**
> reposGeoipDisable(owner, identifier, data)

Disable GeoIP for this repository.

Disable GeoIP for this repository.

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
RespositoryGeoIPEnableDisableRequest data = new RespositoryGeoIPEnableDisableRequest(); // RespositoryGeoIPEnableDisableRequest | 
try {
    apiInstance.reposGeoipDisable(owner, identifier, data);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposGeoipDisable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**RespositoryGeoIPEnableDisableRequest**](RespositoryGeoIPEnableDisableRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposGeoipEnable"></a>
# **reposGeoipEnable**
> reposGeoipEnable(owner, identifier, data)

Enable GeoIP for this repository.

Enable GeoIP for this repository.

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
RespositoryGeoIPEnableDisableRequest data = new RespositoryGeoIPEnableDisableRequest(); // RespositoryGeoIPEnableDisableRequest | 
try {
    apiInstance.reposGeoipEnable(owner, identifier, data);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposGeoipEnable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**RespositoryGeoIPEnableDisableRequest**](RespositoryGeoIPEnableDisableRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposGeoipPartialUpdate"></a>
# **reposGeoipPartialUpdate**
> RepositoryGeoIpRules reposGeoipPartialUpdate(owner, identifier, data)

Partially update existing repository geoip rules with those specified

Partially update existing repository geoip rules with those specified

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
RepositoryGeoIpRules2 data = new RepositoryGeoIpRules2(); // RepositoryGeoIpRules2 | 
try {
    RepositoryGeoIpRules result = apiInstance.reposGeoipPartialUpdate(owner, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposGeoipPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**RepositoryGeoIpRules2**](RepositoryGeoIpRules2.md)|  | [optional]

### Return type

[**RepositoryGeoIpRules**](RepositoryGeoIpRules.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposGeoipRead"></a>
# **reposGeoipRead**
> RepositoryGeoIpRules reposGeoipRead(owner, identifier)

List all created GeoIP rules for the repository.

List all created GeoIP rules for the repository.

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
    RepositoryGeoIpRules result = apiInstance.reposGeoipRead(owner, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposGeoipRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |

### Return type

[**RepositoryGeoIpRules**](RepositoryGeoIpRules.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposGeoipTest"></a>
# **reposGeoipTest**
> RepositoryGeoIPTestAddressResponse reposGeoipTest(owner, identifier, data)

Test a list of IP addresses against the repository&#39;s current GeoIP rules.

Test a list of IP addresses against the repository&#39;s current GeoIP rules.

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
RepositoryGeoIPTestAddress data = new RepositoryGeoIPTestAddress(); // RepositoryGeoIPTestAddress | 
try {
    RepositoryGeoIPTestAddressResponse result = apiInstance.reposGeoipTest(owner, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposGeoipTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**RepositoryGeoIPTestAddress**](RepositoryGeoIPTestAddress.md)|  | [optional]

### Return type

[**RepositoryGeoIPTestAddressResponse**](RepositoryGeoIPTestAddressResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposGeoipUpdate"></a>
# **reposGeoipUpdate**
> reposGeoipUpdate(owner, identifier, data)

Replace all existing repository geoip rules with those specified

Replace all existing repository geoip rules with those specified

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
RepositoryGeoIpRules1 data = new RepositoryGeoIpRules1(); // RepositoryGeoIpRules1 | 
try {
    apiInstance.reposGeoipUpdate(owner, identifier, data);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposGeoipUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**RepositoryGeoIpRules1**](RepositoryGeoIpRules1.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
RepositoryGpgKeyCreate data = new RepositoryGpgKeyCreate(); // RepositoryGpgKeyCreate | 
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
 **data** | [**RepositoryGpgKeyCreate**](RepositoryGpgKeyCreate.md)|  | [optional]

### Return type

[**RepositoryGpgKey**](RepositoryGpgKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposNamespaceList"></a>
# **reposNamespaceList**
> List&lt;Repository&gt; reposNamespaceList(owner, page, pageSize)

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
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
try {
    List<Repository> result = apiInstance.reposNamespaceList(owner, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposNamespaceList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]

### Return type

[**List&lt;Repository&gt;**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
RepositoryRequestPatch data = new RepositoryRequestPatch(); // RepositoryRequestPatch | 
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
 **data** | [**RepositoryRequestPatch**](RepositoryRequestPatch.md)|  | [optional]

### Return type

[**Repository**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposPrivilegesList"></a>
# **reposPrivilegesList**
> RepositoryPrivilegeInput reposPrivilegesList(owner, identifier, page, pageSize)

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
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
try {
    RepositoryPrivilegeInput result = apiInstance.reposPrivilegesList(owner, identifier, page, pageSize);
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
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]

### Return type

[**RepositoryPrivilegeInput**](RepositoryPrivilegeInput.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposPrivilegesPartialUpdate"></a>
# **reposPrivilegesPartialUpdate**
> reposPrivilegesPartialUpdate(owner, identifier, data)

Modify privileges for the repository.

Modify privileges for the repository.

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
RepositoryPrivilegeInputRequestPatch data = new RepositoryPrivilegeInputRequestPatch(); // RepositoryPrivilegeInputRequestPatch | 
try {
    apiInstance.reposPrivilegesPartialUpdate(owner, identifier, data);
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
 **data** | [**RepositoryPrivilegeInputRequestPatch**](RepositoryPrivilegeInputRequestPatch.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposPrivilegesUpdate"></a>
# **reposPrivilegesUpdate**
> reposPrivilegesUpdate(owner, identifier, data)

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
RepositoryPrivilegeInputRequest data = new RepositoryPrivilegeInputRequest(); // RepositoryPrivilegeInputRequest | 
try {
    apiInstance.reposPrivilegesUpdate(owner, identifier, data);
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
 **data** | [**RepositoryPrivilegeInputRequest**](RepositoryPrivilegeInputRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

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
RepositoryRsaKeyCreate data = new RepositoryRsaKeyCreate(); // RepositoryRsaKeyCreate | 
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
 **data** | [**RepositoryRsaKeyCreate**](RepositoryRsaKeyCreate.md)|  | [optional]

### Return type

[**RepositoryRsaKey**](RepositoryRsaKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUserList"></a>
# **reposUserList**
> List&lt;Repository&gt; reposUserList(page, pageSize)

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
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
try {
    List<Repository> result = apiInstance.reposUserList(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUserList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]

### Return type

[**List&lt;Repository&gt;**](Repository.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

