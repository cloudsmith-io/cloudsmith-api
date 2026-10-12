# CloudsmithApi::FormatSupportUpstream

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **auth_modes** | **Array&lt;String&gt;** | The authentication modes supported by the upstream format | [optional] |
| **cache_only** | **Boolean** | If true the upstream format supports cache-only mode. | [optional] |
| **caching** | **Boolean** | If true the upstream format supports caching | [optional] |
| **indexing** | **Boolean** | If true the upstream format supports indexing | [optional] |
| **indexing_behavior** | **String** | The behavior of the upstream when indexing | [optional] |
| **proxying** | **Boolean** | If true the upstream format supports proxying | [optional] |
| **signature_verification** | **String** | The signature verification supported by the upstream format | [optional] |
| **trust** | **Boolean** | If true the upstream format supports configurable trust levels (trusted vs untrusted) for upstream sources. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::FormatSupportUpstream.new(
  auth_modes: null,
  cache_only: null,
  caching: null,
  indexing: null,
  indexing_behavior: null,
  proxying: null,
  signature_verification: null,
  trust: null
)
```

