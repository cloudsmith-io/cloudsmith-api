# OrganizationSAMLAuth


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**saml_auth_enabled** | **bool** |  | [optional] 
**saml_auth_enforced** | **bool** |  | [optional] 
**saml_metadata_inline** | **str** | If configured, SAML metadata will be used as entered instead of retrieved from a remote URL. | [optional] 
**saml_metadata_inline_webapp** | **str** | When configured, this inline SAML metadata is used instead of the legacy app SAML configuration when signing into the new Cloudsmith web application. | [optional] 
**saml_metadata_url** | **str** | If configured, SAML metadata be retrieved from a remote URL. | [optional] 
**saml_metadata_url_webapp** | **str** | When configured, this SAML metadata URL is used instead of the legacy app SAML configuration when signing into the new Cloudsmith web application. | [optional] 

## Example

```python
from cloudsmith_api.models.organization_saml_auth import OrganizationSAMLAuth

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationSAMLAuth from a JSON string
organization_saml_auth_instance = OrganizationSAMLAuth.from_json(json)
# print the JSON string representation of the object
print(OrganizationSAMLAuth.to_json())

# convert the object into a dict
organization_saml_auth_dict = organization_saml_auth_instance.to_dict()
# create an instance of OrganizationSAMLAuth from a dict
organization_saml_auth_from_dict = OrganizationSAMLAuth.from_dict(organization_saml_auth_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


