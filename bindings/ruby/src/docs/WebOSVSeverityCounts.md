# CloudsmithApi::WebOSVSeverityCounts

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **critical** | **Integer** |  | [optional][readonly] |
| **high** | **Integer** |  | [optional][readonly] |
| **low** | **Integer** |  | [optional][readonly] |
| **malware** | **Integer** |  | [optional][readonly] |
| **medium** | **Integer** |  | [optional][readonly] |
| **total** | **Integer** |  | [optional][readonly] |
| **unknown** | **Integer** |  | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::WebOSVSeverityCounts.new(
  critical: null,
  high: null,
  low: null,
  malware: null,
  medium: null,
  total: null,
  unknown: null
)
```

