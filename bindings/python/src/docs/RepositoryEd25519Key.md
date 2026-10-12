# RepositoryEd25519Key


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** | If selected this is the active key for this repository. | [optional] [readonly] 
**created_at** | **datetime** |  | [optional] [readonly] 
**default** | **bool** | If selected this is the default key for this repository. | [optional] [readonly] 
**fingerprint** | **str** | Uppercase hex-encoded SHA-256 fingerprint of the public key. | [optional] [readonly] 
**fingerprint_short** | **str** |  | [optional] [readonly] 
**public_key** | **str** | The public key given to repository users. | [optional] [readonly] 
**public_key_wire** | **str** | The public key in &#x60;&lt;name&gt;:&lt;base64&gt;&#x60; wire format, ready to paste into Nix &#x60;trusted-public-keys&#x60;. | [optional] [readonly] 

## Example

```python
from cloudsmith_api.models.repository_ed25519_key import RepositoryEd25519Key

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryEd25519Key from a JSON string
repository_ed25519_key_instance = RepositoryEd25519Key.from_json(json)
# print the JSON string representation of the object
print(RepositoryEd25519Key.to_json())

# convert the object into a dict
repository_ed25519_key_dict = repository_ed25519_key_instance.to_dict()
# create an instance of RepositoryEd25519Key from a dict
repository_ed25519_key_from_dict = RepositoryEd25519Key.from_dict(repository_ed25519_key_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


