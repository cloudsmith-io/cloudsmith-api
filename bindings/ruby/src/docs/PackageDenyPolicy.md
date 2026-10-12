# CloudsmithApi::PackageDenyPolicy

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **action** | **String** |  | [optional][readonly] |
| **created_at** | **Time** |  | [optional][readonly] |
| **description** | **String** |  | [optional] |
| **enabled** | **Boolean** | Whether this rule is enabled or disabled. | [optional] |
| **name** | **String** |  | [optional] |
| **package_query_string** | **String** | Packages that match this query will trigger this deny rule. | [optional] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **status** | **String** |  | [optional][readonly] |
| **updated_at** | **Time** |  | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::PackageDenyPolicy.new(
  action: null,
  created_at: null,
  description: null,
  enabled: null,
  name: null,
  package_query_string: null,
  slug_perm: null,
  status: null,
  updated_at: null
)
```

