# PackagesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**packagesCopy**](PackagesApi.md#packagesCopy) | **POST** /packages/{owner}/{repo}/{identifier}/copy/ | Copy a package to another repository.
[**packagesDelete**](PackagesApi.md#packagesDelete) | **DELETE** /packages/{owner}/{repo}/{identifier}/ | Delete a specific package in a repository.
[**packagesList**](PackagesApi.md#packagesList) | **GET** /packages/{owner}/{repo}/ | Get a list of all packages associated with repository.
[**packagesMove**](PackagesApi.md#packagesMove) | **POST** /packages/{owner}/{repo}/{identifier}/move/ | Move a package to another repository.
[**packagesRead**](PackagesApi.md#packagesRead) | **GET** /packages/{owner}/{repo}/{identifier}/ | Get a specific package in a repository.
[**packagesResync**](PackagesApi.md#packagesResync) | **POST** /packages/{owner}/{repo}/{identifier}/resync/ | Schedule a package for resynchronisation.
[**packagesScan**](PackagesApi.md#packagesScan) | **POST** /packages/{owner}/{repo}/{identifier}/scan/ | Schedule a package for scanning.
[**packagesStatus**](PackagesApi.md#packagesStatus) | **GET** /packages/{owner}/{repo}/{identifier}/status/ | Get the synchronisation status for a package.
[**packagesTag**](PackagesApi.md#packagesTag) | **POST** /packages/{owner}/{repo}/{identifier}/tag/ | Add/Replace/Remove tags for a package.
[**packagesUploadAlpine**](PackagesApi.md#packagesUploadAlpine) | **POST** /packages/{owner}/{repo}/upload/alpine/ | Create a new Alpine package
[**packagesUploadCargo**](PackagesApi.md#packagesUploadCargo) | **POST** /packages/{owner}/{repo}/upload/cargo/ | Create a new Cargo package
[**packagesUploadCocoapods**](PackagesApi.md#packagesUploadCocoapods) | **POST** /packages/{owner}/{repo}/upload/cocoapods/ | Create a new CocoaPods package
[**packagesUploadComposer**](PackagesApi.md#packagesUploadComposer) | **POST** /packages/{owner}/{repo}/upload/composer/ | Create a new Composer package
[**packagesUploadConan**](PackagesApi.md#packagesUploadConan) | **POST** /packages/{owner}/{repo}/upload/conan/ | Create a new Conan package
[**packagesUploadCran**](PackagesApi.md#packagesUploadCran) | **POST** /packages/{owner}/{repo}/upload/cran/ | Create a new CRAN package
[**packagesUploadDart**](PackagesApi.md#packagesUploadDart) | **POST** /packages/{owner}/{repo}/upload/dart/ | Create a new Dart package
[**packagesUploadDeb**](PackagesApi.md#packagesUploadDeb) | **POST** /packages/{owner}/{repo}/upload/deb/ | Create a new Debian package
[**packagesUploadDocker**](PackagesApi.md#packagesUploadDocker) | **POST** /packages/{owner}/{repo}/upload/docker/ | Create a new Docker package
[**packagesUploadGo**](PackagesApi.md#packagesUploadGo) | **POST** /packages/{owner}/{repo}/upload/go/ | Create a new Go package
[**packagesUploadHelm**](PackagesApi.md#packagesUploadHelm) | **POST** /packages/{owner}/{repo}/upload/helm/ | Create a new Helm package
[**packagesUploadLuarocks**](PackagesApi.md#packagesUploadLuarocks) | **POST** /packages/{owner}/{repo}/upload/luarocks/ | Create a new LuaRocks package
[**packagesUploadMaven**](PackagesApi.md#packagesUploadMaven) | **POST** /packages/{owner}/{repo}/upload/maven/ | Create a new Maven package
[**packagesUploadNpm**](PackagesApi.md#packagesUploadNpm) | **POST** /packages/{owner}/{repo}/upload/npm/ | Create a new npm package
[**packagesUploadNuget**](PackagesApi.md#packagesUploadNuget) | **POST** /packages/{owner}/{repo}/upload/nuget/ | Create a new NuGet package
[**packagesUploadPython**](PackagesApi.md#packagesUploadPython) | **POST** /packages/{owner}/{repo}/upload/python/ | Create a new Python package
[**packagesUploadRaw**](PackagesApi.md#packagesUploadRaw) | **POST** /packages/{owner}/{repo}/upload/raw/ | Create a new Raw package
[**packagesUploadRpm**](PackagesApi.md#packagesUploadRpm) | **POST** /packages/{owner}/{repo}/upload/rpm/ | Create a new RedHat package
[**packagesUploadRuby**](PackagesApi.md#packagesUploadRuby) | **POST** /packages/{owner}/{repo}/upload/ruby/ | Create a new Ruby package
[**packagesUploadTerraform**](PackagesApi.md#packagesUploadTerraform) | **POST** /packages/{owner}/{repo}/upload/terraform/ | Create a new Terraform package
[**packagesUploadVagrant**](PackagesApi.md#packagesUploadVagrant) | **POST** /packages/{owner}/{repo}/upload/vagrant/ | Create a new Vagrant package
[**packagesValidateUploadAlpine**](PackagesApi.md#packagesValidateUploadAlpine) | **POST** /packages/{owner}/{repo}/validate-upload/alpine/ | Validate parameters for create Alpine package
[**packagesValidateUploadCargo**](PackagesApi.md#packagesValidateUploadCargo) | **POST** /packages/{owner}/{repo}/validate-upload/cargo/ | Validate parameters for create Cargo package
[**packagesValidateUploadCocoapods**](PackagesApi.md#packagesValidateUploadCocoapods) | **POST** /packages/{owner}/{repo}/validate-upload/cocoapods/ | Validate parameters for create CocoaPods package
[**packagesValidateUploadComposer**](PackagesApi.md#packagesValidateUploadComposer) | **POST** /packages/{owner}/{repo}/validate-upload/composer/ | Validate parameters for create Composer package
[**packagesValidateUploadConan**](PackagesApi.md#packagesValidateUploadConan) | **POST** /packages/{owner}/{repo}/validate-upload/conan/ | Validate parameters for create Conan package
[**packagesValidateUploadCran**](PackagesApi.md#packagesValidateUploadCran) | **POST** /packages/{owner}/{repo}/validate-upload/cran/ | Validate parameters for create CRAN package
[**packagesValidateUploadDart**](PackagesApi.md#packagesValidateUploadDart) | **POST** /packages/{owner}/{repo}/validate-upload/dart/ | Validate parameters for create Dart package
[**packagesValidateUploadDeb**](PackagesApi.md#packagesValidateUploadDeb) | **POST** /packages/{owner}/{repo}/validate-upload/deb/ | Validate parameters for create Debian package
[**packagesValidateUploadDocker**](PackagesApi.md#packagesValidateUploadDocker) | **POST** /packages/{owner}/{repo}/validate-upload/docker/ | Validate parameters for create Docker package
[**packagesValidateUploadGo**](PackagesApi.md#packagesValidateUploadGo) | **POST** /packages/{owner}/{repo}/validate-upload/go/ | Validate parameters for create Go package
[**packagesValidateUploadHelm**](PackagesApi.md#packagesValidateUploadHelm) | **POST** /packages/{owner}/{repo}/validate-upload/helm/ | Validate parameters for create Helm package
[**packagesValidateUploadLuarocks**](PackagesApi.md#packagesValidateUploadLuarocks) | **POST** /packages/{owner}/{repo}/validate-upload/luarocks/ | Validate parameters for create LuaRocks package
[**packagesValidateUploadMaven**](PackagesApi.md#packagesValidateUploadMaven) | **POST** /packages/{owner}/{repo}/validate-upload/maven/ | Validate parameters for create Maven package
[**packagesValidateUploadNpm**](PackagesApi.md#packagesValidateUploadNpm) | **POST** /packages/{owner}/{repo}/validate-upload/npm/ | Validate parameters for create npm package
[**packagesValidateUploadNuget**](PackagesApi.md#packagesValidateUploadNuget) | **POST** /packages/{owner}/{repo}/validate-upload/nuget/ | Validate parameters for create NuGet package
[**packagesValidateUploadPython**](PackagesApi.md#packagesValidateUploadPython) | **POST** /packages/{owner}/{repo}/validate-upload/python/ | Validate parameters for create Python package
[**packagesValidateUploadRaw**](PackagesApi.md#packagesValidateUploadRaw) | **POST** /packages/{owner}/{repo}/validate-upload/raw/ | Validate parameters for create Raw package
[**packagesValidateUploadRpm**](PackagesApi.md#packagesValidateUploadRpm) | **POST** /packages/{owner}/{repo}/validate-upload/rpm/ | Validate parameters for create RedHat package
[**packagesValidateUploadRuby**](PackagesApi.md#packagesValidateUploadRuby) | **POST** /packages/{owner}/{repo}/validate-upload/ruby/ | Validate parameters for create Ruby package
[**packagesValidateUploadTerraform**](PackagesApi.md#packagesValidateUploadTerraform) | **POST** /packages/{owner}/{repo}/validate-upload/terraform/ | Validate parameters for create Terraform package
[**packagesValidateUploadVagrant**](PackagesApi.md#packagesValidateUploadVagrant) | **POST** /packages/{owner}/{repo}/validate-upload/vagrant/ | Validate parameters for create Vagrant package


<a name="packagesCopy"></a>
# **packagesCopy**
> PackageCopy packagesCopy(owner, repo, identifier, data)

Copy a package to another repository.

Copy a package to another repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
PackagesCopy data = new PackagesCopy(); // PackagesCopy | 
try {
    PackageCopy result = apiInstance.packagesCopy(owner, repo, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesCopy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**PackagesCopy**](PackagesCopy.md)|  | [optional]

### Return type

[**PackageCopy**](PackageCopy.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesDelete"></a>
# **packagesDelete**
> packagesDelete(owner, repo, identifier)

Delete a specific package in a repository.

Delete a specific package in a repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    apiInstance.packagesDelete(owner, repo, identifier);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesDelete");
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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="packagesList"></a>
# **packagesList**
> List&lt;ModelPackage&gt; packagesList(owner, repo, page, pageSize, query)

Get a list of all packages associated with repository.

Get a list of all packages associated with repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
Integer page = 56; // Integer | A page number within the paginated result set.
Integer pageSize = 56; // Integer | Number of results to return per page.
String query = "query_example"; // String | A search term for querying names, filenames, versions, distributions, architectures, formats or statuses of packages.
try {
    List<ModelPackage> result = apiInstance.packagesList(owner, repo, page, pageSize, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesList");
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
 **query** | **String**| A search term for querying names, filenames, versions, distributions, architectures, formats or statuses of packages. | [optional]

### Return type

[**List&lt;ModelPackage&gt;**](ModelPackage.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="packagesMove"></a>
# **packagesMove**
> PackageMove packagesMove(owner, repo, identifier, data)

Move a package to another repository.

Move a package to another repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
PackagesMove data = new PackagesMove(); // PackagesMove | 
try {
    PackageMove result = apiInstance.packagesMove(owner, repo, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesMove");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**PackagesMove**](PackagesMove.md)|  | [optional]

### Return type

[**PackageMove**](PackageMove.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesRead"></a>
# **packagesRead**
> ModelPackage packagesRead(owner, repo, identifier)

Get a specific package in a repository.

Get a specific package in a repository.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    ModelPackage result = apiInstance.packagesRead(owner, repo, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesRead");
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

[**ModelPackage**](ModelPackage.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="packagesResync"></a>
# **packagesResync**
> ModelPackage packagesResync(owner, repo, identifier, data)

Schedule a package for resynchronisation.

Schedule a package for resynchronisation.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
PackagesResync data = new PackagesResync(); // PackagesResync | 
try {
    ModelPackage result = apiInstance.packagesResync(owner, repo, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesResync");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**PackagesResync**](PackagesResync.md)|  | [optional]

### Return type

[**ModelPackage**](ModelPackage.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesScan"></a>
# **packagesScan**
> ModelPackage packagesScan(owner, repo, identifier, data)

Schedule a package for scanning.

Schedule a package for scanning.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
PackagesScan data = new PackagesScan(); // PackagesScan | 
try {
    ModelPackage result = apiInstance.packagesScan(owner, repo, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesScan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**PackagesScan**](PackagesScan.md)|  | [optional]

### Return type

[**ModelPackage**](ModelPackage.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesStatus"></a>
# **packagesStatus**
> PackageStatus packagesStatus(owner, repo, identifier)

Get the synchronisation status for a package.

Get the synchronisation status for a package.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    PackageStatus result = apiInstance.packagesStatus(owner, repo, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesStatus");
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

[**PackageStatus**](PackageStatus.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="packagesTag"></a>
# **packagesTag**
> ModelPackage packagesTag(owner, repo, identifier, data)

Add/Replace/Remove tags for a package.

Add/Replace/Remove tags for a package.

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
PackagesTag data = new PackagesTag(); // PackagesTag | 
try {
    ModelPackage result = apiInstance.packagesTag(owner, repo, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**PackagesTag**](PackagesTag.md)|  | [optional]

### Return type

[**ModelPackage**](ModelPackage.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadAlpine"></a>
# **packagesUploadAlpine**
> AlpinePackageUpload packagesUploadAlpine(owner, repo, data)

Create a new Alpine package

Create a new Alpine package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadAlpine data = new PackagesUploadAlpine(); // PackagesUploadAlpine | 
try {
    AlpinePackageUpload result = apiInstance.packagesUploadAlpine(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadAlpine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadAlpine**](PackagesUploadAlpine.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadCargo"></a>
# **packagesUploadCargo**
> AlpinePackageUpload packagesUploadCargo(owner, repo, data)

Create a new Cargo package

Create a new Cargo package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadCargo data = new PackagesUploadCargo(); // PackagesUploadCargo | 
try {
    AlpinePackageUpload result = apiInstance.packagesUploadCargo(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadCargo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadCargo**](PackagesUploadCargo.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadCocoapods"></a>
# **packagesUploadCocoapods**
> AlpinePackageUpload packagesUploadCocoapods(owner, repo, data)

Create a new CocoaPods package

Create a new CocoaPods package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadCocoapods data = new PackagesUploadCocoapods(); // PackagesUploadCocoapods | 
try {
    AlpinePackageUpload result = apiInstance.packagesUploadCocoapods(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadCocoapods");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadCocoapods**](PackagesUploadCocoapods.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadComposer"></a>
# **packagesUploadComposer**
> AlpinePackageUpload packagesUploadComposer(owner, repo, data)

Create a new Composer package

Create a new Composer package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadComposer data = new PackagesUploadComposer(); // PackagesUploadComposer | 
try {
    AlpinePackageUpload result = apiInstance.packagesUploadComposer(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadComposer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadComposer**](PackagesUploadComposer.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadConan"></a>
# **packagesUploadConan**
> ConanPackageUpload packagesUploadConan(owner, repo, data)

Create a new Conan package

Create a new Conan package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadConan data = new PackagesUploadConan(); // PackagesUploadConan | 
try {
    ConanPackageUpload result = apiInstance.packagesUploadConan(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadConan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadConan**](PackagesUploadConan.md)|  | [optional]

### Return type

[**ConanPackageUpload**](ConanPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadCran"></a>
# **packagesUploadCran**
> AlpinePackageUpload packagesUploadCran(owner, repo, data)

Create a new CRAN package

Create a new CRAN package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadCran data = new PackagesUploadCran(); // PackagesUploadCran | 
try {
    AlpinePackageUpload result = apiInstance.packagesUploadCran(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadCran");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadCran**](PackagesUploadCran.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadDart"></a>
# **packagesUploadDart**
> AlpinePackageUpload packagesUploadDart(owner, repo, data)

Create a new Dart package

Create a new Dart package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadDart data = new PackagesUploadDart(); // PackagesUploadDart | 
try {
    AlpinePackageUpload result = apiInstance.packagesUploadDart(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadDart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadDart**](PackagesUploadDart.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadDeb"></a>
# **packagesUploadDeb**
> AlpinePackageUpload packagesUploadDeb(owner, repo, data)

Create a new Debian package

Create a new Debian package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadDeb data = new PackagesUploadDeb(); // PackagesUploadDeb | 
try {
    AlpinePackageUpload result = apiInstance.packagesUploadDeb(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadDeb");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadDeb**](PackagesUploadDeb.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadDocker"></a>
# **packagesUploadDocker**
> AlpinePackageUpload packagesUploadDocker(owner, repo, data)

Create a new Docker package

Create a new Docker package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadDocker data = new PackagesUploadDocker(); // PackagesUploadDocker | 
try {
    AlpinePackageUpload result = apiInstance.packagesUploadDocker(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadDocker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadDocker**](PackagesUploadDocker.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadGo"></a>
# **packagesUploadGo**
> AlpinePackageUpload packagesUploadGo(owner, repo, data)

Create a new Go package

Create a new Go package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadGo data = new PackagesUploadGo(); // PackagesUploadGo | 
try {
    AlpinePackageUpload result = apiInstance.packagesUploadGo(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadGo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadGo**](PackagesUploadGo.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadHelm"></a>
# **packagesUploadHelm**
> AlpinePackageUpload packagesUploadHelm(owner, repo, data)

Create a new Helm package

Create a new Helm package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadHelm data = new PackagesUploadHelm(); // PackagesUploadHelm | 
try {
    AlpinePackageUpload result = apiInstance.packagesUploadHelm(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadHelm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadHelm**](PackagesUploadHelm.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadLuarocks"></a>
# **packagesUploadLuarocks**
> AlpinePackageUpload packagesUploadLuarocks(owner, repo, data)

Create a new LuaRocks package

Create a new LuaRocks package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadLuarocks data = new PackagesUploadLuarocks(); // PackagesUploadLuarocks | 
try {
    AlpinePackageUpload result = apiInstance.packagesUploadLuarocks(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadLuarocks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadLuarocks**](PackagesUploadLuarocks.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadMaven"></a>
# **packagesUploadMaven**
> MavenPackageUpload packagesUploadMaven(owner, repo, data)

Create a new Maven package

Create a new Maven package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadMaven data = new PackagesUploadMaven(); // PackagesUploadMaven | 
try {
    MavenPackageUpload result = apiInstance.packagesUploadMaven(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadMaven");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadMaven**](PackagesUploadMaven.md)|  | [optional]

### Return type

[**MavenPackageUpload**](MavenPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadNpm"></a>
# **packagesUploadNpm**
> AlpinePackageUpload packagesUploadNpm(owner, repo, data)

Create a new npm package

Create a new npm package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadNpm data = new PackagesUploadNpm(); // PackagesUploadNpm | 
try {
    AlpinePackageUpload result = apiInstance.packagesUploadNpm(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadNpm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadNpm**](PackagesUploadNpm.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadNuget"></a>
# **packagesUploadNuget**
> AlpinePackageUpload packagesUploadNuget(owner, repo, data)

Create a new NuGet package

Create a new NuGet package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadNuget data = new PackagesUploadNuget(); // PackagesUploadNuget | 
try {
    AlpinePackageUpload result = apiInstance.packagesUploadNuget(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadNuget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadNuget**](PackagesUploadNuget.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadPython"></a>
# **packagesUploadPython**
> AlpinePackageUpload packagesUploadPython(owner, repo, data)

Create a new Python package

Create a new Python package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadPython data = new PackagesUploadPython(); // PackagesUploadPython | 
try {
    AlpinePackageUpload result = apiInstance.packagesUploadPython(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadPython");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadPython**](PackagesUploadPython.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadRaw"></a>
# **packagesUploadRaw**
> RawPackageUpload packagesUploadRaw(owner, repo, data)

Create a new Raw package

Create a new Raw package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadRaw data = new PackagesUploadRaw(); // PackagesUploadRaw | 
try {
    RawPackageUpload result = apiInstance.packagesUploadRaw(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadRaw");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadRaw**](PackagesUploadRaw.md)|  | [optional]

### Return type

[**RawPackageUpload**](RawPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadRpm"></a>
# **packagesUploadRpm**
> AlpinePackageUpload packagesUploadRpm(owner, repo, data)

Create a new RedHat package

Create a new RedHat package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadRpm data = new PackagesUploadRpm(); // PackagesUploadRpm | 
try {
    AlpinePackageUpload result = apiInstance.packagesUploadRpm(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadRpm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadRpm**](PackagesUploadRpm.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadRuby"></a>
# **packagesUploadRuby**
> AlpinePackageUpload packagesUploadRuby(owner, repo, data)

Create a new Ruby package

Create a new Ruby package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadRuby data = new PackagesUploadRuby(); // PackagesUploadRuby | 
try {
    AlpinePackageUpload result = apiInstance.packagesUploadRuby(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadRuby");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadRuby**](PackagesUploadRuby.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadTerraform"></a>
# **packagesUploadTerraform**
> AlpinePackageUpload packagesUploadTerraform(owner, repo, data)

Create a new Terraform package

Create a new Terraform package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadTerraform data = new PackagesUploadTerraform(); // PackagesUploadTerraform | 
try {
    AlpinePackageUpload result = apiInstance.packagesUploadTerraform(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadTerraform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadTerraform**](PackagesUploadTerraform.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesUploadVagrant"></a>
# **packagesUploadVagrant**
> VagrantPackageUpload packagesUploadVagrant(owner, repo, data)

Create a new Vagrant package

Create a new Vagrant package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesUploadVagrant data = new PackagesUploadVagrant(); // PackagesUploadVagrant | 
try {
    VagrantPackageUpload result = apiInstance.packagesUploadVagrant(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadVagrant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesUploadVagrant**](PackagesUploadVagrant.md)|  | [optional]

### Return type

[**VagrantPackageUpload**](VagrantPackageUpload.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadAlpine"></a>
# **packagesValidateUploadAlpine**
> packagesValidateUploadAlpine(owner, repo, data)

Validate parameters for create Alpine package

Validate parameters for create Alpine package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadAlpine data = new PackagesValidateuploadAlpine(); // PackagesValidateuploadAlpine | 
try {
    apiInstance.packagesValidateUploadAlpine(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadAlpine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadAlpine**](PackagesValidateuploadAlpine.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadCargo"></a>
# **packagesValidateUploadCargo**
> packagesValidateUploadCargo(owner, repo, data)

Validate parameters for create Cargo package

Validate parameters for create Cargo package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadCargo data = new PackagesValidateuploadCargo(); // PackagesValidateuploadCargo | 
try {
    apiInstance.packagesValidateUploadCargo(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadCargo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadCargo**](PackagesValidateuploadCargo.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadCocoapods"></a>
# **packagesValidateUploadCocoapods**
> packagesValidateUploadCocoapods(owner, repo, data)

Validate parameters for create CocoaPods package

Validate parameters for create CocoaPods package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadCocoapods data = new PackagesValidateuploadCocoapods(); // PackagesValidateuploadCocoapods | 
try {
    apiInstance.packagesValidateUploadCocoapods(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadCocoapods");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadCocoapods**](PackagesValidateuploadCocoapods.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadComposer"></a>
# **packagesValidateUploadComposer**
> packagesValidateUploadComposer(owner, repo, data)

Validate parameters for create Composer package

Validate parameters for create Composer package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadComposer data = new PackagesValidateuploadComposer(); // PackagesValidateuploadComposer | 
try {
    apiInstance.packagesValidateUploadComposer(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadComposer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadComposer**](PackagesValidateuploadComposer.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadConan"></a>
# **packagesValidateUploadConan**
> packagesValidateUploadConan(owner, repo, data)

Validate parameters for create Conan package

Validate parameters for create Conan package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadConan data = new PackagesValidateuploadConan(); // PackagesValidateuploadConan | 
try {
    apiInstance.packagesValidateUploadConan(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadConan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadConan**](PackagesValidateuploadConan.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadCran"></a>
# **packagesValidateUploadCran**
> packagesValidateUploadCran(owner, repo, data)

Validate parameters for create CRAN package

Validate parameters for create CRAN package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadCran data = new PackagesValidateuploadCran(); // PackagesValidateuploadCran | 
try {
    apiInstance.packagesValidateUploadCran(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadCran");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadCran**](PackagesValidateuploadCran.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadDart"></a>
# **packagesValidateUploadDart**
> packagesValidateUploadDart(owner, repo, data)

Validate parameters for create Dart package

Validate parameters for create Dart package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadDart data = new PackagesValidateuploadDart(); // PackagesValidateuploadDart | 
try {
    apiInstance.packagesValidateUploadDart(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadDart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadDart**](PackagesValidateuploadDart.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadDeb"></a>
# **packagesValidateUploadDeb**
> packagesValidateUploadDeb(owner, repo, data)

Validate parameters for create Debian package

Validate parameters for create Debian package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadDeb data = new PackagesValidateuploadDeb(); // PackagesValidateuploadDeb | 
try {
    apiInstance.packagesValidateUploadDeb(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadDeb");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadDeb**](PackagesValidateuploadDeb.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadDocker"></a>
# **packagesValidateUploadDocker**
> packagesValidateUploadDocker(owner, repo, data)

Validate parameters for create Docker package

Validate parameters for create Docker package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadDocker data = new PackagesValidateuploadDocker(); // PackagesValidateuploadDocker | 
try {
    apiInstance.packagesValidateUploadDocker(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadDocker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadDocker**](PackagesValidateuploadDocker.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadGo"></a>
# **packagesValidateUploadGo**
> packagesValidateUploadGo(owner, repo, data)

Validate parameters for create Go package

Validate parameters for create Go package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadGo data = new PackagesValidateuploadGo(); // PackagesValidateuploadGo | 
try {
    apiInstance.packagesValidateUploadGo(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadGo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadGo**](PackagesValidateuploadGo.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadHelm"></a>
# **packagesValidateUploadHelm**
> packagesValidateUploadHelm(owner, repo, data)

Validate parameters for create Helm package

Validate parameters for create Helm package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadHelm data = new PackagesValidateuploadHelm(); // PackagesValidateuploadHelm | 
try {
    apiInstance.packagesValidateUploadHelm(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadHelm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadHelm**](PackagesValidateuploadHelm.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadLuarocks"></a>
# **packagesValidateUploadLuarocks**
> packagesValidateUploadLuarocks(owner, repo, data)

Validate parameters for create LuaRocks package

Validate parameters for create LuaRocks package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadLuarocks data = new PackagesValidateuploadLuarocks(); // PackagesValidateuploadLuarocks | 
try {
    apiInstance.packagesValidateUploadLuarocks(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadLuarocks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadLuarocks**](PackagesValidateuploadLuarocks.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadMaven"></a>
# **packagesValidateUploadMaven**
> packagesValidateUploadMaven(owner, repo, data)

Validate parameters for create Maven package

Validate parameters for create Maven package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadMaven data = new PackagesValidateuploadMaven(); // PackagesValidateuploadMaven | 
try {
    apiInstance.packagesValidateUploadMaven(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadMaven");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadMaven**](PackagesValidateuploadMaven.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadNpm"></a>
# **packagesValidateUploadNpm**
> packagesValidateUploadNpm(owner, repo, data)

Validate parameters for create npm package

Validate parameters for create npm package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadNpm data = new PackagesValidateuploadNpm(); // PackagesValidateuploadNpm | 
try {
    apiInstance.packagesValidateUploadNpm(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadNpm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadNpm**](PackagesValidateuploadNpm.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadNuget"></a>
# **packagesValidateUploadNuget**
> packagesValidateUploadNuget(owner, repo, data)

Validate parameters for create NuGet package

Validate parameters for create NuGet package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadNuget data = new PackagesValidateuploadNuget(); // PackagesValidateuploadNuget | 
try {
    apiInstance.packagesValidateUploadNuget(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadNuget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadNuget**](PackagesValidateuploadNuget.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadPython"></a>
# **packagesValidateUploadPython**
> packagesValidateUploadPython(owner, repo, data)

Validate parameters for create Python package

Validate parameters for create Python package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadPython data = new PackagesValidateuploadPython(); // PackagesValidateuploadPython | 
try {
    apiInstance.packagesValidateUploadPython(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadPython");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadPython**](PackagesValidateuploadPython.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadRaw"></a>
# **packagesValidateUploadRaw**
> packagesValidateUploadRaw(owner, repo, data)

Validate parameters for create Raw package

Validate parameters for create Raw package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadRaw data = new PackagesValidateuploadRaw(); // PackagesValidateuploadRaw | 
try {
    apiInstance.packagesValidateUploadRaw(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadRaw");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadRaw**](PackagesValidateuploadRaw.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadRpm"></a>
# **packagesValidateUploadRpm**
> packagesValidateUploadRpm(owner, repo, data)

Validate parameters for create RedHat package

Validate parameters for create RedHat package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadRpm data = new PackagesValidateuploadRpm(); // PackagesValidateuploadRpm | 
try {
    apiInstance.packagesValidateUploadRpm(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadRpm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadRpm**](PackagesValidateuploadRpm.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadRuby"></a>
# **packagesValidateUploadRuby**
> packagesValidateUploadRuby(owner, repo, data)

Validate parameters for create Ruby package

Validate parameters for create Ruby package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadRuby data = new PackagesValidateuploadRuby(); // PackagesValidateuploadRuby | 
try {
    apiInstance.packagesValidateUploadRuby(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadRuby");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadRuby**](PackagesValidateuploadRuby.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadTerraform"></a>
# **packagesValidateUploadTerraform**
> packagesValidateUploadTerraform(owner, repo, data)

Validate parameters for create Terraform package

Validate parameters for create Terraform package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadTerraform data = new PackagesValidateuploadTerraform(); // PackagesValidateuploadTerraform | 
try {
    apiInstance.packagesValidateUploadTerraform(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadTerraform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadTerraform**](PackagesValidateuploadTerraform.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="packagesValidateUploadVagrant"></a>
# **packagesValidateUploadVagrant**
> packagesValidateUploadVagrant(owner, repo, data)

Validate parameters for create Vagrant package

Validate parameters for create Vagrant package

### Example
```java
// Import classes:
//import io.cloudsmith.api.ApiClient;
//import io.cloudsmith.api.ApiException;
//import io.cloudsmith.api.Configuration;
//import io.cloudsmith.api.auth.*;
//import io.cloudsmith.api.apis.PackagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PackagesValidateuploadVagrant data = new PackagesValidateuploadVagrant(); // PackagesValidateuploadVagrant | 
try {
    apiInstance.packagesValidateUploadVagrant(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadVagrant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**PackagesValidateuploadVagrant**](PackagesValidateuploadVagrant.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

