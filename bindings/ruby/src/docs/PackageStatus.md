# CloudsmithApi::PackageStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_sync_awaiting** | **BOOLEAN** |  | [optional] 
**is_sync_completed** | **BOOLEAN** |  | [optional] 
**is_sync_failed** | **BOOLEAN** |  | [optional] 
**is_sync_in_flight** | **BOOLEAN** |  | [optional] 
**is_sync_in_progress** | **BOOLEAN** |  | [optional] 
**self_url** | **String** |  | [optional] 
**stage** | **String** | The synchronisation (in progress) stage of the package. | [optional] 
**stage_str** | **String** |  | [optional] 
**stage_updated_at** | **String** | The datetime the package stage was updated at. | [optional] 
**status** | **String** | The synchronisation status of the package. | [optional] 
**status_reason** | **String** | A textual description for the synchronous status reason (if any | [optional] 
**status_str** | **String** |  | [optional] 
**status_updated_at** | **String** | The datetime the package status was updated at. | [optional] 
**sync_finished_at** | **String** | The datetime the package sync was finished at. | [optional] 
**sync_progress** | **Integer** | Synchronisation progress (from 0-100) | [optional] 


