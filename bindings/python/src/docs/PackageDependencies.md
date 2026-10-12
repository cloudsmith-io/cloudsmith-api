# PackageDependencies


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencies** | [**List[PackageDependency]**](PackageDependency.md) |  | 

## Example

```python
from cloudsmith_api.models.package_dependencies import PackageDependencies

# TODO update the JSON string below
json = "{}"
# create an instance of PackageDependencies from a JSON string
package_dependencies_instance = PackageDependencies.from_json(json)
# print the JSON string representation of the object
print(PackageDependencies.to_json())

# convert the object into a dict
package_dependencies_dict = package_dependencies_instance.to_dict()
# create an instance of PackageDependencies from a dict
package_dependencies_from_dict = PackageDependencies.from_dict(package_dependencies_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


