# UserAuthenticationToken


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | **datetime** | The time at which the API key was created. | [optional] [readonly] 
**key** | **str** | The unique API key used for authentication. This will be obfuscated on read-only HTTP methods. | [optional] [readonly] 
**slug_perm** | **str** | The slug_perm for token. | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.user_authentication_token import UserAuthenticationToken

# TODO update the JSON string below
json = "{}"
# create an instance of UserAuthenticationToken from a JSON string
user_authentication_token_instance = UserAuthenticationToken.from_json(json)
# print the JSON string representation of the object
print(UserAuthenticationToken.to_json())

# convert the object into a dict
user_authentication_token_dict = user_authentication_token_instance.to_dict()
# create an instance of UserAuthenticationToken from a dict
user_authentication_token_from_dict = UserAuthenticationToken.from_dict(user_authentication_token_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


