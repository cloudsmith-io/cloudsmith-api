
# NugetPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**packageFile** | **String** | The primary file for the package. | 
**republish** | **Boolean** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. |  [optional]
**symbolsFile** | **String** | Uploads a symbols file as a separate package |  [optional]
**tags** | **String** | A comma-separated values list of tags to add to the package. |  [optional]



