

# RecycleBinPackage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionBy** | **String** | The name of the user who deleted the package. |  [optional] [readonly] |
|**downloads** | **java.math.BigInteger** |  |  [optional] [readonly] |
|**filename** | **String** |  |  [optional] [readonly] |
|**format** | **String** |  |  [optional] [readonly] |
|**fullyQualifiedName** | **String** | The fully qualified name of the package. |  [optional] [readonly] |
|**identifiers** | **Map&lt;String, String&gt;** |  |  [optional] [readonly] |
|**invokedRetentionRule** | **Map&lt;String, String&gt;** | Information about the retention rule that triggered deletion (if any). |  [optional] [readonly] |
|**isDeleteable** | **Boolean** |  |  [optional] [readonly] |
|**isMalwareDetected** | **Boolean** | Whether the package has been detected as containing malware. Requires Ultra plan. |  [optional] [readonly] |
|**isQuarantined** | **Boolean** |  |  [optional] [readonly] |
|**isRestorable** | **Boolean** |  |  [optional] [readonly] |
|**name** | **String** | The name of this package. |  [optional] [readonly] |
|**policyViolated** | **Boolean** | Whether or not the package has violated any policy. |  [optional] [readonly] |
|**repository** | **String** |  |  [optional] [readonly] |
|**securityScanCompletedAt** | **OffsetDateTime** | The datetime the security scanning was completed. |  [optional] [readonly] |
|**securityScanStatus** | **String** |  |  [optional] [readonly] |
|**size** | **java.math.BigInteger** | The calculated size of the package. |  [optional] [readonly] |
|**slugPerm** | **String** |  |  [optional] [readonly] |
|**status** | **java.math.BigInteger** | The synchronisation status of the package. |  [optional] [readonly] |
|**statusUpdatedAt** | **OffsetDateTime** | The datetime the package status was updated at. |  [optional] [readonly] |
|**tags** | **Object** | All tags on the package, grouped by tag type. This includes immutable tags, but doesn&#39;t distinguish them from mutable. To see which tags are immutable specifically, see the tags_immutable field. |  [optional] |
|**typeDisplay** | **String** |  |  [optional] [readonly] |
|**uploadedAt** | **OffsetDateTime** | The date this package was uploaded. |  [optional] [readonly] |
|**uploader** | **String** |  |  [optional] [readonly] |
|**version** | **String** | The raw version for this package. |  [optional] [readonly] |
|**vulnerabilityCounts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


