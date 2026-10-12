# OrganizationPackageLicensePolicyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_unknown_licenses** | **bool** |  | [optional] 
**description** | **str** |  | [optional] 
**name** | **str** |  | 
**on_violation_quarantine** | **bool** |  | [optional] 
**package_query_string** | **str** |  | [optional] 
**spdx_identifiers** | **List[str]** |  | 

## Example

```python
from cloudsmith_api.models.organization_package_license_policy_request import OrganizationPackageLicensePolicyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationPackageLicensePolicyRequest from a JSON string
organization_package_license_policy_request_instance = OrganizationPackageLicensePolicyRequest.from_json(json)
# print the JSON string representation of the object
print(OrganizationPackageLicensePolicyRequest.to_json())

# convert the object into a dict
organization_package_license_policy_request_dict = organization_package_license_policy_request_instance.to_dict()
# create an instance of OrganizationPackageLicensePolicyRequest from a dict
organization_package_license_policy_request_from_dict = OrganizationPackageLicensePolicyRequest.from_dict(organization_package_license_policy_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


