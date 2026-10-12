# PackageBulkActionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** | The action that was performed. | [optional] [readonly] 
**packages_actioned** | **List[str]** | List of package identifiers that were successfully actioned. | [optional] [readonly] 
**packages_failed_to_action** | **Dict[str, Dict[str, Optional[str]]]** | Dictionary of package identifiers that failed with their error details. | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.package_bulk_action_response import PackageBulkActionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of PackageBulkActionResponse from a JSON string
package_bulk_action_response_instance = PackageBulkActionResponse.from_json(json)
# print the JSON string representation of the object
print(PackageBulkActionResponse.to_json())

# convert the object into a dict
package_bulk_action_response_dict = package_bulk_action_response_instance.to_dict()
# create an instance of PackageBulkActionResponse from a dict
package_bulk_action_response_from_dict = PackageBulkActionResponse.from_dict(package_bulk_action_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


