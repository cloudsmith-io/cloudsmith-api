# CloudsmithApi::ConnectedRepository

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **can_view_target_repository_settings** | **Boolean** | Whether the current user has permission to view the target repository&#39;s settings. When false, &#x60;configured_upstreams&#x60; will be empty even if upstreams are configured. | [optional][readonly] |
| **configured_upstreams** | [**Array&lt;ConnectedRepositoryUpstream&gt;**](ConnectedRepositoryUpstream.md) | The upstream sources configured on the target repository, used to display which formats/upstreams the connection exposes. | [optional][readonly] |
| **created_at** | **Time** | The date and time when the connection was created. | [optional][readonly] |
| **disable_reason** | **String** |  | [optional][readonly][default to &#39;N/A&#39;] |
| **disable_reason_text** | **String** | Human-readable explanation of why this connection is disabled. | [optional][readonly] |
| **is_active** | **Boolean** |  | [optional][default to false] |
| **priority** | **Integer** | Repositories are checked in ascending order (starting at 1). If multiple repositories have the same priority, the oldest one is used first. | [optional] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **target_repository** | **String** | The slug of the target repository to connect to. |  |
| **target_repository_summary** | [**ConnectedRepositoryTargetSummary**](ConnectedRepositoryTargetSummary.md) |  | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::ConnectedRepository.new(
  can_view_target_repository_settings: null,
  configured_upstreams: null,
  created_at: null,
  disable_reason: null,
  disable_reason_text: null,
  is_active: null,
  priority: null,
  slug_perm: null,
  target_repository: null,
  target_repository_summary: null
)
```

