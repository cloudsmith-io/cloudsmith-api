# RpmPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**distribution** | **str** | The distribution to store the package for. | 
**package_file** | **str** | The primary file for the package. | 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 

## Example

```python
from cloudsmith_api.models.rpm_package_upload_request import RpmPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RpmPackageUploadRequest from a JSON string
rpm_package_upload_request_instance = RpmPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(RpmPackageUploadRequest.to_json())

# convert the object into a dict
rpm_package_upload_request_dict = rpm_package_upload_request_instance.to_dict()
# create an instance of RpmPackageUploadRequest from a dict
rpm_package_upload_request_from_dict = RpmPackageUploadRequest.from_dict(rpm_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


