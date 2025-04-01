# VagrantPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of this package. | [default to null]
**package_file** | **String** | The primary file for the package. | [default to null]
**provider** | **String** | The virtual machine provider for the box. | [default to null]
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] [default to null]
**tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] [default to null]
**version** | **String** | The raw version for this package. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


