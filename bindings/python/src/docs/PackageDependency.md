# PackageDependency


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dep_type** | **str** |  | [optional] [readonly] [default to 'Depends']
**name** | **str** |  | [optional] [readonly] 
**operator** | **str** |  | [optional] [readonly] [default to '=']
**version** | **str** |  | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.package_dependency import PackageDependency

# TODO update the JSON string below
json = "{}"
# create an instance of PackageDependency from a JSON string
package_dependency_instance = PackageDependency.from_json(json)
# print the JSON string representation of the object
print(PackageDependency.to_json())

# convert the object into a dict
package_dependency_dict = package_dependency_instance.to_dict()
# create an instance of PackageDependency from a dict
package_dependency_from_dict = PackageDependency.from_dict(package_dependency_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


