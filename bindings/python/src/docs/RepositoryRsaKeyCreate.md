# RepositoryRsaKeyCreate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rsa_passphrase** | **str** | The RSA passphrase used for signing. | [optional] 
**rsa_private_key** | **str** | The RSA private key. | [optional] 

## Example

```python
from cloudsmith_api.models.repository_rsa_key_create import RepositoryRsaKeyCreate

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryRsaKeyCreate from a JSON string
repository_rsa_key_create_instance = RepositoryRsaKeyCreate.from_json(json)
# print the JSON string representation of the object
print(RepositoryRsaKeyCreate.to_json())

# convert the object into a dict
repository_rsa_key_create_dict = repository_rsa_key_create_instance.to_dict()
# create an instance of RepositoryRsaKeyCreate from a dict
repository_rsa_key_create_from_dict = RepositoryRsaKeyCreate.from_dict(repository_rsa_key_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


