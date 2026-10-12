# CloudsmithApi::StorageAllocatedLimitRaw

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **configured** | **Integer** |  | [optional] |
| **peak** | **Integer** |  | [optional] |
| **percentage_used** | **Float** |  | [optional] |
| **plan_limit** | **Integer** |  | [optional] |
| **used** | **Integer** |  | [optional] |
| **used_pre_deduplication** | **Integer** |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::StorageAllocatedLimitRaw.new(
  configured: null,
  peak: null,
  percentage_used: null,
  plan_limit: null,
  used: null,
  used_pre_deduplication: null
)
```

