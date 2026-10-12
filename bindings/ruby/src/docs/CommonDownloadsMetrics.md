# CloudsmithApi::CommonDownloadsMetrics

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **average** | [**CommonDownloadsMetricsValue**](CommonDownloadsMetricsValue.md) |  | [optional] |
| **highest** | [**CommonDownloadsMetricsValue**](CommonDownloadsMetricsValue.md) |  | [optional] |
| **lowest** | [**CommonDownloadsMetricsValue**](CommonDownloadsMetricsValue.md) |  | [optional] |
| **total** | [**CommonDownloadsMetricsValue**](CommonDownloadsMetricsValue.md) |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::CommonDownloadsMetrics.new(
  average: null,
  highest: null,
  lowest: null,
  total: null
)
```

