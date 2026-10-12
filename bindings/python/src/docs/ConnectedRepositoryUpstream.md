# ConnectedRepositoryUpstream


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The format/backend slug of the upstream (e.g. &#39;npm&#39;). | [optional] [readonly] 
**upstream_url** | **str** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.connected_repository_upstream import ConnectedRepositoryUpstream

# TODO update the JSON string below
json = "{}"
# create an instance of ConnectedRepositoryUpstream from a JSON string
connected_repository_upstream_instance = ConnectedRepositoryUpstream.from_json(json)
# print the JSON string representation of the object
print(ConnectedRepositoryUpstream.to_json())

# convert the object into a dict
connected_repository_upstream_dict = connected_repository_upstream_instance.to_dict()
# create an instance of ConnectedRepositoryUpstream from a dict
connected_repository_upstream_from_dict = ConnectedRepositoryUpstream.from_dict(connected_repository_upstream_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


