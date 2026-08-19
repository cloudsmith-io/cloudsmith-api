# CloudsmithApi::NugetPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_malware_detected** | **BOOLEAN** | Whether the package has been detected as containing malware. Requires Ultra plan. | [optional] 
**package_file** | **String** | The primary file for the package. | 
**republish** | **BOOLEAN** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**symbols_file** | **String** | Uploads a symbols file as a separate package | [optional] 
**tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] 
**vulnerability_counts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  | [optional] 


