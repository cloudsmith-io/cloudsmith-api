# OrganizationTeamRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | A detailed description of the team. | [optional] 
**name** | **str** | A descriptive name for the team. | 
**slug** | **str** |  | [optional] 
**visibility** | **str** |  | [optional] [default to 'Visible']

## Example

```python
from cloudsmith_api.models.organization_team_request import OrganizationTeamRequest

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationTeamRequest from a JSON string
organization_team_request_instance = OrganizationTeamRequest.from_json(json)
# print the JSON string representation of the object
print(OrganizationTeamRequest.to_json())

# convert the object into a dict
organization_team_request_dict = organization_team_request_instance.to_dict()
# create an instance of OrganizationTeamRequest from a dict
organization_team_request_from_dict = OrganizationTeamRequest.from_dict(organization_team_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


