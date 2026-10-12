# Format


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Description of the package format | [optional] 
**distributions** | [**List[Distribution]**](Distribution.md) | The distributions supported by this package format | [optional] 
**extensions** | **List[str]** | A non-exhaustive list of extensions supported | [optional] 
**name** | **str** | Name for the package format | [optional] 
**premium** | **bool** | If true the package format is a premium-only feature | [optional] 
**premium_plan_id** | **str** | The minimum plan id required for this package format | [optional] 
**premium_plan_name** | **str** | The minimum plan name required for this package format | [optional] 
**slug** | **str** | Slug for the package format | [optional] 
**supports** | [**FormatSupport**](FormatSupport.md) |  | [optional] 

## Example

```python
from cloudsmith_api.models.format import Format

# TODO update the JSON string below
json = "{}"
# create an instance of Format from a JSON string
format_instance = Format.from_json(json)
# print the JSON string representation of the object
print(Format.to_json())

# convert the object into a dict
format_dict = format_instance.to_dict()
# create an instance of Format from a dict
format_from_dict = Format.from_dict(format_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


