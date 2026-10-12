# OrganizationTeam


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | A detailed description of the team. | [optional] 
**name** | **str** | A descriptive name for the team. | 
**slug** | **str** |  | [optional] 
**slug_perm** | **str** |  | [optional] [readonly] 
**visibility** | **str** |  | [optional] [default to 'Visible']

## Example

```python
from cloudsmith_api.models.organization_team import OrganizationTeam

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationTeam from a JSON string
organization_team_instance = OrganizationTeam.from_json(json)
# print the JSON string representation of the object
print(OrganizationTeam.to_json())

# convert the object into a dict
organization_team_dict = organization_team_instance.to_dict()
# create an instance of OrganizationTeam from a dict
organization_team_from_dict = OrganizationTeam.from_dict(organization_team_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


