
# PackageStatusResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isDownloadable** | **Boolean** |  |  [optional]
**isQuarantined** | **Boolean** |  |  [optional]
**isSyncAwaiting** | **Boolean** |  |  [optional]
**isSyncCompleted** | **Boolean** |  |  [optional]
**isSyncFailed** | **Boolean** |  |  [optional]
**isSyncInFlight** | **Boolean** |  |  [optional]
**isSyncInProgress** | **Boolean** |  |  [optional]
**selfUrl** | **String** |  |  [optional]
**stage** | **java.math.BigInteger** | The synchronisation (in progress) stage of the package. |  [optional]
**stageStr** | **String** |  |  [optional]
**stageUpdatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime the package stage was updated at. |  [optional]
**status** | **java.math.BigInteger** | The synchronisation status of the package. |  [optional]
**statusReason** | **String** | A textual description for the synchronous status reason (if any |  [optional]
**statusStr** | **String** |  |  [optional]
**statusUpdatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime the package status was updated at. |  [optional]
**syncFinishedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime the package sync was finished at. |  [optional]
**syncProgress** | **java.math.BigInteger** | Synchronisation progress (from 0-100) |  [optional]



