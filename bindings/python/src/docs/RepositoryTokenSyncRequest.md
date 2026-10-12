# RepositoryTokenSyncRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | **str** | The source repository slug (in the same owner namespace). | 

## Example

```python
from cloudsmith_api.models.repository_token_sync_request import RepositoryTokenSyncRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryTokenSyncRequest from a JSON string
repository_token_sync_request_instance = RepositoryTokenSyncRequest.from_json(json)
# print the JSON string representation of the object
print(RepositoryTokenSyncRequest.to_json())

# convert the object into a dict
repository_token_sync_request_dict = repository_token_sync_request_instance.to_dict()
# create an instance of RepositoryTokenSyncRequest from a dict
repository_token_sync_request_from_dict = RepositoryTokenSyncRequest.from_dict(repository_token_sync_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


