# CloudsmithApi::OidcRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **oidc_token** | **String** | Serialized OIDC token. | [optional] |
| **service_slug** | **String** | Slug for the service account. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OidcRequest.new(
  oidc_token: null,
  service_slug: null
)
```

