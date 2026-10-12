

# PackageStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isCancellable** | **Boolean** |  |  [optional] [readonly] |
|**isCopyable** | **Boolean** |  |  [optional] [readonly] |
|**isDeleteable** | **Boolean** |  |  [optional] [readonly] |
|**isDownloadable** | **Boolean** |  |  [optional] [readonly] |
|**isHidden** | **Boolean** |  |  [optional] [readonly] |
|**isMoveable** | **Boolean** |  |  [optional] [readonly] |
|**isQuarantinable** | **Boolean** |  |  [optional] [readonly] |
|**isQuarantined** | **Boolean** |  |  [optional] [readonly] |
|**isResyncable** | **Boolean** |  |  [optional] [readonly] |
|**isSecurityScannable** | **Boolean** |  |  [optional] [readonly] |
|**isSyncAwaiting** | **Boolean** |  |  [optional] [readonly] |
|**isSyncCompleted** | **Boolean** |  |  [optional] [readonly] |
|**isSyncFailed** | **Boolean** |  |  [optional] [readonly] |
|**isSyncInFlight** | **Boolean** |  |  [optional] [readonly] |
|**isSyncInProgress** | **Boolean** |  |  [optional] [readonly] |
|**selfUrl** | **URI** |  |  [optional] [readonly] |
|**stage** | **java.math.BigInteger** | The synchronisation (in progress) stage of the package. |  [optional] [readonly] |
|**stageStr** | **String** |  |  [optional] [readonly] |
|**stageUpdatedAt** | **OffsetDateTime** | The datetime the package stage was updated at. |  [optional] [readonly] |
|**status** | **java.math.BigInteger** | The synchronisation status of the package. |  [optional] [readonly] |
|**statusReason** | **String** | A textual description for the synchronous status reason (if any |  [optional] [readonly] |
|**statusStr** | **String** |  |  [optional] [readonly] |
|**statusUpdatedAt** | **OffsetDateTime** | The datetime the package status was updated at. |  [optional] [readonly] |
|**syncFinishedAt** | **OffsetDateTime** | The datetime the package sync was finished at. |  [optional] [readonly] |
|**syncProgress** | **java.math.BigInteger** | Synchronisation progress (from 0-100) |  [optional] [readonly] |


## Implemented Interfaces

* Serializable


