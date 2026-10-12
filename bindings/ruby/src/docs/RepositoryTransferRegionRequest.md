# CloudsmithApi::RepositoryTransferRegionRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **storage_region** | **String** | The Cloudsmith region in which package files are stored. | [optional][default to &#39;default&#39;] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryTransferRegionRequest.new(
  storage_region: null
)
```

