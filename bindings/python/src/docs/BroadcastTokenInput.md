# BroadcastTokenInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entitlement_token** | **str** | Repository entitlement token used to authorize the creation of a broadcast token | 
**expires_in** | **int** | Token expiry time in seconds (optional, defaults to 3600 seconds) | [optional] 

## Example

```python
from cloudsmith_api.models.broadcast_token_input import BroadcastTokenInput

# TODO update the JSON string below
json = "{}"
# create an instance of BroadcastTokenInput from a JSON string
broadcast_token_input_instance = BroadcastTokenInput.from_json(json)
# print the JSON string representation of the object
print(BroadcastTokenInput.to_json())

# convert the object into a dict
broadcast_token_input_dict = broadcast_token_input_instance.to_dict()
# create an instance of BroadcastTokenInput from a dict
broadcast_token_input_from_dict = BroadcastTokenInput.from_dict(broadcast_token_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


