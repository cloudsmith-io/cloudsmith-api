# VagrantPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_malware_detected** | **bool** | Whether the package has been detected as containing malware. Requires Ultra plan. | [optional] 
**name** | **str** | The name of this package. | 
**package_file** | **str** | The primary file for the package. | 
**provider** | **str** | The virtual machine provider for the box. | 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 
**version** | **str** | The raw version for this package. | 
**vulnerability_counts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


