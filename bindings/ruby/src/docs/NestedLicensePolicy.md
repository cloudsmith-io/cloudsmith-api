# CloudsmithApi::NestedLicensePolicy

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **allow_unknown_licenses** | **Boolean** |  | [optional][readonly] |
| **created_at** | **Time** |  | [optional][readonly] |
| **description** | **String** |  | [optional][readonly] |
| **name** | **String** |  | [optional][readonly] |
| **on_violation_quarantine** | **Boolean** |  | [optional][readonly] |
| **package_query_string** | **String** |  | [optional][readonly] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **spdx_identifiers** | **Array&lt;String&gt;** |  |  |
| **updated_at** | **Time** |  | [optional][readonly] |
| **url** | **String** |  | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::NestedLicensePolicy.new(
  allow_unknown_licenses: null,
  created_at: null,
  description: null,
  name: null,
  on_violation_quarantine: null,
  package_query_string: null,
  slug_perm: null,
  spdx_identifiers: null,
  updated_at: null,
  url: null
)
```

