# CloudsmithApi::UserProfile

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **company** | **String** |  | [optional] |
| **first_name** | **String** |  | [optional] |
| **job_title** | **String** |  | [optional] |
| **joined_at** | **Time** |  | [optional] |
| **last_name** | **String** |  | [optional] |
| **name** | **String** |  | [optional][readonly] |
| **slug** | **String** |  | [optional][readonly] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **tagline** | **String** | Your tagline is a sentence about you. Make it funny. Make it professional. Either way, it&#39;s public and it represents who you are. | [optional] |
| **url** | **String** |  | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::UserProfile.new(
  company: null,
  first_name: null,
  job_title: null,
  joined_at: null,
  last_name: null,
  name: null,
  slug: null,
  slug_perm: null,
  tagline: null,
  url: null
)
```

