# CloudsmithApi::ProviderSettings

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **claims** | **Object** | The set of claims that any received tokens from the provider must contain to authenticate as the configured service account. | [optional] |
| **enabled** | **Boolean** | Whether the provider settings should be used for incoming OIDC requests. | [optional] |
| **mapping_claim** | **String** | The OIDC claim to use for mapping to service accounts in dynamic_mappings.  Note: This field and the dynamic mappings feature are still in early access. Breaking changes are possible as we receive feedback on this feature. | [optional] |
| **name** | **String** | The name of the provider settings are being configured for | [optional] |
| **provider_url** | **String** | The URL from the provider that serves as the base for the OpenID configuration. For example, if the OpenID configuration is available at https://token.actions.githubusercontent.com/.well-known/openid-configuration, the provider URL would be https://token.actions.githubusercontent.com/ | [optional] |
| **service_accounts** | **Array&lt;String&gt;** | The service accounts associated with these provider settings. | [optional] |
| **slug** | **String** | The slug of the provider settings | [optional][readonly] |
| **slug_perm** | **String** | The unique, immutable identifier of the provider settings. | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::ProviderSettings.new(
  claims: null,
  enabled: null,
  mapping_claim: null,
  name: null,
  provider_url: null,
  service_accounts: null,
  slug: null,
  slug_perm: null
)
```

