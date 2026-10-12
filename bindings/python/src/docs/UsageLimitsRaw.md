# UsageLimitsRaw


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bandwidth** | [**AllocatedLimitRaw**](AllocatedLimitRaw.md) |  | 
**storage** | [**StorageAllocatedLimitRaw**](StorageAllocatedLimitRaw.md) |  | 

## Example

```python
from cloudsmith_api.models.usage_limits_raw import UsageLimitsRaw

# TODO update the JSON string below
json = "{}"
# create an instance of UsageLimitsRaw from a JSON string
usage_limits_raw_instance = UsageLimitsRaw.from_json(json)
# print the JSON string representation of the object
print(UsageLimitsRaw.to_json())

# convert the object into a dict
usage_limits_raw_dict = usage_limits_raw_instance.to_dict()
# create an instance of UsageLimitsRaw from a dict
usage_limits_raw_from_dict = UsageLimitsRaw.from_dict(usage_limits_raw_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


