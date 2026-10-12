# CargoPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**package_file** | **str** | The primary file for the package. | 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 

## Example

```python
from cloudsmith_api.models.cargo_package_upload_request import CargoPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CargoPackageUploadRequest from a JSON string
cargo_package_upload_request_instance = CargoPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(CargoPackageUploadRequest.to_json())

# convert the object into a dict
cargo_package_upload_request_dict = cargo_package_upload_request_instance.to_dict()
# create an instance of CargoPackageUploadRequest from a dict
cargo_package_upload_request_from_dict = CargoPackageUploadRequest.from_dict(cargo_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


