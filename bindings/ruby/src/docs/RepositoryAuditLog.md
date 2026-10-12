# CloudsmithApi::RepositoryAuditLog

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **actor** | **String** |  |  |
| **actor_ip_address** | **String** |  |  |
| **actor_kind** | **String** |  | [optional][readonly] |
| **actor_location** | [**GeoIpLocation**](GeoIpLocation.md) |  |  |
| **actor_slug_perm** | **String** |  |  |
| **actor_url** | **String** |  | [optional][readonly] |
| **context** | **String** |  |  |
| **event** | **String** |  |  |
| **event_at** | **Time** |  |  |
| **object** | **String** |  |  |
| **object_kind** | **String** |  |  |
| **object_slug_perm** | **String** |  |  |
| **uuid** | **String** |  | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryAuditLog.new(
  actor: null,
  actor_ip_address: null,
  actor_kind: null,
  actor_location: null,
  actor_slug_perm: null,
  actor_url: null,
  context: null,
  event: null,
  event_at: null,
  object: null,
  object_kind: null,
  object_slug_perm: null,
  uuid: null
)
```

