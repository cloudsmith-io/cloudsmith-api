# RawPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | **str** | A custom content/media (also known as MIME) type to be sent when downloading this file. By default Cloudsmith will attempt to detect the type, but if you need to override it, you can specify it here. | [optional] 
**description** | **str** | A textual description of this package. | [optional] 
**name** | **str** | The name of this package. | [optional] 
**package_file** | **str** | The primary file for the package. | 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**summary** | **str** | A one-liner synopsis of this package. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 
**version** | **str** | The raw version for this package. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


