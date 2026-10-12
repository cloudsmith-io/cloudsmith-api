# RepositoryTokenSync


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tokens** | [**List[RepositoryToken]**](RepositoryToken.md) | The entitlements that have been synchronised. | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.repository_token_sync import RepositoryTokenSync

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryTokenSync from a JSON string
repository_token_sync_instance = RepositoryTokenSync.from_json(json)
# print the JSON string representation of the object
print(RepositoryTokenSync.to_json())

# convert the object into a dict
repository_token_sync_dict = repository_token_sync_instance.to_dict()
# create an instance of RepositoryTokenSync from a dict
repository_token_sync_from_dict = RepositoryTokenSync.from_dict(repository_token_sync_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


