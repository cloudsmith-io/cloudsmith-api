# CommonBandwidthMetricsValue

Average bandwidth usage in the specified period, e.g. a day

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**display** | **str** | Bandwidth usage value | [optional] 
**units** | **str** | Unit of measurement e.g. bytes | [optional] 
**value** | **int** | Human readable version of display value | [optional] 

## Example

```python
from cloudsmith_api.models.common_bandwidth_metrics_value import CommonBandwidthMetricsValue

# TODO update the JSON string below
json = "{}"
# create an instance of CommonBandwidthMetricsValue from a JSON string
common_bandwidth_metrics_value_instance = CommonBandwidthMetricsValue.from_json(json)
# print the JSON string representation of the object
print(CommonBandwidthMetricsValue.to_json())

# convert the object into a dict
common_bandwidth_metrics_value_dict = common_bandwidth_metrics_value_instance.to_dict()
# create an instance of CommonBandwidthMetricsValue from a dict
common_bandwidth_metrics_value_from_dict = CommonBandwidthMetricsValue.from_dict(common_bandwidth_metrics_value_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


