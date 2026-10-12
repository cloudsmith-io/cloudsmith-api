# CloudsmithApi::PackageStatus

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **is_cancellable** | **Boolean** |  | [optional][readonly] |
| **is_copyable** | **Boolean** |  | [optional][readonly] |
| **is_deleteable** | **Boolean** |  | [optional][readonly] |
| **is_downloadable** | **Boolean** |  | [optional][readonly] |
| **is_hidden** | **Boolean** |  | [optional][readonly] |
| **is_moveable** | **Boolean** |  | [optional][readonly] |
| **is_quarantinable** | **Boolean** |  | [optional][readonly] |
| **is_quarantined** | **Boolean** |  | [optional][readonly] |
| **is_resyncable** | **Boolean** |  | [optional][readonly] |
| **is_security_scannable** | **Boolean** |  | [optional][readonly] |
| **is_sync_awaiting** | **Boolean** |  | [optional][readonly] |
| **is_sync_completed** | **Boolean** |  | [optional][readonly] |
| **is_sync_failed** | **Boolean** |  | [optional][readonly] |
| **is_sync_in_flight** | **Boolean** |  | [optional][readonly] |
| **is_sync_in_progress** | **Boolean** |  | [optional][readonly] |
| **self_url** | **String** |  | [optional][readonly] |
| **stage** | **Integer** | The synchronisation (in progress) stage of the package. | [optional][readonly] |
| **stage_str** | **String** |  | [optional][readonly] |
| **stage_updated_at** | **Time** | The datetime the package stage was updated at. | [optional][readonly] |
| **status** | **Integer** | The synchronisation status of the package. | [optional][readonly] |
| **status_reason** | **String** | A textual description for the synchronous status reason (if any | [optional][readonly] |
| **status_str** | **String** |  | [optional][readonly] |
| **status_updated_at** | **Time** | The datetime the package status was updated at. | [optional][readonly] |
| **sync_finished_at** | **Time** | The datetime the package sync was finished at. | [optional][readonly] |
| **sync_progress** | **Integer** | Synchronisation progress (from 0-100) | [optional][readonly] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::PackageStatus.new(
  is_cancellable: null,
  is_copyable: null,
  is_deleteable: null,
  is_downloadable: null,
  is_hidden: null,
  is_moveable: null,
  is_quarantinable: null,
  is_quarantined: null,
  is_resyncable: null,
  is_security_scannable: null,
  is_sync_awaiting: null,
  is_sync_completed: null,
  is_sync_failed: null,
  is_sync_in_flight: null,
  is_sync_in_progress: null,
  self_url: null,
  stage: null,
  stage_str: null,
  stage_updated_at: null,
  status: null,
  status_reason: null,
  status_str: null,
  status_updated_at: null,
  sync_finished_at: null,
  sync_progress: null
)
```

