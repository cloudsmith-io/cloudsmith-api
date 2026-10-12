# CocoapodsPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**package_file** | **str** | The primary file for the package. | 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 

## Example

```python
from cloudsmith_api.models.cocoapods_package_upload_request import CocoapodsPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CocoapodsPackageUploadRequest from a JSON string
cocoapods_package_upload_request_instance = CocoapodsPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(CocoapodsPackageUploadRequest.to_json())

# convert the object into a dict
cocoapods_package_upload_request_dict = cocoapods_package_upload_request_instance.to_dict()
# create an instance of CocoapodsPackageUploadRequest from a dict
cocoapods_package_upload_request_from_dict = CocoapodsPackageUploadRequest.from_dict(cocoapods_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


