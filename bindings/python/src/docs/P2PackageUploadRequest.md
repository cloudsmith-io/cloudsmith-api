# P2PackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**package_file** | **str** | The primary file for the package. | 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 

## Example

```python
from cloudsmith_api.models.p2_package_upload_request import P2PackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of P2PackageUploadRequest from a JSON string
p2_package_upload_request_instance = P2PackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(P2PackageUploadRequest.to_json())

# convert the object into a dict
p2_package_upload_request_dict = p2_package_upload_request_instance.to_dict()
# create an instance of P2PackageUploadRequest from a dict
p2_package_upload_request_from_dict = P2PackageUploadRequest.from_dict(p2_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


