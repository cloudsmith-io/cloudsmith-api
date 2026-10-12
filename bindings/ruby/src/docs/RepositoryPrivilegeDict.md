# CloudsmithApi::RepositoryPrivilegeDict

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **privilege** | **String** | The level of privilege that the user or team should be granted to the specified repository. | [optional] |
| **service** | **String** | The service identifier (slug). | [optional] |
| **team** | **String** | The team identifier (slug). | [optional] |
| **user** | **String** | The user identifier (slug). | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryPrivilegeDict.new(
  privilege: null,
  service: null,
  team: null,
  user: null
)
```

