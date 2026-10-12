# RepositoryX509RsaCertificate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** | If selected this is the active key for this repository. | [optional] [readonly] 
**certificate** | **str** | The issued certificate. | [optional] [readonly] 
**certificate_chain** | **str** | Base64 encoded CA certificate chain. | [optional] [readonly] 
**certificate_chain_fingerprint** | **str** |  | [optional] [readonly] 
**certificate_chain_fingerprint_short** | **str** |  | [optional] [readonly] 
**certificate_fingerprint** | **str** | The SHA-256 long identifier used | [optional] [readonly] 
**certificate_fingerprint_short** | **str** |  | [optional] [readonly] 
**created_at** | **datetime** |  | [optional] [readonly] 
**default** | **bool** | If selected this is the default key for this repository. | [optional] [readonly] 
**issuing_status** | **str** |  | [optional] [default to 'Certificate is pending to be issued']

## Example

```python
from cloudsmith_api.models.repository_x509_rsa_certificate import RepositoryX509RsaCertificate

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryX509RsaCertificate from a JSON string
repository_x509_rsa_certificate_instance = RepositoryX509RsaCertificate.from_json(json)
# print the JSON string representation of the object
print(RepositoryX509RsaCertificate.to_json())

# convert the object into a dict
repository_x509_rsa_certificate_dict = repository_x509_rsa_certificate_instance.to_dict()
# create an instance of RepositoryX509RsaCertificate from a dict
repository_x509_rsa_certificate_from_dict = RepositoryX509RsaCertificate.from_dict(repository_x509_rsa_certificate_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


