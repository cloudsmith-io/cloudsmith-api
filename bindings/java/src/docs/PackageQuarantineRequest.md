
# PackageQuarantineRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isMalwareDetected** | **Boolean** | Whether the package has been detected as containing malware. Requires Ultra plan. |  [optional]
**release** | **Boolean** | If true, the package is released from quarantine. |  [optional]
**restore** | **Boolean** | If true, the package is released from quarantine. Note: This field is deprecated, please use &#39;release&#39; instead. |  [optional]
**vulnerabilityCounts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  |  [optional]



