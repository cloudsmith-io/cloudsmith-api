# RepositoryGpgKeyCreate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gpg_passphrase** | **str** | The GPG passphrase used for signing. | [optional] 
**gpg_private_key** | **str** | The GPG private key. | 

## Example

```python
from cloudsmith_api.models.repository_gpg_key_create import RepositoryGpgKeyCreate

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryGpgKeyCreate from a JSON string
repository_gpg_key_create_instance = RepositoryGpgKeyCreate.from_json(json)
# print the JSON string representation of the object
print(RepositoryGpgKeyCreate.to_json())

# convert the object into a dict
repository_gpg_key_create_dict = repository_gpg_key_create_instance.to_dict()
# create an instance of RepositoryGpgKeyCreate from a dict
repository_gpg_key_create_from_dict = RepositoryGpgKeyCreate.from_dict(repository_gpg_key_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


