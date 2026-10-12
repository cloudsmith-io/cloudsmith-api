# RecycleBinPackage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_by** | **str** | The name of the user who deleted the package. | [optional] [readonly] 
**downloads** | **int** |  | [optional] [readonly] 
**filename** | **str** |  | [optional] [readonly] 
**format** | **str** |  | [optional] [readonly] 
**fully_qualified_name** | **str** | The fully qualified name of the package. | [optional] [readonly] 
**identifiers** | **Dict[str, Optional[str]]** |  | [optional] [readonly] 
**invoked_retention_rule** | **Dict[str, Optional[str]]** | Information about the retention rule that triggered deletion (if any). | [optional] [readonly] 
**is_deleteable** | **bool** |  | [optional] [readonly] 
**is_malware_detected** | **bool** | Whether the package has been detected as containing malware. Requires Ultra plan. | [optional] [readonly] 
**is_quarantined** | **bool** |  | [optional] [readonly] 
**is_restorable** | **bool** |  | [optional] [readonly] 
**name** | **str** | The name of this package. | [optional] [readonly] 
**policy_violated** | **bool** | Whether or not the package has violated any policy. | [optional] [readonly] 
**repository** | **str** |  | [optional] [readonly] 
**security_scan_completed_at** | **datetime** | The datetime the security scanning was completed. | [optional] [readonly] 
**security_scan_status** | **str** |  | [optional] [readonly] 
**size** | **int** | The calculated size of the package. | [optional] [readonly] 
**slug_perm** | **str** |  | [optional] [readonly] 
**status** | **int** | The synchronisation status of the package. | [optional] [readonly] 
**status_updated_at** | **datetime** | The datetime the package status was updated at. | [optional] [readonly] 
**tags** | **object** | All tags on the package, grouped by tag type. This includes immutable tags, but doesn&#39;t distinguish them from mutable. To see which tags are immutable specifically, see the tags_immutable field. | [optional] 
**type_display** | **str** |  | [optional] [readonly] 
**uploaded_at** | **datetime** | The date this package was uploaded. | [optional] [readonly] 
**uploader** | **str** |  | [optional] [readonly] 
**version** | **str** | The raw version for this package. | [optional] [readonly] 
**vulnerability_counts** | [**WebOSVSeverityCounts**](WebOSVSeverityCounts.md) |  | [optional] 

## Example

```python
from cloudsmith_api.models.recycle_bin_package import RecycleBinPackage

# TODO update the JSON string below
json = "{}"
# create an instance of RecycleBinPackage from a JSON string
recycle_bin_package_instance = RecycleBinPackage.from_json(json)
# print the JSON string representation of the object
print(RecycleBinPackage.to_json())

# convert the object into a dict
recycle_bin_package_dict = recycle_bin_package_instance.to_dict()
# create an instance of RecycleBinPackage from a dict
recycle_bin_package_from_dict = RecycleBinPackage.from_dict(recycle_bin_package_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


