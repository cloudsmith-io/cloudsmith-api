# ResourcesRateCheck


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resources** | [**Dict[str, RateCheck]**](RateCheck.md) | Rate limit values per resource | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.resources_rate_check import ResourcesRateCheck

# TODO update the JSON string below
json = "{}"
# create an instance of ResourcesRateCheck from a JSON string
resources_rate_check_instance = ResourcesRateCheck.from_json(json)
# print the JSON string representation of the object
print(ResourcesRateCheck.to_json())

# convert the object into a dict
resources_rate_check_dict = resources_rate_check_instance.to_dict()
# create an instance of ResourcesRateCheck from a dict
resources_rate_check_from_dict = ResourcesRateCheck.from_dict(resources_rate_check_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


