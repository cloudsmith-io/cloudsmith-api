# CloudsmithApi::ConnectedRepositoryUpstream

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | The format/backend slug of the upstream (e.g. &#39;npm&#39;). | [optional][readonly] |
| **upstream_url** | **String** |  | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::ConnectedRepositoryUpstream.new(
  type: null,
  upstream_url: null
)
```

