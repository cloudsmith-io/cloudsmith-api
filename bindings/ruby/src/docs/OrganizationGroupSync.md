# CloudsmithApi::OrganizationGroupSync

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **idp_key** | **String** |  |  |
| **idp_value** | **String** |  |  |
| **role** | **String** |  | [optional][default to &#39;Member&#39;] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **team** | **String** |  |  |

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

