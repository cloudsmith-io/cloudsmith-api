# PackageTagRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** |  | [optional] [default to 'Add']
**is_immutable** | **bool** | If true, created tags will be immutable. An immutable flag is a tag that cannot be removed from a package. | [optional] [default to False]
**tags** | **List[str]** | A list of tags to apply the action to. Not required for clears. | [optional] 

## Example

```python
from cloudsmith_api.models.package_tag_request import PackageTagRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PackageTagRequest from a JSON string
package_tag_request_instance = PackageTagRequest.from_json(json)
# print the JSON string representation of the object
print(PackageTagRequest.to_json())

# convert the object into a dict
package_tag_request_dict = package_tag_request_instance.to_dict()
# create an instance of PackageTagRequest from a dict
package_tag_request_from_dict = PackageTagRequest.from_dict(package_tag_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


