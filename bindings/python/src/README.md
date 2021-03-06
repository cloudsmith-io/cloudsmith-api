# cloudsmith-api
The API to the Cloudsmith Service

This Python package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: v1
- Package version: 0.57.1
- Build package: io.swagger.codegen.languages.PythonClientCodegen
For more information, please visit [https://help.cloudsmith.io](https://help.cloudsmith.io)

## Requirements.

Python 2.7 and 3.4+

## Installation & Usage
### pip install

If the python package is hosted on Github, you can install directly from Github

```sh
pip install git+https://github.com/cloudsmith-io/cloudsmith-api.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/cloudsmith-io/cloudsmith-api.git`)

Then import the package:
```python
import cloudsmith_api 
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import cloudsmith_api
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
from __future__ import print_function
import time
import cloudsmith_api
from cloudsmith_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikey
cloudsmith_api.configuration.api_key['X-Api-Key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# cloudsmith_api.configuration.api_key_prefix['X-Api-Key'] = 'Bearer'
# create an instance of the API class
api_instance = cloudsmith_api.BadgesApi()
owner = 'owner_example' # str | 
repo = 'repo_example' # str | 
package_format = 'package_format_example' # str | 
package_name = 'package_name_example' # str | 
package_version = 'package_version_example' # str | 
package_identifiers = 'package_identifiers_example' # str | 
badge_token = 'badge_token_example' # str | Badge token to authenticate for private packages (optional)
cache_seconds = 'cache_seconds_example' # str | Override the shields.io badge cacheSeconds value. (optional)
color = 'color_example' # str | Override the shields.io badge color value. (optional)
label = 'label_example' # str | Override the shields.io badge label value. (optional)
label_color = 'label_color_example' # str | Override the shields.io badge labelColor value. (optional)
logo_color = 'logo_color_example' # str | Override the shields.io badge logoColor value. (optional)
logo_width = 'logo_width_example' # str | Override the shields.io badge logoWidth value. (optional)
render = true # bool | If true, badge will be rendered (optional)
shields = true # bool | If true, a shields response will be generated (optional)
show_latest = true # bool | If true, for latest version badges a '(latest)' suffix is added (optional)
style = 'style_example' # str | Override the shields.io badge style value. (optional)

try:
    # Get latest package version for a package or package group.
    api_instance.badges_version_list(owner, repo, package_format, package_name, package_version, package_identifiers, badge_token=badge_token, cache_seconds=cache_seconds, color=color, label=label, label_color=label_color, logo_color=logo_color, logo_width=logo_width, render=render, shields=shields, show_latest=show_latest, style=style)
except ApiException as e:
    print("Exception when calling BadgesApi->badges_version_list: %s\n" % e)

```

## Documentation for API Endpoints

