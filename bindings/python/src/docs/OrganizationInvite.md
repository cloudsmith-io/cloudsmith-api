# OrganizationInvite


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** | The email of the user to be invited. | [optional] 
**expires_at** | **datetime** |  | [optional] [readonly] 
**inviter** | **str** |  | [optional] [readonly] 
**inviter_url** | **str** |  | [optional] [readonly] 
**org** | **str** |  | [optional] [readonly] 
**role** | **str** | The role to be assigned to the invited user. | [optional] 
**slug_perm** | **str** |  | [optional] [readonly] 
**teams** | [**List[OrganizationTeamInvite]**](OrganizationTeamInvite.md) |  | [optional] 
**user** | **str** | The slug of the user to be invited. | [optional] 
**user_url** | **str** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.organization_invite import OrganizationInvite

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationInvite from a JSON string
organization_invite_instance = OrganizationInvite.from_json(json)
# print the JSON string representation of the object
print(OrganizationInvite.to_json())

# convert the object into a dict
organization_invite_dict = organization_invite_instance.to_dict()
# create an instance of OrganizationInvite from a dict
organization_invite_from_dict = OrganizationInvite.from_dict(organization_invite_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


