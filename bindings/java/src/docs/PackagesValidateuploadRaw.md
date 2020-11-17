
# PackagesValidateuploadRaw

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentType** | **String** | A custom content/media (also known as MIME) type to be sent when downloading this file. By default Cloudsmith will attempt to detect the type, but if you need to override it, you can specify it here. |  [optional]
**description** | **String** | A textual description of this package. |  [optional]
**name** | **String** | The name of this package. |  [optional]
**packageFile** | **String** | The primary file for the package. | 
**republish** | **Boolean** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. |  [optional]
**securityScanStatus** | **String** | None |  [optional]
**summary** | **String** | A one-liner synopsis of this package. |  [optional]
**tags** | **String** | A comma-separated values list of tags to add to the package. |  [optional]
**version** | **String** | The raw version for this package. |  [optional]



