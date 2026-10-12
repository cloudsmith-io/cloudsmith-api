# PackageQuarantineRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**release** | **bool** | If true, the package is released from quarantine. | [optional] 
**restore** | **bool** | If true, the package is released from quarantine. Note: This field is deprecated, please use &#39;release&#39; instead. | [optional] 

## Example

```python
from cloudsmith_api.models.package_quarantine_request import PackageQuarantineRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PackageQuarantineRequest from a JSON string
package_quarantine_request_instance = PackageQuarantineRequest.from_json(json)
# print the JSON string representation of the object
print(PackageQuarantineRequest.to_json())

# convert the object into a dict
package_quarantine_request_dict = package_quarantine_request_instance.to_dict()
# create an instance of PackageQuarantineRequest from a dict
package_quarantine_request_from_dict = PackageQuarantineRequest.from_dict(package_quarantine_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


