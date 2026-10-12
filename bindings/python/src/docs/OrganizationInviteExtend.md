# OrganizationInviteExtend


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** | The email of the user to be invited. | [optional] 
**expires_at** | **datetime** |  | [optional] [readonly] 
**inviter** | **str** |  | [optional] [readonly] 
**inviter_url** | **str** |  | [optional] [readonly] 
**org** | **str** |  | [optional] [readonly] 
**role** | **str** | The role to be assigned to the invited user. | [optional] [default to 'Member']
**slug_perm** | **str** | The slug_perm of the invite to be extended. | [optional] [readonly] 
**teams** | [**List[OrganizationTeamInvite]**](OrganizationTeamInvite.md) |  | [optional] 
**user** | **str** | The slug of the user to be invited. | [optional] 
**user_url** | **str** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.organization_invite_extend import OrganizationInviteExtend

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationInviteExtend from a JSON string
organization_invite_extend_instance = OrganizationInviteExtend.from_json(json)
# print the JSON string representation of the object
print(OrganizationInviteExtend.to_json())

# convert the object into a dict
organization_invite_extend_dict = organization_invite_extend_instance.to_dict()
# create an instance of OrganizationInviteExtend from a dict
organization_invite_extend_from_dict = OrganizationInviteExtend.from_dict(organization_invite_extend_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


