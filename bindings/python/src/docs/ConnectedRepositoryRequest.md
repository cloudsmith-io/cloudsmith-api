# ConnectedRepositoryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_active** | **bool** |  | [optional] [default to False]
**priority** | **int** | Repositories are checked in ascending order (starting at 1). If multiple repositories have the same priority, the oldest one is used first. | [optional] 
**target_repository** | **str** | The slug of the target repository to connect to. | 

## Example

```python
from cloudsmith_api.models.connected_repository_request import ConnectedRepositoryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ConnectedRepositoryRequest from a JSON string
connected_repository_request_instance = ConnectedRepositoryRequest.from_json(json)
# print the JSON string representation of the object
print(ConnectedRepositoryRequest.to_json())

# convert the object into a dict
connected_repository_request_dict = connected_repository_request_instance.to_dict()
# create an instance of ConnectedRepositoryRequest from a dict
connected_repository_request_from_dict = ConnectedRepositoryRequest.from_dict(connected_repository_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


