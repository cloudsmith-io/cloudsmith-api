
# RepositoryX509RsaCertificate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | If selected this is the active key for this repository. |  [optional]
**certificate** | **String** | The issued certificate. |  [optional]
**certificateChain** | **String** | Base64 encoded CA certificate chain. |  [optional]
**certificateChainFingerprint** | **String** |  |  [optional]
**certificateChainFingerprintShort** | **String** |  |  [optional]
**certificateFingerprint** | **String** | The SHA-256 long identifier used |  [optional]
**certificateFingerprintShort** | **String** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**_default** | **Boolean** | If selected this is the default key for this repository. |  [optional]
**issuingStatus** | [**IssuingStatusEnum**](#IssuingStatusEnum) |  |  [optional]


<a name="IssuingStatusEnum"></a>
## Enum: IssuingStatusEnum
Name | Value
---- | -----
CERTIFICATE_IS_PENDING_TO_BE_ISSUED | &quot;Certificate is pending to be issued&quot;
CERTIFICATE_SUCCESSFULLY_ISSUED | &quot;Certificate successfully issued&quot;
ERROR_ISSUING_CERTIFICATE | &quot;Error issuing certificate&quot;



