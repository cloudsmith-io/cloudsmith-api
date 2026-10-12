# UserAuthTokenRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** | Email address to authenticate with | [optional] 
**password** | **str** | Password to authenticate with | [optional] 
**totp_token** | **str** | Two-factor authentication code | [optional] 

## Example

```python
from cloudsmith_api.models.user_auth_token_request import UserAuthTokenRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UserAuthTokenRequest from a JSON string
user_auth_token_request_instance = UserAuthTokenRequest.from_json(json)
# print the JSON string representation of the object
print(UserAuthTokenRequest.to_json())

# convert the object into a dict
user_auth_token_request_dict = user_auth_token_request_instance.to_dict()
# create an instance of UserAuthTokenRequest from a dict
user_auth_token_request_from_dict = UserAuthTokenRequest.from_dict(user_auth_token_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


