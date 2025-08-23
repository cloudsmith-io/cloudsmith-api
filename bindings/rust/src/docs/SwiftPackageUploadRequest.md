# SwiftPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author_name** | **String** | The name of the author of the package. | [optional] [default to null]
**author_org** | **String** | The organization of the author. | [optional] [default to null]
**license_url** | **String** | The license URL of this package. | [optional] [default to null]
**name** | **String** | The name of this package. | [default to null]
**package_file** | **String** | The primary file for the package. | [default to null]
**readme_url** | **String** | The URL of the readme for the package. | [optional] [default to null]
**repository_url** | **String** | The URL of the SCM repository for the package. | [optional] [default to null]
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] [default to null]
**scope** | **String** | A scope provides a namespace for related packages within the package registry. | [default to null]
**tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] [default to null]
**version** | **String** | The raw version for this package. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


