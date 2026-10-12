# CloudsmithApi::HistoryFieldset

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **downloaded** | [**Usage**](Usage.md) |  | [optional] |
| **storage_used** | [**StorageUsage**](StorageUsage.md) |  | [optional] |
| **uploaded** | [**Usage**](Usage.md) |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::HistoryFieldset.new(
  downloaded: null,
  storage_used: null,
  uploaded: null
)
```

