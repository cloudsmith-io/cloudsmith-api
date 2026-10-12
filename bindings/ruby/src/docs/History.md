# CloudsmithApi::History

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **days** | **Integer** |  | [optional] |
| **display** | [**HistoryFieldset**](HistoryFieldset.md) |  |  |
| **_end** | **Time** |  |  |
| **plan** | **String** |  |  |
| **raw** | [**HistoryFieldsetRaw**](HistoryFieldsetRaw.md) |  |  |
| **start** | **Time** |  |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::History.new(
  days: null,
  display: null,
  _end: null,
  plan: null,
  raw: null,
  start: null
)
```

