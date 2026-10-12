# CloudsmithApi::OrganizationGroupSync

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **idp_key** | **String** |  | [optional] |
| **idp_value** | **String** |  | [optional] |
| **role** | **String** |  | [optional] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **team** | **String** |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OrganizationGroupSync.new(
  idp_key: null,
  idp_value: null,
  role: null,
  slug_perm: null,
  team: null
)
```

