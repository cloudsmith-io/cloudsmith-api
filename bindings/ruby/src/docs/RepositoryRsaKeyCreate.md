# CloudsmithApi::RepositoryRsaKeyCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **rsa_passphrase** | **String** | The RSA passphrase used for signing. | [optional] |
| **rsa_private_key** | **String** | The RSA private key. |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryRsaKeyCreate.new(
  rsa_passphrase: null,
  rsa_private_key: null
)
```

