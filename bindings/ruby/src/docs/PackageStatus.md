# CloudsmithApi::PackageStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_cancellable** | **BOOLEAN** |  | [optional] 
**is_copyable** | **BOOLEAN** |  | [optional] 
**is_deleteable** | **BOOLEAN** |  | [optional] 
**is_downloadable** | **BOOLEAN** |  | [optional] 
**is_moveable** | **BOOLEAN** |  | [optional] 
**is_quarantinable** | **BOOLEAN** |  | [optional] 
**is_quarantined** | **BOOLEAN** |  | [optional] 
**is_resyncable** | **BOOLEAN** |  | [optional] 
**is_security_scannable** | **BOOLEAN** |  | [optional] 
**is_sync_awaiting** | **BOOLEAN** |  | [optional] 
**is_sync_completed** | **BOOLEAN** |  | [optional] 
**is_sync_failed** | **BOOLEAN** |  | [optional] 
**is_sync_in_flight** | **BOOLEAN** |  | [optional] 
**is_sync_in_progress** | **BOOLEAN** |  | [optional] 
**self_url** | **String** |  | [optional] 
**stage** | **Integer** | The synchronisation (in progress) stage of the package. | [optional] 
**stage_str** | **String** |  | [optional] 
**stage_updated_at** | **DateTime** | The datetime the package stage was updated at. | [optional] 
**status** | **Integer** | The synchronisation status of the package. | [optional] 
**status_reason** | **String** | A textual description for the synchronous status reason (if any | [optional] 
**status_str** | **String** |  | [optional] 
**status_updated_at** | **DateTime** | The datetime the package status was updated at. | [optional] 
**sync_finished_at** | **DateTime** | The datetime the package sync was finished at. | [optional] 
**sync_progress** | **Integer** | Synchronisation progress (from 0-100) | [optional] 


