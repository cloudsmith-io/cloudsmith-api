# ConanPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conan_channel** | **str** | Conan channel. | [optional] 
**conan_prefix** | **str** | Conan prefix (User). | [optional] 
**info_file** | **str** | The info file is an python file containing the package metadata. | [optional] 
**manifest_file** | **str** | The info file is an python file containing the package metadata. | [optional] 
**metadata_file** | **str** | The conan file is an python file containing the package metadata. | [optional] 
**name** | **str** | The name of this package. | [optional] 
**package_file** | **str** | The primary file for the package. | [optional] 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 
**version** | **str** | The raw version for this package. | [optional] 

## Example

```python
from cloudsmith_api.models.conan_package_upload_request import ConanPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ConanPackageUploadRequest from a JSON string
conan_package_upload_request_instance = ConanPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(ConanPackageUploadRequest.to_json())

# convert the object into a dict
conan_package_upload_request_dict = conan_package_upload_request_instance.to_dict()
# create an instance of ConanPackageUploadRequest from a dict
conan_package_upload_request_from_dict = ConanPackageUploadRequest.from_dict(conan_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


