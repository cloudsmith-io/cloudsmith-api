# EntitlementUsageMetrics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tokens** | [**CommonMetrics**](CommonMetrics.md) |  | [optional] 

## Example

```python
from cloudsmith_api.models.entitlement_usage_metrics import EntitlementUsageMetrics

# TODO update the JSON string below
json = "{}"
# create an instance of EntitlementUsageMetrics from a JSON string
entitlement_usage_metrics_instance = EntitlementUsageMetrics.from_json(json)
# print the JSON string representation of the object
print(EntitlementUsageMetrics.to_json())

# convert the object into a dict
entitlement_usage_metrics_dict = entitlement_usage_metrics_instance.to_dict()
# create an instance of EntitlementUsageMetrics from a dict
entitlement_usage_metrics_from_dict = EntitlementUsageMetrics.from_dict(entitlement_usage_metrics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


