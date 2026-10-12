# NixPackageUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**narinfo_file** | **str** | The narinfo sidecar metadata file (&lt;storeHash&gt;.narinfo). Optional — the package can be completed later by publishing the matching narinfo via the native HTTP PUT path. | [optional] 
**package_file** | **str** | The primary file for the package. | 
**republish** | **bool** | If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**tags** | **str** | A comma-separated values list of tags to add to the package. | [optional] 
**version** | **str** | The raw version for this package. | [optional] 

## Example

```python
from cloudsmith_api.models.nix_package_upload_request import NixPackageUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of NixPackageUploadRequest from a JSON string
nix_package_upload_request_instance = NixPackageUploadRequest.from_json(json)
# print the JSON string representation of the object
print(NixPackageUploadRequest.to_json())

# convert the object into a dict
nix_package_upload_request_dict = nix_package_upload_request_instance.to_dict()
# create an instance of NixPackageUploadRequest from a dict
nix_package_upload_request_from_dict = NixPackageUploadRequest.from_dict(nix_package_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


