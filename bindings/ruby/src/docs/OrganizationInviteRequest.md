# CloudsmithApi::OrganizationInviteRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **email** | **String** | The email of the user to be invited. | [optional] |
| **role** | **String** | The role to be assigned to the invited user. | [optional] |
| **teams** | [**Array&lt;OrganizationTeamInvite&gt;**](OrganizationTeamInvite.md) |  | [optional] |
| **user** | **String** | The slug of the user to be invited. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::OrganizationInviteRequest.new(
  email: null,
  role: null,
  teams: null,
  user: null
)
```

