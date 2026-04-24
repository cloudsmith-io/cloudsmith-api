# RecycleBinPackage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_by** | **str** | The name of the user who deleted the package. | [optional] 
**downloads** | **int** |  | [optional] 
**filename** | **str** |  | [optional] 
**format** | **str** |  | [optional] 
**fully_qualified_name** | **str** | The fully qualified name of the package. | [optional] 
**identifiers** | **dict(str, str)** |  | [optional] 
**invoked_retention_rule** | **dict(str, str)** | Information about the retention rule that triggered deletion (if any). | [optional] 
**is_deleteable** | **bool** |  | [optional] 
**is_quarantined** | **bool** |  | [optional] 
**is_restorable** | **bool** |  | [optional] 
**name** | **str** | The name of this package. | [optional] 
**policy_violated** | **bool** | Whether or not the package has violated any policy. | [optional] 
**repository** | **str** |  | [optional] 
**security_scan_completed_at** | **datetime** | The datetime the security scanning was completed. | [optional] 
**security_scan_status** | **str** |  | [optional] [default to 'Awaiting Security Scan']
**size** | **int** | The calculated size of the package. | [optional] 
**slug_perm** | **str** |  | [optional] 
**status** | **int** | The synchronisation status of the package. | [optional] 
**status_updated_at** | **datetime** | The datetime the package status was updated at. | [optional] 
**tags** | [**Tags**](Tags.md) |  | [optional] 
**type_display** | **str** |  | [optional] 
**uploaded_at** | **datetime** | The date this package was uploaded. | [optional] 
**uploader** | **str** |  | [optional] 
**version** | **str** | The raw version for this package. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


