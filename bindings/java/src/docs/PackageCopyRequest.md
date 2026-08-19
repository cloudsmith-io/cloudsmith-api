
# PackageCopyRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination** | **String** | The name of the destination repository without the namespace. | 
**isMalwareDetected** | **Boolean** | Whether the package has been detected as containing malware. Requires Ultra plan. |  [optional]
**republish** | **Boolean** | If true, the package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. |  [optional]
**vulnerabilityCounts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  |  [optional]



