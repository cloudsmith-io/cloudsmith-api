# CloudsmithApi::PackageLicense

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **license_notes** | **String** |  | [optional] |
| **license_override** | **String** |  | [optional][default to &#39;None&#39;] |
| **license_url** | **String** |  | [optional] |
| **spdx_license** | **String** |  |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::PackageLicense.new(
  license_notes: null,
  license_override: null,
  license_url: null,
  spdx_license: null
)
```

