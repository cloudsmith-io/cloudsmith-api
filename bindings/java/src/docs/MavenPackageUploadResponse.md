
# MavenPackageUploadResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**architectures** | [**List&lt;Architecture&gt;**](Architecture.md) |  |  [optional]
**artifactId** | **String** | The ID of the artifact. |  [optional]
**cdnUrl** | **String** |  |  [optional]
**checksumMd5** | **String** |  |  [optional]
**checksumSha1** | **String** |  |  [optional]
**checksumSha256** | **String** |  |  [optional]
**checksumSha512** | **String** |  |  [optional]
**dependenciesChecksumMd5** | **String** | A checksum of all of the package&#39;s dependencies. |  [optional]
**dependenciesUrl** | **String** |  |  [optional]
**description** | **String** | A textual description of this package. |  [optional]
**distro** | [**Distribution**](Distribution.md) |  |  [optional]
**distroVersion** | [**DistributionVersion**](DistributionVersion.md) |  |  [optional]
**downloads** | **Integer** |  |  [optional]
**epoch** | **Integer** | The epoch of the package version (if any). |  [optional]
**extension** | **String** |  |  [optional]
**filename** | **String** |  |  [optional]
**files** | [**List&lt;PackageFile&gt;**](PackageFile.md) |  |  [optional]
**format** | **String** |  |  [optional]
**formatUrl** | **String** |  |  [optional]
**groupId** | **String** | Artifact&#39;s group ID. |  [optional]
**identifierPerm** | **String** | Unique and permanent identifier for the package. |  [optional]
**indexed** | **Boolean** |  |  [optional]
**isDownloadable** | **Boolean** |  |  [optional]
**isQuarantined** | **Boolean** |  |  [optional]
**isSyncAwaiting** | **Boolean** |  |  [optional]
**isSyncCompleted** | **Boolean** |  |  [optional]
**isSyncFailed** | **Boolean** |  |  [optional]
**isSyncInFlight** | **Boolean** |  |  [optional]
**isSyncInProgress** | **Boolean** |  |  [optional]
**license** | **String** | The license of this package. |  [optional]
**name** | **String** | The name of this package. |  [optional]
**namespace** | **String** |  |  [optional]
**namespaceUrl** | **String** |  |  [optional]
**numFiles** | **Integer** |  |  [optional]
**originRepository** | **String** |  |  [optional]
**originRepositoryUrl** | **String** |  |  [optional]
**packageType** | **Integer** | The type of package contents. |  [optional]
**packaging** | **String** | Artifact&#39;s Maven packaging type. |  [optional]
**release** | **String** | The release of the package version (if any). |  [optional]
**repository** | **String** |  |  [optional]
**repositoryUrl** | **String** |  |  [optional]
**securityScanCompletedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime the security scanning was completed. |  [optional]
**securityScanStartedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime the security scanning was started. |  [optional]
**securityScanStatus** | **String** |  |  [optional]
**securityScanStatusUpdatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime the security scanning status was updated. |  [optional]
**selfHtmlUrl** | **String** |  |  [optional]
**selfUrl** | **String** |  |  [optional]
**signatureUrl** | **String** |  |  [optional]
**size** | **Integer** | The calculated size of the package. |  [optional]
**slug** | **String** | The public unique identifier for the package. |  [optional]
**slugPerm** | **String** |  |  [optional]
**stage** | **Integer** | The synchronisation (in progress) stage of the package. |  [optional]
**stageStr** | **String** |  |  [optional]
**stageUpdatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime the package stage was updated at. |  [optional]
**status** | **Integer** | The synchronisation status of the package. |  [optional]
**statusReason** | **String** | A textual description for the synchronous status reason (if any |  [optional]
**statusStr** | **String** |  |  [optional]
**statusUpdatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime the package status was updated at. |  [optional]
**statusUrl** | **String** |  |  [optional]
**subtype** | **String** |  |  [optional]
**summary** | **String** | A one-liner synopsis of this package. |  [optional]
**syncFinishedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime the package sync was finished at. |  [optional]
**syncProgress** | **Integer** | Synchronisation progress (from 0-100) |  [optional]
**tagsImmutable** | [**Tags**](Tags.md) |  |  [optional]
**typeDisplay** | **String** |  |  [optional]
**uploadedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date this package was uploaded. |  [optional]
**uploader** | **String** |  |  [optional]
**uploaderUrl** | **String** |  |  [optional]
**version** | **String** | The raw version for this package. |  [optional]
**versionOrig** | **String** |  |  [optional]
**vulnerabilityScanResultsUrl** | **String** |  |  [optional]


