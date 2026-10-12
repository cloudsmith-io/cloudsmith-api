# CloudsmithApi::PackageLicenseRequestPatch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **action** | **String** |  | [optional] |
| **license_notes** | **String** |  | [optional] |
| **license_override** | **String** |  | [optional] |
| **license_url** | **String** |  | [optional] |
| **spdx_license** | **String** |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::PackageLicenseRequestPatch.new(
  action: null,
  license_notes: null,
  license_override: null,
  license_url: null,
  spdx_license: null
)
```

