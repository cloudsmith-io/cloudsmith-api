# CloudsmithApi::VagrantPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_malware_detected** | **BOOLEAN** | Whether the package has been detected as containing malware. Requires Ultra plan. | [optional] 
**name** | **String** | The name of this package. | 
**package_file** | **String** | The primary file for the package. | 
**provider** | **String** | The virtual machine provider for the box. | 
**republish** | **BOOLEAN** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] 
**version** | **String** | The raw version for this package. | 
**vulnerability_counts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  | [optional] 


