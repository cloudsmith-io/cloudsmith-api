# PackagesUploadMaven

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artifact_id** | **str** | The ID of the artifact. | [optional] 
**group_id** | **str** | Artifact&#39;s group ID. | [optional] 
**javadoc_file** | **str** | Adds bundled Java documentation to the Maven package | [optional] 
**package_file** | **str** | The primary file for the package. | 
**packaging** | **str** | Artifact&#39;s Maven packaging type. | [optional] 
**pom_file** | **str** | The POM file is an XML file containing the Maven coordinates. | [optional] 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**security_scan_status** | **str** | None | [optional] 
**sources_file** | **str** | Adds bundled Java source code to the Maven package. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 
**tests_file** | **str** | Adds bundled Java tests to the Maven package. | [optional] 
**version** | **str** | The raw version for this package. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


