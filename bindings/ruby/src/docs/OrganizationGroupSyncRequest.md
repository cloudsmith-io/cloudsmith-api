# CloudsmithApi::OrganizationGroupSyncRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **idp_key** | **String** |  |  |
| **idp_value** | **String** |  |  |
| **organization** | **String** |  |  |
| **role** | **String** |  | [optional][default to &#39;Member&#39;] |
| **team** | **String** |  |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OrganizationGroupSyncRequest.new(
  idp_key: null,
  idp_value: null,
  organization: null,
  role: null,
  team: null
)
```

