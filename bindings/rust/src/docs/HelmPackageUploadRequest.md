# HelmPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**package_file** | **String** | The primary file for the package. | [default to null]
**provenance_file** | **String** | The provenance file containing the signature for the chart. If one is not provided, it will be generated automatically. | [optional] [default to null]
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] [default to null]
**tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


