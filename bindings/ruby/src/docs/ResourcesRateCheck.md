# CloudsmithApi::ResourcesRateCheck

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **resources** | [**Hash&lt;String, RateCheck&gt;**](RateCheck.md) | Rate limit values per resource | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::ResourcesRateCheck.new(
  resources: null
)
```

