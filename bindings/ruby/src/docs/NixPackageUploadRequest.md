# CloudsmithApi::NixPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_malware_detected** | **BOOLEAN** | Whether the package has been detected as containing malware. Requires Ultra plan. | [optional] 
**narinfo_file** | **String** | The narinfo sidecar metadata file (&lt;storeHash&gt;.narinfo). Optional — the package can be completed later by publishing the matching narinfo via the native HTTP PUT path. | [optional] 
**package_file** | **String** | The primary file for the package. | 
**republish** | **BOOLEAN** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] 
**version** | **String** | The raw version for this package. | [optional] 
**vulnerability_counts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  | [optional] 


