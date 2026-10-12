# StorageUsage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit** | **str** |  | [optional] 
**peak** | **str** |  | [optional] 
**percentage** | **str** |  | [optional] 
**used** | **str** |  | [optional] 

## Example

```python
from cloudsmith_api.models.storage_usage import StorageUsage

# TODO update the JSON string below
json = "{}"
# create an instance of StorageUsage from a JSON string
storage_usage_instance = StorageUsage.from_json(json)
# print the JSON string representation of the object
print(StorageUsage.to_json())

# convert the object into a dict
storage_usage_dict = storage_usage_instance.to_dict()
# create an instance of StorageUsage from a dict
storage_usage_from_dict = StorageUsage.from_dict(storage_usage_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


