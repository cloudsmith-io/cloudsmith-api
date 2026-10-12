# CloudsmithApi::Organization

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | **String** |  | [optional][readonly] |
| **created_at** | **Time** |  | [optional][readonly] |
| **location** | **String** | The city/town/area your organization is based in. | [optional][readonly] |
| **name** | **String** |  | [optional] |
| **slug** | **String** |  | [optional][readonly] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **tagline** | **String** | A short public descriptive for your organization. | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::Organization.new(
  country: null,
  created_at: null,
  location: null,
  name: null,
  slug: null,
  slug_perm: null,
  tagline: null
)
```

