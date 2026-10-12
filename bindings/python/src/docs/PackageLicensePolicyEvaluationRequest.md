# PackageLicensePolicyEvaluationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | [optional] [readonly] 
**evaluation_count** | **int** |  | [optional] [readonly] 
**policy** | [**NestedLicensePolicy**](NestedLicensePolicy.md) |  | [optional] 
**slug_perm** | **str** |  | [optional] [readonly] 
**status** | **str** |  | [optional] [readonly] 
**updated_at** | **datetime** |  | [optional] [readonly] 
**violation_count** | **int** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.package_license_policy_evaluation_request import PackageLicensePolicyEvaluationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PackageLicensePolicyEvaluationRequest from a JSON string
package_license_policy_evaluation_request_instance = PackageLicensePolicyEvaluationRequest.from_json(json)
# print the JSON string representation of the object
print(PackageLicensePolicyEvaluationRequest.to_json())

# convert the object into a dict
package_license_policy_evaluation_request_dict = package_license_policy_evaluation_request_instance.to_dict()
# create an instance of PackageLicensePolicyEvaluationRequest from a dict
package_license_policy_evaluation_request_from_dict = PackageLicensePolicyEvaluationRequest.from_dict(package_license_policy_evaluation_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


