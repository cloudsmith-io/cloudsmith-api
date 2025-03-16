# RawPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | **String** | A custom content/media (also known as MIME) type to be sent when downloading this file. By default Cloudsmith will attempt to detect the type, but if you need to override it, you can specify it here. | [optional] [default to null]
**description** | **String** | A textual description of this package. | [optional] [default to null]
**name** | **String** | The name of this package. | [optional] [default to null]
**package_file** | **String** | The primary file for the package. | [default to null]
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] [default to null]
**summary** | **String** | A one-liner synopsis of this package. | [optional] [default to null]
**tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] [default to null]
**version** | **String** | The raw version for this package. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


