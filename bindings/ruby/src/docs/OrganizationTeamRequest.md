# CloudsmithApi::OrganizationTeamRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **description** | **String** | A detailed description of the team. | [optional] |
| **name** | **String** | A descriptive name for the team. |  |
| **slug** | **String** |  | [optional] |
| **visibility** | **String** |  | [optional][default to &#39;Visible&#39;] |

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

