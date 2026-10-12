# CloudsmithApi::UserBrief

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **authenticated** | **Boolean** | If true then you&#39;re logged in as a user. | [optional][readonly] |
| **email** | **String** | Your email address that we use to contact you. This is only visible to you. | [optional] |
| **name** | **String** | The full name of the user (if any). | [optional][readonly] |
| **profile_url** | **String** | The URL for the full profile of the user. | [optional][readonly] |
| **self_url** | **String** |  | [optional][readonly] |
| **slug** | **String** |  | [optional][readonly] |
| **slug_perm** | **String** |  | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::UserBrief.new(
  authenticated: null,
  email: null,
  name: null,
  profile_url: null,
  self_url: null,
  slug: null,
  slug_perm: null
)
```

