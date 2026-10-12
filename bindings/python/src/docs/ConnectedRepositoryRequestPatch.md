# ConnectedRepositoryRequestPatch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_active** | **bool** |  | [optional] [default to False]
**priority** | **int** | Repositories are checked in ascending order (starting at 1). If multiple repositories have the same priority, the oldest one is used first. | [optional] 
**target_repository** | **str** | The slug of the target repository to connect to. | [optional] 

## Example

```python
from cloudsmith_api.models.connected_repository_request_patch import ConnectedRepositoryRequestPatch

# TODO update the JSON string below
json = "{}"
# create an instance of ConnectedRepositoryRequestPatch from a JSON string
connected_repository_request_patch_instance = ConnectedRepositoryRequestPatch.from_json(json)
# print the JSON string representation of the object
print(ConnectedRepositoryRequestPatch.to_json())

# convert the object into a dict
connected_repository_request_patch_dict = connected_repository_request_patch_instance.to_dict()
# create an instance of ConnectedRepositoryRequestPatch from a dict
connected_repository_request_patch_from_dict = ConnectedRepositoryRequestPatch.from_dict(connected_repository_request_patch_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


