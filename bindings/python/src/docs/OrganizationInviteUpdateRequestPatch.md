# OrganizationInviteUpdateRequestPatch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** | The role to be assigned to the invited user. | [optional] [default to 'Member']

## Example

```python
from cloudsmith_api.models.organization_invite_update_request_patch import OrganizationInviteUpdateRequestPatch

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationInviteUpdateRequestPatch from a JSON string
organization_invite_update_request_patch_instance = OrganizationInviteUpdateRequestPatch.from_json(json)
# print the JSON string representation of the object
print(OrganizationInviteUpdateRequestPatch.to_json())

# convert the object into a dict
organization_invite_update_request_patch_dict = organization_invite_update_request_patch_instance.to_dict()
# create an instance of OrganizationInviteUpdateRequestPatch from a dict
organization_invite_update_request_patch_from_dict = OrganizationInviteUpdateRequestPatch.from_dict(organization_invite_update_request_patch_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


