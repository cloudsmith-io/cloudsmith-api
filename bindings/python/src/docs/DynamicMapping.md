# DynamicMapping

The dynamic mappings of `mapping_claim` values to service accounts. Cannot be provided if `service_accounts` is also set.  Note: This field and the dynamic mappings feature are still in early access. Breaking changes are possible as we receive feedback on this feature.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**claim_value** | **str** | The OIDC token claim value that must be present in the token for it to successfully authenticate as the mapped &#x60;service_account&#x60;.  Note: This field and the dynamic mappings feature are still in early access. Breaking changes are possible as we receive feedback on this feature. | 
**service_account** | **str** | The service account associated with the provider setting and &#x60;claim_value&#x60;  Note: This field and the dynamic mappings feature are still in early access. Breaking changes are possible as we receive feedback on this feature. | 

## Example

```python
from cloudsmith_api.models.dynamic_mapping import DynamicMapping

# TODO update the JSON string below
json = "{}"
# create an instance of DynamicMapping from a JSON string
dynamic_mapping_instance = DynamicMapping.from_json(json)
# print the JSON string representation of the object
print(DynamicMapping.to_json())

# convert the object into a dict
dynamic_mapping_dict = dynamic_mapping_instance.to_dict()
# create an instance of DynamicMapping from a dict
dynamic_mapping_from_dict = DynamicMapping.from_dict(dynamic_mapping_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


