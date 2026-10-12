# NugetPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**package_file** | **str** | The primary file for the package. | 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**symbols_file** | **str** | Uploads a symbols file as a separate package | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 

## Example

```python
from cloudsmith_api.models.nuget_package_upload_request import NugetPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of NugetPackageUploadRequest from a JSON string
nuget_package_upload_request_instance = NugetPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(NugetPackageUploadRequest.to_json())

# convert the object into a dict
nuget_package_upload_request_dict = nuget_package_upload_request_instance.to_dict()
# create an instance of NugetPackageUploadRequest from a dict
nuget_package_upload_request_from_dict = NugetPackageUploadRequest.from_dict(nuget_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


