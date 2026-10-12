# CloudsmithApi::OrgsRetrieveUsageLimits200Response

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **allow_open_source_overage** | **Boolean** | Whether on-demand open source overage is allowed. | [optional] |
| **bandwidth_overage_limit** | **Integer** | Effective bandwidth overage limit in GB. | [optional] |
| **storage_overage_limit** | **Integer** | Effective storage overage limit in GB. | [optional] |
| **bandwidth_maximum** | **Integer** | Maximum allowed bandwidth overage in GB. | [optional] |
| **storage_maximum** | **Integer** | Maximum allowed storage overage in GB. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OrgsRetrieveUsageLimits200Response.new(
  allow_open_source_overage: null,
  bandwidth_overage_limit: null,
  storage_overage_limit: null,
  bandwidth_maximum: null,
  storage_maximum: null
)
```

