# OrganizationInviteUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** | The role to be assigned to the invited user. | [optional] 

## Example

```python
from cloudsmith_api.models.organization_invite_update import OrganizationInviteUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationInviteUpdate from a JSON string
organization_invite_update_instance = OrganizationInviteUpdate.from_json(json)
# print the JSON string representation of the object
print(OrganizationInviteUpdate.to_json())

# convert the object into a dict
organization_invite_update_dict = organization_invite_update_instance.to_dict()
# create an instance of OrganizationInviteUpdate from a dict
organization_invite_update_from_dict = OrganizationInviteUpdate.from_dict(organization_invite_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


