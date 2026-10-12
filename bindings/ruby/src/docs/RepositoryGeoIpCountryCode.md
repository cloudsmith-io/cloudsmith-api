# CloudsmithApi::RepositoryGeoIpCountryCode

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **allow** | **Array&lt;String&gt;** | The allowed country codes for this repository |  |
| **deny** | **Array&lt;String&gt;** | The denied country codes for this repository |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryGeoIpCountryCode.new(
  allow: null,
  deny: null
)
```

