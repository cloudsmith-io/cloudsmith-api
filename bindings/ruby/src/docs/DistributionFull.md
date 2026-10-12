# CloudsmithApi::DistributionFull

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **format** | **String** |  | [optional][readonly] |
| **format_url** | **String** |  | [optional][readonly] |
| **name** | **String** |  |  |
| **self_url** | **String** |  | [optional][readonly] |
| **slug** | **String** | The slug identifier for this distribution | [optional][readonly] |
| **variants** | **String** |  | [optional] |
| **versions** | [**Array&lt;DistributionVersion&gt;**](DistributionVersion.md) | A list of the versions for this distribution | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::DistributionFull.new(
  format: null,
  format_url: null,
  name: null,
  self_url: null,
  slug: null,
  variants: null,
  versions: null
)
```

