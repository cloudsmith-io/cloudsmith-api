# OrganizationUsage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bandwidth_maximum** | **int** | The maximum allowed package delivery overage in GB for this product. | [optional] [readonly] 
**bandwidth_overage_limit** | **int** | The on-demand limit for package delivery usage (in GBs). | [optional] [readonly] 
**storage_maximum** | **int** | The maximum allowed artifact data overage in GB for this product. | [optional] [readonly] 
**storage_overage_limit** | **int** | The on-demand limit for artifact data usage (in GBs). | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.organization_usage import OrganizationUsage

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationUsage from a JSON string
organization_usage_instance = OrganizationUsage.from_json(json)
# print the JSON string representation of the object
print(OrganizationUsage.to_json())

# convert the object into a dict
organization_usage_dict = organization_usage_instance.to_dict()
# create an instance of OrganizationUsage from a dict
organization_usage_from_dict = OrganizationUsage.from_dict(organization_usage_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