All URIs are relative to *https://api.cloudsmith.io/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BadgesApi* | [**badges_version_list**](docs/BadgesApi.md#badges_version_list) | **GET** /badges/version/{owner}/{repo}/{package_format}/{package_name}/{package_version}/{package_identifiers}/ | Get latest package version for a package or package group.
*DistrosApi* | [**distros_list**](docs/DistrosApi.md#distros_list) | **GET** /distros/ | Get a list of all supported distributions.
*DistrosApi* | [**distros_read**](docs/DistrosApi.md#distros_read) | **GET** /distros/{slug}/ | View for viewing/listing distributions.
*EntitlementsApi* | [**entitlements_create**](docs/EntitlementsApi.md#entitlements_create) | **POST** /entitlements/{owner}/{repo}/ | Create a specific entitlement in a repository.
*EntitlementsApi* | [**entitlements_delete**](docs/EntitlementsApi.md#entitlements_delete) | **DELETE** /entitlements/{owner}/{repo}/{identifier}/ | Delete a specific entitlement in a repository.
*EntitlementsApi* | [**entitlements_disable**](docs/EntitlementsApi.md#entitlements_disable) | **POST** /entitlements/{owner}/{repo}/{identifier}/disable/ | Disable an entitlement token in a repository.
*EntitlementsApi* | [**entitlements_enable**](docs/EntitlementsApi.md#entitlements_enable) | **POST** /entitlements/{owner}/{repo}/{identifier}/enable/ | Enable an entitlement token in a repository.
*EntitlementsApi* | [**entitlements_list**](docs/EntitlementsApi.md#entitlements_list) | **GET** /entitlements/{owner}/{repo}/ | Get a list of all entitlements in a repository.
*EntitlementsApi* | [**entitlements_partial_update**](docs/EntitlementsApi.md#entitlements_partial_update) | **PATCH** /entitlements/{owner}/{repo}/{identifier}/ | Update a specific entitlement in a repository.
*EntitlementsApi* | [**entitlements_read**](docs/EntitlementsApi.md#entitlements_read) | **GET** /entitlements/{owner}/{repo}/{identifier}/ | Get a specific entitlement in a repository.
*EntitlementsApi* | [**entitlements_refresh**](docs/EntitlementsApi.md#entitlements_refresh) | **POST** /entitlements/{owner}/{repo}/{identifier}/refresh/ | Refresh an entitlement token in a repository.
*EntitlementsApi* | [**entitlements_reset**](docs/EntitlementsApi.md#entitlements_reset) | **POST** /entitlements/{owner}/{repo}/{identifier}/reset/ | Reset the statistics for an entitlement token in a repository.
*EntitlementsApi* | [**entitlements_sync**](docs/EntitlementsApi.md#entitlements_sync) | **POST** /entitlements/{owner}/{repo}/sync/ | Synchronise tokens from a source repository.
*FilesApi* | [**files_abort**](docs/FilesApi.md#files_abort) | **POST** /files/{owner}/{repo}/{identifier}/abort/ | Abort a multipart file upload.
*FilesApi* | [**files_complete**](docs/FilesApi.md#files_complete) | **POST** /files/{owner}/{repo}/{identifier}/complete/ | Complete a multipart file upload.
*FilesApi* | [**files_create**](docs/FilesApi.md#files_create) | **POST** /files/{owner}/{repo}/ | Request URL(s) to upload new package file upload(s) to.
*FilesApi* | [**files_info**](docs/FilesApi.md#files_info) | **GET** /files/{owner}/{repo}/{identifier}/info/ | Get upload information for a multipart file upload.
*FilesApi* | [**files_validate**](docs/FilesApi.md#files_validate) | **POST** /files/{owner}/{repo}/validate/ | Validate parameters used for create.
*FormatsApi* | [**formats_list**](docs/FormatsApi.md#formats_list) | **GET** /formats/ | Get a list of all supported package formats.
*FormatsApi* | [**formats_read**](docs/FormatsApi.md#formats_read) | **GET** /formats/{slug}/ | Get a specific supported package format.
*MetricsApi* | [**metrics_entitlements_list**](docs/MetricsApi.md#metrics_entitlements_list) | **GET** /metrics/entitlements/{owner}/ | View for listing entitlement token metrics, across an account.
*MetricsApi* | [**metrics_entitlements_list0**](docs/MetricsApi.md#metrics_entitlements_list0) | **GET** /metrics/entitlements/{owner}/{repo}/ | View for listing entitlement token metrics, for a repository.
*MetricsApi* | [**metrics_packages_list**](docs/MetricsApi.md#metrics_packages_list) | **GET** /metrics/packages/{owner}/{repo}/ | View for listing package usage metrics, for a repository.
*NamespacesApi* | [**namespaces_list**](docs/NamespacesApi.md#namespaces_list) | **GET** /namespaces/ | Get a list of all namespaces the user belongs to.
*NamespacesApi* | [**namespaces_read**](docs/NamespacesApi.md#namespaces_read) | **GET** /namespaces/{slug}/ | Views for working with namespaces.
*OrgsApi* | [**orgs_list**](docs/OrgsApi.md#orgs_list) | **GET** /orgs/ | Get a list of all the organizations you are associated with.
*OrgsApi* | [**orgs_read**](docs/OrgsApi.md#orgs_read) | **GET** /orgs/{slug}/ | Views for working with organizations.
*PackagesApi* | [**packages_copy**](docs/PackagesApi.md#packages_copy) | **POST** /packages/{owner}/{repo}/{identifier}/copy/ | Copy a package to another repository.
*PackagesApi* | [**packages_delete**](docs/PackagesApi.md#packages_delete) | **DELETE** /packages/{owner}/{repo}/{identifier}/ | Delete a specific package in a repository.
*PackagesApi* | [**packages_list**](docs/PackagesApi.md#packages_list) | **GET** /packages/{owner}/{repo}/ | Get a list of all packages associated with repository.
*PackagesApi* | [**packages_move**](docs/PackagesApi.md#packages_move) | **POST** /packages/{owner}/{repo}/{identifier}/move/ | Move a package to another repository.
*PackagesApi* | [**packages_read**](docs/PackagesApi.md#packages_read) | **GET** /packages/{owner}/{repo}/{identifier}/ | Get a specific package in a repository.
*PackagesApi* | [**packages_resync**](docs/PackagesApi.md#packages_resync) | **POST** /packages/{owner}/{repo}/{identifier}/resync/ | Schedule a package for resynchronisation.
*PackagesApi* | [**packages_scan**](docs/PackagesApi.md#packages_scan) | **POST** /packages/{owner}/{repo}/{identifier}/scan/ | Schedule a package for scanning.
*PackagesApi* | [**packages_status**](docs/PackagesApi.md#packages_status) | **GET** /packages/{owner}/{repo}/{identifier}/status/ | Get the synchronisation status for a package.
*PackagesApi* | [**packages_tag**](docs/PackagesApi.md#packages_tag) | **POST** /packages/{owner}/{repo}/{identifier}/tag/ | Add/Replace/Remove tags for a package.
*PackagesApi* | [**packages_upload_alpine**](docs/PackagesApi.md#packages_upload_alpine) | **POST** /packages/{owner}/{repo}/upload/alpine/ | Create a new Alpine package
*PackagesApi* | [**packages_upload_cargo**](docs/PackagesApi.md#packages_upload_cargo) | **POST** /packages/{owner}/{repo}/upload/cargo/ | Create a new Cargo package
*PackagesApi* | [**packages_upload_cocoapods**](docs/PackagesApi.md#packages_upload_cocoapods) | **POST** /packages/{owner}/{repo}/upload/cocoapods/ | Create a new CocoaPods package
*PackagesApi* | [**packages_upload_composer**](docs/PackagesApi.md#packages_upload_composer) | **POST** /packages/{owner}/{repo}/upload/composer/ | Create a new Composer package
*PackagesApi* | [**packages_upload_conan**](docs/PackagesApi.md#packages_upload_conan) | **POST** /packages/{owner}/{repo}/upload/conan/ | Create a new Conan package
*PackagesApi* | [**packages_upload_cran**](docs/PackagesApi.md#packages_upload_cran) | **POST** /packages/{owner}/{repo}/upload/cran/ | Create a new CRAN package
*PackagesApi* | [**packages_upload_dart**](docs/PackagesApi.md#packages_upload_dart) | **POST** /packages/{owner}/{repo}/upload/dart/ | Create a new Dart package
*PackagesApi* | [**packages_upload_deb**](docs/PackagesApi.md#packages_upload_deb) | **POST** /packages/{owner}/{repo}/upload/deb/ | Create a new Debian package
*PackagesApi* | [**packages_upload_docker**](docs/PackagesApi.md#packages_upload_docker) | **POST** /packages/{owner}/{repo}/upload/docker/ | Create a new Docker package
*PackagesApi* | [**packages_upload_go**](docs/PackagesApi.md#packages_upload_go) | **POST** /packages/{owner}/{repo}/upload/go/ | Create a new Go package
*PackagesApi* | [**packages_upload_helm**](docs/PackagesApi.md#packages_upload_helm) | **POST** /packages/{owner}/{repo}/upload/helm/ | Create a new Helm package
*PackagesApi* | [**packages_upload_luarocks**](docs/PackagesApi.md#packages_upload_luarocks) | **POST** /packages/{owner}/{repo}/upload/luarocks/ | Create a new LuaRocks package
*PackagesApi* | [**packages_upload_maven**](docs/PackagesApi.md#packages_upload_maven) | **POST** /packages/{owner}/{repo}/upload/maven/ | Create a new Maven package
*PackagesApi* | [**packages_upload_npm**](docs/PackagesApi.md#packages_upload_npm) | **POST** /packages/{owner}/{repo}/upload/npm/ | Create a new npm package
*PackagesApi* | [**packages_upload_nuget**](docs/PackagesApi.md#packages_upload_nuget) | **POST** /packages/{owner}/{repo}/upload/nuget/ | Create a new NuGet package
*PackagesApi* | [**packages_upload_python**](docs/PackagesApi.md#packages_upload_python) | **POST** /packages/{owner}/{repo}/upload/python/ | Create a new Python package
*PackagesApi* | [**packages_upload_raw**](docs/PackagesApi.md#packages_upload_raw) | **POST** /packages/{owner}/{repo}/upload/raw/ | Create a new Raw package
*PackagesApi* | [**packages_upload_rpm**](docs/PackagesApi.md#packages_upload_rpm) | **POST** /packages/{owner}/{repo}/upload/rpm/ | Create a new RedHat package
*PackagesApi* | [**packages_upload_ruby**](docs/PackagesApi.md#packages_upload_ruby) | **POST** /packages/{owner}/{repo}/upload/ruby/ | Create a new Ruby package
*PackagesApi* | [**packages_upload_terraform**](docs/PackagesApi.md#packages_upload_terraform) | **POST** /packages/{owner}/{repo}/upload/terraform/ | Create a new Terraform package
*PackagesApi* | [**packages_upload_vagrant**](docs/PackagesApi.md#packages_upload_vagrant) | **POST** /packages/{owner}/{repo}/upload/vagrant/ | Create a new Vagrant package
*PackagesApi* | [**packages_validate_upload_alpine**](docs/PackagesApi.md#packages_validate_upload_alpine) | **POST** /packages/{owner}/{repo}/validate-upload/alpine/ | Validate parameters for create Alpine package
*PackagesApi* | [**packages_validate_upload_cargo**](docs/PackagesApi.md#packages_validate_upload_cargo) | **POST** /packages/{owner}/{repo}/validate-upload/cargo/ | Validate parameters for create Cargo package
*PackagesApi* | [**packages_validate_upload_cocoapods**](docs/PackagesApi.md#packages_validate_upload_cocoapods) | **POST** /packages/{owner}/{repo}/validate-upload/cocoapods/ | Validate parameters for create CocoaPods package
*PackagesApi* | [**packages_validate_upload_composer**](docs/PackagesApi.md#packages_validate_upload_composer) | **POST** /packages/{owner}/{repo}/validate-upload/composer/ | Validate parameters for create Composer package
*PackagesApi* | [**packages_validate_upload_conan**](docs/PackagesApi.md#packages_validate_upload_conan) | **POST** /packages/{owner}/{repo}/validate-upload/conan/ | Validate parameters for create Conan package
*PackagesApi* | [**packages_validate_upload_cran**](docs/PackagesApi.md#packages_validate_upload_cran) | **POST** /packages/{owner}/{repo}/validate-upload/cran/ | Validate parameters for create CRAN package
*PackagesApi* | [**packages_validate_upload_dart**](docs/PackagesApi.md#packages_validate_upload_dart) | **POST** /packages/{owner}/{repo}/validate-upload/dart/ | Validate parameters for create Dart package
*PackagesApi* | [**packages_validate_upload_deb**](docs/PackagesApi.md#packages_validate_upload_deb) | **POST** /packages/{owner}/{repo}/validate-upload/deb/ | Validate parameters for create Debian package
*PackagesApi* | [**packages_validate_upload_docker**](docs/PackagesApi.md#packages_validate_upload_docker) | **POST** /packages/{owner}/{repo}/validate-upload/docker/ | Validate parameters for create Docker package
*PackagesApi* | [**packages_validate_upload_go**](docs/PackagesApi.md#packages_validate_upload_go) | **POST** /packages/{owner}/{repo}/validate-upload/go/ | Validate parameters for create Go package
*PackagesApi* | [**packages_validate_upload_helm**](docs/PackagesApi.md#packages_validate_upload_helm) | **POST** /packages/{owner}/{repo}/validate-upload/helm/ | Validate parameters for create Helm package
*PackagesApi* | [**packages_validate_upload_luarocks**](docs/PackagesApi.md#packages_validate_upload_luarocks) | **POST** /packages/{owner}/{repo}/validate-upload/luarocks/ | Validate parameters for create LuaRocks package
*PackagesApi* | [**packages_validate_upload_maven**](docs/PackagesApi.md#packages_validate_upload_maven) | **POST** /packages/{owner}/{repo}/validate-upload/maven/ | Validate parameters for create Maven package
*PackagesApi* | [**packages_validate_upload_npm**](docs/PackagesApi.md#packages_validate_upload_npm) | **POST** /packages/{owner}/{repo}/validate-upload/npm/ | Validate parameters for create npm package
*PackagesApi* | [**packages_validate_upload_nuget**](docs/PackagesApi.md#packages_validate_upload_nuget) | **POST** /packages/{owner}/{repo}/validate-upload/nuget/ | Validate parameters for create NuGet package
*PackagesApi* | [**packages_validate_upload_python**](docs/PackagesApi.md#packages_validate_upload_python) | **POST** /packages/{owner}/{repo}/validate-upload/python/ | Validate parameters for create Python package
*PackagesApi* | [**packages_validate_upload_raw**](docs/PackagesApi.md#packages_validate_upload_raw) | **POST** /packages/{owner}/{repo}/validate-upload/raw/ | Validate parameters for create Raw package
*PackagesApi* | [**packages_validate_upload_rpm**](docs/PackagesApi.md#packages_validate_upload_rpm) | **POST** /packages/{owner}/{repo}/validate-upload/rpm/ | Validate parameters for create RedHat package
*PackagesApi* | [**packages_validate_upload_ruby**](docs/PackagesApi.md#packages_validate_upload_ruby) | **POST** /packages/{owner}/{repo}/validate-upload/ruby/ | Validate parameters for create Ruby package
*PackagesApi* | [**packages_validate_upload_terraform**](docs/PackagesApi.md#packages_validate_upload_terraform) | **POST** /packages/{owner}/{repo}/validate-upload/terraform/ | Validate parameters for create Terraform package
*PackagesApi* | [**packages_validate_upload_vagrant**](docs/PackagesApi.md#packages_validate_upload_vagrant) | **POST** /packages/{owner}/{repo}/validate-upload/vagrant/ | Validate parameters for create Vagrant package
*QuotaApi* | [**quota_history_read**](docs/QuotaApi.md#quota_history_read) | **GET** /quota/history/{owner}/ | Quota history for a given namespace.
*QuotaApi* | [**quota_oss_history_read**](docs/QuotaApi.md#quota_oss_history_read) | **GET** /quota/oss/history/{owner}/ | Open-source Quota history for a given namespace.
*QuotaApi* | [**quota_oss_read**](docs/QuotaApi.md#quota_oss_read) | **GET** /quota/oss/{owner}/ | Open-source Quota usage for a given namespace.
*QuotaApi* | [**quota_read**](docs/QuotaApi.md#quota_read) | **GET** /quota/{owner}/ | Quota usage for a given namespace.
*RatesApi* | [**rates_limits_list**](docs/RatesApi.md#rates_limits_list) | **GET** /rates/limits/ | Endpoint to check rate limits for current user.
*ReposApi* | [**repos_all_list**](docs/ReposApi.md#repos_all_list) | **GET** /repos/ | Get a list of all repositories associated with current user.
*ReposApi* | [**repos_create**](docs/ReposApi.md#repos_create) | **POST** /repos/{owner}/ | Create a new repository in a given namespace.
*ReposApi* | [**repos_delete**](docs/ReposApi.md#repos_delete) | **DELETE** /repos/{owner}/{identifier}/ | Delete a repository in a given namespace.
*ReposApi* | [**repos_list**](docs/ReposApi.md#repos_list) | **GET** /repos/{owner}/ | Get a list of all repositories within a namespace.
*ReposApi* | [**repos_partial_update**](docs/ReposApi.md#repos_partial_update) | **PATCH** /repos/{owner}/{identifier}/ | Update details about a repository in a given namespace.
*ReposApi* | [**repos_read**](docs/ReposApi.md#repos_read) | **GET** /repos/{owner}/{identifier}/ | Get a specific repository.
*StatusApi* | [**status_check_basic**](docs/StatusApi.md#status_check_basic) | **GET** /status/check/basic/ | Endpoint to check basic API connectivity.
*StorageregionsApi* | [**storage_regions_list**](docs/StorageregionsApi.md#storage_regions_list) | **GET** /storage-regions/ | Get a list of all available storage regions.
*StorageregionsApi* | [**storage_regions_read**](docs/StorageregionsApi.md#storage_regions_read) | **GET** /storage-regions/{slug}/ | Get a specific storage region.
*UserApi* | [**user_self**](docs/UserApi.md#user_self) | **GET** /user/self/ | Provide a brief for the current user (if any).
*UserApi* | [**user_token_create**](docs/UserApi.md#user_token_create) | **POST** /user/token/ | Retrieve the API key/token for the authenticated user.
*UsersApi* | [**users_profile_read**](docs/UsersApi.md#users_profile_read) | **GET** /users/profile/{slug}/ | Provide a brief for the specified user (if any).
*VulnerabilitiesApi* | [**vulnerabilities_list**](docs/VulnerabilitiesApi.md#vulnerabilities_list) | **GET** /vulnerabilities/{owner}/ | Checks feature is within plan before listing results.
*VulnerabilitiesApi* | [**vulnerabilities_list0**](docs/VulnerabilitiesApi.md#vulnerabilities_list0) | **GET** /vulnerabilities/{owner}/{repo}/ | Checks feature is within plan before listing results.
*VulnerabilitiesApi* | [**vulnerabilities_list1**](docs/VulnerabilitiesApi.md#vulnerabilities_list1) | **GET** /vulnerabilities/{owner}/{repo}/{package}/ | Check package identifier is valid before querying results.
*VulnerabilitiesApi* | [**vulnerabilities_read**](docs/VulnerabilitiesApi.md#vulnerabilities_read) | **GET** /vulnerabilities/{owner}/{repo}/{package}/{scan_id}/ | Checks feature is within plan before retrieving results.
*WebhooksApi* | [**webhooks_create**](docs/WebhooksApi.md#webhooks_create) | **POST** /webhooks/{owner}/{repo}/ | Create a specific webhook in a repository.
*WebhooksApi* | [**webhooks_delete**](docs/WebhooksApi.md#webhooks_delete) | **DELETE** /webhooks/{owner}/{repo}/{identifier}/ | Delete a specific webhook in a repository.
*WebhooksApi* | [**webhooks_list**](docs/WebhooksApi.md#webhooks_list) | **GET** /webhooks/{owner}/{repo}/ | Get a list of all webhooks in a repository.
*WebhooksApi* | [**webhooks_partial_update**](docs/WebhooksApi.md#webhooks_partial_update) | **PATCH** /webhooks/{owner}/{repo}/{identifier}/ | Update a specific webhook in a repository.
*WebhooksApi* | [**webhooks_read**](docs/WebhooksApi.md#webhooks_read) | **GET** /webhooks/{owner}/{repo}/{identifier}/ | Views for working with repository webhooks.


## Documentation For Models

 - [AlpinePackageUpload](docs/AlpinePackageUpload.md)
 - [ConanPackageUpload](docs/ConanPackageUpload.md)
 - [Distribution](docs/Distribution.md)
 - [DistrosVersions](docs/DistrosVersions.md)
 - [EntitlementUsageMetrics](docs/EntitlementUsageMetrics.md)
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
 - [Namespace](docs/Namespace.md)
 - [Organization](docs/Organization.md)
 - [Package](docs/Package.md)
 - [PackageCopy](docs/PackageCopy.md)
 - [PackageFilePartsUpload](docs/PackageFilePartsUpload.md)
 - [PackageFileUpload](docs/PackageFileUpload.md)
 - [PackageMove](docs/PackageMove.md)
 - [PackageStatus](docs/PackageStatus.md)
 - [PackageUsageMetrics](docs/PackageUsageMetrics.md)
 - [PackagesCopy](docs/PackagesCopy.md)
 - [PackagesMove](docs/PackagesMove.md)
 - [PackagesTag](docs/PackagesTag.md)
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
 - [PackagesUploadTerraform](docs/PackagesUploadTerraform.md)
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
 - [PackagesValidateuploadTerraform](docs/PackagesValidateuploadTerraform.md)
 - [PackagesValidateuploadVagrant](docs/PackagesValidateuploadVagrant.md)
 - [PackagesownerrepoArchitectures](docs/PackagesownerrepoArchitectures.md)
 - [PackagesownerrepoFiles](docs/PackagesownerrepoFiles.md)
 - [Quota](docs/Quota.md)
 - [QuotaHistory](docs/QuotaHistory.md)
 - [QuotaHistoryHistory](docs/QuotaHistoryHistory.md)
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
 - [StorageRegion](docs/StorageRegion.md)
 - [UserAuthToken](docs/UserAuthToken.md)
 - [UserBrief](docs/UserBrief.md)
 - [UserProfile](docs/UserProfile.md)
 - [UserTokenCreate](docs/UserTokenCreate.md)
 - [VagrantPackageUpload](docs/VagrantPackageUpload.md)
 - [VulnerabilityScanResults](docs/VulnerabilityScanResults.md)
 - [VulnerabilityScanResultsList](docs/VulnerabilityScanResultsList.md)
 - [WebhooksCreate](docs/WebhooksCreate.md)
 - [WebhooksPartialUpdate](docs/WebhooksPartialUpdate.md)
 - [WebhooksownerrepoTemplates](docs/WebhooksownerrepoTemplates.md)


## Documentation For Authorization


## apikey

- **Type**: API key
- **API key parameter name**: X-Api-Key
- **Location**: HTTP header

## basic

- **Type**: HTTP basic authentication


## Author

support@cloudsmith.io

