# QuotaHistory


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**history** | [**List[History]**](History.md) |  | 

## Example

```python
from cloudsmith_api.models.quota_history import QuotaHistory

# TODO update the JSON string below
json = "{}"
# create an instance of QuotaHistory from a JSON string
quota_history_instance = QuotaHistory.from_json(json)
# print the JSON string representation of the object
print(QuotaHistory.to_json())

# convert the object into a dict
quota_history_dict = quota_history_instance.to_dict()
# create an instance of QuotaHistory from a dict
quota_history_from_dict = QuotaHistory.from_dict(quota_history_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


