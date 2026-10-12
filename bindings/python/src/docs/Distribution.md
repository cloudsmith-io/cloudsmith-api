# Distribution

The distributions supported by this package format

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**self_url** | **str** |  | [optional] [readonly] 
**slug** | **str** | The slug identifier for this distribution | [optional] [readonly] 
**variants** | **str** |  | [optional] 

## Example

```python
from cloudsmith_api.models.distribution import Distribution

# TODO update the JSON string below
json = "{}"
# create an instance of Distribution from a JSON string
distribution_instance = Distribution.from_json(json)
# print the JSON string representation of the object
print(Distribution.to_json())

# convert the object into a dict
distribution_dict = distribution_instance.to_dict()
# create an instance of Distribution from a dict
distribution_from_dict = Distribution.from_dict(distribution_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


