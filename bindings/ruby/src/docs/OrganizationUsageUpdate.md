# CloudsmithApi::OrganizationUsageUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **allow_open_source_overage** | **Boolean** |  | [optional] |
| **bandwidth_overage_limit** | **Integer** |  | [optional] |
| **storage_overage_limit** | **Integer** |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OrganizationUsageUpdate.new(
  allow_open_source_overage: null,
  bandwidth_overage_limit: null,
  storage_overage_limit: null
)
```

