# CloudsmithApi::OrganizationTeam

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **description** | **String** | A detailed description of the team. | [optional] |
| **name** | **String** | A descriptive name for the team. | [optional] |
| **slug** | **String** |  | [optional] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **visibility** | **String** |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OrganizationTeam.new(
  description: null,
  name: null,
  slug: null,
  slug_perm: null,
  visibility: null
)
```

