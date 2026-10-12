# UserProfile


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**company** | **str** |  | [optional] 
**first_name** | **str** |  | [optional] 
**job_title** | **str** |  | [optional] 
**joined_at** | **datetime** |  | [optional] 
**last_name** | **str** |  | [optional] 
**name** | **str** |  | [optional] [readonly] 
**slug** | **str** |  | [optional] [readonly] 
**slug_perm** | **str** |  | [optional] [readonly] 
**tagline** | **str** | Your tagline is a sentence about you. Make it funny. Make it professional. Either way, it&#39;s public and it represents who you are. | [optional] 
**url** | **str** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.user_profile import UserProfile

# TODO update the JSON string below
json = "{}"
# create an instance of UserProfile from a JSON string
user_profile_instance = UserProfile.from_json(json)
# print the JSON string representation of the object
print(UserProfile.to_json())

# convert the object into a dict
user_profile_dict = user_profile_instance.to_dict()
# create an instance of UserProfile from a dict
user_profile_from_dict = UserProfile.from_dict(user_profile_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


