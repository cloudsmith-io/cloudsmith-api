
# PackageMove

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**architectures** | [**List&lt;PackagesownerrepoArchitectures&gt;**](PackagesownerrepoArchitectures.md) |  |  [optional]
**cdnUrl** | **String** |  |  [optional]
**checksumMd5** | **String** |  |  [optional]
**checksumSha1** | **String** |  |  [optional]
**checksumSha256** | **String** |  |  [optional]
**checksumSha512** | **String** |  |  [optional]
**dependenciesChecksumMd5** | **String** | A checksum of all of the package&#39;s dependencies. |  [optional]
**dependenciesUrl** | **String** |  |  [optional]
**description** | **String** | A textual description of this package. |  [optional]
**distro** | **Object** |  |  [optional]
**distroVersion** | **Object** |  |  [optional]
**downloads** | **Integer** |  |  [optional]
**epoch** | **Integer** | The epoch of the package version (if any). |  [optional]
**extension** | **String** |  |  [optional]
**filename** | **String** |  |  [optional]
**files** | [**List&lt;PackagesownerrepoFiles&gt;**](PackagesownerrepoFiles.md) |  |  [optional]
**format** | **String** |  |  [optional]
**formatUrl** | **String** |  |  [optional]
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
**release** | **String** | The release of the package version (if any). |  [optional]
**repository** | **String** | The repository the package will be moved to. |  [optional]
**repositoryUrl** | **String** |  |  [optional]
**securityScanCompletedAt** | **String** | The datetime the security scanning was completed. |  [optional]
**securityScanStartedAt** | **String** | The datetime the security scanning was started. |  [optional]
**securityScanStatus** | [**SecurityScanStatusEnum**](#SecurityScanStatusEnum) |  |  [optional]
**securityScanStatusUpdatedAt** | **String** | The datetime the security scanning status was updated. |  [optional]
**selfHtmlUrl** | **String** |  |  [optional]
**selfUrl** | **String** |  |  [optional]
**signatureUrl** | **String** |  |  [optional]
**size** | **Integer** | The calculated size of the package. |  [optional]
**slug** | **String** | The public unique identifier for the package. |  [optional]
**slugPerm** | **String** |  |  [optional]
**stage** | **Integer** | The synchronisation (in progress) stage of the package. |  [optional]
**stageStr** | **String** |  |  [optional]
**stageUpdatedAt** | **String** | The datetime the package stage was updated at. |  [optional]
**status** | **Integer** | The synchronisation status of the package. |  [optional]
**statusReason** | **String** | A textual description for the synchronous status reason (if any |  [optional]
**statusStr** | **String** |  |  [optional]
**statusUpdatedAt** | **String** | The datetime the package status was updated at. |  [optional]
**statusUrl** | **String** |  |  [optional]
**subtype** | **String** |  |  [optional]
**summary** | **String** | A one-liner synopsis of this package. |  [optional]
**syncFinishedAt** | **String** | The datetime the package sync was finished at. |  [optional]
**syncProgress** | **Integer** | Synchronisation progress (from 0-100) |  [optional]
**tags** | **Object** | All tags on the package, grouped by tag type. This includes immutable tags, but doesn&#39;t distinguish them from mutable. To see which tags are immutable specifically, see the tags_immutable field. |  [optional]
**tagsImmutable** | **Object** | All immutable tags on the package, grouped by tag type. Immutable tags cannot be (easily) deleted. |  [optional]
**typeDisplay** | **String** |  |  [optional]
**uploadedAt** | **String** | The date this package was uploaded. |  [optional]
**uploader** | **String** |  |  [optional]
**uploaderUrl** | **String** |  |  [optional]
**version** | **String** | The raw version for this package. |  [optional]
**versionOrig** | **String** |  |  [optional]
**vulnerabilityScanResultsUrl** | **String** |  |  [optional]


<a name="SecurityScanStatusEnum"></a>
## Enum: SecurityScanStatusEnum
Name | Value
---- | -----
AWAITING_SECURITY_SCAN | &quot;Awaiting Security Scan&quot;
SECURITY_SCANNING_IN_PROGRESS | &quot;Security Scanning in Progress&quot;
SCAN_DETECTED_VULNERABILITIES | &quot;Scan Detected Vulnerabilities&quot;
SCAN_DETECTED_NO_VULNERABILITIES | &quot;Scan Detected No Vulnerabilities&quot;
SECURITY_SCANNING_DISABLED | &quot;Security Scanning Disabled&quot;
SECURITY_SCANNING_FAILED | &quot;Security Scanning Failed&quot;
SECURITY_SCANNING_SKIPPED | &quot;Security Scanning Skipped&quot;
SECURITY_SCANNING_NOT_SUPPORTED | &quot;Security Scanning Not Supported&quot;



