# CloudsmithApi::DynamicMapping

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **claim_value** | **String** | The OIDC token claim value that must be present in the token for it to successfully authenticate as the mapped &#x60;service_account&#x60;.  Note: This field and the dynamic mappings feature are still in early access. Breaking changes are possible as we receive feedback on this feature. | [optional] |
| **service_account** | **String** | The service account associated with the provider setting and &#x60;claim_value&#x60;  Note: This field and the dynamic mappings feature are still in early access. Breaking changes are possible as we receive feedback on this feature. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::DynamicMapping.new(
  claim_value: null,
  service_account: null
)
```

