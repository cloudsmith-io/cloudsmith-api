# CloudsmithApi::History

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **days** | **Integer** |  | [optional] |
| **display** | [**HistoryFieldset**](HistoryFieldset.md) |  | [optional] |
| **_end** | **Time** |  | [optional] |
| **plan** | **String** |  | [optional] |
| **raw** | [**HistoryFieldsetRaw**](HistoryFieldsetRaw.md) |  | [optional] |
| **start** | **Time** |  | [optional] |

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

