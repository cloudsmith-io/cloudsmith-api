# UsageFieldset


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**display** | [**UsageLimits**](UsageLimits.md) |  | 
**raw** | [**UsageLimitsRaw**](UsageLimitsRaw.md) |  | 

## Example

```python
from cloudsmith_api.models.usage_fieldset import UsageFieldset

# TODO update the JSON string below
json = "{}"
# create an instance of UsageFieldset from a JSON string
usage_fieldset_instance = UsageFieldset.from_json(json)
# print the JSON string representation of the object
print(UsageFieldset.to_json())

# convert the object into a dict
usage_fieldset_dict = usage_fieldset_instance.to_dict()
# create an instance of UsageFieldset from a dict
usage_fieldset_from_dict = UsageFieldset.from_dict(usage_fieldset_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


