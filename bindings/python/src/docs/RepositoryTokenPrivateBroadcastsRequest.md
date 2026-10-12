# RepositoryTokenPrivateBroadcastsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_private_broadcasts** | **bool** | Whether the token should have access to private broadcasts. | 

## Example

```python
from cloudsmith_api.models.repository_token_private_broadcasts_request import RepositoryTokenPrivateBroadcastsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryTokenPrivateBroadcastsRequest from a JSON string
repository_token_private_broadcasts_request_instance = RepositoryTokenPrivateBroadcastsRequest.from_json(json)
# print the JSON string representation of the object
print(RepositoryTokenPrivateBroadcastsRequest.to_json())

# convert the object into a dict
repository_token_private_broadcasts_request_dict = repository_token_private_broadcasts_request_instance.to_dict()
# create an instance of RepositoryTokenPrivateBroadcastsRequest from a dict
repository_token_private_broadcasts_request_from_dict = RepositoryTokenPrivateBroadcastsRequest.from_dict(repository_token_private_broadcasts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


