# CloudsmithApi::OrganizationSAMLAuth

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**saml_auth_enabled** | **BOOLEAN** |  | 
**saml_auth_enforced** | **BOOLEAN** |  | 
**saml_metadata_inline** | **String** | If configured, SAML metadata will be used as entered instead of retrieved from a remote URL. | [optional] 
**saml_metadata_inline_webapp** | **String** | When configured, this inline SAML metadata is used instead of the legacy app SAML configuration when signing into the new Cloudsmith web application. | [optional] 
**saml_metadata_url** | **String** | If configured, SAML metadata be retrieved from a remote URL. | [optional] 
**saml_metadata_url_webapp** | **String** | When configured, this SAML metadata URL is used instead of the legacy app SAML configuration when signing into the new Cloudsmith web application. | [optional] 


