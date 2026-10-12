# OrganizationTeamMembers


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**members** | [**List[OrganizationTeamServiceMember]**](OrganizationTeamServiceMember.md) | The team members | 

## Example

```python
from cloudsmith_api.models.organization_team_members import OrganizationTeamMembers

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationTeamMembers from a JSON string
organization_team_members_instance = OrganizationTeamMembers.from_json(json)
# print the JSON string representation of the object
print(OrganizationTeamMembers.to_json())

# convert the object into a dict
organization_team_members_dict = organization_team_members_instance.to_dict()
# create an instance of OrganizationTeamMembers from a dict
organization_team_members_from_dict = OrganizationTeamMembers.from_dict(organization_team_members_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


