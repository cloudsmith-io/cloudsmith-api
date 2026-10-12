# OrganizationUsageUpdateRequestPatch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_open_source_overage** | **bool** |  | [optional] 
**bandwidth_overage_limit** | **int** |  | [optional] 
**storage_overage_limit** | **int** |  | [optional] 

## Example

```python
from cloudsmith_api.models.organization_usage_update_request_patch import OrganizationUsageUpdateRequestPatch

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationUsageUpdateRequestPatch from a JSON string
organization_usage_update_request_patch_instance = OrganizationUsageUpdateRequestPatch.from_json(json)
# print the JSON string representation of the object
print(OrganizationUsageUpdateRequestPatch.to_json())

# convert the object into a dict
organization_usage_update_request_patch_dict = organization_usage_update_request_patch_instance.to_dict()
# create an instance of OrganizationUsageUpdateRequestPatch from a dict
organization_usage_update_request_patch_from_dict = OrganizationUsageUpdateRequestPatch.from_dict(organization_usage_update_request_patch_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


