# CloudsmithApi::OrganizationUsage

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bandwidth_maximum** | **Integer** | The maximum allowed package delivery overage in GB for this product. | [optional][readonly] |
| **bandwidth_overage_limit** | **Integer** | The on-demand limit for package delivery usage (in GBs). | [optional][readonly] |
| **storage_maximum** | **Integer** | The maximum allowed artifact data overage in GB for this product. | [optional][readonly] |
| **storage_overage_limit** | **Integer** | The on-demand limit for artifact data usage (in GBs). | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OrganizationUsage.new(
  bandwidth_maximum: null,
  bandwidth_overage_limit: null,
  storage_maximum: null,
  storage_overage_limit: null
)
```

