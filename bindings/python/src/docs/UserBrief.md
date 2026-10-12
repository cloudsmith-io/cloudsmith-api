# UserBrief


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authenticated** | **bool** | If true then you&#39;re logged in as a user. | [optional] [readonly] 
**email** | **str** | Your email address that we use to contact you. This is only visible to you. | [optional] 
**name** | **str** | The full name of the user (if any). | [optional] [readonly] 
**profile_url** | **str** | The URL for the full profile of the user. | [optional] [readonly] 
**self_url** | **str** |  | [optional] [readonly] 
**slug** | **str** |  | [optional] [readonly] 
**slug_perm** | **str** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.user_brief import UserBrief

# TODO update the JSON string below
json = "{}"
# create an instance of UserBrief from a JSON string
user_brief_instance = UserBrief.from_json(json)
# print the JSON string representation of the object
print(UserBrief.to_json())

# convert the object into a dict
user_brief_dict = user_brief_instance.to_dict()
# create an instance of UserBrief from a dict
user_brief_from_dict = UserBrief.from_dict(user_brief_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


