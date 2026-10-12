# CloudsmithApi::OrganizationTeamInvite

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **role** | **String** | The role to be assigned to the invited user in the team. | [optional] |
| **team** | **String** | The team identifier (slug). | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OrganizationTeamInvite.new(
  role: null,
  team: null
)
```

