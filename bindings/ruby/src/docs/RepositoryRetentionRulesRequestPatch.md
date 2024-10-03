# CloudsmithApi::RepositoryRetentionRulesRequestPatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**retention_count_limit** | **Integer** | The maximum X number of packages to retain. | [optional] 
**retention_days_limit** | **Integer** | The X number of days of packages to retain. | [optional] 
**retention_enabled** | **BOOLEAN** | If checked, the retention lifecycle rules will be activated for the repository. Any packages that don&#39;t match will be deleted automatically, and the rest are retained. | [optional] 
**retention_group_by_format** | **BOOLEAN** | If checked, retention will apply to packages by package formats rather than across all package formats.For example, when retaining by a limit of 1 and you upload PythonPkg 1.0 and RubyPkg 1.0, no packages are deleted because they are different formats. | [optional] 
**retention_group_by_name** | **BOOLEAN** | If checked, retention will apply to groups of packages by name rather than all packages.&lt;br&gt;For example, when retaining by a limit of 1 and you upload PkgA 1.0, PkgB 1.0 and PkgB 1.1; only PkgB 1.0 is deleted because there are two (2) PkgBs and one (1) PkgA. | [optional] 
**retention_group_by_package_type** | **BOOLEAN** | If checked, retention will apply to packages by package type (e.g. by binary, by source, etc.), rather than across all package types for one or more formats. &lt;br&gt;For example, when retaining by a limit of 1 and you upload DebPackage 1.0 and DebSourcePackage 1.0, no packages are deleted because they are different package types, binary and source respectively. | [optional] 
**retention_size_limit** | **Integer** | The maximum X total size (in bytes) of packages to retain. | [optional] 


