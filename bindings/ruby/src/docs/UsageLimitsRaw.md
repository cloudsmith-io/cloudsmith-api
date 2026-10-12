# CloudsmithApi::UsageLimitsRaw

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bandwidth** | [**AllocatedLimitRaw**](AllocatedLimitRaw.md) |  | [optional] |
| **storage** | [**StorageAllocatedLimitRaw**](StorageAllocatedLimitRaw.md) |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::UsageLimitsRaw.new(
  bandwidth: null,
  storage: null
)
```

