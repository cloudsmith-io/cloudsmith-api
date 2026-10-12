# CloudsmithApi::OrganizationSAMLAuthRequestPatch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **saml_auth_enabled** | **Boolean** |  | [optional] |
| **saml_auth_enforced** | **Boolean** |  | [optional] |
| **saml_metadata_inline** | **String** | If configured, SAML metadata will be used as entered instead of retrieved from a remote URL. | [optional] |
| **saml_metadata_inline_webapp** | **String** | When configured, this inline SAML metadata is used instead of the legacy app SAML configuration when signing into the new Cloudsmith web application. | [optional] |
| **saml_metadata_url** | **String** | If configured, SAML metadata be retrieved from a remote URL. | [optional] |
| **saml_metadata_url_webapp** | **String** | When configured, this SAML metadata URL is used instead of the legacy app SAML configuration when signing into the new Cloudsmith web application. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OrganizationSAMLAuthRequestPatch.new(
  saml_auth_enabled: null,
  saml_auth_enforced: null,
  saml_metadata_inline: null,
  saml_metadata_inline_webapp: null,
  saml_metadata_url: null,
  saml_metadata_url_webapp: null
)
```

