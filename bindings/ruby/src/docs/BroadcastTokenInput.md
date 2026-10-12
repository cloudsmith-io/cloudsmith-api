# CloudsmithApi::BroadcastTokenInput

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **entitlement_token** | **String** | Repository entitlement token used to authorize the creation of a broadcast token | [optional] |
| **expires_in** | **Integer** | Token expiry time in seconds (optional, defaults to 3600 seconds) | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::BroadcastTokenInput.new(
  entitlement_token: null,
  expires_in: null
)
```

