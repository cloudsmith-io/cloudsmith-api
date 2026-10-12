# CloudsmithApi::UserAuthToken

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | API token for the authenticated user | [optional][readonly] |
| **two_factor_required** | **Boolean** | Flag indicating whether a 2FA code is required to complete authentication | [optional][readonly] |
| **two_factor_token** | **String** | Token to use when providing 2FA code | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::UserAuthToken.new(
  token: null,
  two_factor_required: null,
  two_factor_token: null
)
```

