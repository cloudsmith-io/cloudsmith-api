# SwiftPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author_name** | **str** | The name of the author of the package. | [optional] 
**author_org** | **str** | The organization of the author. | [optional] 
**license_url** | **str** | The license URL of this package. | [optional] 
**name** | **str** | The name of this package. | [optional] 
**package_file** | **str** | The primary file for the package. | [optional] 
**readme_url** | **str** | The URL of the readme for the package. | [optional] 
**repository_url** | **str** | The URL of the SCM repository for the package. | [optional] 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**scope** | **str** | A scope provides a namespace for related packages within the package registry. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 
**version** | **str** | The raw version for this package. | [optional] 

## Example

```python
from cloudsmith_api.models.swift_package_upload_request import SwiftPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SwiftPackageUploadRequest from a JSON string
swift_package_upload_request_instance = SwiftPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(SwiftPackageUploadRequest.to_json())

# convert the object into a dict
swift_package_upload_request_dict = swift_package_upload_request_instance.to_dict()
# create an instance of SwiftPackageUploadRequest from a dict
swift_package_upload_request_from_dict = SwiftPackageUploadRequest.from_dict(swift_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


