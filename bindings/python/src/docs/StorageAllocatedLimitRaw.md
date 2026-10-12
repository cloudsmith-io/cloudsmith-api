# StorageAllocatedLimitRaw


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configured** | **int** |  | [optional] 
**peak** | **int** |  | [optional] 
**percentage_used** | **decimal.Decimal** |  | [optional] 
**plan_limit** | **int** |  | [optional] 
**used** | **int** |  | [optional] 
**used_pre_deduplication** | **int** |  | [optional] 

## Example

```python
from cloudsmith_api.models.storage_allocated_limit_raw import StorageAllocatedLimitRaw

# TODO update the JSON string below
json = "{}"
# create an instance of StorageAllocatedLimitRaw from a JSON string
storage_allocated_limit_raw_instance = StorageAllocatedLimitRaw.from_json(json)
# print the JSON string representation of the object
print(StorageAllocatedLimitRaw.to_json())

# convert the object into a dict
storage_allocated_limit_raw_dict = storage_allocated_limit_raw_instance.to_dict()
# create an instance of StorageAllocatedLimitRaw from a dict
storage_allocated_limit_raw_from_dict = StorageAllocatedLimitRaw.from_dict(storage_allocated_limit_raw_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


