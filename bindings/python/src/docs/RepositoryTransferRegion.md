# RepositoryTransferRegion


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storage_region** | **str** | The Cloudsmith region in which package files are stored. | [optional] [default to 'default']

## Example

```python
from cloudsmith_api.models.repository_transfer_region import RepositoryTransferRegion

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryTransferRegion from a JSON string
repository_transfer_region_instance = RepositoryTransferRegion.from_json(json)
# print the JSON string representation of the object
print(RepositoryTransferRegion.to_json())

# convert the object into a dict
repository_transfer_region_dict = repository_transfer_region_instance.to_dict()
# create an instance of RepositoryTransferRegion from a dict
repository_transfer_region_from_dict = RepositoryTransferRegion.from_dict(repository_transfer_region_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


