# CloudsmithApi::HistoryFieldsetRaw

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **downloaded** | [**UsageRaw**](UsageRaw.md) |  | [optional] |
| **storage_used** | [**StorageUsageRaw**](StorageUsageRaw.md) |  | [optional] |
| **uploaded** | [**UsageRaw**](UsageRaw.md) |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::HistoryFieldsetRaw.new(
  downloaded: null,
  storage_used: null,
  uploaded: null
)
```

