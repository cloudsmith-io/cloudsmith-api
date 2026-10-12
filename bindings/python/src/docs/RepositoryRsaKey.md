# RepositoryRsaKey


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** | If selected this is the active key for this repository. | [optional] [readonly] 
**created_at** | **datetime** |  | [optional] [readonly] 
**default** | **bool** | If selected this is the default key for this repository. | [optional] [readonly] 
**fingerprint** | **str** | The long identifier used by RSA for this key. | [optional] [readonly] 
**fingerprint_short** | **str** |  | [optional] [readonly] 
**public_key** | **str** | The public key given to repository users. | [optional] [readonly] 
**ssh_fingerprint** | **str** | The SSH fingerprint used by RSA for this key. | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.repository_rsa_key import RepositoryRsaKey

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryRsaKey from a JSON string
repository_rsa_key_instance = RepositoryRsaKey.from_json(json)
# print the JSON string representation of the object
print(RepositoryRsaKey.to_json())

# convert the object into a dict
repository_rsa_key_dict = repository_rsa_key_instance.to_dict()
# create an instance of RepositoryRsaKey from a dict
repository_rsa_key_from_dict = RepositoryRsaKey.from_dict(repository_rsa_key_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


