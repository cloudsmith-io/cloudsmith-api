# CloudsmithApi::RepositoryGeoIpTestAddressResponseDict

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **allowed** | **Boolean** | The result of the IP test | [optional] |
| **country_code** | **String** | The country code of the tested IP address | [optional] |
| **ip_address** | **String** | The IP address that was tested | [optional] |
| **reason** | **String** | The reason for the result | [optional] |

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

