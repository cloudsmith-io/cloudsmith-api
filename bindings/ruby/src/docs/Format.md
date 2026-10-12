# CloudsmithApi::Format

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **description** | **String** | Description of the package format | [optional] |
| **distributions** | [**Array&lt;Distribution&gt;**](Distribution.md) | The distributions supported by this package format | [optional] |
| **extensions** | **Array&lt;String&gt;** | A non-exhaustive list of extensions supported | [optional] |
| **name** | **String** | Name for the package format | [optional] |
| **premium** | **Boolean** | If true the package format is a premium-only feature | [optional] |
| **premium_plan_id** | **String** | The minimum plan id required for this package format | [optional] |
| **premium_plan_name** | **String** | The minimum plan name required for this package format | [optional] |
| **slug** | **String** | Slug for the package format | [optional] |
| **supports** | [**FormatSupport**](FormatSupport.md) |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::Format.new(
  description: null,
  distributions: null,
  extensions: null,
  name: null,
  premium: null,
  premium_plan_id: null,
  premium_plan_name: null,
  slug: null,
  supports: null
)
```

