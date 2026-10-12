# CommonMetrics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **int** | Number of packages with at least 1 download | [optional] 
**bandwidth** | [**CommonBandwidthMetrics**](CommonBandwidthMetrics.md) |  | 
**downloads** | [**CommonDownloadsMetrics**](CommonDownloadsMetrics.md) |  | 
**inactive** | **int** | Packages with zero downloads | [optional] 
**total** | **int** | Total number of packages in repo | [optional] 

## Example

```python
from cloudsmith_api.models.common_metrics import CommonMetrics

# TODO update the JSON string below
json = "{}"
# create an instance of CommonMetrics from a JSON string
common_metrics_instance = CommonMetrics.from_json(json)
# print the JSON string representation of the object
print(CommonMetrics.to_json())

# convert the object into a dict
common_metrics_dict = common_metrics_instance.to_dict()
# create an instance of CommonMetrics from a dict
common_metrics_from_dict = CommonMetrics.from_dict(common_metrics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


