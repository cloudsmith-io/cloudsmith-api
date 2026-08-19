# CloudsmithApi::PackageTagRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** |  | [optional] [default to &#39;Add&#39;]
**is_immutable** | **BOOLEAN** | If true, created tags will be immutable. An immutable flag is a tag that cannot be removed from a package. | [optional] [default to false]
**is_malware_detected** | **BOOLEAN** | Whether the package has been detected as containing malware. Requires Ultra plan. | [optional] 
**tags** | **Array&lt;String&gt;** | A list of tags to apply the action to. Not required for clears. | [optional] 
**vulnerability_counts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  | [optional] 


