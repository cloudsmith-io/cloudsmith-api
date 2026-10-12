# NpmPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**npm_dist_tag** | **str** | The default npm dist-tag for this package/version - This will replace any other package/version if they are using the same tag. | [optional] [default to 'latest']
**package_file** | **str** | The primary file for the package. | 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 

## Example

```python
from cloudsmith_api.models.npm_package_upload_request import NpmPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of NpmPackageUploadRequest from a JSON string
npm_package_upload_request_instance = NpmPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(NpmPackageUploadRequest.to_json())

# convert the object into a dict
npm_package_upload_request_dict = npm_package_upload_request_instance.to_dict()
# create an instance of NpmPackageUploadRequest from a dict
npm_package_upload_request_from_dict = NpmPackageUploadRequest.from_dict(npm_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


