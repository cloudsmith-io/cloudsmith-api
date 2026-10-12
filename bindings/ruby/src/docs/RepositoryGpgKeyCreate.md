# CloudsmithApi::RepositoryGpgKeyCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **gpg_passphrase** | **String** | The GPG passphrase used for signing. | [optional] |
| **gpg_private_key** | **String** | The GPG private key. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryGpgKeyCreate.new(
  gpg_passphrase: null,
  gpg_private_key: null
)
```

