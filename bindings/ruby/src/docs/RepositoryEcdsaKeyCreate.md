# CloudsmithApi::RepositoryEcdsaKeyCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ecdsa_passphrase** | **String** | The ECDSA passphrase used for signing. | [optional] |
| **ecdsa_private_key** | **String** | The ECDSA private key. |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryEcdsaKeyCreate.new(
  ecdsa_passphrase: null,
  ecdsa_private_key: null
)
```

