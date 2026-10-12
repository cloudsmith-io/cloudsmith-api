# OrganizationGroupSyncRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idp_key** | **str** |  | [optional] 
**idp_value** | **str** |  | [optional] 
**organization** | **str** |  | [optional] 
**role** | **str** |  | [optional] 
**team** | **str** |  | [optional] 

## Example

```python
from cloudsmith_api.models.organization_group_sync_request import OrganizationGroupSyncRequest

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationGroupSyncRequest from a JSON string
organization_group_sync_request_instance = OrganizationGroupSyncRequest.from_json(json)
# print the JSON string representation of the object
print(OrganizationGroupSyncRequest.to_json())

# convert the object into a dict
organization_group_sync_request_dict = organization_group_sync_request_instance.to_dict()
# create an instance of OrganizationGroupSyncRequest from a dict
organization_group_sync_request_from_dict = OrganizationGroupSyncRequest.from_dict(organization_group_sync_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


