# CloudsmithApi::CommonBandwidthMetricsValue

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **display** | **String** | Bandwidth usage value | [optional] |
| **units** | **String** | Unit of measurement e.g. bytes | [optional] |
| **value** | **Integer** | Human readable version of display value | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::CommonBandwidthMetricsValue.new(
  display: null,
  units: null,
  value: null
)
```

