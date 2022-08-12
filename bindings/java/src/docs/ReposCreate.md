
# ReposCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextualAuthRealm** | **Boolean** | If checked, missing credentials for this repository where basic authentication is required shall present an enriched value in the &#39;WWW-Authenticate&#39; header containing the namespace and repository. This can be useful for tooling such as SBT where the authentication realm is used to distinguish and disambiguate credentials. |  [optional]
**copyOwn** | **Boolean** | If checked, users can copy any of their own packages that they have uploaded, assuming that they still have write privilege for the repository. This takes precedence over privileges configured in the &#39;Access Controls&#39; section of the repository, and any inherited from the org. |  [optional]
**copyPackages** | [**CopyPackagesEnum**](#CopyPackagesEnum) | This defines the minimum level of privilege required for a user to copy packages. Unless the package was uploaded by that user, in which the permission may be overridden by the user-specific copy setting. |  [optional]
**defaultPrivilege** | [**DefaultPrivilegeEnum**](#DefaultPrivilegeEnum) | This defines the default level of privilege that all of your organization members have for this repository. This does not include collaborators, but applies to any member of the org regardless of their own membership role (i.e. it applies to owners, managers and members). Be careful if setting this to admin, because any member will be able to change settings. |  [optional]
**deleteOwn** | **Boolean** | If checked, users can delete any of their own packages that they have uploaded, assuming that they still have write privilege for the repository. This takes precedence over privileges configured in the &#39;Access Controls&#39; section of the repository, and any inherited from the org. |  [optional]
**deletePackages** | [**DeletePackagesEnum**](#DeletePackagesEnum) | This defines the minimum level of privilege required for a user to delete packages. Unless the package was uploaded by that user, in which the permission may be overridden by the user-specific delete setting. |  [optional]
**description** | **String** | A description of the repository&#39;s purpose/contents. |  [optional]
**dockerRefreshTokensEnabled** | **Boolean** | If checked, refresh tokens will be issued in addition to access tokens for Docker authentication. This allows unlimited extension of the lifetime of access tokens. |  [optional]
**indexFiles** | **Boolean** | If checked, files contained in packages will be indexed, which increase the synchronisation time required for packages. Note that it is recommended you keep this enabled unless the synchronisation time is significantly impacted. |  [optional]
**moveOwn** | **Boolean** | If checked, users can move any of their own packages that they have uploaded, assuming that they still have write privilege for the repository. This takes precedence over privileges configured in the &#39;Access Controls&#39; section of the repository, and any inherited from the org. |  [optional]
**movePackages** | [**MovePackagesEnum**](#MovePackagesEnum) | This defines the minimum level of privilege required for a user to move packages. Unless the package was uploaded by that user, in which the permission may be overridden by the user-specific move setting. |  [optional]
**name** | **String** | A descriptive name for the repository. | 
**proxyNpmjs** | **Boolean** | If checked, Npm packages that are not in the repository when requested by clients will automatically be proxied from the public npmjs.org registry. If there is at least one version for a package, others will not be proxied. |  [optional]
**proxyPypi** | **Boolean** | If checked, Python packages that are not in the repository when requested by clients will automatically be proxied from the public pypi.python.org registry. If there is at least one version for a package, others will not be proxied. |  [optional]
**rawPackageIndexEnabled** | **Boolean** | If checked, HTML and JSON indexes will be generated that list all available raw packages in the repository. |  [optional]
**rawPackageIndexSignaturesEnabled** | **Boolean** | If checked, the HTML and JSON indexes will display raw package GPG signatures alongside the index packages. |  [optional]
**replacePackages** | [**ReplacePackagesEnum**](#ReplacePackagesEnum) | This defines the minimum level of privilege required for a user to republish packages. Unless the package was uploaded by that user, in which the permission may be overridden by the user-specific republish setting. Please note that the user still requires the privilege to delete packages that will be replaced by the new package; otherwise the republish will fail. |  [optional]
**replacePackagesByDefault** | **Boolean** | If checked, uploaded packages will overwrite/replace any others with the same attributes (e.g. same version) by default. This only applies if the user has the required privilege for the republishing AND has the required privilege to delete existing packages that they don&#39;t own. |  [optional]
**repositoryTypeStr** | **String** | The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Public repositories are free to use on all plans and visible to all Cloudsmith users. |  [optional]
**resyncOwn** | **Boolean** | If checked, users can resync any of their own packages that they have uploaded, assuming that they still have write privilege for the repository. This takes precedence over privileges configured in the &#39;Access Controls&#39; section of the repository, and any inherited from the org. |  [optional]
**resyncPackages** | [**ResyncPackagesEnum**](#ResyncPackagesEnum) | This defines the minimum level of privilege required for a user to resync packages. Unless the package was uploaded by that user, in which the permission may be overridden by the user-specific resync setting. |  [optional]
**scanOwn** | **Boolean** | If checked, users can scan any of their own packages that they have uploaded, assuming that they still have write privilege for the repository. This takes precedence over privileges configured in the &#39;Access Controls&#39; section of the repository, and any inherited from the org. |  [optional]
**scanPackages** | [**ScanPackagesEnum**](#ScanPackagesEnum) | This defines the minimum level of privilege required for a user to scan packages. Unless the package was uploaded by that user, in which the permission may be overridden by the user-specific scan setting. |  [optional]
**showSetupAll** | **Boolean** | If checked, the Set Me Up help for all formats will always be shown, even if you don&#39;t have packages of that type uploaded. Otherwise, help will only be shown for packages that are in the repository. For example, if you have uploaded only NuGet packages, then the Set Me Up help for NuGet packages will be shown only. |  [optional]
**slug** | **String** | The slug identifies the repository in URIs. |  [optional]
**storageRegion** | **String** | The Cloudsmith region in which package files are stored. |  [optional]
**strictNpmValidation** | **Boolean** | If checked, npm packages will be validated strictly to ensure the package matches specifcation. You can turn this off if you have packages that are old or otherwise mildly off-spec, but we can&#39;t guarantee the packages will work with npm-cli or other tooling correctly. Turn off at your own risk! |  [optional]
**useDebianLabels** | **Boolean** | If checked, a &#39;Label&#39; field will be present in Debian-based repositories. It will contain a string that identifies the entitlement token used to authenticate the repository, in the form of &#39;source&#x3D;t-&lt;identifier&gt;&#39;; or &#39;source&#x3D;none&#39; if no token was used. You can use this to help with pinning. |  [optional]
**useDefaultCargoUpstream** | **Boolean** | If checked, dependencies of uploaded Cargo crates which do not set an explicit value for \&quot;registry\&quot; will be assumed to be available from crates.io. If unchecked, dependencies with unspecified \&quot;registry\&quot; values will be assumed to be available in the registry being uploaded to. Uncheck this if you want to ensure that dependencies are only ever installed from Cloudsmith unless explicitly specified as belong to another registry. |  [optional]
**useNoarchPackages** | **Boolean** | If checked, noarch packages (if supported) are enabled in installations/configurations. A noarch package is one that is not tied to specific system architecture (like i686). |  [optional]
**useSourcePackages** | **Boolean** | If checked, source packages (if supported) are enabled in installations/configurations. A source package is one that contains source code rather than built binaries. |  [optional]
**useVulnerabilityScanning** | **Boolean** | If checked, vulnerability scanning will be enabled for all supported packages within this repository. |  [optional]
**userEntitlementsEnabled** | **Boolean** | If checked, users can use and manage their own user-specific entitlement token for the repository (if private). Otherwise, user-specific entitlements are disabled for all users. |  [optional]
**viewStatistics** | [**ViewStatisticsEnum**](#ViewStatisticsEnum) | This defines the minimum level of privilege required for a user to view repository statistics, to include entitlement-based usage, if applciable. If a user does not have the permission, they won&#39;t be able to view any statistics, either via the UI, API or CLI. |  [optional]


<a name="CopyPackagesEnum"></a>
## Enum: CopyPackagesEnum
Name | Value
---- | -----
ADMIN | &quot;Admin&quot;
WRITE | &quot;Write&quot;
READ | &quot;Read&quot;


<a name="DefaultPrivilegeEnum"></a>
## Enum: DefaultPrivilegeEnum
Name | Value
---- | -----
ADMIN | &quot;Admin&quot;
WRITE | &quot;Write&quot;
READ | &quot;Read&quot;
NONE | &quot;None&quot;


<a name="DeletePackagesEnum"></a>
## Enum: DeletePackagesEnum
Name | Value
---- | -----
ADMIN | &quot;Admin&quot;
WRITE | &quot;Write&quot;


<a name="MovePackagesEnum"></a>
## Enum: MovePackagesEnum
Name | Value
---- | -----
ADMIN | &quot;Admin&quot;
WRITE | &quot;Write&quot;
READ | &quot;Read&quot;


<a name="ReplacePackagesEnum"></a>
## Enum: ReplacePackagesEnum
Name | Value
---- | -----
ADMIN | &quot;Admin&quot;
WRITE | &quot;Write&quot;


<a name="ResyncPackagesEnum"></a>
## Enum: ResyncPackagesEnum
Name | Value
---- | -----
ADMIN | &quot;Admin&quot;
WRITE | &quot;Write&quot;


<a name="ScanPackagesEnum"></a>
## Enum: ScanPackagesEnum
Name | Value
---- | -----
ADMIN | &quot;Admin&quot;
WRITE | &quot;Write&quot;
READ | &quot;Read&quot;


<a name="ViewStatisticsEnum"></a>
## Enum: ViewStatisticsEnum
Name | Value
---- | -----
ADMIN | &quot;Admin&quot;
WRITE | &quot;Write&quot;
READ | &quot;Read&quot;



