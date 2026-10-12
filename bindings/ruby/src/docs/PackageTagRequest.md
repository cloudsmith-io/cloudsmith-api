# CloudsmithApi::PackageTagRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **action** | **String** |  | [optional] |
| **is_immutable** | **Boolean** | If true, created tags will be immutable. An immutable flag is a tag that cannot be removed from a package. | [optional] |
| **tags** | **Array&lt;String&gt;** | A list of tags to apply the action to. Not required for clears. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::PackageTagRequest.new(
  action: null,
  is_immutable: null,
  tags: null
)
```

