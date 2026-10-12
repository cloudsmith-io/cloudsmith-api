# CloudsmithApi::UserAuthTokenRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **email** | **String** | Email address to authenticate with | [optional] |
| **password** | **String** | Password to authenticate with | [optional] |
| **totp_token** | **String** | Two-factor authentication code | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::UserAuthTokenRequest.new(
  email: null,
  password: null,
  totp_token: null
)
```

