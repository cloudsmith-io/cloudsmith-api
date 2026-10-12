# CloudsmithApi::ConnectedRepositoryRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **is_active** | **Boolean** |  | [optional] |
| **priority** | **Integer** | Repositories are checked in ascending order (starting at 1). If multiple repositories have the same priority, the oldest one is used first. | [optional] |
| **target_repository** | **String** | The slug of the target repository to connect to. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::ConnectedRepositoryRequest.new(
  is_active: null,
  priority: null,
  target_repository: null
)
```

