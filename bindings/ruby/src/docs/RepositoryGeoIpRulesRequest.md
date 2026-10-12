# CloudsmithApi::RepositoryGeoIpRulesRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cidr** | [**RepositoryGeoIpCidr**](RepositoryGeoIpCidr.md) |  |  |
| **country_code** | [**RepositoryGeoIpCountryCode**](RepositoryGeoIpCountryCode.md) |  |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryGeoIpRulesRequest.new(
  cidr: null,
  country_code: null
)
```

