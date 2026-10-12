# OrgsUpdateUsageLimits200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_open_source_overage** | **bool** | Whether on-demand open source overage is allowed. | [optional] 
**bandwidth_overage_limit** | **int** | Effective bandwidth overage limit in GB. | [optional] 
**storage_overage_limit** | **int** | Effective storage overage limit in GB. | [optional] 

## Example

```python
from cloudsmith_api.models.orgs_update_usage_limits200_response import OrgsUpdateUsageLimits200Response

# TODO update the JSON string below
json = "{}"
# create an instance of OrgsUpdateUsageLimits200Response from a JSON string
orgs_update_usage_limits200_response_instance = OrgsUpdateUsageLimits200Response.from_json(json)
# print the JSON string representation of the object
print(OrgsUpdateUsageLimits200Response.to_json())

# convert the object into a dict
orgs_update_usage_limits200_response_dict = orgs_update_usage_limits200_response_instance.to_dict()
# create an instance of OrgsUpdateUsageLimits200Response from a dict
orgs_update_usage_limits200_response_from_dict = OrgsUpdateUsageLimits200Response.from_dict(orgs_update_usage_limits200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


