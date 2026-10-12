# AllocatedLimitRaw


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configured** | **int** |  | [optional] 
**percentage_used** | **decimal.Decimal** |  | [optional] 
**plan_limit** | **int** |  | [optional] 
**used** | **int** |  | [optional] 

## Example

```python
from cloudsmith_api.models.allocated_limit_raw import AllocatedLimitRaw

# TODO update the JSON string below
json = "{}"
# create an instance of AllocatedLimitRaw from a JSON string
allocated_limit_raw_instance = AllocatedLimitRaw.from_json(json)
# print the JSON string representation of the object
print(AllocatedLimitRaw.to_json())

# convert the object into a dict
allocated_limit_raw_dict = allocated_limit_raw_instance.to_dict()
# create an instance of AllocatedLimitRaw from a dict
allocated_limit_raw_from_dict = AllocatedLimitRaw.from_dict(allocated_limit_raw_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


