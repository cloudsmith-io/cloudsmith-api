# CloudsmithApi::StatusBasic

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **detail** | **String** | The message describing the state of the API. | [optional][readonly][default to &#39;Cloudsmith API is operational.&#39;] |
| **version** | **String** | The current version for the Cloudsmith service. | [optional][readonly][default to &#39;1.0&#39;] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::StatusBasic.new(
  detail: null,
  version: null
)
```

