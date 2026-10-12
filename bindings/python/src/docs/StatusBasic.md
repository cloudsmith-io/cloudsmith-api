# StatusBasic


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**detail** | **str** | The message describing the state of the API. | [optional] [readonly] 
**version** | **str** | The current version for the Cloudsmith service. | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.status_basic import StatusBasic

# TODO update the JSON string below
json = "{}"
# create an instance of StatusBasic from a JSON string
status_basic_instance = StatusBasic.from_json(json)
# print the JSON string representation of the object
print(StatusBasic.to_json())

# convert the object into a dict
status_basic_dict = status_basic_instance.to_dict()
# create an instance of StatusBasic from a dict
status_basic_from_dict = StatusBasic.from_dict(status_basic_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


