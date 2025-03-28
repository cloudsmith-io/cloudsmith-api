
# MavenPackageUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artifactId** | **String** | The ID of the artifact. |  [optional]
**extraFiles** | **List&lt;String&gt;** | Extra files to include in the package. This can be a single file or multiple files. |  [optional]
**groupId** | **String** | Artifact&#39;s group ID. |  [optional]
**ivyFile** | **String** | The ivy file is an XML file describing the dependencies of the project. |  [optional]
**javadocFile** | **String** | Adds bundled Java documentation to the Maven package |  [optional]
**packageFile** | **String** | The primary file for the package. | 
**packaging** | **String** | Artifact&#39;s Maven packaging type. |  [optional]
**pomFile** | **String** | The POM file is an XML file containing the Maven coordinates. |  [optional]
**republish** | **Boolean** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. |  [optional]
**sbtVersion** | **String** |  |  [optional]
**scalaVersion** | **String** |  |  [optional]
**sourcesFile** | **String** | Adds bundled Java source code to the Maven package. |  [optional]
**tags** | **String** | A comma-separated values list of tags to add to the package. |  [optional]
**testsFile** | **String** | Adds bundled Java tests to the Maven package. |  [optional]
**version** | **String** | The raw version for this package. |  [optional]



