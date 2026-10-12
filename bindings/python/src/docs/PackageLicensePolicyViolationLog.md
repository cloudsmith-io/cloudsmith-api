# PackageLicensePolicyViolationLog


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_at** | **datetime** |  | [optional] [readonly] 
**package** | [**PackageVulnerability**](PackageVulnerability.md) |  | 
**policy** | [**NestedLicensePolicy**](NestedLicensePolicy.md) |  | 
**reasons** | **List[str]** |  | 

## Example

```python
from cloudsmith_api.models.package_license_policy_violation_log import PackageLicensePolicyViolationLog

# TODO update the JSON string below
json = "{}"
# create an instance of PackageLicensePolicyViolationLog from a JSON string
package_license_policy_violation_log_instance = PackageLicensePolicyViolationLog.from_json(json)
# print the JSON string representation of the object
print(PackageLicensePolicyViolationLog.to_json())

# convert the object into a dict
package_license_policy_violation_log_dict = package_license_policy_violation_log_instance.to_dict()
# create an instance of PackageLicensePolicyViolationLog from a dict
package_license_policy_violation_log_from_dict = PackageLicensePolicyViolationLog.from_dict(package_license_policy_violation_log_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


