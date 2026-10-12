# GenericPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filepath** | **str** | The full filepath of the package including filename. | [optional] 
**name** | **str** | The name of this package. | [optional] 
**package_file** | **str** | The primary file for the package. | [optional] 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 
**version** | **str** | The raw version for this package. | [optional] 

## Example

```python
from cloudsmith_api.models.generic_package_upload_request import GenericPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GenericPackageUploadRequest from a JSON string
generic_package_upload_request_instance = GenericPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(GenericPackageUploadRequest.to_json())

# convert the object into a dict
generic_package_upload_request_dict = generic_package_upload_request_instance.to_dict()
# create an instance of GenericPackageUploadRequest from a dict
generic_package_upload_request_from_dict = GenericPackageUploadRequest.from_dict(generic_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


