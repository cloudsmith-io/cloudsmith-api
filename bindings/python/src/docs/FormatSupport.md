# FormatSupport

A set of what the package format supports

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencies** | **bool** | If true the package format supports dependencies | 
**distributions** | **bool** | If true the package format supports distributions | 
**file_lists** | **bool** | If true the package format supports file lists | 
**filepaths** | **bool** | If true the package format supports filepaths | 
**metadata** | **bool** | If true the package format supports metadata | 
**upstreams** | [**FormatSupportUpstream**](FormatSupportUpstream.md) |  | 
**versioning** | **bool** | If true the package format supports versioning | 

## Example

```python
from cloudsmith_api.models.format_support import FormatSupport

# TODO update the JSON string below
json = "{}"
# create an instance of FormatSupport from a JSON string
format_support_instance = FormatSupport.from_json(json)
# print the JSON string representation of the object
print(FormatSupport.to_json())

# convert the object into a dict
format_support_dict = format_support_instance.to_dict()
# create an instance of FormatSupport from a dict
format_support_from_dict = FormatSupport.from_dict(format_support_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


