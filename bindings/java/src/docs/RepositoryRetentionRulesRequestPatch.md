
# RepositoryRetentionRulesRequestPatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**retentionCountLimit** | **java.math.BigInteger** | The maximum X number of packages to retain. |  [optional]
**retentionDaysLimit** | **java.math.BigInteger** | The X number of days of packages to retain. |  [optional]
**retentionEnabled** | **Boolean** | If checked, the retention lifecycle rules will be activated for the repository. Any packages that don&#39;t match will be deleted automatically, and the rest are retained. |  [optional]
**retentionGroupByFormat** | **Boolean** | If checked, retention will apply to packages by package formats rather than across all package formats.For example, when retaining by a limit of 1 and you upload PythonPkg 1.0 and RubyPkg 1.0, no packages are deleted because they are different formats. |  [optional]
**retentionGroupByName** | **Boolean** | If checked, retention will apply to groups of packages by name rather than all packages.&lt;br&gt;For example, when retaining by a limit of 1 and you upload PkgA 1.0, PkgB 1.0 and PkgB 1.1; only PkgB 1.0 is deleted because there are two (2) PkgBs and one (1) PkgA. |  [optional]
**retentionGroupByPackageType** | **Boolean** | If checked, retention will apply to packages by package type (e.g. by binary, by source, etc.), rather than across all package types for one or more formats. &lt;br&gt;For example, when retaining by a limit of 1 and you upload DebPackage 1.0 and DebSourcePackage 1.0, no packages are deleted because they are different package types, binary and source respectively. |  [optional]
**retentionPackageQueryString** | **String** | A package search expression which, if provided, filters the packages to be deleted.&lt;br&gt;For example, a search expression of &#x60;name:foo&#x60; will result in only packages called &#39;foo&#39; being deleted, or a search expression of &#x60;tag:~latest&#x60; will prevent any packages tagged &#39;latest&#39; from being deleted.&lt;br&gt;Refer to the Cloudsmith documentation for package query syntax. |  [optional]
**retentionSizeLimit** | **java.math.BigInteger** | The maximum X total size (in bytes) of packages to retain. |  [optional]



