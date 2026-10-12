# CloudsmithApi::OrganizationPackageLicensePolicy

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **allow_unknown_licenses** | **Boolean** |  | [optional] |
| **created_at** | **Time** |  | [optional][readonly] |
| **description** | **String** |  | [optional] |
| **name** | **String** |  |  |
| **on_violation_quarantine** | **Boolean** |  | [optional] |
| **package_query_string** | **String** |  | [optional] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **spdx_identifiers** | **Array&lt;String&gt;** |  |  |
| **updated_at** | **Time** |  | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OrganizationPackageLicensePolicy.new(
  allow_unknown_licenses: null,
  created_at: null,
  description: null,
  name: null,
  on_violation_quarantine: null,
  package_query_string: null,
  slug_perm: null,
  spdx_identifiers: null,
  updated_at: null
)
```

