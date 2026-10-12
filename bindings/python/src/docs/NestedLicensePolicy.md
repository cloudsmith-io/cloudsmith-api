# NestedLicensePolicy


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_unknown_licenses** | **bool** |  | [optional] [readonly] 
**created_at** | **datetime** |  | [optional] [readonly] 
**description** | **str** |  | [optional] [readonly] 
**name** | **str** |  | [optional] [readonly] 
**on_violation_quarantine** | **bool** |  | [optional] [readonly] 
**package_query_string** | **str** |  | [optional] [readonly] 
**slug_perm** | **str** |  | [optional] [readonly] 
**spdx_identifiers** | **List[str]** |  | [optional] 
**updated_at** | **datetime** |  | [optional] [readonly] 
**url** | **str** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.nested_license_policy import NestedLicensePolicy

# TODO update the JSON string below
json = "{}"
# create an instance of NestedLicensePolicy from a JSON string
nested_license_policy_instance = NestedLicensePolicy.from_json(json)
# print the JSON string representation of the object
print(NestedLicensePolicy.to_json())

# convert the object into a dict
nested_license_policy_dict = nested_license_policy_instance.to_dict()
# create an instance of NestedLicensePolicy from a dict
nested_license_policy_from_dict = NestedLicensePolicy.from_dict(nested_license_policy_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


