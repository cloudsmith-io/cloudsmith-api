# Architecture


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**name** | **str** |  | 

## Example

```python
from cloudsmith_api.models.architecture import Architecture

# TODO update the JSON string below
json = "{}"
# create an instance of Architecture from a JSON string
architecture_instance = Architecture.from_json(json)
# print the JSON string representation of the object
print(Architecture.to_json())

# convert the object into a dict
architecture_dict = architecture_instance.to_dict()
# create an instance of Architecture from a dict
architecture_from_dict = Architecture.from_dict(architecture_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


