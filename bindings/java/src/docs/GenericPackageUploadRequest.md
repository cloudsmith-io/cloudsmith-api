
# GenericPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filepath** | **String** | The full filepath of the package including filename. | 
**isMalwareDetected** | **Boolean** | Whether the package has been detected as containing malware. Requires Ultra plan. |  [optional]
**name** | **String** | The name of this package. |  [optional]
**packageFile** | **String** | The primary file for the package. | 
**republish** | **Boolean** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. |  [optional]
**tags** | **String** | A comma-separated values list of tags to add to the package. |  [optional]
**version** | **String** | The raw version for this package. |  [optional]
**vulnerabilityCounts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  |  [optional]



