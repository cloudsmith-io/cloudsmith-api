# CloudsmithApi::PackageGroup

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **backend_kind** | **Integer** |  | [optional] |
| **count** | **Integer** |  | [optional] |
| **last_push** | **Time** |  | [optional] |
| **name** | **String** |  | [optional] |
| **num_downloads** | **Integer** |  | [optional] |
| **size** | **Integer** |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::PackageGroup.new(
  backend_kind: null,
  count: null,
  last_push: null,
  name: null,
  num_downloads: null,
  size: null
)
```

