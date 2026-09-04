# CloudsmithApi::VagrantPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of this package. | 
**package_file** | **String** | The primary file for the package. | 
**provider** | **String** | The virtual machine provider for the box. | 
**republish** | **BOOLEAN** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] 
**version** | **String** | The raw version for this package. | 


