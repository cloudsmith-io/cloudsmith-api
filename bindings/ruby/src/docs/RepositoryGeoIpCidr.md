# CloudsmithApi::RepositoryGeoIpCidr

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **allow** | **Array&lt;String&gt;** | The allowed CIDRs for this repository | [optional] |
| **deny** | **Array&lt;String&gt;** | The denied CIDRs for this repository | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryGeoIpCidr.new(
  allow: null,
  deny: null
)
```

