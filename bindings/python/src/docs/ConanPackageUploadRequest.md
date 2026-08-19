# ConanPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conan_channel** | **str** | Conan channel. | [optional] 
**conan_prefix** | **str** | Conan prefix (User). | [optional] 
**info_file** | **str** | The info file is an python file containing the package metadata. | 
**is_malware_detected** | **bool** | Whether the package has been detected as containing malware. Requires Ultra plan. | [optional] 
**manifest_file** | **str** | The info file is an python file containing the package metadata. | 
**metadata_file** | **str** | The conan file is an python file containing the package metadata. | 
**name** | **str** | The name of this package. | [optional] 
**package_file** | **str** | The primary file for the package. | 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 
**version** | **str** | The raw version for this package. | [optional] 
**vulnerability_counts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


