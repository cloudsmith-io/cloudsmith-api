# BroadcastToken


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expires_at** | **datetime** |  | [optional] [readonly] 
**token** | **str** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.broadcast_token import BroadcastToken

# TODO update the JSON string below
json = "{}"
# create an instance of BroadcastToken from a JSON string
broadcast_token_instance = BroadcastToken.from_json(json)
# print the JSON string representation of the object
print(BroadcastToken.to_json())

# convert the object into a dict
broadcast_token_dict = broadcast_token_instance.to_dict()
# create an instance of BroadcastToken from a dict
broadcast_token_from_dict = BroadcastToken.from_dict(broadcast_token_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


