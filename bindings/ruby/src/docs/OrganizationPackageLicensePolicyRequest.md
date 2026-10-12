# CloudsmithApi::OrganizationPackageLicensePolicyRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **allow_unknown_licenses** | **Boolean** |  | [optional] |
| **description** | **String** |  | [optional] |
| **name** | **String** |  |  |
| **on_violation_quarantine** | **Boolean** |  | [optional] |
| **package_query_string** | **String** |  | [optional] |
| **spdx_identifiers** | **Array&lt;String&gt;** |  |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OrganizationPackageLicensePolicyRequest.new(
  allow_unknown_licenses: null,
  description: null,
  name: null,
  on_violation_quarantine: null,
  package_query_string: null,
  spdx_identifiers: null
)
```

