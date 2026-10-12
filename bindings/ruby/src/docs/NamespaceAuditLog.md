# CloudsmithApi::NamespaceAuditLog

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
| **target** | **String** |  |  |
| **target_kind** | **String** |  |  |
| **target_slug_perm** | **String** |  | [optional] |
| **uuid** | **String** |  | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::NamespaceAuditLog.new(
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
  target: null,
  target_kind: null,
  target_slug_perm: null,
  uuid: null
)
```

