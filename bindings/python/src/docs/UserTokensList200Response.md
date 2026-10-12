# UserTokensList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List[UserAuthenticationToken]**](UserAuthenticationToken.md) |  | 

## Example

```python
from cloudsmith_api.models.user_tokens_list200_response import UserTokensList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of UserTokensList200Response from a JSON string
user_tokens_list200_response_instance = UserTokensList200Response.from_json(json)
# print the JSON string representation of the object
print(UserTokensList200Response.to_json())

# convert the object into a dict
user_tokens_list200_response_dict = user_tokens_list200_response_instance.to_dict()
# create an instance of UserTokensList200Response from a dict
user_tokens_list200_response_from_dict = UserTokensList200Response.from_dict(user_tokens_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


