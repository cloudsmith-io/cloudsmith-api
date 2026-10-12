# StorageRegion


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **str** | Name of the storage region | 
**slug** | **str** | Slug for the storage region | 

## Example

```python
from cloudsmith_api.models.storage_region import StorageRegion

# TODO update the JSON string below
json = "{}"
# create an instance of StorageRegion from a JSON string
storage_region_instance = StorageRegion.from_json(json)
# print the JSON string representation of the object
print(StorageRegion.to_json())

# convert the object into a dict
storage_region_dict = storage_region_instance.to_dict()
# create an instance of StorageRegion from a dict
storage_region_from_dict = StorageRegion.from_dict(storage_region_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


