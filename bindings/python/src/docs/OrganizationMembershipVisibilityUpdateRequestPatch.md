# OrganizationMembershipVisibilityUpdateRequestPatch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**visibility** | **str** |  | [optional] [default to 'Public']

## Example

```python
from cloudsmith_api.models.organization_membership_visibility_update_request_patch import OrganizationMembershipVisibilityUpdateRequestPatch

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationMembershipVisibilityUpdateRequestPatch from a JSON string
organization_membership_visibility_update_request_patch_instance = OrganizationMembershipVisibilityUpdateRequestPatch.from_json(json)
# print the JSON string representation of the object
print(OrganizationMembershipVisibilityUpdateRequestPatch.to_json())

# convert the object into a dict
organization_membership_visibility_update_request_patch_dict = organization_membership_visibility_update_request_patch_instance.to_dict()
# create an instance of OrganizationMembershipVisibilityUpdateRequestPatch from a dict
organization_membership_visibility_update_request_patch_from_dict = OrganizationMembershipVisibilityUpdateRequestPatch.from_dict(organization_membership_visibility_update_request_patch_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


