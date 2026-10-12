# CloudsmithApi::PackageLicensePolicyViolationLogCursorPage

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **_next** | **String** |  | [optional] |
| **previous** | **String** |  | [optional] |
| **results** | [**Array&lt;PackageLicensePolicyViolationLog&gt;**](PackageLicensePolicyViolationLog.md) |  |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::PackageLicensePolicyViolationLogCursorPage.new(
  _next: null,
  previous: null,
  results: null
)
```

