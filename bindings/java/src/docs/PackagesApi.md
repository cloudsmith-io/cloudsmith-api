# PackagesApi

All URIs are relative to *https://api.cloudsmith.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**packagesCopy**](PackagesApi.md#packagesCopy) | **POST** /packages/{owner}/{repo}/{identifier}/copy/ | Copy a package to another repository. |
| [**packagesDelete**](PackagesApi.md#packagesDelete) | **DELETE** /packages/{owner}/{repo}/{identifier}/ | Delete a specific package in a repository. |
| [**packagesDependencies**](PackagesApi.md#packagesDependencies) | **GET** /packages/{owner}/{repo}/{identifier}/dependencies/ | Get the list of dependencies for a package. Transitive dependencies are included where supported. |
| [**packagesGroupsList**](PackagesApi.md#packagesGroupsList) | **GET** /packages/{owner}/{repo}/groups/ | Return a list of Package Groups in a repository. |
| [**packagesList**](PackagesApi.md#packagesList) | **GET** /packages/{owner}/{repo}/ | Get a list of all packages associated with repository. |
| [**packagesMove**](PackagesApi.md#packagesMove) | **POST** /packages/{owner}/{repo}/{identifier}/move/ | Move a package to another repository. |
| [**packagesQuarantine**](PackagesApi.md#packagesQuarantine) | **POST** /packages/{owner}/{repo}/{identifier}/quarantine/ | Quarantine or release a package. |
| [**packagesRead**](PackagesApi.md#packagesRead) | **GET** /packages/{owner}/{repo}/{identifier}/ | Get a specific package in a repository. |
| [**packagesResync**](PackagesApi.md#packagesResync) | **POST** /packages/{owner}/{repo}/{identifier}/resync/ | Schedule a package for resynchronisation. |
| [**packagesScan**](PackagesApi.md#packagesScan) | **POST** /packages/{owner}/{repo}/{identifier}/scan/ | Schedule a package for scanning. |
| [**packagesStatus**](PackagesApi.md#packagesStatus) | **GET** /packages/{owner}/{repo}/{identifier}/status/ | Get the synchronization status for a package. |
| [**packagesTag**](PackagesApi.md#packagesTag) | **POST** /packages/{owner}/{repo}/{identifier}/tag/ | Add/Replace/Remove tags for a package. |
| [**packagesUpdateLicense**](PackagesApi.md#packagesUpdateLicense) | **PATCH** /packages/{owner}/{repo}/{identifier}/update-license/ | Update the license for a package. |
| [**packagesUploadAlpine**](PackagesApi.md#packagesUploadAlpine) | **POST** /packages/{owner}/{repo}/upload/alpine/ | Create a new Alpine package |
| [**packagesUploadCargo**](PackagesApi.md#packagesUploadCargo) | **POST** /packages/{owner}/{repo}/upload/cargo/ | Create a new Cargo package |
| [**packagesUploadCocoapods**](PackagesApi.md#packagesUploadCocoapods) | **POST** /packages/{owner}/{repo}/upload/cocoapods/ | Create a new CocoaPods package |
| [**packagesUploadComposer**](PackagesApi.md#packagesUploadComposer) | **POST** /packages/{owner}/{repo}/upload/composer/ | Create a new Composer package |
| [**packagesUploadConan**](PackagesApi.md#packagesUploadConan) | **POST** /packages/{owner}/{repo}/upload/conan/ | Create a new Conan package |
| [**packagesUploadConda**](PackagesApi.md#packagesUploadConda) | **POST** /packages/{owner}/{repo}/upload/conda/ | Create a new Conda package |
| [**packagesUploadCran**](PackagesApi.md#packagesUploadCran) | **POST** /packages/{owner}/{repo}/upload/cran/ | Create a new CRAN package |
| [**packagesUploadDart**](PackagesApi.md#packagesUploadDart) | **POST** /packages/{owner}/{repo}/upload/dart/ | Create a new Dart package |
| [**packagesUploadDeb**](PackagesApi.md#packagesUploadDeb) | **POST** /packages/{owner}/{repo}/upload/deb/ | Create a new Debian package |
| [**packagesUploadDocker**](PackagesApi.md#packagesUploadDocker) | **POST** /packages/{owner}/{repo}/upload/docker/ | Create a new Docker package |
| [**packagesUploadGeneric**](PackagesApi.md#packagesUploadGeneric) | **POST** /packages/{owner}/{repo}/upload/generic/ | Create a new Generic package |
| [**packagesUploadGo**](PackagesApi.md#packagesUploadGo) | **POST** /packages/{owner}/{repo}/upload/go/ | Create a new Go package |
| [**packagesUploadHelm**](PackagesApi.md#packagesUploadHelm) | **POST** /packages/{owner}/{repo}/upload/helm/ | Create a new Helm package |
| [**packagesUploadHex**](PackagesApi.md#packagesUploadHex) | **POST** /packages/{owner}/{repo}/upload/hex/ | Create a new Hex package |
| [**packagesUploadHuggingface**](PackagesApi.md#packagesUploadHuggingface) | **POST** /packages/{owner}/{repo}/upload/huggingface/ | Create a new HuggingFace package |
| [**packagesUploadLuarocks**](PackagesApi.md#packagesUploadLuarocks) | **POST** /packages/{owner}/{repo}/upload/luarocks/ | Create a new LuaRocks package |
| [**packagesUploadMaven**](PackagesApi.md#packagesUploadMaven) | **POST** /packages/{owner}/{repo}/upload/maven/ | Create a new Maven package |
| [**packagesUploadMcp**](PackagesApi.md#packagesUploadMcp) | **POST** /packages/{owner}/{repo}/upload/mcp/ | Create a new MCP package |
| [**packagesUploadNix**](PackagesApi.md#packagesUploadNix) | **POST** /packages/{owner}/{repo}/upload/nix/ | Create a new Nix package |
| [**packagesUploadNpm**](PackagesApi.md#packagesUploadNpm) | **POST** /packages/{owner}/{repo}/upload/npm/ | Create a new npm package |
| [**packagesUploadNuget**](PackagesApi.md#packagesUploadNuget) | **POST** /packages/{owner}/{repo}/upload/nuget/ | Create a new NuGet package |
| [**packagesUploadP2**](PackagesApi.md#packagesUploadP2) | **POST** /packages/{owner}/{repo}/upload/p2/ | Create a new P2 package |
| [**packagesUploadPython**](PackagesApi.md#packagesUploadPython) | **POST** /packages/{owner}/{repo}/upload/python/ | Create a new Python package |
| [**packagesUploadRaw**](PackagesApi.md#packagesUploadRaw) | **POST** /packages/{owner}/{repo}/upload/raw/ | Create a new Raw package |
| [**packagesUploadRpm**](PackagesApi.md#packagesUploadRpm) | **POST** /packages/{owner}/{repo}/upload/rpm/ | Create a new RedHat package |
| [**packagesUploadRuby**](PackagesApi.md#packagesUploadRuby) | **POST** /packages/{owner}/{repo}/upload/ruby/ | Create a new Ruby package |
| [**packagesUploadSkills**](PackagesApi.md#packagesUploadSkills) | **POST** /packages/{owner}/{repo}/upload/skills/ | Create a new AI Skills package |
| [**packagesUploadSwift**](PackagesApi.md#packagesUploadSwift) | **POST** /packages/{owner}/{repo}/upload/swift/ | Create a new Swift package |
| [**packagesUploadTerraform**](PackagesApi.md#packagesUploadTerraform) | **POST** /packages/{owner}/{repo}/upload/terraform/ | Create a new Terraform package |
| [**packagesUploadVagrant**](PackagesApi.md#packagesUploadVagrant) | **POST** /packages/{owner}/{repo}/upload/vagrant/ | Create a new Vagrant package |
| [**packagesUploadVsx**](PackagesApi.md#packagesUploadVsx) | **POST** /packages/{owner}/{repo}/upload/vsx/ | Create a new VSX package |
| [**packagesValidateUploadAlpine**](PackagesApi.md#packagesValidateUploadAlpine) | **POST** /packages/{owner}/{repo}/validate-upload/alpine/ | Validate parameters for create Alpine package |
| [**packagesValidateUploadCargo**](PackagesApi.md#packagesValidateUploadCargo) | **POST** /packages/{owner}/{repo}/validate-upload/cargo/ | Validate parameters for create Cargo package |
| [**packagesValidateUploadCocoapods**](PackagesApi.md#packagesValidateUploadCocoapods) | **POST** /packages/{owner}/{repo}/validate-upload/cocoapods/ | Validate parameters for create CocoaPods package |
| [**packagesValidateUploadComposer**](PackagesApi.md#packagesValidateUploadComposer) | **POST** /packages/{owner}/{repo}/validate-upload/composer/ | Validate parameters for create Composer package |
| [**packagesValidateUploadConan**](PackagesApi.md#packagesValidateUploadConan) | **POST** /packages/{owner}/{repo}/validate-upload/conan/ | Validate parameters for create Conan package |
| [**packagesValidateUploadConda**](PackagesApi.md#packagesValidateUploadConda) | **POST** /packages/{owner}/{repo}/validate-upload/conda/ | Validate parameters for create Conda package |
| [**packagesValidateUploadCran**](PackagesApi.md#packagesValidateUploadCran) | **POST** /packages/{owner}/{repo}/validate-upload/cran/ | Validate parameters for create CRAN package |
| [**packagesValidateUploadDart**](PackagesApi.md#packagesValidateUploadDart) | **POST** /packages/{owner}/{repo}/validate-upload/dart/ | Validate parameters for create Dart package |
| [**packagesValidateUploadDeb**](PackagesApi.md#packagesValidateUploadDeb) | **POST** /packages/{owner}/{repo}/validate-upload/deb/ | Validate parameters for create Debian package |
| [**packagesValidateUploadDocker**](PackagesApi.md#packagesValidateUploadDocker) | **POST** /packages/{owner}/{repo}/validate-upload/docker/ | Validate parameters for create Docker package |
| [**packagesValidateUploadGeneric**](PackagesApi.md#packagesValidateUploadGeneric) | **POST** /packages/{owner}/{repo}/validate-upload/generic/ | Validate parameters for create Generic package |
| [**packagesValidateUploadGo**](PackagesApi.md#packagesValidateUploadGo) | **POST** /packages/{owner}/{repo}/validate-upload/go/ | Validate parameters for create Go package |
| [**packagesValidateUploadHelm**](PackagesApi.md#packagesValidateUploadHelm) | **POST** /packages/{owner}/{repo}/validate-upload/helm/ | Validate parameters for create Helm package |
| [**packagesValidateUploadHex**](PackagesApi.md#packagesValidateUploadHex) | **POST** /packages/{owner}/{repo}/validate-upload/hex/ | Validate parameters for create Hex package |
| [**packagesValidateUploadHuggingface**](PackagesApi.md#packagesValidateUploadHuggingface) | **POST** /packages/{owner}/{repo}/validate-upload/huggingface/ | Validate parameters for create HuggingFace package |
| [**packagesValidateUploadLuarocks**](PackagesApi.md#packagesValidateUploadLuarocks) | **POST** /packages/{owner}/{repo}/validate-upload/luarocks/ | Validate parameters for create LuaRocks package |
| [**packagesValidateUploadMaven**](PackagesApi.md#packagesValidateUploadMaven) | **POST** /packages/{owner}/{repo}/validate-upload/maven/ | Validate parameters for create Maven package |
| [**packagesValidateUploadMcp**](PackagesApi.md#packagesValidateUploadMcp) | **POST** /packages/{owner}/{repo}/validate-upload/mcp/ | Validate parameters for create MCP package |
| [**packagesValidateUploadNix**](PackagesApi.md#packagesValidateUploadNix) | **POST** /packages/{owner}/{repo}/validate-upload/nix/ | Validate parameters for create Nix package |
| [**packagesValidateUploadNpm**](PackagesApi.md#packagesValidateUploadNpm) | **POST** /packages/{owner}/{repo}/validate-upload/npm/ | Validate parameters for create npm package |
| [**packagesValidateUploadNuget**](PackagesApi.md#packagesValidateUploadNuget) | **POST** /packages/{owner}/{repo}/validate-upload/nuget/ | Validate parameters for create NuGet package |
| [**packagesValidateUploadP2**](PackagesApi.md#packagesValidateUploadP2) | **POST** /packages/{owner}/{repo}/validate-upload/p2/ | Validate parameters for create P2 package |
| [**packagesValidateUploadPython**](PackagesApi.md#packagesValidateUploadPython) | **POST** /packages/{owner}/{repo}/validate-upload/python/ | Validate parameters for create Python package |
| [**packagesValidateUploadRaw**](PackagesApi.md#packagesValidateUploadRaw) | **POST** /packages/{owner}/{repo}/validate-upload/raw/ | Validate parameters for create Raw package |
| [**packagesValidateUploadRpm**](PackagesApi.md#packagesValidateUploadRpm) | **POST** /packages/{owner}/{repo}/validate-upload/rpm/ | Validate parameters for create RedHat package |
| [**packagesValidateUploadRuby**](PackagesApi.md#packagesValidateUploadRuby) | **POST** /packages/{owner}/{repo}/validate-upload/ruby/ | Validate parameters for create Ruby package |
| [**packagesValidateUploadSkills**](PackagesApi.md#packagesValidateUploadSkills) | **POST** /packages/{owner}/{repo}/validate-upload/skills/ | Validate parameters for create AI Skills package |
| [**packagesValidateUploadSwift**](PackagesApi.md#packagesValidateUploadSwift) | **POST** /packages/{owner}/{repo}/validate-upload/swift/ | Validate parameters for create Swift package |
| [**packagesValidateUploadTerraform**](PackagesApi.md#packagesValidateUploadTerraform) | **POST** /packages/{owner}/{repo}/validate-upload/terraform/ | Validate parameters for create Terraform package |
| [**packagesValidateUploadVagrant**](PackagesApi.md#packagesValidateUploadVagrant) | **POST** /packages/{owner}/{repo}/validate-upload/vagrant/ | Validate parameters for create Vagrant package |
| [**packagesValidateUploadVsx**](PackagesApi.md#packagesValidateUploadVsx) | **POST** /packages/{owner}/{repo}/validate-upload/vsx/ | Validate parameters for create VSX package |


<a id="packagesCopy"></a>
# **packagesCopy**
> PackageCopy packagesCopy(owner, repo, identifier, data)

Copy a package to another repository.

Copy a package to another repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    PackageCopyRequest data = new PackageCopyRequest(); // PackageCopyRequest | 
    try {
      PackageCopy result = apiInstance.packagesCopy(owner, repo, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesCopy");
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
| **data** | [**PackageCopyRequest**](PackageCopyRequest.md)|  | [optional] |

### Return type

[**PackageCopy**](PackageCopy.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Copied specified package to destination repository. |  -  |
| **400** | The package is in the wrong state for the requested operation. |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesDelete"></a>
# **packagesDelete**
> packagesDelete(owner, repo, identifier)

Delete a specific package in a repository.

Delete a specific package in a repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      apiInstance.packagesDelete(owner, repo, identifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesDelete");
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
| **204** | Deleted the specified package successfully. |  -  |
| **400** | The package cannot be deleted. |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesDependencies"></a>
# **packagesDependencies**
> PackageDependencies packagesDependencies(owner, repo, identifier, includeConnectedRepositories)

Get the list of dependencies for a package. Transitive dependencies are included where supported.

Get the list of dependencies for a package. Transitive dependencies are included where supported.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    Boolean includeConnectedRepositories = false; // Boolean | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in.
    try {
      PackageDependencies result = apiInstance.packagesDependencies(owner, repo, identifier, includeConnectedRepositories);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesDependencies");
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
| **includeConnectedRepositories** | **Boolean**| If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in. | [optional] [default to false] |

### Return type

[**PackageDependencies**](PackageDependencies.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved stored dependencies for specified package. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesGroupsList"></a>
# **packagesGroupsList**
> PackagesGroupsList200Response packagesGroupsList(owner, repo, page, pageSize, groupBy, hideSubcomponents, includeConnectedRepositories, query, sort)

Return a list of Package Groups in a repository.

Return a list of Package Groups in a repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    String groupBy = "name"; // String | A field to group packages by. Available options: name, backend_kind.
    Boolean hideSubcomponents = false; // Boolean | Whether to hide packages which are subcomponents of another package in the results
    Boolean includeConnectedRepositories = false; // Boolean | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false.
    String query = "query_example"; // String | A search term for querying names, filenames, versions, distributions, architectures, formats, or statuses of packages.
    String sort = "name"; // String | A field for sorting objects in ascending or descending order. Use `-` prefix for descending order (e.g., `-name`). Available options: name, count, num_downloads, size, last_push, backend_kind.
    try {
      PackagesGroupsList200Response result = apiInstance.packagesGroupsList(owner, repo, page, pageSize, groupBy, hideSubcomponents, includeConnectedRepositories, query, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesGroupsList");
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
| **groupBy** | **String**| A field to group packages by. Available options: name, backend_kind. | [optional] [default to name] |
| **hideSubcomponents** | **Boolean**| Whether to hide packages which are subcomponents of another package in the results | [optional] [default to false] |
| **includeConnectedRepositories** | **Boolean**| If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. | [optional] [default to false] |
| **query** | **String**| A search term for querying names, filenames, versions, distributions, architectures, formats, or statuses of packages. | [optional] |
| **sort** | **String**| A field for sorting objects in ascending or descending order. Use &#x60;-&#x60; prefix for descending order (e.g., &#x60;-name&#x60;). Available options: name, count, num_downloads, size, last_push, backend_kind. | [optional] [default to name] |

### Return type

[**PackagesGroupsList200Response**](PackagesGroupsList200Response.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the list of package groups. |  -  |
| **404** | Owner namespace or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesList"></a>
# **packagesList**
> List&lt;ModelPackage&gt; packagesList(owner, repo, page, pageSize, includeConnectedRepositories, query, sort)

Get a list of all packages associated with repository.

Get a list of all packages associated with repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    java.math.BigInteger page = new java.math.BigInteger(); // java.math.BigInteger | A page number within the paginated result set.
    java.math.BigInteger pageSize = new java.math.BigInteger(); // java.math.BigInteger | Number of results to return per page.
    Boolean includeConnectedRepositories = false; // Boolean | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in.
    String query = "query_example"; // String | A search term for querying names, filenames, versions, distributions, architectures, formats, statuses or display sources (display_source:upstream, display_source:manual_upload, display_source:connected_repository) of packages.
    String sort = "-date"; // String | A field for sorting objects in ascending or descending order.
    try {
      List<ModelPackage> result = apiInstance.packagesList(owner, repo, page, pageSize, includeConnectedRepositories, query, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesList");
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
| **includeConnectedRepositories** | **Boolean**| If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in. | [optional] [default to false] |
| **query** | **String**| A search term for querying names, filenames, versions, distributions, architectures, formats, statuses or display sources (display_source:upstream, display_source:manual_upload, display_source:connected_repository) of packages. | [optional] |
| **sort** | **String**| A field for sorting objects in ascending or descending order. | [optional] [default to -date] |

### Return type

[**List&lt;ModelPackage&gt;**](ModelPackage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the list of packages |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesMove"></a>
# **packagesMove**
> PackageMove packagesMove(owner, repo, identifier, data)

Move a package to another repository.

Move a package to another repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    PackageMoveRequest data = new PackageMoveRequest(); // PackageMoveRequest | 
    try {
      PackageMove result = apiInstance.packagesMove(owner, repo, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesMove");
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
| **data** | [**PackageMoveRequest**](PackageMoveRequest.md)|  | [optional] |

### Return type

[**PackageMove**](PackageMove.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Moved specified package to destination repository. |  -  |
| **400** | The package is in the wrong state for the requested operation. |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesQuarantine"></a>
# **packagesQuarantine**
> PackageQuarantine packagesQuarantine(owner, repo, identifier, data)

Quarantine or release a package.

Quarantine or release a package.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    PackageQuarantineRequest data = new PackageQuarantineRequest(); // PackageQuarantineRequest | 
    try {
      PackageQuarantine result = apiInstance.packagesQuarantine(owner, repo, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesQuarantine");
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
| **data** | [**PackageQuarantineRequest**](PackageQuarantineRequest.md)|  | [optional] |

### Return type

[**PackageQuarantine**](PackageQuarantine.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Changed the package&#39;s quarantine status. |  -  |
| **400** | The package is in the wrong state for the requested operation. |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesRead"></a>
# **packagesRead**
> PackageDetail packagesRead(owner, repo, identifier, includeConnectedRepositories)

Get a specific package in a repository.

Get a specific package in a repository.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    Boolean includeConnectedRepositories = false; // Boolean | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in.
    try {
      PackageDetail result = apiInstance.packagesRead(owner, repo, identifier, includeConnectedRepositories);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesRead");
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
| **includeConnectedRepositories** | **Boolean**| If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in. | [optional] [default to false] |

### Return type

[**PackageDetail**](PackageDetail.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved the specified package successfully. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesResync"></a>
# **packagesResync**
> PackageResync packagesResync(owner, repo, identifier)

Schedule a package for resynchronisation.

Schedule a package for resynchronisation.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      PackageResync result = apiInstance.packagesResync(owner, repo, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesResync");
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

[**PackageResync**](PackageResync.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Scheduled the package for resynchronisation. |  -  |
| **400** | The package is in the wrong state for the requested operation. |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesScan"></a>
# **packagesScan**
> ModelPackage packagesScan(owner, repo, identifier)

Schedule a package for scanning.

Schedule a package for scanning.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      ModelPackage result = apiInstance.packagesScan(owner, repo, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesScan");
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

[**ModelPackage**](ModelPackage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Scheduled the package for scanning. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesStatus"></a>
# **packagesStatus**
> PackageStatus packagesStatus(owner, repo, identifier, includeConnectedRepositories)

Get the synchronization status for a package.

Get the synchronization status for a package.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    Boolean includeConnectedRepositories = false; // Boolean | If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in.
    try {
      PackageStatus result = apiInstance.packagesStatus(owner, repo, identifier, includeConnectedRepositories);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesStatus");
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
| **includeConnectedRepositories** | **Boolean**| If true, include packages from active connected target repositories in addition to packages from this repository. Has no effect if the repository has no active connections. Defaults to false. Note: download-related URLs on returned packages (e.g. cdn_url, signature_url) are rewritten to point at the requesting repository, not the connected target repository the package physically lives in. | [optional] [default to false] |

### Return type

[**PackageStatus**](PackageStatus.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved status for specified package. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesTag"></a>
# **packagesTag**
> ModelPackage packagesTag(owner, repo, identifier, data)

Add/Replace/Remove tags for a package.

Add/Replace/Remove tags for a package.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    PackageTagRequest data = new PackageTagRequest(); // PackageTagRequest | 
    try {
      ModelPackage result = apiInstance.packagesTag(owner, repo, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesTag");
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
| **data** | [**PackageTagRequest**](PackageTagRequest.md)|  | [optional] |

### Return type

[**ModelPackage**](ModelPackage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Modified tags for the package. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUpdateLicense"></a>
# **packagesUpdateLicense**
> ModelPackage packagesUpdateLicense(owner, repo, identifier, data)

Update the license for a package.

Update the license for a package.

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    String identifier = "identifier_example"; // String | 
    PackageLicenseRequestPatch data = new PackageLicenseRequestPatch(); // PackageLicenseRequestPatch | 
    try {
      ModelPackage result = apiInstance.packagesUpdateLicense(owner, repo, identifier, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUpdateLicense");
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
| **data** | [**PackageLicenseRequestPatch**](PackageLicenseRequestPatch.md)|  | [optional] |

### Return type

[**ModelPackage**](ModelPackage.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Modified tags for the package. |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadAlpine"></a>
# **packagesUploadAlpine**
> AlpinePackageUpload packagesUploadAlpine(owner, repo, data)

Create a new Alpine package

Create a new Alpine package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    AlpinePackageUploadRequest data = new AlpinePackageUploadRequest(); // AlpinePackageUploadRequest | 
    try {
      AlpinePackageUpload result = apiInstance.packagesUploadAlpine(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadAlpine");
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
| **data** | [**AlpinePackageUploadRequest**](AlpinePackageUploadRequest.md)|  | [optional] |

### Return type

[**AlpinePackageUpload**](AlpinePackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadCargo"></a>
# **packagesUploadCargo**
> CargoPackageUpload packagesUploadCargo(owner, repo, data)

Create a new Cargo package

Create a new Cargo package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    CargoPackageUploadRequest data = new CargoPackageUploadRequest(); // CargoPackageUploadRequest | 
    try {
      CargoPackageUpload result = apiInstance.packagesUploadCargo(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadCargo");
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
| **data** | [**CargoPackageUploadRequest**](CargoPackageUploadRequest.md)|  | [optional] |

### Return type

[**CargoPackageUpload**](CargoPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadCocoapods"></a>
# **packagesUploadCocoapods**
> CocoapodsPackageUpload packagesUploadCocoapods(owner, repo, data)

Create a new CocoaPods package

Create a new CocoaPods package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    CocoapodsPackageUploadRequest data = new CocoapodsPackageUploadRequest(); // CocoapodsPackageUploadRequest | 
    try {
      CocoapodsPackageUpload result = apiInstance.packagesUploadCocoapods(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadCocoapods");
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
| **data** | [**CocoapodsPackageUploadRequest**](CocoapodsPackageUploadRequest.md)|  | [optional] |

### Return type

[**CocoapodsPackageUpload**](CocoapodsPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadComposer"></a>
# **packagesUploadComposer**
> ComposerPackageUpload packagesUploadComposer(owner, repo, data)

Create a new Composer package

Create a new Composer package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    ComposerPackageUploadRequest data = new ComposerPackageUploadRequest(); // ComposerPackageUploadRequest | 
    try {
      ComposerPackageUpload result = apiInstance.packagesUploadComposer(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadComposer");
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
| **data** | [**ComposerPackageUploadRequest**](ComposerPackageUploadRequest.md)|  | [optional] |

### Return type

[**ComposerPackageUpload**](ComposerPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadConan"></a>
# **packagesUploadConan**
> ConanPackageUpload packagesUploadConan(owner, repo, data)

Create a new Conan package

Create a new Conan package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    ConanPackageUploadRequest data = new ConanPackageUploadRequest(); // ConanPackageUploadRequest | 
    try {
      ConanPackageUpload result = apiInstance.packagesUploadConan(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadConan");
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
| **data** | [**ConanPackageUploadRequest**](ConanPackageUploadRequest.md)|  | [optional] |

### Return type

[**ConanPackageUpload**](ConanPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadConda"></a>
# **packagesUploadConda**
> CondaPackageUpload packagesUploadConda(owner, repo, data)

Create a new Conda package

Create a new Conda package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    CondaPackageUploadRequest data = new CondaPackageUploadRequest(); // CondaPackageUploadRequest | 
    try {
      CondaPackageUpload result = apiInstance.packagesUploadConda(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadConda");
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
| **data** | [**CondaPackageUploadRequest**](CondaPackageUploadRequest.md)|  | [optional] |

### Return type

[**CondaPackageUpload**](CondaPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadCran"></a>
# **packagesUploadCran**
> CranPackageUpload packagesUploadCran(owner, repo, data)

Create a new CRAN package

Create a new CRAN package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    CranPackageUploadRequest data = new CranPackageUploadRequest(); // CranPackageUploadRequest | 
    try {
      CranPackageUpload result = apiInstance.packagesUploadCran(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadCran");
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
| **data** | [**CranPackageUploadRequest**](CranPackageUploadRequest.md)|  | [optional] |

### Return type

[**CranPackageUpload**](CranPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadDart"></a>
# **packagesUploadDart**
> DartPackageUpload packagesUploadDart(owner, repo, data)

Create a new Dart package

Create a new Dart package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    DartPackageUploadRequest data = new DartPackageUploadRequest(); // DartPackageUploadRequest | 
    try {
      DartPackageUpload result = apiInstance.packagesUploadDart(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadDart");
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
| **data** | [**DartPackageUploadRequest**](DartPackageUploadRequest.md)|  | [optional] |

### Return type

[**DartPackageUpload**](DartPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadDeb"></a>
# **packagesUploadDeb**
> DebPackageUpload packagesUploadDeb(owner, repo, data)

Create a new Debian package

Create a new Debian package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    DebPackageUploadRequest data = new DebPackageUploadRequest(); // DebPackageUploadRequest | 
    try {
      DebPackageUpload result = apiInstance.packagesUploadDeb(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadDeb");
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
| **data** | [**DebPackageUploadRequest**](DebPackageUploadRequest.md)|  | [optional] |

### Return type

[**DebPackageUpload**](DebPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadDocker"></a>
# **packagesUploadDocker**
> DockerPackageUpload packagesUploadDocker(owner, repo, data)

Create a new Docker package

Create a new Docker package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    DockerPackageUploadRequest data = new DockerPackageUploadRequest(); // DockerPackageUploadRequest | 
    try {
      DockerPackageUpload result = apiInstance.packagesUploadDocker(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadDocker");
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
| **data** | [**DockerPackageUploadRequest**](DockerPackageUploadRequest.md)|  | [optional] |

### Return type

[**DockerPackageUpload**](DockerPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadGeneric"></a>
# **packagesUploadGeneric**
> GenericPackageUpload packagesUploadGeneric(owner, repo, data)

Create a new Generic package

Create a new Generic package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    GenericPackageUploadRequest data = new GenericPackageUploadRequest(); // GenericPackageUploadRequest | 
    try {
      GenericPackageUpload result = apiInstance.packagesUploadGeneric(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadGeneric");
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
| **data** | [**GenericPackageUploadRequest**](GenericPackageUploadRequest.md)|  | [optional] |

### Return type

[**GenericPackageUpload**](GenericPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadGo"></a>
# **packagesUploadGo**
> GoPackageUpload packagesUploadGo(owner, repo, data)

Create a new Go package

Create a new Go package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    GoPackageUploadRequest data = new GoPackageUploadRequest(); // GoPackageUploadRequest | 
    try {
      GoPackageUpload result = apiInstance.packagesUploadGo(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadGo");
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
| **data** | [**GoPackageUploadRequest**](GoPackageUploadRequest.md)|  | [optional] |

### Return type

[**GoPackageUpload**](GoPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadHelm"></a>
# **packagesUploadHelm**
> HelmPackageUpload packagesUploadHelm(owner, repo, data)

Create a new Helm package

Create a new Helm package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    HelmPackageUploadRequest data = new HelmPackageUploadRequest(); // HelmPackageUploadRequest | 
    try {
      HelmPackageUpload result = apiInstance.packagesUploadHelm(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadHelm");
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
| **data** | [**HelmPackageUploadRequest**](HelmPackageUploadRequest.md)|  | [optional] |

### Return type

[**HelmPackageUpload**](HelmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadHex"></a>
# **packagesUploadHex**
> HexPackageUpload packagesUploadHex(owner, repo, data)

Create a new Hex package

Create a new Hex package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    HexPackageUploadRequest data = new HexPackageUploadRequest(); // HexPackageUploadRequest | 
    try {
      HexPackageUpload result = apiInstance.packagesUploadHex(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadHex");
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
| **data** | [**HexPackageUploadRequest**](HexPackageUploadRequest.md)|  | [optional] |

### Return type

[**HexPackageUpload**](HexPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadHuggingface"></a>
# **packagesUploadHuggingface**
> HuggingfacePackageUpload packagesUploadHuggingface(owner, repo, data)

Create a new HuggingFace package

Create a new HuggingFace package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    HuggingfacePackageUploadRequest data = new HuggingfacePackageUploadRequest(); // HuggingfacePackageUploadRequest | 
    try {
      HuggingfacePackageUpload result = apiInstance.packagesUploadHuggingface(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadHuggingface");
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
| **data** | [**HuggingfacePackageUploadRequest**](HuggingfacePackageUploadRequest.md)|  | [optional] |

### Return type

[**HuggingfacePackageUpload**](HuggingfacePackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadLuarocks"></a>
# **packagesUploadLuarocks**
> LuarocksPackageUpload packagesUploadLuarocks(owner, repo, data)

Create a new LuaRocks package

Create a new LuaRocks package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    LuarocksPackageUploadRequest data = new LuarocksPackageUploadRequest(); // LuarocksPackageUploadRequest | 
    try {
      LuarocksPackageUpload result = apiInstance.packagesUploadLuarocks(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadLuarocks");
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
| **data** | [**LuarocksPackageUploadRequest**](LuarocksPackageUploadRequest.md)|  | [optional] |

### Return type

[**LuarocksPackageUpload**](LuarocksPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadMaven"></a>
# **packagesUploadMaven**
> MavenPackageUpload packagesUploadMaven(owner, repo, data)

Create a new Maven package

Create a new Maven package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    MavenPackageUploadRequest data = new MavenPackageUploadRequest(); // MavenPackageUploadRequest | 
    try {
      MavenPackageUpload result = apiInstance.packagesUploadMaven(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadMaven");
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
| **data** | [**MavenPackageUploadRequest**](MavenPackageUploadRequest.md)|  | [optional] |

### Return type

[**MavenPackageUpload**](MavenPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadMcp"></a>
# **packagesUploadMcp**
> McpPackageUpload packagesUploadMcp(owner, repo, data)

Create a new MCP package

Create a new MCP package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    McpPackageUploadRequest data = new McpPackageUploadRequest(); // McpPackageUploadRequest | 
    try {
      McpPackageUpload result = apiInstance.packagesUploadMcp(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadMcp");
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
| **data** | [**McpPackageUploadRequest**](McpPackageUploadRequest.md)|  | [optional] |

### Return type

[**McpPackageUpload**](McpPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadNix"></a>
# **packagesUploadNix**
> NixPackageUpload packagesUploadNix(owner, repo, data)

Create a new Nix package

Create a new Nix package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    NixPackageUploadRequest data = new NixPackageUploadRequest(); // NixPackageUploadRequest | 
    try {
      NixPackageUpload result = apiInstance.packagesUploadNix(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadNix");
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
| **data** | [**NixPackageUploadRequest**](NixPackageUploadRequest.md)|  | [optional] |

### Return type

[**NixPackageUpload**](NixPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadNpm"></a>
# **packagesUploadNpm**
> NpmPackageUpload packagesUploadNpm(owner, repo, data)

Create a new npm package

Create a new npm package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    NpmPackageUploadRequest data = new NpmPackageUploadRequest(); // NpmPackageUploadRequest | 
    try {
      NpmPackageUpload result = apiInstance.packagesUploadNpm(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadNpm");
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
| **data** | [**NpmPackageUploadRequest**](NpmPackageUploadRequest.md)|  | [optional] |

### Return type

[**NpmPackageUpload**](NpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadNuget"></a>
# **packagesUploadNuget**
> NugetPackageUpload packagesUploadNuget(owner, repo, data)

Create a new NuGet package

Create a new NuGet package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    NugetPackageUploadRequest data = new NugetPackageUploadRequest(); // NugetPackageUploadRequest | 
    try {
      NugetPackageUpload result = apiInstance.packagesUploadNuget(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadNuget");
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
| **data** | [**NugetPackageUploadRequest**](NugetPackageUploadRequest.md)|  | [optional] |

### Return type

[**NugetPackageUpload**](NugetPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadP2"></a>
# **packagesUploadP2**
> P2PackageUpload packagesUploadP2(owner, repo, data)

Create a new P2 package

Create a new P2 package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    P2PackageUploadRequest data = new P2PackageUploadRequest(); // P2PackageUploadRequest | 
    try {
      P2PackageUpload result = apiInstance.packagesUploadP2(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadP2");
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
| **data** | [**P2PackageUploadRequest**](P2PackageUploadRequest.md)|  | [optional] |

### Return type

[**P2PackageUpload**](P2PackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadPython"></a>
# **packagesUploadPython**
> PythonPackageUpload packagesUploadPython(owner, repo, data)

Create a new Python package

Create a new Python package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    PythonPackageUploadRequest data = new PythonPackageUploadRequest(); // PythonPackageUploadRequest | 
    try {
      PythonPackageUpload result = apiInstance.packagesUploadPython(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadPython");
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
| **data** | [**PythonPackageUploadRequest**](PythonPackageUploadRequest.md)|  | [optional] |

### Return type

[**PythonPackageUpload**](PythonPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadRaw"></a>
# **packagesUploadRaw**
> RawPackageUpload packagesUploadRaw(owner, repo, data)

Create a new Raw package

Create a new Raw package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    RawPackageUploadRequest data = new RawPackageUploadRequest(); // RawPackageUploadRequest | 
    try {
      RawPackageUpload result = apiInstance.packagesUploadRaw(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadRaw");
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
| **data** | [**RawPackageUploadRequest**](RawPackageUploadRequest.md)|  | [optional] |

### Return type

[**RawPackageUpload**](RawPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadRpm"></a>
# **packagesUploadRpm**
> RpmPackageUpload packagesUploadRpm(owner, repo, data)

Create a new RedHat package

Create a new RedHat package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    RpmPackageUploadRequest data = new RpmPackageUploadRequest(); // RpmPackageUploadRequest | 
    try {
      RpmPackageUpload result = apiInstance.packagesUploadRpm(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadRpm");
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
| **data** | [**RpmPackageUploadRequest**](RpmPackageUploadRequest.md)|  | [optional] |

### Return type

[**RpmPackageUpload**](RpmPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadRuby"></a>
# **packagesUploadRuby**
> RubyPackageUpload packagesUploadRuby(owner, repo, data)

Create a new Ruby package

Create a new Ruby package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    RubyPackageUploadRequest data = new RubyPackageUploadRequest(); // RubyPackageUploadRequest | 
    try {
      RubyPackageUpload result = apiInstance.packagesUploadRuby(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadRuby");
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
| **data** | [**RubyPackageUploadRequest**](RubyPackageUploadRequest.md)|  | [optional] |

### Return type

[**RubyPackageUpload**](RubyPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadSkills"></a>
# **packagesUploadSkills**
> SkillsPackageUpload packagesUploadSkills(owner, repo, data)

Create a new AI Skills package

Create a new AI Skills package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    SkillsPackageUploadRequest data = new SkillsPackageUploadRequest(); // SkillsPackageUploadRequest | 
    try {
      SkillsPackageUpload result = apiInstance.packagesUploadSkills(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadSkills");
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
| **data** | [**SkillsPackageUploadRequest**](SkillsPackageUploadRequest.md)|  | [optional] |

### Return type

[**SkillsPackageUpload**](SkillsPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadSwift"></a>
# **packagesUploadSwift**
> SwiftPackageUpload packagesUploadSwift(owner, repo, data)

Create a new Swift package

Create a new Swift package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    SwiftPackageUploadRequest data = new SwiftPackageUploadRequest(); // SwiftPackageUploadRequest | 
    try {
      SwiftPackageUpload result = apiInstance.packagesUploadSwift(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadSwift");
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
| **data** | [**SwiftPackageUploadRequest**](SwiftPackageUploadRequest.md)|  | [optional] |

### Return type

[**SwiftPackageUpload**](SwiftPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadTerraform"></a>
# **packagesUploadTerraform**
> TerraformPackageUpload packagesUploadTerraform(owner, repo, data)

Create a new Terraform package

Create a new Terraform package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    TerraformPackageUploadRequest data = new TerraformPackageUploadRequest(); // TerraformPackageUploadRequest | 
    try {
      TerraformPackageUpload result = apiInstance.packagesUploadTerraform(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadTerraform");
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
| **data** | [**TerraformPackageUploadRequest**](TerraformPackageUploadRequest.md)|  | [optional] |

### Return type

[**TerraformPackageUpload**](TerraformPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadVagrant"></a>
# **packagesUploadVagrant**
> VagrantPackageUpload packagesUploadVagrant(owner, repo, data)

Create a new Vagrant package

Create a new Vagrant package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    VagrantPackageUploadRequest data = new VagrantPackageUploadRequest(); // VagrantPackageUploadRequest | 
    try {
      VagrantPackageUpload result = apiInstance.packagesUploadVagrant(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadVagrant");
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
| **data** | [**VagrantPackageUploadRequest**](VagrantPackageUploadRequest.md)|  | [optional] |

### Return type

[**VagrantPackageUpload**](VagrantPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesUploadVsx"></a>
# **packagesUploadVsx**
> VsxPackageUpload packagesUploadVsx(owner, repo, data)

Create a new VSX package

Create a new VSX package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    VsxPackageUploadRequest data = new VsxPackageUploadRequest(); // VsxPackageUploadRequest | 
    try {
      VsxPackageUpload result = apiInstance.packagesUploadVsx(owner, repo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesUploadVsx");
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
| **data** | [**VsxPackageUploadRequest**](VsxPackageUploadRequest.md)|  | [optional] |

### Return type

[**VsxPackageUpload**](VsxPackageUpload.md)

### Authorization

[apikey](../README.md#apikey), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload acknowledged and queued for synchronization. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadAlpine"></a>
# **packagesValidateUploadAlpine**
> packagesValidateUploadAlpine(owner, repo, data)

Validate parameters for create Alpine package

Validate parameters for create Alpine package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    AlpinePackageUploadRequest data = new AlpinePackageUploadRequest(); // AlpinePackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadAlpine(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadAlpine");
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
| **data** | [**AlpinePackageUploadRequest**](AlpinePackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadCargo"></a>
# **packagesValidateUploadCargo**
> packagesValidateUploadCargo(owner, repo, data)

Validate parameters for create Cargo package

Validate parameters for create Cargo package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    CargoPackageUploadRequest data = new CargoPackageUploadRequest(); // CargoPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadCargo(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadCargo");
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
| **data** | [**CargoPackageUploadRequest**](CargoPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadCocoapods"></a>
# **packagesValidateUploadCocoapods**
> packagesValidateUploadCocoapods(owner, repo, data)

Validate parameters for create CocoaPods package

Validate parameters for create CocoaPods package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    CocoapodsPackageUploadRequest data = new CocoapodsPackageUploadRequest(); // CocoapodsPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadCocoapods(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadCocoapods");
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
| **data** | [**CocoapodsPackageUploadRequest**](CocoapodsPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadComposer"></a>
# **packagesValidateUploadComposer**
> packagesValidateUploadComposer(owner, repo, data)

Validate parameters for create Composer package

Validate parameters for create Composer package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    ComposerPackageUploadRequest data = new ComposerPackageUploadRequest(); // ComposerPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadComposer(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadComposer");
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
| **data** | [**ComposerPackageUploadRequest**](ComposerPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadConan"></a>
# **packagesValidateUploadConan**
> packagesValidateUploadConan(owner, repo, data)

Validate parameters for create Conan package

Validate parameters for create Conan package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    ConanPackageUploadRequest data = new ConanPackageUploadRequest(); // ConanPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadConan(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadConan");
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
| **data** | [**ConanPackageUploadRequest**](ConanPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadConda"></a>
# **packagesValidateUploadConda**
> packagesValidateUploadConda(owner, repo, data)

Validate parameters for create Conda package

Validate parameters for create Conda package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    CondaPackageUploadRequest data = new CondaPackageUploadRequest(); // CondaPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadConda(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadConda");
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
| **data** | [**CondaPackageUploadRequest**](CondaPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadCran"></a>
# **packagesValidateUploadCran**
> packagesValidateUploadCran(owner, repo, data)

Validate parameters for create CRAN package

Validate parameters for create CRAN package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    CranPackageUploadRequest data = new CranPackageUploadRequest(); // CranPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadCran(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadCran");
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
| **data** | [**CranPackageUploadRequest**](CranPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadDart"></a>
# **packagesValidateUploadDart**
> packagesValidateUploadDart(owner, repo, data)

Validate parameters for create Dart package

Validate parameters for create Dart package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    DartPackageUploadRequest data = new DartPackageUploadRequest(); // DartPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadDart(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadDart");
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
| **data** | [**DartPackageUploadRequest**](DartPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadDeb"></a>
# **packagesValidateUploadDeb**
> packagesValidateUploadDeb(owner, repo, data)

Validate parameters for create Debian package

Validate parameters for create Debian package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    DebPackageUploadRequest data = new DebPackageUploadRequest(); // DebPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadDeb(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadDeb");
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
| **data** | [**DebPackageUploadRequest**](DebPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadDocker"></a>
# **packagesValidateUploadDocker**
> packagesValidateUploadDocker(owner, repo, data)

Validate parameters for create Docker package

Validate parameters for create Docker package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    DockerPackageUploadRequest data = new DockerPackageUploadRequest(); // DockerPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadDocker(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadDocker");
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
| **data** | [**DockerPackageUploadRequest**](DockerPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadGeneric"></a>
# **packagesValidateUploadGeneric**
> packagesValidateUploadGeneric(owner, repo, data)

Validate parameters for create Generic package

Validate parameters for create Generic package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    GenericPackageUploadRequest data = new GenericPackageUploadRequest(); // GenericPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadGeneric(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadGeneric");
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
| **data** | [**GenericPackageUploadRequest**](GenericPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadGo"></a>
# **packagesValidateUploadGo**
> packagesValidateUploadGo(owner, repo, data)

Validate parameters for create Go package

Validate parameters for create Go package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    GoPackageUploadRequest data = new GoPackageUploadRequest(); // GoPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadGo(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadGo");
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
| **data** | [**GoPackageUploadRequest**](GoPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadHelm"></a>
# **packagesValidateUploadHelm**
> packagesValidateUploadHelm(owner, repo, data)

Validate parameters for create Helm package

Validate parameters for create Helm package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    HelmPackageUploadRequest data = new HelmPackageUploadRequest(); // HelmPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadHelm(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadHelm");
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
| **data** | [**HelmPackageUploadRequest**](HelmPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadHex"></a>
# **packagesValidateUploadHex**
> packagesValidateUploadHex(owner, repo, data)

Validate parameters for create Hex package

Validate parameters for create Hex package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    HexPackageUploadRequest data = new HexPackageUploadRequest(); // HexPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadHex(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadHex");
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
| **data** | [**HexPackageUploadRequest**](HexPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadHuggingface"></a>
# **packagesValidateUploadHuggingface**
> packagesValidateUploadHuggingface(owner, repo, data)

Validate parameters for create HuggingFace package

Validate parameters for create HuggingFace package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    HuggingfacePackageUploadRequest data = new HuggingfacePackageUploadRequest(); // HuggingfacePackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadHuggingface(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadHuggingface");
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
| **data** | [**HuggingfacePackageUploadRequest**](HuggingfacePackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadLuarocks"></a>
# **packagesValidateUploadLuarocks**
> packagesValidateUploadLuarocks(owner, repo, data)

Validate parameters for create LuaRocks package

Validate parameters for create LuaRocks package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    LuarocksPackageUploadRequest data = new LuarocksPackageUploadRequest(); // LuarocksPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadLuarocks(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadLuarocks");
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
| **data** | [**LuarocksPackageUploadRequest**](LuarocksPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadMaven"></a>
# **packagesValidateUploadMaven**
> packagesValidateUploadMaven(owner, repo, data)

Validate parameters for create Maven package

Validate parameters for create Maven package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    MavenPackageUploadRequest data = new MavenPackageUploadRequest(); // MavenPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadMaven(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadMaven");
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
| **data** | [**MavenPackageUploadRequest**](MavenPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadMcp"></a>
# **packagesValidateUploadMcp**
> packagesValidateUploadMcp(owner, repo, data)

Validate parameters for create MCP package

Validate parameters for create MCP package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    McpPackageUploadRequest data = new McpPackageUploadRequest(); // McpPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadMcp(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadMcp");
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
| **data** | [**McpPackageUploadRequest**](McpPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadNix"></a>
# **packagesValidateUploadNix**
> packagesValidateUploadNix(owner, repo, data)

Validate parameters for create Nix package

Validate parameters for create Nix package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    NixPackageUploadRequest data = new NixPackageUploadRequest(); // NixPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadNix(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadNix");
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
| **data** | [**NixPackageUploadRequest**](NixPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadNpm"></a>
# **packagesValidateUploadNpm**
> packagesValidateUploadNpm(owner, repo, data)

Validate parameters for create npm package

Validate parameters for create npm package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    NpmPackageUploadRequest data = new NpmPackageUploadRequest(); // NpmPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadNpm(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadNpm");
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
| **data** | [**NpmPackageUploadRequest**](NpmPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadNuget"></a>
# **packagesValidateUploadNuget**
> packagesValidateUploadNuget(owner, repo, data)

Validate parameters for create NuGet package

Validate parameters for create NuGet package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    NugetPackageUploadRequest data = new NugetPackageUploadRequest(); // NugetPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadNuget(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadNuget");
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
| **data** | [**NugetPackageUploadRequest**](NugetPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadP2"></a>
# **packagesValidateUploadP2**
> packagesValidateUploadP2(owner, repo, data)

Validate parameters for create P2 package

Validate parameters for create P2 package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    P2PackageUploadRequest data = new P2PackageUploadRequest(); // P2PackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadP2(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadP2");
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
| **data** | [**P2PackageUploadRequest**](P2PackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadPython"></a>
# **packagesValidateUploadPython**
> packagesValidateUploadPython(owner, repo, data)

Validate parameters for create Python package

Validate parameters for create Python package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    PythonPackageUploadRequest data = new PythonPackageUploadRequest(); // PythonPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadPython(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadPython");
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
| **data** | [**PythonPackageUploadRequest**](PythonPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadRaw"></a>
# **packagesValidateUploadRaw**
> packagesValidateUploadRaw(owner, repo, data)

Validate parameters for create Raw package

Validate parameters for create Raw package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    RawPackageUploadRequest data = new RawPackageUploadRequest(); // RawPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadRaw(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadRaw");
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
| **data** | [**RawPackageUploadRequest**](RawPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadRpm"></a>
# **packagesValidateUploadRpm**
> packagesValidateUploadRpm(owner, repo, data)

Validate parameters for create RedHat package

Validate parameters for create RedHat package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    RpmPackageUploadRequest data = new RpmPackageUploadRequest(); // RpmPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadRpm(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadRpm");
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
| **data** | [**RpmPackageUploadRequest**](RpmPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadRuby"></a>
# **packagesValidateUploadRuby**
> packagesValidateUploadRuby(owner, repo, data)

Validate parameters for create Ruby package

Validate parameters for create Ruby package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    RubyPackageUploadRequest data = new RubyPackageUploadRequest(); // RubyPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadRuby(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadRuby");
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
| **data** | [**RubyPackageUploadRequest**](RubyPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadSkills"></a>
# **packagesValidateUploadSkills**
> packagesValidateUploadSkills(owner, repo, data)

Validate parameters for create AI Skills package

Validate parameters for create AI Skills package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    SkillsPackageUploadRequest data = new SkillsPackageUploadRequest(); // SkillsPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadSkills(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadSkills");
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
| **data** | [**SkillsPackageUploadRequest**](SkillsPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadSwift"></a>
# **packagesValidateUploadSwift**
> packagesValidateUploadSwift(owner, repo, data)

Validate parameters for create Swift package

Validate parameters for create Swift package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    SwiftPackageUploadRequest data = new SwiftPackageUploadRequest(); // SwiftPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadSwift(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadSwift");
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
| **data** | [**SwiftPackageUploadRequest**](SwiftPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadTerraform"></a>
# **packagesValidateUploadTerraform**
> packagesValidateUploadTerraform(owner, repo, data)

Validate parameters for create Terraform package

Validate parameters for create Terraform package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    TerraformPackageUploadRequest data = new TerraformPackageUploadRequest(); // TerraformPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadTerraform(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadTerraform");
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
| **data** | [**TerraformPackageUploadRequest**](TerraformPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadVagrant"></a>
# **packagesValidateUploadVagrant**
> packagesValidateUploadVagrant(owner, repo, data)

Validate parameters for create Vagrant package

Validate parameters for create Vagrant package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    VagrantPackageUploadRequest data = new VagrantPackageUploadRequest(); // VagrantPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadVagrant(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadVagrant");
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
| **data** | [**VagrantPackageUploadRequest**](VagrantPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

<a id="packagesValidateUploadVsx"></a>
# **packagesValidateUploadVsx**
> packagesValidateUploadVsx(owner, repo, data)

Validate parameters for create VSX package

Validate parameters for create VSX package

### Example
```java
// Import classes:
import io.cloudsmith.api.ApiClient;
import io.cloudsmith.api.ApiException;
import io.cloudsmith.api.Configuration;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.PackagesApi;

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

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String repo = "repo_example"; // String | 
    VsxPackageUploadRequest data = new VsxPackageUploadRequest(); // VsxPackageUploadRequest | 
    try {
      apiInstance.packagesValidateUploadVsx(owner, repo, data);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesValidateUploadVsx");
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
| **data** | [**VsxPackageUploadRequest**](VsxPackageUploadRequest.md)|  | [optional] |

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
| **204** | Validation was successful, parameters are OK. |  -  |
| **404** | Namespace (owner) or repository not found |  -  |
| **400** | Request could not be processed (see detail). |  -  |
| **422** | Missing or invalid parameters (see detail). |  -  |

