# CloudsmithApi::PackageCopyRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **destination** | **String** | The name of the destination repository without the namespace. |  |
| **republish** | **Boolean** | If true, the package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::PackageCopyRequest.new(
  destination: null,
  republish: null
)
```

