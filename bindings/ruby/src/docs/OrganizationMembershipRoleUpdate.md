# CloudsmithApi::OrganizationMembershipRoleUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **email** | **String** |  | [optional][readonly] |
| **has_two_factor** | **Boolean** |  | [optional][readonly] |
| **joined_at** | **Time** |  | [optional][readonly] |
| **last_login_at** | **Time** |  | [optional][readonly] |
| **last_login_method** | **String** |  | [optional][readonly][default to &#39;Unknown&#39;] |
| **role** | **String** |  | [optional][default to &#39;Owner&#39;] |
| **user** | **String** |  | [optional][readonly] |
| **user_id** | **String** |  | [optional][readonly] |
| **user_name** | **String** |  | [optional][readonly] |
| **user_url** | **String** |  | [optional][readonly] |
| **visibility** | **String** |  | [optional][readonly][default to &#39;Public&#39;] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OrganizationMembershipRoleUpdate.new(
  email: null,
  has_two_factor: null,
  joined_at: null,
  last_login_at: null,
  last_login_method: null,
  role: null,
  user: null,
  user_id: null,
  user_name: null,
  user_url: null,
  visibility: null
)
```

