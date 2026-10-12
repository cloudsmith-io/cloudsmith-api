# OrganizationMembershipRoleUpdateRequestPatch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** |  | [optional] 

## Example

```python
from cloudsmith_api.models.organization_membership_role_update_request_patch import OrganizationMembershipRoleUpdateRequestPatch

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationMembershipRoleUpdateRequestPatch from a JSON string
organization_membership_role_update_request_patch_instance = OrganizationMembershipRoleUpdateRequestPatch.from_json(json)
# print the JSON string representation of the object
print(OrganizationMembershipRoleUpdateRequestPatch.to_json())

# convert the object into a dict
organization_membership_role_update_request_patch_dict = organization_membership_role_update_request_patch_instance.to_dict()
# create an instance of OrganizationMembershipRoleUpdateRequestPatch from a dict
organization_membership_role_update_request_patch_from_dict = OrganizationMembershipRoleUpdateRequestPatch.from_dict(organization_membership_role_update_request_patch_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


