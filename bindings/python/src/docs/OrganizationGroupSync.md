# OrganizationGroupSync


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idp_key** | **str** |  | [optional] 
**idp_value** | **str** |  | [optional] 
**role** | **str** |  | [optional] 
**slug_perm** | **str** |  | [optional] [readonly] 
**team** | **str** |  | [optional] 

## Example

```python
from cloudsmith_api.models.organization_group_sync import OrganizationGroupSync

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationGroupSync from a JSON string
organization_group_sync_instance = OrganizationGroupSync.from_json(json)
# print the JSON string representation of the object
print(OrganizationGroupSync.to_json())

# convert the object into a dict
organization_group_sync_dict = organization_group_sync_instance.to_dict()
# create an instance of OrganizationGroupSync from a dict
organization_group_sync_from_dict = OrganizationGroupSync.from_dict(organization_group_sync_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


