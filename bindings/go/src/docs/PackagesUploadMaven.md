# PackagesUploadMaven

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ArtifactId** | **string** | The ID of the artifact. | [optional] [default to null]
**GroupId** | **string** | Artifact&#39;s group ID. | [optional] [default to null]
**JavadocFile** | **string** | Adds bundled Java documentation to the Maven package | [optional] [default to null]
**PackageFile** | **string** | The primary file for the package. | [default to null]
**Packaging** | **string** | Artifact&#39;s Maven packaging type. | [optional] [default to null]
**PomFile** | **string** | The POM file is an XML file containing the Maven coordinates. | [optional] [default to null]
**Republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] [default to null]
**SecurityScanStatus** | **string** | None | [optional] [default to null]
**SourcesFile** | **string** | Adds bundled Java source code to the Maven package. | [optional] [default to null]
**Tags** | **string** | A comma-separated values list of tags to add to the package. | [optional] [default to null]
**TestsFile** | **string** | Adds bundled Java tests to the Maven package. | [optional] [default to null]
**Version** | **string** | The raw version for this package. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


