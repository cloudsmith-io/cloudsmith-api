# LuarocksPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**package_file** | **str** | The primary file for the package. | [optional] 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 

## Example

```python
from cloudsmith_api.models.luarocks_package_upload_request import LuarocksPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of LuarocksPackageUploadRequest from a JSON string
luarocks_package_upload_request_instance = LuarocksPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(LuarocksPackageUploadRequest.to_json())

# convert the object into a dict
luarocks_package_upload_request_dict = luarocks_package_upload_request_instance.to_dict()
# create an instance of LuarocksPackageUploadRequest from a dict
luarocks_package_upload_request_from_dict = LuarocksPackageUploadRequest.from_dict(luarocks_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


