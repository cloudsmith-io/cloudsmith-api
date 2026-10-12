# CloudsmithApi::UsageLimits

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bandwidth** | [**AllocatedLimit**](AllocatedLimit.md) |  |  |
| **storage** | [**StorageAllocatedLimit**](StorageAllocatedLimit.md) |  |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::UsageLimits.new(
  bandwidth: null,
  storage: null
)
```

