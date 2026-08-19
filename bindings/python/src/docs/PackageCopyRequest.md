# PackageCopyRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination** | **str** | The name of the destination repository without the namespace. | 
**is_malware_detected** | **bool** | Whether the package has been detected as containing malware. Requires Ultra plan. | [optional] 
**republish** | **bool** | If true, the package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate. | [optional] 
**vulnerability_counts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


