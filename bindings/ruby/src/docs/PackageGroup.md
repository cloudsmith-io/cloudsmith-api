# CloudsmithApi::PackageGroup

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **backend_kind** | **Integer** |  | [optional] |
| **count** | **Integer** |  |  |
| **last_push** | **Time** |  |  |
| **name** | **String** |  | [optional] |
| **num_downloads** | **Integer** |  |  |
| **size** | **Integer** |  |  |

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

