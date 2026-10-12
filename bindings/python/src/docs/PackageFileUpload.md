# PackageFileUpload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **str** | The identifier for the file to use when creating packages | [optional] [readonly] 
**upload_fields** | **object** | The dictionary of fields that must be sent with POST uploads | [optional] [readonly] 
**upload_headers** | **object** | The dictionary of headers that must be sent with uploads | [optional] [readonly] 
**upload_querystring** | **str** | The querystring to use for the next-step POST or PUT upload | [optional] [readonly] 
**upload_url** | **str** | The URL to use for the next-step POST or PUT upload | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.package_file_upload import PackageFileUpload

# TODO update the JSON string below
json = "{}"
# create an instance of PackageFileUpload from a JSON string
package_file_upload_instance = PackageFileUpload.from_json(json)
# print the JSON string representation of the object
print(PackageFileUpload.to_json())

# convert the object into a dict
package_file_upload_dict = package_file_upload_instance.to_dict()
# create an instance of PackageFileUpload from a dict
package_file_upload_from_dict = PackageFileUpload.from_dict(package_file_upload_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


