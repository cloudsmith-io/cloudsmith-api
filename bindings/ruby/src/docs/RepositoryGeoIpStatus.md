# CloudsmithApi::RepositoryGeoIpStatus

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **geoip_enabled** | **Boolean** | If checked, any access to the website or downloads for this repository is allowed/denied according to the configured Geo/IP restriction rules. | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryGeoIpStatus.new(
  geoip_enabled: null
)
```

