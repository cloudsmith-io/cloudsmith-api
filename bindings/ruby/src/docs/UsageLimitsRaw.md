# CloudsmithApi::UsageLimitsRaw

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bandwidth** | [**AllocatedLimitRaw**](AllocatedLimitRaw.md) |  |  |
| **storage** | [**StorageAllocatedLimitRaw**](StorageAllocatedLimitRaw.md) |  |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::UsageLimitsRaw.new(
  bandwidth: null,
  storage: null
)
```

