# RepositoryEd25519KeyCreate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ed25519_passphrase** | **str** | The Ed25519 passphrase used for signing. | [optional] 
**ed25519_private_key** | **str** | The Ed25519 private key. | 

## Example

```python
from cloudsmith_api.models.repository_ed25519_key_create import RepositoryEd25519KeyCreate

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryEd25519KeyCreate from a JSON string
repository_ed25519_key_create_instance = RepositoryEd25519KeyCreate.from_json(json)
# print the JSON string representation of the object
print(RepositoryEd25519KeyCreate.to_json())

# convert the object into a dict
repository_ed25519_key_create_dict = repository_ed25519_key_create_instance.to_dict()
# create an instance of RepositoryEd25519KeyCreate from a dict
repository_ed25519_key_create_from_dict = RepositoryEd25519KeyCreate.from_dict(repository_ed25519_key_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


