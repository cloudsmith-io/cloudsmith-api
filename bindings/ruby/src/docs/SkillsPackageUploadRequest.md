# CloudsmithApi::SkillsPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changelog** | **String** |  | [optional] 
**name** | **String** |  | 
**package_file** | **String** | The primary file for the package. | 
**release_notes** | **String** | The release notes for this package (if any). | [optional] 
**republish** | **BOOLEAN** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] 
**version** | **String** |  | 


