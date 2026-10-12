# CloudsmithApi::RepositoryGpgKey

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **active** | **Boolean** | If selected this is the active key for this repository. | [optional][readonly] |
| **comment** | **String** |  |  |
| **created_at** | **Time** |  | [optional][readonly] |
| **default** | **Boolean** | If selected this is the default key for this repository. | [optional][readonly] |
| **fingerprint** | **String** | The long identifier used by GPG for this key. | [optional][readonly] |
| **fingerprint_short** | **String** |  | [optional][readonly] |
| **public_key** | **String** | The public key given to repository users. | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryGpgKey.new(
  active: null,
  comment: null,
  created_at: null,
  default: null,
  fingerprint: null,
  fingerprint_short: null,
  public_key: null
)
```

