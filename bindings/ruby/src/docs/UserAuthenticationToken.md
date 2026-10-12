# CloudsmithApi::UserAuthenticationToken

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created** | **Time** | The time at which the API key was created. | [optional][readonly] |
| **key** | **String** | The unique API key used for authentication. This will be obfuscated on read-only HTTP methods. | [optional][readonly] |
| **slug_perm** | **String** | The slug_perm for token. | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::UserAuthenticationToken.new(
  created: null,
  key: null,
  slug_perm: null
)
```

