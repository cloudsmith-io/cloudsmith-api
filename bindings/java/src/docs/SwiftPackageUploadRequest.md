
# SwiftPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorName** | **String** | The name of the author of the package. |  [optional]
**authorOrg** | **String** | The organization of the author. |  [optional]
**licenseUrl** | **String** | The license URL of this package. |  [optional]
**name** | **String** | The name of this package. | 
**packageFile** | **String** | The primary file for the package. | 
**readmeUrl** | **String** | The URL of the readme for the package. |  [optional]
**repositoryUrl** | **String** | The URL of the SCM repository for the package. |  [optional]
**republish** | **Boolean** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. |  [optional]
**scope** | **String** | A scope provides a namespace for related packages within the package registry. | 
**tags** | **String** | A comma-separated values list of tags to add to the package. |  [optional]
**version** | **String** | The raw version for this package. | 



