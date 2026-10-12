# CloudsmithApi::UsageLimits

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bandwidth** | [**AllocatedLimit**](AllocatedLimit.md) |  | [optional] |
| **storage** | [**StorageAllocatedLimit**](StorageAllocatedLimit.md) |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::UsageLimits.new(
  bandwidth: null,
  storage: null
)
```

