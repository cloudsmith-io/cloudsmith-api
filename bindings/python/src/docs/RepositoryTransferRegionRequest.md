# RepositoryTransferRegionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storage_region** | **str** | The Cloudsmith region in which package files are stored. | [optional] 

## Example

```python
from cloudsmith_api.models.repository_transfer_region_request import RepositoryTransferRegionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryTransferRegionRequest from a JSON string
repository_transfer_region_request_instance = RepositoryTransferRegionRequest.from_json(json)
# print the JSON string representation of the object
print(RepositoryTransferRegionRequest.to_json())

# convert the object into a dict
repository_transfer_region_request_dict = repository_transfer_region_request_instance.to_dict()
# create an instance of RepositoryTransferRegionRequest from a dict
repository_transfer_region_request_from_dict = RepositoryTransferRegionRequest.from_dict(repository_transfer_region_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


