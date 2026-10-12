# ConnectedRepository


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**can_view_target_repository_settings** | **bool** | Whether the current user has permission to view the target repository&#39;s settings. When false, &#x60;configured_upstreams&#x60; will be empty even if upstreams are configured. | [optional] [readonly] 
**configured_upstreams** | [**List[ConnectedRepositoryUpstream]**](ConnectedRepositoryUpstream.md) | The upstream sources configured on the target repository, used to display which formats/upstreams the connection exposes. | [optional] [readonly] 
**created_at** | **datetime** | The date and time when the connection was created. | [optional] [readonly] 
**disable_reason** | **str** |  | [optional] [readonly] 
**disable_reason_text** | **str** | Human-readable explanation of why this connection is disabled. | [optional] [readonly] 
**is_active** | **bool** |  | [optional] 
**priority** | **int** | Repositories are checked in ascending order (starting at 1). If multiple repositories have the same priority, the oldest one is used first. | [optional] 
**slug_perm** | **str** |  | [optional] [readonly] 
**target_repository** | **str** | The slug of the target repository to connect to. | [optional] 
**target_repository_summary** | [**ConnectedRepositoryTargetSummary**](ConnectedRepositoryTargetSummary.md) |  | [optional] 

## Example

```python
from cloudsmith_api.models.connected_repository import ConnectedRepository

# TODO update the JSON string below
json = "{}"
# create an instance of ConnectedRepository from a JSON string
connected_repository_instance = ConnectedRepository.from_json(json)
# print the JSON string representation of the object
print(ConnectedRepository.to_json())

# convert the object into a dict
connected_repository_dict = connected_repository_instance.to_dict()
# create an instance of ConnectedRepository from a dict
connected_repository_from_dict = ConnectedRepository.from_dict(connected_repository_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


