# OrganizationPackageLicensePolicy


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_unknown_licenses** | **bool** |  | [optional] 
**created_at** | **datetime** |  | [optional] [readonly] 
**description** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**on_violation_quarantine** | **bool** |  | [optional] 
**package_query_string** | **str** |  | [optional] 
**slug_perm** | **str** |  | [optional] [readonly] 
**spdx_identifiers** | **List[str]** |  | [optional] 
**updated_at** | **datetime** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.organization_package_license_policy import OrganizationPackageLicensePolicy

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationPackageLicensePolicy from a JSON string
organization_package_license_policy_instance = OrganizationPackageLicensePolicy.from_json(json)
# print the JSON string representation of the object
print(OrganizationPackageLicensePolicy.to_json())

# convert the object into a dict
organization_package_license_policy_dict = organization_package_license_policy_instance.to_dict()
# create an instance of OrganizationPackageLicensePolicy from a dict
organization_package_license_policy_from_dict = OrganizationPackageLicensePolicy.from_dict(organization_package_license_policy_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


