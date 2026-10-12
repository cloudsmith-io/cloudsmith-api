# CloudsmithApi::OrganizationApiKeyRule

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **Time** |  | [optional][readonly] |
| **enforce_refresh** | **Boolean** | When enabled, API keys that violate the organization&#39;s rule will be replaced automatically. | [optional] |
| **is_enabled** | **Boolean** | Whether this rule is currently active and enforced. | [optional] |
| **last_applied_at** | **Time** | The last time this rule was evaluated and applied by the expiry task. | [optional][readonly] |
| **max_age_hours** | **Integer** | The maximum permitted age of an API key for use in the organization. API keys older than this will no longer have access until they are refreshed. To disable the rule unset this value. | [optional] |
| **rule_type** | **String** | Specify which account types this rule applies to: all accounts (deprecated — prefer separate service/user rules), service accounts only, or user accounts only. | [optional] |
| **slug** | **String** | Human-readable identifier for the rule type. Automatically generated based on the rule type. | [optional][readonly] |
| **slug_perm** | **String** | An auto-generated id that uniquely identifies the API key policy. | [optional][readonly] |
| **updated_at** | **Time** |  | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OrganizationApiKeyRule.new(
  created_at: null,
  enforce_refresh: null,
  is_enabled: null,
  last_applied_at: null,
  max_age_hours: null,
  rule_type: null,
  slug: null,
  slug_perm: null,
  updated_at: null
)
```

