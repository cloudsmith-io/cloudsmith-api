# RepositoryGpgKey


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** | If selected this is the active key for this repository. | [optional] [readonly] 
**comment** | **str** |  | [optional] 
**created_at** | **datetime** |  | [optional] [readonly] 
**default** | **bool** | If selected this is the default key for this repository. | [optional] [readonly] 
**fingerprint** | **str** | The long identifier used by GPG for this key. | [optional] [readonly] 
**fingerprint_short** | **str** |  | [optional] [readonly] 
**public_key** | **str** | The public key given to repository users. | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.repository_gpg_key import RepositoryGpgKey

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryGpgKey from a JSON string
repository_gpg_key_instance = RepositoryGpgKey.from_json(json)
# print the JSON string representation of the object
print(RepositoryGpgKey.to_json())

# convert the object into a dict
repository_gpg_key_dict = repository_gpg_key_instance.to_dict()
# create an instance of RepositoryGpgKey from a dict
repository_gpg_key_from_dict = RepositoryGpgKey.from_dict(repository_gpg_key_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


