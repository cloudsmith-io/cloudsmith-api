# CloudsmithApi::ServiceTeams

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | The name of the team | [optional][readonly] |
| **role** | **String** | The team role associated with the service | [optional] |
| **slug** | **String** | The teams associated with the service | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::ServiceTeams.new(
  name: null,
  role: null,
  slug: null
)
```

