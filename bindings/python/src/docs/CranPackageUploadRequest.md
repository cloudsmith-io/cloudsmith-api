# CranPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**architecture** | **str** | Binary package uploads for macOS should specify the architecture they were built for. | [optional] 
**package_file** | **str** | The primary file for the package. | 
**r_version** | **str** | Binary package uploads should specify the version of R they were built for. | [optional] 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 

## Example

```python
from cloudsmith_api.models.cran_package_upload_request import CranPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CranPackageUploadRequest from a JSON string
cran_package_upload_request_instance = CranPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(CranPackageUploadRequest.to_json())

# convert the object into a dict
cran_package_upload_request_dict = cran_package_upload_request_instance.to_dict()
# create an instance of CranPackageUploadRequest from a dict
cran_package_upload_request_from_dict = CranPackageUploadRequest.from_dict(cran_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


