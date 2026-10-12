# OrganizationMembershipRoleUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** |  | [optional] [readonly] 
**has_two_factor** | **bool** |  | [optional] [readonly] 
**joined_at** | **datetime** |  | [optional] [readonly] 
**last_login_at** | **datetime** |  | [optional] [readonly] 
**last_login_method** | **str** |  | [optional] [readonly] [default to 'Unknown']
**role** | **str** |  | [optional] [default to 'Owner']
**user** | **str** |  | [optional] [readonly] 
**user_id** | **str** |  | [optional] [readonly] 
**user_name** | **str** |  | [optional] [readonly] 
**user_url** | **str** |  | [optional] [readonly] 
**visibility** | **str** |  | [optional] [readonly] [default to 'Public']

## Example

```python
from cloudsmith_api.models.organization_membership_role_update import OrganizationMembershipRoleUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationMembershipRoleUpdate from a JSON string
organization_membership_role_update_instance = OrganizationMembershipRoleUpdate.from_json(json)
# print the JSON string representation of the object
print(OrganizationMembershipRoleUpdate.to_json())

# convert the object into a dict
organization_membership_role_update_dict = organization_membership_role_update_instance.to_dict()
# create an instance of OrganizationMembershipRoleUpdate from a dict
organization_membership_role_update_from_dict = OrganizationMembershipRoleUpdate.from_dict(organization_membership_role_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


