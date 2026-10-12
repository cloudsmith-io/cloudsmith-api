# StorageUsageRaw


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit** | **int** |  | [optional] 
**peak** | **int** |  | [optional] 
**percentage** | **decimal.Decimal** |  | [optional] 
**used** | **int** |  | [optional] 

## Example

```python
from cloudsmith_api.models.storage_usage_raw import StorageUsageRaw

# TODO update the JSON string below
json = "{}"
# create an instance of StorageUsageRaw from a JSON string
storage_usage_raw_instance = StorageUsageRaw.from_json(json)
# print the JSON string representation of the object
print(StorageUsageRaw.to_json())

# convert the object into a dict
storage_usage_raw_dict = storage_usage_raw_instance.to_dict()
# create an instance of StorageUsageRaw from a dict
storage_usage_raw_from_dict = StorageUsageRaw.from_dict(storage_usage_raw_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


