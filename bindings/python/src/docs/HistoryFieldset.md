# HistoryFieldset


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downloaded** | [**Usage**](Usage.md) |  | [optional] 
**storage_used** | [**StorageUsage**](StorageUsage.md) |  | [optional] 
**uploaded** | [**Usage**](Usage.md) |  | [optional] 

## Example

```python
from cloudsmith_api.models.history_fieldset import HistoryFieldset

# TODO update the JSON string below
json = "{}"
# create an instance of HistoryFieldset from a JSON string
history_fieldset_instance = HistoryFieldset.from_json(json)
# print the JSON string representation of the object
print(HistoryFieldset.to_json())

# convert the object into a dict
history_fieldset_dict = history_fieldset_instance.to_dict()
# create an instance of HistoryFieldset from a dict
history_fieldset_from_dict = HistoryFieldset.from_dict(history_fieldset_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


