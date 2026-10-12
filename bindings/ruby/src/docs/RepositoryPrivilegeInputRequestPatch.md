# CloudsmithApi::RepositoryPrivilegeInputRequestPatch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **privileges** | [**Array&lt;RepositoryPrivilegeDict&gt;**](RepositoryPrivilegeDict.md) | List of objects with explicit privileges to the repository. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryPrivilegeInputRequestPatch.new(
  privileges: null
)
```

