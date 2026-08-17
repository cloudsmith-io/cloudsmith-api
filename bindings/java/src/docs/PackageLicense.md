
# PackageLicense

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isMalwareDetected** | **Boolean** | Whether the package has been detected as containing malware. Requires Ultra plan. |  [optional]
**licenseNotes** | **String** |  |  [optional]
**licenseOverride** | [**LicenseOverrideEnum**](#LicenseOverrideEnum) |  |  [optional]
**licenseUrl** | **String** |  |  [optional]
**spdxLicense** | **String** |  | 
**vulnerabilityCounts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  |  [optional]


<a name="LicenseOverrideEnum"></a>
## Enum: LicenseOverrideEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
IGNORED | &quot;Ignored&quot;
PURCHASED | &quot;Purchased&quot;



