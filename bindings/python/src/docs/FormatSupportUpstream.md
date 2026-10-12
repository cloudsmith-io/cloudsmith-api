# FormatSupportUpstream

The upstream support for the package format

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auth_modes** | **List[str]** | The authentication modes supported by the upstream format | [optional] 
**cache_only** | **bool** | If true the upstream format supports cache-only mode. | [optional] 
**caching** | **bool** | If true the upstream format supports caching | [optional] 
**indexing** | **bool** | If true the upstream format supports indexing | [optional] 
**indexing_behavior** | **str** | The behavior of the upstream when indexing | [optional] 
**proxying** | **bool** | If true the upstream format supports proxying | [optional] 
**signature_verification** | **str** | The signature verification supported by the upstream format | [optional] 
**trust** | **bool** | If true the upstream format supports configurable trust levels (trusted vs untrusted) for upstream sources. | [optional] 

## Example

```python
from cloudsmith_api.models.format_support_upstream import FormatSupportUpstream

# TODO update the JSON string below
json = "{}"
# create an instance of FormatSupportUpstream from a JSON string
format_support_upstream_instance = FormatSupportUpstream.from_json(json)
# print the JSON string representation of the object
print(FormatSupportUpstream.to_json())

# convert the object into a dict
format_support_upstream_dict = format_support_upstream_instance.to_dict()
# create an instance of FormatSupportUpstream from a dict
format_support_upstream_from_dict = FormatSupportUpstream.from_dict(format_support_upstream_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


