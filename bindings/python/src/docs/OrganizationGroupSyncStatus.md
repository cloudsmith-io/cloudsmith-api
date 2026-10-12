# OrganizationGroupSyncStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**saml_group_sync_status** | **bool** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.organization_group_sync_status import OrganizationGroupSyncStatus

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationGroupSyncStatus from a JSON string
organization_group_sync_status_instance = OrganizationGroupSyncStatus.from_json(json)
# print the JSON string representation of the object
print(OrganizationGroupSyncStatus.to_json())

# convert the object into a dict
organization_group_sync_status_dict = organization_group_sync_status_instance.to_dict()
# create an instance of OrganizationGroupSyncStatus from a dict
organization_group_sync_status_from_dict = OrganizationGroupSyncStatus.from_dict(organization_group_sync_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


