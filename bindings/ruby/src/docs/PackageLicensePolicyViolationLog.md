# CloudsmithApi::PackageLicensePolicyViolationLog

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_at** | **Time** |  | [optional][readonly] |
| **package** | [**PackageVulnerability**](PackageVulnerability.md) |  |  |
| **policy** | [**NestedLicensePolicy**](NestedLicensePolicy.md) |  |  |
| **reasons** | **Array&lt;String&gt;** |  |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::PackageLicensePolicyViolationLog.new(
  event_at: null,
  package: null,
  policy: null,
  reasons: null
)
```

