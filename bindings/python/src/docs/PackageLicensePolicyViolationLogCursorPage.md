# PackageLicensePolicyViolationLogCursorPage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[PackageLicensePolicyViolationLog]**](PackageLicensePolicyViolationLog.md) |  | 

## Example

```python
from cloudsmith_api.models.package_license_policy_violation_log_cursor_page import PackageLicensePolicyViolationLogCursorPage

# TODO update the JSON string below
json = "{}"
# create an instance of PackageLicensePolicyViolationLogCursorPage from a JSON string
package_license_policy_violation_log_cursor_page_instance = PackageLicensePolicyViolationLogCursorPage.from_json(json)
# print the JSON string representation of the object
print(PackageLicensePolicyViolationLogCursorPage.to_json())

# convert the object into a dict
package_license_policy_violation_log_cursor_page_dict = package_license_policy_violation_log_cursor_page_instance.to_dict()
# create an instance of PackageLicensePolicyViolationLogCursorPage from a dict
package_license_policy_violation_log_cursor_page_from_dict = PackageLicensePolicyViolationLogCursorPage.from_dict(package_license_policy_violation_log_cursor_page_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


