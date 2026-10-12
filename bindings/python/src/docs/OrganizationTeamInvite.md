# OrganizationTeamInvite


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** | The role to be assigned to the invited user in the team. | [optional] 
**team** | **str** | The team identifier (slug). | [optional] 

## Example

```python
from cloudsmith_api.models.organization_team_invite import OrganizationTeamInvite

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationTeamInvite from a JSON string
organization_team_invite_instance = OrganizationTeamInvite.from_json(json)
# print the JSON string representation of the object
print(OrganizationTeamInvite.to_json())

# convert the object into a dict
organization_team_invite_dict = organization_team_invite_instance.to_dict()
# create an instance of OrganizationTeamInvite from a dict
organization_team_invite_from_dict = OrganizationTeamInvite.from_dict(organization_team_invite_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


