# OrganizationTeamServiceMember

The team members

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** |  | 
**user** | **str** |  | 
**user_kind** | **str** |  | [optional] [default to 'User']

## Example

```python
from cloudsmith_api.models.organization_team_service_member import OrganizationTeamServiceMember

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationTeamServiceMember from a JSON string
organization_team_service_member_instance = OrganizationTeamServiceMember.from_json(json)
# print the JSON string representation of the object
print(OrganizationTeamServiceMember.to_json())

# convert the object into a dict
organization_team_service_member_dict = organization_team_service_member_instance.to_dict()
# create an instance of OrganizationTeamServiceMember from a dict
organization_team_service_member_from_dict = OrganizationTeamServiceMember.from_dict(organization_team_service_member_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


