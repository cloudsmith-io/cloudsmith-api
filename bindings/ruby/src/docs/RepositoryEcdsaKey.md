# CloudsmithApi::RepositoryEcdsaKey

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **active** | **Boolean** | If selected this is the active key for this repository. | [optional][readonly] |
| **created_at** | **Time** |  | [optional][readonly] |
| **default** | **Boolean** | If selected this is the default key for this repository. | [optional][readonly] |
| **fingerprint** | **String** | The long identifier used by ECDSA for this key. | [optional][readonly] |
| **fingerprint_short** | **String** |  | [optional][readonly] |
| **public_key** | **String** | The public key given to repository users. | [optional][readonly] |
| **ssh_fingerprint** | **String** | The SSH fingerprint used by ECDSA for this key. | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryEcdsaKey.new(
  active: null,
  created_at: null,
  default: null,
  fingerprint: null,
  fingerprint_short: null,
  public_key: null,
  ssh_fingerprint: null
)
```

