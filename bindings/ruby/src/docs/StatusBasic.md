# CloudsmithApi::StatusBasic

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **detail** | **String** | The message describing the state of the API. | [optional][readonly] |
| **version** | **String** | The current version for the Cloudsmith service. | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::StatusBasic.new(
  detail: null,
  version: null
)
```

