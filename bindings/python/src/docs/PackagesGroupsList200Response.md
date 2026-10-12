# PackagesGroupsList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List[PackageGroup]**](PackageGroup.md) |  | 

## Example

```python
from cloudsmith_api.models.packages_groups_list200_response import PackagesGroupsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of PackagesGroupsList200Response from a JSON string
packages_groups_list200_response_instance = PackagesGroupsList200Response.from_json(json)
# print the JSON string representation of the object
print(PackagesGroupsList200Response.to_json())

# convert the object into a dict
packages_groups_list200_response_dict = packages_groups_list200_response_instance.to_dict()
# create an instance of PackagesGroupsList200Response from a dict
packages_groups_list200_response_from_dict = PackagesGroupsList200Response.from_dict(packages_groups_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


