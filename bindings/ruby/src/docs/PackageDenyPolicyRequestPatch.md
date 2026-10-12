# CloudsmithApi::PackageDenyPolicyRequestPatch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **description** | **String** |  | [optional] |
| **enabled** | **Boolean** | Whether this rule is enabled or disabled. | [optional] |
| **name** | **String** |  | [optional] |
| **package_query_string** | **String** | Packages that match this query will trigger this deny rule. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::PackageDenyPolicyRequestPatch.new(
  description: null,
  enabled: null,
  name: null,
  package_query_string: null
)
```

