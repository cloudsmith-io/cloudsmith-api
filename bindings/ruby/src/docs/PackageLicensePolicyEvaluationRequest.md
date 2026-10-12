# CloudsmithApi::PackageLicensePolicyEvaluationRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **Time** |  | [optional][readonly] |
| **evaluation_count** | **Integer** |  | [optional][readonly] |
| **policy** | [**NestedLicensePolicy**](NestedLicensePolicy.md) |  | [optional] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **status** | **String** |  | [optional][readonly] |
| **updated_at** | **Time** |  | [optional][readonly] |
| **violation_count** | **Integer** |  | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::PackageLicensePolicyEvaluationRequest.new(
  created_at: null,
  evaluation_count: null,
  policy: null,
  slug_perm: null,
  status: null,
  updated_at: null,
  violation_count: null
)
```

