# StorageAllocatedLimit


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configured** | **str** |  | [optional] 
**peak** | **str** |  | [optional] 
**percentage_used** | **str** |  | [optional] 
**plan_limit** | **str** |  | [optional] 
**used** | **str** |  | [optional] 
**used_pre_deduplication** | **str** |  | [optional] 

## Example

```python
from cloudsmith_api.models.storage_allocated_limit import StorageAllocatedLimit

# TODO update the JSON string below
json = "{}"
# create an instance of StorageAllocatedLimit from a JSON string
storage_allocated_limit_instance = StorageAllocatedLimit.from_json(json)
# print the JSON string representation of the object
print(StorageAllocatedLimit.to_json())

# convert the object into a dict
storage_allocated_limit_dict = storage_allocated_limit_instance.to_dict()
# create an instance of StorageAllocatedLimit from a dict
storage_allocated_limit_from_dict = StorageAllocatedLimit.from_dict(storage_allocated_limit_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


