# CloudsmithApi::NamespaceAuditLog

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **actor** | **String** |  | [optional] |
| **actor_ip_address** | **String** |  | [optional] |
| **actor_kind** | **String** |  | [optional][readonly] |
| **actor_location** | [**GeoIpLocation**](GeoIpLocation.md) |  | [optional] |
| **actor_slug_perm** | **String** |  | [optional] |
| **actor_url** | **String** |  | [optional][readonly] |
| **context** | **String** |  | [optional] |
| **event** | **String** |  | [optional] |
| **event_at** | **Time** |  | [optional] |
| **object** | **String** |  | [optional] |
| **object_kind** | **String** |  | [optional] |
| **object_slug_perm** | **String** |  | [optional] |
| **target** | **String** |  | [optional] |
| **target_kind** | **String** |  | [optional] |
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

