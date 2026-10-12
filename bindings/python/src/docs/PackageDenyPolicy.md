# PackageDenyPolicy


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** |  | [optional] [readonly] [default to 'Block downloads']
**created_at** | **datetime** |  | [optional] [readonly] 
**description** | **str** |  | [optional] 
**enabled** | **bool** | Whether this rule is enabled or disabled. | [optional] 
**name** | **str** |  | [optional] 
**package_query_string** | **str** | Packages that match this query will trigger this deny rule. | 
**slug_perm** | **str** |  | [optional] [readonly] 
**status** | **str** |  | [optional] [readonly] [default to 'In Progress']
**updated_at** | **datetime** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.package_deny_policy import PackageDenyPolicy

# TODO update the JSON string below
json = "{}"
# create an instance of PackageDenyPolicy from a JSON string
package_deny_policy_instance = PackageDenyPolicy.from_json(json)
# print the JSON string representation of the object
print(PackageDenyPolicy.to_json())

# convert the object into a dict
package_deny_policy_dict = package_deny_policy_instance.to_dict()
# create an instance of PackageDenyPolicy from a dict
package_deny_policy_from_dict = PackageDenyPolicy.from_dict(package_deny_policy_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


