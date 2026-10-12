# PackageUsageMetrics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**packages** | [**CommonMetrics**](CommonMetrics.md) |  | 

## Example

```python
from cloudsmith_api.models.package_usage_metrics import PackageUsageMetrics

# TODO update the JSON string below
json = "{}"
# create an instance of PackageUsageMetrics from a JSON string
package_usage_metrics_instance = PackageUsageMetrics.from_json(json)
# print the JSON string representation of the object
print(PackageUsageMetrics.to_json())

# convert the object into a dict
package_usage_metrics_dict = package_usage_metrics_instance.to_dict()
# create an instance of PackageUsageMetrics from a dict
package_usage_metrics_from_dict = PackageUsageMetrics.from_dict(package_usage_metrics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


