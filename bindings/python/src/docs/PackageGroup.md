# PackageGroup


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backend_kind** | **int** |  | [optional] 
**count** | **int** |  | 
**last_push** | **datetime** |  | 
**name** | **str** |  | [optional] 
**num_downloads** | **int** |  | 
**size** | **int** |  | 

## Example

```python
from cloudsmith_api.models.package_group import PackageGroup

# TODO update the JSON string below
json = "{}"
# create an instance of PackageGroup from a JSON string
package_group_instance = PackageGroup.from_json(json)
# print the JSON string representation of the object
print(PackageGroup.to_json())

# convert the object into a dict
package_group_dict = package_group_instance.to_dict()
# create an instance of PackageGroup from a dict
package_group_from_dict = PackageGroup.from_dict(package_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


