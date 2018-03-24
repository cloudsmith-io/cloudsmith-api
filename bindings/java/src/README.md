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
    <version>0.25.27</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.cloudsmith.api:cloudsmith-api:0.25.27"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/cloudsmith-api-0.25.27.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.cloudsmith.api.*;
import io.cloudsmith.api.auth.*;
import io.cloudsmith.api.models.*;
import io.cloudsmith.api.apis.DistrosApi;

import java.io.File;
import java.util.*;

public class DistrosApiExample {

    public static void main(String[] args) {
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

        // Configure API key authorization: csrf_token
        ApiKeyAuth csrf_token = (ApiKeyAuth) defaultClient.getAuthentication("csrf_token");
        csrf_token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //csrf_token.setApiKeyPrefix("Token");

        DistrosApi apiInstance = new DistrosApi();
        try {
            List<Distribution> result = apiInstance.distrosList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DistrosApi#distrosList");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api-prd.cloudsmith.io/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DistrosApi* | [**distrosList**](docs/DistrosApi.md#distrosList) | **GET** /distros/ | Get a list of all supported distributions.
*DistrosApi* | [**distrosRead**](docs/DistrosApi.md#distrosRead) | **GET** /distros/{slug}/ | View for viewing/listing package formats.
*FilesApi* | [**filesCreate**](docs/FilesApi.md#filesCreate) | **POST** /files/{owner}/{repo}/ | Request URL(s) to POST new package file upload(s) to.
*FilesApi* | [**filesValidate**](docs/FilesApi.md#filesValidate) | **POST** /files/{owner}/{repo}/validate/ | Validate parameters used for create.
*FormatsApi* | [**formatsList**](docs/FormatsApi.md#formatsList) | **GET** /formats/ | Get a list of all supported package formats.
*FormatsApi* | [**formatsRead**](docs/FormatsApi.md#formatsRead) | **GET** /formats/{slug}/ | Get a specific supported package format.
*NamespacesApi* | [**namespacesList**](docs/NamespacesApi.md#namespacesList) | **GET** /namespaces/ | Get a list of all namespaces the user belongs to.
*NamespacesApi* | [**namespacesRead**](docs/NamespacesApi.md#namespacesRead) | **GET** /namespaces/{slug}/ | Views for working with namespaces.
*OrgsApi* | [**orgsList**](docs/OrgsApi.md#orgsList) | **GET** /orgs/ | Get a list of all the organizations you are associated with.
*OrgsApi* | [**orgsRead**](docs/OrgsApi.md#orgsRead) | **GET** /orgs/{slug}/ | Views for working with organizations.
*PackagesApi* | [**packagesDelete**](docs/PackagesApi.md#packagesDelete) | **DELETE** /packages/{owner}/{repo}/{slug}/ | Delete a specific package in a repository.
*PackagesApi* | [**packagesList**](docs/PackagesApi.md#packagesList) | **GET** /packages/{owner}/{repo}/ | Views for working with repository packages.
*PackagesApi* | [**packagesRead**](docs/PackagesApi.md#packagesRead) | **GET** /packages/{owner}/{repo}/{slug}/ | Get a specific package in a repository.
*PackagesApi* | [**packagesStatus**](docs/PackagesApi.md#packagesStatus) | **GET** /packages/{owner}/{repo}/{slug}/status/ | Get the synchronisation status for a package.
*PackagesApi* | [**packagesUploadDeb**](docs/PackagesApi.md#packagesUploadDeb) | **POST** /packages/{owner}/{repo}/upload/deb/ | Create a new Debian package
*PackagesApi* | [**packagesUploadMaven**](docs/PackagesApi.md#packagesUploadMaven) | **POST** /packages/{owner}/{repo}/upload/maven/ | Create a new Maven package
*PackagesApi* | [**packagesUploadPython**](docs/PackagesApi.md#packagesUploadPython) | **POST** /packages/{owner}/{repo}/upload/python/ | Create a new Python package
*PackagesApi* | [**packagesUploadRaw**](docs/PackagesApi.md#packagesUploadRaw) | **POST** /packages/{owner}/{repo}/upload/raw/ | Create a new Raw package
*PackagesApi* | [**packagesUploadRpm**](docs/PackagesApi.md#packagesUploadRpm) | **POST** /packages/{owner}/{repo}/upload/rpm/ | Create a new RedHat package
*PackagesApi* | [**packagesUploadRuby**](docs/PackagesApi.md#packagesUploadRuby) | **POST** /packages/{owner}/{repo}/upload/ruby/ | Create a new Ruby package
*PackagesApi* | [**packagesUploadVagrant**](docs/PackagesApi.md#packagesUploadVagrant) | **POST** /packages/{owner}/{repo}/upload/vagrant/ | Create a new Vagrant package
*PackagesApi* | [**packagesValidateUploadDeb**](docs/PackagesApi.md#packagesValidateUploadDeb) | **POST** /packages/{owner}/{repo}/validate-upload/deb/ | Validate parameters for create Debian package
*PackagesApi* | [**packagesValidateUploadMaven**](docs/PackagesApi.md#packagesValidateUploadMaven) | **POST** /packages/{owner}/{repo}/validate-upload/maven/ | Validate parameters for create Maven package
*PackagesApi* | [**packagesValidateUploadPython**](docs/PackagesApi.md#packagesValidateUploadPython) | **POST** /packages/{owner}/{repo}/validate-upload/python/ | Validate parameters for create Python package
*PackagesApi* | [**packagesValidateUploadRaw**](docs/PackagesApi.md#packagesValidateUploadRaw) | **POST** /packages/{owner}/{repo}/validate-upload/raw/ | Validate parameters for create Raw package
*PackagesApi* | [**packagesValidateUploadRpm**](docs/PackagesApi.md#packagesValidateUploadRpm) | **POST** /packages/{owner}/{repo}/validate-upload/rpm/ | Validate parameters for create RedHat package
*PackagesApi* | [**packagesValidateUploadRuby**](docs/PackagesApi.md#packagesValidateUploadRuby) | **POST** /packages/{owner}/{repo}/validate-upload/ruby/ | Validate parameters for create Ruby package
*PackagesApi* | [**packagesValidateUploadVagrant**](docs/PackagesApi.md#packagesValidateUploadVagrant) | **POST** /packages/{owner}/{repo}/validate-upload/vagrant/ | Validate parameters for create Vagrant package
*ReposApi* | [**reposList**](docs/ReposApi.md#reposList) | **GET** /repos/{owner}/ | Get a list of all repositories within a namespace.
*ReposApi* | [**reposRead**](docs/ReposApi.md#reposRead) | **GET** /repos/{owner}/{slug}/ | Views for working with repositories.
*StatusApi* | [**statusCheckBasic**](docs/StatusApi.md#statusCheckBasic) | **GET** /status/check/basic/ | Endpoint to check basic API connectivity.
*UserApi* | [**userSelf**](docs/UserApi.md#userSelf) | **GET** /user/self/ | Provide a brief for the current user (if any).
*UserApi* | [**userTokenCreate**](docs/UserApi.md#userTokenCreate) | **POST** /user/token/ | Retrieve the API key/token for the authenticated user.
*UsersApi* | [**usersProfileRead**](docs/UsersApi.md#usersProfileRead) | **GET** /users/profile/{slug}/ | Provide a brief for the specified user (if any).


## Documentation for Models

 - [Distribution](docs/Distribution.md)
 - [DistributionVersions](docs/DistributionVersions.md)
 - [FilesCreate](docs/FilesCreate.md)
 - [FilesValidate](docs/FilesValidate.md)
 - [Format](docs/Format.md)
 - [FormatDistributions](docs/FormatDistributions.md)
 - [MavenPackageUpload](docs/MavenPackageUpload.md)
 - [Namespace](docs/Namespace.md)
 - [Organization](docs/Organization.md)
 - [PackageFileUpload](docs/PackageFileUpload.md)
 - [PackageStatus](docs/PackageStatus.md)
 - [PackagesUploadDeb](docs/PackagesUploadDeb.md)
 - [PackagesUploadMaven](docs/PackagesUploadMaven.md)
 - [PackagesUploadPython](docs/PackagesUploadPython.md)
 - [PackagesUploadRaw](docs/PackagesUploadRaw.md)
 - [PackagesUploadRpm](docs/PackagesUploadRpm.md)
 - [PackagesUploadRuby](docs/PackagesUploadRuby.md)
 - [PackagesUploadVagrant](docs/PackagesUploadVagrant.md)
 - [PackagesValidateuploadDeb](docs/PackagesValidateuploadDeb.md)
 - [PackagesValidateuploadMaven](docs/PackagesValidateuploadMaven.md)
 - [PackagesValidateuploadPython](docs/PackagesValidateuploadPython.md)
 - [PackagesValidateuploadRaw](docs/PackagesValidateuploadRaw.md)
 - [PackagesValidateuploadRpm](docs/PackagesValidateuploadRpm.md)
 - [PackagesValidateuploadRuby](docs/PackagesValidateuploadRuby.md)
 - [PackagesValidateuploadVagrant](docs/PackagesValidateuploadVagrant.md)
 - [Repository](docs/Repository.md)
 - [ReposownerGpgKeys](docs/ReposownerGpgKeys.md)
 - [RpmPackageUpload](docs/RpmPackageUpload.md)
 - [RpmPackageUploadArchitectures](docs/RpmPackageUploadArchitectures.md)
 - [RpmPackageUploadFiles](docs/RpmPackageUploadFiles.md)
 - [Status](docs/Status.md)
 - [StatusBasic](docs/StatusBasic.md)
 - [UserAuthToken](docs/UserAuthToken.md)
 - [UserBrief](docs/UserBrief.md)
 - [UserProfile](docs/UserProfile.md)
 - [UserTokenCreate](docs/UserTokenCreate.md)
 - [VagrantPackageUpload](docs/VagrantPackageUpload.md)


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

