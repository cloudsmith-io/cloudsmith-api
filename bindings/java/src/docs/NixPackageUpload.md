

# NixPackageUpload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**architectures** | [**List&lt;Architecture&gt;**](Architecture.md) |  |  [optional] [readonly] |
|**cdnUrl** | **String** |  |  [optional] [readonly] |
|**checksumMd5** | **String** |  |  [optional] [readonly] |
|**checksumSha1** | **String** |  |  [optional] [readonly] |
|**checksumSha256** | **String** |  |  [optional] [readonly] |
|**checksumSha512** | **String** |  |  [optional] [readonly] |
|**dependenciesChecksumMd5** | **String** | A checksum of all of the package&#39;s dependencies. |  [optional] [readonly] |
|**dependenciesUrl** | **URI** |  |  [optional] [readonly] |
|**description** | **String** | A textual description of this package. |  [optional] [readonly] |
|**displayName** | **String** |  |  [optional] [readonly] |
|**displaySource** | **String** | Where the package originated, for example: &#39;upstream&#39; (proxied/cached from a configured upstream), &#39;connected_repository&#39; (blended in from a connected target repository), or &#39;manual_upload&#39; (uploaded directly to Cloudsmith). |  [optional] [readonly] |
|**distro** | [**Distribution**](Distribution.md) |  |  [optional] |
|**distroVersion** | [**DistributionVersion**](DistributionVersion.md) |  |  [optional] |
|**downloads** | **java.math.BigInteger** |  |  [optional] [readonly] |
|**epoch** | **java.math.BigInteger** | The epoch of the package version (if any). |  [optional] [readonly] |
|**extension** | **String** |  |  [optional] [readonly] |
|**filename** | **String** |  |  [optional] [readonly] |
|**files** | [**List&lt;PackageFile&gt;**](PackageFile.md) |  |  [optional] [readonly] |
|**format** | **String** |  |  [optional] [readonly] |
|**formatUrl** | **URI** |  |  [optional] [readonly] |
|**freeableStorage** | **java.math.BigInteger** | Amount of storage that will be freed if this package is deleted |  [optional] [readonly] |
|**fullyQualifiedName** | **String** |  |  [optional] [readonly] |
|**identifierPerm** | **String** | Unique and permanent identifier for the package. |  [optional] [readonly] |
|**identifiers** | **Map&lt;String, String&gt;** | Return a map of identifier field names and their values. |  [optional] [readonly] |
|**indexed** | **Boolean** |  |  [optional] [readonly] |
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
|**license** | **String** | The license of this package. |  [optional] [readonly] |
|**name** | **String** | The name of this package. |  [optional] [readonly] |
|**namespace** | **String** |  |  [optional] [readonly] |
|**namespaceUrl** | **URI** |  |  [optional] [readonly] |
|**numFiles** | **java.math.BigInteger** |  |  [optional] [readonly] |
|**originRepository** | **String** |  |  [optional] [readonly] |
|**originRepositoryUrl** | **URI** |  |  [optional] [readonly] |
|**osiApproved** | **Boolean** | Whether the package&#39;s SPDX license is OSI-approved. |  [optional] [readonly] |
|**packageType** | **java.math.BigInteger** | The type of package contents. |  [optional] [readonly] |
|**policyViolated** | **Boolean** | Whether or not the package has violated any policy. |  [optional] [readonly] |
|**rawLicense** | **String** | The raw license string. |  [optional] [readonly] |
|**release** | **String** | The release of the package version (if any). |  [optional] [readonly] |
|**repository** | **String** |  |  [optional] [readonly] |
|**repositoryUrl** | **URI** |  |  [optional] [readonly] |
|**securityScanCompletedAt** | **OffsetDateTime** | The datetime the security scanning was completed. |  [optional] [readonly] |
|**securityScanStartedAt** | **OffsetDateTime** | The datetime the security scanning was started. |  [optional] [readonly] |
|**securityScanStatus** | **String** |  |  [optional] [readonly] |
|**securityScanStatusUpdatedAt** | **OffsetDateTime** | The datetime the security scanning status was updated. |  [optional] [readonly] |
|**selfHtmlUrl** | **String** |  |  [optional] [readonly] |
|**selfUrl** | **URI** |  |  [optional] [readonly] |
|**selfWebappUrl** | **String** |  |  [optional] [readonly] |
|**signatureUrl** | **String** |  |  [optional] [readonly] |
|**size** | **java.math.BigInteger** | The calculated size of the package. |  [optional] [readonly] |
|**slug** | **String** | The public unique identifier for the package. |  [optional] [readonly] |
|**slugPerm** | **String** |  |  [optional] [readonly] |
|**spdxLicense** | **String** | The SPDX license identifier for this package. |  [optional] [readonly] |
|**stage** | **java.math.BigInteger** | The synchronisation (in progress) stage of the package. |  [optional] [readonly] |
|**stageStr** | **String** |  |  [optional] [readonly] |
|**stageUpdatedAt** | **OffsetDateTime** | The datetime the package stage was updated at. |  [optional] [readonly] |
|**status** | **java.math.BigInteger** | The synchronisation status of the package. |  [optional] [readonly] |
|**statusReason** | **String** | A textual description for the synchronous status reason (if any |  [optional] [readonly] |
|**statusStr** | **String** |  |  [optional] [readonly] |
|**statusUpdatedAt** | **OffsetDateTime** | The datetime the package status was updated at. |  [optional] [readonly] |
|**statusUrl** | **URI** |  |  [optional] [readonly] |
|**storePath** | **String** | Absolute store path for the package, including store hash and name. |  [optional] [readonly] |
|**subtype** | **String** |  |  [optional] [readonly] |
|**summary** | **String** | A one-liner synopsis of this package. |  [optional] [readonly] |
|**syncFinishedAt** | **OffsetDateTime** | The datetime the package sync was finished at. |  [optional] [readonly] |
|**syncProgress** | **java.math.BigInteger** | Synchronisation progress (from 0-100) |  [optional] [readonly] |
|**tagsAutomatic** | **Object** | All tags on the package, grouped by tag type. This includes immutable tags, but doesn&#39;t distinguish them from mutable. To see which tags are immutable specifically, see the tags_immutable field. |  [optional] |
|**tagsImmutable** | **Object** | All tags on the package, grouped by tag type. This includes immutable tags, but doesn&#39;t distinguish them from mutable. To see which tags are immutable specifically, see the tags_immutable field. |  [optional] |
|**tagsStatic** | **Map&lt;String, List&lt;String&gt;&gt;** | All static tags on the package, grouped by context. Static tags are derived from the package&#39;s properties at request time and carry a &#39;context&#39; (rather than a tag type). Includes format-specific badges and the package&#39;s architecture, subtype, and extension. |  [optional] [readonly] |
|**typeDisplay** | **String** |  |  [optional] [readonly] |
|**uploadedAt** | **OffsetDateTime** | The date this package was uploaded. |  [optional] [readonly] |
|**uploader** | **String** |  |  [optional] [readonly] |
|**uploaderUrl** | **URI** |  |  [optional] [readonly] |
|**version** | **String** | The raw version for this package. |  [optional] |
|**versionOrig** | **String** |  |  [optional] [readonly] |
|**vulnerabilityScanResultsUrl** | **URI** |  |  [optional] [readonly] |


## Implemented Interfaces

* Serializable


