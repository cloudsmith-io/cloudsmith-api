# ReposApi

All URIs are relative to *https://api.cloudsmith.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reposCreate**](ReposApi.md#reposCreate) | **POST** /repos/{owner}/ | Create a new repository in a given namespace.
[**reposDelete**](ReposApi.md#reposDelete) | **DELETE** /repos/{owner}/{identifier}/ | Delete a repository in a given namespace.
[**reposGeoipDisable**](ReposApi.md#reposGeoipDisable) | **POST** /repos/{owner}/{identifier}/geoip/disable/ | Disable GeoIP for this repository.
[**reposGeoipEnable**](ReposApi.md#reposGeoipEnable) | **POST** /repos/{owner}/{identifier}/geoip/enable/ | Enable GeoIP for this repository.
[**reposGeoipPartialUpdate**](ReposApi.md#reposGeoipPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/geoip | Partially update repository geoip rules.
[**reposGeoipRead**](ReposApi.md#reposGeoipRead) | **GET** /repos/{owner}/{identifier}/geoip | List all repository geoip rules.
[**reposGeoipTest**](ReposApi.md#reposGeoipTest) | **POST** /repos/{owner}/{identifier}/geoip/test/ | Test a list of IP addresses against the repository&#39;s current GeoIP rules.
[**reposGeoipUpdate**](ReposApi.md#reposGeoipUpdate) | **PUT** /repos/{owner}/{identifier}/geoip | Replace repository geoip rules.
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
[**reposUpstreamCranCreate**](ReposApi.md#reposUpstreamCranCreate) | **POST** /repos/{owner}/{identifier}/upstream/cran/ | Create a CRAN upstream config for this repository.
[**reposUpstreamCranDelete**](ReposApi.md#reposUpstreamCranDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Delete a CRAN upstream config for this repository.
[**reposUpstreamCranList**](ReposApi.md#reposUpstreamCranList) | **GET** /repos/{owner}/{identifier}/upstream/cran/ | List CRAN upstream configs for this repository.
[**reposUpstreamCranPartialUpdate**](ReposApi.md#reposUpstreamCranPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Partially update a CRAN upstream config for this repository.
[**reposUpstreamCranRead**](ReposApi.md#reposUpstreamCranRead) | **GET** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Retrieve a CRAN upstream config for this repository.
[**reposUpstreamCranUpdate**](ReposApi.md#reposUpstreamCranUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/cran/{slug_perm}/ | Update a CRAN upstream config for this repository.
[**reposUpstreamDartCreate**](ReposApi.md#reposUpstreamDartCreate) | **POST** /repos/{owner}/{identifier}/upstream/dart/ | Create a Dart upstream config for this repository.
[**reposUpstreamDartDelete**](ReposApi.md#reposUpstreamDartDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Delete a Dart upstream config for this repository.
[**reposUpstreamDartList**](ReposApi.md#reposUpstreamDartList) | **GET** /repos/{owner}/{identifier}/upstream/dart/ | List Dart upstream configs for this repository.
[**reposUpstreamDartPartialUpdate**](ReposApi.md#reposUpstreamDartPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Partially update a Dart upstream config for this repository.
[**reposUpstreamDartRead**](ReposApi.md#reposUpstreamDartRead) | **GET** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Retrieve a Dart upstream config for this repository.
[**reposUpstreamDartUpdate**](ReposApi.md#reposUpstreamDartUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/dart/{slug_perm}/ | Update a Dart upstream config for this repository.
[**reposUpstreamDebCreate**](ReposApi.md#reposUpstreamDebCreate) | **POST** /repos/{owner}/{identifier}/upstream/deb/ | Create a Debian upstream config for this repository.
[**reposUpstreamDebDelete**](ReposApi.md#reposUpstreamDebDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Delete a Debian upstream config for this repository.
[**reposUpstreamDebList**](ReposApi.md#reposUpstreamDebList) | **GET** /repos/{owner}/{identifier}/upstream/deb/ | List Debian upstream configs for this repository.
[**reposUpstreamDebPartialUpdate**](ReposApi.md#reposUpstreamDebPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Partially update a Debian upstream config for this repository.
[**reposUpstreamDebRead**](ReposApi.md#reposUpstreamDebRead) | **GET** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Retrieve a Debian upstream config for this repository.
[**reposUpstreamDebUpdate**](ReposApi.md#reposUpstreamDebUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/deb/{slug_perm}/ | Update a Debian upstream config for this repository.
[**reposUpstreamDockerCreate**](ReposApi.md#reposUpstreamDockerCreate) | **POST** /repos/{owner}/{identifier}/upstream/docker/ | Create a Docker upstream config for this repository.
[**reposUpstreamDockerDelete**](ReposApi.md#reposUpstreamDockerDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Delete a Docker upstream config for this repository.
[**reposUpstreamDockerList**](ReposApi.md#reposUpstreamDockerList) | **GET** /repos/{owner}/{identifier}/upstream/docker/ | List Docker upstream configs for this repository.
[**reposUpstreamDockerPartialUpdate**](ReposApi.md#reposUpstreamDockerPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Partially update a Docker upstream config for this repository.
[**reposUpstreamDockerRead**](ReposApi.md#reposUpstreamDockerRead) | **GET** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Retrieve a Docker upstream config for this repository.
[**reposUpstreamDockerUpdate**](ReposApi.md#reposUpstreamDockerUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/docker/{slug_perm}/ | Update a Docker upstream config for this repository.
[**reposUpstreamHelmCreate**](ReposApi.md#reposUpstreamHelmCreate) | **POST** /repos/{owner}/{identifier}/upstream/helm/ | Create a Helm upstream config for this repository.
[**reposUpstreamHelmDelete**](ReposApi.md#reposUpstreamHelmDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Delete a Helm upstream config for this repository.
[**reposUpstreamHelmList**](ReposApi.md#reposUpstreamHelmList) | **GET** /repos/{owner}/{identifier}/upstream/helm/ | List Helm upstream configs for this repository.
[**reposUpstreamHelmPartialUpdate**](ReposApi.md#reposUpstreamHelmPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Partially update a Helm upstream config for this repository.
[**reposUpstreamHelmRead**](ReposApi.md#reposUpstreamHelmRead) | **GET** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Retrieve a Helm upstream config for this repository.
[**reposUpstreamHelmUpdate**](ReposApi.md#reposUpstreamHelmUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/helm/{slug_perm}/ | Update a Helm upstream config for this repository.
[**reposUpstreamMavenCreate**](ReposApi.md#reposUpstreamMavenCreate) | **POST** /repos/{owner}/{identifier}/upstream/maven/ | Create a Maven upstream config for this repository.
[**reposUpstreamMavenDelete**](ReposApi.md#reposUpstreamMavenDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Delete a Maven upstream config for this repository.
[**reposUpstreamMavenList**](ReposApi.md#reposUpstreamMavenList) | **GET** /repos/{owner}/{identifier}/upstream/maven/ | List Maven upstream configs for this repository.
[**reposUpstreamMavenPartialUpdate**](ReposApi.md#reposUpstreamMavenPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Partially update a Maven upstream config for this repository.
[**reposUpstreamMavenRead**](ReposApi.md#reposUpstreamMavenRead) | **GET** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Retrieve a Maven upstream config for this repository.
[**reposUpstreamMavenUpdate**](ReposApi.md#reposUpstreamMavenUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/maven/{slug_perm}/ | Update a Maven upstream config for this repository.
[**reposUpstreamNpmCreate**](ReposApi.md#reposUpstreamNpmCreate) | **POST** /repos/{owner}/{identifier}/upstream/npm/ | Create a npm upstream config for this repository.
[**reposUpstreamNpmDelete**](ReposApi.md#reposUpstreamNpmDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Delete a npm upstream config for this repository.
[**reposUpstreamNpmList**](ReposApi.md#reposUpstreamNpmList) | **GET** /repos/{owner}/{identifier}/upstream/npm/ | List npm upstream configs for this repository.
[**reposUpstreamNpmPartialUpdate**](ReposApi.md#reposUpstreamNpmPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Partially update a npm upstream config for this repository.
[**reposUpstreamNpmRead**](ReposApi.md#reposUpstreamNpmRead) | **GET** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Retrieve a npm upstream config for this repository.
[**reposUpstreamNpmUpdate**](ReposApi.md#reposUpstreamNpmUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/npm/{slug_perm}/ | Update a npm upstream config for this repository.
[**reposUpstreamNugetCreate**](ReposApi.md#reposUpstreamNugetCreate) | **POST** /repos/{owner}/{identifier}/upstream/nuget/ | Create a NuGet upstream config for this repository.
[**reposUpstreamNugetDelete**](ReposApi.md#reposUpstreamNugetDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Delete a NuGet upstream config for this repository.
[**reposUpstreamNugetList**](ReposApi.md#reposUpstreamNugetList) | **GET** /repos/{owner}/{identifier}/upstream/nuget/ | List NuGet upstream configs for this repository.
[**reposUpstreamNugetPartialUpdate**](ReposApi.md#reposUpstreamNugetPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Partially update a NuGet upstream config for this repository.
[**reposUpstreamNugetRead**](ReposApi.md#reposUpstreamNugetRead) | **GET** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Retrieve a NuGet upstream config for this repository.
[**reposUpstreamNugetUpdate**](ReposApi.md#reposUpstreamNugetUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/nuget/{slug_perm}/ | Update a NuGet upstream config for this repository.
[**reposUpstreamPythonCreate**](ReposApi.md#reposUpstreamPythonCreate) | **POST** /repos/{owner}/{identifier}/upstream/python/ | Create a Python upstream config for this repository.
[**reposUpstreamPythonDelete**](ReposApi.md#reposUpstreamPythonDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Delete a Python upstream config for this repository.
[**reposUpstreamPythonList**](ReposApi.md#reposUpstreamPythonList) | **GET** /repos/{owner}/{identifier}/upstream/python/ | List Python upstream configs for this repository.
[**reposUpstreamPythonPartialUpdate**](ReposApi.md#reposUpstreamPythonPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Partially update a Python upstream config for this repository.
[**reposUpstreamPythonRead**](ReposApi.md#reposUpstreamPythonRead) | **GET** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Retrieve a Python upstream config for this repository.
[**reposUpstreamPythonUpdate**](ReposApi.md#reposUpstreamPythonUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/python/{slug_perm}/ | Update a Python upstream config for this repository.
[**reposUpstreamRpmCreate**](ReposApi.md#reposUpstreamRpmCreate) | **POST** /repos/{owner}/{identifier}/upstream/rpm/ | Create a RedHat upstream config for this repository.
[**reposUpstreamRpmDelete**](ReposApi.md#reposUpstreamRpmDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Delete a RedHat upstream config for this repository.
[**reposUpstreamRpmList**](ReposApi.md#reposUpstreamRpmList) | **GET** /repos/{owner}/{identifier}/upstream/rpm/ | List RedHat upstream configs for this repository.
[**reposUpstreamRpmPartialUpdate**](ReposApi.md#reposUpstreamRpmPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Partially update a RedHat upstream config for this repository.
[**reposUpstreamRpmRead**](ReposApi.md#reposUpstreamRpmRead) | **GET** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Retrieve a RedHat upstream config for this repository.
[**reposUpstreamRpmUpdate**](ReposApi.md#reposUpstreamRpmUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/rpm/{slug_perm}/ | Update a RedHat upstream config for this repository.
[**reposUpstreamRubyCreate**](ReposApi.md#reposUpstreamRubyCreate) | **POST** /repos/{owner}/{identifier}/upstream/ruby/ | Create a Ruby upstream config for this repository.
[**reposUpstreamRubyDelete**](ReposApi.md#reposUpstreamRubyDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Delete a Ruby upstream config for this repository.
[**reposUpstreamRubyList**](ReposApi.md#reposUpstreamRubyList) | **GET** /repos/{owner}/{identifier}/upstream/ruby/ | List Ruby upstream configs for this repository.
[**reposUpstreamRubyPartialUpdate**](ReposApi.md#reposUpstreamRubyPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Partially update a Ruby upstream config for this repository.
[**reposUpstreamRubyRead**](ReposApi.md#reposUpstreamRubyRead) | **GET** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Retrieve a Ruby upstream config for this repository.
[**reposUpstreamRubyUpdate**](ReposApi.md#reposUpstreamRubyUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/ruby/{slug_perm}/ | Update a Ruby upstream config for this repository.
[**reposUpstreamSwiftCreate**](ReposApi.md#reposUpstreamSwiftCreate) | **POST** /repos/{owner}/{identifier}/upstream/swift/ | Create a Swift upstream config for this repository.
[**reposUpstreamSwiftDelete**](ReposApi.md#reposUpstreamSwiftDelete) | **DELETE** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Delete a Swift upstream config for this repository.
[**reposUpstreamSwiftList**](ReposApi.md#reposUpstreamSwiftList) | **GET** /repos/{owner}/{identifier}/upstream/swift/ | List Swift upstream configs for this repository.
[**reposUpstreamSwiftPartialUpdate**](ReposApi.md#reposUpstreamSwiftPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Partially update a Swift upstream config for this repository.
[**reposUpstreamSwiftRead**](ReposApi.md#reposUpstreamSwiftRead) | **GET** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Retrieve a Swift upstream config for this repository.
[**reposUpstreamSwiftUpdate**](ReposApi.md#reposUpstreamSwiftUpdate) | **PUT** /repos/{owner}/{identifier}/upstream/swift/{slug_perm}/ | Update a Swift upstream config for this repository.
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
RespositoryGeoIpEnableDisableRequest data = new RespositoryGeoIpEnableDisableRequest(); // RespositoryGeoIpEnableDisableRequest | 
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
 **data** | [**RespositoryGeoIpEnableDisableRequest**](RespositoryGeoIpEnableDisableRequest.md)|  | [optional]

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
RespositoryGeoIpEnableDisableRequest data = new RespositoryGeoIpEnableDisableRequest(); // RespositoryGeoIpEnableDisableRequest | 
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
 **data** | [**RespositoryGeoIpEnableDisableRequest**](RespositoryGeoIpEnableDisableRequest.md)|  | [optional]

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

Partially update repository geoip rules.

Partially update repository geoip rules.

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
RepositoryGeoIpRulesRequestPatch data = new RepositoryGeoIpRulesRequestPatch(); // RepositoryGeoIpRulesRequestPatch | 
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
 **data** | [**RepositoryGeoIpRulesRequestPatch**](RepositoryGeoIpRulesRequestPatch.md)|  | [optional]

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

List all repository geoip rules.

List all repository geoip rules.

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
> RepositoryGeoIpTestAddressResponse reposGeoipTest(owner, identifier, data)

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
RepositoryGeoIpTestAddress data = new RepositoryGeoIpTestAddress(); // RepositoryGeoIpTestAddress | 
try {
    RepositoryGeoIpTestAddressResponse result = apiInstance.reposGeoipTest(owner, identifier, data);
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
 **data** | [**RepositoryGeoIpTestAddress**](RepositoryGeoIpTestAddress.md)|  | [optional]

### Return type

[**RepositoryGeoIpTestAddressResponse**](RepositoryGeoIpTestAddressResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposGeoipUpdate"></a>
# **reposGeoipUpdate**
> RepositoryGeoIpRules reposGeoipUpdate(owner, identifier, data)

Replace repository geoip rules.

Replace repository geoip rules.

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
RepositoryGeoIpRulesRequest data = new RepositoryGeoIpRulesRequest(); // RepositoryGeoIpRulesRequest | 
try {
    RepositoryGeoIpRules result = apiInstance.reposGeoipUpdate(owner, identifier, data);
    System.out.println(result);
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
 **data** | [**RepositoryGeoIpRulesRequest**](RepositoryGeoIpRulesRequest.md)|  | [optional]

### Return type

[**RepositoryGeoIpRules**](RepositoryGeoIpRules.md)

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

<a name="reposUpstreamCranCreate"></a>
# **reposUpstreamCranCreate**
> CranUpstream reposUpstreamCranCreate(owner, identifier, data)

Create a CRAN upstream config for this repository.

Create a CRAN upstream config for this repository.

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
CranUpstreamRequest data = new CranUpstreamRequest(); // CranUpstreamRequest | 
try {
    CranUpstream result = apiInstance.reposUpstreamCranCreate(owner, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamCranCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**CranUpstreamRequest**](CranUpstreamRequest.md)|  | [optional]

### Return type

[**CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamCranDelete"></a>
# **reposUpstreamCranDelete**
> reposUpstreamCranDelete(owner, identifier, slugPerm)

Delete a CRAN upstream config for this repository.

Delete a CRAN upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.reposUpstreamCranDelete(owner, identifier, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamCranDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamCranList"></a>
# **reposUpstreamCranList**
> List&lt;CranUpstream&gt; reposUpstreamCranList(owner, identifier, page, pageSize)

List CRAN upstream configs for this repository.

List CRAN upstream configs for this repository.

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
    List<CranUpstream> result = apiInstance.reposUpstreamCranList(owner, identifier, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamCranList");
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

[**List&lt;CranUpstream&gt;**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamCranPartialUpdate"></a>
# **reposUpstreamCranPartialUpdate**
> CranUpstream reposUpstreamCranPartialUpdate(owner, identifier, slugPerm, data)

Partially update a CRAN upstream config for this repository.

Partially update a CRAN upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
CranUpstreamRequestPatch data = new CranUpstreamRequestPatch(); // CranUpstreamRequestPatch | 
try {
    CranUpstream result = apiInstance.reposUpstreamCranPartialUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamCranPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**CranUpstreamRequestPatch**](CranUpstreamRequestPatch.md)|  | [optional]

### Return type

[**CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamCranRead"></a>
# **reposUpstreamCranRead**
> CranUpstream reposUpstreamCranRead(owner, identifier, slugPerm)

Retrieve a CRAN upstream config for this repository.

Retrieve a CRAN upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    CranUpstream result = apiInstance.reposUpstreamCranRead(owner, identifier, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamCranRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamCranUpdate"></a>
# **reposUpstreamCranUpdate**
> CranUpstream reposUpstreamCranUpdate(owner, identifier, slugPerm, data)

Update a CRAN upstream config for this repository.

Update a CRAN upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
CranUpstreamRequest data = new CranUpstreamRequest(); // CranUpstreamRequest | 
try {
    CranUpstream result = apiInstance.reposUpstreamCranUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamCranUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**CranUpstreamRequest**](CranUpstreamRequest.md)|  | [optional]

### Return type

[**CranUpstream**](CranUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDartCreate"></a>
# **reposUpstreamDartCreate**
> DartUpstream reposUpstreamDartCreate(owner, identifier, data)

Create a Dart upstream config for this repository.

Create a Dart upstream config for this repository.

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
DartUpstreamRequest data = new DartUpstreamRequest(); // DartUpstreamRequest | 
try {
    DartUpstream result = apiInstance.reposUpstreamDartCreate(owner, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDartCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**DartUpstreamRequest**](DartUpstreamRequest.md)|  | [optional]

### Return type

[**DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDartDelete"></a>
# **reposUpstreamDartDelete**
> reposUpstreamDartDelete(owner, identifier, slugPerm)

Delete a Dart upstream config for this repository.

Delete a Dart upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.reposUpstreamDartDelete(owner, identifier, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDartDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDartList"></a>
# **reposUpstreamDartList**
> List&lt;DartUpstream&gt; reposUpstreamDartList(owner, identifier, page, pageSize)

List Dart upstream configs for this repository.

List Dart upstream configs for this repository.

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
    List<DartUpstream> result = apiInstance.reposUpstreamDartList(owner, identifier, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDartList");
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

[**List&lt;DartUpstream&gt;**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDartPartialUpdate"></a>
# **reposUpstreamDartPartialUpdate**
> DartUpstream reposUpstreamDartPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Dart upstream config for this repository.

Partially update a Dart upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
DartUpstreamRequestPatch data = new DartUpstreamRequestPatch(); // DartUpstreamRequestPatch | 
try {
    DartUpstream result = apiInstance.reposUpstreamDartPartialUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDartPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**DartUpstreamRequestPatch**](DartUpstreamRequestPatch.md)|  | [optional]

### Return type

[**DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDartRead"></a>
# **reposUpstreamDartRead**
> DartUpstream reposUpstreamDartRead(owner, identifier, slugPerm)

Retrieve a Dart upstream config for this repository.

Retrieve a Dart upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    DartUpstream result = apiInstance.reposUpstreamDartRead(owner, identifier, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDartRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDartUpdate"></a>
# **reposUpstreamDartUpdate**
> DartUpstream reposUpstreamDartUpdate(owner, identifier, slugPerm, data)

Update a Dart upstream config for this repository.

Update a Dart upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
DartUpstreamRequest data = new DartUpstreamRequest(); // DartUpstreamRequest | 
try {
    DartUpstream result = apiInstance.reposUpstreamDartUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDartUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**DartUpstreamRequest**](DartUpstreamRequest.md)|  | [optional]

### Return type

[**DartUpstream**](DartUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDebCreate"></a>
# **reposUpstreamDebCreate**
> DebUpstream reposUpstreamDebCreate(owner, identifier, data)

Create a Debian upstream config for this repository.

Create a Debian upstream config for this repository.

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
DebUpstreamRequest data = new DebUpstreamRequest(); // DebUpstreamRequest | 
try {
    DebUpstream result = apiInstance.reposUpstreamDebCreate(owner, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDebCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**DebUpstreamRequest**](DebUpstreamRequest.md)|  | [optional]

### Return type

[**DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDebDelete"></a>
# **reposUpstreamDebDelete**
> reposUpstreamDebDelete(owner, identifier, slugPerm)

Delete a Debian upstream config for this repository.

Delete a Debian upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.reposUpstreamDebDelete(owner, identifier, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDebDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDebList"></a>
# **reposUpstreamDebList**
> List&lt;DebUpstream&gt; reposUpstreamDebList(owner, identifier, page, pageSize)

List Debian upstream configs for this repository.

List Debian upstream configs for this repository.

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
    List<DebUpstream> result = apiInstance.reposUpstreamDebList(owner, identifier, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDebList");
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

[**List&lt;DebUpstream&gt;**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDebPartialUpdate"></a>
# **reposUpstreamDebPartialUpdate**
> DebUpstream reposUpstreamDebPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Debian upstream config for this repository.

Partially update a Debian upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
DebUpstreamRequestPatch data = new DebUpstreamRequestPatch(); // DebUpstreamRequestPatch | 
try {
    DebUpstream result = apiInstance.reposUpstreamDebPartialUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDebPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**DebUpstreamRequestPatch**](DebUpstreamRequestPatch.md)|  | [optional]

### Return type

[**DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDebRead"></a>
# **reposUpstreamDebRead**
> DebUpstream reposUpstreamDebRead(owner, identifier, slugPerm)

Retrieve a Debian upstream config for this repository.

Retrieve a Debian upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    DebUpstream result = apiInstance.reposUpstreamDebRead(owner, identifier, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDebRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDebUpdate"></a>
# **reposUpstreamDebUpdate**
> DebUpstream reposUpstreamDebUpdate(owner, identifier, slugPerm, data)

Update a Debian upstream config for this repository.

Update a Debian upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
DebUpstreamRequest data = new DebUpstreamRequest(); // DebUpstreamRequest | 
try {
    DebUpstream result = apiInstance.reposUpstreamDebUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDebUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**DebUpstreamRequest**](DebUpstreamRequest.md)|  | [optional]

### Return type

[**DebUpstream**](DebUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDockerCreate"></a>
# **reposUpstreamDockerCreate**
> DockerUpstream reposUpstreamDockerCreate(owner, identifier, data)

Create a Docker upstream config for this repository.

Create a Docker upstream config for this repository.

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
DockerUpstreamRequest data = new DockerUpstreamRequest(); // DockerUpstreamRequest | 
try {
    DockerUpstream result = apiInstance.reposUpstreamDockerCreate(owner, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDockerCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**DockerUpstreamRequest**](DockerUpstreamRequest.md)|  | [optional]

### Return type

[**DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDockerDelete"></a>
# **reposUpstreamDockerDelete**
> reposUpstreamDockerDelete(owner, identifier, slugPerm)

Delete a Docker upstream config for this repository.

Delete a Docker upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.reposUpstreamDockerDelete(owner, identifier, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDockerDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDockerList"></a>
# **reposUpstreamDockerList**
> List&lt;DockerUpstream&gt; reposUpstreamDockerList(owner, identifier, page, pageSize)

List Docker upstream configs for this repository.

List Docker upstream configs for this repository.

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
    List<DockerUpstream> result = apiInstance.reposUpstreamDockerList(owner, identifier, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDockerList");
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

[**List&lt;DockerUpstream&gt;**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDockerPartialUpdate"></a>
# **reposUpstreamDockerPartialUpdate**
> DockerUpstream reposUpstreamDockerPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Docker upstream config for this repository.

Partially update a Docker upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
DockerUpstreamRequestPatch data = new DockerUpstreamRequestPatch(); // DockerUpstreamRequestPatch | 
try {
    DockerUpstream result = apiInstance.reposUpstreamDockerPartialUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDockerPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**DockerUpstreamRequestPatch**](DockerUpstreamRequestPatch.md)|  | [optional]

### Return type

[**DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDockerRead"></a>
# **reposUpstreamDockerRead**
> DockerUpstream reposUpstreamDockerRead(owner, identifier, slugPerm)

Retrieve a Docker upstream config for this repository.

Retrieve a Docker upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    DockerUpstream result = apiInstance.reposUpstreamDockerRead(owner, identifier, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDockerRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamDockerUpdate"></a>
# **reposUpstreamDockerUpdate**
> DockerUpstream reposUpstreamDockerUpdate(owner, identifier, slugPerm, data)

Update a Docker upstream config for this repository.

Update a Docker upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
DockerUpstreamRequest data = new DockerUpstreamRequest(); // DockerUpstreamRequest | 
try {
    DockerUpstream result = apiInstance.reposUpstreamDockerUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamDockerUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**DockerUpstreamRequest**](DockerUpstreamRequest.md)|  | [optional]

### Return type

[**DockerUpstream**](DockerUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamHelmCreate"></a>
# **reposUpstreamHelmCreate**
> HelmUpstream reposUpstreamHelmCreate(owner, identifier, data)

Create a Helm upstream config for this repository.

Create a Helm upstream config for this repository.

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
HelmUpstreamRequest data = new HelmUpstreamRequest(); // HelmUpstreamRequest | 
try {
    HelmUpstream result = apiInstance.reposUpstreamHelmCreate(owner, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamHelmCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**HelmUpstreamRequest**](HelmUpstreamRequest.md)|  | [optional]

### Return type

[**HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamHelmDelete"></a>
# **reposUpstreamHelmDelete**
> reposUpstreamHelmDelete(owner, identifier, slugPerm)

Delete a Helm upstream config for this repository.

Delete a Helm upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.reposUpstreamHelmDelete(owner, identifier, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamHelmDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamHelmList"></a>
# **reposUpstreamHelmList**
> List&lt;HelmUpstream&gt; reposUpstreamHelmList(owner, identifier, page, pageSize)

List Helm upstream configs for this repository.

List Helm upstream configs for this repository.

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
    List<HelmUpstream> result = apiInstance.reposUpstreamHelmList(owner, identifier, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamHelmList");
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

[**List&lt;HelmUpstream&gt;**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamHelmPartialUpdate"></a>
# **reposUpstreamHelmPartialUpdate**
> HelmUpstream reposUpstreamHelmPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Helm upstream config for this repository.

Partially update a Helm upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
HelmUpstreamRequestPatch data = new HelmUpstreamRequestPatch(); // HelmUpstreamRequestPatch | 
try {
    HelmUpstream result = apiInstance.reposUpstreamHelmPartialUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamHelmPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**HelmUpstreamRequestPatch**](HelmUpstreamRequestPatch.md)|  | [optional]

### Return type

[**HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamHelmRead"></a>
# **reposUpstreamHelmRead**
> HelmUpstream reposUpstreamHelmRead(owner, identifier, slugPerm)

Retrieve a Helm upstream config for this repository.

Retrieve a Helm upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    HelmUpstream result = apiInstance.reposUpstreamHelmRead(owner, identifier, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamHelmRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamHelmUpdate"></a>
# **reposUpstreamHelmUpdate**
> HelmUpstream reposUpstreamHelmUpdate(owner, identifier, slugPerm, data)

Update a Helm upstream config for this repository.

Update a Helm upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
HelmUpstreamRequest data = new HelmUpstreamRequest(); // HelmUpstreamRequest | 
try {
    HelmUpstream result = apiInstance.reposUpstreamHelmUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamHelmUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**HelmUpstreamRequest**](HelmUpstreamRequest.md)|  | [optional]

### Return type

[**HelmUpstream**](HelmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamMavenCreate"></a>
# **reposUpstreamMavenCreate**
> MavenUpstream reposUpstreamMavenCreate(owner, identifier, data)

Create a Maven upstream config for this repository.

Create a Maven upstream config for this repository.

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
MavenUpstreamRequest data = new MavenUpstreamRequest(); // MavenUpstreamRequest | 
try {
    MavenUpstream result = apiInstance.reposUpstreamMavenCreate(owner, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamMavenCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**MavenUpstreamRequest**](MavenUpstreamRequest.md)|  | [optional]

### Return type

[**MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamMavenDelete"></a>
# **reposUpstreamMavenDelete**
> reposUpstreamMavenDelete(owner, identifier, slugPerm)

Delete a Maven upstream config for this repository.

Delete a Maven upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.reposUpstreamMavenDelete(owner, identifier, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamMavenDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamMavenList"></a>
# **reposUpstreamMavenList**
> List&lt;MavenUpstream&gt; reposUpstreamMavenList(owner, identifier, page, pageSize)

List Maven upstream configs for this repository.

List Maven upstream configs for this repository.

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
    List<MavenUpstream> result = apiInstance.reposUpstreamMavenList(owner, identifier, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamMavenList");
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

[**List&lt;MavenUpstream&gt;**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamMavenPartialUpdate"></a>
# **reposUpstreamMavenPartialUpdate**
> MavenUpstream reposUpstreamMavenPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Maven upstream config for this repository.

Partially update a Maven upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
MavenUpstreamRequestPatch data = new MavenUpstreamRequestPatch(); // MavenUpstreamRequestPatch | 
try {
    MavenUpstream result = apiInstance.reposUpstreamMavenPartialUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamMavenPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**MavenUpstreamRequestPatch**](MavenUpstreamRequestPatch.md)|  | [optional]

### Return type

[**MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamMavenRead"></a>
# **reposUpstreamMavenRead**
> MavenUpstream reposUpstreamMavenRead(owner, identifier, slugPerm)

Retrieve a Maven upstream config for this repository.

Retrieve a Maven upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    MavenUpstream result = apiInstance.reposUpstreamMavenRead(owner, identifier, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamMavenRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamMavenUpdate"></a>
# **reposUpstreamMavenUpdate**
> MavenUpstream reposUpstreamMavenUpdate(owner, identifier, slugPerm, data)

Update a Maven upstream config for this repository.

Update a Maven upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
MavenUpstreamRequest data = new MavenUpstreamRequest(); // MavenUpstreamRequest | 
try {
    MavenUpstream result = apiInstance.reposUpstreamMavenUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamMavenUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**MavenUpstreamRequest**](MavenUpstreamRequest.md)|  | [optional]

### Return type

[**MavenUpstream**](MavenUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamNpmCreate"></a>
# **reposUpstreamNpmCreate**
> NpmUpstream reposUpstreamNpmCreate(owner, identifier, data)

Create a npm upstream config for this repository.

Create a npm upstream config for this repository.

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
NpmUpstreamRequest data = new NpmUpstreamRequest(); // NpmUpstreamRequest | 
try {
    NpmUpstream result = apiInstance.reposUpstreamNpmCreate(owner, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamNpmCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**NpmUpstreamRequest**](NpmUpstreamRequest.md)|  | [optional]

### Return type

[**NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamNpmDelete"></a>
# **reposUpstreamNpmDelete**
> reposUpstreamNpmDelete(owner, identifier, slugPerm)

Delete a npm upstream config for this repository.

Delete a npm upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.reposUpstreamNpmDelete(owner, identifier, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamNpmDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamNpmList"></a>
# **reposUpstreamNpmList**
> List&lt;NpmUpstream&gt; reposUpstreamNpmList(owner, identifier, page, pageSize)

List npm upstream configs for this repository.

List npm upstream configs for this repository.

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
    List<NpmUpstream> result = apiInstance.reposUpstreamNpmList(owner, identifier, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamNpmList");
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

[**List&lt;NpmUpstream&gt;**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamNpmPartialUpdate"></a>
# **reposUpstreamNpmPartialUpdate**
> NpmUpstream reposUpstreamNpmPartialUpdate(owner, identifier, slugPerm, data)

Partially update a npm upstream config for this repository.

Partially update a npm upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
NpmUpstreamRequestPatch data = new NpmUpstreamRequestPatch(); // NpmUpstreamRequestPatch | 
try {
    NpmUpstream result = apiInstance.reposUpstreamNpmPartialUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamNpmPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**NpmUpstreamRequestPatch**](NpmUpstreamRequestPatch.md)|  | [optional]

### Return type

[**NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamNpmRead"></a>
# **reposUpstreamNpmRead**
> NpmUpstream reposUpstreamNpmRead(owner, identifier, slugPerm)

Retrieve a npm upstream config for this repository.

Retrieve a npm upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    NpmUpstream result = apiInstance.reposUpstreamNpmRead(owner, identifier, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamNpmRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamNpmUpdate"></a>
# **reposUpstreamNpmUpdate**
> NpmUpstream reposUpstreamNpmUpdate(owner, identifier, slugPerm, data)

Update a npm upstream config for this repository.

Update a npm upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
NpmUpstreamRequest data = new NpmUpstreamRequest(); // NpmUpstreamRequest | 
try {
    NpmUpstream result = apiInstance.reposUpstreamNpmUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamNpmUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**NpmUpstreamRequest**](NpmUpstreamRequest.md)|  | [optional]

### Return type

[**NpmUpstream**](NpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamNugetCreate"></a>
# **reposUpstreamNugetCreate**
> NugetUpstream reposUpstreamNugetCreate(owner, identifier, data)

Create a NuGet upstream config for this repository.

Create a NuGet upstream config for this repository.

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
NugetUpstreamRequest data = new NugetUpstreamRequest(); // NugetUpstreamRequest | 
try {
    NugetUpstream result = apiInstance.reposUpstreamNugetCreate(owner, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamNugetCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**NugetUpstreamRequest**](NugetUpstreamRequest.md)|  | [optional]

### Return type

[**NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamNugetDelete"></a>
# **reposUpstreamNugetDelete**
> reposUpstreamNugetDelete(owner, identifier, slugPerm)

Delete a NuGet upstream config for this repository.

Delete a NuGet upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.reposUpstreamNugetDelete(owner, identifier, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamNugetDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamNugetList"></a>
# **reposUpstreamNugetList**
> List&lt;NugetUpstream&gt; reposUpstreamNugetList(owner, identifier, page, pageSize)

List NuGet upstream configs for this repository.

List NuGet upstream configs for this repository.

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
    List<NugetUpstream> result = apiInstance.reposUpstreamNugetList(owner, identifier, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamNugetList");
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

[**List&lt;NugetUpstream&gt;**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamNugetPartialUpdate"></a>
# **reposUpstreamNugetPartialUpdate**
> NugetUpstream reposUpstreamNugetPartialUpdate(owner, identifier, slugPerm, data)

Partially update a NuGet upstream config for this repository.

Partially update a NuGet upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
NugetUpstreamRequestPatch data = new NugetUpstreamRequestPatch(); // NugetUpstreamRequestPatch | 
try {
    NugetUpstream result = apiInstance.reposUpstreamNugetPartialUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamNugetPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**NugetUpstreamRequestPatch**](NugetUpstreamRequestPatch.md)|  | [optional]

### Return type

[**NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamNugetRead"></a>
# **reposUpstreamNugetRead**
> NugetUpstream reposUpstreamNugetRead(owner, identifier, slugPerm)

Retrieve a NuGet upstream config for this repository.

Retrieve a NuGet upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    NugetUpstream result = apiInstance.reposUpstreamNugetRead(owner, identifier, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamNugetRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamNugetUpdate"></a>
# **reposUpstreamNugetUpdate**
> NugetUpstream reposUpstreamNugetUpdate(owner, identifier, slugPerm, data)

Update a NuGet upstream config for this repository.

Update a NuGet upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
NugetUpstreamRequest data = new NugetUpstreamRequest(); // NugetUpstreamRequest | 
try {
    NugetUpstream result = apiInstance.reposUpstreamNugetUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamNugetUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**NugetUpstreamRequest**](NugetUpstreamRequest.md)|  | [optional]

### Return type

[**NugetUpstream**](NugetUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamPythonCreate"></a>
# **reposUpstreamPythonCreate**
> PythonUpstream reposUpstreamPythonCreate(owner, identifier, data)

Create a Python upstream config for this repository.

Create a Python upstream config for this repository.

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
PythonUpstreamRequest data = new PythonUpstreamRequest(); // PythonUpstreamRequest | 
try {
    PythonUpstream result = apiInstance.reposUpstreamPythonCreate(owner, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamPythonCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**PythonUpstreamRequest**](PythonUpstreamRequest.md)|  | [optional]

### Return type

[**PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamPythonDelete"></a>
# **reposUpstreamPythonDelete**
> reposUpstreamPythonDelete(owner, identifier, slugPerm)

Delete a Python upstream config for this repository.

Delete a Python upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.reposUpstreamPythonDelete(owner, identifier, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamPythonDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamPythonList"></a>
# **reposUpstreamPythonList**
> List&lt;PythonUpstream&gt; reposUpstreamPythonList(owner, identifier, page, pageSize)

List Python upstream configs for this repository.

List Python upstream configs for this repository.

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
    List<PythonUpstream> result = apiInstance.reposUpstreamPythonList(owner, identifier, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamPythonList");
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

[**List&lt;PythonUpstream&gt;**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamPythonPartialUpdate"></a>
# **reposUpstreamPythonPartialUpdate**
> PythonUpstream reposUpstreamPythonPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Python upstream config for this repository.

Partially update a Python upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
PythonUpstreamRequestPatch data = new PythonUpstreamRequestPatch(); // PythonUpstreamRequestPatch | 
try {
    PythonUpstream result = apiInstance.reposUpstreamPythonPartialUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamPythonPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**PythonUpstreamRequestPatch**](PythonUpstreamRequestPatch.md)|  | [optional]

### Return type

[**PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamPythonRead"></a>
# **reposUpstreamPythonRead**
> PythonUpstream reposUpstreamPythonRead(owner, identifier, slugPerm)

Retrieve a Python upstream config for this repository.

Retrieve a Python upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    PythonUpstream result = apiInstance.reposUpstreamPythonRead(owner, identifier, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamPythonRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamPythonUpdate"></a>
# **reposUpstreamPythonUpdate**
> PythonUpstream reposUpstreamPythonUpdate(owner, identifier, slugPerm, data)

Update a Python upstream config for this repository.

Update a Python upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
PythonUpstreamRequest data = new PythonUpstreamRequest(); // PythonUpstreamRequest | 
try {
    PythonUpstream result = apiInstance.reposUpstreamPythonUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamPythonUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**PythonUpstreamRequest**](PythonUpstreamRequest.md)|  | [optional]

### Return type

[**PythonUpstream**](PythonUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamRpmCreate"></a>
# **reposUpstreamRpmCreate**
> RpmUpstream reposUpstreamRpmCreate(owner, identifier, data)

Create a RedHat upstream config for this repository.

Create a RedHat upstream config for this repository.

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
RpmUpstreamRequest data = new RpmUpstreamRequest(); // RpmUpstreamRequest | 
try {
    RpmUpstream result = apiInstance.reposUpstreamRpmCreate(owner, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamRpmCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**RpmUpstreamRequest**](RpmUpstreamRequest.md)|  | [optional]

### Return type

[**RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamRpmDelete"></a>
# **reposUpstreamRpmDelete**
> reposUpstreamRpmDelete(owner, identifier, slugPerm)

Delete a RedHat upstream config for this repository.

Delete a RedHat upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.reposUpstreamRpmDelete(owner, identifier, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamRpmDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamRpmList"></a>
# **reposUpstreamRpmList**
> List&lt;RpmUpstream&gt; reposUpstreamRpmList(owner, identifier, page, pageSize)

List RedHat upstream configs for this repository.

List RedHat upstream configs for this repository.

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
    List<RpmUpstream> result = apiInstance.reposUpstreamRpmList(owner, identifier, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamRpmList");
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

[**List&lt;RpmUpstream&gt;**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamRpmPartialUpdate"></a>
# **reposUpstreamRpmPartialUpdate**
> RpmUpstream reposUpstreamRpmPartialUpdate(owner, identifier, slugPerm, data)

Partially update a RedHat upstream config for this repository.

Partially update a RedHat upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
RpmUpstreamRequestPatch data = new RpmUpstreamRequestPatch(); // RpmUpstreamRequestPatch | 
try {
    RpmUpstream result = apiInstance.reposUpstreamRpmPartialUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamRpmPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**RpmUpstreamRequestPatch**](RpmUpstreamRequestPatch.md)|  | [optional]

### Return type

[**RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamRpmRead"></a>
# **reposUpstreamRpmRead**
> RpmUpstream reposUpstreamRpmRead(owner, identifier, slugPerm)

Retrieve a RedHat upstream config for this repository.

Retrieve a RedHat upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    RpmUpstream result = apiInstance.reposUpstreamRpmRead(owner, identifier, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamRpmRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamRpmUpdate"></a>
# **reposUpstreamRpmUpdate**
> RpmUpstream reposUpstreamRpmUpdate(owner, identifier, slugPerm, data)

Update a RedHat upstream config for this repository.

Update a RedHat upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
RpmUpstreamRequest data = new RpmUpstreamRequest(); // RpmUpstreamRequest | 
try {
    RpmUpstream result = apiInstance.reposUpstreamRpmUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamRpmUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**RpmUpstreamRequest**](RpmUpstreamRequest.md)|  | [optional]

### Return type

[**RpmUpstream**](RpmUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamRubyCreate"></a>
# **reposUpstreamRubyCreate**
> RubyUpstream reposUpstreamRubyCreate(owner, identifier, data)

Create a Ruby upstream config for this repository.

Create a Ruby upstream config for this repository.

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
RubyUpstreamRequest data = new RubyUpstreamRequest(); // RubyUpstreamRequest | 
try {
    RubyUpstream result = apiInstance.reposUpstreamRubyCreate(owner, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamRubyCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**RubyUpstreamRequest**](RubyUpstreamRequest.md)|  | [optional]

### Return type

[**RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamRubyDelete"></a>
# **reposUpstreamRubyDelete**
> reposUpstreamRubyDelete(owner, identifier, slugPerm)

Delete a Ruby upstream config for this repository.

Delete a Ruby upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.reposUpstreamRubyDelete(owner, identifier, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamRubyDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamRubyList"></a>
# **reposUpstreamRubyList**
> List&lt;RubyUpstream&gt; reposUpstreamRubyList(owner, identifier, page, pageSize)

List Ruby upstream configs for this repository.

List Ruby upstream configs for this repository.

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
    List<RubyUpstream> result = apiInstance.reposUpstreamRubyList(owner, identifier, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamRubyList");
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

[**List&lt;RubyUpstream&gt;**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamRubyPartialUpdate"></a>
# **reposUpstreamRubyPartialUpdate**
> RubyUpstream reposUpstreamRubyPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Ruby upstream config for this repository.

Partially update a Ruby upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
RubyUpstreamRequestPatch data = new RubyUpstreamRequestPatch(); // RubyUpstreamRequestPatch | 
try {
    RubyUpstream result = apiInstance.reposUpstreamRubyPartialUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamRubyPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**RubyUpstreamRequestPatch**](RubyUpstreamRequestPatch.md)|  | [optional]

### Return type

[**RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamRubyRead"></a>
# **reposUpstreamRubyRead**
> RubyUpstream reposUpstreamRubyRead(owner, identifier, slugPerm)

Retrieve a Ruby upstream config for this repository.

Retrieve a Ruby upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    RubyUpstream result = apiInstance.reposUpstreamRubyRead(owner, identifier, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamRubyRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamRubyUpdate"></a>
# **reposUpstreamRubyUpdate**
> RubyUpstream reposUpstreamRubyUpdate(owner, identifier, slugPerm, data)

Update a Ruby upstream config for this repository.

Update a Ruby upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
RubyUpstreamRequest data = new RubyUpstreamRequest(); // RubyUpstreamRequest | 
try {
    RubyUpstream result = apiInstance.reposUpstreamRubyUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamRubyUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**RubyUpstreamRequest**](RubyUpstreamRequest.md)|  | [optional]

### Return type

[**RubyUpstream**](RubyUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamSwiftCreate"></a>
# **reposUpstreamSwiftCreate**
> SwiftUpstream reposUpstreamSwiftCreate(owner, identifier, data)

Create a Swift upstream config for this repository.

Create a Swift upstream config for this repository.

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
SwiftUpstreamRequest data = new SwiftUpstreamRequest(); // SwiftUpstreamRequest | 
try {
    SwiftUpstream result = apiInstance.reposUpstreamSwiftCreate(owner, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamSwiftCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**SwiftUpstreamRequest**](SwiftUpstreamRequest.md)|  | [optional]

### Return type

[**SwiftUpstream**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamSwiftDelete"></a>
# **reposUpstreamSwiftDelete**
> reposUpstreamSwiftDelete(owner, identifier, slugPerm)

Delete a Swift upstream config for this repository.

Delete a Swift upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    apiInstance.reposUpstreamSwiftDelete(owner, identifier, slugPerm);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamSwiftDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamSwiftList"></a>
# **reposUpstreamSwiftList**
> List&lt;SwiftUpstream&gt; reposUpstreamSwiftList(owner, identifier, page, pageSize)

List Swift upstream configs for this repository.

List Swift upstream configs for this repository.

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
    List<SwiftUpstream> result = apiInstance.reposUpstreamSwiftList(owner, identifier, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamSwiftList");
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

[**List&lt;SwiftUpstream&gt;**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamSwiftPartialUpdate"></a>
# **reposUpstreamSwiftPartialUpdate**
> SwiftUpstream reposUpstreamSwiftPartialUpdate(owner, identifier, slugPerm, data)

Partially update a Swift upstream config for this repository.

Partially update a Swift upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
SwiftUpstreamRequestPatch data = new SwiftUpstreamRequestPatch(); // SwiftUpstreamRequestPatch | 
try {
    SwiftUpstream result = apiInstance.reposUpstreamSwiftPartialUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamSwiftPartialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**SwiftUpstreamRequestPatch**](SwiftUpstreamRequestPatch.md)|  | [optional]

### Return type

[**SwiftUpstream**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamSwiftRead"></a>
# **reposUpstreamSwiftRead**
> SwiftUpstream reposUpstreamSwiftRead(owner, identifier, slugPerm)

Retrieve a Swift upstream config for this repository.

Retrieve a Swift upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
try {
    SwiftUpstream result = apiInstance.reposUpstreamSwiftRead(owner, identifier, slugPerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamSwiftRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |

### Return type

[**SwiftUpstream**](SwiftUpstream.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reposUpstreamSwiftUpdate"></a>
# **reposUpstreamSwiftUpdate**
> SwiftUpstream reposUpstreamSwiftUpdate(owner, identifier, slugPerm, data)

Update a Swift upstream config for this repository.

Update a Swift upstream config for this repository.

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
String slugPerm = "slugPerm_example"; // String | 
SwiftUpstreamRequest data = new SwiftUpstreamRequest(); // SwiftUpstreamRequest | 
try {
    SwiftUpstream result = apiInstance.reposUpstreamSwiftUpdate(owner, identifier, slugPerm, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReposApi#reposUpstreamSwiftUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **identifier** | **String**|  |
 **slugPerm** | **String**|  |
 **data** | [**SwiftUpstreamRequest**](SwiftUpstreamRequest.md)|  | [optional]

### Return type

[**SwiftUpstream**](SwiftUpstream.md)

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

