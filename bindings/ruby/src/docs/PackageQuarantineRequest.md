# CloudsmithApi::PackageQuarantineRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **release** | **Boolean** | If true, the package is released from quarantine. | [optional] |
| **restore** | **Boolean** | If true, the package is released from quarantine. Note: This field is deprecated, please use &#39;release&#39; instead. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::PackageQuarantineRequest.new(
  release: null,
  restore: null
)
```

