# HelmPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**package_file** | **str** | The primary file for the package. | 
**provenance_file** | **str** | The provenance file containing the signature for the chart. If one is not provided, it will be generated automatically. | [optional] 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 

## Example

```python
from cloudsmith_api.models.helm_package_upload_request import HelmPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of HelmPackageUploadRequest from a JSON string
helm_package_upload_request_instance = HelmPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(HelmPackageUploadRequest.to_json())

# convert the object into a dict
helm_package_upload_request_dict = helm_package_upload_request_instance.to_dict()
# create an instance of HelmPackageUploadRequest from a dict
helm_package_upload_request_from_dict = HelmPackageUploadRequest.from_dict(helm_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


