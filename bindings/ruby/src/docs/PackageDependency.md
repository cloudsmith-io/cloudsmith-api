# CloudsmithApi::PackageDependency

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **dep_type** | **String** |  | [optional][readonly][default to &#39;Depends&#39;] |
| **name** | **String** |  | [optional][readonly] |
| **operator** | **String** |  | [optional][readonly][default to &#39;&#x3D;&#39;] |
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

