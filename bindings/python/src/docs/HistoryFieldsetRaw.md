# HistoryFieldsetRaw


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downloaded** | [**UsageRaw**](UsageRaw.md) |  | [optional] 
**storage_used** | [**StorageUsageRaw**](StorageUsageRaw.md) |  | [optional] 
**uploaded** | [**UsageRaw**](UsageRaw.md) |  | [optional] 

## Example

```python
from cloudsmith_api.models.history_fieldset_raw import HistoryFieldsetRaw

# TODO update the JSON string below
json = "{}"
# create an instance of HistoryFieldsetRaw from a JSON string
history_fieldset_raw_instance = HistoryFieldsetRaw.from_json(json)
# print the JSON string representation of the object
print(HistoryFieldsetRaw.to_json())

# convert the object into a dict
history_fieldset_raw_dict = history_fieldset_raw_instance.to_dict()
# create an instance of HistoryFieldsetRaw from a dict
history_fieldset_raw_from_dict = HistoryFieldsetRaw.from_dict(history_fieldset_raw_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


