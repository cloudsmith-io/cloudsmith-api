# CloudsmithApi::Service

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **Time** |  | [optional][readonly] |
| **created_by** | **String** |  | [optional][readonly] |
| **created_by_url** | **String** |  | [optional][readonly] |
| **description** | **String** | The description of the service | [optional] |
| **key** | **String** | The API key of the service | [optional][readonly] |
| **key_expires_at** | **Time** | The time at which the API key will expire. This will only be populated if the Organization has an active API Key Policy. | [optional][readonly] |
| **name** | **String** | The name of the service |  |
| **role** | **String** | The role of the service. | [optional][default to &#39;Member&#39;] |
| **slug** | **String** | The slug of the service | [optional][readonly] |
| **teams** | [**Array&lt;ServiceTeams&gt;**](ServiceTeams.md) |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::Service.new(
  created_at: null,
  created_by: null,
  created_by_url: null,
  description: null,
  key: null,
  key_expires_at: null,
  name: null,
  role: null,
  slug: null,
  teams: null
)
```

