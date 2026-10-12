# CloudsmithApi::OrganizationInvite

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **email** | **String** | The email of the user to be invited. | [optional] |
| **expires_at** | **Time** |  | [optional][readonly] |
| **inviter** | **String** |  | [optional][readonly] |
| **inviter_url** | **String** |  | [optional][readonly] |
| **org** | **String** |  | [optional][readonly] |
| **role** | **String** | The role to be assigned to the invited user. | [optional] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **teams** | [**Array&lt;OrganizationTeamInvite&gt;**](OrganizationTeamInvite.md) |  | [optional] |
| **user** | **String** | The slug of the user to be invited. | [optional] |
| **user_url** | **String** |  | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OrganizationInvite.new(
  email: null,
  expires_at: null,
  inviter: null,
  inviter_url: null,
  org: null,
  role: null,
  slug_perm: null,
  teams: null,
  user: null,
  user_url: null
)
```

