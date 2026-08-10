# MavenPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artifact_id** | **String** | The ID of the artifact. | [optional] [default to null]
**group_id** | **String** | Artifact&#39;s group ID. | [optional] [default to null]
**ivy_file** | **String** | The ivy file is an XML file describing the dependencies of the project. | [optional] [default to null]
**javadoc_file** | **String** | Adds bundled Java documentation to the Maven package | [optional] [default to null]
**package_file** | **String** | The primary file for the package. | [default to null]
**packaging** | **String** | Artifact&#39;s Maven packaging type. | [optional] [default to null]
**pom_file** | **String** | The POM file is an XML file containing the Maven coordinates. | [optional] [default to null]
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] [default to null]
**sbt_version** | **String** |  | [optional] [default to null]
**scala_version** | **String** |  | [optional] [default to null]
**sources_file** | **String** | Adds bundled Java source code to the Maven package. | [optional] [default to null]
**tags** | **String** | A comma-separated values list of tags to add to the package. | [optional] [default to null]
**tests_file** | **String** | Adds bundled Java tests to the Maven package. | [optional] [default to null]
**version** | **String** | The raw version for this package. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


