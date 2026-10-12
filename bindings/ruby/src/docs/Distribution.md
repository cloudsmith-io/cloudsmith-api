# CloudsmithApi::Distribution

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** |  |  |
| **self_url** | **String** |  | [optional][readonly] |
| **slug** | **String** | The slug identifier for this distribution | [optional][readonly] |
| **variants** | **String** |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::Distribution.new(
  name: null,
  self_url: null,
  slug: null,
  variants: null
)
```

