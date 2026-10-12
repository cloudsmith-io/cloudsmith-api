# PackageLicense


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**license_notes** | **str** |  | [optional] 
**license_override** | **str** |  | [optional] [default to 'None']
**license_url** | **str** |  | [optional] 
**spdx_license** | **str** |  | 

## Example

```python
from cloudsmith_api.models.package_license import PackageLicense

# TODO update the JSON string below
json = "{}"
# create an instance of PackageLicense from a JSON string
package_license_instance = PackageLicense.from_json(json)
# print the JSON string representation of the object
print(PackageLicense.to_json())

# convert the object into a dict
package_license_dict = package_license_instance.to_dict()
# create an instance of PackageLicense from a dict
package_license_from_dict = PackageLicense.from_dict(package_license_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


