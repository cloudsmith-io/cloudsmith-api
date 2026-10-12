# PackageFile


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cdn_url** | **str** |  | [optional] [readonly] 
**checksum_md5** | **str** |  | [optional] [readonly] 
**checksum_sha1** | **str** |  | [optional] [readonly] 
**checksum_sha256** | **str** |  | [optional] [readonly] 
**checksum_sha512** | **str** |  | [optional] [readonly] 
**downloads** | **int** |  | [optional] [readonly] 
**filename** | **str** |  | [optional] [readonly] 
**is_downloadable** | **bool** |  | [optional] [readonly] 
**is_primary** | **bool** |  | [optional] [readonly] 
**is_synchronised** | **bool** |  | [optional] [readonly] 
**signature_url** | **str** |  | [optional] [readonly] 
**size** | **int** | The calculated size of the file. | [optional] [readonly] 
**slug_perm** | **str** |  | [optional] [readonly] 
**tag** | **str** | Freeform descriptor that describes what the file is. | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.package_file import PackageFile

# TODO update the JSON string below
json = "{}"
# create an instance of PackageFile from a JSON string
package_file_instance = PackageFile.from_json(json)
# print the JSON string representation of the object
print(PackageFile.to_json())

# convert the object into a dict
package_file_dict = package_file_instance.to_dict()
# create an instance of PackageFile from a dict
package_file_from_dict = PackageFile.from_dict(package_file_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


