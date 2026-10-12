# VagrantPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of this package. | 
**package_file** | **str** | The primary file for the package. | 
**provider** | **str** | The virtual machine provider for the box. | 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 
**version** | **str** | The raw version for this package. | 

## Example

```python
from cloudsmith_api.models.vagrant_package_upload_request import VagrantPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of VagrantPackageUploadRequest from a JSON string
vagrant_package_upload_request_instance = VagrantPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(VagrantPackageUploadRequest.to_json())

# convert the object into a dict
vagrant_package_upload_request_dict = vagrant_package_upload_request_instance.to_dict()
# create an instance of VagrantPackageUploadRequest from a dict
vagrant_package_upload_request_from_dict = VagrantPackageUploadRequest.from_dict(vagrant_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


