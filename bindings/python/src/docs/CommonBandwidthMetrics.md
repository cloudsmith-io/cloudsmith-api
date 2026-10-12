# CommonBandwidthMetrics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**average** | [**CommonBandwidthMetricsValue**](CommonBandwidthMetricsValue.md) |  | 
**highest** | [**CommonBandwidthMetricsValue**](CommonBandwidthMetricsValue.md) |  | 
**lowest** | [**CommonBandwidthMetricsValue**](CommonBandwidthMetricsValue.md) |  | 
**total** | [**CommonBandwidthMetricsValue**](CommonBandwidthMetricsValue.md) |  | 

## Example

```python
from cloudsmith_api.models.common_bandwidth_metrics import CommonBandwidthMetrics

# TODO update the JSON string below
json = "{}"
# create an instance of CommonBandwidthMetrics from a JSON string
common_bandwidth_metrics_instance = CommonBandwidthMetrics.from_json(json)
# print the JSON string representation of the object
print(CommonBandwidthMetrics.to_json())

# convert the object into a dict
common_bandwidth_metrics_dict = common_bandwidth_metrics_instance.to_dict()
# create an instance of CommonBandwidthMetrics from a dict
common_bandwidth_metrics_from_dict = CommonBandwidthMetrics.from_dict(common_bandwidth_metrics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


