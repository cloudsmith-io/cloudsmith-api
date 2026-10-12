# UserAuthToken


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **str** | API token for the authenticated user | [optional] [readonly] 
**two_factor_required** | **bool** | Flag indicating whether a 2FA code is required to complete authentication | [optional] [readonly] 
**two_factor_token** | **str** | Token to use when providing 2FA code | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.user_auth_token import UserAuthToken

# TODO update the JSON string below
json = "{}"
# create an instance of UserAuthToken from a JSON string
user_auth_token_instance = UserAuthToken.from_json(json)
# print the JSON string representation of the object
print(UserAuthToken.to_json())

# convert the object into a dict
user_auth_token_dict = user_auth_token_instance.to_dict()
# create an instance of UserAuthToken from a dict
user_auth_token_from_dict = UserAuthToken.from_dict(user_auth_token_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


