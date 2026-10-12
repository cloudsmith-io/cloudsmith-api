# ReposConnectedList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List[ConnectedRepository]**](ConnectedRepository.md) |  | 

## Example

```python
from cloudsmith_api.models.repos_connected_list200_response import ReposConnectedList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ReposConnectedList200Response from a JSON string
repos_connected_list200_response_instance = ReposConnectedList200Response.from_json(json)
# print the JSON string representation of the object
print(ReposConnectedList200Response.to_json())

# convert the object into a dict
repos_connected_list200_response_dict = repos_connected_list200_response_instance.to_dict()
# create an instance of ReposConnectedList200Response from a dict
repos_connected_list200_response_from_dict = ReposConnectedList200Response.from_dict(repos_connected_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


