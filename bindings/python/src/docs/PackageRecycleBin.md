# PackageRecycleBin


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** | The action to perform on soft-deleted packages. | [optional] 
**identifiers** | **List[str]** | A list of soft-deleted package identifiers to action. | [optional] 
**repository** | **str** | The repository name to filter packages to. If not provided, the action will be performed across all accessible repositories in the workspace. | [optional] 

## Example

```python
from cloudsmith_api.models.package_recycle_bin import PackageRecycleBin

# TODO update the JSON string below
json = "{}"
# create an instance of PackageRecycleBin from a JSON string
package_recycle_bin_instance = PackageRecycleBin.from_json(json)
# print the JSON string representation of the object
print(PackageRecycleBin.to_json())

# convert the object into a dict
package_recycle_bin_dict = package_recycle_bin_instance.to_dict()
# create an instance of PackageRecycleBin from a dict
package_recycle_bin_from_dict = PackageRecycleBin.from_dict(package_recycle_bin_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


