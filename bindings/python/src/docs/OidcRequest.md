# OidcRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**oidc_token** | **str** | Serialized OIDC token. | 
**service_slug** | **str** | Slug for the service account. | 

## Example

```python
from cloudsmith_api.models.oidc_request import OidcRequest

# TODO update the JSON string below
json = "{}"
# create an instance of OidcRequest from a JSON string
oidc_request_instance = OidcRequest.from_json(json)
# print the JSON string representation of the object
print(OidcRequest.to_json())

# convert the object into a dict
oidc_request_dict = oidc_request_instance.to_dict()
# create an instance of OidcRequest from a dict
oidc_request_from_dict = OidcRequest.from_dict(oidc_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


