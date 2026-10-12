# CloudsmithApi::RepositoryX509EcdsaCertificate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **active** | **Boolean** | If selected this is the active key for this repository. | [optional][readonly] |
| **certificate** | **String** | The issued certificate. | [optional][readonly] |
| **certificate_chain** | **String** | Base64 encoded CA certificate chain. | [optional][readonly] |
| **certificate_chain_fingerprint** | **String** |  | [optional][readonly] |
| **certificate_chain_fingerprint_short** | **String** |  | [optional][readonly] |
| **certificate_fingerprint** | **String** | The SHA-256 long identifier used | [optional][readonly] |
| **certificate_fingerprint_short** | **String** |  | [optional][readonly] |
| **created_at** | **Time** |  | [optional][readonly] |
| **default** | **Boolean** | If selected this is the default key for this repository. | [optional][readonly] |
| **issuing_status** | **String** |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryX509EcdsaCertificate.new(
  active: null,
  certificate: null,
  certificate_chain: null,
  certificate_chain_fingerprint: null,
  certificate_chain_fingerprint_short: null,
  certificate_fingerprint: null,
  certificate_fingerprint_short: null,
  created_at: null,
  default: null,
  issuing_status: null
)
```

