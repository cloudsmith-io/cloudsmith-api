# CloudsmithApi::PackageCopyRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination** | **String** | The name of the destination repository without the namespace. | 
**is_malware_detected** | **BOOLEAN** | Whether the package has been detected as containing malware. Requires Ultra plan. | [optional] 
**republish** | **BOOLEAN** | If true, the package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**vulnerability_counts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  | [optional] 


