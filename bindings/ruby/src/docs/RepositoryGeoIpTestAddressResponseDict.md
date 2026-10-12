# CloudsmithApi::RepositoryGeoIpTestAddressResponseDict

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **allowed** | **Boolean** | The result of the IP test |  |
| **country_code** | **String** | The country code of the tested IP address |  |
| **ip_address** | **String** | The IP address that was tested |  |
| **reason** | **String** | The reason for the result |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryGeoIpTestAddressResponseDict.new(
  allowed: null,
  country_code: null,
  ip_address: null,
  reason: null
)
```

