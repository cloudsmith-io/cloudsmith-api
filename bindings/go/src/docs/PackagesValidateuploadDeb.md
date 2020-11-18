# PackagesValidateuploadDeb

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChangesFile** | **string** | The changes archive containing the changes made to the source and debian packaging files | [optional] [default to null]
**Distribution** | **string** | The distribution to store the package for. | [default to null]
**PackageFile** | **string** | The primary file for the package. | [default to null]
**Republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] [default to null]
**SecurityScanStatus** | **string** | None | [optional] [default to null]
**SourcesFile** | **string** | The sources archive containing the source code for the binary | [optional] [default to null]
**Tags** | **string** | A comma-separated values list of tags to add to the package. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


