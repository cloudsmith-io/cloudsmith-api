# ConnectedRepositoryTargetSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_private** | **bool** |  | [optional] [readonly] 
**is_public** | **bool** |  | [optional] [readonly] 
**package_count** | **int** |  | [optional] [readonly] 
**size** | **int** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.connected_repository_target_summary import ConnectedRepositoryTargetSummary

# TODO update the JSON string below
json = "{}"
# create an instance of ConnectedRepositoryTargetSummary from a JSON string
connected_repository_target_summary_instance = ConnectedRepositoryTargetSummary.from_json(json)
# print the JSON string representation of the object
print(ConnectedRepositoryTargetSummary.to_json())

# convert the object into a dict
connected_repository_target_summary_dict = connected_repository_target_summary_instance.to_dict()
# create an instance of ConnectedRepositoryTargetSummary from a dict
connected_repository_target_summary_from_dict = ConnectedRepositoryTargetSummary.from_dict(connected_repository_target_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


