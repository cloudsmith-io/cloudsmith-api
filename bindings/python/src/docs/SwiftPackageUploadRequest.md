# SwiftPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author_name** | **str** | The name of the author of the package. | [optional] 
**author_org** | **str** | The organization of the author. | [optional] 
**is_malware_detected** | **bool** | Whether the package has been detected as containing malware. Requires Ultra plan. | [optional] 
**license_url** | **str** | The license URL of this package. | [optional] 
**name** | **str** | The name of this package. | 
**package_file** | **str** | The primary file for the package. | 
**readme_url** | **str** | The URL of the readme for the package. | [optional] 
**repository_url** | **str** | The URL of the SCM repository for the package. | [optional] 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**scope** | **str** | A scope provides a namespace for related packages within the package registry. | 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 
**version** | **str** | The raw version for this package. | 
**vulnerability_counts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


