# CommonDownloadsMetrics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**average** | [**CommonDownloadsMetricsValue**](CommonDownloadsMetricsValue.md) |  | 
**highest** | [**CommonDownloadsMetricsValue**](CommonDownloadsMetricsValue.md) |  | 
**lowest** | [**CommonDownloadsMetricsValue**](CommonDownloadsMetricsValue.md) |  | 
**total** | [**CommonDownloadsMetricsValue**](CommonDownloadsMetricsValue.md) |  | 

## Example

```python
from cloudsmith_api.models.common_downloads_metrics import CommonDownloadsMetrics

# TODO update the JSON string below
json = "{}"
# create an instance of CommonDownloadsMetrics from a JSON string
common_downloads_metrics_instance = CommonDownloadsMetrics.from_json(json)
# print the JSON string representation of the object
print(CommonDownloadsMetrics.to_json())

# convert the object into a dict
common_downloads_metrics_dict = common_downloads_metrics_instance.to_dict()
# create an instance of CommonDownloadsMetrics from a dict
common_downloads_metrics_from_dict = CommonDownloadsMetrics.from_dict(common_downloads_metrics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


