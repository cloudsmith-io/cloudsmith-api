# PackageDenyPolicyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**enabled** | **bool** | Whether this rule is enabled or disabled. | [optional] 
**name** | **str** |  | [optional] 
**package_query_string** | **str** | Packages that match this query will trigger this deny rule. | [optional] 

## Example

```python
from cloudsmith_api.models.package_deny_policy_request import PackageDenyPolicyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PackageDenyPolicyRequest from a JSON string
package_deny_policy_request_instance = PackageDenyPolicyRequest.from_json(json)
# print the JSON string representation of the object
print(PackageDenyPolicyRequest.to_json())

# convert the object into a dict
package_deny_policy_request_dict = package_deny_policy_request_instance.to_dict()
# create an instance of PackageDenyPolicyRequest from a dict
package_deny_policy_request_from_dict = PackageDenyPolicyRequest.from_dict(package_deny_policy_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


