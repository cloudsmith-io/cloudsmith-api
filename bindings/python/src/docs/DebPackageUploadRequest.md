# DebPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changes_file** | **str** | The changes archive containing the changes made to the source and debian packaging files | [optional] 
**component** | **str** | The component (channel) for the package (e.g. &#39;main&#39;, &#39;unstable&#39;, etc.) | [optional] [default to 'main']
**distribution** | **str** | The distribution to store the package for. | 
**package_file** | **str** | The primary file for the package. | 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**sources_file** | **str** | The sources archive containing the source code for the binary | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 

## Example

```python
from cloudsmith_api.models.deb_package_upload_request import DebPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DebPackageUploadRequest from a JSON string
deb_package_upload_request_instance = DebPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(DebPackageUploadRequest.to_json())

# convert the object into a dict
deb_package_upload_request_dict = deb_package_upload_request_instance.to_dict()
# create an instance of DebPackageUploadRequest from a dict
deb_package_upload_request_from_dict = DebPackageUploadRequest.from_dict(deb_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


