# PackageMoveRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination** | **str** | The name of the destination repository without the namespace. | 

## Example

```python
from cloudsmith_api.models.package_move_request import PackageMoveRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PackageMoveRequest from a JSON string
package_move_request_instance = PackageMoveRequest.from_json(json)
# print the JSON string representation of the object
print(PackageMoveRequest.to_json())

# convert the object into a dict
package_move_request_dict = package_move_request_instance.to_dict()
# create an instance of PackageMoveRequest from a dict
package_move_request_from_dict = PackageMoveRequest.from_dict(package_move_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


