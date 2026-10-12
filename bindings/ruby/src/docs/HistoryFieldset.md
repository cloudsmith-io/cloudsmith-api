# CloudsmithApi::HistoryFieldset

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **downloaded** | [**Usage**](Usage.md) |  |  |
| **storage_used** | [**StorageUsage**](StorageUsage.md) |  |  |
| **uploaded** | [**Usage**](Usage.md) |  |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::HistoryFieldset.new(
  downloaded: null,
  storage_used: null,
  uploaded: null
)
```

