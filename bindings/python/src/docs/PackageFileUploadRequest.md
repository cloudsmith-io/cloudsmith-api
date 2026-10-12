# PackageFileUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filename** | **str** | Filename for the package file upload. | 
**md5_checksum** | **str** | MD5 checksum for a POST-based package file upload. | [optional] 
**method** | **str** | The method to use for package file upload. | [optional] [default to 'post']
**sha256_checksum** | **str** | SHA256 checksum for a PUT-based package file upload. | [optional] 

## Example

```python
from cloudsmith_api.models.package_file_upload_request import PackageFileUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PackageFileUploadRequest from a JSON string
package_file_upload_request_instance = PackageFileUploadRequest.from_json(json)
# print the JSON string representation of the object
print(PackageFileUploadRequest.to_json())

# convert the object into a dict
package_file_upload_request_dict = package_file_upload_request_instance.to_dict()
# create an instance of PackageFileUploadRequest from a dict
package_file_upload_request_from_dict = PackageFileUploadRequest.from_dict(package_file_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


