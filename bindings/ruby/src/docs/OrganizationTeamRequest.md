# CloudsmithApi::OrganizationTeamRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **description** | **String** | A detailed description of the team. | [optional] |
| **name** | **String** | A descriptive name for the team. | [optional] |
| **slug** | **String** |  | [optional] |
| **visibility** | **String** |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OrganizationTeamRequest.new(
  description: null,
  name: null,
  slug: null,
  visibility: null
)
```

