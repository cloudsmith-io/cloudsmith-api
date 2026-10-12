# CloudsmithApi::PackageDependency

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **dep_type** | **String** |  | [optional][readonly] |
| **name** | **String** |  | [optional][readonly] |
| **operator** | **String** |  | [optional][readonly] |
| **version** | **String** |  | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::PackageDependency.new(
  dep_type: null,
  name: null,
  operator: null,
  version: null
)
```

