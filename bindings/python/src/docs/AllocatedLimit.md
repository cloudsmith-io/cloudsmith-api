# AllocatedLimit


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configured** | **str** |  | [optional] 
**percentage_used** | **str** |  | [optional] 
**plan_limit** | **str** |  | [optional] 
**used** | **str** |  | [optional] 

## Example

```python
from cloudsmith_api.models.allocated_limit import AllocatedLimit

# TODO update the JSON string below
json = "{}"
# create an instance of AllocatedLimit from a JSON string
allocated_limit_instance = AllocatedLimit.from_json(json)
# print the JSON string representation of the object
print(AllocatedLimit.to_json())

# convert the object into a dict
allocated_limit_dict = allocated_limit_instance.to_dict()
# create an instance of AllocatedLimit from a dict
allocated_limit_from_dict = AllocatedLimit.from_dict(allocated_limit_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


