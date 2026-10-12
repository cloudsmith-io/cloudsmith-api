# CloudsmithApi::RepositoryEd25519Key

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **active** | **Boolean** | If selected this is the active key for this repository. | [optional][readonly] |
| **created_at** | **Time** |  | [optional][readonly] |
| **default** | **Boolean** | If selected this is the default key for this repository. | [optional][readonly] |
| **fingerprint** | **String** | Uppercase hex-encoded SHA-256 fingerprint of the public key. | [optional][readonly] |
| **fingerprint_short** | **String** |  | [optional][readonly] |
| **public_key** | **String** | The public key given to repository users. | [optional][readonly] |
| **public_key_wire** | **String** | The public key in &#x60;&lt;name&gt;:&lt;base64&gt;&#x60; wire format, ready to paste into Nix &#x60;trusted-public-keys&#x60;. | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryEd25519Key.new(
  active: null,
  created_at: null,
  default: null,
  fingerprint: null,
  fingerprint_short: null,
  public_key: null,
  public_key_wire: null
)
```

