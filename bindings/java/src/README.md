# cloudsmith-api

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.cloudsmith.api</groupId>
    <artifactId>cloudsmith-api</artifactId>
    <version>0.51.21</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.cloudsmith.api:cloudsmith-api:0.51.21"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/cloudsmith-api-0.51.21.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.cloudsmith.api.*;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.BadgesApi;

import java.io.File;
import java.util.*;

public class BadgesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: apikey
        ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
        apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apikey.setApiKeyPrefix("Token");

        // Configure API key authorization: csrf_token
        ApiKeyAuth csrf_token = (ApiKeyAuth) defaultClient.getAuthentication("csrf_token");
        csrf_token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //csrf_token.setApiKeyPrefix("Token");

        BadgesApi apiInstance = new BadgesApi();
        String owner = "owner_example"; // String | 
        String repo = "repo_example"; // String | 
        String packageFormat = "packageFormat_example"; // String | 
        String packageName = "packageName_example"; // String | 
        String packageVersion = "packageVersion_example"; // String | 
        String packageIdentifiers = "packageIdentifiers_example"; // String | 
        String badgeToken = "badgeToken_example"; // String | Badge token to authenticate for private packages
        Boolean render = true; // Boolean | If true, badge will be rendered
        try {
            apiInstance.badgesVersionList(owner, repo, packageFormat, packageName, packageVersion, packageIdentifiers, badgeToken, render);
        } catch (ApiException e) {
            System.err.println("Exception when calling BadgesApi#badgesVersionList");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.cloudsmith.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BadgesApi* | [**badgesVersionList**](docs/BadgesApi.md#badgesVersionList) | **GET** /badges/version/{owner}/{repo}/{package_format}/{package_name}/{package_version}/{package_identifiers}/ | Get latest package version for a package or package group.
*DistrosApi* | [**distrosList**](docs/DistrosApi.md#distrosList) | **GET** /distros/ | Get a list of all supported distributions.
*DistrosApi* | [**distrosRead**](docs/DistrosApi.md#distrosRead) | **GET** /distros/{slug}/ | View for viewing/listing distributions.
*EntitlementsApi* | [**entitlementsCreate**](docs/EntitlementsApi.md#entitlementsCreate) | **POST** /entitlements/{owner}/{repo}/ | Create a specific entitlement in a repository.
*EntitlementsApi* | [**entitlementsDelete**](docs/EntitlementsApi.md#entitlementsDelete) | **DELETE** /entitlements/{owner}/{repo}/{identifier}/ | Delete a specific entitlement in a repository.
*EntitlementsApi* | [**entitlementsDisable**](docs/EntitlementsApi.md#entitlementsDisable) | **POST** /entitlements/{owner}/{repo}/{identifier}/disable/ | Disable an entitlement token in a repository.
*EntitlementsApi* | [**entitlementsEnable**](docs/EntitlementsApi.md#entitlementsEnable) | **POST** /entitlements/{owner}/{repo}/{identifier}/enable/ | Enable an entitlement token in a repository.
*EntitlementsApi* | [**entitlementsList**](docs/EntitlementsApi.md#entitlementsList) | **GET** /entitlements/{owner}/{repo}/ | Get a list of all entitlements in a repository.
*EntitlementsApi* | [**entitlementsPartialUpdate**](docs/EntitlementsApi.md#entitlementsPartialUpdate) | **PATCH** /entitlements/{owner}/{repo}/{identifier}/ | Update a specific entitlement in a repository.
*EntitlementsApi* | [**entitlementsRead**](docs/EntitlementsApi.md#entitlementsRead) | **GET** /entitlements/{owner}/{repo}/{identifier}/ | Get a specific entitlement in a repository.
*EntitlementsApi* | [**entitlementsRefresh**](docs/EntitlementsApi.md#entitlementsRefresh) | **POST** /entitlements/{owner}/{repo}/{identifier}/refresh/ | Refresh an entitlement token in a repository.
*EntitlementsApi* | [**entitlementsReset**](docs/EntitlementsApi.md#entitlementsReset) | **POST** /entitlements/{owner}/{repo}/{identifier}/reset/ | Reset the statistics for an entitlement token in a repository.
*EntitlementsApi* | [**entitlementsSync**](docs/EntitlementsApi.md#entitlementsSync) | **POST** /entitlements/{owner}/{repo}/sync/ | Synchronise tokens from a source repository.
*FilesApi* | [**filesAbort**](docs/FilesApi.md#filesAbort) | **POST** /files/{owner}/{repo}/{identifier}/abort/ | Abort a multipart file upload.
*FilesApi* | [**filesComplete**](docs/FilesApi.md#filesComplete) | **POST** /files/{owner}/{repo}/{identifier}/complete/ | Complete a multipart file upload.
*FilesApi* | [**filesCreate**](docs/FilesApi.md#filesCreate) | **POST** /files/{owner}/{repo}/ | Request URL(s) to upload new package file upload(s) to.
*FilesApi* | [**filesInfo**](docs/FilesApi.md#filesInfo) | **GET** /files/{owner}/{repo}/{identifier}/info/ | Get upload information for a multipart file upload.
*FilesApi* | [**filesValidate**](docs/FilesApi.md#filesValidate) | **POST** /files/{owner}/{repo}/validate/ | Validate parameters used for create.
*FormatsApi* | [**formatsList**](docs/FormatsApi.md#formatsList) | **GET** /formats/ | Get a list of all supported package formats.
*FormatsApi* | [**formatsRead**](docs/FormatsApi.md#formatsRead) | **GET** /formats/{slug}/ | Get a specific supported package format.
*NamespacesApi* | [**namespacesList**](docs/NamespacesApi.md#namespacesList) | **GET** /namespaces/ | Get a list of all namespaces the user belongs to.
*NamespacesApi* | [**namespacesRead**](docs/NamespacesApi.md#namespacesRead) | **GET** /namespaces/{slug}/ | Views for working with namespaces.
*OrgsApi* | [**orgsList**](docs/OrgsApi.md#orgsList) | **GET** /orgs/ | Get a list of all the organizations you are associated with.
*OrgsApi* | [**orgsRead**](docs/OrgsApi.md#orgsRead) | **GET** /orgs/{slug}/ | Views for working with organizations.
*PackagesApi* | [**packagesCopy**](docs/PackagesApi.md#packagesCopy) | **POST** /packages/{owner}/{repo}/{identifier}/copy/ | Copy a package to another repository.
*PackagesApi* | [**packagesDelete**](docs/PackagesApi.md#packagesDelete) | **DELETE** /packages/{owner}/{repo}/{identifier}/ | Delete a specific package in a repository.
*PackagesApi* | [**packagesList**](docs/PackagesApi.md#packagesList) | **GET** /packages/{owner}/{repo}/ | Get a list of all packages associated with repository.
*PackagesApi* | [**packagesMove**](docs/PackagesApi.md#packagesMove) | **POST** /packages/{owner}/{repo}/{identifier}/move/ | Move a package to another repository.
*PackagesApi* | [**packagesRead**](docs/PackagesApi.md#packagesRead) | **GET** /packages/{owner}/{repo}/{identifier}/ | Get a specific package in a repository.
*PackagesApi* | [**packagesResync**](docs/PackagesApi.md#packagesResync) | **POST** /packages/{owner}/{repo}/{identifier}/resync/ | Schedule a package for resynchronisation.
*PackagesApi* | [**packagesStatus**](docs/PackagesApi.md#packagesStatus) | **GET** /packages/{owner}/{repo}/{identifier}/status/ | Get the synchronisation status for a package.
*PackagesApi* | [**packagesUploadAlpine**](docs/PackagesApi.md#packagesUploadAlpine) | **POST** /packages/{owner}/{repo}/upload/alpine/ | Create a new Alpine package
*PackagesApi* | [**packagesUploadCargo**](docs/PackagesApi.md#packagesUploadCargo) | **POST** /packages/{owner}/{repo}/upload/cargo/ | Create a new Cargo package
*PackagesApi* | [**packagesUploadCocoapods**](docs/PackagesApi.md#packagesUploadCocoapods) | **POST** /packages/{owner}/{repo}/upload/cocoapods/ | Create a new CocoaPods package
*PackagesApi* | [**packagesUploadComposer**](docs/PackagesApi.md#packagesUploadComposer) | **POST** /packages/{owner}/{repo}/upload/composer/ | Create a new Composer package
*PackagesApi* | [**packagesUploadConan**](docs/PackagesApi.md#packagesUploadConan) | **POST** /packages/{owner}/{repo}/upload/conan/ | Create a new Conan package
*PackagesApi* | [**packagesUploadCran**](docs/PackagesApi.md#packagesUploadCran) | **POST** /packages/{owner}/{repo}/upload/cran/ | Create a new CRAN package
*PackagesApi* | [**packagesUploadDart**](docs/PackagesApi.md#packagesUploadDart) | **POST** /packages/{owner}/{repo}/upload/dart/ | Create a new Dart package
*PackagesApi* | [**packagesUploadDeb**](docs/PackagesApi.md#packagesUploadDeb) | **POST** /packages/{owner}/{repo}/upload/deb/ | Create a new Debian package
*PackagesApi* | [**packagesUploadDocker**](docs/PackagesApi.md#packagesUploadDocker) | **POST** /packages/{owner}/{repo}/upload/docker/ | Create a new Docker package
*PackagesApi* | [**packagesUploadGo**](docs/PackagesApi.md#packagesUploadGo) | **POST** /packages/{owner}/{repo}/upload/go/ | Create a new Go package
*PackagesApi* | [**packagesUploadHelm**](docs/PackagesApi.md#packagesUploadHelm) | **POST** /packages/{owner}/{repo}/upload/helm/ | Create a new Helm package
*PackagesApi* | [**packagesUploadLuarocks**](docs/PackagesApi.md#packagesUploadLuarocks) | **POST** /packages/{owner}/{repo}/upload/luarocks/ | Create a new LuaRocks package
*PackagesApi* | [**packagesUploadMaven**](docs/PackagesApi.md#packagesUploadMaven) | **POST** /packages/{owner}/{repo}/upload/maven/ | Create a new Maven package
*PackagesApi* | [**packagesUploadNpm**](docs/PackagesApi.md#packagesUploadNpm) | **POST** /packages/{owner}/{repo}/upload/npm/ | Create a new npm package
*PackagesApi* | [**packagesUploadNuget**](docs/PackagesApi.md#packagesUploadNuget) | **POST** /packages/{owner}/{repo}/upload/nuget/ | Create a new NuGet package
*PackagesApi* | [**packagesUploadPython**](docs/PackagesApi.md#packagesUploadPython) | **POST** /packages/{owner}/{repo}/upload/python/ | Create a new Python package
*PackagesApi* | [**packagesUploadRaw**](docs/PackagesApi.md#packagesUploadRaw) | **POST** /packages/{owner}/{repo}/upload/raw/ | Create a new Raw package
*PackagesApi* | [**packagesUploadRpm**](docs/PackagesApi.md#packagesUploadRpm) | **POST** /packages/{owner}/{repo}/upload/rpm/ | Create a new RedHat package
*PackagesApi* | [**packagesUploadRuby**](docs/PackagesApi.md#packagesUploadRuby) | **POST** /packages/{owner}/{repo}/upload/ruby/ | Create a new Ruby package
*PackagesApi* | [**packagesUploadVagrant**](docs/PackagesApi.md#packagesUploadVagrant) | **POST** /packages/{owner}/{repo}/upload/vagrant/ | Create a new Vagrant package
*PackagesApi* | [**packagesValidateUploadAlpine**](docs/PackagesApi.md#packagesValidateUploadAlpine) | **POST** /packages/{owner}/{repo}/validate-upload/alpine/ | Validate parameters for create Alpine package
*PackagesApi* | [**packagesValidateUploadCargo**](docs/PackagesApi.md#packagesValidateUploadCargo) | **POST** /packages/{owner}/{repo}/validate-upload/cargo/ | Validate parameters for create Cargo package
*PackagesApi* | [**packagesValidateUploadCocoapods**](docs/PackagesApi.md#packagesValidateUploadCocoapods) | **POST** /packages/{owner}/{repo}/validate-upload/cocoapods/ | Validate parameters for create CocoaPods package
*PackagesApi* | [**packagesValidateUploadComposer**](docs/PackagesApi.md#packagesValidateUploadComposer) | **POST** /packages/{owner}/{repo}/validate-upload/composer/ | Validate parameters for create Composer package
*PackagesApi* | [**packagesValidateUploadConan**](docs/PackagesApi.md#packagesValidateUploadConan) | **POST** /packages/{owner}/{repo}/validate-upload/conan/ | Validate parameters for create Conan package
*PackagesApi* | [**packagesValidateUploadCran**](docs/PackagesApi.md#packagesValidateUploadCran) | **POST** /packages/{owner}/{repo}/validate-upload/cran/ | Validate parameters for create CRAN package
*PackagesApi* | [**packagesValidateUploadDart**](docs/PackagesApi.md#packagesValidateUploadDart) | **POST** /packages/{owner}/{repo}/validate-upload/dart/ | Validate parameters for create Dart package
*PackagesApi* | [**packagesValidateUploadDeb**](docs/PackagesApi.md#packagesValidateUploadDeb) | **POST** /packages/{owner}/{repo}/validate-upload/deb/ | Validate parameters for create Debian package
*PackagesApi* | [**packagesValidateUploadDocker**](docs/PackagesApi.md#packagesValidateUploadDocker) | **POST** /packages/{owner}/{repo}/validate-upload/docker/ | Validate parameters for create Docker package
*PackagesApi* | [**packagesValidateUploadGo**](docs/PackagesApi.md#packagesValidateUploadGo) | **POST** /packages/{owner}/{repo}/validate-upload/go/ | Validate parameters for create Go package
*PackagesApi* | [**packagesValidateUploadHelm**](docs/PackagesApi.md#packagesValidateUploadHelm) | **POST** /packages/{owner}/{repo}/validate-upload/helm/ | Validate parameters for create Helm package
*PackagesApi* | [**packagesValidateUploadLuarocks**](docs/PackagesApi.md#packagesValidateUploadLuarocks) | **POST** /packages/{owner}/{repo}/validate-upload/luarocks/ | Validate parameters for create LuaRocks package
*PackagesApi* | [**packagesValidateUploadMaven**](docs/PackagesApi.md#packagesValidateUploadMaven) | **POST** /packages/{owner}/{repo}/validate-upload/maven/ | Validate parameters for create Maven package
*PackagesApi* | [**packagesValidateUploadNpm**](docs/PackagesApi.md#packagesValidateUploadNpm) | **POST** /packages/{owner}/{repo}/validate-upload/npm/ | Validate parameters for create npm package
*PackagesApi* | [**packagesValidateUploadNuget**](docs/PackagesApi.md#packagesValidateUploadNuget) | **POST** /packages/{owner}/{repo}/validate-upload/nuget/ | Validate parameters for create NuGet package
*PackagesApi* | [**packagesValidateUploadPython**](docs/PackagesApi.md#packagesValidateUploadPython) | **POST** /packages/{owner}/{repo}/validate-upload/python/ | Validate parameters for create Python package
*PackagesApi* | [**packagesValidateUploadRaw**](docs/PackagesApi.md#packagesValidateUploadRaw) | **POST** /packages/{owner}/{repo}/validate-upload/raw/ | Validate parameters for create Raw package
*PackagesApi* | [**packagesValidateUploadRpm**](docs/PackagesApi.md#packagesValidateUploadRpm) | **POST** /packages/{owner}/{repo}/validate-upload/rpm/ | Validate parameters for create RedHat package
*PackagesApi* | [**packagesValidateUploadRuby**](docs/PackagesApi.md#packagesValidateUploadRuby) | **POST** /packages/{owner}/{repo}/validate-upload/ruby/ | Validate parameters for create Ruby package
*PackagesApi* | [**packagesValidateUploadVagrant**](docs/PackagesApi.md#packagesValidateUploadVagrant) | **POST** /packages/{owner}/{repo}/validate-upload/vagrant/ | Validate parameters for create Vagrant package
*RatesApi* | [**ratesLimitsList**](docs/RatesApi.md#ratesLimitsList) | **GET** /rates/limits/ | Endpoint to check rate limits for current user.
*ReposApi* | [**reposAllList**](docs/ReposApi.md#reposAllList) | **GET** /repos/ | Get a list of all repositories associated with current user.
*ReposApi* | [**reposCreate**](docs/ReposApi.md#reposCreate) | **POST** /repos/{owner}/ | Create a new repository in a given namespace.
*ReposApi* | [**reposDelete**](docs/ReposApi.md#reposDelete) | **DELETE** /repos/{owner}/{identifier}/ | Delete a repository in a given namespace.
*ReposApi* | [**reposList**](docs/ReposApi.md#reposList) | **GET** /repos/{owner}/ | Get a list of all repositories within a namespace.
*ReposApi* | [**reposPartialUpdate**](docs/ReposApi.md#reposPartialUpdate) | **PATCH** /repos/{owner}/{identifier}/ | Update details about a repository in a given namespace.
*ReposApi* | [**reposRead**](docs/ReposApi.md#reposRead) | **GET** /repos/{owner}/{identifier}/ | Get a specific repository.
*StatusApi* | [**statusCheckBasic**](docs/StatusApi.md#statusCheckBasic) | **GET** /status/check/basic/ | Endpoint to check basic API connectivity.
*UserApi* | [**userSelf**](docs/UserApi.md#userSelf) | **GET** /user/self/ | Provide a brief for the current user (if any).
*UserApi* | [**userTokenCreate**](docs/UserApi.md#userTokenCreate) | **POST** /user/token/ | Retrieve the API key/token for the authenticated user.
*UsersApi* | [**usersProfileRead**](docs/UsersApi.md#usersProfileRead) | **GET** /users/profile/{slug}/ | Provide a brief for the specified user (if any).
*WebhooksApi* | [**webhooksCreate**](docs/WebhooksApi.md#webhooksCreate) | **POST** /webhooks/{owner}/{repo}/ | Create a specific webhook in a repository.
*WebhooksApi* | [**webhooksDelete**](docs/WebhooksApi.md#webhooksDelete) | **DELETE** /webhooks/{owner}/{repo}/{identifier}/ | Delete a specific webhook in a repository.
*WebhooksApi* | [**webhooksList**](docs/WebhooksApi.md#webhooksList) | **GET** /webhooks/{owner}/{repo}/ | Get a list of all webhooks in a repository.
*WebhooksApi* | [**webhooksPartialUpdate**](docs/WebhooksApi.md#webhooksPartialUpdate) | **PATCH** /webhooks/{owner}/{repo}/{identifier}/ | Update a specific webhook in a repository.
*WebhooksApi* | [**webhooksRead**](docs/WebhooksApi.md#webhooksRead) | **GET** /webhooks/{owner}/{repo}/{identifier}/ | Views for working with repository webhooks.


## Documentation for Models

 - [ConanPackageUpload](docs/ConanPackageUpload.md)
 - [Distribution](docs/Distribution.md)
 - [DistrosVersions](docs/DistrosVersions.md)
 - [EntitlementsCreate](docs/EntitlementsCreate.md)
 - [EntitlementsPartialUpdate](docs/EntitlementsPartialUpdate.md)
 - [EntitlementsRefresh](docs/EntitlementsRefresh.md)
 - [EntitlementsSync](docs/EntitlementsSync.md)
 - [FilesAbort](docs/FilesAbort.md)
 - [FilesComplete](docs/FilesComplete.md)
 - [FilesCreate](docs/FilesCreate.md)
 - [FilesValidate](docs/FilesValidate.md)
 - [Format](docs/Format.md)
 - [FormatsDistributions](docs/FormatsDistributions.md)
 - [MavenPackageUpload](docs/MavenPackageUpload.md)
 - [ModelPackage](docs/ModelPackage.md)
 - [Namespace](docs/Namespace.md)
 - [Organization](docs/Organization.md)
 - [PackageCopy](docs/PackageCopy.md)
 - [PackageFilePartsUpload](docs/PackageFilePartsUpload.md)
 - [PackageFileUpload](docs/PackageFileUpload.md)
 - [PackageMove](docs/PackageMove.md)
 - [PackageStatus](docs/PackageStatus.md)
 - [PackagesCopy](docs/PackagesCopy.md)
 - [PackagesMove](docs/PackagesMove.md)
 - [PackagesResync](docs/PackagesResync.md)
 - [PackagesUploadAlpine](docs/PackagesUploadAlpine.md)
 - [PackagesUploadCargo](docs/PackagesUploadCargo.md)
 - [PackagesUploadCocoapods](docs/PackagesUploadCocoapods.md)
 - [PackagesUploadComposer](docs/PackagesUploadComposer.md)
 - [PackagesUploadConan](docs/PackagesUploadConan.md)
 - [PackagesUploadCran](docs/PackagesUploadCran.md)
 - [PackagesUploadDart](docs/PackagesUploadDart.md)
 - [PackagesUploadDeb](docs/PackagesUploadDeb.md)
 - [PackagesUploadDocker](docs/PackagesUploadDocker.md)
 - [PackagesUploadGo](docs/PackagesUploadGo.md)
 - [PackagesUploadHelm](docs/PackagesUploadHelm.md)
 - [PackagesUploadLuarocks](docs/PackagesUploadLuarocks.md)
 - [PackagesUploadMaven](docs/PackagesUploadMaven.md)
 - [PackagesUploadNpm](docs/PackagesUploadNpm.md)
 - [PackagesUploadNuget](docs/PackagesUploadNuget.md)
 - [PackagesUploadPython](docs/PackagesUploadPython.md)
 - [PackagesUploadRaw](docs/PackagesUploadRaw.md)
 - [PackagesUploadRpm](docs/PackagesUploadRpm.md)
 - [PackagesUploadRuby](docs/PackagesUploadRuby.md)
 - [PackagesUploadVagrant](docs/PackagesUploadVagrant.md)
 - [PackagesValidateuploadAlpine](docs/PackagesValidateuploadAlpine.md)
 - [PackagesValidateuploadCargo](docs/PackagesValidateuploadCargo.md)
 - [PackagesValidateuploadCocoapods](docs/PackagesValidateuploadCocoapods.md)
 - [PackagesValidateuploadComposer](docs/PackagesValidateuploadComposer.md)
 - [PackagesValidateuploadConan](docs/PackagesValidateuploadConan.md)
 - [PackagesValidateuploadCran](docs/PackagesValidateuploadCran.md)
 - [PackagesValidateuploadDart](docs/PackagesValidateuploadDart.md)
 - [PackagesValidateuploadDeb](docs/PackagesValidateuploadDeb.md)
 - [PackagesValidateuploadDocker](docs/PackagesValidateuploadDocker.md)
 - [PackagesValidateuploadGo](docs/PackagesValidateuploadGo.md)
 - [PackagesValidateuploadHelm](docs/PackagesValidateuploadHelm.md)
 - [PackagesValidateuploadLuarocks](docs/PackagesValidateuploadLuarocks.md)
 - [PackagesValidateuploadMaven](docs/PackagesValidateuploadMaven.md)
 - [PackagesValidateuploadNpm](docs/PackagesValidateuploadNpm.md)
 - [PackagesValidateuploadNuget](docs/PackagesValidateuploadNuget.md)
 - [PackagesValidateuploadPython](docs/PackagesValidateuploadPython.md)
 - [PackagesValidateuploadRaw](docs/PackagesValidateuploadRaw.md)
 - [PackagesValidateuploadRpm](docs/PackagesValidateuploadRpm.md)
 - [PackagesValidateuploadRuby](docs/PackagesValidateuploadRuby.md)
 - [PackagesValidateuploadVagrant](docs/PackagesValidateuploadVagrant.md)
 - [PackagesownerrepoArchitectures](docs/PackagesownerrepoArchitectures.md)
 - [PackagesownerrepoFiles](docs/PackagesownerrepoFiles.md)
 - [RawPackageUpload](docs/RawPackageUpload.md)
 - [ReposCreate](docs/ReposCreate.md)
 - [ReposGpgKeys](docs/ReposGpgKeys.md)
 - [ReposPartialUpdate](docs/ReposPartialUpdate.md)
 - [Repository](docs/Repository.md)
 - [RepositoryToken](docs/RepositoryToken.md)
 - [RepositoryTokenRefresh](docs/RepositoryTokenRefresh.md)
 - [RepositoryTokenSync](docs/RepositoryTokenSync.md)
 - [RepositoryTokenSyncTokens](docs/RepositoryTokenSyncTokens.md)
 - [RepositoryWebhook](docs/RepositoryWebhook.md)
 - [ResourcesRateCheck](docs/ResourcesRateCheck.md)
 - [Status](docs/Status.md)
 - [StatusBasic](docs/StatusBasic.md)
 - [UserAuthToken](docs/UserAuthToken.md)
 - [UserBrief](docs/UserBrief.md)
 - [UserProfile](docs/UserProfile.md)
 - [UserTokenCreate](docs/UserTokenCreate.md)
 - [VagrantPackageUpload](docs/VagrantPackageUpload.md)
 - [WebhooksCreate](docs/WebhooksCreate.md)
 - [WebhooksPartialUpdate](docs/WebhooksPartialUpdate.md)
 - [WebhooksownerrepoTemplates](docs/WebhooksownerrepoTemplates.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apikey

- **Type**: API key
- **API key parameter name**: X-Api-Key
- **Location**: HTTP header

### basic

- **Type**: HTTP basic authentication

### csrf_token

- **Type**: API key
- **API key parameter name**: X-CSRFToken
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@cloudsmith.io

