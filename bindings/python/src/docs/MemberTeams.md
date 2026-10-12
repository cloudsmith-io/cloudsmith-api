# MemberTeams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] [readonly] 
**role** | **str** |  | [optional] [readonly] [default to 'Manager']
**slug** | **str** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.member_teams import MemberTeams

# TODO update the JSON string below
json = "{}"
# create an instance of MemberTeams from a JSON string
member_teams_instance = MemberTeams.from_json(json)
# print the JSON string representation of the object
print(MemberTeams.to_json())

# convert the object into a dict
member_teams_dict = member_teams_instance.to_dict()
# create an instance of MemberTeams from a dict
member_teams_from_dict = MemberTeams.from_dict(member_teams_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


