# CloudsmithApi::StorageAllocatedLimit

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **configured** | **String** |  | [optional] |
| **peak** | **String** |  | [optional] |
| **percentage_used** | **String** |  | [optional] |
| **plan_limit** | **String** |  | [optional] |
| **used** | **String** |  | [optional] |
| **used_pre_deduplication** | **String** |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::StorageAllocatedLimit.new(
  configured: null,
  peak: null,
  percentage_used: null,
  plan_limit: null,
  used: null,
  used_pre_deduplication: null
)
```

