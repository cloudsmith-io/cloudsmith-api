# CloudsmithApi::DebPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changes_file** | **String** | The changes archive containing the changes made to the source and debian packaging files | [optional] 
**component** | **String** | The component (channel) for the package (e.g. &#39;main&#39;, &#39;unstable&#39;, etc.) | [optional] [default to &#39;main&#39;]
**distribution** | **String** | The distribution to store the package for. | 
**package_file** | **String** | The primary file for the package. | 
**republish** | **BOOLEAN** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**sources_file** | **String** | The sources archive containing the source code for the binary | [optional] 
**tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] 


