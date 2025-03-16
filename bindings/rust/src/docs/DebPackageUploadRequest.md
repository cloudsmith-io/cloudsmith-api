# DebPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changes_file** | **String** | The changes archive containing the changes made to the source and debian packaging files | [optional] [default to null]
**component** | **String** | The component (channel) for the package (e.g. &#39;main&#39;, &#39;unstable&#39;, etc.) | [optional] [default to null]
**distribution** | **String** | The distribution to store the package for. | [default to null]
**package_file** | **String** | The primary file for the package. | [default to null]
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] [default to null]
**sources_file** | **String** | The sources archive containing the source code for the binary | [optional] [default to null]
**tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


