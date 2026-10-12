# PackageBulkAction


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** | The action to perform on the packages. | 
**identifiers** | **List[str]** | A list of package identifiers to apply the action to. | 
**repository** | **str** | The repository name to filter packages to. If not provided, the action will be performed across all accessible repositories in the workspace. | [optional] 
**target_repository** | **str** | The slug of the target repository | [optional] 

## Example

```python
from cloudsmith_api.models.package_bulk_action import PackageBulkAction

# TODO update the JSON string below
json = "{}"
# create an instance of PackageBulkAction from a JSON string
package_bulk_action_instance = PackageBulkAction.from_json(json)
# print the JSON string representation of the object
print(PackageBulkAction.to_json())

# convert the object into a dict
package_bulk_action_dict = package_bulk_action_instance.to_dict()
# create an instance of PackageBulkAction from a dict
package_bulk_action_from_dict = PackageBulkAction.from_dict(package_bulk_action_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


