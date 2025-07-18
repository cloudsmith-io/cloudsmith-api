# PackagesApi

All URIs are relative to *https://api.cloudsmith.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**packagesCopy**](PackagesApi.md#packagesCopy) | **POST** /packages/{owner}/{repo}/{identifier}/copy/ | Copy a package to another repository.
[**packagesDelete**](PackagesApi.md#packagesDelete) | **DELETE** /packages/{owner}/{repo}/{identifier}/ | Delete a specific package in a repository.
[**packagesDependencies**](PackagesApi.md#packagesDependencies) | **GET** /packages/{owner}/{repo}/{identifier}/dependencies/ | Get the list of dependencies for a package. Transitive dependencies are included where supported.
[**packagesGroupsList**](PackagesApi.md#packagesGroupsList) | **GET** /packages/{owner}/{repo}/groups/ | Return a list of Package Groups in a repository.
[**packagesList**](PackagesApi.md#packagesList) | **GET** /packages/{owner}/{repo}/ | Get a list of all packages associated with repository.
[**packagesMove**](PackagesApi.md#packagesMove) | **POST** /packages/{owner}/{repo}/{identifier}/move/ | Move a package to another repository.
[**packagesQuarantine**](PackagesApi.md#packagesQuarantine) | **POST** /packages/{owner}/{repo}/{identifier}/quarantine/ | Quarantine or release a package.
[**packagesRead**](PackagesApi.md#packagesRead) | **GET** /packages/{owner}/{repo}/{identifier}/ | Get a specific package in a repository.
[**packagesResync**](PackagesApi.md#packagesResync) | **POST** /packages/{owner}/{repo}/{identifier}/resync/ | Schedule a package for resynchronisation.
[**packagesScan**](PackagesApi.md#packagesScan) | **POST** /packages/{owner}/{repo}/{identifier}/scan/ | Schedule a package for scanning.
[**packagesStatus**](PackagesApi.md#packagesStatus) | **GET** /packages/{owner}/{repo}/{identifier}/status/ | Get the synchronization status for a package.
[**packagesTag**](PackagesApi.md#packagesTag) | **POST** /packages/{owner}/{repo}/{identifier}/tag/ | Add/Replace/Remove tags for a package.
[**packagesUploadAlpine**](PackagesApi.md#packagesUploadAlpine) | **POST** /packages/{owner}/{repo}/upload/alpine/ | Create a new Alpine package
[**packagesUploadCargo**](PackagesApi.md#packagesUploadCargo) | **POST** /packages/{owner}/{repo}/upload/cargo/ | Create a new Cargo package
[**packagesUploadCocoapods**](PackagesApi.md#packagesUploadCocoapods) | **POST** /packages/{owner}/{repo}/upload/cocoapods/ | Create a new CocoaPods package
[**packagesUploadComposer**](PackagesApi.md#packagesUploadComposer) | **POST** /packages/{owner}/{repo}/upload/composer/ | Create a new Composer package
[**packagesUploadConan**](PackagesApi.md#packagesUploadConan) | **POST** /packages/{owner}/{repo}/upload/conan/ | Create a new Conan package
[**packagesUploadConda**](PackagesApi.md#packagesUploadConda) | **POST** /packages/{owner}/{repo}/upload/conda/ | Create a new Conda package
[**packagesUploadCran**](PackagesApi.md#packagesUploadCran) | **POST** /packages/{owner}/{repo}/upload/cran/ | Create a new CRAN package
[**packagesUploadDart**](PackagesApi.md#packagesUploadDart) | **POST** /packages/{owner}/{repo}/upload/dart/ | Create a new Dart package
[**packagesUploadDeb**](PackagesApi.md#packagesUploadDeb) | **POST** /packages/{owner}/{repo}/upload/deb/ | Create a new Debian package
[**packagesUploadDocker**](PackagesApi.md#packagesUploadDocker) | **POST** /packages/{owner}/{repo}/upload/docker/ | Create a new Docker package
[**packagesUploadGo**](PackagesApi.md#packagesUploadGo) | **POST** /packages/{owner}/{repo}/upload/go/ | Create a new Go package
[**packagesUploadHelm**](PackagesApi.md#packagesUploadHelm) | **POST** /packages/{owner}/{repo}/upload/helm/ | Create a new Helm package
[**packagesUploadHex**](PackagesApi.md#packagesUploadHex) | **POST** /packages/{owner}/{repo}/upload/hex/ | Create a new Hex package
[**packagesUploadLuarocks**](PackagesApi.md#packagesUploadLuarocks) | **POST** /packages/{owner}/{repo}/upload/luarocks/ | Create a new LuaRocks package
[**packagesUploadMaven**](PackagesApi.md#packagesUploadMaven) | **POST** /packages/{owner}/{repo}/upload/maven/ | Create a new Maven package
[**packagesUploadNpm**](PackagesApi.md#packagesUploadNpm) | **POST** /packages/{owner}/{repo}/upload/npm/ | Create a new npm package
[**packagesUploadNuget**](PackagesApi.md#packagesUploadNuget) | **POST** /packages/{owner}/{repo}/upload/nuget/ | Create a new NuGet package
[**packagesUploadP2**](PackagesApi.md#packagesUploadP2) | **POST** /packages/{owner}/{repo}/upload/p2/ | Create a new P2 package
[**packagesUploadPython**](PackagesApi.md#packagesUploadPython) | **POST** /packages/{owner}/{repo}/upload/python/ | Create a new Python package
[**packagesUploadRaw**](PackagesApi.md#packagesUploadRaw) | **POST** /packages/{owner}/{repo}/upload/raw/ | Create a new Raw package
[**packagesUploadRpm**](PackagesApi.md#packagesUploadRpm) | **POST** /packages/{owner}/{repo}/upload/rpm/ | Create a new RedHat package
[**packagesUploadRuby**](PackagesApi.md#packagesUploadRuby) | **POST** /packages/{owner}/{repo}/upload/ruby/ | Create a new Ruby package
[**packagesUploadSwift**](PackagesApi.md#packagesUploadSwift) | **POST** /packages/{owner}/{repo}/upload/swift/ | Create a new Swift package
[**packagesUploadTerraform**](PackagesApi.md#packagesUploadTerraform) | **POST** /packages/{owner}/{repo}/upload/terraform/ | Create a new Terraform package
[**packagesUploadVagrant**](PackagesApi.md#packagesUploadVagrant) | **POST** /packages/{owner}/{repo}/upload/vagrant/ | Create a new Vagrant package
[**packagesValidateUploadAlpine**](PackagesApi.md#packagesValidateUploadAlpine) | **POST** /packages/{owner}/{repo}/validate-upload/alpine/ | Validate parameters for create Alpine package
[**packagesValidateUploadCargo**](PackagesApi.md#packagesValidateUploadCargo) | **POST** /packages/{owner}/{repo}/validate-upload/cargo/ | Validate parameters for create Cargo package
[**packagesValidateUploadCocoapods**](PackagesApi.md#packagesValidateUploadCocoapods) | **POST** /packages/{owner}/{repo}/validate-upload/cocoapods/ | Validate parameters for create CocoaPods package
[**packagesValidateUploadComposer**](PackagesApi.md#packagesValidateUploadComposer) | **POST** /packages/{owner}/{repo}/validate-upload/composer/ | Validate parameters for create Composer package
[**packagesValidateUploadConan**](PackagesApi.md#packagesValidateUploadConan) | **POST** /packages/{owner}/{repo}/validate-upload/conan/ | Validate parameters for create Conan package
[**packagesValidateUploadConda**](PackagesApi.md#packagesValidateUploadConda) | **POST** /packages/{owner}/{repo}/validate-upload/conda/ | Validate parameters for create Conda package
[**packagesValidateUploadCran**](PackagesApi.md#packagesValidateUploadCran) | **POST** /packages/{owner}/{repo}/validate-upload/cran/ | Validate parameters for create CRAN package
[**packagesValidateUploadDart**](PackagesApi.md#packagesValidateUploadDart) | **POST** /packages/{owner}/{repo}/validate-upload/dart/ | Validate parameters for create Dart package
[**packagesValidateUploadDeb**](PackagesApi.md#packagesValidateUploadDeb) | **POST** /packages/{owner}/{repo}/validate-upload/deb/ | Validate parameters for create Debian package
[**packagesValidateUploadDocker**](PackagesApi.md#packagesValidateUploadDocker) | **POST** /packages/{owner}/{repo}/validate-upload/docker/ | Validate parameters for create Docker package
[**packagesValidateUploadGo**](PackagesApi.md#packagesValidateUploadGo) | **POST** /packages/{owner}/{repo}/validate-upload/go/ | Validate parameters for create Go package
[**packagesValidateUploadHelm**](PackagesApi.md#packagesValidateUploadHelm) | **POST** /packages/{owner}/{repo}/validate-upload/helm/ | Validate parameters for create Helm package
[**packagesValidateUploadHex**](PackagesApi.md#packagesValidateUploadHex) | **POST** /packages/{owner}/{repo}/validate-upload/hex/ | Validate parameters for create Hex package
[**packagesValidateUploadLuarocks**](PackagesApi.md#packagesValidateUploadLuarocks) | **POST** /packages/{owner}/{repo}/validate-upload/luarocks/ | Validate parameters for create LuaRocks package
[**packagesValidateUploadMaven**](PackagesApi.md#packagesValidateUploadMaven) | **POST** /packages/{owner}/{repo}/validate-upload/maven/ | Validate parameters for create Maven package
[**packagesValidateUploadNpm**](PackagesApi.md#packagesValidateUploadNpm) | **POST** /packages/{owner}/{repo}/validate-upload/npm/ | Validate parameters for create npm package
[**packagesValidateUploadNuget**](PackagesApi.md#packagesValidateUploadNuget) | **POST** /packages/{owner}/{repo}/validate-upload/nuget/ | Validate parameters for create NuGet package
[**packagesValidateUploadP2**](PackagesApi.md#packagesValidateUploadP2) | **POST** /packages/{owner}/{repo}/validate-upload/p2/ | Validate parameters for create P2 package
[**packagesValidateUploadPython**](PackagesApi.md#packagesValidateUploadPython) | **POST** /packages/{owner}/{repo}/validate-upload/python/ | Validate parameters for create Python package
[**packagesValidateUploadRaw**](PackagesApi.md#packagesValidateUploadRaw) | **POST** /packages/{owner}/{repo}/validate-upload/raw/ | Validate parameters for create Raw package
[**packagesValidateUploadRpm**](PackagesApi.md#packagesValidateUploadRpm) | **POST** /packages/{owner}/{repo}/validate-upload/rpm/ | Validate parameters for create RedHat package
[**packagesValidateUploadRuby**](PackagesApi.md#packagesValidateUploadRuby) | **POST** /packages/{owner}/{repo}/validate-upload/ruby/ | Validate parameters for create Ruby package
[**packagesValidateUploadSwift**](PackagesApi.md#packagesValidateUploadSwift) | **POST** /packages/{owner}/{repo}/validate-upload/swift/ | Validate parameters for create Swift package
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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
PackageCopyRequest data = new PackageCopyRequest(); // PackageCopyRequest | 
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
 **data** | [**PackageCopyRequest**](PackageCopyRequest.md)|  | [optional]

### Return type

[**PackageCopy**](PackageCopy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesDependencies"></a>
# **packagesDependencies**
> PackageDependencies packagesDependencies(owner, repo, identifier)

Get the list of dependencies for a package. Transitive dependencies are included where supported.

Get the list of dependencies for a package. Transitive dependencies are included where supported.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    PackageDependencies result = apiInstance.packagesDependencies(owner, repo, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesDependencies");
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

[**PackageDependencies**](PackageDependencies.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesGroupsList"></a>
# **packagesGroupsList**
> InlineResponse200 packagesGroupsList(owner, repo, page, pageSize, groupBy, query, sort)

Return a list of Package Groups in a repository.

Return a list of Package Groups in a repository.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
String groupBy = "name"; // String | A field to group packages by. Available options: name, backend_kind.
String query = ""; // String | A search term for querying names, filenames, versions, distributions, architectures, formats, or statuses of packages.
String sort = "name"; // String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name, count, num_downloads, size, last_push, backend_kind.
try {
    InlineResponse200 result = apiInstance.packagesGroupsList(owner, repo, page, pageSize, groupBy, query, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesGroupsList");
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
 **groupBy** | **String**| A field to group packages by. Available options: name, backend_kind. | [optional] [default to name]
 **query** | **String**| A search term for querying names, filenames, versions, distributions, architectures, formats, or statuses of packages. | [optional] [default to ]
 **sort** | **String**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name, count, num_downloads, size, last_push, backend_kind. | [optional] [default to name]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesList"></a>
# **packagesList**
> List&lt;ModelPackage&gt; packagesList(owner, repo, page, pageSize, query, sort)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
String query = ""; // String | A search term for querying names, filenames, versions, distributions, architectures, formats or statuses of packages.
String sort = "-date"; // String | A field for sorting objects in ascending or descending order.
try {
    List<ModelPackage> result = apiInstance.packagesList(owner, repo, page, pageSize, query, sort);
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
 **page** | **java.math.BigInteger**| A page number within the paginated result set. | [optional]
 **pageSize** | **java.math.BigInteger**| Number of results to return per page. | [optional]
 **query** | **String**| A search term for querying names, filenames, versions, distributions, architectures, formats or statuses of packages. | [optional] [default to ]
 **sort** | **String**| A field for sorting objects in ascending or descending order. | [optional] [default to -date]

### Return type

[**List&lt;ModelPackage&gt;**](ModelPackage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
PackageMoveRequest data = new PackageMoveRequest(); // PackageMoveRequest | 
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
 **data** | [**PackageMoveRequest**](PackageMoveRequest.md)|  | [optional]

### Return type

[**PackageMove**](PackageMove.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesQuarantine"></a>
# **packagesQuarantine**
> PackageQuarantine packagesQuarantine(owner, repo, identifier, data)

Quarantine or release a package.

Quarantine or release a package.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
PackageQuarantineRequest data = new PackageQuarantineRequest(); // PackageQuarantineRequest | 
try {
    PackageQuarantine result = apiInstance.packagesQuarantine(owner, repo, identifier, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesQuarantine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **identifier** | **String**|  |
 **data** | [**PackageQuarantineRequest**](PackageQuarantineRequest.md)|  | [optional]

### Return type

[**PackageQuarantine**](PackageQuarantine.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesResync"></a>
# **packagesResync**
> PackageResync packagesResync(owner, repo, identifier)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    PackageResync result = apiInstance.packagesResync(owner, repo, identifier);
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

### Return type

[**PackageResync**](PackageResync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesScan"></a>
# **packagesScan**
> ModelPackage packagesScan(owner, repo, identifier)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    ModelPackage result = apiInstance.packagesScan(owner, repo, identifier);
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

### Return type

[**ModelPackage**](ModelPackage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesStatus"></a>
# **packagesStatus**
> PackageStatus packagesStatus(owner, repo, identifier)

Get the synchronization status for a package.

Get the synchronization status for a package.

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

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

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
String identifier = "identifier_example"; // String | 
PackageTagRequest data = new PackageTagRequest(); // PackageTagRequest | 
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
 **data** | [**PackageTagRequest**](PackageTagRequest.md)|  | [optional]

### Return type

[**ModelPackage**](ModelPackage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
AlpinePackageUploadRequest data = new AlpinePackageUploadRequest(); // AlpinePackageUploadRequest | 
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
 **data** | [**AlpinePackageUploadRequest**](AlpinePackageUploadRequest.md)|  | [optional]

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadCargo"></a>
# **packagesUploadCargo**
> CargoPackageUpload packagesUploadCargo(owner, repo, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
CargoPackageUploadRequest data = new CargoPackageUploadRequest(); // CargoPackageUploadRequest | 
try {
    CargoPackageUpload result = apiInstance.packagesUploadCargo(owner, repo, data);
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
 **data** | [**CargoPackageUploadRequest**](CargoPackageUploadRequest.md)|  | [optional]

### Return type

[**CargoPackageUpload**](CargoPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadCocoapods"></a>
# **packagesUploadCocoapods**
> CocoapodsPackageUpload packagesUploadCocoapods(owner, repo, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
CocoapodsPackageUploadRequest data = new CocoapodsPackageUploadRequest(); // CocoapodsPackageUploadRequest | 
try {
    CocoapodsPackageUpload result = apiInstance.packagesUploadCocoapods(owner, repo, data);
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
 **data** | [**CocoapodsPackageUploadRequest**](CocoapodsPackageUploadRequest.md)|  | [optional]

### Return type

[**CocoapodsPackageUpload**](CocoapodsPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadComposer"></a>
# **packagesUploadComposer**
> ComposerPackageUpload packagesUploadComposer(owner, repo, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
ComposerPackageUploadRequest data = new ComposerPackageUploadRequest(); // ComposerPackageUploadRequest | 
try {
    ComposerPackageUpload result = apiInstance.packagesUploadComposer(owner, repo, data);
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
 **data** | [**ComposerPackageUploadRequest**](ComposerPackageUploadRequest.md)|  | [optional]

### Return type

[**ComposerPackageUpload**](ComposerPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
ConanPackageUploadRequest data = new ConanPackageUploadRequest(); // ConanPackageUploadRequest | 
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
 **data** | [**ConanPackageUploadRequest**](ConanPackageUploadRequest.md)|  | [optional]

### Return type

[**ConanPackageUpload**](ConanPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadConda"></a>
# **packagesUploadConda**
> CondaPackageUpload packagesUploadConda(owner, repo, data)

Create a new Conda package

Create a new Conda package

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
CondaPackageUploadRequest data = new CondaPackageUploadRequest(); // CondaPackageUploadRequest | 
try {
    CondaPackageUpload result = apiInstance.packagesUploadConda(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadConda");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**CondaPackageUploadRequest**](CondaPackageUploadRequest.md)|  | [optional]

### Return type

[**CondaPackageUpload**](CondaPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadCran"></a>
# **packagesUploadCran**
> CranPackageUpload packagesUploadCran(owner, repo, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
CranPackageUploadRequest data = new CranPackageUploadRequest(); // CranPackageUploadRequest | 
try {
    CranPackageUpload result = apiInstance.packagesUploadCran(owner, repo, data);
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
 **data** | [**CranPackageUploadRequest**](CranPackageUploadRequest.md)|  | [optional]

### Return type

[**CranPackageUpload**](CranPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadDart"></a>
# **packagesUploadDart**
> DartPackageUpload packagesUploadDart(owner, repo, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
DartPackageUploadRequest data = new DartPackageUploadRequest(); // DartPackageUploadRequest | 
try {
    DartPackageUpload result = apiInstance.packagesUploadDart(owner, repo, data);
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
 **data** | [**DartPackageUploadRequest**](DartPackageUploadRequest.md)|  | [optional]

### Return type

[**DartPackageUpload**](DartPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadDeb"></a>
# **packagesUploadDeb**
> DebPackageUpload packagesUploadDeb(owner, repo, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
DebPackageUploadRequest data = new DebPackageUploadRequest(); // DebPackageUploadRequest | 
try {
    DebPackageUpload result = apiInstance.packagesUploadDeb(owner, repo, data);
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
 **data** | [**DebPackageUploadRequest**](DebPackageUploadRequest.md)|  | [optional]

### Return type

[**DebPackageUpload**](DebPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadDocker"></a>
# **packagesUploadDocker**
> DockerPackageUpload packagesUploadDocker(owner, repo, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
DockerPackageUploadRequest data = new DockerPackageUploadRequest(); // DockerPackageUploadRequest | 
try {
    DockerPackageUpload result = apiInstance.packagesUploadDocker(owner, repo, data);
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
 **data** | [**DockerPackageUploadRequest**](DockerPackageUploadRequest.md)|  | [optional]

### Return type

[**DockerPackageUpload**](DockerPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadGo"></a>
# **packagesUploadGo**
> GoPackageUpload packagesUploadGo(owner, repo, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
GoPackageUploadRequest data = new GoPackageUploadRequest(); // GoPackageUploadRequest | 
try {
    GoPackageUpload result = apiInstance.packagesUploadGo(owner, repo, data);
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
 **data** | [**GoPackageUploadRequest**](GoPackageUploadRequest.md)|  | [optional]

### Return type

[**GoPackageUpload**](GoPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadHelm"></a>
# **packagesUploadHelm**
> HelmPackageUpload packagesUploadHelm(owner, repo, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
HelmPackageUploadRequest data = new HelmPackageUploadRequest(); // HelmPackageUploadRequest | 
try {
    HelmPackageUpload result = apiInstance.packagesUploadHelm(owner, repo, data);
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
 **data** | [**HelmPackageUploadRequest**](HelmPackageUploadRequest.md)|  | [optional]

### Return type

[**HelmPackageUpload**](HelmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadHex"></a>
# **packagesUploadHex**
> HexPackageUpload packagesUploadHex(owner, repo, data)

Create a new Hex package

Create a new Hex package

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
HexPackageUploadRequest data = new HexPackageUploadRequest(); // HexPackageUploadRequest | 
try {
    HexPackageUpload result = apiInstance.packagesUploadHex(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadHex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**HexPackageUploadRequest**](HexPackageUploadRequest.md)|  | [optional]

### Return type

[**HexPackageUpload**](HexPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadLuarocks"></a>
# **packagesUploadLuarocks**
> LuarocksPackageUpload packagesUploadLuarocks(owner, repo, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
LuarocksPackageUploadRequest data = new LuarocksPackageUploadRequest(); // LuarocksPackageUploadRequest | 
try {
    LuarocksPackageUpload result = apiInstance.packagesUploadLuarocks(owner, repo, data);
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
 **data** | [**LuarocksPackageUploadRequest**](LuarocksPackageUploadRequest.md)|  | [optional]

### Return type

[**LuarocksPackageUpload**](LuarocksPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
MavenPackageUploadRequest data = new MavenPackageUploadRequest(); // MavenPackageUploadRequest | 
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
 **data** | [**MavenPackageUploadRequest**](MavenPackageUploadRequest.md)|  | [optional]

### Return type

[**MavenPackageUpload**](MavenPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadNpm"></a>
# **packagesUploadNpm**
> NpmPackageUpload packagesUploadNpm(owner, repo, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
NpmPackageUploadRequest data = new NpmPackageUploadRequest(); // NpmPackageUploadRequest | 
try {
    NpmPackageUpload result = apiInstance.packagesUploadNpm(owner, repo, data);
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
 **data** | [**NpmPackageUploadRequest**](NpmPackageUploadRequest.md)|  | [optional]

### Return type

[**NpmPackageUpload**](NpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadNuget"></a>
# **packagesUploadNuget**
> NugetPackageUpload packagesUploadNuget(owner, repo, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
NugetPackageUploadRequest data = new NugetPackageUploadRequest(); // NugetPackageUploadRequest | 
try {
    NugetPackageUpload result = apiInstance.packagesUploadNuget(owner, repo, data);
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
 **data** | [**NugetPackageUploadRequest**](NugetPackageUploadRequest.md)|  | [optional]

### Return type

[**NugetPackageUpload**](NugetPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadP2"></a>
# **packagesUploadP2**
> P2PackageUpload packagesUploadP2(owner, repo, data)

Create a new P2 package

Create a new P2 package

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
P2PackageUploadRequest data = new P2PackageUploadRequest(); // P2PackageUploadRequest | 
try {
    P2PackageUpload result = apiInstance.packagesUploadP2(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadP2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**P2PackageUploadRequest**](P2PackageUploadRequest.md)|  | [optional]

### Return type

[**P2PackageUpload**](P2PackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadPython"></a>
# **packagesUploadPython**
> PythonPackageUpload packagesUploadPython(owner, repo, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PythonPackageUploadRequest data = new PythonPackageUploadRequest(); // PythonPackageUploadRequest | 
try {
    PythonPackageUpload result = apiInstance.packagesUploadPython(owner, repo, data);
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
 **data** | [**PythonPackageUploadRequest**](PythonPackageUploadRequest.md)|  | [optional]

### Return type

[**PythonPackageUpload**](PythonPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
RawPackageUploadRequest data = new RawPackageUploadRequest(); // RawPackageUploadRequest | 
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
 **data** | [**RawPackageUploadRequest**](RawPackageUploadRequest.md)|  | [optional]

### Return type

[**RawPackageUpload**](RawPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadRpm"></a>
# **packagesUploadRpm**
> RpmPackageUpload packagesUploadRpm(owner, repo, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
RpmPackageUploadRequest data = new RpmPackageUploadRequest(); // RpmPackageUploadRequest | 
try {
    RpmPackageUpload result = apiInstance.packagesUploadRpm(owner, repo, data);
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
 **data** | [**RpmPackageUploadRequest**](RpmPackageUploadRequest.md)|  | [optional]

### Return type

[**RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadRuby"></a>
# **packagesUploadRuby**
> RubyPackageUpload packagesUploadRuby(owner, repo, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
RubyPackageUploadRequest data = new RubyPackageUploadRequest(); // RubyPackageUploadRequest | 
try {
    RubyPackageUpload result = apiInstance.packagesUploadRuby(owner, repo, data);
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
 **data** | [**RubyPackageUploadRequest**](RubyPackageUploadRequest.md)|  | [optional]

### Return type

[**RubyPackageUpload**](RubyPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadSwift"></a>
# **packagesUploadSwift**
> SwiftPackageUpload packagesUploadSwift(owner, repo, data)

Create a new Swift package

Create a new Swift package

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
SwiftPackageUploadRequest data = new SwiftPackageUploadRequest(); // SwiftPackageUploadRequest | 
try {
    SwiftPackageUpload result = apiInstance.packagesUploadSwift(owner, repo, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesUploadSwift");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**SwiftPackageUploadRequest**](SwiftPackageUploadRequest.md)|  | [optional]

### Return type

[**SwiftPackageUpload**](SwiftPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesUploadTerraform"></a>
# **packagesUploadTerraform**
> TerraformPackageUpload packagesUploadTerraform(owner, repo, data)

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
TerraformPackageUploadRequest data = new TerraformPackageUploadRequest(); // TerraformPackageUploadRequest | 
try {
    TerraformPackageUpload result = apiInstance.packagesUploadTerraform(owner, repo, data);
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
 **data** | [**TerraformPackageUploadRequest**](TerraformPackageUploadRequest.md)|  | [optional]

### Return type

[**TerraformPackageUpload**](TerraformPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
VagrantPackageUploadRequest data = new VagrantPackageUploadRequest(); // VagrantPackageUploadRequest | 
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
 **data** | [**VagrantPackageUploadRequest**](VagrantPackageUploadRequest.md)|  | [optional]

### Return type

[**VagrantPackageUpload**](VagrantPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
AlpinePackageUploadRequest data = new AlpinePackageUploadRequest(); // AlpinePackageUploadRequest | 
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
 **data** | [**AlpinePackageUploadRequest**](AlpinePackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
CargoPackageUploadRequest data = new CargoPackageUploadRequest(); // CargoPackageUploadRequest | 
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
 **data** | [**CargoPackageUploadRequest**](CargoPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
CocoapodsPackageUploadRequest data = new CocoapodsPackageUploadRequest(); // CocoapodsPackageUploadRequest | 
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
 **data** | [**CocoapodsPackageUploadRequest**](CocoapodsPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
ComposerPackageUploadRequest data = new ComposerPackageUploadRequest(); // ComposerPackageUploadRequest | 
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
 **data** | [**ComposerPackageUploadRequest**](ComposerPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
ConanPackageUploadRequest data = new ConanPackageUploadRequest(); // ConanPackageUploadRequest | 
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
 **data** | [**ConanPackageUploadRequest**](ConanPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesValidateUploadConda"></a>
# **packagesValidateUploadConda**
> packagesValidateUploadConda(owner, repo, data)

Validate parameters for create Conda package

Validate parameters for create Conda package

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
CondaPackageUploadRequest data = new CondaPackageUploadRequest(); // CondaPackageUploadRequest | 
try {
    apiInstance.packagesValidateUploadConda(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadConda");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**CondaPackageUploadRequest**](CondaPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
CranPackageUploadRequest data = new CranPackageUploadRequest(); // CranPackageUploadRequest | 
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
 **data** | [**CranPackageUploadRequest**](CranPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
DartPackageUploadRequest data = new DartPackageUploadRequest(); // DartPackageUploadRequest | 
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
 **data** | [**DartPackageUploadRequest**](DartPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
DebPackageUploadRequest data = new DebPackageUploadRequest(); // DebPackageUploadRequest | 
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
 **data** | [**DebPackageUploadRequest**](DebPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
DockerPackageUploadRequest data = new DockerPackageUploadRequest(); // DockerPackageUploadRequest | 
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
 **data** | [**DockerPackageUploadRequest**](DockerPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
GoPackageUploadRequest data = new GoPackageUploadRequest(); // GoPackageUploadRequest | 
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
 **data** | [**GoPackageUploadRequest**](GoPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
HelmPackageUploadRequest data = new HelmPackageUploadRequest(); // HelmPackageUploadRequest | 
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
 **data** | [**HelmPackageUploadRequest**](HelmPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesValidateUploadHex"></a>
# **packagesValidateUploadHex**
> packagesValidateUploadHex(owner, repo, data)

Validate parameters for create Hex package

Validate parameters for create Hex package

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
HexPackageUploadRequest data = new HexPackageUploadRequest(); // HexPackageUploadRequest | 
try {
    apiInstance.packagesValidateUploadHex(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadHex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**HexPackageUploadRequest**](HexPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
LuarocksPackageUploadRequest data = new LuarocksPackageUploadRequest(); // LuarocksPackageUploadRequest | 
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
 **data** | [**LuarocksPackageUploadRequest**](LuarocksPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
MavenPackageUploadRequest data = new MavenPackageUploadRequest(); // MavenPackageUploadRequest | 
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
 **data** | [**MavenPackageUploadRequest**](MavenPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
NpmPackageUploadRequest data = new NpmPackageUploadRequest(); // NpmPackageUploadRequest | 
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
 **data** | [**NpmPackageUploadRequest**](NpmPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
NugetPackageUploadRequest data = new NugetPackageUploadRequest(); // NugetPackageUploadRequest | 
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
 **data** | [**NugetPackageUploadRequest**](NugetPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesValidateUploadP2"></a>
# **packagesValidateUploadP2**
> packagesValidateUploadP2(owner, repo, data)

Validate parameters for create P2 package

Validate parameters for create P2 package

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
P2PackageUploadRequest data = new P2PackageUploadRequest(); // P2PackageUploadRequest | 
try {
    apiInstance.packagesValidateUploadP2(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadP2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**P2PackageUploadRequest**](P2PackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
PythonPackageUploadRequest data = new PythonPackageUploadRequest(); // PythonPackageUploadRequest | 
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
 **data** | [**PythonPackageUploadRequest**](PythonPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
RawPackageUploadRequest data = new RawPackageUploadRequest(); // RawPackageUploadRequest | 
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
 **data** | [**RawPackageUploadRequest**](RawPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
RpmPackageUploadRequest data = new RpmPackageUploadRequest(); // RpmPackageUploadRequest | 
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
 **data** | [**RpmPackageUploadRequest**](RpmPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
RubyPackageUploadRequest data = new RubyPackageUploadRequest(); // RubyPackageUploadRequest | 
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
 **data** | [**RubyPackageUploadRequest**](RubyPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesValidateUploadSwift"></a>
# **packagesValidateUploadSwift**
> packagesValidateUploadSwift(owner, repo, data)

Validate parameters for create Swift package

Validate parameters for create Swift package

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
SwiftPackageUploadRequest data = new SwiftPackageUploadRequest(); // SwiftPackageUploadRequest | 
try {
    apiInstance.packagesValidateUploadSwift(owner, repo, data);
} catch (ApiException e) {
    System.err.println("Exception when calling PackagesApi#packagesValidateUploadSwift");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**|  |
 **repo** | **String**|  |
 **data** | [**SwiftPackageUploadRequest**](SwiftPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
TerraformPackageUploadRequest data = new TerraformPackageUploadRequest(); // TerraformPackageUploadRequest | 
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
 **data** | [**TerraformPackageUploadRequest**](TerraformPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

PackagesApi apiInstance = new PackagesApi();
String owner = "owner_example"; // String | 
String repo = "repo_example"; // String | 
VagrantPackageUploadRequest data = new VagrantPackageUploadRequest(); // VagrantPackageUploadRequest | 
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
 **data** | [**VagrantPackageUploadRequest**](VagrantPackageUploadRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

