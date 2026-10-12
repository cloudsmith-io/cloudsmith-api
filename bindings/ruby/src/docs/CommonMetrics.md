# CloudsmithApi::CommonMetrics

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **active** | **Integer** | Number of packages with at least 1 download | [optional] |
| **bandwidth** | [**CommonBandwidthMetrics**](CommonBandwidthMetrics.md) |  | [optional] |
| **downloads** | [**CommonDownloadsMetrics**](CommonDownloadsMetrics.md) |  | [optional] |
| **inactive** | **Integer** | Packages with zero downloads | [optional] |
| **total** | **Integer** | Total number of packages in repo | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::CommonMetrics.new(
  active: null,
  bandwidth: null,
  downloads: null,
  inactive: null,
  total: null
)
```

