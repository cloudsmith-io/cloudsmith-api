# PackageFilePartsUpload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **str** | The identifier for the file to use uploading parts. | [optional] [readonly] 
**upload_querystring** | **str** | The querystring to use for the next-step PUT upload. | [optional] [readonly] 
**upload_url** | **str** | The URL to use for the next-step PUT upload | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.package_file_parts_upload import PackageFilePartsUpload

# TODO update the JSON string below
json = "{}"
# create an instance of PackageFilePartsUpload from a JSON string
package_file_parts_upload_instance = PackageFilePartsUpload.from_json(json)
# print the JSON string representation of the object
print(PackageFilePartsUpload.to_json())

# convert the object into a dict
package_file_parts_upload_dict = package_file_parts_upload_instance.to_dict()
# create an instance of PackageFilePartsUpload from a dict
package_file_parts_upload_from_dict = PackageFilePartsUpload.from_dict(package_file_parts_upload_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


