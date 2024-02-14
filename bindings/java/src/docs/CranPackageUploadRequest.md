
# CranPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**architecture** | [**ArchitectureEnum**](#ArchitectureEnum) | Binary package uploads for macOS should specify the architecture they were built for. |  [optional]
**packageFile** | **String** | The primary file for the package. | 
**rVersion** | **String** | Binary package uploads should specify the version of R they were built for. |  [optional]
**republish** | **Boolean** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. |  [optional]
**tags** | **String** | A comma-separated values list of tags to add to the package. |  [optional]


<a name="ArchitectureEnum"></a>
## Enum: ArchitectureEnum
Name | Value
---- | -----
ARM64 | &quot;arm64&quot;
X86_64 | &quot;x86_64&quot;



