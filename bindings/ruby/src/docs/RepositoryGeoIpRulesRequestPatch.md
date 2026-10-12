# CloudsmithApi::RepositoryGeoIpRulesRequestPatch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cidr** | [**RepositoryGeoIpCidr**](RepositoryGeoIpCidr.md) |  | [optional] |
| **country_code** | [**RepositoryGeoIpCountryCode**](RepositoryGeoIpCountryCode.md) |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryGeoIpRulesRequestPatch.new(
  cidr: null,
  country_code: null
)
```

