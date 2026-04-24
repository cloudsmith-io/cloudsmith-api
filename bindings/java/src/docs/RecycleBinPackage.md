
# RecycleBinPackage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionBy** | **String** | The name of the user who deleted the package. |  [optional]
**downloads** | **java.math.BigInteger** |  |  [optional]
**filename** | **String** |  |  [optional]
**format** | **String** |  |  [optional]
**fullyQualifiedName** | **String** | The fully qualified name of the package. |  [optional]
**identifiers** | **Map&lt;String, String&gt;** |  |  [optional]
**invokedRetentionRule** | **Map&lt;String, String&gt;** | Information about the retention rule that triggered deletion (if any). |  [optional]
**isDeleteable** | **Boolean** |  |  [optional]
**isQuarantined** | **Boolean** |  |  [optional]
**isRestorable** | **Boolean** |  |  [optional]
**name** | **String** | The name of this package. |  [optional]
**policyViolated** | **Boolean** | Whether or not the package has violated any policy. |  [optional]
**repository** | **String** |  |  [optional]
**securityScanCompletedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime the security scanning was completed. |  [optional]
**securityScanStatus** | [**SecurityScanStatusEnum**](#SecurityScanStatusEnum) |  |  [optional]
**size** | **java.math.BigInteger** | The calculated size of the package. |  [optional]
**slugPerm** | **String** |  |  [optional]
**status** | **java.math.BigInteger** | The synchronisation status of the package. |  [optional]
**statusUpdatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime the package status was updated at. |  [optional]
**tags** | [**Tags**](Tags.md) |  |  [optional]
**typeDisplay** | **String** |  |  [optional]
**uploadedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date this package was uploaded. |  [optional]
**uploader** | **String** |  |  [optional]
**version** | **String** | The raw version for this package. |  [optional]


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



