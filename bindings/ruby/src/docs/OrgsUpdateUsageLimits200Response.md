# CloudsmithApi::OrgsUpdateUsageLimits200Response

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **allow_open_source_overage** | **Boolean** | Whether on-demand open source overage is allowed. | [optional] |
| **bandwidth_overage_limit** | **Integer** | Effective bandwidth overage limit in GB. | [optional] |
| **storage_overage_limit** | **Integer** | Effective storage overage limit in GB. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OrgsUpdateUsageLimits200Response.new(
  allow_open_source_overage: null,
  bandwidth_overage_limit: null,
  storage_overage_limit: null
)
```

