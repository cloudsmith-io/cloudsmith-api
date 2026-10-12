# HexPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**package_file** | **str** | The primary file for the package. | [optional] 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 

## Example

```python
from cloudsmith_api.models.hex_package_upload_request import HexPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of HexPackageUploadRequest from a JSON string
hex_package_upload_request_instance = HexPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(HexPackageUploadRequest.to_json())

# convert the object into a dict
hex_package_upload_request_dict = hex_package_upload_request_instance.to_dict()
# create an instance of HexPackageUploadRequest from a dict
hex_package_upload_request_from_dict = HexPackageUploadRequest.from_dict(hex_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


