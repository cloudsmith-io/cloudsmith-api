# CloudsmithApi::PackageQuarantineRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_malware_detected** | **BOOLEAN** | Whether the package has been detected as containing malware. Requires Ultra plan. | [optional] 
**release** | **BOOLEAN** | If true, the package is released from quarantine. | [optional] 
**restore** | **BOOLEAN** | If true, the package is released from quarantine. Note: This field is deprecated, please use &#39;release&#39; instead. | [optional] 
**vulnerability_counts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  | [optional] 


