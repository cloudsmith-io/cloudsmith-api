# UsageRaw


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit** | **int** |  | [optional] 
**percentage** | **decimal.Decimal** |  | [optional] 
**used** | **int** |  | [optional] 

## Example

```python
from cloudsmith_api.models.usage_raw import UsageRaw

# TODO update the JSON string below
json = "{}"
# create an instance of UsageRaw from a JSON string
usage_raw_instance = UsageRaw.from_json(json)
# print the JSON string representation of the object
print(UsageRaw.to_json())

# convert the object into a dict
usage_raw_dict = usage_raw_instance.to_dict()
# create an instance of UsageRaw from a dict
usage_raw_from_dict = UsageRaw.from_dict(usage_raw_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


