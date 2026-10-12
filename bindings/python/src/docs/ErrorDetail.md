# ErrorDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | A machine-readable code for the error. Only set for validation errors. | [optional] 
**detail** | **str** | An extended message for the response. | [optional] 
**fields** | **Dict[str, List[str]]** | A Dictionary of related errors where key: Field and value: Array of Errors related to that field | [optional] 

## Example

```python
from cloudsmith_api.models.error_detail import ErrorDetail

# TODO update the JSON string below
json = "{}"
# create an instance of ErrorDetail from a JSON string
error_detail_instance = ErrorDetail.from_json(json)
# print the JSON string representation of the object
print(ErrorDetail.to_json())

# convert the object into a dict
error_detail_dict = error_detail_instance.to_dict()
# create an instance of ErrorDetail from a dict
error_detail_from_dict = ErrorDetail.from_dict(error_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


