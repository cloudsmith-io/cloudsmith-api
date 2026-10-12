# CloudsmithApi::GeoIpLocation

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **city** | **String** |  |  |
| **continent** | **String** |  |  |
| **country** | **String** |  |  |
| **country_code** | **String** |  | [optional][readonly] |
| **latitude** | **Float** |  | [optional] |
| **longitude** | **Float** |  | [optional] |
| **postal_code** | **String** |  |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::GeoIpLocation.new(
  city: null,
  continent: null,
  country: null,
  country_code: null,
  latitude: null,
  longitude: null,
  postal_code: null
)
```

