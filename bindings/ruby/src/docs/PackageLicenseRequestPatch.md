# CloudsmithApi::PackageLicenseRequestPatch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **action** | **String** |  | [optional][default to &#39;Update&#39;] |
| **license_notes** | **String** |  | [optional] |
| **license_override** | **String** |  | [optional][default to &#39;None&#39;] |
| **license_url** | **String** |  | [optional] |
| **spdx_license** | **String** |  |  |

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

