# MavenPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artifact_id** | **str** | The ID of the artifact. | [optional] 
**extra_files** | **List[str]** | Extra files to include in the package. This can be a single file or multiple files. | [optional] 
**group_id** | **str** | Artifact&#39;s group ID. | [optional] 
**ivy_file** | **str** | The ivy file is an XML file describing the dependencies of the project. | [optional] 
**javadoc_file** | **str** | Adds bundled Java documentation to the Maven package | [optional] 
**package_file** | **str** | The primary file for the package. | [optional] 
**packaging** | **str** | Artifact&#39;s Maven packaging type. | [optional] 
**pom_file** | **str** | The POM file is an XML file containing the Maven coordinates. | [optional] 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**sbt_version** | **str** |  | [optional] 
**scala_version** | **str** |  | [optional] 
**sources_file** | **str** | Adds bundled Java source code to the Maven package. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 
**tests_file** | **str** | Adds bundled Java tests to the Maven package. | [optional] 
**version** | **str** | The raw version for this package. | [optional] 

## Example

```python
from cloudsmith_api.models.maven_package_upload_request import MavenPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of MavenPackageUploadRequest from a JSON string
maven_package_upload_request_instance = MavenPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(MavenPackageUploadRequest.to_json())

# convert the object into a dict
maven_package_upload_request_dict = maven_package_upload_request_instance.to_dict()
# create an instance of MavenPackageUploadRequest from a dict
maven_package_upload_request_from_dict = MavenPackageUploadRequest.from_dict(maven_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


