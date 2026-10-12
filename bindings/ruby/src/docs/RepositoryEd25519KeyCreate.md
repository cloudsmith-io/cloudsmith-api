# CloudsmithApi::RepositoryEd25519KeyCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ed25519_passphrase** | **String** | The Ed25519 passphrase used for signing. | [optional] |
| **ed25519_private_key** | **String** | The Ed25519 private key. |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryEd25519KeyCreate.new(
  ed25519_passphrase: null,
  ed25519_private_key: null
)
```

