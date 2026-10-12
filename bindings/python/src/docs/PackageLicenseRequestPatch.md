# PackageLicenseRequestPatch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** |  | [optional] [default to 'Update']
**license_notes** | **str** |  | [optional] 
**license_override** | **str** |  | [optional] [default to 'None']
**license_url** | **str** |  | [optional] 
**spdx_license** | **str** |  | 

## Example

```python
from cloudsmith_api.models.package_license_request_patch import PackageLicenseRequestPatch

# TODO update the JSON string below
json = "{}"
# create an instance of PackageLicenseRequestPatch from a JSON string
package_license_request_patch_instance = PackageLicenseRequestPatch.from_json(json)
# print the JSON string representation of the object
print(PackageLicenseRequestPatch.to_json())

# convert the object into a dict
package_license_request_patch_dict = package_license_request_patch_instance.to_dict()
# create an instance of PackageLicenseRequestPatch from a dict
package_license_request_patch_from_dict = PackageLicenseRequestPatch.from_dict(package_license_request_patch_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


