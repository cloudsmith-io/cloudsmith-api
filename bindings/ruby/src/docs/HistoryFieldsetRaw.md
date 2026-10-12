# CloudsmithApi::HistoryFieldsetRaw

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **downloaded** | [**UsageRaw**](UsageRaw.md) |  |  |
| **storage_used** | [**StorageUsageRaw**](StorageUsageRaw.md) |  |  |
| **uploaded** | [**UsageRaw**](UsageRaw.md) |  |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::HistoryFieldsetRaw.new(
  downloaded: null,
  storage_used: null,
  uploaded: null
)
```

