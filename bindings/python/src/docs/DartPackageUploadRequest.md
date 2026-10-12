# DartPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**package_file** | **str** | The primary file for the package. | [optional] 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 

## Example

```python
from cloudsmith_api.models.dart_package_upload_request import DartPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DartPackageUploadRequest from a JSON string
dart_package_upload_request_instance = DartPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(DartPackageUploadRequest.to_json())

# convert the object into a dict
dart_package_upload_request_dict = dart_package_upload_request_instance.to_dict()
# create an instance of DartPackageUploadRequest from a dict
dart_package_upload_request_from_dict = DartPackageUploadRequest.from_dict(dart_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


