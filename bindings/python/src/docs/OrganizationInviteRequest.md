# OrganizationInviteRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** | The email of the user to be invited. | [optional] 
**role** | **str** | The role to be assigned to the invited user. | [optional] [default to 'Member']
**teams** | [**List[OrganizationTeamInvite]**](OrganizationTeamInvite.md) |  | [optional] 
**user** | **str** | The slug of the user to be invited. | [optional] 

## Example

```python
from cloudsmith_api.models.organization_invite_request import OrganizationInviteRequest

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationInviteRequest from a JSON string
organization_invite_request_instance = OrganizationInviteRequest.from_json(json)
# print the JSON string representation of the object
print(OrganizationInviteRequest.to_json())

# convert the object into a dict
organization_invite_request_dict = organization_invite_request_instance.to_dict()
# create an instance of OrganizationInviteRequest from a dict
organization_invite_request_from_dict = OrganizationInviteRequest.from_dict(organization_invite_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


