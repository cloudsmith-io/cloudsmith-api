# RepositoryEcdsaKeyCreate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ecdsa_passphrase** | **str** | The ECDSA passphrase used for signing. | [optional] 
**ecdsa_private_key** | **str** | The ECDSA private key. | 

## Example

```python
from cloudsmith_api.models.repository_ecdsa_key_create import RepositoryEcdsaKeyCreate

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryEcdsaKeyCreate from a JSON string
repository_ecdsa_key_create_instance = RepositoryEcdsaKeyCreate.from_json(json)
# print the JSON string representation of the object
print(RepositoryEcdsaKeyCreate.to_json())

# convert the object into a dict
repository_ecdsa_key_create_dict = repository_ecdsa_key_create_instance.to_dict()
# create an instance of RepositoryEcdsaKeyCreate from a dict
repository_ecdsa_key_create_from_dict = RepositoryEcdsaKeyCreate.from_dict(repository_ecdsa_key_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


