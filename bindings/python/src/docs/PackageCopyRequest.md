# PackageCopyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination** | **str** | The name of the destination repository without the namespace. | 
**republish** | **bool** | If true, the package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 

## Example

```python
from cloudsmith_api.models.package_copy_request import PackageCopyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PackageCopyRequest from a JSON string
package_copy_request_instance = PackageCopyRequest.from_json(json)
# print the JSON string representation of the object
print(PackageCopyRequest.to_json())

# convert the object into a dict
package_copy_request_dict = package_copy_request_instance.to_dict()
# create an instance of PackageCopyRequest from a dict
package_copy_request_from_dict = PackageCopyRequest.from_dict(package_copy_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


