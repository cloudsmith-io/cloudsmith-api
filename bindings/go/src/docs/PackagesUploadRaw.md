# PackagesUploadRaw

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContentType** | **string** | A custom content/media (also known as MIME) type to be sent when downloading this file. By default Cloudsmith will attempt to detect the type, but if you need to override it, you can specify it here. | [optional] [default to null]
**Description** | **string** | A textual description of this package. | [optional] [default to null]
**Name** | **string** | The name of this package. | [optional] [default to null]
**PackageFile** | **string** | The primary file for the package. | [default to null]
**Republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] [default to null]
**SecurityScanStatus** | **string** | None | [optional] [default to null]
**Summary** | **string** | A one-liner synopsis of this package. | [optional] [default to null]
**Tags** | **string** | A comma-separated values list of tags to add to the package. | [optional] [default to null]
**Version** | **string** | The raw version for this package. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


