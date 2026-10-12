# RawPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | **str** | A custom content/media (also known as MIME) type to be sent when downloading this file. By default Cloudsmith will attempt to detect the type, but if you need to override it, you can specify it here. | [optional] 
**description** | **str** | A textual description of this package. | [optional] 
**name** | **str** | The name of this package. | [optional] 
**package_file** | **str** | The primary file for the package. | [optional] 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**summary** | **str** | A one-liner synopsis of this package. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 
**version** | **str** | The raw version for this package. | [optional] 

## Example

```python
from cloudsmith_api.models.raw_package_upload_request import RawPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RawPackageUploadRequest from a JSON string
raw_package_upload_request_instance = RawPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(RawPackageUploadRequest.to_json())

# convert the object into a dict
raw_package_upload_request_dict = raw_package_upload_request_instance.to_dict()
# create an instance of RawPackageUploadRequest from a dict
raw_package_upload_request_from_dict = RawPackageUploadRequest.from_dict(raw_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


