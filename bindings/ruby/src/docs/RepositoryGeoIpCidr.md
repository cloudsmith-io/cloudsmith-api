# CloudsmithApi::RepositoryGeoIpCidr

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **allow** | **Array&lt;String&gt;** | The allowed CIDRs for this repository |  |
| **deny** | **Array&lt;String&gt;** | The denied CIDRs for this repository |  |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryGeoIpCidr.new(
  allow: null,
  deny: null
)
```

