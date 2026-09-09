# CloudsmithApi::NpmPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**npm_dist_tag** | **String** | The default npm dist-tag for this package/version - This will replace any other package/version if they are using the same tag. | [optional] [default to &#39;latest&#39;]
**package_file** | **String** | The primary file for the package. | 
**republish** | **BOOLEAN** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] 


