# PackageTagRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** |  | [optional] [default to 'Add']
**is_immutable** | **bool** | If true, created tags will be immutable. An immutable flag is a tag that cannot be removed from a package. | [optional] [default to False]
**is_malware_detected** | **bool** | Whether the package has been detected as containing malware. Requires Ultra plan. | [optional] 
**tags** | **list[str]** | A list of tags to apply the action to. Not required for clears. | [optional] 
**vulnerability_counts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


