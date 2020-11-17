# CloudsmithApi::PackagesUploadMaven

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artifact_id** | **String** | The ID of the artifact. | [optional] 
**group_id** | **String** | Artifact&#39;s group ID. | [optional] 
**javadoc_file** | **String** | Adds bundled Java documentation to the Maven package | [optional] 
**package_file** | **String** | The primary file for the package. | 
**packaging** | **String** | Artifact&#39;s Maven packaging type. | [optional] 
**pom_file** | **String** | The POM file is an XML file containing the Maven coordinates. | [optional] 
**republish** | **BOOLEAN** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**security_scan_status** | **String** | None | [optional] 
**sources_file** | **String** | Adds bundled Java source code to the Maven package. | [optional] 
**tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] 
**tests_file** | **String** | Adds bundled Java tests to the Maven package. | [optional] 
**version** | **String** | The raw version for this package. | [optional] 


